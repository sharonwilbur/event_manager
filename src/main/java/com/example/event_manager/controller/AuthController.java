package com.example.event_manager.controller;

import com.example.event_manager.Repository.UserRepository;
import com.example.event_manager.entity.User;
import com.example.event_manager.helper.JwtUtil;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil,
                          UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        System.out.println("Hello login..."+request.toString());
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );
        User user = (User) authentication.getPrincipal();
        String token = jwtUtil.generateToken(user);
        return ResponseEntity.ok(new AuthResponse(token, request.getEmail(), authentication.getAuthorities().iterator().next().getAuthority().toString()));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody User user) {
        if (userRepository.existsById(user.getEmail())) {
            return ResponseEntity.badRequest().body("User already exists");
        }
//        User user = new User(user.getEmail(), passwordEncoder.encode(request.getPassword()), "ROLE_USER");

       user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}

@Data
class AuthRequest {
    private String email;
    private String password;
}

@Data
@AllArgsConstructor
class AuthResponse {
    private String token;
    private String email;
    private String role;
}
