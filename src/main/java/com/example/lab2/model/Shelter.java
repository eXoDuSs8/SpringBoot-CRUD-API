package com.example.lab2.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Shelters")
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="shelter_generator")
    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name = "name")
    private String name;

    @Column(name = "usable_area_in_sq")
    private float usable_area_in_sq;

    @Column(name = "description")
    private String description;

    private LocalDateTime dateOfConstruction;

    @OneToMany(mappedBy="shelter")
    private Set<Animal> items;

    public Shelter(){}

    public Shelter(String location, String name, float usable_area_in_sq, String description, LocalDateTime dateOfConstruction) {
        this.location = location;
        this.name = name;
        this.usable_area_in_sq = usable_area_in_sq;
        this.description = description;
        this.dateOfConstruction = dateOfConstruction;
    }

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public float getUsable_area_in_sq() {
        return usable_area_in_sq;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsable_area_in_sq(float usable_area_in_sq) {
        this.usable_area_in_sq = usable_area_in_sq;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateOfConstruction(LocalDateTime dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public LocalDateTime getDateOfConstruction() {
        return dateOfConstruction;
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", usable_area_in_sq=" + usable_area_in_sq +
                ", description='" + description + '\'' +
                ", dateOfConstruction=" + dateOfConstruction +
                '}';
    }
}

