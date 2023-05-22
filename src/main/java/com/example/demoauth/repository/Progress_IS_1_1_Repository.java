package com.example.demoauth.repository;

import com.example.demoauth.models.grade_is_1_1.models.Progress_IS_1_1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Progress_IS_1_1_Repository extends JpaRepository<Progress_IS_1_1, Long> {
    Optional<Progress_IS_1_1> findByUserID(int userID);
}