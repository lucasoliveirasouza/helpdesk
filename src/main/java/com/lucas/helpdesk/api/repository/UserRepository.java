package com.lucas.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucas.helpdesk.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	User findByEmail(String email);

	User findOne(String id);
}
