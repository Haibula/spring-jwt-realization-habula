package com.example.demoauth.repository;

import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Grade_IS_1_1Course1Semester2Repository extends JpaRepository<Grade_IS_1_1Course1Semester2, Long> {
    Optional<Grade_IS_1_1Course1Semester2> findByUserID(int userID);

    Optional<Grade_IS_1_1Course1Semester2> findByMonth(String month);

    Boolean existsByMonth(String month);
}