package com.example.demoauth.repository;

import com.example.demoauth.models.Grade41ks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade41ks, Long> {

    Boolean existsByMonth(String month);

}