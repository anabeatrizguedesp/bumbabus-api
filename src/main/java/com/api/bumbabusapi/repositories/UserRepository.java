package com.api.bumbabusapi.repositories;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.bumbabusapi.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
    
    boolean existsByEmail(String email);
    boolean existsByTelephone(String telephone);
    boolean existsByUsername(String username);
    Optional<UserModel> findByEmail(String email);
}