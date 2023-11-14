package com.api.bumbabusapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bumbabusapi.DTOS.UserDTO;
import com.api.bumbabusapi.models.UserModel;
import com.api.bumbabusapi.services.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping 
    public ResponseEntity<Object> SignUpUser(@RequestBody @Valid UserDTO userDTO) {

       if(userService.existeEmail(userDTO.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Este email já está cadastrado.");
        }

       if(userService.existeTelefone(userDTO.getTelephone())){
         return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Este número de telefone já está cadastrado.");
       }

       if(userService.existeUsername(userDTO.getUsername())){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: este nome de usuário já está em uso.");
       }

        var userModel = new UserModel();
        BeanUtils.copyProperties(userDTO,userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
        
    
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @GetMapping("/{email}")
    public ResponseEntity<?> getOneByEmail(@PathVariable(value = "email") String email) {
    Optional<UserModel> userModelOptional = userService.findByemail(email);

    if (!userModelOptional.isPresent()) {
        ErrorResponse errorResponse = new ErrorResponse("Usuário não encontrado para o e-mail fornecido.");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    return ResponseEntity.status(HttpStatus.OK).body(userModelOptional.get());
}




    }