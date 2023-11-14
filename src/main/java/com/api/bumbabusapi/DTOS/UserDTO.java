package com.api.bumbabusapi.DTOS;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.api.bumbabusapi.models.CustomLocalDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserDTO {
    
    @NotBlank @Size(max = 20)
    private String username;
    
    @NotBlank  @Size(max = 50)
    private String name;

    @NotNull @DateTimeFormat(pattern = "dd/MM/yyyy") @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate birthday;

    @NotBlank @Email @Size(max = 50)
    private String email;
    
    @NotBlank
    @Size(max = 15)
    private String password;
    
    @NotBlank
    @Size(max = 11)
    private String telephone;


   //GETTERS
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephone() {
        return telephone;
    }
    

    //SETTERS
    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

   
    

    
}
