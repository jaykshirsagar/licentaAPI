package com.unitbv.licenta.repository;

import com.unitbv.licenta.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Integer> {
}
