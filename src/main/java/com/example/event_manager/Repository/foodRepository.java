package com.example.event_manager.Repository;

import com.example.event_manager.entity.food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface foodRepository extends JpaRepository<food, Long> {
}
