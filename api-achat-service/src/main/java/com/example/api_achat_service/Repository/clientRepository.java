package com.example.api_achat_service.Repository;


import com.example.api_achat_service.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository <Client,Long> {

}