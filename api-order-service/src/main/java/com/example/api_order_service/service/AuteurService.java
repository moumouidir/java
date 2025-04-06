package com.example.api_order_service.service;

import com.example.api_order_service.entity.Auteur;
import com.example.api_order_service.repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public Optional<Auteur> getAuteurById(Long id) {
        return auteurRepository.findById(id);
    }

    public Auteur createAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    
    public String deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
        return  " le auteur est suprime";
    }
} 