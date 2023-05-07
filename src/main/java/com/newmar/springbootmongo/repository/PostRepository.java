package com.newmar.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newmar.springbootmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
