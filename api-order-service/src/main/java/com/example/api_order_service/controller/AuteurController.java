package com.example.api_order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.api_order_service.entity.Auteur;
import com.example.api_order_service.service.AuteurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autheurs")
public class AuteurController {

    @Autowired
    private AuteurService auteurService;

    @GetMapping
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @GetMapping("/{id}")
    public Optional<Auteur> getAuteurById(@PathVariable Long id) {
        return auteurService.getAuteurById(id);
    }

    @PostMapping
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.createAuteur(auteur);
    }

    @PutMapping("/{id}")
    public Auteur updateAutheur( @PathVariable long id , @RequestBody Auteur auteur){
        auteur.setId(id);
        return auteurService.createAuteur(auteur);
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
        return ResponseEntity.ok().build();
    }
} 
;