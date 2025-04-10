package com.example.event_manager.Repository;

import com.example.event_manager.entity.payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepository extends JpaRepository<payment, Long> {

}
