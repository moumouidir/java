package com.example.api_achat_service.service;

import org.springframework.stereotype.Service;

import com.example.api_achat_service.Entity.Commande;
import com.example.api_achat_service.Repository.CommandeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class serviceCommande {
    
    @Autowired
    private CommandeRepository commandeRepository;
    
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }
    
    public Optional<Commande> getCommandeById(Long id) {
        return commandeRepository.findById(id);
    }
    
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }
    
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
    
    public Optional<Commande> getCommandesByClientId(Long id_client) {
        return commandeRepository.findById(id_client); 
    }
    
}