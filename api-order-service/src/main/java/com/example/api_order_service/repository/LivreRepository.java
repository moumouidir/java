package com.example.api_order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_order_service.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
} 