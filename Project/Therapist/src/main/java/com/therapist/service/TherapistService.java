package com.therapist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.therapist.entity.Therapist;
import com.therapist.repository.TherapistRepository;

import java.util.List;

@Service
public class TherapistService {
    @Autowired
    private TherapistRepository repository;

    public Therapist saveTherapist(Therapist product) {
        return repository.save(product);
    }

    public List<Therapist> saveProducts(List<Therapist> products) {
        return repository.saveAll(products);
    }

    public List<Therapist> getTherapist() {
        return repository.findAll();
    }

    public Therapist getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Therapist getTherapistByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Therapist updateProduct(Therapist product) {
    	Therapist existingProduct = repository.findById(product.getTid()).orElse(null);
    	existingProduct.setTid(product.getTid());
        existingProduct.setName(product.getName());
       existingProduct.setSex(product.getSex());
       existingProduct.setNotes(product.getNotes());
       existingProduct.setClientname(product.getClientname());
       existingProduct.setTphone(product.getTphone());
       existingProduct.setAppointment(product.getAppointment());        
       return repository.save(existingProduct);
    }


}
