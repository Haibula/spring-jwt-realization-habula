package com.example.demoauth.repository;

import com.example.demoauth.models.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
}