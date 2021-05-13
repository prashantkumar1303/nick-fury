package com.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.entity.Client;
import com.client.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client saveClient(Client product) {
        return repository.save(product);
    }

    public List<Client> saveProducts(List<Client> products) {
        return repository.saveAll(products);
    }

    public List<Client> getClient() {
        return repository.findAll();
    }

    public Client getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Client getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Client updateProduct(Client product) {
    	Client existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setId(product.getId());
        existingProduct.setName(product.getName());
       existingProduct.setSex(product.getSex());
       existingProduct.setEmotions(product.getEmotions());
       existingProduct.setTherapistname(product.getTherapistname());
       existingProduct.setCphone(product.getCphone());
       existingProduct.setAppointment(product.getAppointment());
        return repository.save(existingProduct);
    }


}
