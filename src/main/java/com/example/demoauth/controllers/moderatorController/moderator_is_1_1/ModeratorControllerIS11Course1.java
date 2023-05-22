package com.example.demoauth.controllers.moderatorController.moderator_is_1_1;

import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.Progress_IS_1_1;
import com.example.demoauth.models.grade_is_1_1.models.SpecialGrade_IS_1_1Course1Semester2;
import com.example.demoauth.repository.*;
import com.example.demoauth.service.moderatorService.moderator_is_1_1.ModeratorGradeServiceIS11Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is_1_1.ModeratorGradeServiceIS11Course1Semester2;
import com.example.demoauth.service.moderatorService.moderator_is_1_1.ModeratorSpecialGradeServiceIS11Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is_1_1.ModeratorSpecialGradeServiceIS11Course1Semester2;
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
public class ModeratorControllerIS11Course1 {
    @Autowired
    SpecialGrade_IS_1_1Course1Semester2Repository specialGradeIs11Course1Semester2Repository;
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;
    @Autowired
    ModeratorGradeServiceIS11Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorGradeServiceIS11Course1Semester2 moderatorGradeServiceIS11Course1Semester2;
    @Autowired
    ModeratorSpecialGradeServiceIS11Course1Semester1 moderatorSpecialGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorSpecialGradeServiceIS11Course1Semester2 moderatorSpecialGradeServiceIS11Course1Semester2;
    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_is_1_1Course1Semester1Repository;

    //GetMappingGradeCourse1Semester1
    @GetMapping("/moderator_is_1_1/course_1/semester_1/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1GreadeСourse1Semester1(@PathVariable String month, Model model) {
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1(month, model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("september");
        arrayList.add("october");
        arrayList.add("november");
        arrayList.add("december");

        for (String s : arrayList) {
            if (month.equals(s)) {
                return "moderatorTemplates-is_1_1/course1/is_1_1-grade-course_1-semester_1-moderator";
            }
        }
        return null;

    }

    //PostMappingGradeCourse1Semester1
    @PostMapping("/moderator_is_1_1/course_1/semester_1/{month}")
    public String moder_is_1_1GreadeСourse1Semester1Post(@RequestParam String inputGroup, @RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
        moderatorGradeServiceIS11Course1Semester1.postMappingMethodModer_is_1_1GreadeСourse1Semester1Post(inputGroup, user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades, month);

        return "redirect:/api/moderator/moderator_is_1_1/course_1/semester_1/{month}";
    }


    //GetMappingGradeCourse1Semester2
    @GetMapping("/moderator_is_1_1/course_1/semester_2/{month}")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1GreadeСourse1Semester2(@PathVariable String month, Model model) {
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
                return "moderatorTemplates-is_1_1/course1/is_1_1-grade-course_1-semester_2-moderator";
            }
        }
        return null;

    }


    //PostMappingGradeCourse1Semester2
    @PostMapping("/moderator_is_1_1/course_1/semester_2/{month}")
    public String moder_is_1_1GreadeСourse1Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
        moderatorGradeServiceIS11Course1Semester2.postMappingModer_is_1_1GreadeСourse1Semester2Post(user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades, month);

        return "redirect:/api/moderator/moderator_is_1_1/course_1/semester_2/{month}";
    }


    //GetMappingSpecialGradeCourse1Semester1
    @GetMapping("/moderator_is_1_1/course_1/semester_1/special_grade")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1SpecialGreadeСourse1Semester1(Model model) {
        moderatorSpecialGradeServiceIS11Course1Semester1.getMappingModer_is_1_1SpecialGreadeСourse1Semester1(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        return "moderatorTemplates-is_1_1/course1/is_1_1-special_grade-course_1-semester_1-moderator";
    }


    //PostMappingSpecialGradeCourse1Semester1
    @PostMapping("/moderator_is_1_1/course_1/semester_1/special_grade")
    public String moder_is_1_1SpecialGreadeСourse1Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
        moderatorSpecialGradeServiceIS11Course1Semester1.postMappingModer_is_1_1SpecialGreadeСourse1Semester1Post(user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades);

        return "redirect:/api/moderator/moderator_is_1_1/course_1/semester_1/special_grade";
    }


    //GetMappingSpecialGradeCourse1Semester2
    @GetMapping("/moderator_is_1_1/course_1/semester_2/special_grade")
    @PreAuthorize("hasRole('MODERATOR_IS_1_1')")
    public String moder_is_1_1SpecialGreadeСourse1Semester2(Model model) {
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        List<SpecialGrade_IS_1_1Course1Semester2> res = specialGradeIs11Course1Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course1Semester2::getUserID));

        List<SpecialGrade_IS_1_1Course1Semester2> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course1Semester2());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

        return "moderatorTemplates-is_1_1/course1/is_1_1-special_grade-course_1-semester_2-moderator";

    }

    //PostMappingSpecialGradeCourse1Semester1
    @PostMapping("/moderator_is_1_1/course_1/semester_2/special_grade")
    public String moder_is_1_1SpecialGreadeСourse1Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String[] splitUser17Grades = user17Grades.replace(",", ",-").split(",");
            String[] splitUser18Grades = user18Grades.replace(",", ",-").split(",");
            String[] splitUser19Grades = user19Grades.replace(",", ",-").split(",");
            String[] splitUser20Grades = user20Grades.replace(",", ",-").split(",");
            String[] splitUser21Grades = user21Grades.replace(",", ",-").split(",");
            String[] splitUser22Grades = user22Grades.replace(",", ",-").split(",");
            String[] splitUser23Grades = user23Grades.replace(",", ",-").split(",");
            String[] splitUser24Grades = user24Grades.replace(",", ",-").split(",");
            String[] splitUser25Grades = user25Grades.replace(",", ",-").split(",");
            String[] splitUser26Grades = user26Grades.replace(",", ",-").split(",");
            String[] splitUser27Grades = user27Grades.replace(",", ",-").split(",");
            String[] splitUser28Grades = user28Grades.replace(",", ",-").split(",");
            String[] splitUser29Grades = user29Grades.replace(",", ",-").split(",");
            String[] splitUser30Grades = user30Grades.replace(",", ",-").split(",");
            String[] splitUser31Grades = user31Grades.replace(",", ",-").split(",");
            String[] splitUser32Grades = user32Grades.replace(",", ",-").split(",");
            String[] splitUser33Grades = user33Grades.replace(",", ",-").split(",");
            String[] splitUser34Grades = user34Grades.replace(",", ",-").split(",");
            String[] splitUser35Grades = user35Grades.replace(",", ",-").split(",");
            String[] splitUser36Grades = user36Grades.replace(",", ",-").split(",");
            String[] splitUser37Grades = user37Grades.replace(",", ",-").split(",");
            String[] splitUser38Grades = user38Grades.replace(",", ",-").split(",");
            String[] splitUser39Grades = user39Grades.replace(",", ",-").split(",");
            String[] splitUser40Grades = user40Grades.replace(",", ",-").split(",");


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
                splitUser17Grades[i] = splitUser17Grades[i].replace("-", "");
                splitUser18Grades[i] = splitUser18Grades[i].replace("-", "");
                splitUser19Grades[i] = splitUser19Grades[i].replace("-", "");
                splitUser20Grades[i] = splitUser20Grades[i].replace("-", "");
                splitUser21Grades[i] = splitUser21Grades[i].replace("-", "");
                splitUser22Grades[i] = splitUser22Grades[i].replace("-", "");
                splitUser23Grades[i] = splitUser23Grades[i].replace("-", "");
                splitUser24Grades[i] = splitUser24Grades[i].replace("-", "");
                splitUser25Grades[i] = splitUser25Grades[i].replace("-", "");
                splitUser26Grades[i] = splitUser26Grades[i].replace("-", "");
                splitUser27Grades[i] = splitUser27Grades[i].replace("-", "");
                splitUser28Grades[i] = splitUser28Grades[i].replace("-", "");
                splitUser29Grades[i] = splitUser29Grades[i].replace("-", "");
                splitUser30Grades[i] = splitUser30Grades[i].replace("-", "");
                splitUser31Grades[i] = splitUser31Grades[i].replace("-", "");
                splitUser32Grades[i] = splitUser32Grades[i].replace("-", "");
                splitUser33Grades[i] = splitUser33Grades[i].replace("-", "");
                splitUser34Grades[i] = splitUser34Grades[i].replace("-", "");
                splitUser35Grades[i] = splitUser35Grades[i].replace("-", "");
                splitUser36Grades[i] = splitUser36Grades[i].replace("-", "");
                splitUser37Grades[i] = splitUser37Grades[i].replace("-", "");
                splitUser38Grades[i] = splitUser38Grades[i].replace("-", "");
                splitUser39Grades[i] = splitUser39Grades[i].replace("-", "");
                splitUser40Grades[i] = splitUser40Grades[i].replace("-", "");

            }

            //user1Grade
            int user1Id = Integer.parseInt(splitUser1Grades[0]);
            String user1Username = splitUser1Grades[1];
            String user1DifOffsetLiterature = splitUser1Grades[2];
            String user1DifOffsetEnglishLanguage = splitUser1Grades[3];
            String user1DifOffsetPhysics = splitUser1Grades[4];
            String user1DifOffsetChemistry = splitUser1Grades[5];
            String user1DifOffsetStory = splitUser1Grades[6];
            String user1DifOffsetSocialScience = splitUser1Grades[7];
            String user1DifOffsetPhysicalTraining = splitUser1Grades[8];
            String user1DifOffsetSecurityBasics = splitUser1Grades[9];
            String user1DifOffsetNativeLiterature = splitUser1Grades[10];
            String user1ExamRussianLanguage = splitUser1Grades[11];
            String user1ExamMathematics = splitUser1Grades[12];
            String user1ExamInformatics = splitUser1Grades[13];
            String user1IndividualProject = splitUser1Grades[14];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetLiterature = splitUser2Grades[2];
            String user2DifOffsetEnglishLanguage = splitUser2Grades[3];
            String user2DifOffsetPhysics = splitUser2Grades[4];
            String user2DifOffsetChemistry = splitUser2Grades[5];
            String user2DifOffsetStory = splitUser2Grades[6];
            String user2DifOffsetSocialScience = splitUser2Grades[7];
            String user2DifOffsetPhysicalTraining = splitUser2Grades[8];
            String user2DifOffsetSecurityBasics = splitUser2Grades[9];
            String user2DifOffsetNativeLiterature = splitUser2Grades[10];
            String user2ExamRussianLanguage = splitUser2Grades[11];
            String user2ExamMathematics = splitUser2Grades[12];
            String user2ExamInformatics = splitUser2Grades[13];
            String user2IndividualProject = splitUser2Grades[14];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetLiterature = splitUser3Grades[2];
            String user3DifOffsetEnglishLanguage = splitUser3Grades[3];
            String user3DifOffsetPhysics = splitUser3Grades[4];
            String user3DifOffsetChemistry = splitUser3Grades[5];
            String user3DifOffsetStory = splitUser3Grades[6];
            String user3DifOffsetSocialScience = splitUser3Grades[7];
            String user3DifOffsetPhysicalTraining = splitUser3Grades[8];
            String user3DifOffsetSecurityBasics = splitUser3Grades[9];
            String user3DifOffsetNativeLiterature = splitUser3Grades[10];
            String user3ExamRussianLanguage = splitUser3Grades[11];
            String user3ExamMathematics = splitUser3Grades[12];
            String user3ExamInformatics = splitUser3Grades[13];
            String user3IndividualProject = splitUser3Grades[14];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetLiterature = splitUser4Grades[2];
            String user4DifOffsetEnglishLanguage = splitUser4Grades[3];
            String user4DifOffsetPhysics = splitUser4Grades[4];
            String user4DifOffsetChemistry = splitUser4Grades[5];
            String user4DifOffsetStory = splitUser4Grades[6];
            String user4DifOffsetSocialScience = splitUser4Grades[7];
            String user4DifOffsetPhysicalTraining = splitUser4Grades[8];
            String user4DifOffsetSecurityBasics = splitUser4Grades[9];
            String user4DifOffsetNativeLiterature = splitUser4Grades[10];
            String user4ExamRussianLanguage = splitUser4Grades[11];
            String user4ExamMathematics = splitUser4Grades[12];
            String user4ExamInformatics = splitUser4Grades[13];
            String user4IndividualProject = splitUser4Grades[14];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetLiterature = splitUser5Grades[2];
            String user5DifOffsetEnglishLanguage = splitUser5Grades[3];
            String user5DifOffsetPhysics = splitUser5Grades[4];
            String user5DifOffsetChemistry = splitUser5Grades[5];
            String user5DifOffsetStory = splitUser5Grades[6];
            String user5DifOffsetSocialScience = splitUser5Grades[7];
            String user5DifOffsetPhysicalTraining = splitUser5Grades[8];
            String user5DifOffsetSecurityBasics = splitUser5Grades[9];
            String user5DifOffsetNativeLiterature = splitUser5Grades[10];
            String user5ExamRussianLanguage = splitUser5Grades[11];
            String user5ExamMathematics = splitUser5Grades[12];
            String user5ExamInformatics = splitUser5Grades[13];
            String user5IndividualProject = splitUser5Grades[14];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetLiterature = splitUser6Grades[2];
            String user6DifOffsetEnglishLanguage = splitUser6Grades[3];
            String user6DifOffsetPhysics = splitUser6Grades[4];
            String user6DifOffsetChemistry = splitUser6Grades[5];
            String user6DifOffsetStory = splitUser6Grades[6];
            String user6DifOffsetSocialScience = splitUser6Grades[7];
            String user6DifOffsetPhysicalTraining = splitUser6Grades[8];
            String user6DifOffsetSecurityBasics = splitUser6Grades[9];
            String user6DifOffsetNativeLiterature = splitUser6Grades[10];
            String user6ExamRussianLanguage = splitUser6Grades[11];
            String user6ExamMathematics = splitUser6Grades[12];
            String user6ExamInformatics = splitUser6Grades[13];
            String user6IndividualProject = splitUser6Grades[14];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetLiterature = splitUser7Grades[2];
            String user7DifOffsetEnglishLanguage = splitUser7Grades[3];
            String user7DifOffsetPhysics = splitUser7Grades[4];
            String user7DifOffsetChemistry = splitUser7Grades[5];
            String user7DifOffsetStory = splitUser7Grades[6];
            String user7DifOffsetSocialScience = splitUser7Grades[7];
            String user7DifOffsetPhysicalTraining = splitUser7Grades[8];
            String user7DifOffsetSecurityBasics = splitUser7Grades[9];
            String user7DifOffsetNativeLiterature = splitUser7Grades[10];
            String user7ExamRussianLanguage = splitUser7Grades[11];
            String user7ExamMathematics = splitUser7Grades[12];
            String user7ExamInformatics = splitUser7Grades[13];
            String user7IndividualProject = splitUser7Grades[14];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetLiterature = splitUser8Grades[2];
            String user8DifOffsetEnglishLanguage = splitUser8Grades[3];
            String user8DifOffsetPhysics = splitUser8Grades[4];
            String user8DifOffsetChemistry = splitUser8Grades[5];
            String user8DifOffsetStory = splitUser8Grades[6];
            String user8DifOffsetSocialScience = splitUser8Grades[7];
            String user8DifOffsetPhysicalTraining = splitUser8Grades[8];
            String user8DifOffsetSecurityBasics = splitUser8Grades[9];
            String user8DifOffsetNativeLiterature = splitUser8Grades[10];
            String user8ExamRussianLanguage = splitUser8Grades[11];
            String user8ExamMathematics = splitUser8Grades[12];
            String user8ExamInformatics = splitUser8Grades[13];
            String user8IndividualProject = splitUser8Grades[14];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetLiterature = splitUser9Grades[2];
            String user9DifOffsetEnglishLanguage = splitUser9Grades[3];
            String user9DifOffsetPhysics = splitUser9Grades[4];
            String user9DifOffsetChemistry = splitUser9Grades[5];
            String user9DifOffsetStory = splitUser9Grades[6];
            String user9DifOffsetSocialScience = splitUser9Grades[7];
            String user9DifOffsetPhysicalTraining = splitUser9Grades[8];
            String user9DifOffsetSecurityBasics = splitUser9Grades[9];
            String user9DifOffsetNativeLiterature = splitUser9Grades[10];
            String user9ExamRussianLanguage = splitUser9Grades[11];
            String user9ExamMathematics = splitUser9Grades[12];
            String user9ExamInformatics = splitUser9Grades[13];
            String user9IndividualProject = splitUser9Grades[14];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetLiterature = splitUser10Grades[2];
            String user10DifOffsetEnglishLanguage = splitUser10Grades[3];
            String user10DifOffsetPhysics = splitUser10Grades[4];
            String user10DifOffsetChemistry = splitUser10Grades[5];
            String user10DifOffsetStory = splitUser10Grades[6];
            String user10DifOffsetSocialScience = splitUser10Grades[7];
            String user10DifOffsetPhysicalTraining = splitUser10Grades[8];
            String user10DifOffsetSecurityBasics = splitUser10Grades[9];
            String user10DifOffsetNativeLiterature = splitUser10Grades[10];
            String user10ExamRussianLanguage = splitUser10Grades[11];
            String user10ExamMathematics = splitUser10Grades[12];
            String user10ExamInformatics = splitUser10Grades[13];
            String user10IndividualProject = splitUser10Grades[14];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetLiterature = splitUser11Grades[2];
            String user11DifOffsetEnglishLanguage = splitUser11Grades[3];
            String user11DifOffsetPhysics = splitUser11Grades[4];
            String user11DifOffsetChemistry = splitUser11Grades[5];
            String user11DifOffsetStory = splitUser11Grades[6];
            String user11DifOffsetSocialScience = splitUser11Grades[7];
            String user11DifOffsetPhysicalTraining = splitUser11Grades[8];
            String user11DifOffsetSecurityBasics = splitUser11Grades[9];
            String user11DifOffsetNativeLiterature = splitUser11Grades[10];
            String user11ExamRussianLanguage = splitUser11Grades[11];
            String user11ExamMathematics = splitUser11Grades[12];
            String user11ExamInformatics = splitUser11Grades[13];
            String user11IndividualProject = splitUser11Grades[14];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetLiterature = splitUser12Grades[2];
            String user12DifOffsetEnglishLanguage = splitUser12Grades[3];
            String user12DifOffsetPhysics = splitUser12Grades[4];
            String user12DifOffsetChemistry = splitUser12Grades[5];
            String user12DifOffsetStory = splitUser12Grades[6];
            String user12DifOffsetSocialScience = splitUser12Grades[7];
            String user12DifOffsetPhysicalTraining = splitUser12Grades[8];
            String user12DifOffsetSecurityBasics = splitUser12Grades[9];
            String user12DifOffsetNativeLiterature = splitUser12Grades[10];
            String user12ExamRussianLanguage = splitUser12Grades[11];
            String user12ExamMathematics = splitUser12Grades[12];
            String user12ExamInformatics = splitUser12Grades[13];
            String user12IndividualProject = splitUser12Grades[14];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetLiterature = splitUser13Grades[2];
            String user13DifOffsetEnglishLanguage = splitUser13Grades[3];
            String user13DifOffsetPhysics = splitUser13Grades[4];
            String user13DifOffsetChemistry = splitUser13Grades[5];
            String user13DifOffsetStory = splitUser13Grades[6];
            String user13DifOffsetSocialScience = splitUser13Grades[7];
            String user13DifOffsetPhysicalTraining = splitUser13Grades[8];
            String user13DifOffsetSecurityBasics = splitUser13Grades[9];
            String user13DifOffsetNativeLiterature = splitUser13Grades[10];
            String user13ExamRussianLanguage = splitUser13Grades[11];
            String user13ExamMathematics = splitUser13Grades[12];
            String user13ExamInformatics = splitUser13Grades[13];
            String user13IndividualProject = splitUser13Grades[14];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetLiterature = splitUser14Grades[2];
            String user14DifOffsetEnglishLanguage = splitUser14Grades[3];
            String user14DifOffsetPhysics = splitUser14Grades[4];
            String user14DifOffsetChemistry = splitUser14Grades[5];
            String user14DifOffsetStory = splitUser14Grades[6];
            String user14DifOffsetSocialScience = splitUser14Grades[7];
            String user14DifOffsetPhysicalTraining = splitUser14Grades[8];
            String user14DifOffsetSecurityBasics = splitUser14Grades[9];
            String user14DifOffsetNativeLiterature = splitUser14Grades[10];
            String user14ExamRussianLanguage = splitUser14Grades[11];
            String user14ExamMathematics = splitUser14Grades[12];
            String user14ExamInformatics = splitUser14Grades[13];
            String user14IndividualProject = splitUser14Grades[14];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetLiterature = splitUser15Grades[2];
            String user15DifOffsetEnglishLanguage = splitUser15Grades[3];
            String user15DifOffsetPhysics = splitUser15Grades[4];
            String user15DifOffsetChemistry = splitUser15Grades[5];
            String user15DifOffsetStory = splitUser15Grades[6];
            String user15DifOffsetSocialScience = splitUser15Grades[7];
            String user15DifOffsetPhysicalTraining = splitUser15Grades[8];
            String user15DifOffsetSecurityBasics = splitUser15Grades[9];
            String user15DifOffsetNativeLiterature = splitUser15Grades[10];
            String user15ExamRussianLanguage = splitUser15Grades[11];
            String user15ExamMathematics = splitUser15Grades[12];
            String user15ExamInformatics = splitUser15Grades[13];
            String user15IndividualProject = splitUser15Grades[14];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetLiterature = splitUser16Grades[2];
            String user16DifOffsetEnglishLanguage = splitUser16Grades[3];
            String user16DifOffsetPhysics = splitUser16Grades[4];
            String user16DifOffsetChemistry = splitUser16Grades[5];
            String user16DifOffsetStory = splitUser16Grades[6];
            String user16DifOffsetSocialScience = splitUser16Grades[7];
            String user16DifOffsetPhysicalTraining = splitUser16Grades[8];
            String user16DifOffsetSecurityBasics = splitUser16Grades[9];
            String user16DifOffsetNativeLiterature = splitUser16Grades[10];
            String user16ExamRussianLanguage = splitUser16Grades[11];
            String user16ExamMathematics = splitUser16Grades[12];
            String user16ExamInformatics = splitUser16Grades[13];
            String user16IndividualProject = splitUser16Grades[14];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetLiterature = splitUser17Grades[2];
            String user17DifOffsetEnglishLanguage = splitUser17Grades[3];
            String user17DifOffsetPhysics = splitUser17Grades[4];
            String user17DifOffsetChemistry = splitUser17Grades[5];
            String user17DifOffsetStory = splitUser17Grades[6];
            String user17DifOffsetSocialScience = splitUser17Grades[7];
            String user17DifOffsetPhysicalTraining = splitUser17Grades[8];
            String user17DifOffsetSecurityBasics = splitUser17Grades[9];
            String user17DifOffsetNativeLiterature = splitUser17Grades[10];
            String user17ExamRussianLanguage = splitUser17Grades[11];
            String user17ExamMathematics = splitUser17Grades[12];
            String user17ExamInformatics = splitUser17Grades[13];
            String user17IndividualProject = splitUser17Grades[14];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetLiterature = splitUser18Grades[2];
            String user18DifOffsetEnglishLanguage = splitUser18Grades[3];
            String user18DifOffsetPhysics = splitUser18Grades[4];
            String user18DifOffsetChemistry = splitUser18Grades[5];
            String user18DifOffsetStory = splitUser18Grades[6];
            String user18DifOffsetSocialScience = splitUser18Grades[7];
            String user18DifOffsetPhysicalTraining = splitUser18Grades[8];
            String user18DifOffsetSecurityBasics = splitUser18Grades[9];
            String user18DifOffsetNativeLiterature = splitUser18Grades[10];
            String user18ExamRussianLanguage = splitUser18Grades[11];
            String user18ExamMathematics = splitUser18Grades[12];
            String user18ExamInformatics = splitUser18Grades[13];
            String user18IndividualProject = splitUser18Grades[14];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetLiterature = splitUser19Grades[2];
            String user19DifOffsetEnglishLanguage = splitUser19Grades[3];
            String user19DifOffsetPhysics = splitUser19Grades[4];
            String user19DifOffsetChemistry = splitUser19Grades[5];
            String user19DifOffsetStory = splitUser19Grades[6];
            String user19DifOffsetSocialScience = splitUser19Grades[7];
            String user19DifOffsetPhysicalTraining = splitUser19Grades[8];
            String user19DifOffsetSecurityBasics = splitUser19Grades[9];
            String user19DifOffsetNativeLiterature = splitUser19Grades[10];
            String user19ExamRussianLanguage = splitUser19Grades[11];
            String user19ExamMathematics = splitUser19Grades[12];
            String user19ExamInformatics = splitUser19Grades[13];
            String user19IndividualProject = splitUser19Grades[14];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetLiterature = splitUser20Grades[2];
            String user20DifOffsetEnglishLanguage = splitUser20Grades[3];
            String user20DifOffsetPhysics = splitUser20Grades[4];
            String user20DifOffsetChemistry = splitUser20Grades[5];
            String user20DifOffsetStory = splitUser20Grades[6];
            String user20DifOffsetSocialScience = splitUser20Grades[7];
            String user20DifOffsetPhysicalTraining = splitUser20Grades[8];
            String user20DifOffsetSecurityBasics = splitUser20Grades[9];
            String user20DifOffsetNativeLiterature = splitUser20Grades[10];
            String user20ExamRussianLanguage = splitUser20Grades[11];
            String user20ExamMathematics = splitUser20Grades[12];
            String user20ExamInformatics = splitUser20Grades[13];
            String user20IndividualProject = splitUser20Grades[14];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetLiterature = splitUser21Grades[2];
            String user21DifOffsetEnglishLanguage = splitUser21Grades[3];
            String user21DifOffsetPhysics = splitUser21Grades[4];
            String user21DifOffsetChemistry = splitUser21Grades[5];
            String user21DifOffsetStory = splitUser21Grades[6];
            String user21DifOffsetSocialScience = splitUser21Grades[7];
            String user21DifOffsetPhysicalTraining = splitUser21Grades[8];
            String user21DifOffsetSecurityBasics = splitUser21Grades[9];
            String user21DifOffsetNativeLiterature = splitUser21Grades[10];
            String user21ExamRussianLanguage = splitUser21Grades[11];
            String user21ExamMathematics = splitUser21Grades[12];
            String user21ExamInformatics = splitUser21Grades[13];
            String user21IndividualProject = splitUser21Grades[14];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetLiterature = splitUser22Grades[2];
            String user22DifOffsetEnglishLanguage = splitUser22Grades[3];
            String user22DifOffsetPhysics = splitUser22Grades[4];
            String user22DifOffsetChemistry = splitUser22Grades[5];
            String user22DifOffsetStory = splitUser22Grades[6];
            String user22DifOffsetSocialScience = splitUser22Grades[7];
            String user22DifOffsetPhysicalTraining = splitUser22Grades[8];
            String user22DifOffsetSecurityBasics = splitUser22Grades[9];
            String user22DifOffsetNativeLiterature = splitUser22Grades[10];
            String user22ExamRussianLanguage = splitUser22Grades[11];
            String user22ExamMathematics = splitUser22Grades[12];
            String user22ExamInformatics = splitUser22Grades[13];
            String user22IndividualProject = splitUser22Grades[14];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetLiterature = splitUser23Grades[2];
            String user23DifOffsetEnglishLanguage = splitUser23Grades[3];
            String user23DifOffsetPhysics = splitUser23Grades[4];
            String user23DifOffsetChemistry = splitUser23Grades[5];
            String user23DifOffsetStory = splitUser23Grades[6];
            String user23DifOffsetSocialScience = splitUser23Grades[7];
            String user23DifOffsetPhysicalTraining = splitUser23Grades[8];
            String user23DifOffsetSecurityBasics = splitUser23Grades[9];
            String user23DifOffsetNativeLiterature = splitUser23Grades[10];
            String user23ExamRussianLanguage = splitUser23Grades[11];
            String user23ExamMathematics = splitUser23Grades[12];
            String user23ExamInformatics = splitUser23Grades[13];
            String user23IndividualProject = splitUser23Grades[14];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetLiterature = splitUser24Grades[2];
            String user24DifOffsetEnglishLanguage = splitUser24Grades[3];
            String user24DifOffsetPhysics = splitUser24Grades[4];
            String user24DifOffsetChemistry = splitUser24Grades[5];
            String user24DifOffsetStory = splitUser24Grades[6];
            String user24DifOffsetSocialScience = splitUser24Grades[7];
            String user24DifOffsetPhysicalTraining = splitUser24Grades[8];
            String user24DifOffsetSecurityBasics = splitUser24Grades[9];
            String user24DifOffsetNativeLiterature = splitUser24Grades[10];
            String user24ExamRussianLanguage = splitUser24Grades[11];
            String user24ExamMathematics = splitUser24Grades[12];
            String user24ExamInformatics = splitUser24Grades[13];
            String user24IndividualProject = splitUser24Grades[14];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetLiterature = splitUser25Grades[2];
            String user25DifOffsetEnglishLanguage = splitUser25Grades[3];
            String user25DifOffsetPhysics = splitUser25Grades[4];
            String user25DifOffsetChemistry = splitUser25Grades[5];
            String user25DifOffsetStory = splitUser25Grades[6];
            String user25DifOffsetSocialScience = splitUser25Grades[7];
            String user25DifOffsetPhysicalTraining = splitUser25Grades[8];
            String user25DifOffsetSecurityBasics = splitUser25Grades[9];
            String user25DifOffsetNativeLiterature = splitUser25Grades[10];
            String user25ExamRussianLanguage = splitUser25Grades[11];
            String user25ExamMathematics = splitUser25Grades[12];
            String user25ExamInformatics = splitUser25Grades[13];
            String user25IndividualProject = splitUser25Grades[14];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetLiterature = splitUser26Grades[2];
            String user26DifOffsetEnglishLanguage = splitUser26Grades[3];
            String user26DifOffsetPhysics = splitUser26Grades[4];
            String user26DifOffsetChemistry = splitUser26Grades[5];
            String user26DifOffsetStory = splitUser26Grades[6];
            String user26DifOffsetSocialScience = splitUser26Grades[7];
            String user26DifOffsetPhysicalTraining = splitUser26Grades[8];
            String user26DifOffsetSecurityBasics = splitUser26Grades[9];
            String user26DifOffsetNativeLiterature = splitUser26Grades[10];
            String user26ExamRussianLanguage = splitUser26Grades[11];
            String user26ExamMathematics = splitUser26Grades[12];
            String user26ExamInformatics = splitUser26Grades[13];
            String user26IndividualProject = splitUser26Grades[14];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetLiterature = splitUser27Grades[2];
            String user27DifOffsetEnglishLanguage = splitUser27Grades[3];
            String user27DifOffsetPhysics = splitUser27Grades[4];
            String user27DifOffsetChemistry = splitUser27Grades[5];
            String user27DifOffsetStory = splitUser27Grades[6];
            String user27DifOffsetSocialScience = splitUser27Grades[7];
            String user27DifOffsetPhysicalTraining = splitUser27Grades[8];
            String user27DifOffsetSecurityBasics = splitUser27Grades[9];
            String user27DifOffsetNativeLiterature = splitUser27Grades[10];
            String user27ExamRussianLanguage = splitUser27Grades[11];
            String user27ExamMathematics = splitUser27Grades[12];
            String user27ExamInformatics = splitUser27Grades[13];
            String user27IndividualProject = splitUser27Grades[14];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetLiterature = splitUser28Grades[2];
            String user28DifOffsetEnglishLanguage = splitUser28Grades[3];
            String user28DifOffsetPhysics = splitUser28Grades[4];
            String user28DifOffsetChemistry = splitUser28Grades[5];
            String user28DifOffsetStory = splitUser28Grades[6];
            String user28DifOffsetSocialScience = splitUser28Grades[7];
            String user28DifOffsetPhysicalTraining = splitUser28Grades[8];
            String user28DifOffsetSecurityBasics = splitUser28Grades[9];
            String user28DifOffsetNativeLiterature = splitUser28Grades[10];
            String user28ExamRussianLanguage = splitUser28Grades[11];
            String user28ExamMathematics = splitUser28Grades[12];
            String user28ExamInformatics = splitUser28Grades[13];
            String user28IndividualProject = splitUser28Grades[14];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetLiterature = splitUser29Grades[2];
            String user29DifOffsetEnglishLanguage = splitUser29Grades[3];
            String user29DifOffsetPhysics = splitUser29Grades[4];
            String user29DifOffsetChemistry = splitUser29Grades[5];
            String user29DifOffsetStory = splitUser29Grades[6];
            String user29DifOffsetSocialScience = splitUser29Grades[7];
            String user29DifOffsetPhysicalTraining = splitUser29Grades[8];
            String user29DifOffsetSecurityBasics = splitUser29Grades[9];
            String user29DifOffsetNativeLiterature = splitUser29Grades[10];
            String user29ExamRussianLanguage = splitUser29Grades[11];
            String user29ExamMathematics = splitUser29Grades[12];
            String user29ExamInformatics = splitUser29Grades[13];
            String user29IndividualProject = splitUser29Grades[14];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetLiterature = splitUser30Grades[2];
            String user30DifOffsetEnglishLanguage = splitUser30Grades[3];
            String user30DifOffsetPhysics = splitUser30Grades[4];
            String user30DifOffsetChemistry = splitUser30Grades[5];
            String user30DifOffsetStory = splitUser30Grades[6];
            String user30DifOffsetSocialScience = splitUser30Grades[7];
            String user30DifOffsetPhysicalTraining = splitUser30Grades[8];
            String user30DifOffsetSecurityBasics = splitUser30Grades[9];
            String user30DifOffsetNativeLiterature = splitUser30Grades[10];
            String user30ExamRussianLanguage = splitUser30Grades[11];
            String user30ExamMathematics = splitUser30Grades[12];
            String user30ExamInformatics = splitUser30Grades[13];
            String user30IndividualProject = splitUser30Grades[14];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetLiterature = splitUser31Grades[2];
            String user31DifOffsetEnglishLanguage = splitUser31Grades[3];
            String user31DifOffsetPhysics = splitUser31Grades[4];
            String user31DifOffsetChemistry = splitUser31Grades[5];
            String user31DifOffsetStory = splitUser31Grades[6];
            String user31DifOffsetSocialScience = splitUser31Grades[7];
            String user31DifOffsetPhysicalTraining = splitUser31Grades[8];
            String user31DifOffsetSecurityBasics = splitUser31Grades[9];
            String user31DifOffsetNativeLiterature = splitUser31Grades[10];
            String user31ExamRussianLanguage = splitUser31Grades[11];
            String user31ExamMathematics = splitUser31Grades[12];
            String user31ExamInformatics = splitUser31Grades[13];
            String user31IndividualProject = splitUser31Grades[14];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetLiterature = splitUser32Grades[2];
            String user32DifOffsetEnglishLanguage = splitUser32Grades[3];
            String user32DifOffsetPhysics = splitUser32Grades[4];
            String user32DifOffsetChemistry = splitUser32Grades[5];
            String user32DifOffsetStory = splitUser32Grades[6];
            String user32DifOffsetSocialScience = splitUser32Grades[7];
            String user32DifOffsetPhysicalTraining = splitUser32Grades[8];
            String user32DifOffsetSecurityBasics = splitUser32Grades[9];
            String user32DifOffsetNativeLiterature = splitUser32Grades[10];
            String user32ExamRussianLanguage = splitUser32Grades[11];
            String user32ExamMathematics = splitUser32Grades[12];
            String user32ExamInformatics = splitUser32Grades[13];
            String user32IndividualProject = splitUser32Grades[14];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetLiterature = splitUser33Grades[2];
            String user33DifOffsetEnglishLanguage = splitUser33Grades[3];
            String user33DifOffsetPhysics = splitUser33Grades[4];
            String user33DifOffsetChemistry = splitUser33Grades[5];
            String user33DifOffsetStory = splitUser33Grades[6];
            String user33DifOffsetSocialScience = splitUser33Grades[7];
            String user33DifOffsetPhysicalTraining = splitUser33Grades[8];
            String user33DifOffsetSecurityBasics = splitUser33Grades[9];
            String user33DifOffsetNativeLiterature = splitUser33Grades[10];
            String user33ExamRussianLanguage = splitUser33Grades[11];
            String user33ExamMathematics = splitUser33Grades[12];
            String user33ExamInformatics = splitUser33Grades[13];
            String user33IndividualProject = splitUser33Grades[14];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetLiterature = splitUser34Grades[2];
            String user34DifOffsetEnglishLanguage = splitUser34Grades[3];
            String user34DifOffsetPhysics = splitUser34Grades[4];
            String user34DifOffsetChemistry = splitUser34Grades[5];
            String user34DifOffsetStory = splitUser34Grades[6];
            String user34DifOffsetSocialScience = splitUser34Grades[7];
            String user34DifOffsetPhysicalTraining = splitUser34Grades[8];
            String user34DifOffsetSecurityBasics = splitUser34Grades[9];
            String user34DifOffsetNativeLiterature = splitUser34Grades[10];
            String user34ExamRussianLanguage = splitUser34Grades[11];
            String user34ExamMathematics = splitUser34Grades[12];
            String user34ExamInformatics = splitUser34Grades[13];
            String user34IndividualProject = splitUser34Grades[14];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetLiterature = splitUser35Grades[2];
            String user35DifOffsetEnglishLanguage = splitUser35Grades[3];
            String user35DifOffsetPhysics = splitUser35Grades[4];
            String user35DifOffsetChemistry = splitUser35Grades[5];
            String user35DifOffsetStory = splitUser35Grades[6];
            String user35DifOffsetSocialScience = splitUser35Grades[7];
            String user35DifOffsetPhysicalTraining = splitUser35Grades[8];
            String user35DifOffsetSecurityBasics = splitUser35Grades[9];
            String user35DifOffsetNativeLiterature = splitUser35Grades[10];
            String user35ExamRussianLanguage = splitUser35Grades[11];
            String user35ExamMathematics = splitUser35Grades[12];
            String user35ExamInformatics = splitUser35Grades[13];
            String user35IndividualProject = splitUser35Grades[14];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetLiterature = splitUser36Grades[2];
            String user36DifOffsetEnglishLanguage = splitUser36Grades[3];
            String user36DifOffsetPhysics = splitUser36Grades[4];
            String user36DifOffsetChemistry = splitUser36Grades[5];
            String user36DifOffsetStory = splitUser36Grades[6];
            String user36DifOffsetSocialScience = splitUser36Grades[7];
            String user36DifOffsetPhysicalTraining = splitUser36Grades[8];
            String user36DifOffsetSecurityBasics = splitUser36Grades[9];
            String user36DifOffsetNativeLiterature = splitUser36Grades[10];
            String user36ExamRussianLanguage = splitUser36Grades[11];
            String user36ExamMathematics = splitUser36Grades[12];
            String user36ExamInformatics = splitUser36Grades[13];
            String user36IndividualProject = splitUser36Grades[14];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetLiterature = splitUser37Grades[2];
            String user37DifOffsetEnglishLanguage = splitUser37Grades[3];
            String user37DifOffsetPhysics = splitUser37Grades[4];
            String user37DifOffsetChemistry = splitUser37Grades[5];
            String user37DifOffsetStory = splitUser37Grades[6];
            String user37DifOffsetSocialScience = splitUser37Grades[7];
            String user37DifOffsetPhysicalTraining = splitUser37Grades[8];
            String user37DifOffsetSecurityBasics = splitUser37Grades[9];
            String user37DifOffsetNativeLiterature = splitUser37Grades[10];
            String user37ExamRussianLanguage = splitUser37Grades[11];
            String user37ExamMathematics = splitUser37Grades[12];
            String user37ExamInformatics = splitUser37Grades[13];
            String user37IndividualProject = splitUser37Grades[14];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetLiterature = splitUser38Grades[2];
            String user38DifOffsetEnglishLanguage = splitUser38Grades[3];
            String user38DifOffsetPhysics = splitUser38Grades[4];
            String user38DifOffsetChemistry = splitUser38Grades[5];
            String user38DifOffsetStory = splitUser38Grades[6];
            String user38DifOffsetSocialScience = splitUser38Grades[7];
            String user38DifOffsetPhysicalTraining = splitUser38Grades[8];
            String user38DifOffsetSecurityBasics = splitUser38Grades[9];
            String user38DifOffsetNativeLiterature = splitUser38Grades[10];
            String user38ExamRussianLanguage = splitUser38Grades[11];
            String user38ExamMathematics = splitUser38Grades[12];
            String user38ExamInformatics = splitUser38Grades[13];
            String user38IndividualProject = splitUser38Grades[14];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetLiterature = splitUser39Grades[2];
            String user39DifOffsetEnglishLanguage = splitUser39Grades[3];
            String user39DifOffsetPhysics = splitUser39Grades[4];
            String user39DifOffsetChemistry = splitUser39Grades[5];
            String user39DifOffsetStory = splitUser39Grades[6];
            String user39DifOffsetSocialScience = splitUser39Grades[7];
            String user39DifOffsetPhysicalTraining = splitUser39Grades[8];
            String user39DifOffsetSecurityBasics = splitUser39Grades[9];
            String user39DifOffsetNativeLiterature = splitUser39Grades[10];
            String user39ExamRussianLanguage = splitUser39Grades[11];
            String user39ExamMathematics = splitUser39Grades[12];
            String user39ExamInformatics = splitUser39Grades[13];
            String user39IndividualProject = splitUser39Grades[14];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetLiterature = splitUser40Grades[2];
            String user40DifOffsetEnglishLanguage = splitUser40Grades[3];
            String user40DifOffsetPhysics = splitUser40Grades[4];
            String user40DifOffsetChemistry = splitUser40Grades[5];
            String user40DifOffsetStory = splitUser40Grades[6];
            String user40DifOffsetSocialScience = splitUser40Grades[7];
            String user40DifOffsetPhysicalTraining = splitUser40Grades[8];
            String user40DifOffsetSecurityBasics = splitUser40Grades[9];
            String user40DifOffsetNativeLiterature = splitUser40Grades[10];
            String user40ExamRussianLanguage = splitUser40Grades[11];
            String user40ExamMathematics = splitUser40Grades[12];
            String user40ExamInformatics = splitUser40Grades[13];
            String user40IndividualProject = splitUser40Grades[14];

            ArrayList<SpecialGrade_IS_1_1Course1Semester2> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user1Id, user1Username, user1DifOffsetLiterature, user1DifOffsetEnglishLanguage, user1DifOffsetPhysics, user1DifOffsetChemistry, user1DifOffsetStory, user1DifOffsetSocialScience, user1DifOffsetPhysicalTraining, user1DifOffsetSecurityBasics, user1DifOffsetNativeLiterature, user1ExamRussianLanguage, user1ExamMathematics, user1ExamInformatics, user1IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user2Id, user2Username, user2DifOffsetLiterature, user2DifOffsetEnglishLanguage, user2DifOffsetPhysics, user2DifOffsetChemistry, user2DifOffsetStory, user2DifOffsetSocialScience, user2DifOffsetPhysicalTraining, user2DifOffsetSecurityBasics, user2DifOffsetNativeLiterature, user2ExamRussianLanguage, user2ExamMathematics, user2ExamInformatics, user2IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user3Id, user3Username, user3DifOffsetLiterature, user3DifOffsetEnglishLanguage, user3DifOffsetPhysics, user3DifOffsetChemistry, user3DifOffsetStory, user3DifOffsetSocialScience, user3DifOffsetPhysicalTraining, user3DifOffsetSecurityBasics, user3DifOffsetNativeLiterature, user3ExamRussianLanguage, user3ExamMathematics, user3ExamInformatics, user3IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user4Id, user4Username, user4DifOffsetLiterature, user4DifOffsetEnglishLanguage, user4DifOffsetPhysics, user4DifOffsetChemistry, user4DifOffsetStory, user4DifOffsetSocialScience, user4DifOffsetPhysicalTraining, user4DifOffsetSecurityBasics, user4DifOffsetNativeLiterature, user4ExamRussianLanguage, user4ExamMathematics, user4ExamInformatics, user4IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user5Id, user5Username, user5DifOffsetLiterature, user5DifOffsetEnglishLanguage, user5DifOffsetPhysics, user5DifOffsetChemistry, user5DifOffsetStory, user5DifOffsetSocialScience, user5DifOffsetPhysicalTraining, user5DifOffsetSecurityBasics, user5DifOffsetNativeLiterature, user5ExamRussianLanguage, user5ExamMathematics, user5ExamInformatics, user5IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user6Id, user6Username, user6DifOffsetLiterature, user6DifOffsetEnglishLanguage, user6DifOffsetPhysics, user6DifOffsetChemistry, user6DifOffsetStory, user6DifOffsetSocialScience, user6DifOffsetPhysicalTraining, user6DifOffsetSecurityBasics, user6DifOffsetNativeLiterature, user6ExamRussianLanguage, user6ExamMathematics, user6ExamInformatics, user6IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user7Id, user7Username, user7DifOffsetLiterature, user7DifOffsetEnglishLanguage, user7DifOffsetPhysics, user7DifOffsetChemistry, user7DifOffsetStory, user7DifOffsetSocialScience, user7DifOffsetPhysicalTraining, user7DifOffsetSecurityBasics, user7DifOffsetNativeLiterature, user7ExamRussianLanguage, user7ExamMathematics, user7ExamInformatics, user7IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user8Id, user8Username, user8DifOffsetLiterature, user8DifOffsetEnglishLanguage, user8DifOffsetPhysics, user8DifOffsetChemistry, user8DifOffsetStory, user8DifOffsetSocialScience, user8DifOffsetPhysicalTraining, user8DifOffsetSecurityBasics, user8DifOffsetNativeLiterature, user8ExamRussianLanguage, user8ExamMathematics, user8ExamInformatics, user8IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user9Id, user9Username, user9DifOffsetLiterature, user9DifOffsetEnglishLanguage, user9DifOffsetPhysics, user9DifOffsetChemistry, user9DifOffsetStory, user9DifOffsetSocialScience, user9DifOffsetPhysicalTraining, user9DifOffsetSecurityBasics, user9DifOffsetNativeLiterature, user9ExamRussianLanguage, user9ExamMathematics, user9ExamInformatics, user9IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user10Id, user10Username, user10DifOffsetLiterature, user10DifOffsetEnglishLanguage, user10DifOffsetPhysics, user10DifOffsetChemistry, user10DifOffsetStory, user10DifOffsetSocialScience, user10DifOffsetPhysicalTraining, user10DifOffsetSecurityBasics, user10DifOffsetNativeLiterature, user10ExamRussianLanguage, user10ExamMathematics, user10ExamInformatics, user10IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user11Id, user11Username, user11DifOffsetLiterature, user11DifOffsetEnglishLanguage, user11DifOffsetPhysics, user11DifOffsetChemistry, user11DifOffsetStory, user11DifOffsetSocialScience, user11DifOffsetPhysicalTraining, user11DifOffsetSecurityBasics, user11DifOffsetNativeLiterature, user11ExamRussianLanguage, user11ExamMathematics, user11ExamInformatics, user11IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user12Id, user12Username, user12DifOffsetLiterature, user12DifOffsetEnglishLanguage, user12DifOffsetPhysics, user12DifOffsetChemistry, user12DifOffsetStory, user12DifOffsetSocialScience, user12DifOffsetPhysicalTraining, user12DifOffsetSecurityBasics, user12DifOffsetNativeLiterature, user12ExamRussianLanguage, user12ExamMathematics, user12ExamInformatics, user12IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user13Id, user13Username, user13DifOffsetLiterature, user13DifOffsetEnglishLanguage, user13DifOffsetPhysics, user13DifOffsetChemistry, user13DifOffsetStory, user13DifOffsetSocialScience, user13DifOffsetPhysicalTraining, user13DifOffsetSecurityBasics, user13DifOffsetNativeLiterature, user13ExamRussianLanguage, user13ExamMathematics, user13ExamInformatics, user13IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user14Id, user14Username, user14DifOffsetLiterature, user14DifOffsetEnglishLanguage, user14DifOffsetPhysics, user14DifOffsetChemistry, user14DifOffsetStory, user14DifOffsetSocialScience, user14DifOffsetPhysicalTraining, user14DifOffsetSecurityBasics, user14DifOffsetNativeLiterature, user14ExamRussianLanguage, user14ExamMathematics, user14ExamInformatics, user14IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user15Id, user15Username, user15DifOffsetLiterature, user15DifOffsetEnglishLanguage, user15DifOffsetPhysics, user15DifOffsetChemistry, user15DifOffsetStory, user15DifOffsetSocialScience, user15DifOffsetPhysicalTraining, user15DifOffsetSecurityBasics, user15DifOffsetNativeLiterature, user15ExamRussianLanguage, user15ExamMathematics, user15ExamInformatics, user15IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user16Id, user16Username, user16DifOffsetLiterature, user16DifOffsetEnglishLanguage, user16DifOffsetPhysics, user16DifOffsetChemistry, user16DifOffsetStory, user16DifOffsetSocialScience, user16DifOffsetPhysicalTraining, user16DifOffsetSecurityBasics, user16DifOffsetNativeLiterature, user16ExamRussianLanguage, user16ExamMathematics, user16ExamInformatics, user16IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user17Id, user17Username, user17DifOffsetLiterature, user17DifOffsetEnglishLanguage, user17DifOffsetPhysics, user17DifOffsetChemistry, user17DifOffsetStory, user17DifOffsetSocialScience, user17DifOffsetPhysicalTraining, user17DifOffsetSecurityBasics, user17DifOffsetNativeLiterature, user17ExamRussianLanguage, user17ExamMathematics, user17ExamInformatics, user17IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user18Id, user18Username, user18DifOffsetLiterature, user18DifOffsetEnglishLanguage, user18DifOffsetPhysics, user18DifOffsetChemistry, user18DifOffsetStory, user18DifOffsetSocialScience, user18DifOffsetPhysicalTraining, user18DifOffsetSecurityBasics, user18DifOffsetNativeLiterature, user18ExamRussianLanguage, user18ExamMathematics, user18ExamInformatics, user18IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user19Id, user19Username, user19DifOffsetLiterature, user19DifOffsetEnglishLanguage, user19DifOffsetPhysics, user19DifOffsetChemistry, user19DifOffsetStory, user19DifOffsetSocialScience, user19DifOffsetPhysicalTraining, user19DifOffsetSecurityBasics, user19DifOffsetNativeLiterature, user19ExamRussianLanguage, user19ExamMathematics, user19ExamInformatics, user19IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user20Id, user20Username, user20DifOffsetLiterature, user20DifOffsetEnglishLanguage, user20DifOffsetPhysics, user20DifOffsetChemistry, user20DifOffsetStory, user20DifOffsetSocialScience, user20DifOffsetPhysicalTraining, user20DifOffsetSecurityBasics, user20DifOffsetNativeLiterature, user20ExamRussianLanguage, user20ExamMathematics, user20ExamInformatics, user20IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user21Id, user21Username, user21DifOffsetLiterature, user21DifOffsetEnglishLanguage, user21DifOffsetPhysics, user21DifOffsetChemistry, user21DifOffsetStory, user21DifOffsetSocialScience, user21DifOffsetPhysicalTraining, user21DifOffsetSecurityBasics, user21DifOffsetNativeLiterature, user21ExamRussianLanguage, user21ExamMathematics, user21ExamInformatics, user21IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user22Id, user22Username, user22DifOffsetLiterature, user22DifOffsetEnglishLanguage, user22DifOffsetPhysics, user22DifOffsetChemistry, user22DifOffsetStory, user22DifOffsetSocialScience, user22DifOffsetPhysicalTraining, user22DifOffsetSecurityBasics, user22DifOffsetNativeLiterature, user22ExamRussianLanguage, user22ExamMathematics, user22ExamInformatics, user22IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user23Id, user23Username, user23DifOffsetLiterature, user23DifOffsetEnglishLanguage, user23DifOffsetPhysics, user23DifOffsetChemistry, user23DifOffsetStory, user23DifOffsetSocialScience, user23DifOffsetPhysicalTraining, user23DifOffsetSecurityBasics, user23DifOffsetNativeLiterature, user23ExamRussianLanguage, user23ExamMathematics, user23ExamInformatics, user23IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user24Id, user24Username, user24DifOffsetLiterature, user24DifOffsetEnglishLanguage, user24DifOffsetPhysics, user24DifOffsetChemistry, user24DifOffsetStory, user24DifOffsetSocialScience, user24DifOffsetPhysicalTraining, user24DifOffsetSecurityBasics, user24DifOffsetNativeLiterature, user24ExamRussianLanguage, user24ExamMathematics, user24ExamInformatics, user24IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user25Id, user25Username, user25DifOffsetLiterature, user25DifOffsetEnglishLanguage, user25DifOffsetPhysics, user25DifOffsetChemistry, user25DifOffsetStory, user25DifOffsetSocialScience, user25DifOffsetPhysicalTraining, user25DifOffsetSecurityBasics, user25DifOffsetNativeLiterature, user25ExamRussianLanguage, user25ExamMathematics, user25ExamInformatics, user25IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user26Id, user26Username, user26DifOffsetLiterature, user26DifOffsetEnglishLanguage, user26DifOffsetPhysics, user26DifOffsetChemistry, user26DifOffsetStory, user26DifOffsetSocialScience, user26DifOffsetPhysicalTraining, user26DifOffsetSecurityBasics, user26DifOffsetNativeLiterature, user26ExamRussianLanguage, user26ExamMathematics, user26ExamInformatics, user26IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user27Id, user27Username, user27DifOffsetLiterature, user27DifOffsetEnglishLanguage, user27DifOffsetPhysics, user27DifOffsetChemistry, user27DifOffsetStory, user27DifOffsetSocialScience, user27DifOffsetPhysicalTraining, user27DifOffsetSecurityBasics, user27DifOffsetNativeLiterature, user27ExamRussianLanguage, user27ExamMathematics, user27ExamInformatics, user27IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user28Id, user28Username, user28DifOffsetLiterature, user28DifOffsetEnglishLanguage, user28DifOffsetPhysics, user28DifOffsetChemistry, user28DifOffsetStory, user28DifOffsetSocialScience, user28DifOffsetPhysicalTraining, user28DifOffsetSecurityBasics, user28DifOffsetNativeLiterature, user28ExamRussianLanguage, user28ExamMathematics, user28ExamInformatics, user28IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user29Id, user29Username, user29DifOffsetLiterature, user29DifOffsetEnglishLanguage, user29DifOffsetPhysics, user29DifOffsetChemistry, user29DifOffsetStory, user29DifOffsetSocialScience, user29DifOffsetPhysicalTraining, user29DifOffsetSecurityBasics, user29DifOffsetNativeLiterature, user29ExamRussianLanguage, user29ExamMathematics, user29ExamInformatics, user29IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user30Id, user30Username, user30DifOffsetLiterature, user30DifOffsetEnglishLanguage, user30DifOffsetPhysics, user30DifOffsetChemistry, user30DifOffsetStory, user30DifOffsetSocialScience, user30DifOffsetPhysicalTraining, user30DifOffsetSecurityBasics, user30DifOffsetNativeLiterature, user30ExamRussianLanguage, user30ExamMathematics, user30ExamInformatics, user30IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user31Id, user31Username, user31DifOffsetLiterature, user31DifOffsetEnglishLanguage, user31DifOffsetPhysics, user31DifOffsetChemistry, user31DifOffsetStory, user31DifOffsetSocialScience, user31DifOffsetPhysicalTraining, user31DifOffsetSecurityBasics, user31DifOffsetNativeLiterature, user31ExamRussianLanguage, user31ExamMathematics, user31ExamInformatics, user31IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user32Id, user32Username, user32DifOffsetLiterature, user32DifOffsetEnglishLanguage, user32DifOffsetPhysics, user32DifOffsetChemistry, user32DifOffsetStory, user32DifOffsetSocialScience, user32DifOffsetPhysicalTraining, user32DifOffsetSecurityBasics, user32DifOffsetNativeLiterature, user32ExamRussianLanguage, user32ExamMathematics, user32ExamInformatics, user32IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user33Id, user33Username, user33DifOffsetLiterature, user33DifOffsetEnglishLanguage, user33DifOffsetPhysics, user33DifOffsetChemistry, user33DifOffsetStory, user33DifOffsetSocialScience, user33DifOffsetPhysicalTraining, user33DifOffsetSecurityBasics, user33DifOffsetNativeLiterature, user33ExamRussianLanguage, user33ExamMathematics, user33ExamInformatics, user33IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user34Id, user34Username, user34DifOffsetLiterature, user34DifOffsetEnglishLanguage, user34DifOffsetPhysics, user34DifOffsetChemistry, user34DifOffsetStory, user34DifOffsetSocialScience, user34DifOffsetPhysicalTraining, user34DifOffsetSecurityBasics, user34DifOffsetNativeLiterature, user34ExamRussianLanguage, user34ExamMathematics, user34ExamInformatics, user34IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user35Id, user35Username, user35DifOffsetLiterature, user35DifOffsetEnglishLanguage, user35DifOffsetPhysics, user35DifOffsetChemistry, user35DifOffsetStory, user35DifOffsetSocialScience, user35DifOffsetPhysicalTraining, user35DifOffsetSecurityBasics, user35DifOffsetNativeLiterature, user35ExamRussianLanguage, user35ExamMathematics, user35ExamInformatics, user35IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user36Id, user36Username, user36DifOffsetLiterature, user36DifOffsetEnglishLanguage, user36DifOffsetPhysics, user36DifOffsetChemistry, user36DifOffsetStory, user36DifOffsetSocialScience, user36DifOffsetPhysicalTraining, user36DifOffsetSecurityBasics, user36DifOffsetNativeLiterature, user36ExamRussianLanguage, user36ExamMathematics, user36ExamInformatics, user36IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user37Id, user37Username, user37DifOffsetLiterature, user37DifOffsetEnglishLanguage, user37DifOffsetPhysics, user37DifOffsetChemistry, user37DifOffsetStory, user37DifOffsetSocialScience, user37DifOffsetPhysicalTraining, user37DifOffsetSecurityBasics, user37DifOffsetNativeLiterature, user37ExamRussianLanguage, user37ExamMathematics, user37ExamInformatics, user37IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user38Id, user38Username, user38DifOffsetLiterature, user38DifOffsetEnglishLanguage, user38DifOffsetPhysics, user38DifOffsetChemistry, user38DifOffsetStory, user38DifOffsetSocialScience, user38DifOffsetPhysicalTraining, user38DifOffsetSecurityBasics, user38DifOffsetNativeLiterature, user38ExamRussianLanguage, user38ExamMathematics, user38ExamInformatics, user38IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user39Id, user39Username, user39DifOffsetLiterature, user39DifOffsetEnglishLanguage, user39DifOffsetPhysics, user39DifOffsetChemistry, user39DifOffsetStory, user39DifOffsetSocialScience, user39DifOffsetPhysicalTraining, user39DifOffsetSecurityBasics, user39DifOffsetNativeLiterature, user39ExamRussianLanguage, user39ExamMathematics, user39ExamInformatics, user39IndividualProject));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester2(user40Id, user40Username, user40DifOffsetLiterature, user40DifOffsetEnglishLanguage, user40DifOffsetPhysics, user40DifOffsetChemistry, user40DifOffsetStory, user40DifOffsetSocialScience, user40DifOffsetPhysicalTraining, user40DifOffsetSecurityBasics, user40DifOffsetNativeLiterature, user40ExamRussianLanguage, user40ExamMathematics, user40ExamInformatics, user40IndividualProject));

            if (specialGradeIs11Course1Semester2Repository.findAll().isEmpty()) {
                specialGradeIs11Course1Semester2Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course1Semester2> user1Row = specialGradeIs11Course1Semester2Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User1 = user1Row.get();
            SpecialGrade_IS_1_1Course1Semester2User1.setUsername(user1Username);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetLiterature(user1DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetEnglishLanguage(user1DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetPhysics(user1DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetChemistry(user1DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetStory(user1DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetSocialScience(user1DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetPhysicalTraining(user1DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetSecurityBasics(user1DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User1.setDifOffsetNativeLiterature(user1DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User1.setExamRussianLanguage(user1ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User1.setExamMathematics(user1ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User1.setExamInformatics(user1ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course1Semester2> user2Row = specialGradeIs11Course1Semester2Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User2 = user2Row.get();
            SpecialGrade_IS_1_1Course1Semester2User2.setUsername(user2Username);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetLiterature(user2DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetEnglishLanguage(user2DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetPhysics(user2DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetChemistry(user2DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetStory(user2DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetSocialScience(user2DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetPhysicalTraining(user2DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetSecurityBasics(user2DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User2.setDifOffsetNativeLiterature(user2DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User2.setExamRussianLanguage(user2ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User2.setExamMathematics(user2ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User2.setExamInformatics(user2ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course1Semester2> user3Row = specialGradeIs11Course1Semester2Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User3 = user3Row.get();
            SpecialGrade_IS_1_1Course1Semester2User3.setUsername(user3Username);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetLiterature(user3DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetEnglishLanguage(user3DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetPhysics(user3DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetChemistry(user3DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetStory(user3DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetSocialScience(user3DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetPhysicalTraining(user3DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetSecurityBasics(user3DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User3.setDifOffsetNativeLiterature(user3DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User3.setExamRussianLanguage(user3ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User3.setExamMathematics(user3ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User3.setExamInformatics(user3ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course1Semester2> user4Row = specialGradeIs11Course1Semester2Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User4 = user4Row.get();
            SpecialGrade_IS_1_1Course1Semester2User4.setUsername(user4Username);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetLiterature(user4DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetEnglishLanguage(user4DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetPhysics(user4DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetChemistry(user4DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetStory(user4DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetSocialScience(user4DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetPhysicalTraining(user4DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetSecurityBasics(user4DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User4.setDifOffsetNativeLiterature(user4DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User4.setExamRussianLanguage(user4ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User4.setExamMathematics(user4ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User4.setExamInformatics(user4ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course1Semester2> user5Row = specialGradeIs11Course1Semester2Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User5 = user5Row.get();
            SpecialGrade_IS_1_1Course1Semester2User5.setUsername(user5Username);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetLiterature(user5DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetEnglishLanguage(user5DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetPhysics(user5DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetChemistry(user5DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetStory(user5DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetSocialScience(user5DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetPhysicalTraining(user5DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetSecurityBasics(user5DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User5.setDifOffsetNativeLiterature(user5DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User5.setExamRussianLanguage(user5ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User5.setExamMathematics(user5ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User5.setExamInformatics(user5ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course1Semester2> user6Row = specialGradeIs11Course1Semester2Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User6 = user6Row.get();
            SpecialGrade_IS_1_1Course1Semester2User6.setUsername(user6Username);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetLiterature(user6DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetEnglishLanguage(user6DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetPhysics(user6DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetChemistry(user6DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetStory(user6DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetSocialScience(user6DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetPhysicalTraining(user6DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetSecurityBasics(user6DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User6.setDifOffsetNativeLiterature(user6DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User6.setExamRussianLanguage(user6ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User6.setExamMathematics(user6ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User6.setExamInformatics(user6ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course1Semester2> user7Row = specialGradeIs11Course1Semester2Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User7 = user7Row.get();
            SpecialGrade_IS_1_1Course1Semester2User7.setUsername(user7Username);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetLiterature(user7DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetEnglishLanguage(user7DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetPhysics(user7DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetChemistry(user7DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetStory(user7DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetSocialScience(user7DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetPhysicalTraining(user7DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetSecurityBasics(user7DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User7.setDifOffsetNativeLiterature(user7DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User7.setExamRussianLanguage(user7ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User7.setExamMathematics(user7ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User7.setExamInformatics(user7ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course1Semester2> user8Row = specialGradeIs11Course1Semester2Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User8 = user8Row.get();
            SpecialGrade_IS_1_1Course1Semester2User8.setUsername(user8Username);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetLiterature(user8DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetEnglishLanguage(user8DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetPhysics(user8DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetChemistry(user8DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetStory(user8DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetSocialScience(user8DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetPhysicalTraining(user8DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetSecurityBasics(user8DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User8.setDifOffsetNativeLiterature(user8DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User8.setExamRussianLanguage(user8ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User8.setExamMathematics(user8ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User8.setExamInformatics(user8ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course1Semester2> user9Row = specialGradeIs11Course1Semester2Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User9 = user9Row.get();
            SpecialGrade_IS_1_1Course1Semester2User9.setUsername(user9Username);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetLiterature(user9DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetEnglishLanguage(user9DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetPhysics(user9DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetChemistry(user9DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetStory(user9DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetSocialScience(user9DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetPhysicalTraining(user9DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetSecurityBasics(user9DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User9.setDifOffsetNativeLiterature(user9DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User9.setExamRussianLanguage(user9ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User9.setExamMathematics(user9ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User9.setExamInformatics(user9ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course1Semester2> user10Row = specialGradeIs11Course1Semester2Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User10 = user10Row.get();
            SpecialGrade_IS_1_1Course1Semester2User10.setUsername(user10Username);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetLiterature(user10DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetEnglishLanguage(user10DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetPhysics(user10DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetChemistry(user10DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetStory(user10DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetSocialScience(user10DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetPhysicalTraining(user10DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetSecurityBasics(user10DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User10.setDifOffsetNativeLiterature(user10DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User10.setExamRussianLanguage(user10ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User10.setExamMathematics(user10ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User10.setExamInformatics(user10ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course1Semester2> user11Row = specialGradeIs11Course1Semester2Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User11 = user11Row.get();
            SpecialGrade_IS_1_1Course1Semester2User11.setUsername(user11Username);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetLiterature(user11DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetEnglishLanguage(user11DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetPhysics(user11DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetChemistry(user11DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetStory(user11DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetSocialScience(user11DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetPhysicalTraining(user11DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetSecurityBasics(user11DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User11.setDifOffsetNativeLiterature(user11DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User11.setExamRussianLanguage(user11ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User11.setExamMathematics(user11ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User11.setExamInformatics(user11ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course1Semester2> user12Row = specialGradeIs11Course1Semester2Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User12 = user12Row.get();
            SpecialGrade_IS_1_1Course1Semester2User12.setUsername(user12Username);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetLiterature(user12DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetEnglishLanguage(user12DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetPhysics(user12DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetChemistry(user12DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetStory(user12DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetSocialScience(user12DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetPhysicalTraining(user12DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetSecurityBasics(user12DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User12.setDifOffsetNativeLiterature(user12DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User12.setExamRussianLanguage(user12ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User12.setExamMathematics(user12ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User12.setExamInformatics(user12ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course1Semester2> user13Row = specialGradeIs11Course1Semester2Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User13 = user13Row.get();
            SpecialGrade_IS_1_1Course1Semester2User13.setUsername(user13Username);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetLiterature(user13DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetEnglishLanguage(user13DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetPhysics(user13DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetChemistry(user13DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetStory(user13DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetSocialScience(user13DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetPhysicalTraining(user13DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetSecurityBasics(user13DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User13.setDifOffsetNativeLiterature(user13DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User13.setExamRussianLanguage(user13ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User13.setExamMathematics(user13ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User13.setExamInformatics(user13ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course1Semester2> user14Row = specialGradeIs11Course1Semester2Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User14 = user14Row.get();
            SpecialGrade_IS_1_1Course1Semester2User14.setUsername(user14Username);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetLiterature(user14DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetEnglishLanguage(user14DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetPhysics(user14DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetChemistry(user14DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetStory(user14DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetSocialScience(user14DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetPhysicalTraining(user14DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetSecurityBasics(user14DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User14.setDifOffsetNativeLiterature(user14DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User14.setExamRussianLanguage(user14ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User14.setExamMathematics(user14ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User14.setExamInformatics(user14ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course1Semester2> user15Row = specialGradeIs11Course1Semester2Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User15 = user15Row.get();
            SpecialGrade_IS_1_1Course1Semester2User15.setUsername(user15Username);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetLiterature(user15DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetEnglishLanguage(user15DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetPhysics(user15DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetChemistry(user15DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetStory(user15DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetSocialScience(user15DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetPhysicalTraining(user15DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetSecurityBasics(user15DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User15.setDifOffsetNativeLiterature(user15DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User15.setExamRussianLanguage(user15ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User15.setExamMathematics(user15ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User15.setExamInformatics(user15ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course1Semester2> user16Row = specialGradeIs11Course1Semester2Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User16 = user16Row.get();
            SpecialGrade_IS_1_1Course1Semester2User16.setUsername(user16Username);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetLiterature(user16DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetEnglishLanguage(user16DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetPhysics(user16DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetChemistry(user16DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetStory(user16DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetSocialScience(user16DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetPhysicalTraining(user16DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetSecurityBasics(user16DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User16.setDifOffsetNativeLiterature(user16DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User16.setExamRussianLanguage(user16ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User16.setExamMathematics(user16ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User16.setExamInformatics(user16ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course1Semester2> user17Row = specialGradeIs11Course1Semester2Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User17 = user17Row.get();
            SpecialGrade_IS_1_1Course1Semester2User17.setUsername(user17Username);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetLiterature(user17DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetEnglishLanguage(user17DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetPhysics(user17DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetChemistry(user17DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetStory(user17DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetSocialScience(user17DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetPhysicalTraining(user17DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetSecurityBasics(user17DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User17.setDifOffsetNativeLiterature(user17DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User17.setExamRussianLanguage(user17ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User17.setExamMathematics(user17ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User17.setExamInformatics(user17ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course1Semester2> user18Row = specialGradeIs11Course1Semester2Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User18 = user18Row.get();
            SpecialGrade_IS_1_1Course1Semester2User18.setUsername(user18Username);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetLiterature(user18DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetEnglishLanguage(user18DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetPhysics(user18DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetChemistry(user18DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetStory(user18DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetSocialScience(user18DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetPhysicalTraining(user18DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetSecurityBasics(user18DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User18.setDifOffsetNativeLiterature(user18DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User18.setExamRussianLanguage(user18ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User18.setExamMathematics(user18ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User18.setExamInformatics(user18ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course1Semester2> user19Row = specialGradeIs11Course1Semester2Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User19 = user19Row.get();
            SpecialGrade_IS_1_1Course1Semester2User19.setUsername(user19Username);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetLiterature(user19DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetEnglishLanguage(user19DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetPhysics(user19DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetChemistry(user19DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetStory(user19DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetSocialScience(user19DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetPhysicalTraining(user19DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetSecurityBasics(user19DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User19.setDifOffsetNativeLiterature(user19DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User19.setExamRussianLanguage(user19ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User19.setExamMathematics(user19ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User19.setExamInformatics(user19ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course1Semester2> user20Row = specialGradeIs11Course1Semester2Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User20 = user20Row.get();
            SpecialGrade_IS_1_1Course1Semester2User20.setUsername(user20Username);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetLiterature(user20DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetEnglishLanguage(user20DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetPhysics(user20DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetChemistry(user20DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetStory(user20DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetSocialScience(user20DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetPhysicalTraining(user20DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetSecurityBasics(user20DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User20.setDifOffsetNativeLiterature(user20DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User20.setExamRussianLanguage(user20ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User20.setExamMathematics(user20ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User20.setExamInformatics(user20ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course1Semester2> user21Row = specialGradeIs11Course1Semester2Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User21 = user21Row.get();
            SpecialGrade_IS_1_1Course1Semester2User21.setUsername(user21Username);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetLiterature(user21DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetEnglishLanguage(user21DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetPhysics(user21DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetChemistry(user21DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetStory(user21DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetSocialScience(user21DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetPhysicalTraining(user21DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetSecurityBasics(user21DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User21.setDifOffsetNativeLiterature(user21DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User21.setExamRussianLanguage(user21ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User21.setExamMathematics(user21ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User21.setExamInformatics(user21ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course1Semester2> user22Row = specialGradeIs11Course1Semester2Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User22 = user22Row.get();
            SpecialGrade_IS_1_1Course1Semester2User22.setUsername(user22Username);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetLiterature(user22DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetEnglishLanguage(user22DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetPhysics(user22DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetChemistry(user22DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetStory(user22DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetSocialScience(user22DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetPhysicalTraining(user22DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetSecurityBasics(user22DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User22.setDifOffsetNativeLiterature(user22DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User22.setExamRussianLanguage(user22ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User22.setExamMathematics(user22ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User22.setExamInformatics(user22ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course1Semester2> user23Row = specialGradeIs11Course1Semester2Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User23 = user23Row.get();
            SpecialGrade_IS_1_1Course1Semester2User23.setUsername(user23Username);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetLiterature(user23DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetEnglishLanguage(user23DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetPhysics(user23DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetChemistry(user23DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetStory(user23DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetSocialScience(user23DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetPhysicalTraining(user23DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetSecurityBasics(user23DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User23.setDifOffsetNativeLiterature(user23DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User23.setExamRussianLanguage(user23ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User23.setExamMathematics(user23ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User23.setExamInformatics(user23ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course1Semester2> user24Row = specialGradeIs11Course1Semester2Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User24 = user24Row.get();
            SpecialGrade_IS_1_1Course1Semester2User24.setUsername(user24Username);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetLiterature(user24DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetEnglishLanguage(user24DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetPhysics(user24DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetChemistry(user24DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetStory(user24DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetSocialScience(user24DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetPhysicalTraining(user24DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetSecurityBasics(user24DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User24.setDifOffsetNativeLiterature(user24DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User24.setExamRussianLanguage(user24ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User24.setExamMathematics(user24ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User24.setExamInformatics(user24ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course1Semester2> user25Row = specialGradeIs11Course1Semester2Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User25 = user25Row.get();
            SpecialGrade_IS_1_1Course1Semester2User25.setUsername(user25Username);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetLiterature(user25DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetEnglishLanguage(user25DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetPhysics(user25DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetChemistry(user25DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetStory(user25DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetSocialScience(user25DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetPhysicalTraining(user25DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetSecurityBasics(user25DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User25.setDifOffsetNativeLiterature(user25DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User25.setExamRussianLanguage(user25ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User25.setExamMathematics(user25ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User25.setExamInformatics(user25ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course1Semester2> user26Row = specialGradeIs11Course1Semester2Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User26 = user26Row.get();
            SpecialGrade_IS_1_1Course1Semester2User26.setUsername(user26Username);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetLiterature(user26DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetEnglishLanguage(user26DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetPhysics(user26DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetChemistry(user26DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetStory(user26DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetSocialScience(user26DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetPhysicalTraining(user26DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetSecurityBasics(user26DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User26.setDifOffsetNativeLiterature(user26DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User26.setExamRussianLanguage(user26ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User26.setExamMathematics(user26ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User26.setExamInformatics(user26ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course1Semester2> user27Row = specialGradeIs11Course1Semester2Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User27 = user27Row.get();
            SpecialGrade_IS_1_1Course1Semester2User27.setUsername(user27Username);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetLiterature(user27DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetEnglishLanguage(user27DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetPhysics(user27DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetChemistry(user27DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetStory(user27DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetSocialScience(user27DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetPhysicalTraining(user27DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetSecurityBasics(user27DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User27.setDifOffsetNativeLiterature(user27DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User27.setExamRussianLanguage(user27ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User27.setExamMathematics(user27ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User27.setExamInformatics(user27ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course1Semester2> user28Row = specialGradeIs11Course1Semester2Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User28 = user28Row.get();
            SpecialGrade_IS_1_1Course1Semester2User28.setUsername(user28Username);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetLiterature(user28DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetEnglishLanguage(user28DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetPhysics(user28DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetChemistry(user28DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetStory(user28DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetSocialScience(user28DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetPhysicalTraining(user28DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetSecurityBasics(user28DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User28.setDifOffsetNativeLiterature(user28DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User28.setExamRussianLanguage(user28ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User28.setExamMathematics(user28ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User28.setExamInformatics(user28ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course1Semester2> user29Row = specialGradeIs11Course1Semester2Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User29 = user29Row.get();
            SpecialGrade_IS_1_1Course1Semester2User29.setUsername(user29Username);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetLiterature(user29DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetEnglishLanguage(user29DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetPhysics(user29DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetChemistry(user29DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetStory(user29DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetSocialScience(user29DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetPhysicalTraining(user29DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetSecurityBasics(user29DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User29.setDifOffsetNativeLiterature(user29DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User29.setExamRussianLanguage(user29ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User29.setExamMathematics(user29ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User29.setExamInformatics(user29ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course1Semester2> user30Row = specialGradeIs11Course1Semester2Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User30 = user30Row.get();
            SpecialGrade_IS_1_1Course1Semester2User30.setUsername(user30Username);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetLiterature(user30DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetEnglishLanguage(user30DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetPhysics(user30DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetChemistry(user30DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetStory(user30DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetSocialScience(user30DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetPhysicalTraining(user30DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetSecurityBasics(user30DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User30.setDifOffsetNativeLiterature(user30DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User30.setExamRussianLanguage(user30ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User30.setExamMathematics(user30ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User30.setExamInformatics(user30ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course1Semester2> user31Row = specialGradeIs11Course1Semester2Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User31 = user31Row.get();
            SpecialGrade_IS_1_1Course1Semester2User31.setUsername(user31Username);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetLiterature(user31DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetEnglishLanguage(user31DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetPhysics(user31DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetChemistry(user31DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetStory(user31DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetSocialScience(user31DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetPhysicalTraining(user31DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetSecurityBasics(user31DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User31.setDifOffsetNativeLiterature(user31DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User31.setExamRussianLanguage(user31ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User31.setExamMathematics(user31ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User31.setExamInformatics(user31ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course1Semester2> user32Row = specialGradeIs11Course1Semester2Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User32 = user32Row.get();
            SpecialGrade_IS_1_1Course1Semester2User32.setUsername(user32Username);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetLiterature(user32DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetEnglishLanguage(user32DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetPhysics(user32DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetChemistry(user32DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetStory(user32DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetSocialScience(user32DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetPhysicalTraining(user32DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetSecurityBasics(user32DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User32.setDifOffsetNativeLiterature(user32DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User32.setExamRussianLanguage(user32ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User32.setExamMathematics(user32ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User32.setExamInformatics(user32ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course1Semester2> user33Row = specialGradeIs11Course1Semester2Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User33 = user33Row.get();
            SpecialGrade_IS_1_1Course1Semester2User33.setUsername(user33Username);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetLiterature(user33DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetEnglishLanguage(user33DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetPhysics(user33DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetChemistry(user33DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetStory(user33DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetSocialScience(user33DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetPhysicalTraining(user33DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetSecurityBasics(user33DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User33.setDifOffsetNativeLiterature(user33DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User33.setExamRussianLanguage(user33ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User33.setExamMathematics(user33ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User33.setExamInformatics(user33ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course1Semester2> user34Row = specialGradeIs11Course1Semester2Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User34 = user34Row.get();
            SpecialGrade_IS_1_1Course1Semester2User34.setUsername(user34Username);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetLiterature(user34DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetEnglishLanguage(user34DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetPhysics(user34DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetChemistry(user34DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetStory(user34DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetSocialScience(user34DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetPhysicalTraining(user34DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetSecurityBasics(user34DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User34.setDifOffsetNativeLiterature(user34DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User34.setExamRussianLanguage(user34ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User34.setExamMathematics(user34ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User34.setExamInformatics(user34ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course1Semester2> user35Row = specialGradeIs11Course1Semester2Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User35 = user35Row.get();
            SpecialGrade_IS_1_1Course1Semester2User35.setUsername(user35Username);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetLiterature(user35DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetEnglishLanguage(user35DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetPhysics(user35DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetChemistry(user35DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetStory(user35DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetSocialScience(user35DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetPhysicalTraining(user35DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetSecurityBasics(user35DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User35.setDifOffsetNativeLiterature(user35DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User35.setExamRussianLanguage(user35ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User35.setExamMathematics(user35ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User35.setExamInformatics(user35ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course1Semester2> user36Row = specialGradeIs11Course1Semester2Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User36 = user36Row.get();
            SpecialGrade_IS_1_1Course1Semester2User36.setUsername(user36Username);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetLiterature(user36DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetEnglishLanguage(user36DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetPhysics(user36DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetChemistry(user36DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetStory(user36DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetSocialScience(user36DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetPhysicalTraining(user36DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetSecurityBasics(user36DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User36.setDifOffsetNativeLiterature(user36DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User36.setExamRussianLanguage(user36ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User36.setExamMathematics(user36ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User36.setExamInformatics(user36ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course1Semester2> user37Row = specialGradeIs11Course1Semester2Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User37 = user37Row.get();
            SpecialGrade_IS_1_1Course1Semester2User37.setUsername(user37Username);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetLiterature(user37DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetEnglishLanguage(user37DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetPhysics(user37DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetChemistry(user37DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetStory(user37DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetSocialScience(user37DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetPhysicalTraining(user37DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetSecurityBasics(user37DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User37.setDifOffsetNativeLiterature(user37DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User37.setExamRussianLanguage(user37ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User37.setExamMathematics(user37ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User37.setExamInformatics(user37ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course1Semester2> user38Row = specialGradeIs11Course1Semester2Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User38 = user38Row.get();
            SpecialGrade_IS_1_1Course1Semester2User38.setUsername(user38Username);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetLiterature(user38DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetEnglishLanguage(user38DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetPhysics(user38DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetChemistry(user38DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetStory(user38DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetSocialScience(user38DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetPhysicalTraining(user38DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetSecurityBasics(user38DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User38.setDifOffsetNativeLiterature(user38DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User38.setExamRussianLanguage(user38ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User38.setExamMathematics(user38ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User38.setExamInformatics(user38ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course1Semester2> user39Row = specialGradeIs11Course1Semester2Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User39 = user39Row.get();
            SpecialGrade_IS_1_1Course1Semester2User39.setUsername(user39Username);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetLiterature(user39DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetEnglishLanguage(user39DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetPhysics(user39DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetChemistry(user39DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetStory(user39DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetSocialScience(user39DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetPhysicalTraining(user39DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetSecurityBasics(user39DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User39.setDifOffsetNativeLiterature(user39DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User39.setExamRussianLanguage(user39ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User39.setExamMathematics(user39ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User39.setExamInformatics(user39ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course1Semester2> user40Row = specialGradeIs11Course1Semester2Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course1Semester2 SpecialGrade_IS_1_1Course1Semester2User40 = user40Row.get();
            SpecialGrade_IS_1_1Course1Semester2User40.setUsername(user40Username);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetLiterature(user40DifOffsetLiterature);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetEnglishLanguage(user40DifOffsetEnglishLanguage);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetPhysics(user40DifOffsetPhysics);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetChemistry(user40DifOffsetChemistry);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetStory(user40DifOffsetStory);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetSocialScience(user40DifOffsetSocialScience);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetPhysicalTraining(user40DifOffsetPhysicalTraining);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetSecurityBasics(user40DifOffsetSecurityBasics);
            SpecialGrade_IS_1_1Course1Semester2User40.setDifOffsetNativeLiterature(user40DifOffsetNativeLiterature);
            SpecialGrade_IS_1_1Course1Semester2User40.setExamRussianLanguage(user40ExamRussianLanguage);
            SpecialGrade_IS_1_1Course1Semester2User40.setExamMathematics(user40ExamMathematics);
            SpecialGrade_IS_1_1Course1Semester2User40.setExamInformatics(user40ExamInformatics);
            specialGradeIs11Course1Semester2Repository.save(SpecialGrade_IS_1_1Course1Semester2User40);
        } catch (Exception ignore) {

        }
        return "redirect:/api/moderator/moderator_is_1_1/course_1/semester_2/special_grade";
    }


    //GetMappingProgressCourse1Semester1
    @GetMapping("/moderator_is_1_1/course_1/semester_2/progressIS11")
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


    //PostMappingProgressCourse1Semester1
    @PostMapping("/progressIS11")
    public String moderPostProgress(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades) {
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

}
