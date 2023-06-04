package com.example.demoauth.repository.is1Repository.course2;

import com.example.demoauth.models.grade_is1.models.course2.Grade_IS_1_1Course2Semester2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Grade_IS_1_1Course2Semester2Repository extends JpaRepository<Grade_IS_1_1Course2Semester2, Long> {
    Boolean existsByMonth(String month);
}