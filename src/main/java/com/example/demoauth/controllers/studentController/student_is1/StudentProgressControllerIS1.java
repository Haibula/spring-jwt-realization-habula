package com.example.demoauth.controllers.studentController.student_is1;

import com.example.demoauth.models.grade_is1.models.Progress_IS_1_1;
import com.example.demoauth.repository.is1Repository.Progress_IS_1_1_Repository;
import com.example.demoauth.service.moderatorService.moderator_is1Service.ModeratorProgressServiceIS1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course4.ModeratorGradeServiceIS1Course4Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course4.ModeratorGradeServiceIS1Course4Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course4.ModeratorSpecialGradeServiceIS1Course4Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course4.ModeratorSpecialGradeServiceIS1Course4Semester2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/api/students")
@CrossOrigin(origins = "*", maxAge = 3600)
public class StudentProgressControllerIS1 {
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;
    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorProgressServiceIS1 moderatorProgressServiceIS1;

    @GetMapping("/is_1_1/{course}/progressIS11")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String is_1_1Progress(Model model, @PathVariable String course) {
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        moderatorProgressServiceIS1.getMappingModer_is_1_1Progress(model,course);
        return "is_1_1-progress-students";
    }

}
