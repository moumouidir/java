package com.example.api_achat_service.Repository;
import com.example.api_achat_service.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository <Commande,Long> {

    
}
