package com.example.lab2.repository;

import com.example.lab2.model.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShelterRepository extends JpaRepository<Shelter, Long> {
    List<Shelter> findByNameContaining(String name);
}