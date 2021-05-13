package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.client.entity.Client;
import com.client.service.ClientService;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping("/addClient")
    public Client addProduct(@RequestBody Client product) {
        return service.saveClient(product);
    }

    @PostMapping("/addClients")
    public List<Client> addProducts(@RequestBody List<Client> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/Clients")
    public List<Client> findAllProducts() {
        return service.getClient();
    }

    @GetMapping("/Clientbyid/{id}")
    public Client findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/Clientbyname/{name}")
    public Client findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Client updateProduct(@RequestBody Client product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
