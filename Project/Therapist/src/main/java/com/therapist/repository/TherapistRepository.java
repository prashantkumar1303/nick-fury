package com.therapist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.therapist.entity.Therapist;

public interface TherapistRepository extends JpaRepository<Therapist,Integer> {
    Therapist findByName(String name);

}

