package com.example.demoauth.repository.is1Repository.course3;

import com.example.demoauth.models.grade_is1.models.course3.SpecialGrade_IS_1_1Course3Semester1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialGrade_IS_1_1Course3Semester1Repository extends JpaRepository<SpecialGrade_IS_1_1Course3Semester1, Long> {
    Optional<SpecialGrade_IS_1_1Course3Semester1> findByUserID(int userID);

}