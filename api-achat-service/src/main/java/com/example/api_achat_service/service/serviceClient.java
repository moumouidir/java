package com.example.api_achat_service.service;

import org.springframework.stereotype.Service;
import com.example.api_achat_service.Entity.Client;
import com.example.api_achat_service.Repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class serviceClient {
    
    @Autowired
    private clientRepository clientRepository;
    
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }
    
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
    
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
    
  
}
