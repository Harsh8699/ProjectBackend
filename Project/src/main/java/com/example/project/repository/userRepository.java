package com.example.project.repository;


import com.example.project.model.userModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<userModel,String> {
}
