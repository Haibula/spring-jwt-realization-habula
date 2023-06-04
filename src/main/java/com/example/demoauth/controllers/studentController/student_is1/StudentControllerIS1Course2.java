package com.example.demoauth.controllers.studentController.student_is1;

import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorGradeServiceIS1Course2Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorGradeServiceIS1Course2Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorSpecialGradeServiceIS1Course2Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorSpecialGradeServiceIS1Course2Semester2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/api/students")
@CrossOrigin(origins = "*", maxAge = 3600)
public class StudentControllerIS1Course2 {

    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course2Semester1 moderatorGradeServiceIS11Course2Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course2Semester2 moderatorGradeServiceIS11Course2Semester2;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course2Semester1 moderatorSpecialGradeServiceIS11Course2Semester1;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course2Semester2 moderatorSpecialGradeServiceIS11Course2Semester2;

    //GetMappingGradeCourse2Semester1
    @GetMapping("/is_1_1/course_2/semester_1/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse2Semester1(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course2Semester1.getMappingMethodModer_is_1_1GreadeСourse2Semester1(month, model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");

        for (String s : arrayList) {
            if (month.equals(s)) {
                return "studentsTemplates-is_1_1/course2/is_1_1-grade-course2-semester1-students";
            }
        }
        return null;

    }

    //GetMappingGradeCourse2Semester2
    @GetMapping("/is_1_1/course_2/semester_2/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse2Semester2(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course2Semester2.getMappingMethodModer_is_1_1GreadeСourse2Semester2(month, model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("january");
        arrayList.add("february");
        arrayList.add("march");
        arrayList.add("april");
        arrayList.add("may");
        arrayList.add("june");

        for (String s : arrayList) {
            if (month.equals(s)) {
                return "studentsTemplates-is_1_1/course2/is_1_1-grade-course2-semester2-students";
            }
        }
        return null;

    }

    //GetMappingSpecialGradeCourse2Semester1
    @GetMapping("/is_1_1/course_2/semester_1/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse2Semester1(Model model) {
        moderatorSpecialGradeServiceIS11Course2Semester1.getMappingModer_is_1_1SpecialGreadeСourse2Semester1(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "studentsTemplates-is_1_1/course2/is_1_1-special_grade-course2-semester1-students";
    }
    

    //GetMappingSpecialGradeCourse2Semester2
    @GetMapping("/is_1_1/course_2/semester_2/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse2Semester2(Model model) {
        moderatorSpecialGradeServiceIS11Course2Semester2.getMappingModer_is_1_1SpecialGreadeСourse2Semester2(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "studentsTemplates-is_1_1/course2/is_1_1-special_grade-course2-semester2-students";
    }
    
}
