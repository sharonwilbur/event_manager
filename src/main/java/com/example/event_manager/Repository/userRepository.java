package com.example.event_manager.Repository;

import com.example.event_manager.entity.userDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userDetails, String> {
}
