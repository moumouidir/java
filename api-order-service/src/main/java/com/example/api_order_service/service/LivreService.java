package com.example.api_order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_order_service.repository.*;

import java.util.List;
import java.util.Optional;

import com.example.api_order_service.entity.Livre;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public Optional<Livre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }


    public Livre createLivre(Livre livre) {
        return livreRepository.save(livre);
    }


    public String deleteLivre(Long id) {
        livreRepository.deleteById(id);
        return "le livre  est supprime ";
    }
}