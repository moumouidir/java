package com.example.api_order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_order_service.entity.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
} 