package com.example.demoauth.repository.is1Repository.course1;

import com.example.demoauth.models.grade_is1.models.course1.SpecialGrade_IS_1_1Course1Semester2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialGrade_IS_1_1Course1Semester2Repository extends JpaRepository<SpecialGrade_IS_1_1Course1Semester2, Long> {
    Optional<SpecialGrade_IS_1_1Course1Semester2> findByUserID(int userID);
}