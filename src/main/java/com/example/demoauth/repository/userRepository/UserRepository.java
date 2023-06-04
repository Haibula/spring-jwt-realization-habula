package com.example.demoauth.repository.userRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoauth.models.userModels.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByGroups(String groups);


}
