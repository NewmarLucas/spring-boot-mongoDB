package com.newmar.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newmar.springbootmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
