package com.therapist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.therapist.entity.Therapist;
import com.therapist.service.TherapistService;

import java.util.List;

@RestController
public class TherapistController {

    @Autowired
    private TherapistService service;

    @PostMapping("/addTherapist")
    public Therapist addProduct(@RequestBody Therapist product) {
        return service.saveTherapist(product);
    }

    @PostMapping("/addTherapists")
    public List<Therapist> addProducts(@RequestBody List<Therapist> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/Therapist")
    public List<Therapist> findAllProducts() {
        return service.getTherapist();
    }

    @GetMapping("/Therapistbyid/{id}")
    public Therapist findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/Therapistbyname/{name}")
    public Therapist findTherapistByName(@PathVariable String name) {
        return service.getTherapistByName(name);
    }

    @PutMapping("/update")
    public Therapist updateProduct(@RequestBody Therapist product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
