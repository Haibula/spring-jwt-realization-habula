package com.example.demoauth.repository;

import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.Progress_IS_1_1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Grade_IS_1_1Course1Semester1Repository extends JpaRepository<Grade_IS_1_1Course1Semester1, Long> {
    Optional<Grade_IS_1_1Course1Semester1> findByUserID(int userID);
    Optional<Grade_IS_1_1Course1Semester1> findByMonth(String month);
    Boolean existsByMonth(String month);

}