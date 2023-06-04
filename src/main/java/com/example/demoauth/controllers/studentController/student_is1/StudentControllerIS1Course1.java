package com.example.demoauth.controllers.studentController.student_is1;

import com.example.demoauth.models.grade_is1.models.Progress_IS_1_1;
import com.example.demoauth.repository.is1Repository.Progress_IS_1_1_Repository;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorSpecialGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorSpecialGradeServiceIS1Course1Semester2;
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
public class StudentControllerIS1Course1 {

    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course1Semester2 moderatorGradeServiceIS11Course1Semester2;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course1Semester1 moderatorSpecialGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course1Semester2 moderatorSpecialGradeServiceIS11Course1Semester2;

    //GetMappingGradeCourse1Semester1
    @GetMapping("/is_1_1/course_1/semester_1//{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse1Semester1(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1(month, model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");

        for (String s : arrayList) {
            if (month.equals(s)) {
                return "studentsTemplates-is_1_1/course1/is_1_1-grade-course1-semester1-students";
            }
        }
        return null;
    }

    //GetMappingGradeCourse1Semester2
    @GetMapping("/is_1_1/course_1/semester_2/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse1Semester2(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course1Semester2.getMappingModer_is_1_1GreadeСourse1Semester2(month, model);
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
                return "studentsTemplates-is_1_1/course1/is_1_1-grade-course1-semester2-students";
            }
        }
        return null;

    }


    //GetMappingSpecialGradeCourse1Semester1
    @GetMapping("/is_1_1/course_1/semester_1/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse1Semester1(Model model) {
        moderatorSpecialGradeServiceIS11Course1Semester1.getMappingModer_is_1_1SpecialGreadeСourse1Semester1(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "studentsTemplates-is_1_1/course1/is_1_1-special_grade-course1-semester1-students";
    }


    //GetMappingSpecialGradeCourse1Semester2
    @GetMapping("/is_1_1/course_1/semester_2/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse1Semester2(Model model) {
        moderatorSpecialGradeServiceIS11Course1Semester2.getMappingModer_is_1_1SpecialGreadeСourse1Semester2(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        return "studentsTemplates-is_1_1/course1/is_1_1-special_grade-course1-semester2-students";

    }


}
