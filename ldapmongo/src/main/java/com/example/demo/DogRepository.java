package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DogRepository extends MongoRepository<Dog, String> {
    Optional<Dog> findById(int id);
    Optional<Dog> deleteById(int id);

}
