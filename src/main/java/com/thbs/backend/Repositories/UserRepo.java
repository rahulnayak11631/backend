package com.thbs.backend.Repositories;
 
import java.util.UUID;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.thbs.backend.Models.UserModel;
import java.util.Optional;
 
 
public interface UserRepo extends JpaRepository<UserModel,UUID>{
    UserModel findByEmail(String email);
    Optional<UserModel> findById(UUID id);
   
   
}