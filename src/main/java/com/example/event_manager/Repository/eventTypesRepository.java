package com.example.event_manager.Repository;

import com.example.event_manager.entity.eventTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventTypesRepository extends JpaRepository<eventTypes, Long> {

}
