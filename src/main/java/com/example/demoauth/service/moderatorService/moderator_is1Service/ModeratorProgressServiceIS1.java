package com.example.demoauth.service.moderatorService.moderator_is1Service;

import com.example.demoauth.models.grade_is1.models.Progress_IS_1_1;
import com.example.demoauth.repository.is1Repository.Progress_IS_1_1_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorProgressServiceIS1 {

    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;

    public void getMappingModer_is_1_1Progress(Model model, @PathVariable String course) {
        List<Progress_IS_1_1> res = progress_is_1_1_repository.findAll();
        res.sort(Comparator.comparingInt(Progress_IS_1_1::getUserID));
        List<Progress_IS_1_1> voidList = new ArrayList<>();
        List<Progress_IS_1_1> course1List = new ArrayList<>();
        List<Progress_IS_1_1> course2List = new ArrayList<>();
        List<Progress_IS_1_1> course3List = new ArrayList<>();
        List<Progress_IS_1_1> course4List = new ArrayList<>();

        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).getCourse().equals("course_1")) {
                course1List.add(res.get(i));
            } else if (res.get(i).getCourse().equals("course_2")) {
                course2List.add(res.get(i));
            } else if (res.get(i).getCourse().equals("course_3")) {
                course3List.add(res.get(i));
            } else if (res.get(i).getCourse().equals("course_4")) {
                course4List.add(res.get(i));
            }
        }
        for (int i = 0; i < 50; i++) {
            voidList.add(new Progress_IS_1_1());
        }

        if (course.equals("course_1") && !course1List.isEmpty()) {
            model.addAttribute("post", course1List);
        } else if (course.equals("course_2") && !course2List.isEmpty()) {
            model.addAttribute("post", course2List);
        } else if (course.equals("course_3") && !course3List.isEmpty()) {
            model.addAttribute("post", course3List);
        } else if (course.equals("course_4") && !course4List.isEmpty()) {
            model.addAttribute("post", course4List);
        } else {
            model.addAttribute("post", voidList);
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        }
    }
    //PostMappingGradeCourse1Semester1
    public void postMappingModer_is_1_1Progress(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String course) {
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
            String user1PassSeptember = splitUser1Grades[2];
            String user1PassOctober = splitUser1Grades[3];
            String user1PassNovember = splitUser1Grades[4];
            String user1PassDecember = splitUser1Grades[5];
            String user1PassJanuary = splitUser1Grades[6];
            String user1PassFebruary = splitUser1Grades[7];
            String user1PassMarch = splitUser1Grades[8];
            String user1PassApril = splitUser1Grades[9];
            String user1PassMay = splitUser1Grades[10];
            String user1PassJune = splitUser1Grades[11];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2PassSeptember = splitUser2Grades[2];
            String user2PassOctober = splitUser2Grades[3];
            String user2PassNovember = splitUser2Grades[4];
            String user2PassDecember = splitUser2Grades[5];
            String user2PassJanuary = splitUser2Grades[6];
            String user2PassFebruary = splitUser2Grades[7];
            String user2PassMarch = splitUser2Grades[8];
            String user2PassApril = splitUser2Grades[9];
            String user2PassMay = splitUser2Grades[10];
            String user2PassJune = splitUser2Grades[11];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3PassSeptember = splitUser3Grades[2];
            String user3PassOctober = splitUser3Grades[3];
            String user3PassNovember = splitUser3Grades[4];
            String user3PassDecember = splitUser3Grades[5];
            String user3PassJanuary = splitUser3Grades[6];
            String user3PassFebruary = splitUser3Grades[7];
            String user3PassMarch = splitUser3Grades[8];
            String user3PassApril = splitUser3Grades[9];
            String user3PassMay = splitUser3Grades[10];
            String user3PassJune = splitUser3Grades[11];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4PassSeptember = splitUser4Grades[2];
            String user4PassOctober = splitUser4Grades[3];
            String user4PassNovember = splitUser4Grades[4];
            String user4PassDecember = splitUser4Grades[5];
            String user4PassJanuary = splitUser4Grades[6];
            String user4PassFebruary = splitUser4Grades[7];
            String user4PassMarch = splitUser4Grades[8];
            String user4PassApril = splitUser4Grades[9];
            String user4PassMay = splitUser4Grades[10];
            String user4PassJune = splitUser4Grades[11];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5PassSeptember = splitUser5Grades[2];
            String user5PassOctober = splitUser5Grades[3];
            String user5PassNovember = splitUser5Grades[4];
            String user5PassDecember = splitUser5Grades[5];
            String user5PassJanuary = splitUser5Grades[6];
            String user5PassFebruary = splitUser5Grades[7];
            String user5PassMarch = splitUser5Grades[8];
            String user5PassApril = splitUser5Grades[9];
            String user5PassMay = splitUser5Grades[10];
            String user5PassJune = splitUser5Grades[11];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6PassSeptember = splitUser6Grades[2];
            String user6PassOctober = splitUser6Grades[3];
            String user6PassNovember = splitUser6Grades[4];
            String user6PassDecember = splitUser6Grades[5];
            String user6PassJanuary = splitUser6Grades[6];
            String user6PassFebruary = splitUser6Grades[7];
            String user6PassMarch = splitUser6Grades[8];
            String user6PassApril = splitUser6Grades[9];
            String user6PassMay = splitUser6Grades[10];
            String user6PassJune = splitUser6Grades[11];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7PassSeptember = splitUser7Grades[2];
            String user7PassOctober = splitUser7Grades[3];
            String user7PassNovember = splitUser7Grades[4];
            String user7PassDecember = splitUser7Grades[5];
            String user7PassJanuary = splitUser7Grades[6];
            String user7PassFebruary = splitUser7Grades[7];
            String user7PassMarch = splitUser7Grades[8];
            String user7PassApril = splitUser7Grades[9];
            String user7PassMay = splitUser7Grades[10];
            String user7PassJune = splitUser7Grades[11];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8PassSeptember = splitUser8Grades[2];
            String user8PassOctober = splitUser8Grades[3];
            String user8PassNovember = splitUser8Grades[4];
            String user8PassDecember = splitUser8Grades[5];
            String user8PassJanuary = splitUser8Grades[6];
            String user8PassFebruary = splitUser8Grades[7];
            String user8PassMarch = splitUser8Grades[8];
            String user8PassApril = splitUser8Grades[9];
            String user8PassMay = splitUser8Grades[10];
            String user8PassJune = splitUser8Grades[11];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9PassSeptember = splitUser9Grades[2];
            String user9PassOctober = splitUser9Grades[3];
            String user9PassNovember = splitUser9Grades[4];
            String user9PassDecember = splitUser9Grades[5];
            String user9PassJanuary = splitUser9Grades[6];
            String user9PassFebruary = splitUser9Grades[7];
            String user9PassMarch = splitUser9Grades[8];
            String user9PassApril = splitUser9Grades[9];
            String user9PassMay = splitUser9Grades[10];
            String user9PassJune = splitUser9Grades[11];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10PassSeptember = splitUser10Grades[2];
            String user10PassOctober = splitUser10Grades[3];
            String user10PassNovember = splitUser10Grades[4];
            String user10PassDecember = splitUser10Grades[5];
            String user10PassJanuary = splitUser10Grades[6];
            String user10PassFebruary = splitUser10Grades[7];
            String user10PassMarch = splitUser10Grades[8];
            String user10PassApril = splitUser10Grades[9];
            String user10PassMay = splitUser10Grades[10];
            String user10PassJune = splitUser10Grades[11];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11PassSeptember = splitUser11Grades[2];
            String user11PassOctober = splitUser11Grades[3];
            String user11PassNovember = splitUser11Grades[4];
            String user11PassDecember = splitUser11Grades[5];
            String user11PassJanuary = splitUser11Grades[6];
            String user11PassFebruary = splitUser11Grades[7];
            String user11PassMarch = splitUser11Grades[8];
            String user11PassApril = splitUser11Grades[9];
            String user11PassMay = splitUser11Grades[10];
            String user11PassJune = splitUser11Grades[11];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12PassSeptember = splitUser12Grades[2];
            String user12PassOctober = splitUser12Grades[3];
            String user12PassNovember = splitUser12Grades[4];
            String user12PassDecember = splitUser12Grades[5];
            String user12PassJanuary = splitUser12Grades[6];
            String user12PassFebruary = splitUser12Grades[7];
            String user12PassMarch = splitUser12Grades[8];
            String user12PassApril = splitUser12Grades[9];
            String user12PassMay = splitUser12Grades[10];
            String user12PassJune = splitUser12Grades[11];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13PassSeptember = splitUser13Grades[2];
            String user13PassOctober = splitUser13Grades[3];
            String user13PassNovember = splitUser13Grades[4];
            String user13PassDecember = splitUser13Grades[5];
            String user13PassJanuary = splitUser13Grades[6];
            String user13PassFebruary = splitUser13Grades[7];
            String user13PassMarch = splitUser13Grades[8];
            String user13PassApril = splitUser13Grades[9];
            String user13PassMay = splitUser13Grades[10];
            String user13PassJune = splitUser13Grades[11];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14PassSeptember = splitUser14Grades[2];
            String user14PassOctober = splitUser14Grades[3];
            String user14PassNovember = splitUser14Grades[4];
            String user14PassDecember = splitUser14Grades[5];
            String user14PassJanuary = splitUser14Grades[6];
            String user14PassFebruary = splitUser14Grades[7];
            String user14PassMarch = splitUser14Grades[8];
            String user14PassApril = splitUser14Grades[9];
            String user14PassMay = splitUser14Grades[10];
            String user14PassJune = splitUser14Grades[11];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15PassSeptember = splitUser15Grades[2];
            String user15PassOctober = splitUser15Grades[3];
            String user15PassNovember = splitUser15Grades[4];
            String user15PassDecember = splitUser15Grades[5];
            String user15PassJanuary = splitUser15Grades[6];
            String user15PassFebruary = splitUser15Grades[7];
            String user15PassMarch = splitUser15Grades[8];
            String user15PassApril = splitUser15Grades[9];
            String user15PassMay = splitUser15Grades[10];
            String user15PassJune = splitUser15Grades[11];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16PassSeptember = splitUser16Grades[2];
            String user16PassOctober = splitUser16Grades[3];
            String user16PassNovember = splitUser16Grades[4];
            String user16PassDecember = splitUser16Grades[5];
            String user16PassJanuary = splitUser16Grades[6];
            String user16PassFebruary = splitUser16Grades[7];
            String user16PassMarch = splitUser16Grades[8];
            String user16PassApril = splitUser16Grades[9];
            String user16PassMay = splitUser16Grades[10];
            String user16PassJune = splitUser16Grades[11];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17PassSeptember = splitUser17Grades[2];
            String user17PassOctober = splitUser17Grades[3];
            String user17PassNovember = splitUser17Grades[4];
            String user17PassDecember = splitUser17Grades[5];
            String user17PassJanuary = splitUser17Grades[6];
            String user17PassFebruary = splitUser17Grades[7];
            String user17PassMarch = splitUser17Grades[8];
            String user17PassApril = splitUser17Grades[9];
            String user17PassMay = splitUser17Grades[10];
            String user17PassJune = splitUser17Grades[11];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18PassSeptember = splitUser18Grades[2];
            String user18PassOctober = splitUser18Grades[3];
            String user18PassNovember = splitUser18Grades[4];
            String user18PassDecember = splitUser18Grades[5];
            String user18PassJanuary = splitUser18Grades[6];
            String user18PassFebruary = splitUser18Grades[7];
            String user18PassMarch = splitUser18Grades[8];
            String user18PassApril = splitUser18Grades[9];
            String user18PassMay = splitUser18Grades[10];
            String user18PassJune = splitUser18Grades[11];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19PassSeptember = splitUser19Grades[2];
            String user19PassOctober = splitUser19Grades[3];
            String user19PassNovember = splitUser19Grades[4];
            String user19PassDecember = splitUser19Grades[5];
            String user19PassJanuary = splitUser19Grades[6];
            String user19PassFebruary = splitUser19Grades[7];
            String user19PassMarch = splitUser19Grades[8];
            String user19PassApril = splitUser19Grades[9];
            String user19PassMay = splitUser19Grades[10];
            String user19PassJune = splitUser19Grades[11];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20PassSeptember = splitUser20Grades[2];
            String user20PassOctober = splitUser20Grades[3];
            String user20PassNovember = splitUser20Grades[4];
            String user20PassDecember = splitUser20Grades[5];
            String user20PassJanuary = splitUser20Grades[6];
            String user20PassFebruary = splitUser20Grades[7];
            String user20PassMarch = splitUser20Grades[8];
            String user20PassApril = splitUser20Grades[9];
            String user20PassMay = splitUser20Grades[10];
            String user20PassJune = splitUser20Grades[11];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21PassSeptember = splitUser21Grades[2];
            String user21PassOctober = splitUser21Grades[3];
            String user21PassNovember = splitUser21Grades[4];
            String user21PassDecember = splitUser21Grades[5];
            String user21PassJanuary = splitUser21Grades[6];
            String user21PassFebruary = splitUser21Grades[7];
            String user21PassMarch = splitUser21Grades[8];
            String user21PassApril = splitUser21Grades[9];
            String user21PassMay = splitUser21Grades[10];
            String user21PassJune = splitUser21Grades[11];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22PassSeptember = splitUser22Grades[2];
            String user22PassOctober = splitUser22Grades[3];
            String user22PassNovember = splitUser22Grades[4];
            String user22PassDecember = splitUser22Grades[5];
            String user22PassJanuary = splitUser22Grades[6];
            String user22PassFebruary = splitUser22Grades[7];
            String user22PassMarch = splitUser22Grades[8];
            String user22PassApril = splitUser22Grades[9];
            String user22PassMay = splitUser22Grades[10];
            String user22PassJune = splitUser22Grades[11];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23PassSeptember = splitUser23Grades[2];
            String user23PassOctober = splitUser23Grades[3];
            String user23PassNovember = splitUser23Grades[4];
            String user23PassDecember = splitUser23Grades[5];
            String user23PassJanuary = splitUser23Grades[6];
            String user23PassFebruary = splitUser23Grades[7];
            String user23PassMarch = splitUser23Grades[8];
            String user23PassApril = splitUser23Grades[9];
            String user23PassMay = splitUser23Grades[10];
            String user23PassJune = splitUser23Grades[11];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24PassSeptember = splitUser24Grades[2];
            String user24PassOctober = splitUser24Grades[3];
            String user24PassNovember = splitUser24Grades[4];
            String user24PassDecember = splitUser24Grades[5];
            String user24PassJanuary = splitUser24Grades[6];
            String user24PassFebruary = splitUser24Grades[7];
            String user24PassMarch = splitUser24Grades[8];
            String user24PassApril = splitUser24Grades[9];
            String user24PassMay = splitUser24Grades[10];
            String user24PassJune = splitUser24Grades[11];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25PassSeptember = splitUser25Grades[2];
            String user25PassOctober = splitUser25Grades[3];
            String user25PassNovember = splitUser25Grades[4];
            String user25PassDecember = splitUser25Grades[5];
            String user25PassJanuary = splitUser25Grades[6];
            String user25PassFebruary = splitUser25Grades[7];
            String user25PassMarch = splitUser25Grades[8];
            String user25PassApril = splitUser25Grades[9];
            String user25PassMay = splitUser25Grades[10];
            String user25PassJune = splitUser25Grades[11];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26PassSeptember = splitUser26Grades[2];
            String user26PassOctober = splitUser26Grades[3];
            String user26PassNovember = splitUser26Grades[4];
            String user26PassDecember = splitUser26Grades[5];
            String user26PassJanuary = splitUser26Grades[6];
            String user26PassFebruary = splitUser26Grades[7];
            String user26PassMarch = splitUser26Grades[8];
            String user26PassApril = splitUser26Grades[9];
            String user26PassMay = splitUser26Grades[10];
            String user26PassJune = splitUser26Grades[11];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27PassSeptember = splitUser27Grades[2];
            String user27PassOctober = splitUser27Grades[3];
            String user27PassNovember = splitUser27Grades[4];
            String user27PassDecember = splitUser27Grades[5];
            String user27PassJanuary = splitUser27Grades[6];
            String user27PassFebruary = splitUser27Grades[7];
            String user27PassMarch = splitUser27Grades[8];
            String user27PassApril = splitUser27Grades[9];
            String user27PassMay = splitUser27Grades[10];
            String user27PassJune = splitUser27Grades[11];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28PassSeptember = splitUser28Grades[2];
            String user28PassOctober = splitUser28Grades[3];
            String user28PassNovember = splitUser28Grades[4];
            String user28PassDecember = splitUser28Grades[5];
            String user28PassJanuary = splitUser28Grades[6];
            String user28PassFebruary = splitUser28Grades[7];
            String user28PassMarch = splitUser28Grades[8];
            String user28PassApril = splitUser28Grades[9];
            String user28PassMay = splitUser28Grades[10];
            String user28PassJune = splitUser28Grades[11];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29PassSeptember = splitUser29Grades[2];
            String user29PassOctober = splitUser29Grades[3];
            String user29PassNovember = splitUser29Grades[4];
            String user29PassDecember = splitUser29Grades[5];
            String user29PassJanuary = splitUser29Grades[6];
            String user29PassFebruary = splitUser29Grades[7];
            String user29PassMarch = splitUser29Grades[8];
            String user29PassApril = splitUser29Grades[9];
            String user29PassMay = splitUser29Grades[10];
            String user29PassJune = splitUser29Grades[11];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30PassSeptember = splitUser30Grades[2];
            String user30PassOctober = splitUser30Grades[3];
            String user30PassNovember = splitUser30Grades[4];
            String user30PassDecember = splitUser30Grades[5];
            String user30PassJanuary = splitUser30Grades[6];
            String user30PassFebruary = splitUser30Grades[7];
            String user30PassMarch = splitUser30Grades[8];
            String user30PassApril = splitUser30Grades[9];
            String user30PassMay = splitUser30Grades[10];
            String user30PassJune = splitUser30Grades[11];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31PassSeptember = splitUser31Grades[2];
            String user31PassOctober = splitUser31Grades[3];
            String user31PassNovember = splitUser31Grades[4];
            String user31PassDecember = splitUser31Grades[5];
            String user31PassJanuary = splitUser31Grades[6];
            String user31PassFebruary = splitUser31Grades[7];
            String user31PassMarch = splitUser31Grades[8];
            String user31PassApril = splitUser31Grades[9];
            String user31PassMay = splitUser31Grades[10];
            String user31PassJune = splitUser31Grades[11];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32PassSeptember = splitUser32Grades[2];
            String user32PassOctober = splitUser32Grades[3];
            String user32PassNovember = splitUser32Grades[4];
            String user32PassDecember = splitUser32Grades[5];
            String user32PassJanuary = splitUser32Grades[6];
            String user32PassFebruary = splitUser32Grades[7];
            String user32PassMarch = splitUser32Grades[8];
            String user32PassApril = splitUser32Grades[9];
            String user32PassMay = splitUser32Grades[10];
            String user32PassJune = splitUser32Grades[11];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33PassSeptember = splitUser33Grades[2];
            String user33PassOctober = splitUser33Grades[3];
            String user33PassNovember = splitUser33Grades[4];
            String user33PassDecember = splitUser33Grades[5];
            String user33PassJanuary = splitUser33Grades[6];
            String user33PassFebruary = splitUser33Grades[7];
            String user33PassMarch = splitUser33Grades[8];
            String user33PassApril = splitUser33Grades[9];
            String user33PassMay = splitUser33Grades[10];
            String user33PassJune = splitUser33Grades[11];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34PassSeptember = splitUser34Grades[2];
            String user34PassOctober = splitUser34Grades[3];
            String user34PassNovember = splitUser34Grades[4];
            String user34PassDecember = splitUser34Grades[5];
            String user34PassJanuary = splitUser34Grades[6];
            String user34PassFebruary = splitUser34Grades[7];
            String user34PassMarch = splitUser34Grades[8];
            String user34PassApril = splitUser34Grades[9];
            String user34PassMay = splitUser34Grades[10];
            String user34PassJune = splitUser34Grades[11];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35PassSeptember = splitUser35Grades[2];
            String user35PassOctober = splitUser35Grades[3];
            String user35PassNovember = splitUser35Grades[4];
            String user35PassDecember = splitUser35Grades[5];
            String user35PassJanuary = splitUser35Grades[6];
            String user35PassFebruary = splitUser35Grades[7];
            String user35PassMarch = splitUser35Grades[8];
            String user35PassApril = splitUser35Grades[9];
            String user35PassMay = splitUser35Grades[10];
            String user35PassJune = splitUser35Grades[11];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36PassSeptember = splitUser36Grades[2];
            String user36PassOctober = splitUser36Grades[3];
            String user36PassNovember = splitUser36Grades[4];
            String user36PassDecember = splitUser36Grades[5];
            String user36PassJanuary = splitUser36Grades[6];
            String user36PassFebruary = splitUser36Grades[7];
            String user36PassMarch = splitUser36Grades[8];
            String user36PassApril = splitUser36Grades[9];
            String user36PassMay = splitUser36Grades[10];
            String user36PassJune = splitUser36Grades[11];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37PassSeptember = splitUser37Grades[2];
            String user37PassOctober = splitUser37Grades[3];
            String user37PassNovember = splitUser37Grades[4];
            String user37PassDecember = splitUser37Grades[5];
            String user37PassJanuary = splitUser37Grades[6];
            String user37PassFebruary = splitUser37Grades[7];
            String user37PassMarch = splitUser37Grades[8];
            String user37PassApril = splitUser37Grades[9];
            String user37PassMay = splitUser37Grades[10];
            String user37PassJune = splitUser37Grades[11];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38PassSeptember = splitUser38Grades[2];
            String user38PassOctober = splitUser38Grades[3];
            String user38PassNovember = splitUser38Grades[4];
            String user38PassDecember = splitUser38Grades[5];
            String user38PassJanuary = splitUser38Grades[6];
            String user38PassFebruary = splitUser38Grades[7];
            String user38PassMarch = splitUser38Grades[8];
            String user38PassApril = splitUser38Grades[9];
            String user38PassMay = splitUser38Grades[10];
            String user38PassJune = splitUser38Grades[11];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39PassSeptember = splitUser39Grades[2];
            String user39PassOctober = splitUser39Grades[3];
            String user39PassNovember = splitUser39Grades[4];
            String user39PassDecember = splitUser39Grades[5];
            String user39PassJanuary = splitUser39Grades[6];
            String user39PassFebruary = splitUser39Grades[7];
            String user39PassMarch = splitUser39Grades[8];
            String user39PassApril = splitUser39Grades[9];
            String user39PassMay = splitUser39Grades[10];
            String user39PassJune = splitUser39Grades[11];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40PassSeptember = splitUser40Grades[2];
            String user40PassOctober = splitUser40Grades[3];
            String user40PassNovember = splitUser40Grades[4];
            String user40PassDecember = splitUser40Grades[5];
            String user40PassJanuary = splitUser40Grades[6];
            String user40PassFebruary = splitUser40Grades[7];
            String user40PassMarch = splitUser40Grades[8];
            String user40PassApril = splitUser40Grades[9];
            String user40PassMay = splitUser40Grades[10];
            String user40PassJune = splitUser40Grades[11];
        
            ArrayList<Progress_IS_1_1> addArr = new ArrayList<>();
            addArr.add(new Progress_IS_1_1(user1Id, user1Username, user1PassSeptember, user1PassOctober, user1PassNovember, user1PassDecember, user1PassJanuary, user1PassFebruary, user1PassMarch, user1PassApril, user1PassMay, user1PassJune, course));
            addArr.add(new Progress_IS_1_1(user2Id, user2Username, user2PassSeptember, user2PassOctober, user2PassNovember, user2PassDecember, user2PassJanuary, user2PassFebruary, user2PassMarch, user2PassApril, user2PassMay, user2PassJune, course));
            addArr.add(new Progress_IS_1_1(user3Id, user3Username, user3PassSeptember, user3PassOctober, user3PassNovember, user3PassDecember, user3PassJanuary, user3PassFebruary, user3PassMarch, user3PassApril, user3PassMay, user3PassJune, course));
            addArr.add(new Progress_IS_1_1(user4Id, user4Username, user4PassSeptember, user4PassOctober, user4PassNovember, user4PassDecember, user4PassJanuary, user4PassFebruary, user4PassMarch, user4PassApril, user4PassMay, user4PassJune, course));
            addArr.add(new Progress_IS_1_1(user5Id, user5Username, user5PassSeptember, user5PassOctober, user5PassNovember, user5PassDecember, user5PassJanuary, user5PassFebruary, user5PassMarch, user5PassApril, user5PassMay, user5PassJune, course));
            addArr.add(new Progress_IS_1_1(user6Id, user6Username, user6PassSeptember, user6PassOctober, user6PassNovember, user6PassDecember, user6PassJanuary, user6PassFebruary, user6PassMarch, user6PassApril, user6PassMay, user6PassJune, course));
            addArr.add(new Progress_IS_1_1(user7Id, user7Username, user7PassSeptember, user7PassOctober, user7PassNovember, user7PassDecember, user7PassJanuary, user7PassFebruary, user7PassMarch, user7PassApril, user7PassMay, user7PassJune, course));
            addArr.add(new Progress_IS_1_1(user8Id, user8Username, user8PassSeptember, user8PassOctober, user8PassNovember, user8PassDecember, user8PassJanuary, user8PassFebruary, user8PassMarch, user8PassApril, user8PassMay, user8PassJune, course));
            addArr.add(new Progress_IS_1_1(user9Id, user9Username, user9PassSeptember, user9PassOctober, user9PassNovember, user9PassDecember, user9PassJanuary, user9PassFebruary, user9PassMarch, user9PassApril, user9PassMay, user9PassJune, course));
            addArr.add(new Progress_IS_1_1(user10Id, user10Username, user10PassSeptember, user10PassOctober, user10PassNovember, user10PassDecember, user10PassJanuary, user10PassFebruary, user10PassMarch, user10PassApril, user10PassMay, user10PassJune, course));
            addArr.add(new Progress_IS_1_1(user11Id, user11Username, user11PassSeptember, user11PassOctober, user11PassNovember, user11PassDecember, user11PassJanuary, user11PassFebruary, user11PassMarch, user11PassApril, user11PassMay, user11PassJune, course));
            addArr.add(new Progress_IS_1_1(user12Id, user12Username, user12PassSeptember, user12PassOctober, user12PassNovember, user12PassDecember, user12PassJanuary, user12PassFebruary, user12PassMarch, user12PassApril, user12PassMay, user12PassJune, course));
            addArr.add(new Progress_IS_1_1(user13Id, user13Username, user13PassSeptember, user13PassOctober, user13PassNovember, user13PassDecember, user13PassJanuary, user13PassFebruary, user13PassMarch, user13PassApril, user13PassMay, user13PassJune, course));
            addArr.add(new Progress_IS_1_1(user14Id, user14Username, user14PassSeptember, user14PassOctober, user14PassNovember, user14PassDecember, user14PassJanuary, user14PassFebruary, user14PassMarch, user14PassApril, user14PassMay, user14PassJune, course));
            addArr.add(new Progress_IS_1_1(user15Id, user15Username, user15PassSeptember, user15PassOctober, user15PassNovember, user15PassDecember, user15PassJanuary, user15PassFebruary, user15PassMarch, user15PassApril, user15PassMay, user15PassJune, course));
            addArr.add(new Progress_IS_1_1(user16Id, user16Username, user16PassSeptember, user16PassOctober, user16PassNovember, user16PassDecember, user16PassJanuary, user16PassFebruary, user16PassMarch, user16PassApril, user16PassMay, user16PassJune, course));
            addArr.add(new Progress_IS_1_1(user17Id, user17Username, user17PassSeptember, user17PassOctober, user17PassNovember, user17PassDecember, user17PassJanuary, user17PassFebruary, user17PassMarch, user17PassApril, user17PassMay, user17PassJune, course));
            addArr.add(new Progress_IS_1_1(user18Id, user18Username, user18PassSeptember, user18PassOctober, user18PassNovember, user18PassDecember, user18PassJanuary, user18PassFebruary, user18PassMarch, user18PassApril, user18PassMay, user18PassJune, course));
            addArr.add(new Progress_IS_1_1(user19Id, user19Username, user19PassSeptember, user19PassOctober, user19PassNovember, user19PassDecember, user19PassJanuary, user19PassFebruary, user19PassMarch, user19PassApril, user19PassMay, user19PassJune, course));
            addArr.add(new Progress_IS_1_1(user20Id, user20Username, user20PassSeptember, user20PassOctober, user20PassNovember, user20PassDecember, user20PassJanuary, user20PassFebruary, user20PassMarch, user20PassApril, user20PassMay, user20PassJune, course));
            addArr.add(new Progress_IS_1_1(user21Id, user21Username, user21PassSeptember, user21PassOctober, user21PassNovember, user21PassDecember, user21PassJanuary, user21PassFebruary, user21PassMarch, user21PassApril, user21PassMay, user21PassJune, course));
            addArr.add(new Progress_IS_1_1(user22Id, user22Username, user22PassSeptember, user22PassOctober, user22PassNovember, user22PassDecember, user22PassJanuary, user22PassFebruary, user22PassMarch, user22PassApril, user22PassMay, user22PassJune, course));
            addArr.add(new Progress_IS_1_1(user23Id, user23Username, user23PassSeptember, user23PassOctober, user23PassNovember, user23PassDecember, user23PassJanuary, user23PassFebruary, user23PassMarch, user23PassApril, user23PassMay, user23PassJune, course));
            addArr.add(new Progress_IS_1_1(user24Id, user24Username, user24PassSeptember, user24PassOctober, user24PassNovember, user24PassDecember, user24PassJanuary, user24PassFebruary, user24PassMarch, user24PassApril, user24PassMay, user24PassJune, course));
            addArr.add(new Progress_IS_1_1(user25Id, user25Username, user25PassSeptember, user25PassOctober, user25PassNovember, user25PassDecember, user25PassJanuary, user25PassFebruary, user25PassMarch, user25PassApril, user25PassMay, user25PassJune, course));
            addArr.add(new Progress_IS_1_1(user26Id, user26Username, user26PassSeptember, user26PassOctober, user26PassNovember, user26PassDecember, user26PassJanuary, user26PassFebruary, user26PassMarch, user26PassApril, user26PassMay, user26PassJune, course));
            addArr.add(new Progress_IS_1_1(user27Id, user27Username, user27PassSeptember, user27PassOctober, user27PassNovember, user27PassDecember, user27PassJanuary, user27PassFebruary, user27PassMarch, user27PassApril, user27PassMay, user27PassJune, course));
            addArr.add(new Progress_IS_1_1(user28Id, user28Username, user28PassSeptember, user28PassOctober, user28PassNovember, user28PassDecember, user28PassJanuary, user28PassFebruary, user28PassMarch, user28PassApril, user28PassMay, user28PassJune, course));
            addArr.add(new Progress_IS_1_1(user29Id, user29Username, user29PassSeptember, user29PassOctober, user29PassNovember, user29PassDecember, user29PassJanuary, user29PassFebruary, user29PassMarch, user29PassApril, user29PassMay, user29PassJune, course));
            addArr.add(new Progress_IS_1_1(user30Id, user30Username, user30PassSeptember, user30PassOctober, user30PassNovember, user30PassDecember, user30PassJanuary, user30PassFebruary, user30PassMarch, user30PassApril, user30PassMay, user30PassJune, course));
            addArr.add(new Progress_IS_1_1(user31Id, user31Username, user31PassSeptember, user31PassOctober, user31PassNovember, user31PassDecember, user31PassJanuary, user31PassFebruary, user31PassMarch, user31PassApril, user31PassMay, user31PassJune, course));
            addArr.add(new Progress_IS_1_1(user32Id, user32Username, user32PassSeptember, user32PassOctober, user32PassNovember, user32PassDecember, user32PassJanuary, user32PassFebruary, user32PassMarch, user32PassApril, user32PassMay, user32PassJune, course));
            addArr.add(new Progress_IS_1_1(user33Id, user33Username, user33PassSeptember, user33PassOctober, user33PassNovember, user33PassDecember, user33PassJanuary, user33PassFebruary, user33PassMarch, user33PassApril, user33PassMay, user33PassJune, course));
            addArr.add(new Progress_IS_1_1(user34Id, user34Username, user34PassSeptember, user34PassOctober, user34PassNovember, user34PassDecember, user34PassJanuary, user34PassFebruary, user34PassMarch, user34PassApril, user34PassMay, user34PassJune, course));
            addArr.add(new Progress_IS_1_1(user35Id, user35Username, user35PassSeptember, user35PassOctober, user35PassNovember, user35PassDecember, user35PassJanuary, user35PassFebruary, user35PassMarch, user35PassApril, user35PassMay, user35PassJune, course));
            addArr.add(new Progress_IS_1_1(user36Id, user36Username, user36PassSeptember, user36PassOctober, user36PassNovember, user36PassDecember, user36PassJanuary, user36PassFebruary, user36PassMarch, user36PassApril, user36PassMay, user36PassJune, course));
            addArr.add(new Progress_IS_1_1(user37Id, user37Username, user37PassSeptember, user37PassOctober, user37PassNovember, user37PassDecember, user37PassJanuary, user37PassFebruary, user37PassMarch, user37PassApril, user37PassMay, user37PassJune, course));
            addArr.add(new Progress_IS_1_1(user38Id, user38Username, user38PassSeptember, user38PassOctober, user38PassNovember, user38PassDecember, user38PassJanuary, user38PassFebruary, user38PassMarch, user38PassApril, user38PassMay, user38PassJune, course));
            addArr.add(new Progress_IS_1_1(user39Id, user39Username, user39PassSeptember, user39PassOctober, user39PassNovember, user39PassDecember, user39PassJanuary, user39PassFebruary, user39PassMarch, user39PassApril, user39PassMay, user39PassJune, course));
            addArr.add(new Progress_IS_1_1(user40Id, user40Username, user40PassSeptember, user40PassOctober, user40PassNovember, user40PassDecember, user40PassJanuary, user40PassFebruary, user40PassMarch, user40PassApril, user40PassMay, user40PassJune, course));

            if (progress_is_1_1_repository.findAll().isEmpty()) {
                progress_is_1_1_repository.saveAll(addArr);
            }
            if (!progress_is_1_1_repository.existsByCourse(course)) {
                progress_is_1_1_repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Progress_IS_1_1> listAllGrade = progress_is_1_1_repository.findAll();
            Progress_IS_1_1 progress_IS_1_1User1 = null;
            Progress_IS_1_1 progress_IS_1_1User2 = null;
            Progress_IS_1_1 progress_IS_1_1User3 = null;
            Progress_IS_1_1 progress_IS_1_1User4 = null;
            Progress_IS_1_1 progress_IS_1_1User5 = null;
            Progress_IS_1_1 progress_IS_1_1User6 = null;
            Progress_IS_1_1 progress_IS_1_1User7 = null;
            Progress_IS_1_1 progress_IS_1_1User8 = null;
            Progress_IS_1_1 progress_IS_1_1User9 = null;
            Progress_IS_1_1 progress_IS_1_1User10 = null;
            Progress_IS_1_1 progress_IS_1_1User11 = null;
            Progress_IS_1_1 progress_IS_1_1User12 = null;
            Progress_IS_1_1 progress_IS_1_1User13 = null;
            Progress_IS_1_1 progress_IS_1_1User14 = null;
            Progress_IS_1_1 progress_IS_1_1User15 = null;
            Progress_IS_1_1 progress_IS_1_1User16 = null;
            Progress_IS_1_1 progress_IS_1_1User17 = null;
            Progress_IS_1_1 progress_IS_1_1User18 = null;
            Progress_IS_1_1 progress_IS_1_1User19 = null;
            Progress_IS_1_1 progress_IS_1_1User20 = null;
            Progress_IS_1_1 progress_IS_1_1User21 = null;
            Progress_IS_1_1 progress_IS_1_1User22 = null;
            Progress_IS_1_1 progress_IS_1_1User23 = null;
            Progress_IS_1_1 progress_IS_1_1User24 = null;
            Progress_IS_1_1 progress_IS_1_1User25 = null;
            Progress_IS_1_1 progress_IS_1_1User26 = null;
            Progress_IS_1_1 progress_IS_1_1User27 = null;
            Progress_IS_1_1 progress_IS_1_1User28 = null;
            Progress_IS_1_1 progress_IS_1_1User29 = null;
            Progress_IS_1_1 progress_IS_1_1User30 = null;
            Progress_IS_1_1 progress_IS_1_1User31 = null;
            Progress_IS_1_1 progress_IS_1_1User32 = null;
            Progress_IS_1_1 progress_IS_1_1User33 = null;
            Progress_IS_1_1 progress_IS_1_1User34 = null;
            Progress_IS_1_1 progress_IS_1_1User35 = null;
            Progress_IS_1_1 progress_IS_1_1User36 = null;
            Progress_IS_1_1 progress_IS_1_1User37 = null;
            Progress_IS_1_1 progress_IS_1_1User38 = null;
            Progress_IS_1_1 progress_IS_1_1User39 = null;
            Progress_IS_1_1 progress_IS_1_1User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getCourse().equals(course)) {
//                    progress_IS_1_1User40 = listAllGrade.get(i);
//                }
//
//            }
    
            progress_IS_1_1User1.setUsername(user1Username);
            progress_IS_1_1User1.setPassSeptember(user1PassSeptember);
            progress_IS_1_1User1.setPassOctober(user1PassOctober);
            progress_IS_1_1User1.setPassNovember(user1PassNovember);
            progress_IS_1_1User1.setPassDecember(user1PassDecember);
            progress_IS_1_1User1.setPassJanuary(user1PassJanuary);
            progress_IS_1_1User1.setPassFebruary(user1PassFebruary);
            progress_IS_1_1User1.setPassMarch(user1PassMarch);
            progress_IS_1_1User1.setPassApril(user1PassApril);
            progress_IS_1_1User1.setPassMay(user1PassMay);
            progress_IS_1_1User1.setPassJune(user1PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User1);

            //user2
            progress_IS_1_1User2.setUsername(user2Username);
            progress_IS_1_1User2.setPassSeptember(user2PassSeptember);
            progress_IS_1_1User2.setPassOctober(user2PassOctober);
            progress_IS_1_1User2.setPassNovember(user2PassNovember);
            progress_IS_1_1User2.setPassDecember(user2PassDecember);
            progress_IS_1_1User2.setPassJanuary(user2PassJanuary);
            progress_IS_1_1User2.setPassFebruary(user2PassFebruary);
            progress_IS_1_1User2.setPassMarch(user2PassMarch);
            progress_IS_1_1User2.setPassApril(user2PassApril);
            progress_IS_1_1User2.setPassMay(user2PassMay);
            progress_IS_1_1User2.setPassJune(user2PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User2);
//            //user3

            progress_IS_1_1User3.setUsername(user3Username);
            progress_IS_1_1User3.setPassSeptember(user3PassSeptember);
            progress_IS_1_1User3.setPassOctober(user3PassOctober);
            progress_IS_1_1User3.setPassNovember(user3PassNovember);
            progress_IS_1_1User3.setPassDecember(user3PassDecember);
            progress_IS_1_1User3.setPassJanuary(user3PassJanuary);
            progress_IS_1_1User3.setPassFebruary(user3PassFebruary);
            progress_IS_1_1User3.setPassMarch(user3PassMarch);
            progress_IS_1_1User3.setPassApril(user3PassApril);
            progress_IS_1_1User3.setPassMay(user3PassMay);
            progress_IS_1_1User3.setPassJune(user3PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User3);
//            //user4

            progress_IS_1_1User4.setUsername(user4Username);
            progress_IS_1_1User4.setPassSeptember(user4PassSeptember);
            progress_IS_1_1User4.setPassOctober(user4PassOctober);
            progress_IS_1_1User4.setPassNovember(user4PassNovember);
            progress_IS_1_1User4.setPassDecember(user4PassDecember);
            progress_IS_1_1User4.setPassJanuary(user4PassJanuary);
            progress_IS_1_1User4.setPassFebruary(user4PassFebruary);
            progress_IS_1_1User4.setPassMarch(user4PassMarch);
            progress_IS_1_1User4.setPassApril(user4PassApril);
            progress_IS_1_1User4.setPassMay(user4PassMay);
            progress_IS_1_1User4.setPassJune(user4PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User4);
//            //user5

            progress_IS_1_1User5.setUsername(user5Username);
            progress_IS_1_1User5.setPassSeptember(user5PassSeptember);
            progress_IS_1_1User5.setPassOctober(user5PassOctober);
            progress_IS_1_1User5.setPassNovember(user5PassNovember);
            progress_IS_1_1User5.setPassDecember(user5PassDecember);
            progress_IS_1_1User5.setPassJanuary(user5PassJanuary);
            progress_IS_1_1User5.setPassFebruary(user5PassFebruary);
            progress_IS_1_1User5.setPassMarch(user5PassMarch);
            progress_IS_1_1User5.setPassApril(user5PassApril);
            progress_IS_1_1User5.setPassMay(user5PassMay);
            progress_IS_1_1User5.setPassJune(user5PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User5);
//            //user6

            progress_IS_1_1User6.setUsername(user6Username);
            progress_IS_1_1User6.setPassSeptember(user6PassSeptember);
            progress_IS_1_1User6.setPassOctober(user6PassOctober);
            progress_IS_1_1User6.setPassNovember(user6PassNovember);
            progress_IS_1_1User6.setPassDecember(user6PassDecember);
            progress_IS_1_1User6.setPassJanuary(user6PassJanuary);
            progress_IS_1_1User6.setPassFebruary(user6PassFebruary);
            progress_IS_1_1User6.setPassMarch(user6PassMarch);
            progress_IS_1_1User6.setPassApril(user6PassApril);
            progress_IS_1_1User6.setPassMay(user6PassMay);
            progress_IS_1_1User6.setPassJune(user6PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User6);
//            //user7

            progress_IS_1_1User7.setUsername(user7Username);
            progress_IS_1_1User7.setPassSeptember(user7PassSeptember);
            progress_IS_1_1User7.setPassOctober(user7PassOctober);
            progress_IS_1_1User7.setPassNovember(user7PassNovember);
            progress_IS_1_1User7.setPassDecember(user7PassDecember);
            progress_IS_1_1User7.setPassJanuary(user7PassJanuary);
            progress_IS_1_1User7.setPassFebruary(user7PassFebruary);
            progress_IS_1_1User7.setPassMarch(user7PassMarch);
            progress_IS_1_1User7.setPassApril(user7PassApril);
            progress_IS_1_1User7.setPassMay(user7PassMay);
            progress_IS_1_1User7.setPassJune(user7PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User7);
//            //user8

            progress_IS_1_1User8.setUsername(user8Username);
            progress_IS_1_1User8.setPassSeptember(user8PassSeptember);
            progress_IS_1_1User8.setPassOctober(user8PassOctober);
            progress_IS_1_1User8.setPassNovember(user8PassNovember);
            progress_IS_1_1User8.setPassDecember(user8PassDecember);
            progress_IS_1_1User8.setPassJanuary(user8PassJanuary);
            progress_IS_1_1User8.setPassFebruary(user8PassFebruary);
            progress_IS_1_1User8.setPassMarch(user8PassMarch);
            progress_IS_1_1User8.setPassApril(user8PassApril);
            progress_IS_1_1User8.setPassMay(user8PassMay);
            progress_IS_1_1User8.setPassJune(user8PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User8);
//            //user9

            progress_IS_1_1User9.setUsername(user9Username);
            progress_IS_1_1User9.setPassSeptember(user9PassSeptember);
            progress_IS_1_1User9.setPassOctober(user9PassOctober);
            progress_IS_1_1User9.setPassNovember(user9PassNovember);
            progress_IS_1_1User9.setPassDecember(user9PassDecember);
            progress_IS_1_1User9.setPassJanuary(user9PassJanuary);
            progress_IS_1_1User9.setPassFebruary(user9PassFebruary);
            progress_IS_1_1User9.setPassMarch(user9PassMarch);
            progress_IS_1_1User9.setPassApril(user9PassApril);
            progress_IS_1_1User9.setPassMay(user9PassMay);
            progress_IS_1_1User9.setPassJune(user9PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User9);
//            //user10

            progress_IS_1_1User10.setUsername(user10Username);
            progress_IS_1_1User10.setPassSeptember(user10PassSeptember);
            progress_IS_1_1User10.setPassOctober(user10PassOctober);
            progress_IS_1_1User10.setPassNovember(user10PassNovember);
            progress_IS_1_1User10.setPassDecember(user10PassDecember);
            progress_IS_1_1User10.setPassJanuary(user10PassJanuary);
            progress_IS_1_1User10.setPassFebruary(user10PassFebruary);
            progress_IS_1_1User10.setPassMarch(user10PassMarch);
            progress_IS_1_1User10.setPassApril(user10PassApril);
            progress_IS_1_1User10.setPassMay(user10PassMay);
            progress_IS_1_1User10.setPassJune(user10PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User10);
//            //user11

            progress_IS_1_1User11.setUsername(user11Username);
            progress_IS_1_1User11.setPassSeptember(user11PassSeptember);
            progress_IS_1_1User11.setPassOctober(user11PassOctober);
            progress_IS_1_1User11.setPassNovember(user11PassNovember);
            progress_IS_1_1User11.setPassDecember(user11PassDecember);
            progress_IS_1_1User11.setPassJanuary(user11PassJanuary);
            progress_IS_1_1User11.setPassFebruary(user11PassFebruary);
            progress_IS_1_1User11.setPassMarch(user11PassMarch);
            progress_IS_1_1User11.setPassApril(user11PassApril);
            progress_IS_1_1User11.setPassMay(user11PassMay);
            progress_IS_1_1User11.setPassJune(user11PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User11);
//            //user12

            progress_IS_1_1User12.setUsername(user12Username);
            progress_IS_1_1User12.setPassSeptember(user12PassSeptember);
            progress_IS_1_1User12.setPassOctober(user12PassOctober);
            progress_IS_1_1User12.setPassNovember(user12PassNovember);
            progress_IS_1_1User12.setPassDecember(user12PassDecember);
            progress_IS_1_1User12.setPassJanuary(user12PassJanuary);
            progress_IS_1_1User12.setPassFebruary(user12PassFebruary);
            progress_IS_1_1User12.setPassMarch(user12PassMarch);
            progress_IS_1_1User12.setPassApril(user12PassApril);
            progress_IS_1_1User12.setPassMay(user12PassMay);
            progress_IS_1_1User12.setPassJune(user12PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User12);
//            //user13

            progress_IS_1_1User13.setUsername(user13Username);
            progress_IS_1_1User13.setPassSeptember(user13PassSeptember);
            progress_IS_1_1User13.setPassOctober(user13PassOctober);
            progress_IS_1_1User13.setPassNovember(user13PassNovember);
            progress_IS_1_1User13.setPassDecember(user13PassDecember);
            progress_IS_1_1User13.setPassJanuary(user13PassJanuary);
            progress_IS_1_1User13.setPassFebruary(user13PassFebruary);
            progress_IS_1_1User13.setPassMarch(user13PassMarch);
            progress_IS_1_1User13.setPassApril(user13PassApril);
            progress_IS_1_1User13.setPassMay(user13PassMay);
            progress_IS_1_1User13.setPassJune(user13PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User13);
//            //user14

            progress_IS_1_1User14.setUsername(user14Username);
            progress_IS_1_1User14.setPassSeptember(user14PassSeptember);
            progress_IS_1_1User14.setPassOctober(user14PassOctober);
            progress_IS_1_1User14.setPassNovember(user14PassNovember);
            progress_IS_1_1User14.setPassDecember(user14PassDecember);
            progress_IS_1_1User14.setPassJanuary(user14PassJanuary);
            progress_IS_1_1User14.setPassFebruary(user14PassFebruary);
            progress_IS_1_1User14.setPassMarch(user14PassMarch);
            progress_IS_1_1User14.setPassApril(user14PassApril);
            progress_IS_1_1User14.setPassMay(user14PassMay);
            progress_IS_1_1User14.setPassJune(user14PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User14);
//            //user15

            progress_IS_1_1User15.setUsername(user15Username);
            progress_IS_1_1User15.setPassSeptember(user15PassSeptember);
            progress_IS_1_1User15.setPassOctober(user15PassOctober);
            progress_IS_1_1User15.setPassNovember(user15PassNovember);
            progress_IS_1_1User15.setPassDecember(user15PassDecember);
            progress_IS_1_1User15.setPassJanuary(user15PassJanuary);
            progress_IS_1_1User15.setPassFebruary(user15PassFebruary);
            progress_IS_1_1User15.setPassMarch(user15PassMarch);
            progress_IS_1_1User15.setPassApril(user15PassApril);
            progress_IS_1_1User15.setPassMay(user15PassMay);
            progress_IS_1_1User15.setPassJune(user15PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User15);
//            //user16

            progress_IS_1_1User16.setUsername(user16Username);
            progress_IS_1_1User16.setPassSeptember(user16PassSeptember);
            progress_IS_1_1User16.setPassOctober(user16PassOctober);
            progress_IS_1_1User16.setPassNovember(user16PassNovember);
            progress_IS_1_1User16.setPassDecember(user16PassDecember);
            progress_IS_1_1User16.setPassJanuary(user16PassJanuary);
            progress_IS_1_1User16.setPassFebruary(user16PassFebruary);
            progress_IS_1_1User16.setPassMarch(user16PassMarch);
            progress_IS_1_1User16.setPassApril(user16PassApril);
            progress_IS_1_1User16.setPassMay(user16PassMay);
            progress_IS_1_1User16.setPassJune(user16PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User16);


            //            //user17

            progress_IS_1_1User17.setUsername(user17Username);
            progress_IS_1_1User17.setPassSeptember(user17PassSeptember);
            progress_IS_1_1User17.setPassOctober(user17PassOctober);
            progress_IS_1_1User17.setPassNovember(user17PassNovember);
            progress_IS_1_1User17.setPassDecember(user17PassDecember);
            progress_IS_1_1User17.setPassJanuary(user17PassJanuary);
            progress_IS_1_1User17.setPassFebruary(user17PassFebruary);
            progress_IS_1_1User17.setPassMarch(user17PassMarch);
            progress_IS_1_1User17.setPassApril(user17PassApril);
            progress_IS_1_1User17.setPassMay(user17PassMay);
            progress_IS_1_1User17.setPassJune(user17PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User17);

            //            //user18

            progress_IS_1_1User18.setUsername(user18Username);
            progress_IS_1_1User18.setPassSeptember(user18PassSeptember);
            progress_IS_1_1User18.setPassOctober(user18PassOctober);
            progress_IS_1_1User18.setPassNovember(user18PassNovember);
            progress_IS_1_1User18.setPassDecember(user18PassDecember);
            progress_IS_1_1User18.setPassJanuary(user18PassJanuary);
            progress_IS_1_1User18.setPassFebruary(user18PassFebruary);
            progress_IS_1_1User18.setPassMarch(user18PassMarch);
            progress_IS_1_1User18.setPassApril(user18PassApril);
            progress_IS_1_1User18.setPassMay(user18PassMay);
            progress_IS_1_1User18.setPassJune(user18PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User18);


            //            //user19

            progress_IS_1_1User19.setUsername(user19Username);
            progress_IS_1_1User19.setPassSeptember(user19PassSeptember);
            progress_IS_1_1User19.setPassOctober(user19PassOctober);
            progress_IS_1_1User19.setPassNovember(user19PassNovember);
            progress_IS_1_1User19.setPassDecember(user19PassDecember);
            progress_IS_1_1User19.setPassJanuary(user19PassJanuary);
            progress_IS_1_1User19.setPassFebruary(user19PassFebruary);
            progress_IS_1_1User19.setPassMarch(user19PassMarch);
            progress_IS_1_1User19.setPassApril(user19PassApril);
            progress_IS_1_1User19.setPassMay(user19PassMay);
            progress_IS_1_1User19.setPassJune(user19PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User19);

            //            //user20

            progress_IS_1_1User20.setUsername(user20Username);
            progress_IS_1_1User20.setPassSeptember(user20PassSeptember);
            progress_IS_1_1User20.setPassOctober(user20PassOctober);
            progress_IS_1_1User20.setPassNovember(user20PassNovember);
            progress_IS_1_1User20.setPassDecember(user20PassDecember);
            progress_IS_1_1User20.setPassJanuary(user20PassJanuary);
            progress_IS_1_1User20.setPassFebruary(user20PassFebruary);
            progress_IS_1_1User20.setPassMarch(user20PassMarch);
            progress_IS_1_1User20.setPassApril(user20PassApril);
            progress_IS_1_1User20.setPassMay(user20PassMay);
            progress_IS_1_1User20.setPassJune(user20PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User20);

            //            //user21

            progress_IS_1_1User21.setUsername(user21Username);
            progress_IS_1_1User21.setPassSeptember(user21PassSeptember);
            progress_IS_1_1User21.setPassOctober(user21PassOctober);
            progress_IS_1_1User21.setPassNovember(user21PassNovember);
            progress_IS_1_1User21.setPassDecember(user21PassDecember);
            progress_IS_1_1User21.setPassJanuary(user21PassJanuary);
            progress_IS_1_1User21.setPassFebruary(user21PassFebruary);
            progress_IS_1_1User21.setPassMarch(user21PassMarch);
            progress_IS_1_1User21.setPassApril(user21PassApril);
            progress_IS_1_1User21.setPassMay(user21PassMay);
            progress_IS_1_1User21.setPassJune(user21PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User21);

            //            //user22

            progress_IS_1_1User22.setUsername(user22Username);
            progress_IS_1_1User22.setPassSeptember(user22PassSeptember);
            progress_IS_1_1User22.setPassOctober(user22PassOctober);
            progress_IS_1_1User22.setPassNovember(user22PassNovember);
            progress_IS_1_1User22.setPassDecember(user22PassDecember);
            progress_IS_1_1User22.setPassJanuary(user22PassJanuary);
            progress_IS_1_1User22.setPassFebruary(user22PassFebruary);
            progress_IS_1_1User22.setPassMarch(user22PassMarch);
            progress_IS_1_1User22.setPassApril(user22PassApril);
            progress_IS_1_1User22.setPassMay(user22PassMay);
            progress_IS_1_1User22.setPassJune(user22PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User22);

            //            //user23

            progress_IS_1_1User23.setUsername(user23Username);
            progress_IS_1_1User23.setPassSeptember(user23PassSeptember);
            progress_IS_1_1User23.setPassOctober(user23PassOctober);
            progress_IS_1_1User23.setPassNovember(user23PassNovember);
            progress_IS_1_1User23.setPassDecember(user23PassDecember);
            progress_IS_1_1User23.setPassJanuary(user23PassJanuary);
            progress_IS_1_1User23.setPassFebruary(user23PassFebruary);
            progress_IS_1_1User23.setPassMarch(user23PassMarch);
            progress_IS_1_1User23.setPassApril(user23PassApril);
            progress_IS_1_1User23.setPassMay(user23PassMay);
            progress_IS_1_1User23.setPassJune(user23PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User23);

            //            //user24

            progress_IS_1_1User24.setUsername(user24Username);
            progress_IS_1_1User24.setPassSeptember(user24PassSeptember);
            progress_IS_1_1User24.setPassOctober(user24PassOctober);
            progress_IS_1_1User24.setPassNovember(user24PassNovember);
            progress_IS_1_1User24.setPassDecember(user24PassDecember);
            progress_IS_1_1User24.setPassJanuary(user24PassJanuary);
            progress_IS_1_1User24.setPassFebruary(user24PassFebruary);
            progress_IS_1_1User24.setPassMarch(user24PassMarch);
            progress_IS_1_1User24.setPassApril(user24PassApril);
            progress_IS_1_1User24.setPassMay(user24PassMay);
            progress_IS_1_1User24.setPassJune(user24PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User24);

            //            //user25

            progress_IS_1_1User25.setUsername(user25Username);
            progress_IS_1_1User25.setPassSeptember(user25PassSeptember);
            progress_IS_1_1User25.setPassOctober(user25PassOctober);
            progress_IS_1_1User25.setPassNovember(user25PassNovember);
            progress_IS_1_1User25.setPassDecember(user25PassDecember);
            progress_IS_1_1User25.setPassJanuary(user25PassJanuary);
            progress_IS_1_1User25.setPassFebruary(user25PassFebruary);
            progress_IS_1_1User25.setPassMarch(user25PassMarch);
            progress_IS_1_1User25.setPassApril(user25PassApril);
            progress_IS_1_1User25.setPassMay(user25PassMay);
            progress_IS_1_1User25.setPassJune(user25PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User25);

            //            //user26

            progress_IS_1_1User26.setUsername(user26Username);
            progress_IS_1_1User26.setPassSeptember(user26PassSeptember);
            progress_IS_1_1User26.setPassOctober(user26PassOctober);
            progress_IS_1_1User26.setPassNovember(user26PassNovember);
            progress_IS_1_1User26.setPassDecember(user26PassDecember);
            progress_IS_1_1User26.setPassJanuary(user26PassJanuary);
            progress_IS_1_1User26.setPassFebruary(user26PassFebruary);
            progress_IS_1_1User26.setPassMarch(user26PassMarch);
            progress_IS_1_1User26.setPassApril(user26PassApril);
            progress_IS_1_1User26.setPassMay(user26PassMay);
            progress_IS_1_1User26.setPassJune(user26PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User26);

            //            //user27

            progress_IS_1_1User27.setUsername(user27Username);
            progress_IS_1_1User27.setPassSeptember(user27PassSeptember);
            progress_IS_1_1User27.setPassOctober(user27PassOctober);
            progress_IS_1_1User27.setPassNovember(user27PassNovember);
            progress_IS_1_1User27.setPassDecember(user27PassDecember);
            progress_IS_1_1User27.setPassJanuary(user27PassJanuary);
            progress_IS_1_1User27.setPassFebruary(user27PassFebruary);
            progress_IS_1_1User27.setPassMarch(user27PassMarch);
            progress_IS_1_1User27.setPassApril(user27PassApril);
            progress_IS_1_1User27.setPassMay(user27PassMay);
            progress_IS_1_1User27.setPassJune(user27PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User27);

            //            //user28

            progress_IS_1_1User28.setUsername(user28Username);
            progress_IS_1_1User28.setPassSeptember(user28PassSeptember);
            progress_IS_1_1User28.setPassOctober(user28PassOctober);
            progress_IS_1_1User28.setPassNovember(user28PassNovember);
            progress_IS_1_1User28.setPassDecember(user28PassDecember);
            progress_IS_1_1User28.setPassJanuary(user28PassJanuary);
            progress_IS_1_1User28.setPassFebruary(user28PassFebruary);
            progress_IS_1_1User28.setPassMarch(user28PassMarch);
            progress_IS_1_1User28.setPassApril(user28PassApril);
            progress_IS_1_1User28.setPassMay(user28PassMay);
            progress_IS_1_1User28.setPassJune(user28PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User28);

            //            //user29

            progress_IS_1_1User29.setUsername(user29Username);
            progress_IS_1_1User29.setPassSeptember(user29PassSeptember);
            progress_IS_1_1User29.setPassOctober(user29PassOctober);
            progress_IS_1_1User29.setPassNovember(user29PassNovember);
            progress_IS_1_1User29.setPassDecember(user29PassDecember);
            progress_IS_1_1User29.setPassJanuary(user29PassJanuary);
            progress_IS_1_1User29.setPassFebruary(user29PassFebruary);
            progress_IS_1_1User29.setPassMarch(user29PassMarch);
            progress_IS_1_1User29.setPassApril(user29PassApril);
            progress_IS_1_1User29.setPassMay(user29PassMay);
            progress_IS_1_1User29.setPassJune(user29PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User29);

            //            //user30

            progress_IS_1_1User30.setUsername(user30Username);
            progress_IS_1_1User30.setPassSeptember(user30PassSeptember);
            progress_IS_1_1User30.setPassOctober(user30PassOctober);
            progress_IS_1_1User30.setPassNovember(user30PassNovember);
            progress_IS_1_1User30.setPassDecember(user30PassDecember);
            progress_IS_1_1User30.setPassJanuary(user30PassJanuary);
            progress_IS_1_1User30.setPassFebruary(user30PassFebruary);
            progress_IS_1_1User30.setPassMarch(user30PassMarch);
            progress_IS_1_1User30.setPassApril(user30PassApril);
            progress_IS_1_1User30.setPassMay(user30PassMay);
            progress_IS_1_1User30.setPassJune(user30PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User30);

            //            //user31

            progress_IS_1_1User31.setUsername(user31Username);
            progress_IS_1_1User31.setPassSeptember(user31PassSeptember);
            progress_IS_1_1User31.setPassOctober(user31PassOctober);
            progress_IS_1_1User31.setPassNovember(user31PassNovember);
            progress_IS_1_1User31.setPassDecember(user31PassDecember);
            progress_IS_1_1User31.setPassJanuary(user31PassJanuary);
            progress_IS_1_1User31.setPassFebruary(user31PassFebruary);
            progress_IS_1_1User31.setPassMarch(user31PassMarch);
            progress_IS_1_1User31.setPassApril(user31PassApril);
            progress_IS_1_1User31.setPassMay(user31PassMay);
            progress_IS_1_1User31.setPassJune(user31PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User31);

            //            //user32

            progress_IS_1_1User32.setUsername(user32Username);
            progress_IS_1_1User32.setPassSeptember(user32PassSeptember);
            progress_IS_1_1User32.setPassOctober(user32PassOctober);
            progress_IS_1_1User32.setPassNovember(user32PassNovember);
            progress_IS_1_1User32.setPassDecember(user32PassDecember);
            progress_IS_1_1User32.setPassJanuary(user32PassJanuary);
            progress_IS_1_1User32.setPassFebruary(user32PassFebruary);
            progress_IS_1_1User32.setPassMarch(user32PassMarch);
            progress_IS_1_1User32.setPassApril(user32PassApril);
            progress_IS_1_1User32.setPassMay(user32PassMay);
            progress_IS_1_1User32.setPassJune(user32PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User32);

            //            //user33

            progress_IS_1_1User33.setUsername(user33Username);
            progress_IS_1_1User33.setPassSeptember(user33PassSeptember);
            progress_IS_1_1User33.setPassOctober(user33PassOctober);
            progress_IS_1_1User33.setPassNovember(user33PassNovember);
            progress_IS_1_1User33.setPassDecember(user33PassDecember);
            progress_IS_1_1User33.setPassJanuary(user33PassJanuary);
            progress_IS_1_1User33.setPassFebruary(user33PassFebruary);
            progress_IS_1_1User33.setPassMarch(user33PassMarch);
            progress_IS_1_1User33.setPassApril(user33PassApril);
            progress_IS_1_1User33.setPassMay(user33PassMay);
            progress_IS_1_1User33.setPassJune(user33PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User33);

            //            //user34

            progress_IS_1_1User34.setUsername(user34Username);
            progress_IS_1_1User34.setPassSeptember(user34PassSeptember);
            progress_IS_1_1User34.setPassOctober(user34PassOctober);
            progress_IS_1_1User34.setPassNovember(user34PassNovember);
            progress_IS_1_1User34.setPassDecember(user34PassDecember);
            progress_IS_1_1User34.setPassJanuary(user34PassJanuary);
            progress_IS_1_1User34.setPassFebruary(user34PassFebruary);
            progress_IS_1_1User34.setPassMarch(user34PassMarch);
            progress_IS_1_1User34.setPassApril(user34PassApril);
            progress_IS_1_1User34.setPassMay(user34PassMay);
            progress_IS_1_1User34.setPassJune(user34PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User34);

            //            //user35

            progress_IS_1_1User35.setUsername(user35Username);
            progress_IS_1_1User35.setPassSeptember(user35PassSeptember);
            progress_IS_1_1User35.setPassOctober(user35PassOctober);
            progress_IS_1_1User35.setPassNovember(user35PassNovember);
            progress_IS_1_1User35.setPassDecember(user35PassDecember);
            progress_IS_1_1User35.setPassJanuary(user35PassJanuary);
            progress_IS_1_1User35.setPassFebruary(user35PassFebruary);
            progress_IS_1_1User35.setPassMarch(user35PassMarch);
            progress_IS_1_1User35.setPassApril(user35PassApril);
            progress_IS_1_1User35.setPassMay(user35PassMay);
            progress_IS_1_1User35.setPassJune(user35PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User35);

            //            //user36

            progress_IS_1_1User36.setUsername(user36Username);
            progress_IS_1_1User36.setPassSeptember(user36PassSeptember);
            progress_IS_1_1User36.setPassOctober(user36PassOctober);
            progress_IS_1_1User36.setPassNovember(user36PassNovember);
            progress_IS_1_1User36.setPassDecember(user36PassDecember);
            progress_IS_1_1User36.setPassJanuary(user36PassJanuary);
            progress_IS_1_1User36.setPassFebruary(user36PassFebruary);
            progress_IS_1_1User36.setPassMarch(user36PassMarch);
            progress_IS_1_1User36.setPassApril(user36PassApril);
            progress_IS_1_1User36.setPassMay(user36PassMay);
            progress_IS_1_1User36.setPassJune(user36PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User36);

            //            //user37

            progress_IS_1_1User37.setUsername(user37Username);
            progress_IS_1_1User37.setPassSeptember(user37PassSeptember);
            progress_IS_1_1User37.setPassOctober(user37PassOctober);
            progress_IS_1_1User37.setPassNovember(user37PassNovember);
            progress_IS_1_1User37.setPassDecember(user37PassDecember);
            progress_IS_1_1User37.setPassJanuary(user37PassJanuary);
            progress_IS_1_1User37.setPassFebruary(user37PassFebruary);
            progress_IS_1_1User37.setPassMarch(user37PassMarch);
            progress_IS_1_1User37.setPassApril(user37PassApril);
            progress_IS_1_1User37.setPassMay(user37PassMay);
            progress_IS_1_1User37.setPassJune(user37PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User37);

            //            //user38

            progress_IS_1_1User38.setUsername(user38Username);
            progress_IS_1_1User38.setPassSeptember(user38PassSeptember);
            progress_IS_1_1User38.setPassOctober(user38PassOctober);
            progress_IS_1_1User38.setPassNovember(user38PassNovember);
            progress_IS_1_1User38.setPassDecember(user38PassDecember);
            progress_IS_1_1User38.setPassJanuary(user38PassJanuary);
            progress_IS_1_1User38.setPassFebruary(user38PassFebruary);
            progress_IS_1_1User38.setPassMarch(user38PassMarch);
            progress_IS_1_1User38.setPassApril(user38PassApril);
            progress_IS_1_1User38.setPassMay(user38PassMay);
            progress_IS_1_1User38.setPassJune(user38PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User38);

            //            //user39

            progress_IS_1_1User39.setUsername(user39Username);
            progress_IS_1_1User39.setPassSeptember(user39PassSeptember);
            progress_IS_1_1User39.setPassOctober(user39PassOctober);
            progress_IS_1_1User39.setPassNovember(user39PassNovember);
            progress_IS_1_1User39.setPassDecember(user39PassDecember);
            progress_IS_1_1User39.setPassJanuary(user39PassJanuary);
            progress_IS_1_1User39.setPassFebruary(user39PassFebruary);
            progress_IS_1_1User39.setPassMarch(user39PassMarch);
            progress_IS_1_1User39.setPassApril(user39PassApril);
            progress_IS_1_1User39.setPassMay(user39PassMay);
            progress_IS_1_1User39.setPassJune(user39PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User39);

            //            //user40

            progress_IS_1_1User40.setUsername(user40Username);
            progress_IS_1_1User40.setPassSeptember(user40PassSeptember);
            progress_IS_1_1User40.setPassOctober(user40PassOctober);
            progress_IS_1_1User40.setPassNovember(user40PassNovember);
            progress_IS_1_1User40.setPassDecember(user40PassDecember);
            progress_IS_1_1User40.setPassJanuary(user40PassJanuary);
            progress_IS_1_1User40.setPassFebruary(user40PassFebruary);
            progress_IS_1_1User40.setPassMarch(user40PassMarch);
            progress_IS_1_1User40.setPassApril(user40PassApril);
            progress_IS_1_1User40.setPassMay(user40PassMay);
            progress_IS_1_1User40.setPassJune(user40PassJune);
            progress_is_1_1_repository.save(progress_IS_1_1User40);

        } catch (Exception ignore) {

        }

    }

}
