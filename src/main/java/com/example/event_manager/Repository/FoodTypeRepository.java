package com.example.event_manager.Repository;

import com.example.event_manager.entity.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTypeRepository extends JpaRepository <FoodType, Long> {
}
