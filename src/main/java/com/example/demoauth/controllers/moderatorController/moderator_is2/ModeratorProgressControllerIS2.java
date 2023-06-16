package com.example.demoauth.controllers.moderatorController.moderator_is2;

import com.example.demoauth.repository.is1Repository.Progress_IS_1_1_Repository;
import com.example.demoauth.service.moderatorService.moderator_is1Service.ModeratorProgressServiceIS1;
import com.example.demoauth.service.moderatorService.moderator_is1Service.course1.ModeratorGradeServiceIS1Course1Semester1;
import com.example.demoauth.service.moderatorService.moderator_is2Service.ModeratorProgressServiceIS2;
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
public class ModeratorProgressControllerIS2 {

    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;
    @Autowired
    ModeratorGradeServiceIS1Course1Semester1 moderatorGradeServiceIS1Course1Semester1;
    @Autowired
    ModeratorProgressServiceIS2 moderatorProgressServiceIS2;


    //GetMappingProgress
    @GetMapping("/moderator_is2/{course}/progressIS11")
    @PreAuthorize("hasRole('MODERATOR_IS2')")
    public String moder_is_1_1Progress(Model model, @PathVariable String course) {
        moderatorGradeServiceIS1Course1Semester1.getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(model);
        moderatorProgressServiceIS2.getMappingModer_is2Progress(model, course);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("course_1");
        arrayList.add("course_2");
        arrayList.add("course_3");
        arrayList.add("course_4");

        for (String s : arrayList) {
            if (course.equals(s)) {
                return "is_1_1-progress-moderator";
            }
        }
        return null;

    }


    //PostMappingProgress
    @PostMapping("/moderator_is2/{course}/progressIS11")
    public String moderPostProgressPost(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String course) {
        moderatorProgressServiceIS2.postMappingModer_is2Progress(user1Grades, user2Grades, user3Grades, user4Grades, user5Grades, user6Grades, user7Grades, user8Grades, user9Grades, user10Grades, user11Grades, user12Grades, user13Grades, user14Grades, user15Grades, user16Grades, user17Grades, user18Grades, user19Grades, user20Grades, user21Grades, user22Grades, user23Grades, user24Grades, user25Grades, user26Grades, user27Grades, user28Grades, user29Grades, user30Grades, user31Grades, user32Grades, user33Grades, user34Grades, user35Grades, user36Grades, user37Grades, user38Grades, user39Grades, user40Grades, course);
        return "redirect:/api/moderator/moderator_is2/{course}/progressIS11";
    }

}
