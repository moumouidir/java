package com.example.api_achat_service.Entity;



import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "commande ")

public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commande;

    @Column(name= "produit")
    private String produit;

    @Column(name = "montant")
    private String montant;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false) 
    private Client client;

    
}
