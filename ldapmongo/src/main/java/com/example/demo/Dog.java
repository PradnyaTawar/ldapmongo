package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Dog {
    @Id
    private int id;
    private String Breed;
    private String Country;

    public Dog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Dog(int id, String breed, String country) {
        this.id = id;
        Breed = breed;
        Country = country;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", Breed='" + Breed + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}