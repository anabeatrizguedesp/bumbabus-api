package com.api.bumbabusapi.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="usuario")
public class UserModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID user_id;
    @Column(nullable = false, unique = true, length = 20)
    private String username;
    @Column(nullable = false,  length = 50 )
    private String name;
    @Column (nullable = false) @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate birthday;   
    @Column(nullable = false,  length = 3 )
    private int age;
    @Column( length = 15 )
    private String sex;
    @Column( unique = true, length = 50 ) @Email
    private String email;
    @Column(nullable = false,  length = 15 )
    private String password;
    @Column(nullable = false,  length = 11 )
    private String telephone;


   //GETTERS
    public UUID getUser_id() {
        return user_id;
    }
    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
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
     public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
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
