package com.example.api_achat_service.controller;

import org.springframework.web.bind.annotation.*;

import com.example.api_achat_service.Entity.Commande;
import com.example.api_achat_service.service.serviceCommande;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/commande")
public class Controllercommande {
    private final serviceCommande serviceCommande;

    public Controllercommande(serviceCommande serviceCommande) {
        this.serviceCommande = serviceCommande;
    }

    @GetMapping
    public List<Commande> getAllCommandes() {
        return serviceCommande.getAllCommandes();
    }

    @GetMapping("/{id_commande}")
    public Optional<Commande> getCommandeById(@PathVariable Long id_commande){
        return serviceCommande.getCommandeById(id_commande);
      
    }

    @PostMapping
    public Commande createCommande(@RequestBody Commande commande) {
        return serviceCommande.saveCommande(commande);
    }

    @PutMapping("/{id_commande}")
    public Commande updateCommande(@PathVariable Long id_commande, @RequestBody Commande commande) {
        commande.setId_commande(id_commande);
        return serviceCommande.saveCommande(commande);
    }
    
    @DeleteMapping("/id_commande") 
        public void deleteCommande(@PathVariable Long id_commande) {
        serviceCommande.deleteCommande(id_commande);
    }
}
