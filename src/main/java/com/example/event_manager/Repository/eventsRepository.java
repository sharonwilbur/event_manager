package com.example.event_manager.Repository;

import com.example.event_manager.entity.events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventsRepository extends JpaRepository<events, Long> {

}
