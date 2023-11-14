package com.api.bumbabusapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.bumbabusapi.models.UserModel;
import com.api.bumbabusapi.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Transactional
    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

	public boolean existeEmail(String email) {  
        return userRepository.existsByEmail(email);
	}

    public boolean existeTelefone(String telephone) {
        return userRepository.existsByTelephone(telephone);
    }

     public boolean existeUsername (String username) {
        return userRepository.existsByUsername(username);
    }

    public List<UserModel> findAll(){
        return userRepository.findAll();
    }

    public Optional<UserModel> findByemail(String email) {
        return userRepository.findByEmail(email);
        
    }
}
