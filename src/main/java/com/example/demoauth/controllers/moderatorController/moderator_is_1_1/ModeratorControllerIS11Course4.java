package com.example.demoauth.controllers.moderatorController.moderator_is_1_1;

import com.example.demoauth.repository.Grade_IS_1_1Course1Semester1Repository;
import com.example.demoauth.repository.Progress_IS_1_1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

// Сделай отдельную страницу для практик, диф зачет, курсовых и экзаменов
@Controller
@RequestMapping("/api/moderator")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ModeratorControllerIS11Course4 {
    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_is_1_1_repository;
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;

    @GetMapping("/moderator_is_1_1/course_4/semester_1/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1GreadeСourse4Semester1(@PathVariable String month) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");
        arrayList.add("january");
        arrayList.add("february");
        arrayList.add("march");
        arrayList.add("april");
        arrayList.add("may");
        arrayList.add("june");

        for (String s :
                arrayList) {
            if (month.equals(s)) {
                return "moderatorTemplates-is_1_1/course4/is_1_1-grade-course_4-semester_1-moderator";
            }
        }
        return null;

    }

    @GetMapping("/moderator_is_1_1/course_4/semester_2/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1GreadeСourse3Semester2(@PathVariable String month) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");
        arrayList.add("january");
        arrayList.add("february");
        arrayList.add("march");
        arrayList.add("april");
        arrayList.add("may");
        arrayList.add("june");

        for (String s :
                arrayList) {
            if (month.equals(s)) {
                return "moderatorTemplates-is_1_1/course4/is_1_1-grade-course_4-semester_2-moderator";
            }
        }
        return null;

    }

    @GetMapping("/moderator_is_1_1/course_4/semester_1/special_grade")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1SpecialGreadeСourse3Semester1() {

        return "moderatorTemplates-is_1_1/course4/is_1_1-special-grade-course_4-semester_1-moderator";

    }

    @GetMapping("/moderator_is_1_1/course_4/semester_2/special_grade")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1SpecialGreadeСourse3Semester2() {

        return "moderatorTemplates-is_1_1/course4/is_1_1-special-grade-course_4-semester_2-moderator";

    }
}
