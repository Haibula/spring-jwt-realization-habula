package com.example.demoauth.controllers.studentController.student_is1;

import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorGradeServiceIS1Course2Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorGradeServiceIS1Course2Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorSpecialGradeServiceIS1Course2Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course2.ModeratorSpecialGradeServiceIS1Course2Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course3.ModeratorGradeServiceIS1Course3Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course3.ModeratorGradeServiceIS1Course3Semester2;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course3.ModeratorSpecialGradeServiceIS1Course3Semester1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course3.ModeratorSpecialGradeServiceIS1Course3Semester2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/students")
@CrossOrigin(origins = "*", maxAge = 3600)
public class StudentControllerIS1Course3 {

    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course3Semester1 moderatorGradeServiceIS11Course3Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course3Semester2 moderatorGradeServiceIS11Course3Semester2;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course3Semester1 moderatorSpecialGradeServiceIS11Course3Semester1;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course3Semester2 moderatorSpecialGradeServiceIS11Course3Semester2;

    //GetMappingGradeCourse3Semester1
    @GetMapping("/is_1_1/course_3/semester_1/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse3Semester1(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course3Semester1.getMappingMethodModer_is_1_1GreadeСourse3Semester1(month, model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");

        for (String s : arrayList) {
            if (month.equals(s)) {
                return "studentsTemplates-is_1_1/course3/is_1_1-grade-course_3-semester_1-students";
            }
        }
        return null;

    }

    //GetMappingGradeCourse3Semester2
    @GetMapping("/is_1_1/course_3/semester_2/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1GreadeСourse3Semester2(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course3Semester2.getMappingMethodModer_is_1_1GreadeСourse3Semester2(month, model);
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
                return "studentsTemplates-is_1_1/course3/is_1_1-grade-course_3-semester_2-students";
            }
        }
        return null;

    }

    //GetMappingSpecialGradeCourse3Semester1
    @GetMapping("/is_1_1/course_3/semester_1/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse3Semester1(Model model) {
        moderatorSpecialGradeServiceIS11Course3Semester1.getMappingModer_is_1_1SpecialGreadeСourse3Semester1(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "studentsTemplates-is_1_1/course3/is_1_1-special_grade-course_3-semester_1-students";
    }


    //GetMappingSpecialGradeCourse3Semester2
    @GetMapping("/is_1_1/course_3/semester_2/special_grade")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String students_is_1_1SpecialGreadeСourse3Semester2(Model model) {
        moderatorSpecialGradeServiceIS11Course3Semester2.getMappingModer_is_1_1SpecialGreadeСourse3Semester2(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "studentsTemplates-is_1_1/course3/is_1_1-special_grade-course_3-semester_2-students";
    }

}
