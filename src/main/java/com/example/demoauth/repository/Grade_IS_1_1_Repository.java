package com.example.demoauth.repository;

import com.example.demoauth.models.Grade_IS_1_1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Grade_IS_1_1_Repository extends JpaRepository<Grade_IS_1_1, Long> {

    Boolean existsByMonth(String month);

}