package com.example.demoauth.repository.is1Repository.course1;

import com.example.demoauth.models.grade_is1.models.course1.Grade_IS_1_1Course1Semester1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Grade_IS_1_1Course1Semester1Repository extends JpaRepository<Grade_IS_1_1Course1Semester1, Long> {
    Boolean existsByMonth(String month);

}