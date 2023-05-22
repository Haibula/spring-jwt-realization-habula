package com.example.demoauth.controllers.studentController.student_is_1_1;

import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.Progress_IS_1_1;
import com.example.demoauth.repository.Grade_IS_1_1Course1Semester1Repository;
import com.example.demoauth.repository.Progress_IS_1_1_Repository;
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
public class StudentController {

    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_IS_1_1_Repository;
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;

    @GetMapping("/is_1_1/{month}")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')or hasRole('ADMIN')")
    public String user41ks(Model model, @PathVariable String month) {
        //путые объекты нужны для заполнения массива. Иначе если в базе данных нет достаточного количество
        //данных, то у юзера при в ходе выдает 500 ошибку
        List<Grade_IS_1_1Course1Semester1> gradeIS11List = grade_IS_1_1_Repository.findAll();
        ArrayList<Grade_IS_1_1Course1Semester1> listSeptember = new ArrayList<>();
        if (gradeIS11List.isEmpty()) {
            for (int i = 0; i < 40; i++) {
                gradeIS11List.add(new Grade_IS_1_1Course1Semester1());
            }
        }

        for (int i = 0; i < gradeIS11List.size(); i++) {
            try {
                if (gradeIS11List.get(i).getMonth().contains(month)) {
                    listSeptember.add(gradeIS11List.get(i));
                }
            } catch (Exception ignored) {

            }
        }
        model.addAttribute("post", listSeptember);

        if (grade_IS_1_1_Repository.existsByMonth(month)) {
            return "is_1_1-grade";
        } else {
            return "is_1_1-grade-void";
        }


    }

    @GetMapping("/is_1_1/progressIS11")
    @PreAuthorize("hasRole('IS_1_1')or hasRole('MODERATOR_IS_1_1')")
    public String user41ksProgress(Model model) {
        List<Progress_IS_1_1> progressIS11List = progress_is_1_1_repository.findAll();
        if (progressIS11List.isEmpty()) {
            // Нужно для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            for (int i = 0; i < 40; i++) {
                progressIS11List.add(new Progress_IS_1_1());
            }
        }
        progressIS11List.sort(Comparator.comparingInt(Progress_IS_1_1::getUserID));
        model.addAttribute("post", progressIS11List);

        return "41ks-progress";
    }

    @GetMapping("/42ks/{month}")
    @PreAuthorize("hasRole('42KS')or hasRole('MODERATOR')")
    public String user42ks(@PathVariable String month) {
        return "42ks";
    }

    @GetMapping("/43ks/{month}")
    @PreAuthorize("hasRole('43KS')or hasRole('MODERATOR')")
    public String user43ks(@PathVariable String month) {
        return "43ks";
    }

}
