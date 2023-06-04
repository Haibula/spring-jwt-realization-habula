package com.example.demoauth.service.moderatorService.moderator_is1Service.course4;

import com.example.demoauth.models.grade_is1.models.course4.Grade_IS_1_1Course4Semester1;
import com.example.demoauth.repository.is1Repository.course4.Grade_IS_1_1Course4Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1Course4Semester1 {
    @Autowired
    Grade_IS_1_1Course4Semester1Repository gradeIs11Course4Semester1Repository;

    //GetMappingGradeCourse4Semester1
    public void getMappingMethodModer_is_1_1GreadeСourse4Semester1(@PathVariable String month, Model model) {

        List<Grade_IS_1_1Course4Semester1> res = gradeIs11Course4Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course4Semester1::getUserID));
        List<Grade_IS_1_1Course4Semester1> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester1> septemberList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester1> octoberList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester1> novemberList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester1> decemberList = new ArrayList<>();
        
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).getMonth().equals("september")) {
                septemberList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("october")) {
                octoberList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("november")) {
                novemberList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("december")) {
                decemberList.add(res.get(i));
            }
        }
        for (int i = 0; i < 50; i++) {
            voidList.add(new Grade_IS_1_1Course4Semester1());
        }

        if (month.equals("september") && !septemberList.isEmpty()) {
            model.addAttribute("post", septemberList);
        } else if (month.equals("october") && !octoberList.isEmpty()) {
            model.addAttribute("post", octoberList);
        } else if (month.equals("november") && !novemberList.isEmpty()) {
            model.addAttribute("post", novemberList);
        } else if (month.equals("december") && !decemberList.isEmpty()) {
            model.addAttribute("post", decemberList);
        } else {
            model.addAttribute("post", voidList);
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        }
    }

    //PostMappingGradeCourse4Semester1
    public void postMappingMethodModer_is_1_1GreadeСourse4Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1EnglishLanguage = splitUser1Grades[2];
            String user1PhysicalTraining = splitUser1Grades[3];
            String user1DevelopmentSoftwareModules = splitUser1Grades[4];
            String user1MobileApplicationDevelopment = splitUser1Grades[5];
            String user1SystemProgramming = splitUser1Grades[6];
            String user1SoftwareDevelopmentTechnology = splitUser1Grades[7];
            String user1ISRPO = splitUser1Grades[8];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2EnglishLanguage = splitUser2Grades[2];
            String user2PhysicalTraining = splitUser2Grades[3];
            String user2DevelopmentSoftwareModules = splitUser2Grades[4];
            String user2MobileApplicationDevelopment = splitUser2Grades[5];
            String user2SystemProgramming = splitUser2Grades[6];
            String user2SoftwareDevelopmentTechnology = splitUser2Grades[7];
            String user2ISRPO = splitUser2Grades[8];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3EnglishLanguage = splitUser3Grades[2];
            String user3PhysicalTraining = splitUser3Grades[3];
            String user3DevelopmentSoftwareModules = splitUser3Grades[4];
            String user3MobileApplicationDevelopment = splitUser3Grades[5];
            String user3SystemProgramming = splitUser3Grades[6];
            String user3SoftwareDevelopmentTechnology = splitUser3Grades[7];
            String user3ISRPO = splitUser3Grades[8];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4EnglishLanguage = splitUser4Grades[2];
            String user4PhysicalTraining = splitUser4Grades[3];
            String user4DevelopmentSoftwareModules = splitUser4Grades[4];
            String user4MobileApplicationDevelopment = splitUser4Grades[5];
            String user4SystemProgramming = splitUser4Grades[6];
            String user4SoftwareDevelopmentTechnology = splitUser4Grades[7];
            String user4ISRPO = splitUser4Grades[8];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5EnglishLanguage = splitUser5Grades[2];
            String user5PhysicalTraining = splitUser5Grades[3];
            String user5DevelopmentSoftwareModules = splitUser5Grades[4];
            String user5MobileApplicationDevelopment = splitUser5Grades[5];
            String user5SystemProgramming = splitUser5Grades[6];
            String user5SoftwareDevelopmentTechnology = splitUser5Grades[7];
            String user5ISRPO = splitUser5Grades[8];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6EnglishLanguage = splitUser6Grades[2];
            String user6PhysicalTraining = splitUser6Grades[3];
            String user6DevelopmentSoftwareModules = splitUser6Grades[4];
            String user6MobileApplicationDevelopment = splitUser6Grades[5];
            String user6SystemProgramming = splitUser6Grades[6];
            String user6SoftwareDevelopmentTechnology = splitUser6Grades[7];
            String user6ISRPO = splitUser6Grades[8];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7EnglishLanguage = splitUser7Grades[2];
            String user7PhysicalTraining = splitUser7Grades[3];
            String user7DevelopmentSoftwareModules = splitUser7Grades[4];
            String user7MobileApplicationDevelopment = splitUser7Grades[5];
            String user7SystemProgramming = splitUser7Grades[6];
            String user7SoftwareDevelopmentTechnology = splitUser7Grades[7];
            String user7ISRPO = splitUser7Grades[8];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8EnglishLanguage = splitUser8Grades[2];
            String user8PhysicalTraining = splitUser8Grades[3];
            String user8DevelopmentSoftwareModules = splitUser8Grades[4];
            String user8MobileApplicationDevelopment = splitUser8Grades[5];
            String user8SystemProgramming = splitUser8Grades[6];
            String user8SoftwareDevelopmentTechnology = splitUser8Grades[7];
            String user8ISRPO = splitUser8Grades[8];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9EnglishLanguage = splitUser9Grades[2];
            String user9PhysicalTraining = splitUser9Grades[3];
            String user9DevelopmentSoftwareModules = splitUser9Grades[4];
            String user9MobileApplicationDevelopment = splitUser9Grades[5];
            String user9SystemProgramming = splitUser9Grades[6];
            String user9SoftwareDevelopmentTechnology = splitUser9Grades[7];
            String user9ISRPO = splitUser9Grades[8];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10EnglishLanguage = splitUser10Grades[2];
            String user10PhysicalTraining = splitUser10Grades[3];
            String user10DevelopmentSoftwareModules = splitUser10Grades[4];
            String user10MobileApplicationDevelopment = splitUser10Grades[5];
            String user10SystemProgramming = splitUser10Grades[6];
            String user10SoftwareDevelopmentTechnology = splitUser10Grades[7];
            String user10ISRPO = splitUser10Grades[8];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11EnglishLanguage = splitUser11Grades[2];
            String user11PhysicalTraining = splitUser11Grades[3];
            String user11DevelopmentSoftwareModules = splitUser11Grades[4];
            String user11MobileApplicationDevelopment = splitUser11Grades[5];
            String user11SystemProgramming = splitUser11Grades[6];
            String user11SoftwareDevelopmentTechnology = splitUser11Grades[7];
            String user11ISRPO = splitUser11Grades[8];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12EnglishLanguage = splitUser12Grades[2];
            String user12PhysicalTraining = splitUser12Grades[3];
            String user12DevelopmentSoftwareModules = splitUser12Grades[4];
            String user12MobileApplicationDevelopment = splitUser12Grades[5];
            String user12SystemProgramming = splitUser12Grades[6];
            String user12SoftwareDevelopmentTechnology = splitUser12Grades[7];
            String user12ISRPO = splitUser12Grades[8];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13EnglishLanguage = splitUser13Grades[2];
            String user13PhysicalTraining = splitUser13Grades[3];
            String user13DevelopmentSoftwareModules = splitUser13Grades[4];
            String user13MobileApplicationDevelopment = splitUser13Grades[5];
            String user13SystemProgramming = splitUser13Grades[6];
            String user13SoftwareDevelopmentTechnology = splitUser13Grades[7];
            String user13ISRPO = splitUser13Grades[8];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14EnglishLanguage = splitUser14Grades[2];
            String user14PhysicalTraining = splitUser14Grades[3];
            String user14DevelopmentSoftwareModules = splitUser14Grades[4];
            String user14MobileApplicationDevelopment = splitUser14Grades[5];
            String user14SystemProgramming = splitUser14Grades[6];
            String user14SoftwareDevelopmentTechnology = splitUser14Grades[7];
            String user14ISRPO = splitUser14Grades[8];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15EnglishLanguage = splitUser15Grades[2];
            String user15PhysicalTraining = splitUser15Grades[3];
            String user15DevelopmentSoftwareModules = splitUser15Grades[4];
            String user15MobileApplicationDevelopment = splitUser15Grades[5];
            String user15SystemProgramming = splitUser15Grades[6];
            String user15SoftwareDevelopmentTechnology = splitUser15Grades[7];
            String user15ISRPO = splitUser15Grades[8];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16EnglishLanguage = splitUser16Grades[2];
            String user16PhysicalTraining = splitUser16Grades[3];
            String user16DevelopmentSoftwareModules = splitUser16Grades[4];
            String user16MobileApplicationDevelopment = splitUser16Grades[5];
            String user16SystemProgramming = splitUser16Grades[6];
            String user16SoftwareDevelopmentTechnology = splitUser16Grades[7];
            String user16ISRPO = splitUser16Grades[8];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17EnglishLanguage = splitUser17Grades[2];
            String user17PhysicalTraining = splitUser17Grades[3];
            String user17DevelopmentSoftwareModules = splitUser17Grades[4];
            String user17MobileApplicationDevelopment = splitUser17Grades[5];
            String user17SystemProgramming = splitUser17Grades[6];
            String user17SoftwareDevelopmentTechnology = splitUser17Grades[7];
            String user17ISRPO = splitUser17Grades[8];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18EnglishLanguage = splitUser18Grades[2];
            String user18PhysicalTraining = splitUser18Grades[3];
            String user18DevelopmentSoftwareModules = splitUser18Grades[4];
            String user18MobileApplicationDevelopment = splitUser18Grades[5];
            String user18SystemProgramming = splitUser18Grades[6];
            String user18SoftwareDevelopmentTechnology = splitUser18Grades[7];
            String user18ISRPO = splitUser18Grades[8];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19EnglishLanguage = splitUser19Grades[2];
            String user19PhysicalTraining = splitUser19Grades[3];
            String user19DevelopmentSoftwareModules = splitUser19Grades[4];
            String user19MobileApplicationDevelopment = splitUser19Grades[5];
            String user19SystemProgramming = splitUser19Grades[6];
            String user19SoftwareDevelopmentTechnology = splitUser19Grades[7];
            String user19ISRPO = splitUser19Grades[8];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20EnglishLanguage = splitUser20Grades[2];
            String user20PhysicalTraining = splitUser20Grades[3];
            String user20DevelopmentSoftwareModules = splitUser20Grades[4];
            String user20MobileApplicationDevelopment = splitUser20Grades[5];
            String user20SystemProgramming = splitUser20Grades[6];
            String user20SoftwareDevelopmentTechnology = splitUser20Grades[7];
            String user20ISRPO = splitUser20Grades[8];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21EnglishLanguage = splitUser21Grades[2];
            String user21PhysicalTraining = splitUser21Grades[3];
            String user21DevelopmentSoftwareModules = splitUser21Grades[4];
            String user21MobileApplicationDevelopment = splitUser21Grades[5];
            String user21SystemProgramming = splitUser21Grades[6];
            String user21SoftwareDevelopmentTechnology = splitUser21Grades[7];
            String user21ISRPO = splitUser21Grades[8];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22EnglishLanguage = splitUser22Grades[2];
            String user22PhysicalTraining = splitUser22Grades[3];
            String user22DevelopmentSoftwareModules = splitUser22Grades[4];
            String user22MobileApplicationDevelopment = splitUser22Grades[5];
            String user22SystemProgramming = splitUser22Grades[6];
            String user22SoftwareDevelopmentTechnology = splitUser22Grades[7];
            String user22ISRPO = splitUser22Grades[8];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23EnglishLanguage = splitUser23Grades[2];
            String user23PhysicalTraining = splitUser23Grades[3];
            String user23DevelopmentSoftwareModules = splitUser23Grades[4];
            String user23MobileApplicationDevelopment = splitUser23Grades[5];
            String user23SystemProgramming = splitUser23Grades[6];
            String user23SoftwareDevelopmentTechnology = splitUser23Grades[7];
            String user23ISRPO = splitUser23Grades[8];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24EnglishLanguage = splitUser24Grades[2];
            String user24PhysicalTraining = splitUser24Grades[3];
            String user24DevelopmentSoftwareModules = splitUser24Grades[4];
            String user24MobileApplicationDevelopment = splitUser24Grades[5];
            String user24SystemProgramming = splitUser24Grades[6];
            String user24SoftwareDevelopmentTechnology = splitUser24Grades[7];
            String user24ISRPO = splitUser24Grades[8];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25EnglishLanguage = splitUser25Grades[2];
            String user25PhysicalTraining = splitUser25Grades[3];
            String user25DevelopmentSoftwareModules = splitUser25Grades[4];
            String user25MobileApplicationDevelopment = splitUser25Grades[5];
            String user25SystemProgramming = splitUser25Grades[6];
            String user25SoftwareDevelopmentTechnology = splitUser25Grades[7];
            String user25ISRPO = splitUser25Grades[8];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26EnglishLanguage = splitUser26Grades[2];
            String user26PhysicalTraining = splitUser26Grades[3];
            String user26DevelopmentSoftwareModules = splitUser26Grades[4];
            String user26MobileApplicationDevelopment = splitUser26Grades[5];
            String user26SystemProgramming = splitUser26Grades[6];
            String user26SoftwareDevelopmentTechnology = splitUser26Grades[7];
            String user26ISRPO = splitUser26Grades[8];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27EnglishLanguage = splitUser27Grades[2];
            String user27PhysicalTraining = splitUser27Grades[3];
            String user27DevelopmentSoftwareModules = splitUser27Grades[4];
            String user27MobileApplicationDevelopment = splitUser27Grades[5];
            String user27SystemProgramming = splitUser27Grades[6];
            String user27SoftwareDevelopmentTechnology = splitUser27Grades[7];
            String user27ISRPO = splitUser27Grades[8];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28EnglishLanguage = splitUser28Grades[2];
            String user28PhysicalTraining = splitUser28Grades[3];
            String user28DevelopmentSoftwareModules = splitUser28Grades[4];
            String user28MobileApplicationDevelopment = splitUser28Grades[5];
            String user28SystemProgramming = splitUser28Grades[6];
            String user28SoftwareDevelopmentTechnology = splitUser28Grades[7];
            String user28ISRPO = splitUser28Grades[8];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29EnglishLanguage = splitUser29Grades[2];
            String user29PhysicalTraining = splitUser29Grades[3];
            String user29DevelopmentSoftwareModules = splitUser29Grades[4];
            String user29MobileApplicationDevelopment = splitUser29Grades[5];
            String user29SystemProgramming = splitUser29Grades[6];
            String user29SoftwareDevelopmentTechnology = splitUser29Grades[7];
            String user29ISRPO = splitUser29Grades[8];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30EnglishLanguage = splitUser30Grades[2];
            String user30PhysicalTraining = splitUser30Grades[3];
            String user30DevelopmentSoftwareModules = splitUser30Grades[4];
            String user30MobileApplicationDevelopment = splitUser30Grades[5];
            String user30SystemProgramming = splitUser30Grades[6];
            String user30SoftwareDevelopmentTechnology = splitUser30Grades[7];
            String user30ISRPO = splitUser30Grades[8];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31EnglishLanguage = splitUser31Grades[2];
            String user31PhysicalTraining = splitUser31Grades[3];
            String user31DevelopmentSoftwareModules = splitUser31Grades[4];
            String user31MobileApplicationDevelopment = splitUser31Grades[5];
            String user31SystemProgramming = splitUser31Grades[6];
            String user31SoftwareDevelopmentTechnology = splitUser31Grades[7];
            String user31ISRPO = splitUser31Grades[8];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32EnglishLanguage = splitUser32Grades[2];
            String user32PhysicalTraining = splitUser32Grades[3];
            String user32DevelopmentSoftwareModules = splitUser32Grades[4];
            String user32MobileApplicationDevelopment = splitUser32Grades[5];
            String user32SystemProgramming = splitUser32Grades[6];
            String user32SoftwareDevelopmentTechnology = splitUser32Grades[7];
            String user32ISRPO = splitUser32Grades[8];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33EnglishLanguage = splitUser33Grades[2];
            String user33PhysicalTraining = splitUser33Grades[3];
            String user33DevelopmentSoftwareModules = splitUser33Grades[4];
            String user33MobileApplicationDevelopment = splitUser33Grades[5];
            String user33SystemProgramming = splitUser33Grades[6];
            String user33SoftwareDevelopmentTechnology = splitUser33Grades[7];
            String user33ISRPO = splitUser33Grades[8];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34EnglishLanguage = splitUser34Grades[2];
            String user34PhysicalTraining = splitUser34Grades[3];
            String user34DevelopmentSoftwareModules = splitUser34Grades[4];
            String user34MobileApplicationDevelopment = splitUser34Grades[5];
            String user34SystemProgramming = splitUser34Grades[6];
            String user34SoftwareDevelopmentTechnology = splitUser34Grades[7];
            String user34ISRPO = splitUser34Grades[8];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35EnglishLanguage = splitUser35Grades[2];
            String user35PhysicalTraining = splitUser35Grades[3];
            String user35DevelopmentSoftwareModules = splitUser35Grades[4];
            String user35MobileApplicationDevelopment = splitUser35Grades[5];
            String user35SystemProgramming = splitUser35Grades[6];
            String user35SoftwareDevelopmentTechnology = splitUser35Grades[7];
            String user35ISRPO = splitUser35Grades[8];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36EnglishLanguage = splitUser36Grades[2];
            String user36PhysicalTraining = splitUser36Grades[3];
            String user36DevelopmentSoftwareModules = splitUser36Grades[4];
            String user36MobileApplicationDevelopment = splitUser36Grades[5];
            String user36SystemProgramming = splitUser36Grades[6];
            String user36SoftwareDevelopmentTechnology = splitUser36Grades[7];
            String user36ISRPO = splitUser36Grades[8];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37EnglishLanguage = splitUser37Grades[2];
            String user37PhysicalTraining = splitUser37Grades[3];
            String user37DevelopmentSoftwareModules = splitUser37Grades[4];
            String user37MobileApplicationDevelopment = splitUser37Grades[5];
            String user37SystemProgramming = splitUser37Grades[6];
            String user37SoftwareDevelopmentTechnology = splitUser37Grades[7];
            String user37ISRPO = splitUser37Grades[8];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38EnglishLanguage = splitUser38Grades[2];
            String user38PhysicalTraining = splitUser38Grades[3];
            String user38DevelopmentSoftwareModules = splitUser38Grades[4];
            String user38MobileApplicationDevelopment = splitUser38Grades[5];
            String user38SystemProgramming = splitUser38Grades[6];
            String user38SoftwareDevelopmentTechnology = splitUser38Grades[7];
            String user38ISRPO = splitUser38Grades[8];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39EnglishLanguage = splitUser39Grades[2];
            String user39PhysicalTraining = splitUser39Grades[3];
            String user39DevelopmentSoftwareModules = splitUser39Grades[4];
            String user39MobileApplicationDevelopment = splitUser39Grades[5];
            String user39SystemProgramming = splitUser39Grades[6];
            String user39SoftwareDevelopmentTechnology = splitUser39Grades[7];
            String user39ISRPO = splitUser39Grades[8];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40EnglishLanguage = splitUser40Grades[2];
            String user40PhysicalTraining = splitUser40Grades[3];
            String user40DevelopmentSoftwareModules = splitUser40Grades[4];
            String user40MobileApplicationDevelopment = splitUser40Grades[5];
            String user40SystemProgramming = splitUser40Grades[6];
            String user40SoftwareDevelopmentTechnology = splitUser40Grades[7];
            String user40ISRPO = splitUser40Grades[8];


            ArrayList<Grade_IS_1_1Course4Semester1> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course4Semester1(user1Id, user1Username, user1EnglishLanguage, user1PhysicalTraining, user1DevelopmentSoftwareModules, user1MobileApplicationDevelopment, user1SystemProgramming, user1SoftwareDevelopmentTechnology, user1ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user2Id, user2Username, user2EnglishLanguage, user2PhysicalTraining, user2DevelopmentSoftwareModules, user2MobileApplicationDevelopment, user2SystemProgramming, user2SoftwareDevelopmentTechnology, user2ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user3Id, user3Username, user3EnglishLanguage, user3PhysicalTraining, user3DevelopmentSoftwareModules, user3MobileApplicationDevelopment, user3SystemProgramming, user3SoftwareDevelopmentTechnology, user3ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user4Id, user4Username, user4EnglishLanguage, user4PhysicalTraining, user4DevelopmentSoftwareModules, user4MobileApplicationDevelopment, user4SystemProgramming, user4SoftwareDevelopmentTechnology, user4ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user5Id, user5Username, user5EnglishLanguage, user5PhysicalTraining, user5DevelopmentSoftwareModules, user5MobileApplicationDevelopment, user5SystemProgramming, user5SoftwareDevelopmentTechnology, user5ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user6Id, user6Username, user6EnglishLanguage, user6PhysicalTraining, user6DevelopmentSoftwareModules, user6MobileApplicationDevelopment, user6SystemProgramming, user6SoftwareDevelopmentTechnology, user6ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user7Id, user7Username, user7EnglishLanguage, user7PhysicalTraining, user7DevelopmentSoftwareModules, user7MobileApplicationDevelopment, user7SystemProgramming, user7SoftwareDevelopmentTechnology, user7ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user8Id, user8Username, user8EnglishLanguage, user8PhysicalTraining, user8DevelopmentSoftwareModules, user8MobileApplicationDevelopment, user8SystemProgramming, user8SoftwareDevelopmentTechnology, user8ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user9Id, user9Username, user9EnglishLanguage, user9PhysicalTraining, user9DevelopmentSoftwareModules, user9MobileApplicationDevelopment, user9SystemProgramming, user9SoftwareDevelopmentTechnology, user9ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user10Id, user10Username, user10EnglishLanguage, user10PhysicalTraining, user10DevelopmentSoftwareModules, user10MobileApplicationDevelopment, user10SystemProgramming, user10SoftwareDevelopmentTechnology, user10ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user11Id, user11Username, user11EnglishLanguage, user11PhysicalTraining, user11DevelopmentSoftwareModules, user11MobileApplicationDevelopment, user11SystemProgramming, user11SoftwareDevelopmentTechnology, user11ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user12Id, user12Username, user12EnglishLanguage, user12PhysicalTraining, user12DevelopmentSoftwareModules, user12MobileApplicationDevelopment, user12SystemProgramming, user12SoftwareDevelopmentTechnology, user12ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user13Id, user13Username, user13EnglishLanguage, user13PhysicalTraining, user13DevelopmentSoftwareModules, user13MobileApplicationDevelopment, user13SystemProgramming, user13SoftwareDevelopmentTechnology, user13ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user14Id, user14Username, user14EnglishLanguage, user14PhysicalTraining, user14DevelopmentSoftwareModules, user14MobileApplicationDevelopment, user14SystemProgramming, user14SoftwareDevelopmentTechnology, user14ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user15Id, user15Username, user15EnglishLanguage, user15PhysicalTraining, user15DevelopmentSoftwareModules, user15MobileApplicationDevelopment, user15SystemProgramming, user15SoftwareDevelopmentTechnology, user15ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user16Id, user16Username, user16EnglishLanguage, user16PhysicalTraining, user16DevelopmentSoftwareModules, user16MobileApplicationDevelopment, user16SystemProgramming, user16SoftwareDevelopmentTechnology, user16ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user17Id, user17Username, user17EnglishLanguage, user17PhysicalTraining, user17DevelopmentSoftwareModules, user17MobileApplicationDevelopment, user17SystemProgramming, user17SoftwareDevelopmentTechnology, user17ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user18Id, user18Username, user18EnglishLanguage, user18PhysicalTraining, user18DevelopmentSoftwareModules, user18MobileApplicationDevelopment, user18SystemProgramming, user18SoftwareDevelopmentTechnology, user18ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user19Id, user19Username, user19EnglishLanguage, user19PhysicalTraining, user19DevelopmentSoftwareModules, user19MobileApplicationDevelopment, user19SystemProgramming, user19SoftwareDevelopmentTechnology, user19ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user20Id, user20Username, user20EnglishLanguage, user20PhysicalTraining, user20DevelopmentSoftwareModules, user20MobileApplicationDevelopment, user20SystemProgramming, user20SoftwareDevelopmentTechnology, user20ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user21Id, user21Username, user21EnglishLanguage, user21PhysicalTraining, user21DevelopmentSoftwareModules, user21MobileApplicationDevelopment, user21SystemProgramming, user21SoftwareDevelopmentTechnology, user21ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user22Id, user22Username, user22EnglishLanguage, user22PhysicalTraining, user22DevelopmentSoftwareModules, user22MobileApplicationDevelopment, user22SystemProgramming, user22SoftwareDevelopmentTechnology, user22ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user23Id, user23Username, user23EnglishLanguage, user23PhysicalTraining, user23DevelopmentSoftwareModules, user23MobileApplicationDevelopment, user23SystemProgramming, user23SoftwareDevelopmentTechnology, user23ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user24Id, user24Username, user24EnglishLanguage, user24PhysicalTraining, user24DevelopmentSoftwareModules, user24MobileApplicationDevelopment, user24SystemProgramming, user24SoftwareDevelopmentTechnology, user24ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user25Id, user25Username, user25EnglishLanguage, user25PhysicalTraining, user25DevelopmentSoftwareModules, user25MobileApplicationDevelopment, user25SystemProgramming, user25SoftwareDevelopmentTechnology, user25ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user26Id, user26Username, user26EnglishLanguage, user26PhysicalTraining, user26DevelopmentSoftwareModules, user26MobileApplicationDevelopment, user26SystemProgramming, user26SoftwareDevelopmentTechnology, user26ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user27Id, user27Username, user27EnglishLanguage, user27PhysicalTraining, user27DevelopmentSoftwareModules, user27MobileApplicationDevelopment, user27SystemProgramming, user27SoftwareDevelopmentTechnology, user27ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user28Id, user28Username, user28EnglishLanguage, user28PhysicalTraining, user28DevelopmentSoftwareModules, user28MobileApplicationDevelopment, user28SystemProgramming, user28SoftwareDevelopmentTechnology, user28ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user29Id, user29Username, user29EnglishLanguage, user29PhysicalTraining, user29DevelopmentSoftwareModules, user29MobileApplicationDevelopment, user29SystemProgramming, user29SoftwareDevelopmentTechnology, user29ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user30Id, user30Username, user30EnglishLanguage, user30PhysicalTraining, user30DevelopmentSoftwareModules, user30MobileApplicationDevelopment, user30SystemProgramming, user30SoftwareDevelopmentTechnology, user30ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user31Id, user31Username, user31EnglishLanguage, user31PhysicalTraining, user31DevelopmentSoftwareModules, user31MobileApplicationDevelopment, user31SystemProgramming, user31SoftwareDevelopmentTechnology, user31ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user32Id, user32Username, user32EnglishLanguage, user32PhysicalTraining, user32DevelopmentSoftwareModules, user32MobileApplicationDevelopment, user32SystemProgramming, user32SoftwareDevelopmentTechnology, user32ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user33Id, user33Username, user33EnglishLanguage, user33PhysicalTraining, user33DevelopmentSoftwareModules, user33MobileApplicationDevelopment, user33SystemProgramming, user33SoftwareDevelopmentTechnology, user33ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user34Id, user34Username, user34EnglishLanguage, user34PhysicalTraining, user34DevelopmentSoftwareModules, user34MobileApplicationDevelopment, user34SystemProgramming, user34SoftwareDevelopmentTechnology, user34ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user35Id, user35Username, user35EnglishLanguage, user35PhysicalTraining, user35DevelopmentSoftwareModules, user35MobileApplicationDevelopment, user35SystemProgramming, user35SoftwareDevelopmentTechnology, user35ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user36Id, user36Username, user36EnglishLanguage, user36PhysicalTraining, user36DevelopmentSoftwareModules, user36MobileApplicationDevelopment, user36SystemProgramming, user36SoftwareDevelopmentTechnology, user36ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user37Id, user37Username, user37EnglishLanguage, user37PhysicalTraining, user37DevelopmentSoftwareModules, user37MobileApplicationDevelopment, user37SystemProgramming, user37SoftwareDevelopmentTechnology, user37ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user38Id, user38Username, user38EnglishLanguage, user38PhysicalTraining, user38DevelopmentSoftwareModules, user38MobileApplicationDevelopment, user38SystemProgramming, user38SoftwareDevelopmentTechnology, user38ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user39Id, user39Username, user39EnglishLanguage, user39PhysicalTraining, user39DevelopmentSoftwareModules, user39MobileApplicationDevelopment, user39SystemProgramming, user39SoftwareDevelopmentTechnology, user39ISRPO, month));
            addArr.add(new Grade_IS_1_1Course4Semester1(user40Id, user40Username, user40EnglishLanguage, user40PhysicalTraining, user40DevelopmentSoftwareModules, user40MobileApplicationDevelopment, user40SystemProgramming, user40SoftwareDevelopmentTechnology, user40ISRPO, month));


            if (gradeIs11Course4Semester1Repository.findAll().isEmpty()) {
                gradeIs11Course4Semester1Repository.saveAll(addArr);
            }
            if (!gradeIs11Course4Semester1Repository.existsByMonth(month)) {
                gradeIs11Course4Semester1Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course4Semester1> listAllGrade = gradeIs11Course4Semester1Repository.findAll();
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User1 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User2 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User3 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User4 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User5 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User6 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User7 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User8 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User9 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User10 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User11 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User12 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User13 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User14 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User15 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User16 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User17 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User18 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User19 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User20 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User21 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User22 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User23 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User24 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User25 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User26 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User27 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User28 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User29 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User30 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User31 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User32 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User33 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User34 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User35 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User36 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User37 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User38 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User39 = null;
            Grade_IS_1_1Course4Semester1 grade_IS_1_1Course4Semester1User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester1User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_IS_1_1Course4Semester1User1.setUsername(user1Username);
            grade_IS_1_1Course4Semester1User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_IS_1_1Course4Semester1User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_IS_1_1Course4Semester1User1.setGradeDevelopmentSoftwareModules(user1DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User1.setGradeMobileApplicationDevelopment(user1MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User1.setGradeSystemProgramming(user1SystemProgramming);
            grade_IS_1_1Course4Semester1User1.setGradeSoftwareDevelopmentTechnology(user1SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User1.setGradeISRPO(user1ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User1);

            //user2
            grade_IS_1_1Course4Semester1User2.setUsername(user2Username);
            grade_IS_1_1Course4Semester1User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_IS_1_1Course4Semester1User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_IS_1_1Course4Semester1User2.setGradeDevelopmentSoftwareModules(user2DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User2.setGradeMobileApplicationDevelopment(user2MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User2.setGradeSystemProgramming(user2SystemProgramming);
            grade_IS_1_1Course4Semester1User2.setGradeSoftwareDevelopmentTechnology(user2SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User2.setGradeISRPO(user2ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User2);

            //            //user3
            grade_IS_1_1Course4Semester1User3.setUsername(user3Username);
            grade_IS_1_1Course4Semester1User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_IS_1_1Course4Semester1User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_IS_1_1Course4Semester1User3.setGradeDevelopmentSoftwareModules(user3DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User3.setGradeMobileApplicationDevelopment(user3MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User3.setGradeSystemProgramming(user3SystemProgramming);
            grade_IS_1_1Course4Semester1User3.setGradeSoftwareDevelopmentTechnology(user3SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User3.setGradeISRPO(user3ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User3);

            //            //user4
            grade_IS_1_1Course4Semester1User4.setUsername(user4Username);
            grade_IS_1_1Course4Semester1User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_IS_1_1Course4Semester1User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_IS_1_1Course4Semester1User4.setGradeDevelopmentSoftwareModules(user4DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User4.setGradeMobileApplicationDevelopment(user4MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User4.setGradeSystemProgramming(user4SystemProgramming);
            grade_IS_1_1Course4Semester1User4.setGradeSoftwareDevelopmentTechnology(user4SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User4.setGradeISRPO(user4ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User4);

//            //user5
            grade_IS_1_1Course4Semester1User5.setUsername(user5Username);
            grade_IS_1_1Course4Semester1User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_IS_1_1Course4Semester1User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_IS_1_1Course4Semester1User5.setGradeDevelopmentSoftwareModules(user5DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User5.setGradeMobileApplicationDevelopment(user5MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User5.setGradeSystemProgramming(user5SystemProgramming);
            grade_IS_1_1Course4Semester1User5.setGradeSoftwareDevelopmentTechnology(user5SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User5.setGradeISRPO(user5ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User5);

            //            //user6
            grade_IS_1_1Course4Semester1User6.setUsername(user6Username);
            grade_IS_1_1Course4Semester1User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_IS_1_1Course4Semester1User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_IS_1_1Course4Semester1User6.setGradeDevelopmentSoftwareModules(user6DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User6.setGradeMobileApplicationDevelopment(user6MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User6.setGradeSystemProgramming(user6SystemProgramming);
            grade_IS_1_1Course4Semester1User6.setGradeSoftwareDevelopmentTechnology(user6SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User6.setGradeISRPO(user6ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User6);

            //            //user7
            grade_IS_1_1Course4Semester1User7.setUsername(user7Username);
            grade_IS_1_1Course4Semester1User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_IS_1_1Course4Semester1User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_IS_1_1Course4Semester1User7.setGradeDevelopmentSoftwareModules(user7DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User7.setGradeMobileApplicationDevelopment(user7MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User7.setGradeSystemProgramming(user7SystemProgramming);
            grade_IS_1_1Course4Semester1User7.setGradeSoftwareDevelopmentTechnology(user7SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User7.setGradeISRPO(user7ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User7);

            //            //user8
            grade_IS_1_1Course4Semester1User8.setUsername(user8Username);
            grade_IS_1_1Course4Semester1User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_IS_1_1Course4Semester1User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_IS_1_1Course4Semester1User8.setGradeDevelopmentSoftwareModules(user8DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User8.setGradeMobileApplicationDevelopment(user8MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User8.setGradeSystemProgramming(user8SystemProgramming);
            grade_IS_1_1Course4Semester1User8.setGradeSoftwareDevelopmentTechnology(user8SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User8.setGradeISRPO(user8ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User8);

            //            //user9
            grade_IS_1_1Course4Semester1User9.setUsername(user9Username);
            grade_IS_1_1Course4Semester1User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_IS_1_1Course4Semester1User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_IS_1_1Course4Semester1User9.setGradeDevelopmentSoftwareModules(user9DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User9.setGradeMobileApplicationDevelopment(user9MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User9.setGradeSystemProgramming(user9SystemProgramming);
            grade_IS_1_1Course4Semester1User9.setGradeSoftwareDevelopmentTechnology(user9SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User9.setGradeISRPO(user9ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User9);


            //            //user10
            grade_IS_1_1Course4Semester1User10.setUsername(user10Username);
            grade_IS_1_1Course4Semester1User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_IS_1_1Course4Semester1User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_IS_1_1Course4Semester1User10.setGradeDevelopmentSoftwareModules(user10DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User10.setGradeMobileApplicationDevelopment(user10MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User10.setGradeSystemProgramming(user10SystemProgramming);
            grade_IS_1_1Course4Semester1User10.setGradeSoftwareDevelopmentTechnology(user10SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User10.setGradeISRPO(user10ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User10);

            //            //user11
            grade_IS_1_1Course4Semester1User11.setUsername(user11Username);
            grade_IS_1_1Course4Semester1User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_IS_1_1Course4Semester1User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_IS_1_1Course4Semester1User11.setGradeDevelopmentSoftwareModules(user11DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User11.setGradeMobileApplicationDevelopment(user11MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User11.setGradeSystemProgramming(user11SystemProgramming);
            grade_IS_1_1Course4Semester1User11.setGradeSoftwareDevelopmentTechnology(user11SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User11.setGradeISRPO(user11ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User11);


            //            //user12
            grade_IS_1_1Course4Semester1User12.setUsername(user12Username);
            grade_IS_1_1Course4Semester1User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_IS_1_1Course4Semester1User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_IS_1_1Course4Semester1User12.setGradeDevelopmentSoftwareModules(user12DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User12.setGradeMobileApplicationDevelopment(user12MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User12.setGradeSystemProgramming(user12SystemProgramming);
            grade_IS_1_1Course4Semester1User12.setGradeSoftwareDevelopmentTechnology(user12SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User12.setGradeISRPO(user12ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User12);

            //            //user13
            grade_IS_1_1Course4Semester1User13.setUsername(user13Username);
            grade_IS_1_1Course4Semester1User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_IS_1_1Course4Semester1User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_IS_1_1Course4Semester1User13.setGradeDevelopmentSoftwareModules(user13DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User13.setGradeMobileApplicationDevelopment(user13MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User13.setGradeSystemProgramming(user13SystemProgramming);
            grade_IS_1_1Course4Semester1User13.setGradeSoftwareDevelopmentTechnology(user13SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User13.setGradeISRPO(user13ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User13);

            //            //user14
            grade_IS_1_1Course4Semester1User14.setUsername(user14Username);
            grade_IS_1_1Course4Semester1User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_IS_1_1Course4Semester1User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_IS_1_1Course4Semester1User14.setGradeDevelopmentSoftwareModules(user14DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User14.setGradeMobileApplicationDevelopment(user14MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User14.setGradeSystemProgramming(user14SystemProgramming);
            grade_IS_1_1Course4Semester1User14.setGradeSoftwareDevelopmentTechnology(user14SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User14.setGradeISRPO(user14ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User14);

            //            //user15
            grade_IS_1_1Course4Semester1User15.setUsername(user15Username);
            grade_IS_1_1Course4Semester1User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_IS_1_1Course4Semester1User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_IS_1_1Course4Semester1User15.setGradeDevelopmentSoftwareModules(user15DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User15.setGradeMobileApplicationDevelopment(user15MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User15.setGradeSystemProgramming(user15SystemProgramming);
            grade_IS_1_1Course4Semester1User15.setGradeSoftwareDevelopmentTechnology(user15SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User15.setGradeISRPO(user15ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User15);

            //           //user16

            grade_IS_1_1Course4Semester1User16.setUsername(user16Username);
            grade_IS_1_1Course4Semester1User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_IS_1_1Course4Semester1User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_IS_1_1Course4Semester1User16.setGradeDevelopmentSoftwareModules(user16DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User16.setGradeMobileApplicationDevelopment(user16MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User16.setGradeSystemProgramming(user16SystemProgramming);
            grade_IS_1_1Course4Semester1User16.setGradeSoftwareDevelopmentTechnology(user16SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User16.setGradeISRPO(user16ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User16);


            //            //user17

            grade_IS_1_1Course4Semester1User17.setUsername(user17Username);
            grade_IS_1_1Course4Semester1User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_IS_1_1Course4Semester1User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_IS_1_1Course4Semester1User17.setGradeDevelopmentSoftwareModules(user17DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User17.setGradeMobileApplicationDevelopment(user17MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User17.setGradeSystemProgramming(user17SystemProgramming);
            grade_IS_1_1Course4Semester1User17.setGradeSoftwareDevelopmentTechnology(user17SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User17.setGradeISRPO(user17ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User17);

            //            //user18

            grade_IS_1_1Course4Semester1User18.setUsername(user18Username);
            grade_IS_1_1Course4Semester1User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_IS_1_1Course4Semester1User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_IS_1_1Course4Semester1User18.setGradeDevelopmentSoftwareModules(user18DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User18.setGradeMobileApplicationDevelopment(user18MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User18.setGradeSystemProgramming(user18SystemProgramming);
            grade_IS_1_1Course4Semester1User18.setGradeSoftwareDevelopmentTechnology(user18SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User18.setGradeISRPO(user18ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User18);


            //            //user19

            grade_IS_1_1Course4Semester1User19.setUsername(user19Username);
            grade_IS_1_1Course4Semester1User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_IS_1_1Course4Semester1User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_IS_1_1Course4Semester1User19.setGradeDevelopmentSoftwareModules(user19DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User19.setGradeMobileApplicationDevelopment(user19MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User19.setGradeSystemProgramming(user19SystemProgramming);
            grade_IS_1_1Course4Semester1User19.setGradeSoftwareDevelopmentTechnology(user19SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User19.setGradeISRPO(user19ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User19);

            //            //user20

            grade_IS_1_1Course4Semester1User20.setUsername(user20Username);
            grade_IS_1_1Course4Semester1User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_IS_1_1Course4Semester1User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_IS_1_1Course4Semester1User20.setGradeDevelopmentSoftwareModules(user20DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User20.setGradeMobileApplicationDevelopment(user20MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User20.setGradeSystemProgramming(user20SystemProgramming);
            grade_IS_1_1Course4Semester1User20.setGradeSoftwareDevelopmentTechnology(user20SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User20.setGradeISRPO(user20ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User20);

            //            //user21

            grade_IS_1_1Course4Semester1User21.setUsername(user21Username);
            grade_IS_1_1Course4Semester1User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_IS_1_1Course4Semester1User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_IS_1_1Course4Semester1User21.setGradeDevelopmentSoftwareModules(user21DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User21.setGradeMobileApplicationDevelopment(user21MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User21.setGradeSystemProgramming(user21SystemProgramming);
            grade_IS_1_1Course4Semester1User21.setGradeSoftwareDevelopmentTechnology(user21SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User21.setGradeISRPO(user21ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User21);

            //            //user22

            grade_IS_1_1Course4Semester1User22.setUsername(user22Username);
            grade_IS_1_1Course4Semester1User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_IS_1_1Course4Semester1User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_IS_1_1Course4Semester1User22.setGradeDevelopmentSoftwareModules(user22DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User22.setGradeMobileApplicationDevelopment(user22MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User22.setGradeSystemProgramming(user22SystemProgramming);
            grade_IS_1_1Course4Semester1User22.setGradeSoftwareDevelopmentTechnology(user22SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User22.setGradeISRPO(user22ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User22);

            //            //user23

            grade_IS_1_1Course4Semester1User23.setUsername(user23Username);
            grade_IS_1_1Course4Semester1User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_IS_1_1Course4Semester1User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_IS_1_1Course4Semester1User23.setGradeDevelopmentSoftwareModules(user23DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User23.setGradeMobileApplicationDevelopment(user23MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User23.setGradeSystemProgramming(user23SystemProgramming);
            grade_IS_1_1Course4Semester1User23.setGradeSoftwareDevelopmentTechnology(user23SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User23.setGradeISRPO(user23ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User23);

            //            //user24

            grade_IS_1_1Course4Semester1User24.setUsername(user24Username);
            grade_IS_1_1Course4Semester1User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_IS_1_1Course4Semester1User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_IS_1_1Course4Semester1User24.setGradeDevelopmentSoftwareModules(user24DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User24.setGradeMobileApplicationDevelopment(user24MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User24.setGradeSystemProgramming(user24SystemProgramming);
            grade_IS_1_1Course4Semester1User24.setGradeSoftwareDevelopmentTechnology(user24SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User24.setGradeISRPO(user24ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User24);

            //            //user25

            grade_IS_1_1Course4Semester1User25.setUsername(user25Username);
            grade_IS_1_1Course4Semester1User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_IS_1_1Course4Semester1User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_IS_1_1Course4Semester1User25.setGradeDevelopmentSoftwareModules(user25DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User25.setGradeMobileApplicationDevelopment(user25MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User25.setGradeSystemProgramming(user25SystemProgramming);
            grade_IS_1_1Course4Semester1User25.setGradeSoftwareDevelopmentTechnology(user25SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User25.setGradeISRPO(user25ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User25);

            //            //user26

            grade_IS_1_1Course4Semester1User26.setUsername(user26Username);
            grade_IS_1_1Course4Semester1User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_IS_1_1Course4Semester1User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_IS_1_1Course4Semester1User26.setGradeDevelopmentSoftwareModules(user26DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User26.setGradeMobileApplicationDevelopment(user26MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User26.setGradeSystemProgramming(user26SystemProgramming);
            grade_IS_1_1Course4Semester1User26.setGradeSoftwareDevelopmentTechnology(user26SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User26.setGradeISRPO(user26ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User26);

            //            //user27

            grade_IS_1_1Course4Semester1User27.setUsername(user27Username);
            grade_IS_1_1Course4Semester1User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_IS_1_1Course4Semester1User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_IS_1_1Course4Semester1User27.setGradeDevelopmentSoftwareModules(user27DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User27.setGradeMobileApplicationDevelopment(user27MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User27.setGradeSystemProgramming(user27SystemProgramming);
            grade_IS_1_1Course4Semester1User27.setGradeSoftwareDevelopmentTechnology(user27SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User27.setGradeISRPO(user27ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User27);

            //            //user28

            grade_IS_1_1Course4Semester1User28.setUsername(user28Username);
            grade_IS_1_1Course4Semester1User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_IS_1_1Course4Semester1User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_IS_1_1Course4Semester1User28.setGradeDevelopmentSoftwareModules(user28DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User28.setGradeMobileApplicationDevelopment(user28MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User28.setGradeSystemProgramming(user28SystemProgramming);
            grade_IS_1_1Course4Semester1User28.setGradeSoftwareDevelopmentTechnology(user28SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User28.setGradeISRPO(user28ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User28);

            //            //user29

            grade_IS_1_1Course4Semester1User29.setUsername(user29Username);
            grade_IS_1_1Course4Semester1User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_IS_1_1Course4Semester1User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_IS_1_1Course4Semester1User29.setGradeDevelopmentSoftwareModules(user29DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User29.setGradeMobileApplicationDevelopment(user29MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User29.setGradeSystemProgramming(user29SystemProgramming);
            grade_IS_1_1Course4Semester1User29.setGradeSoftwareDevelopmentTechnology(user29SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User29.setGradeISRPO(user29ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User29);

            //            //user30

            grade_IS_1_1Course4Semester1User30.setUsername(user30Username);
            grade_IS_1_1Course4Semester1User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_IS_1_1Course4Semester1User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_IS_1_1Course4Semester1User30.setGradeDevelopmentSoftwareModules(user30DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User30.setGradeMobileApplicationDevelopment(user30MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User30.setGradeSystemProgramming(user30SystemProgramming);
            grade_IS_1_1Course4Semester1User30.setGradeSoftwareDevelopmentTechnology(user30SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User30.setGradeISRPO(user30ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User30);

            //            //user31

            grade_IS_1_1Course4Semester1User31.setUsername(user31Username);
            grade_IS_1_1Course4Semester1User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_IS_1_1Course4Semester1User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_IS_1_1Course4Semester1User31.setGradeDevelopmentSoftwareModules(user31DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User31.setGradeMobileApplicationDevelopment(user31MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User31.setGradeSystemProgramming(user31SystemProgramming);
            grade_IS_1_1Course4Semester1User31.setGradeSoftwareDevelopmentTechnology(user31SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User31.setGradeISRPO(user31ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User31);

            //            //user32

            grade_IS_1_1Course4Semester1User32.setUsername(user32Username);
            grade_IS_1_1Course4Semester1User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_IS_1_1Course4Semester1User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_IS_1_1Course4Semester1User32.setGradeDevelopmentSoftwareModules(user32DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User32.setGradeMobileApplicationDevelopment(user32MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User32.setGradeSystemProgramming(user32SystemProgramming);
            grade_IS_1_1Course4Semester1User32.setGradeSoftwareDevelopmentTechnology(user32SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User32.setGradeISRPO(user32ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User32);

            //            //user33

            grade_IS_1_1Course4Semester1User33.setUsername(user33Username);
            grade_IS_1_1Course4Semester1User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_IS_1_1Course4Semester1User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_IS_1_1Course4Semester1User33.setGradeDevelopmentSoftwareModules(user33DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User33.setGradeMobileApplicationDevelopment(user33MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User33.setGradeSystemProgramming(user33SystemProgramming);
            grade_IS_1_1Course4Semester1User33.setGradeSoftwareDevelopmentTechnology(user33SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User33.setGradeISRPO(user33ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User33);

            //            //user34

            grade_IS_1_1Course4Semester1User34.setUsername(user34Username);
            grade_IS_1_1Course4Semester1User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_IS_1_1Course4Semester1User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_IS_1_1Course4Semester1User34.setGradeDevelopmentSoftwareModules(user34DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User34.setGradeMobileApplicationDevelopment(user34MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User34.setGradeSystemProgramming(user34SystemProgramming);
            grade_IS_1_1Course4Semester1User34.setGradeSoftwareDevelopmentTechnology(user34SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User34.setGradeISRPO(user34ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User34);

            //            //user35

            grade_IS_1_1Course4Semester1User35.setUsername(user35Username);
            grade_IS_1_1Course4Semester1User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_IS_1_1Course4Semester1User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_IS_1_1Course4Semester1User35.setGradeDevelopmentSoftwareModules(user35DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User35.setGradeMobileApplicationDevelopment(user35MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User35.setGradeSystemProgramming(user35SystemProgramming);
            grade_IS_1_1Course4Semester1User35.setGradeSoftwareDevelopmentTechnology(user35SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User35.setGradeISRPO(user35ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User35);

            //            //user36

            grade_IS_1_1Course4Semester1User36.setUsername(user36Username);
            grade_IS_1_1Course4Semester1User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_IS_1_1Course4Semester1User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_IS_1_1Course4Semester1User36.setGradeDevelopmentSoftwareModules(user36DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User36.setGradeMobileApplicationDevelopment(user36MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User36.setGradeSystemProgramming(user36SystemProgramming);
            grade_IS_1_1Course4Semester1User36.setGradeSoftwareDevelopmentTechnology(user36SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User36.setGradeISRPO(user36ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User36);

            //            //user37

            grade_IS_1_1Course4Semester1User37.setUsername(user37Username);
            grade_IS_1_1Course4Semester1User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_IS_1_1Course4Semester1User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_IS_1_1Course4Semester1User37.setGradeDevelopmentSoftwareModules(user37DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User37.setGradeMobileApplicationDevelopment(user37MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User37.setGradeSystemProgramming(user37SystemProgramming);
            grade_IS_1_1Course4Semester1User37.setGradeSoftwareDevelopmentTechnology(user37SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User37.setGradeISRPO(user37ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User37);

            //            //user38

            grade_IS_1_1Course4Semester1User38.setUsername(user38Username);
            grade_IS_1_1Course4Semester1User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_IS_1_1Course4Semester1User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_IS_1_1Course4Semester1User38.setGradeDevelopmentSoftwareModules(user38DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User38.setGradeMobileApplicationDevelopment(user38MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User38.setGradeSystemProgramming(user38SystemProgramming);
            grade_IS_1_1Course4Semester1User38.setGradeSoftwareDevelopmentTechnology(user38SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User38.setGradeISRPO(user38ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User38);

            //            //user39

            grade_IS_1_1Course4Semester1User39.setUsername(user39Username);
            grade_IS_1_1Course4Semester1User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_IS_1_1Course4Semester1User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_IS_1_1Course4Semester1User39.setGradeDevelopmentSoftwareModules(user39DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User39.setGradeMobileApplicationDevelopment(user39MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User39.setGradeSystemProgramming(user39SystemProgramming);
            grade_IS_1_1Course4Semester1User39.setGradeSoftwareDevelopmentTechnology(user39SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User39.setGradeISRPO(user39ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User39);

            //            //user40

            grade_IS_1_1Course4Semester1User40.setUsername(user40Username);
            grade_IS_1_1Course4Semester1User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_IS_1_1Course4Semester1User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_IS_1_1Course4Semester1User40.setGradeDevelopmentSoftwareModules(user40DevelopmentSoftwareModules);
            grade_IS_1_1Course4Semester1User40.setGradeMobileApplicationDevelopment(user40MobileApplicationDevelopment);
            grade_IS_1_1Course4Semester1User40.setGradeSystemProgramming(user40SystemProgramming);
            grade_IS_1_1Course4Semester1User40.setGradeSoftwareDevelopmentTechnology(user40SoftwareDevelopmentTechnology);
            grade_IS_1_1Course4Semester1User40.setGradeISRPO(user40ISRPO);
            gradeIs11Course4Semester1Repository.save(grade_IS_1_1Course4Semester1User40);

        } catch (Exception ignore) {

        }

    }
}
