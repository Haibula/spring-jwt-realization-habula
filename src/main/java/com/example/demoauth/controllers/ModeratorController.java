package com.example.demoauth.controllers;

import com.example.demoauth.models.Grade_IS_1_1;
import com.example.demoauth.models.Progress_IS_1_1;
import com.example.demoauth.repository.Grade_IS_1_1_Repository;
import com.example.demoauth.repository.Progress_IS_1_1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
// Сделай отдельную страницу для практик, диф зачет, курсовых и экзаменов
@Controller
@RequestMapping("/api/moderator")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ModeratorController {
    @Autowired
    Grade_IS_1_1_Repository grade_is_1_1_repository;
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;

    @GetMapping("/moderator_is_1_1/course_1/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_Greade_1_Сourse(@PathVariable String month) {

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
                return "is_1_1-grade_1_course-moderator";
            }
        }
        return null;

    }

    @PostMapping("/moderator_is_1_1/course_1/{month}")
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

            ArrayList<Grade_IS_1_1> arrayList = new ArrayList<>();
            arrayList.add(new Grade_IS_1_1(splitUser1Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser2Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser3Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser4Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser5Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser6Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser7Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser8Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser9Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser10Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser11Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser12Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser13Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser14Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser15Grades, month));
            arrayList.add(new Grade_IS_1_1(splitUser16Grades, month));
            if (!grade_is_1_1_repository.existsByMonth(month)) {
                grade_is_1_1_repository.saveAll(arrayList);
            }

        } catch (Exception ignore) {

        }

        return "redirect:/api/moderator/{month}";
    }

    @GetMapping("/moderator_is_1_1/course_1/progressIS11")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder41ksProgress(Model model) {

        List<Progress_IS_1_1> res = progress_is_1_1_repository.findAll();
        if (res.isEmpty()) {
            // Нужно для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            for (int i = 0; i < 40; i++) {
                res.add(new Progress_IS_1_1());
            }
        }
        res.sort(Comparator.comparingInt(Progress_IS_1_1::getUserID));
        model.addAttribute("post", res);

        return "41ks-progress-moderator";
    }

    @PostMapping("/progressIS11")
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


        try {
            String[] splitUser1Grades = user1Grades.replace(",", ",-").split(",");
            String[] splitUser2Grades = user2Grades.replace(",", ",-").split(",");
            String[] splitUser3Grades = user3Grades.replace(",", ",-").split(",");
            String[] splitUser4Grades = user4Grades.replace(",", ",-").split(",");
            String[] splitUser5Grades = user5Grades.replace(",", ",-").split(",");
            String[] splitUser6Grades = user6Grades.replace(",", ",-").split(",");
            String[] splitUser7Grades = user7Grades.replace(",", ",-").split(",");
            String[] splitUser8Grades = user8Grades.replace(",", ",-").split(",");
            String[] splitUser9Grades = user9Grades.replace(",", ",-").split(",");
            String[] splitUser10Grades = user10Grades.replace(",", ",-").split(",");
            String[] splitUser11Grades = user11Grades.replace(",", ",-").split(",");
            String[] splitUser12Grades = user12Grades.replace(",", ",-").split(",");
            String[] splitUser13Grades = user13Grades.replace(",", ",-").split(",");
            String[] splitUser14Grades = user14Grades.replace(",", ",-").split(",");
            String[] splitUser15Grades = user15Grades.replace(",", ",-").split(",");
            String[] splitUser16Grades = user16Grades.replace(",", ",-").split(",");


            for (int i = 0; i < splitUser1Grades.length; i++) {
                splitUser1Grades[i] = splitUser1Grades[i].replace("-", "");
                splitUser2Grades[i] = splitUser2Grades[i].replace("-", "");
                splitUser3Grades[i] = splitUser3Grades[i].replace("-", "");
                splitUser4Grades[i] = splitUser4Grades[i].replace("-", "");
                splitUser5Grades[i] = splitUser5Grades[i].replace("-", "");
                splitUser6Grades[i] = splitUser6Grades[i].replace("-", "");
                splitUser7Grades[i] = splitUser7Grades[i].replace("-", "");
                splitUser8Grades[i] = splitUser8Grades[i].replace("-", "");
                splitUser9Grades[i] = splitUser9Grades[i].replace("-", "");
                splitUser10Grades[i] = splitUser10Grades[i].replace("-", "");
                splitUser11Grades[i] = splitUser11Grades[i].replace("-", "");
                splitUser12Grades[i] = splitUser12Grades[i].replace("-", "");
                splitUser13Grades[i] = splitUser13Grades[i].replace("-", "");
                splitUser14Grades[i] = splitUser14Grades[i].replace("-", "");
                splitUser15Grades[i] = splitUser15Grades[i].replace("-", "");
                splitUser16Grades[i] = splitUser16Grades[i].replace("-", "");

            }

            ArrayList<Progress_IS_1_1> addArr = new ArrayList<>();
            addArr.add(new Progress_IS_1_1(splitUser1Grades));
            addArr.add(new Progress_IS_1_1(splitUser2Grades));
            addArr.add(new Progress_IS_1_1(splitUser3Grades));
            addArr.add(new Progress_IS_1_1(splitUser4Grades));
            addArr.add(new Progress_IS_1_1(splitUser5Grades));
            addArr.add(new Progress_IS_1_1(splitUser6Grades));
            addArr.add(new Progress_IS_1_1(splitUser7Grades));
            addArr.add(new Progress_IS_1_1(splitUser8Grades));
            addArr.add(new Progress_IS_1_1(splitUser9Grades));
            addArr.add(new Progress_IS_1_1(splitUser10Grades));
            addArr.add(new Progress_IS_1_1(splitUser11Grades));
            addArr.add(new Progress_IS_1_1(splitUser12Grades));
            addArr.add(new Progress_IS_1_1(splitUser13Grades));
            addArr.add(new Progress_IS_1_1(splitUser14Grades));
            addArr.add(new Progress_IS_1_1(splitUser15Grades));
            addArr.add(new Progress_IS_1_1(splitUser16Grades));


            if (progress_is_1_1_repository.findAll().isEmpty()) {
                progress_is_1_1_repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<Progress_IS_1_1> user1row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser1Grades[0]));
            Progress_IS_1_1 user1 = user1row.get();
            user1.setUsername(splitUser1Grades[1]);
            user1.setPassSeptember(splitUser1Grades[2]);
            user1.setPassOctober(splitUser1Grades[3]);
            user1.setPassNovember(splitUser1Grades[4]);
            user1.setPassDecember(splitUser1Grades[5]);
            user1.setPassJanuary(splitUser1Grades[6]);
            user1.setPassFebruary(splitUser1Grades[7]);
            user1.setPassMarch(splitUser1Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user2
            Optional<Progress_IS_1_1> user2row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser2Grades[0]));
            Progress_IS_1_1 user2 = user2row.get();
            user2.setUsername(splitUser2Grades[1]);
            user2.setPassSeptember(splitUser2Grades[2]);
            user2.setPassOctober(splitUser2Grades[3]);
            user2.setPassNovember(splitUser2Grades[4]);
            user2.setPassDecember(splitUser2Grades[5]);
            user2.setPassJanuary(splitUser2Grades[6]);
            user2.setPassFebruary(splitUser2Grades[7]);
            user2.setPassMarch(splitUser2Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user3
            Optional<Progress_IS_1_1> user3row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser3Grades[0]));
            Progress_IS_1_1 user3 = user3row.get();
            user3.setUsername(splitUser3Grades[1]);
            user3.setPassSeptember(splitUser3Grades[2]);
            user3.setPassOctober(splitUser3Grades[3]);
            user3.setPassNovember(splitUser3Grades[4]);
            user3.setPassDecember(splitUser3Grades[5]);
            user3.setPassJanuary(splitUser3Grades[6]);
            user3.setPassFebruary(splitUser3Grades[7]);
            user3.setPassMarch(splitUser3Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user4
            Optional<Progress_IS_1_1> user4row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser4Grades[0]));
            Progress_IS_1_1 user4 = user4row.get();
            user4.setUsername(splitUser4Grades[1]);
            user4.setPassSeptember(splitUser4Grades[2]);
            user4.setPassOctober(splitUser4Grades[3]);
            user4.setPassNovember(splitUser4Grades[4]);
            user4.setPassDecember(splitUser4Grades[5]);
            user4.setPassJanuary(splitUser4Grades[6]);
            user4.setPassFebruary(splitUser4Grades[7]);
            user4.setPassMarch(splitUser4Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user5
            Optional<Progress_IS_1_1> user5row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser5Grades[0]));
            Progress_IS_1_1 user5 = user5row.get();
            user5.setUsername(splitUser5Grades[1]);
            user5.setPassSeptember(splitUser5Grades[2]);
            user5.setPassOctober(splitUser5Grades[3]);
            user5.setPassNovember(splitUser5Grades[4]);
            user5.setPassDecember(splitUser5Grades[5]);
            user5.setPassJanuary(splitUser5Grades[6]);
            user5.setPassFebruary(splitUser5Grades[7]);
            user5.setPassMarch(splitUser5Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user6
            Optional<Progress_IS_1_1> user6row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser6Grades[0]));
            Progress_IS_1_1 user6 = user6row.get();
            user6.setUsername(splitUser6Grades[1]);
            user6.setPassSeptember(splitUser6Grades[2]);
            user6.setPassOctober(splitUser6Grades[3]);
            user6.setPassNovember(splitUser6Grades[4]);
            user6.setPassDecember(splitUser6Grades[5]);
            user6.setPassJanuary(splitUser6Grades[6]);
            user6.setPassFebruary(splitUser6Grades[7]);
            user6.setPassMarch(splitUser6Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user7
            Optional<Progress_IS_1_1> user7row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser7Grades[0]));
            Progress_IS_1_1 user7 = user7row.get();
            user7.setUsername(splitUser7Grades[1]);
            user7.setPassSeptember(splitUser7Grades[2]);
            user7.setPassOctober(splitUser7Grades[3]);
            user7.setPassNovember(splitUser7Grades[4]);
            user7.setPassDecember(splitUser7Grades[5]);
            user7.setPassJanuary(splitUser7Grades[6]);
            user7.setPassFebruary(splitUser7Grades[7]);
            user7.setPassMarch(splitUser7Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user8
            Optional<Progress_IS_1_1> user8row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser8Grades[0]));
            Progress_IS_1_1 user8 = user8row.get();
            user8.setUsername(splitUser8Grades[1]);
            user8.setPassSeptember(splitUser8Grades[2]);
            user8.setPassOctober(splitUser8Grades[3]);
            user8.setPassNovember(splitUser8Grades[4]);
            user8.setPassDecember(splitUser8Grades[5]);
            user8.setPassJanuary(splitUser8Grades[6]);
            user8.setPassFebruary(splitUser8Grades[7]);
            user8.setPassMarch(splitUser8Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user9
            Optional<Progress_IS_1_1> user9row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser9Grades[0]));
            Progress_IS_1_1 user9 = user9row.get();
            user9.setUsername(splitUser9Grades[1]);
            user9.setPassSeptember(splitUser9Grades[2]);
            user9.setPassOctober(splitUser9Grades[3]);
            user9.setPassNovember(splitUser9Grades[4]);
            user9.setPassDecember(splitUser9Grades[5]);
            user9.setPassJanuary(splitUser9Grades[6]);
            user9.setPassFebruary(splitUser9Grades[7]);
            user9.setPassMarch(splitUser9Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user10
            Optional<Progress_IS_1_1> user10row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser10Grades[0]));
            Progress_IS_1_1 user10 = user10row.get();
            user10.setUsername(splitUser10Grades[1]);
            user10.setPassSeptember(splitUser10Grades[2]);
            user10.setPassOctober(splitUser10Grades[3]);
            user10.setPassNovember(splitUser10Grades[4]);
            user10.setPassDecember(splitUser10Grades[5]);
            user10.setPassJanuary(splitUser10Grades[6]);
            user10.setPassFebruary(splitUser10Grades[7]);
            user10.setPassMarch(splitUser10Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user11
            Optional<Progress_IS_1_1> user11row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser11Grades[0]));
            Progress_IS_1_1 user11 = user11row.get();
            user11.setUsername(splitUser11Grades[1]);
            user11.setPassSeptember(splitUser11Grades[2]);
            user11.setPassOctober(splitUser11Grades[3]);
            user11.setPassNovember(splitUser11Grades[4]);
            user11.setPassDecember(splitUser11Grades[5]);
            user11.setPassJanuary(splitUser11Grades[6]);
            user11.setPassFebruary(splitUser11Grades[7]);
            user11.setPassMarch(splitUser11Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user12
            Optional<Progress_IS_1_1> user12row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser12Grades[0]));
            Progress_IS_1_1 user12 = user12row.get();
            user12.setUsername(splitUser12Grades[1]);
            user12.setPassSeptember(splitUser12Grades[2]);
            user12.setPassOctober(splitUser12Grades[3]);
            user12.setPassNovember(splitUser12Grades[4]);
            user12.setPassDecember(splitUser12Grades[5]);
            user12.setPassJanuary(splitUser12Grades[6]);
            user12.setPassFebruary(splitUser12Grades[7]);
            user12.setPassMarch(splitUser12Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user13
            Optional<Progress_IS_1_1> user13row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser13Grades[0]));
            Progress_IS_1_1 user13 = user13row.get();
            user13.setUsername(splitUser13Grades[1]);
            user13.setPassSeptember(splitUser13Grades[2]);
            user13.setPassOctober(splitUser13Grades[3]);
            user13.setPassNovember(splitUser13Grades[4]);
            user13.setPassDecember(splitUser13Grades[5]);
            user13.setPassJanuary(splitUser13Grades[6]);
            user13.setPassFebruary(splitUser13Grades[7]);
            user13.setPassMarch(splitUser13Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user14
            Optional<Progress_IS_1_1> user14row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser14Grades[0]));
            Progress_IS_1_1 user14 = user14row.get();
            user14.setUsername(splitUser14Grades[1]);
            user14.setPassSeptember(splitUser14Grades[2]);
            user14.setPassOctober(splitUser14Grades[3]);
            user14.setPassNovember(splitUser14Grades[4]);
            user14.setPassDecember(splitUser14Grades[5]);
            user14.setPassJanuary(splitUser14Grades[6]);
            user14.setPassFebruary(splitUser14Grades[7]);
            user14.setPassMarch(splitUser14Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user15
            Optional<Progress_IS_1_1> user15row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser15Grades[0]));
            Progress_IS_1_1 user15 = user15row.get();
            user15.setUsername(splitUser15Grades[1]);
            user15.setPassSeptember(splitUser15Grades[2]);
            user15.setPassOctober(splitUser15Grades[3]);
            user15.setPassNovember(splitUser15Grades[4]);
            user15.setPassDecember(splitUser15Grades[5]);
            user15.setPassJanuary(splitUser15Grades[6]);
            user15.setPassFebruary(splitUser15Grades[7]);
            user15.setPassMarch(splitUser15Grades[8]);
            progress_is_1_1_repository.save(user1);
            //user16
            Optional<Progress_IS_1_1> user16row = progress_is_1_1_repository.findByUserID(Integer.parseInt(splitUser16Grades[0]));
            Progress_IS_1_1 user16 = user16row.get();
            user16.setUsername(splitUser16Grades[1]);
            user16.setPassSeptember(splitUser16Grades[2]);
            user16.setPassOctober(splitUser16Grades[3]);
            user16.setPassNovember(splitUser16Grades[4]);
            user16.setPassDecember(splitUser16Grades[5]);
            user16.setPassJanuary(splitUser16Grades[6]);
            user16.setPassFebruary(splitUser16Grades[7]);
            user16.setPassMarch(splitUser16Grades[8]);
            progress_is_1_1_repository.save(user1);


        } catch (Exception ignore) {

        }
        return "redirect:/api/moderator/moderator_is_1_1/course_1/progressIS11";
    }

    @GetMapping("/moderator_is_1_1/course_2/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_Greade_2_Сourse(@PathVariable String month) {

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
                return "is_1_1-grade_2_course-moderator";
            }
        }
        return null;

    }
    @GetMapping("/moderator_is_1_1/course_3/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_Greade_3_Сourse(@PathVariable String month) {

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
                return "is_1_1-grade_3_course-moderator";
            }
        }
        return null;

    }
    @GetMapping("/moderator_is_1_1/course_4/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_Greade_4_Сourse(@PathVariable String month) {

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
                return "is_1_1-grade_4_course-moderator";
            }
        }
        return null;

    }


    @GetMapping("/admin/{month}")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {

        return "admin";
    }
}
