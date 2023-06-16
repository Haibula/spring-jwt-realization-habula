package com.example.demoauth.controllers.moderatorController.moderator_is1Controller;

import com.example.demoauth.service.moderatorService.moderator_is1Service.ModeratorGradeServiceIS1DeleteService;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

// Сделай отдельную страницу для практик, диф зачет, курсовых и экзаменов
@Controller
@RequestMapping("/api/moderator")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ModeratorControllerIS1Course1 {

    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorGradeServiceIS1Course1Semester2 moderatorGradeServiceIS11Course1Semester2;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course1Semester1 moderatorSpecialGradeServiceIS11Course1Semester1;
    @Autowired
    ModeratorSpecialGradeServiceIS1Course1Semester2 moderatorSpecialGradeServiceIS11Course1Semester2;
    @Autowired
    ModeratorGradeServiceIS1DeleteService moderatorGradeServiceIS1DeleteService;


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
        moderatorGradeServiceIS11Course1Semester2.postMappingMethodModer_is_1_1GreadeСourse1Semester2Post(user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades, month);

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
        moderatorSpecialGradeServiceIS11Course1Semester2.getMappingModer_is_1_1SpecialGreadeСourse1Semester2(model);
        moderatorGradeServiceIS11Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);

        return "moderatorTemplates-is_1_1/course1/is_1_1-special_grade-course_1-semester_2-moderator";

    }

    //PostMappingSpecialGradeCourse1Semester1
    @PostMapping("/moderator_is_1_1/course_1/semester_2/special_grade")
    public String moder_is_1_1SpecialGreadeСourse1Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
        moderatorSpecialGradeServiceIS11Course1Semester2.postMappingModer_is_1_1SpecialGreadeСourse1Semester2Post(user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades);

        return "redirect:/api/moderator/moderator_is_1_1/course_1/semester_2/special_grade";
    }


    //DeleteAll
    @GetMapping("/deleteAll")
    public String deleteModer_is_1_1GreadeСourse1Semester1() {
        moderatorGradeServiceIS1DeleteService.deleteAllDate();
        return "delete-page";
    }

}
