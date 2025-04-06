package com.example.api_achat_service.controller;

import org.springframework.web.bind.annotation.*;

import com.example.api_achat_service.Entity.Client;
import com.example.api_achat_service.service.serviceClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/client")
public class controllerclient {
    private final serviceClient serviceClient;

    public controllerclient(serviceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return serviceClient.getAllClients();
    }

    @GetMapping("/{id_client}")
    public Optional<Client> getClientById(@PathVariable Long id_client) {
        return serviceClient.getClientById(id_client);
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return serviceClient.saveClient(client);
    }

    @PutMapping("/{id_client}")
    public Client updateClient(@PathVariable Long id_client, @RequestBody Client client) {
        client.setId_client(id_client);
        return serviceClient.saveClient(client);
    }

    @DeleteMapping("/{id_client}")
    public void deleteClient(@PathVariable Long id_client) {
        serviceClient.deleteClient(id_client);
    }
}
