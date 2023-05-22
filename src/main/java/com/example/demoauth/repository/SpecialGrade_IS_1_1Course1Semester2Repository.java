package com.example.demoauth.repository;

import com.example.demoauth.models.grade_is_1_1.models.SpecialGrade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.SpecialGrade_IS_1_1Course1Semester2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialGrade_IS_1_1Course1Semester2Repository extends JpaRepository<SpecialGrade_IS_1_1Course1Semester2, Long> {
    Optional<SpecialGrade_IS_1_1Course1Semester2> findByUserID(int userID);
}