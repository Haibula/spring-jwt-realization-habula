package com.example.demoauth.service.moderatorService.moderator_is1Service.course1;

import com.example.demoauth.models.grade_is1.models.course1.SpecialGrade_IS_1_1Course1Semester1;
import com.example.demoauth.repository.is1Repository.course1.SpecialGrade_IS_1_1Course1Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course1Semester1 {

    @Autowired
    SpecialGrade_IS_1_1Course1Semester1Repository specialGradeIs11Course1Semester1Repository;

    //GetMappingSpecialGradeCourse1Semester1
    public void getMappingModer_is_1_1SpecialGreadeСourse1Semester1(Model model) {
        List<SpecialGrade_IS_1_1Course1Semester1> res = specialGradeIs11Course1Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course1Semester1::getUserID));
        List<SpecialGrade_IS_1_1Course1Semester1> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course1Semester1());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingSpecialGradeCourse1Semester1
    public void postMappingModer_is_1_1SpecialGreadeСourse1Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetBiology = splitUser1Grades[2];
            String user1DifOffsetGeography = splitUser1Grades[3];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetBiology = splitUser2Grades[2];
            String user2DifOffsetGeography = splitUser2Grades[3];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetBiology = splitUser3Grades[2];
            String user3DifOffsetGeography = splitUser3Grades[3];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetBiology = splitUser4Grades[2];
            String user4DifOffsetGeography = splitUser4Grades[3];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetBiology = splitUser5Grades[2];
            String user5DifOffsetGeography = splitUser5Grades[3];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetBiology = splitUser6Grades[2];
            String user6DifOffsetGeography = splitUser6Grades[3];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetBiology = splitUser7Grades[2];
            String user7DifOffsetGeography = splitUser7Grades[3];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetBiology = splitUser8Grades[2];
            String user8DifOffsetGeography = splitUser8Grades[3];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetBiology = splitUser9Grades[2];
            String user9DifOffsetGeography = splitUser9Grades[3];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetBiology = splitUser10Grades[2];
            String user10DifOffsetGeography = splitUser10Grades[3];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetBiology = splitUser11Grades[2];
            String user11DifOffsetGeography = splitUser11Grades[3];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetBiology = splitUser12Grades[2];
            String user12DifOffsetGeography = splitUser12Grades[3];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetBiology = splitUser13Grades[2];
            String user13DifOffsetGeography = splitUser13Grades[3];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetBiology = splitUser14Grades[2];
            String user14DifOffsetGeography = splitUser14Grades[3];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetBiology = splitUser15Grades[2];
            String user15DifOffsetGeography = splitUser15Grades[3];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetBiology = splitUser16Grades[2];
            String user16DifOffsetGeography = splitUser16Grades[3];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetBiology = splitUser17Grades[2];
            String user17DifOffsetGeography = splitUser17Grades[3];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetBiology = splitUser18Grades[2];
            String user18DifOffsetGeography = splitUser18Grades[3];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetBiology = splitUser19Grades[2];
            String user19DifOffsetGeography = splitUser19Grades[3];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetBiology = splitUser20Grades[2];
            String user20DifOffsetGeography = splitUser20Grades[3];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetBiology = splitUser21Grades[2];
            String user21DifOffsetGeography = splitUser21Grades[3];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetBiology = splitUser22Grades[2];
            String user22DifOffsetGeography = splitUser22Grades[3];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetBiology = splitUser23Grades[2];
            String user23DifOffsetGeography = splitUser23Grades[3];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetBiology = splitUser24Grades[2];
            String user24DifOffsetGeography = splitUser24Grades[3];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetBiology = splitUser25Grades[2];
            String user25DifOffsetGeography = splitUser25Grades[3];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetBiology = splitUser26Grades[2];
            String user26DifOffsetGeography = splitUser26Grades[3];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetBiology = splitUser27Grades[2];
            String user27DifOffsetGeography = splitUser27Grades[3];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetBiology = splitUser28Grades[2];
            String user28DifOffsetGeography = splitUser28Grades[3];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetBiology = splitUser29Grades[2];
            String user29DifOffsetGeography = splitUser29Grades[3];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetBiology = splitUser30Grades[2];
            String user30DifOffsetGeography = splitUser30Grades[3];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetBiology = splitUser31Grades[2];
            String user31DifOffsetGeography = splitUser31Grades[3];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetBiology = splitUser32Grades[2];
            String user32DifOffsetGeography = splitUser32Grades[3];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetBiology = splitUser33Grades[2];
            String user33DifOffsetGeography = splitUser33Grades[3];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetBiology = splitUser34Grades[2];
            String user34DifOffsetGeography = splitUser34Grades[3];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetBiology = splitUser35Grades[2];
            String user35DifOffsetGeography = splitUser35Grades[3];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetBiology = splitUser36Grades[2];
            String user36DifOffsetGeography = splitUser36Grades[3];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetBiology = splitUser37Grades[2];
            String user37DifOffsetGeography = splitUser37Grades[3];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetBiology = splitUser38Grades[2];
            String user38DifOffsetGeography = splitUser38Grades[3];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetBiology = splitUser39Grades[2];
            String user39DifOffsetGeography = splitUser39Grades[3];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetBiology = splitUser40Grades[2];
            String user40DifOffsetGeography = splitUser40Grades[3];

            ArrayList<SpecialGrade_IS_1_1Course1Semester1> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user1Id, user1Username, user1DifOffsetBiology, user1DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user2Id, user2Username, user2DifOffsetBiology, user2DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user3Id, user3Username, user3DifOffsetBiology, user3DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user4Id, user4Username, user4DifOffsetBiology, user4DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user5Id, user5Username, user5DifOffsetBiology, user5DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user6Id, user6Username, user6DifOffsetBiology, user6DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user7Id, user7Username, user7DifOffsetBiology, user7DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user8Id, user8Username, user8DifOffsetBiology, user8DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user9Id, user9Username, user9DifOffsetBiology, user9DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user10Id, user10Username, user10DifOffsetBiology, user10DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user11Id, user11Username, user11DifOffsetBiology, user11DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user12Id, user12Username, user12DifOffsetBiology, user12DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user13Id, user13Username, user13DifOffsetBiology, user13DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user14Id, user14Username, user14DifOffsetBiology, user14DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user15Id, user15Username, user15DifOffsetBiology, user15DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user16Id, user16Username, user16DifOffsetBiology, user16DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user17Id, user17Username, user17DifOffsetBiology, user17DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user18Id, user18Username, user18DifOffsetBiology, user18DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user19Id, user19Username, user19DifOffsetBiology, user19DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user20Id, user20Username, user20DifOffsetBiology, user20DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user21Id, user21Username, user21DifOffsetBiology, user21DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user22Id, user22Username, user22DifOffsetBiology, user22DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user23Id, user23Username, user23DifOffsetBiology, user23DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user24Id, user24Username, user24DifOffsetBiology, user24DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user25Id, user25Username, user25DifOffsetBiology, user25DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user26Id, user26Username, user26DifOffsetBiology, user26DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user27Id, user27Username, user27DifOffsetBiology, user27DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user28Id, user28Username, user28DifOffsetBiology, user28DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user29Id, user29Username, user29DifOffsetBiology, user29DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user30Id, user30Username, user30DifOffsetBiology, user30DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user31Id, user31Username, user31DifOffsetBiology, user31DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user32Id, user32Username, user32DifOffsetBiology, user32DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user33Id, user33Username, user33DifOffsetBiology, user33DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user34Id, user34Username, user34DifOffsetBiology, user34DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user35Id, user35Username, user35DifOffsetBiology, user35DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user36Id, user36Username, user36DifOffsetBiology, user36DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user37Id, user37Username, user37DifOffsetBiology, user37DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user38Id, user38Username, user38DifOffsetBiology, user38DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user39Id, user39Username, user39DifOffsetBiology, user39DifOffsetGeography));
            addArr.add(new SpecialGrade_IS_1_1Course1Semester1(user40Id, user40Username, user40DifOffsetBiology, user40DifOffsetGeography));

            if (specialGradeIs11Course1Semester1Repository.findAll().isEmpty()) {
                specialGradeIs11Course1Semester1Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course1Semester1> user1Row = specialGradeIs11Course1Semester1Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User1 = user1Row.get();
            specialGrade_is_1_1Course1Semester1User1.setUsername(user1Username);
            specialGrade_is_1_1Course1Semester1User1.setDifOffsetBiology(user1DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User1.setDifOffsetGeography(user1DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course1Semester1> user2Row = specialGradeIs11Course1Semester1Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User2 = user2Row.get();
            specialGrade_is_1_1Course1Semester1User2.setUsername(user2Username);
            specialGrade_is_1_1Course1Semester1User2.setDifOffsetBiology(user2DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User2.setDifOffsetGeography(user2DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course1Semester1> user3Row = specialGradeIs11Course1Semester1Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User3 = user3Row.get();
            specialGrade_is_1_1Course1Semester1User3.setUsername(user3Username);
            specialGrade_is_1_1Course1Semester1User3.setDifOffsetBiology(user3DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User3.setDifOffsetGeography(user3DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course1Semester1> user4Row = specialGradeIs11Course1Semester1Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User4 = user4Row.get();
            specialGrade_is_1_1Course1Semester1User4.setUsername(user4Username);
            specialGrade_is_1_1Course1Semester1User4.setDifOffsetBiology(user4DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User4.setDifOffsetGeography(user4DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course1Semester1> user5Row = specialGradeIs11Course1Semester1Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User5 = user5Row.get();
            specialGrade_is_1_1Course1Semester1User5.setUsername(user5Username);
            specialGrade_is_1_1Course1Semester1User5.setDifOffsetBiology(user5DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User5.setDifOffsetGeography(user5DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course1Semester1> user6Row = specialGradeIs11Course1Semester1Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User6 = user6Row.get();
            specialGrade_is_1_1Course1Semester1User6.setUsername(user6Username);
            specialGrade_is_1_1Course1Semester1User6.setDifOffsetBiology(user6DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User6.setDifOffsetGeography(user6DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course1Semester1> user7Row = specialGradeIs11Course1Semester1Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User7 = user7Row.get();
            specialGrade_is_1_1Course1Semester1User7.setUsername(user7Username);
            specialGrade_is_1_1Course1Semester1User7.setDifOffsetBiology(user7DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User7.setDifOffsetGeography(user7DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course1Semester1> user8Row = specialGradeIs11Course1Semester1Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User8 = user8Row.get();
            specialGrade_is_1_1Course1Semester1User8.setUsername(user8Username);
            specialGrade_is_1_1Course1Semester1User8.setDifOffsetBiology(user8DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User8.setDifOffsetGeography(user8DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course1Semester1> user9Row = specialGradeIs11Course1Semester1Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User9 = user9Row.get();
            specialGrade_is_1_1Course1Semester1User9.setUsername(user9Username);
            specialGrade_is_1_1Course1Semester1User9.setDifOffsetBiology(user9DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User9.setDifOffsetGeography(user9DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course1Semester1> user10Row = specialGradeIs11Course1Semester1Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User10 = user10Row.get();
            specialGrade_is_1_1Course1Semester1User10.setUsername(user10Username);
            specialGrade_is_1_1Course1Semester1User10.setDifOffsetBiology(user10DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User10.setDifOffsetGeography(user10DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course1Semester1> user11Row = specialGradeIs11Course1Semester1Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User11 = user11Row.get();
            specialGrade_is_1_1Course1Semester1User11.setUsername(user11Username);
            specialGrade_is_1_1Course1Semester1User11.setDifOffsetBiology(user11DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User11.setDifOffsetGeography(user11DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course1Semester1> user12Row = specialGradeIs11Course1Semester1Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User12 = user12Row.get();
            specialGrade_is_1_1Course1Semester1User12.setUsername(user12Username);
            specialGrade_is_1_1Course1Semester1User12.setDifOffsetBiology(user12DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User12.setDifOffsetGeography(user12DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course1Semester1> user13Row = specialGradeIs11Course1Semester1Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User13 = user13Row.get();
            specialGrade_is_1_1Course1Semester1User13.setUsername(user13Username);
            specialGrade_is_1_1Course1Semester1User13.setDifOffsetBiology(user13DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User13.setDifOffsetGeography(user13DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course1Semester1> user14Row = specialGradeIs11Course1Semester1Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User14 = user14Row.get();
            specialGrade_is_1_1Course1Semester1User14.setUsername(user14Username);
            specialGrade_is_1_1Course1Semester1User14.setDifOffsetBiology(user14DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User14.setDifOffsetGeography(user14DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course1Semester1> user15Row = specialGradeIs11Course1Semester1Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User15 = user15Row.get();
            specialGrade_is_1_1Course1Semester1User15.setUsername(user15Username);
            specialGrade_is_1_1Course1Semester1User15.setDifOffsetBiology(user15DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User15.setDifOffsetGeography(user15DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course1Semester1> user16Row = specialGradeIs11Course1Semester1Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User16 = user16Row.get();
            specialGrade_is_1_1Course1Semester1User16.setUsername(user16Username);
            specialGrade_is_1_1Course1Semester1User16.setDifOffsetBiology(user16DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User16.setDifOffsetGeography(user16DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course1Semester1> user17Row = specialGradeIs11Course1Semester1Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User17 = user17Row.get();
            specialGrade_is_1_1Course1Semester1User17.setUsername(user17Username);
            specialGrade_is_1_1Course1Semester1User17.setDifOffsetBiology(user17DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User17.setDifOffsetGeography(user17DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course1Semester1> user18Row = specialGradeIs11Course1Semester1Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User18 = user18Row.get();
            specialGrade_is_1_1Course1Semester1User18.setUsername(user18Username);
            specialGrade_is_1_1Course1Semester1User18.setDifOffsetBiology(user18DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User18.setDifOffsetGeography(user18DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course1Semester1> user19Row = specialGradeIs11Course1Semester1Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User19 = user19Row.get();
            specialGrade_is_1_1Course1Semester1User19.setUsername(user19Username);
            specialGrade_is_1_1Course1Semester1User19.setDifOffsetBiology(user19DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User19.setDifOffsetGeography(user19DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course1Semester1> user20Row = specialGradeIs11Course1Semester1Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User20 = user20Row.get();
            specialGrade_is_1_1Course1Semester1User20.setUsername(user20Username);
            specialGrade_is_1_1Course1Semester1User20.setDifOffsetBiology(user20DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User20.setDifOffsetGeography(user20DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course1Semester1> user21Row = specialGradeIs11Course1Semester1Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User21 = user21Row.get();
            specialGrade_is_1_1Course1Semester1User21.setUsername(user21Username);
            specialGrade_is_1_1Course1Semester1User21.setDifOffsetBiology(user21DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User21.setDifOffsetGeography(user21DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course1Semester1> user22Row = specialGradeIs11Course1Semester1Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User22 = user22Row.get();
            specialGrade_is_1_1Course1Semester1User22.setUsername(user22Username);
            specialGrade_is_1_1Course1Semester1User22.setDifOffsetBiology(user22DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User22.setDifOffsetGeography(user22DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course1Semester1> user23Row = specialGradeIs11Course1Semester1Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User23 = user23Row.get();
            specialGrade_is_1_1Course1Semester1User23.setUsername(user23Username);
            specialGrade_is_1_1Course1Semester1User23.setDifOffsetBiology(user23DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User23.setDifOffsetGeography(user23DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course1Semester1> user24Row = specialGradeIs11Course1Semester1Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User24 = user24Row.get();
            specialGrade_is_1_1Course1Semester1User24.setUsername(user24Username);
            specialGrade_is_1_1Course1Semester1User24.setDifOffsetBiology(user24DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User24.setDifOffsetGeography(user24DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course1Semester1> user25Row = specialGradeIs11Course1Semester1Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User25 = user25Row.get();
            specialGrade_is_1_1Course1Semester1User25.setUsername(user25Username);
            specialGrade_is_1_1Course1Semester1User25.setDifOffsetBiology(user25DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User25.setDifOffsetGeography(user25DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course1Semester1> user26Row = specialGradeIs11Course1Semester1Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User26 = user26Row.get();
            specialGrade_is_1_1Course1Semester1User26.setUsername(user26Username);
            specialGrade_is_1_1Course1Semester1User26.setDifOffsetBiology(user26DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User26.setDifOffsetGeography(user26DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course1Semester1> user27Row = specialGradeIs11Course1Semester1Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User27 = user27Row.get();
            specialGrade_is_1_1Course1Semester1User27.setUsername(user27Username);
            specialGrade_is_1_1Course1Semester1User27.setDifOffsetBiology(user27DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User27.setDifOffsetGeography(user27DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course1Semester1> user28Row = specialGradeIs11Course1Semester1Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User28 = user28Row.get();
            specialGrade_is_1_1Course1Semester1User28.setUsername(user28Username);
            specialGrade_is_1_1Course1Semester1User28.setDifOffsetBiology(user28DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User28.setDifOffsetGeography(user28DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course1Semester1> user29Row = specialGradeIs11Course1Semester1Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User29 = user29Row.get();
            specialGrade_is_1_1Course1Semester1User29.setUsername(user29Username);
            specialGrade_is_1_1Course1Semester1User29.setDifOffsetBiology(user29DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User29.setDifOffsetGeography(user29DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course1Semester1> user30Row = specialGradeIs11Course1Semester1Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User30 = user30Row.get();
            specialGrade_is_1_1Course1Semester1User30.setUsername(user30Username);
            specialGrade_is_1_1Course1Semester1User30.setDifOffsetBiology(user30DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User30.setDifOffsetGeography(user30DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course1Semester1> user31Row = specialGradeIs11Course1Semester1Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User31 = user31Row.get();
            specialGrade_is_1_1Course1Semester1User31.setUsername(user31Username);
            specialGrade_is_1_1Course1Semester1User31.setDifOffsetBiology(user31DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User31.setDifOffsetGeography(user31DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course1Semester1> user32Row = specialGradeIs11Course1Semester1Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User32 = user32Row.get();
            specialGrade_is_1_1Course1Semester1User32.setUsername(user32Username);
            specialGrade_is_1_1Course1Semester1User32.setDifOffsetBiology(user32DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User32.setDifOffsetGeography(user32DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course1Semester1> user33Row = specialGradeIs11Course1Semester1Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User33 = user33Row.get();
            specialGrade_is_1_1Course1Semester1User33.setUsername(user33Username);
            specialGrade_is_1_1Course1Semester1User33.setDifOffsetBiology(user33DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User33.setDifOffsetGeography(user33DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course1Semester1> user34Row = specialGradeIs11Course1Semester1Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User34 = user34Row.get();
            specialGrade_is_1_1Course1Semester1User34.setUsername(user34Username);
            specialGrade_is_1_1Course1Semester1User34.setDifOffsetBiology(user34DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User34.setDifOffsetGeography(user34DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course1Semester1> user35Row = specialGradeIs11Course1Semester1Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User35 = user35Row.get();
            specialGrade_is_1_1Course1Semester1User35.setUsername(user35Username);
            specialGrade_is_1_1Course1Semester1User35.setDifOffsetBiology(user35DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User35.setDifOffsetGeography(user35DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course1Semester1> user36Row = specialGradeIs11Course1Semester1Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User36 = user36Row.get();
            specialGrade_is_1_1Course1Semester1User36.setUsername(user36Username);
            specialGrade_is_1_1Course1Semester1User36.setDifOffsetBiology(user36DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User36.setDifOffsetGeography(user36DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course1Semester1> user37Row = specialGradeIs11Course1Semester1Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User37 = user37Row.get();
            specialGrade_is_1_1Course1Semester1User37.setUsername(user37Username);
            specialGrade_is_1_1Course1Semester1User37.setDifOffsetBiology(user37DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User37.setDifOffsetGeography(user37DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course1Semester1> user38Row = specialGradeIs11Course1Semester1Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User38 = user38Row.get();
            specialGrade_is_1_1Course1Semester1User38.setUsername(user38Username);
            specialGrade_is_1_1Course1Semester1User38.setDifOffsetBiology(user38DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User38.setDifOffsetGeography(user38DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course1Semester1> user39Row = specialGradeIs11Course1Semester1Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User39 = user39Row.get();
            specialGrade_is_1_1Course1Semester1User39.setUsername(user39Username);
            specialGrade_is_1_1Course1Semester1User39.setDifOffsetBiology(user39DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User39.setDifOffsetGeography(user39DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course1Semester1> user40Row = specialGradeIs11Course1Semester1Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course1Semester1 specialGrade_is_1_1Course1Semester1User40 = user40Row.get();
            specialGrade_is_1_1Course1Semester1User40.setUsername(user40Username);
            specialGrade_is_1_1Course1Semester1User40.setDifOffsetBiology(user40DifOffsetBiology);
            specialGrade_is_1_1Course1Semester1User40.setDifOffsetGeography(user40DifOffsetGeography);
            specialGradeIs11Course1Semester1Repository.save(specialGrade_is_1_1Course1Semester1User40);
        } catch (Exception ignore) {

        }

    }


}
