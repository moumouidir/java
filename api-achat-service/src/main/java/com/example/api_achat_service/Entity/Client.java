package com.example.api_achat_service.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;

    @Column(name = "nom")
    private String nom;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email; 
}


    
