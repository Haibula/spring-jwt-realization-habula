package com.example.demoauth.repository.is1Repository.course2;

import com.example.demoauth.models.grade_is1.models.course2.Grade_IS_1_1Course2Semester1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Grade_IS_1_1Course2Semester1Repository extends JpaRepository<Grade_IS_1_1Course2Semester1, Long> {
    Boolean existsByMonth(String month);

}