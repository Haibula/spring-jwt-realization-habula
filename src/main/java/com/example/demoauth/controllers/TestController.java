package com.example.demoauth.controllers;

import com.example.demoauth.models.Grade41ks;
import com.example.demoauth.models.Progress;
import com.example.demoauth.repository.GradeRepository;
import com.example.demoauth.repository.ProgressRepository;
import com.example.demoauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/api/test")
@CrossOrigin(origins = "*", maxAge = 3600)
public class TestController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    GradeRepository gradeRepository;
    @Autowired
    ProgressRepository progressRepository;

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

    @GetMapping("/41ks/{month}")
    @PreAuthorize("hasRole('41KS')or hasRole('MODERATOR')")
    public String user41ks(Model model, @PathVariable String month) {

        //путые объекты нужны для заполнения массива. Иначе если в базе данных нет достаточного количество
        //данных, то у юзера при в ходе выдает 500 ошибку
        List<Grade41ks> res = gradeRepository.findAll();
        ArrayList<Grade41ks> listSeptember = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            res.add(new Grade41ks());
        }

        for (int i = 0; i < res.size(); i++) {
            try {
                if (res.get(i).getMonth().contains(month)) {
                    listSeptember.add(res.get(i));
                }
            } catch (Exception ignored) {

            }
        }
        model.addAttribute("post", listSeptember);

        if (gradeRepository.existsByMonth(month)) {
            return "41ks-grade";
        } else {
            return "41ks-grade-void";
        }


    }

    @GetMapping("/41ks/progress")
    @PreAuthorize("hasRole('41KS')or hasRole('MODERATOR')")
    public String user41ksProgress(Model model) {
        List<Progress> res = progressRepository.findAll();

        for (int i = 0; i < 20; i++) {
            res.add(new Progress());
        }

        model.addAttribute("post", res);


        return "41ks-progress";
    }

    @GetMapping("/moderator/{month}")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moder41ksGreade(@PathVariable String month) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");
        arrayList.add("january");
        arrayList.add("february");
        arrayList.add("march");
        arrayList.add("april");

        for (String s :
                arrayList) {
            if (month.equals(s)) {
                return "41ks-grade-moderator";
            }
        }
        return null;

    }

    @PostMapping("/moderator/{month}")
    public String moderPost(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @PathVariable String month) {
        try {
            String[] splitUser1Grades = user1Grades.split(",");
            String[] splitUser2Grades = user2Grades.split(",");
            String[] splitUser3Grades = user3Grades.split(",");
            String[] splitUser4Grades = user4Grades.split(",");
            String[] splitUser5Grades = user5Grades.split(",");
            String[] splitUser6Grades = user6Grades.split(",");
            String[] splitUser7Grades = user7Grades.split(",");
            String[] splitUser8Grades = user8Grades.split(",");
            String[] splitUser9Grades = user9Grades.split(",");
            String[] splitUser10Grades = user10Grades.split(",");
            String[] splitUser11Grades = user11Grades.split(",");
            String[] splitUser12Grades = user12Grades.split(",");
            String[] splitUser13Grades = user13Grades.split(",");
            String[] splitUser14Grades = user14Grades.split(",");
            String[] splitUser15Grades = user15Grades.split(",");
            String[] splitUser16Grades = user16Grades.split(",");

            ArrayList<Grade41ks> arrayList = new ArrayList<>();
            arrayList.add(new Grade41ks(splitUser1Grades, month));
            arrayList.add(new Grade41ks(splitUser2Grades, month));
            arrayList.add(new Grade41ks(splitUser3Grades, month));
            arrayList.add(new Grade41ks(splitUser4Grades, month));
            arrayList.add(new Grade41ks(splitUser5Grades, month));
            arrayList.add(new Grade41ks(splitUser6Grades, month));
            arrayList.add(new Grade41ks(splitUser7Grades, month));
            arrayList.add(new Grade41ks(splitUser8Grades, month));
            arrayList.add(new Grade41ks(splitUser9Grades, month));
            arrayList.add(new Grade41ks(splitUser10Grades, month));
            arrayList.add(new Grade41ks(splitUser11Grades, month));
            arrayList.add(new Grade41ks(splitUser12Grades, month));
            arrayList.add(new Grade41ks(splitUser13Grades, month));
            arrayList.add(new Grade41ks(splitUser14Grades, month));
            arrayList.add(new Grade41ks(splitUser15Grades, month));
            arrayList.add(new Grade41ks(splitUser16Grades, month));
            if (!gradeRepository.existsByMonth(month)) {
                gradeRepository.saveAll(arrayList);
            }

        } catch (Exception ignore) {

        }

        return "redirect:/api/test/moderator/{month}";
    }

    @GetMapping("/moderator/progress")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moder41ksProgress() {

        return "41ks-progress-moderator";
    }

    @PostMapping("/moderator/progress")
    public String moderPostProgress(@RequestParam String user1Grades,
                                    @RequestParam String user2Grades,
                                    @RequestParam String user3Grades,
                                    @RequestParam String user4Grades,
                                    @RequestParam String user5Grades,
                                    @RequestParam String user6Grades,
                                    @RequestParam String user7Grades,
                                    @RequestParam String user8Grades,
                                    @RequestParam String user9Grades,
                                    @RequestParam String user10Grades,
                                    @RequestParam String user11Grades,
                                    @RequestParam String user12Grades,
                                    @RequestParam String user13Grades,
                                    @RequestParam String user14Grades,
                                    @RequestParam String user15Grades,
                                    @RequestParam String user16Grades) {
        System.out.println(user1Grades);
        try {
            String[] splitUser1Grades = user1Grades.split(",");
            String[] splitUser2Grades = user2Grades.split(",");
            String[] splitUser3Grades = user3Grades.split(",");
            String[] splitUser4Grades = user4Grades.split(",");
            String[] splitUser5Grades = user5Grades.split(",");
            String[] splitUser6Grades = user6Grades.split(",");
            String[] splitUser7Grades = user7Grades.split(",");
            String[] splitUser8Grades = user8Grades.split(",");
            String[] splitUser9Grades = user9Grades.split(",");
            String[] splitUser10Grades = user10Grades.split(",");
            String[] splitUser11Grades = user11Grades.split(",");
            String[] splitUser12Grades = user12Grades.split(",");
            String[] splitUser13Grades = user13Grades.split(",");
            String[] splitUser14Grades = user14Grades.split(",");
            String[] splitUser15Grades = user15Grades.split(",");
            String[] splitUser16Grades = user16Grades.split(",");

            ArrayList<Progress> arrayList = new ArrayList<>();
            arrayList.add(new Progress(splitUser1Grades));
            arrayList.add(new Progress(splitUser2Grades));
            arrayList.add(new Progress(splitUser3Grades));
            arrayList.add(new Progress(splitUser4Grades));
            arrayList.add(new Progress(splitUser5Grades));
            arrayList.add(new Progress(splitUser6Grades));
            arrayList.add(new Progress(splitUser7Grades));
            arrayList.add(new Progress(splitUser8Grades));
            arrayList.add(new Progress(splitUser9Grades));
            arrayList.add(new Progress(splitUser10Grades));
            arrayList.add(new Progress(splitUser11Grades));
            arrayList.add(new Progress(splitUser12Grades));
            arrayList.add(new Progress(splitUser13Grades));
            arrayList.add(new Progress(splitUser14Grades));
            arrayList.add(new Progress(splitUser15Grades));
            arrayList.add(new Progress(splitUser16Grades));

            progressRepository.saveAll(arrayList);


        } catch (Exception ignore) {

        }
        return "redirect:/api/test/moderator/progress";
    }

    @GetMapping("/admin/{month}")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {

        return "admin";
    }

}
