package com.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.entity.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Client findByName(String name);

}

