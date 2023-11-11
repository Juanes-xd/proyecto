package com.enganchatic.proyecto.Services;

import com.enganchatic.proyecto.Entities.User;
import com.enganchatic.proyecto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
         userRepository.deleteById(id);
    }

    public Optional<User> updateUser(Long id, User user){
        Optional<User> usuario =  userRepository.findById(id);
        if(usuario.isPresent()){
            User updatedUser = usuario.get();
            if(user.isAvailable()){
                updatedUser.setAvailable(user.isAvailable());
            }
            if(user.getName() != null){
                updatedUser.setName(user.getName());
            }
            if(user.getEmail() != null){
                updatedUser.setEmail(user.getEmail());
            }
            userRepository.save(updatedUser);

        }
        new Error("Customer not found");
        return usuario;
    }
    }


