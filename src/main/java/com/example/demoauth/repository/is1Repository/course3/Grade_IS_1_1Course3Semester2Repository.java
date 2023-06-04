package com.example.demoauth.repository.is1Repository.course3;

import com.example.demoauth.models.grade_is1.models.course3.Grade_IS_1_1Course3Semester2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Grade_IS_1_1Course3Semester2Repository extends JpaRepository<Grade_IS_1_1Course3Semester2, Long> {
    Boolean existsByMonth(String month);
}