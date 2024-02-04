package com.lucas.helpdesk.api.service.impl;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.lucas.helpdesk.api.model.User;
import com.lucas.helpdesk.api.repository.UserRepository;
import com.lucas.helpdesk.api.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.userRepository.findById(id).orElse(null);
		
	}

	@Override
	public void delete(String id) {
		this.userRepository.deleteById(id);
		
	}

	// Voltar ao vídeo 39 em caso erro.
	@Override
	public Page<User> findAll(int page, int count) {
	    PageRequest pageable = PageRequest.of(page, count);
	    return this.userRepository.findAll(pageable);
	}

}
