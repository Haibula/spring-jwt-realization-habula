package com.example.demoauth.service.moderatorService.moderator_is1Service.course3;

import com.example.demoauth.models.grade_is1.models.course3.Grade_IS_1_1Course3Semester1;
import com.example.demoauth.repository.is1Repository.course3.Grade_IS_1_1Course3Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1Course3Semester1 {
    @Autowired
    Grade_IS_1_1Course3Semester1Repository gradeIs11Course3Semester1Repository;

    //GetMappingGradeCourse3Semester1
    public void getMappingMethodModer_is_1_1GreadeСourse3Semester1(@PathVariable String month, Model model) {

        List<Grade_IS_1_1Course3Semester1> res = gradeIs11Course3Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course3Semester1::getUserID));
        List<Grade_IS_1_1Course3Semester1> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course3Semester1> septemberList = new ArrayList<>();
        List<Grade_IS_1_1Course3Semester1> octoberList = new ArrayList<>();
        List<Grade_IS_1_1Course3Semester1> novemberList = new ArrayList<>();
        List<Grade_IS_1_1Course3Semester1> decemberList = new ArrayList<>();

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
            voidList.add(new Grade_IS_1_1Course3Semester1());
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

    //PostMappingGradeCourse3Semester1
    public void postMappingMethodModer_is_1_1GreadeСourse3Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1Psychology = splitUser1Grades[2];
            String user1EnglishLanguage = splitUser1Grades[3];
            String user1PhysicalTraining = splitUser1Grades[4];
            String user1LifeSafety = splitUser1Grades[5];
            String user1StandardizationCertification = splitUser1Grades[6];
            String user1DevelopmentSoftwareModules = splitUser1Grades[7];
            String user1SupportTestingSoftwareModules = splitUser1Grades[8];
            String user1DatabaseDevelopmentProtectionTechnology = splitUser1Grades[9];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2Psychology = splitUser2Grades[2];
            String user2EnglishLanguage = splitUser2Grades[3];
            String user2PhysicalTraining = splitUser2Grades[4];
            String user2LifeSafety = splitUser2Grades[5];
            String user2StandardizationCertification = splitUser2Grades[6];
            String user2DevelopmentSoftwareModules = splitUser2Grades[7];
            String user2SupportTestingSoftwareModules = splitUser2Grades[8];
            String user2DatabaseDevelopmentProtectionTechnology = splitUser2Grades[9];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3Psychology = splitUser3Grades[2];
            String user3EnglishLanguage = splitUser3Grades[3];
            String user3PhysicalTraining = splitUser3Grades[4];
            String user3LifeSafety = splitUser3Grades[5];
            String user3StandardizationCertification = splitUser3Grades[6];
            String user3DevelopmentSoftwareModules = splitUser3Grades[7];
            String user3SupportTestingSoftwareModules = splitUser3Grades[8];
            String user3DatabaseDevelopmentProtectionTechnology = splitUser3Grades[9];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4Psychology = splitUser4Grades[2];
            String user4EnglishLanguage = splitUser4Grades[3];
            String user4PhysicalTraining = splitUser4Grades[4];
            String user4LifeSafety = splitUser4Grades[5];
            String user4StandardizationCertification = splitUser4Grades[6];
            String user4DevelopmentSoftwareModules = splitUser4Grades[7];
            String user4SupportTestingSoftwareModules = splitUser4Grades[8];
            String user4DatabaseDevelopmentProtectionTechnology = splitUser4Grades[9];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5Psychology = splitUser5Grades[2];
            String user5EnglishLanguage = splitUser5Grades[3];
            String user5PhysicalTraining = splitUser5Grades[4];
            String user5LifeSafety = splitUser5Grades[5];
            String user5StandardizationCertification = splitUser5Grades[6];
            String user5DevelopmentSoftwareModules = splitUser5Grades[7];
            String user5SupportTestingSoftwareModules = splitUser5Grades[8];
            String user5DatabaseDevelopmentProtectionTechnology = splitUser5Grades[9];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6Psychology = splitUser6Grades[2];
            String user6EnglishLanguage = splitUser6Grades[3];
            String user6PhysicalTraining = splitUser6Grades[4];
            String user6LifeSafety = splitUser6Grades[5];
            String user6StandardizationCertification = splitUser6Grades[6];
            String user6DevelopmentSoftwareModules = splitUser6Grades[7];
            String user6SupportTestingSoftwareModules = splitUser6Grades[8];
            String user6DatabaseDevelopmentProtectionTechnology = splitUser6Grades[9];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7Psychology = splitUser7Grades[2];
            String user7EnglishLanguage = splitUser7Grades[3];
            String user7PhysicalTraining = splitUser7Grades[4];
            String user7LifeSafety = splitUser7Grades[5];
            String user7StandardizationCertification = splitUser7Grades[6];
            String user7DevelopmentSoftwareModules = splitUser7Grades[7];
            String user7SupportTestingSoftwareModules = splitUser7Grades[8];
            String user7DatabaseDevelopmentProtectionTechnology = splitUser7Grades[9];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8Psychology = splitUser8Grades[2];
            String user8EnglishLanguage = splitUser8Grades[3];
            String user8PhysicalTraining = splitUser8Grades[4];
            String user8LifeSafety = splitUser8Grades[5];
            String user8StandardizationCertification = splitUser8Grades[6];
            String user8DevelopmentSoftwareModules = splitUser8Grades[7];
            String user8SupportTestingSoftwareModules = splitUser8Grades[8];
            String user8DatabaseDevelopmentProtectionTechnology = splitUser8Grades[9];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9Psychology = splitUser9Grades[2];
            String user9EnglishLanguage = splitUser9Grades[3];
            String user9PhysicalTraining = splitUser9Grades[4];
            String user9LifeSafety = splitUser9Grades[5];
            String user9StandardizationCertification = splitUser9Grades[6];
            String user9DevelopmentSoftwareModules = splitUser9Grades[7];
            String user9SupportTestingSoftwareModules = splitUser9Grades[8];
            String user9DatabaseDevelopmentProtectionTechnology = splitUser9Grades[9];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10Psychology = splitUser10Grades[2];
            String user10EnglishLanguage = splitUser10Grades[3];
            String user10PhysicalTraining = splitUser10Grades[4];
            String user10LifeSafety = splitUser10Grades[5];
            String user10StandardizationCertification = splitUser10Grades[6];
            String user10DevelopmentSoftwareModules = splitUser10Grades[7];
            String user10SupportTestingSoftwareModules = splitUser10Grades[8];
            String user10DatabaseDevelopmentProtectionTechnology = splitUser10Grades[9];
            
            
            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11Psychology = splitUser11Grades[2];
            String user11EnglishLanguage = splitUser11Grades[3];
            String user11PhysicalTraining = splitUser11Grades[4];
            String user11LifeSafety = splitUser11Grades[5];
            String user11StandardizationCertification = splitUser11Grades[6];
            String user11DevelopmentSoftwareModules = splitUser11Grades[7];
            String user11SupportTestingSoftwareModules = splitUser11Grades[8];
            String user11DatabaseDevelopmentProtectionTechnology = splitUser11Grades[9];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12Psychology = splitUser12Grades[2];
            String user12EnglishLanguage = splitUser12Grades[3];
            String user12PhysicalTraining = splitUser12Grades[4];
            String user12LifeSafety = splitUser12Grades[5];
            String user12StandardizationCertification = splitUser12Grades[6];
            String user12DevelopmentSoftwareModules = splitUser12Grades[7];
            String user12SupportTestingSoftwareModules = splitUser12Grades[8];
            String user12DatabaseDevelopmentProtectionTechnology = splitUser12Grades[9];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13Psychology = splitUser13Grades[2];
            String user13EnglishLanguage = splitUser13Grades[3];
            String user13PhysicalTraining = splitUser13Grades[4];
            String user13LifeSafety = splitUser13Grades[5];
            String user13StandardizationCertification = splitUser13Grades[6];
            String user13DevelopmentSoftwareModules = splitUser13Grades[7];
            String user13SupportTestingSoftwareModules = splitUser13Grades[8];
            String user13DatabaseDevelopmentProtectionTechnology = splitUser13Grades[9];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14Psychology = splitUser14Grades[2];
            String user14EnglishLanguage = splitUser14Grades[3];
            String user14PhysicalTraining = splitUser14Grades[4];
            String user14LifeSafety = splitUser14Grades[5];
            String user14StandardizationCertification = splitUser14Grades[6];
            String user14DevelopmentSoftwareModules = splitUser14Grades[7];
            String user14SupportTestingSoftwareModules = splitUser14Grades[8];
            String user14DatabaseDevelopmentProtectionTechnology = splitUser14Grades[9];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15Psychology = splitUser15Grades[2];
            String user15EnglishLanguage = splitUser15Grades[3];
            String user15PhysicalTraining = splitUser15Grades[4];
            String user15LifeSafety = splitUser15Grades[5];
            String user15StandardizationCertification = splitUser15Grades[6];
            String user15DevelopmentSoftwareModules = splitUser15Grades[7];
            String user15SupportTestingSoftwareModules = splitUser15Grades[8];
            String user15DatabaseDevelopmentProtectionTechnology = splitUser15Grades[9];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16Psychology = splitUser16Grades[2];
            String user16EnglishLanguage = splitUser16Grades[3];
            String user16PhysicalTraining = splitUser16Grades[4];
            String user16LifeSafety = splitUser16Grades[5];
            String user16StandardizationCertification = splitUser16Grades[6];
            String user16DevelopmentSoftwareModules = splitUser16Grades[7];
            String user16SupportTestingSoftwareModules = splitUser16Grades[8];
            String user16DatabaseDevelopmentProtectionTechnology = splitUser16Grades[9];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17Psychology = splitUser17Grades[2];
            String user17EnglishLanguage = splitUser17Grades[3];
            String user17PhysicalTraining = splitUser17Grades[4];
            String user17LifeSafety = splitUser17Grades[5];
            String user17StandardizationCertification = splitUser17Grades[6];
            String user17DevelopmentSoftwareModules = splitUser17Grades[7];
            String user17SupportTestingSoftwareModules = splitUser17Grades[8];
            String user17DatabaseDevelopmentProtectionTechnology = splitUser17Grades[9];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18Psychology = splitUser18Grades[2];
            String user18EnglishLanguage = splitUser18Grades[3];
            String user18PhysicalTraining = splitUser18Grades[4];
            String user18LifeSafety = splitUser18Grades[5];
            String user18StandardizationCertification = splitUser18Grades[6];
            String user18DevelopmentSoftwareModules = splitUser18Grades[7];
            String user18SupportTestingSoftwareModules = splitUser18Grades[8];
            String user18DatabaseDevelopmentProtectionTechnology = splitUser18Grades[9];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19Psychology = splitUser19Grades[2];
            String user19EnglishLanguage = splitUser19Grades[3];
            String user19PhysicalTraining = splitUser19Grades[4];
            String user19LifeSafety = splitUser19Grades[5];
            String user19StandardizationCertification = splitUser19Grades[6];
            String user19DevelopmentSoftwareModules = splitUser19Grades[7];
            String user19SupportTestingSoftwareModules = splitUser19Grades[8];
            String user19DatabaseDevelopmentProtectionTechnology = splitUser19Grades[9];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20Psychology = splitUser20Grades[2];
            String user20EnglishLanguage = splitUser20Grades[3];
            String user20PhysicalTraining = splitUser20Grades[4];
            String user20LifeSafety = splitUser20Grades[5];
            String user20StandardizationCertification = splitUser20Grades[6];
            String user20DevelopmentSoftwareModules = splitUser20Grades[7];
            String user20SupportTestingSoftwareModules = splitUser20Grades[8];
            String user20DatabaseDevelopmentProtectionTechnology = splitUser20Grades[9];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21Psychology = splitUser21Grades[2];
            String user21EnglishLanguage = splitUser21Grades[3];
            String user21PhysicalTraining = splitUser21Grades[4];
            String user21LifeSafety = splitUser21Grades[5];
            String user21StandardizationCertification = splitUser21Grades[6];
            String user21DevelopmentSoftwareModules = splitUser21Grades[7];
            String user21SupportTestingSoftwareModules = splitUser21Grades[8];
            String user21DatabaseDevelopmentProtectionTechnology = splitUser21Grades[9];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22Psychology = splitUser22Grades[2];
            String user22EnglishLanguage = splitUser22Grades[3];
            String user22PhysicalTraining = splitUser22Grades[4];
            String user22LifeSafety = splitUser22Grades[5];
            String user22StandardizationCertification = splitUser22Grades[6];
            String user22DevelopmentSoftwareModules = splitUser22Grades[7];
            String user22SupportTestingSoftwareModules = splitUser22Grades[8];
            String user22DatabaseDevelopmentProtectionTechnology = splitUser22Grades[9];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23Psychology = splitUser23Grades[2];
            String user23EnglishLanguage = splitUser23Grades[3];
            String user23PhysicalTraining = splitUser23Grades[4];
            String user23LifeSafety = splitUser23Grades[5];
            String user23StandardizationCertification = splitUser23Grades[6];
            String user23DevelopmentSoftwareModules = splitUser23Grades[7];
            String user23SupportTestingSoftwareModules = splitUser23Grades[8];
            String user23DatabaseDevelopmentProtectionTechnology = splitUser23Grades[9];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24Psychology = splitUser24Grades[2];
            String user24EnglishLanguage = splitUser24Grades[3];
            String user24PhysicalTraining = splitUser24Grades[4];
            String user24LifeSafety = splitUser24Grades[5];
            String user24StandardizationCertification = splitUser24Grades[6];
            String user24DevelopmentSoftwareModules = splitUser24Grades[7];
            String user24SupportTestingSoftwareModules = splitUser24Grades[8];
            String user24DatabaseDevelopmentProtectionTechnology = splitUser24Grades[9];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25Psychology = splitUser25Grades[2];
            String user25EnglishLanguage = splitUser25Grades[3];
            String user25PhysicalTraining = splitUser25Grades[4];
            String user25LifeSafety = splitUser25Grades[5];
            String user25StandardizationCertification = splitUser25Grades[6];
            String user25DevelopmentSoftwareModules = splitUser25Grades[7];
            String user25SupportTestingSoftwareModules = splitUser25Grades[8];
            String user25DatabaseDevelopmentProtectionTechnology = splitUser25Grades[9];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26Psychology = splitUser26Grades[2];
            String user26EnglishLanguage = splitUser26Grades[3];
            String user26PhysicalTraining = splitUser26Grades[4];
            String user26LifeSafety = splitUser26Grades[5];
            String user26StandardizationCertification = splitUser26Grades[6];
            String user26DevelopmentSoftwareModules = splitUser26Grades[7];
            String user26SupportTestingSoftwareModules = splitUser26Grades[8];
            String user26DatabaseDevelopmentProtectionTechnology = splitUser26Grades[9];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27Psychology = splitUser27Grades[2];
            String user27EnglishLanguage = splitUser27Grades[3];
            String user27PhysicalTraining = splitUser27Grades[4];
            String user27LifeSafety = splitUser27Grades[5];
            String user27StandardizationCertification = splitUser27Grades[6];
            String user27DevelopmentSoftwareModules = splitUser27Grades[7];
            String user27SupportTestingSoftwareModules = splitUser27Grades[8];
            String user27DatabaseDevelopmentProtectionTechnology = splitUser27Grades[9];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28Psychology = splitUser28Grades[2];
            String user28EnglishLanguage = splitUser28Grades[3];
            String user28PhysicalTraining = splitUser28Grades[4];
            String user28LifeSafety = splitUser28Grades[5];
            String user28StandardizationCertification = splitUser28Grades[6];
            String user28DevelopmentSoftwareModules = splitUser28Grades[7];
            String user28SupportTestingSoftwareModules = splitUser28Grades[8];
            String user28DatabaseDevelopmentProtectionTechnology = splitUser28Grades[9];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29Psychology = splitUser29Grades[2];
            String user29EnglishLanguage = splitUser29Grades[3];
            String user29PhysicalTraining = splitUser29Grades[4];
            String user29LifeSafety = splitUser29Grades[5];
            String user29StandardizationCertification = splitUser29Grades[6];
            String user29DevelopmentSoftwareModules = splitUser29Grades[7];
            String user29SupportTestingSoftwareModules = splitUser29Grades[8];
            String user29DatabaseDevelopmentProtectionTechnology = splitUser29Grades[9];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30Psychology = splitUser30Grades[2];
            String user30EnglishLanguage = splitUser30Grades[3];
            String user30PhysicalTraining = splitUser30Grades[4];
            String user30LifeSafety = splitUser30Grades[5];
            String user30StandardizationCertification = splitUser30Grades[6];
            String user30DevelopmentSoftwareModules = splitUser30Grades[7];
            String user30SupportTestingSoftwareModules = splitUser30Grades[8];
            String user30DatabaseDevelopmentProtectionTechnology = splitUser30Grades[9];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31Psychology = splitUser31Grades[2];
            String user31EnglishLanguage = splitUser31Grades[3];
            String user31PhysicalTraining = splitUser31Grades[4];
            String user31LifeSafety = splitUser31Grades[5];
            String user31StandardizationCertification = splitUser31Grades[6];
            String user31DevelopmentSoftwareModules = splitUser31Grades[7];
            String user31SupportTestingSoftwareModules = splitUser31Grades[8];
            String user31DatabaseDevelopmentProtectionTechnology = splitUser31Grades[9];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32Psychology = splitUser32Grades[2];
            String user32EnglishLanguage = splitUser32Grades[3];
            String user32PhysicalTraining = splitUser32Grades[4];
            String user32LifeSafety = splitUser32Grades[5];
            String user32StandardizationCertification = splitUser32Grades[6];
            String user32DevelopmentSoftwareModules = splitUser32Grades[7];
            String user32SupportTestingSoftwareModules = splitUser32Grades[8];
            String user32DatabaseDevelopmentProtectionTechnology = splitUser32Grades[9];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33Psychology = splitUser33Grades[2];
            String user33EnglishLanguage = splitUser33Grades[3];
            String user33PhysicalTraining = splitUser33Grades[4];
            String user33LifeSafety = splitUser33Grades[5];
            String user33StandardizationCertification = splitUser33Grades[6];
            String user33DevelopmentSoftwareModules = splitUser33Grades[7];
            String user33SupportTestingSoftwareModules = splitUser33Grades[8];
            String user33DatabaseDevelopmentProtectionTechnology = splitUser33Grades[9];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34Psychology = splitUser34Grades[2];
            String user34EnglishLanguage = splitUser34Grades[3];
            String user34PhysicalTraining = splitUser34Grades[4];
            String user34LifeSafety = splitUser34Grades[5];
            String user34StandardizationCertification = splitUser34Grades[6];
            String user34DevelopmentSoftwareModules = splitUser34Grades[7];
            String user34SupportTestingSoftwareModules = splitUser34Grades[8];
            String user34DatabaseDevelopmentProtectionTechnology = splitUser34Grades[9];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35Psychology = splitUser35Grades[2];
            String user35EnglishLanguage = splitUser35Grades[3];
            String user35PhysicalTraining = splitUser35Grades[4];
            String user35LifeSafety = splitUser35Grades[5];
            String user35StandardizationCertification = splitUser35Grades[6];
            String user35DevelopmentSoftwareModules = splitUser35Grades[7];
            String user35SupportTestingSoftwareModules = splitUser35Grades[8];
            String user35DatabaseDevelopmentProtectionTechnology = splitUser35Grades[9];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36Psychology = splitUser36Grades[2];
            String user36EnglishLanguage = splitUser36Grades[3];
            String user36PhysicalTraining = splitUser36Grades[4];
            String user36LifeSafety = splitUser36Grades[5];
            String user36StandardizationCertification = splitUser36Grades[6];
            String user36DevelopmentSoftwareModules = splitUser36Grades[7];
            String user36SupportTestingSoftwareModules = splitUser36Grades[8];
            String user36DatabaseDevelopmentProtectionTechnology = splitUser36Grades[9];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37Psychology = splitUser37Grades[2];
            String user37EnglishLanguage = splitUser37Grades[3];
            String user37PhysicalTraining = splitUser37Grades[4];
            String user37LifeSafety = splitUser37Grades[5];
            String user37StandardizationCertification = splitUser37Grades[6];
            String user37DevelopmentSoftwareModules = splitUser37Grades[7];
            String user37SupportTestingSoftwareModules = splitUser37Grades[8];
            String user37DatabaseDevelopmentProtectionTechnology = splitUser37Grades[9];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38Psychology = splitUser38Grades[2];
            String user38EnglishLanguage = splitUser38Grades[3];
            String user38PhysicalTraining = splitUser38Grades[4];
            String user38LifeSafety = splitUser38Grades[5];
            String user38StandardizationCertification = splitUser38Grades[6];
            String user38DevelopmentSoftwareModules = splitUser38Grades[7];
            String user38SupportTestingSoftwareModules = splitUser38Grades[8];
            String user38DatabaseDevelopmentProtectionTechnology = splitUser38Grades[9];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39Psychology = splitUser39Grades[2];
            String user39EnglishLanguage = splitUser39Grades[3];
            String user39PhysicalTraining = splitUser39Grades[4];
            String user39LifeSafety = splitUser39Grades[5];
            String user39StandardizationCertification = splitUser39Grades[6];
            String user39DevelopmentSoftwareModules = splitUser39Grades[7];
            String user39SupportTestingSoftwareModules = splitUser39Grades[8];
            String user39DatabaseDevelopmentProtectionTechnology = splitUser39Grades[9];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40Psychology = splitUser40Grades[2];
            String user40EnglishLanguage = splitUser40Grades[3];
            String user40PhysicalTraining = splitUser40Grades[4];
            String user40LifeSafety = splitUser40Grades[5];
            String user40StandardizationCertification = splitUser40Grades[6];
            String user40DevelopmentSoftwareModules = splitUser40Grades[7];
            String user40SupportTestingSoftwareModules = splitUser40Grades[8];
            String user40DatabaseDevelopmentProtectionTechnology = splitUser40Grades[9];


            ArrayList<Grade_IS_1_1Course3Semester1> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course3Semester1(user1Id, user1Username, user1Psychology, user1EnglishLanguage, user1PhysicalTraining, user1LifeSafety, user1StandardizationCertification, user1DevelopmentSoftwareModules, user1SupportTestingSoftwareModules, user1DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user2Id, user2Username, user2Psychology, user2EnglishLanguage, user2PhysicalTraining, user2LifeSafety, user2StandardizationCertification, user2DevelopmentSoftwareModules, user2SupportTestingSoftwareModules, user2DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user3Id, user3Username, user3Psychology, user3EnglishLanguage, user3PhysicalTraining, user3LifeSafety, user3StandardizationCertification, user3DevelopmentSoftwareModules, user3SupportTestingSoftwareModules, user3DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user4Id, user4Username, user4Psychology, user4EnglishLanguage, user4PhysicalTraining, user4LifeSafety, user4StandardizationCertification, user4DevelopmentSoftwareModules, user4SupportTestingSoftwareModules, user4DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user5Id, user5Username, user5Psychology, user5EnglishLanguage, user5PhysicalTraining, user5LifeSafety, user5StandardizationCertification, user5DevelopmentSoftwareModules, user5SupportTestingSoftwareModules, user5DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user6Id, user6Username, user6Psychology, user6EnglishLanguage, user6PhysicalTraining, user6LifeSafety, user6StandardizationCertification, user6DevelopmentSoftwareModules, user6SupportTestingSoftwareModules, user6DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user7Id, user7Username, user7Psychology, user7EnglishLanguage, user7PhysicalTraining, user7LifeSafety, user7StandardizationCertification, user7DevelopmentSoftwareModules, user7SupportTestingSoftwareModules, user7DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user8Id, user8Username, user8Psychology, user8EnglishLanguage, user8PhysicalTraining, user8LifeSafety, user8StandardizationCertification, user8DevelopmentSoftwareModules, user8SupportTestingSoftwareModules, user8DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user9Id, user9Username, user9Psychology, user9EnglishLanguage, user9PhysicalTraining, user9LifeSafety, user9StandardizationCertification, user9DevelopmentSoftwareModules, user9SupportTestingSoftwareModules, user9DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user10Id, user10Username, user10Psychology, user10EnglishLanguage, user10PhysicalTraining, user10LifeSafety, user10StandardizationCertification, user10DevelopmentSoftwareModules, user10SupportTestingSoftwareModules, user10DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user11Id, user11Username, user11Psychology, user11EnglishLanguage, user11PhysicalTraining, user11LifeSafety, user11StandardizationCertification, user11DevelopmentSoftwareModules, user11SupportTestingSoftwareModules, user11DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user12Id, user12Username, user12Psychology, user12EnglishLanguage, user12PhysicalTraining, user12LifeSafety, user12StandardizationCertification, user12DevelopmentSoftwareModules, user12SupportTestingSoftwareModules, user12DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user13Id, user13Username, user13Psychology, user13EnglishLanguage, user13PhysicalTraining, user13LifeSafety, user13StandardizationCertification, user13DevelopmentSoftwareModules, user13SupportTestingSoftwareModules, user13DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user14Id, user14Username, user14Psychology, user14EnglishLanguage, user14PhysicalTraining, user14LifeSafety, user14StandardizationCertification, user14DevelopmentSoftwareModules, user14SupportTestingSoftwareModules, user14DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user15Id, user15Username, user15Psychology, user15EnglishLanguage, user15PhysicalTraining, user15LifeSafety, user15StandardizationCertification, user15DevelopmentSoftwareModules, user15SupportTestingSoftwareModules, user15DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user16Id, user16Username, user16Psychology, user16EnglishLanguage, user16PhysicalTraining, user16LifeSafety, user16StandardizationCertification, user16DevelopmentSoftwareModules, user16SupportTestingSoftwareModules, user16DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user17Id, user17Username, user17Psychology, user17EnglishLanguage, user17PhysicalTraining, user17LifeSafety, user17StandardizationCertification, user17DevelopmentSoftwareModules, user17SupportTestingSoftwareModules, user17DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user18Id, user18Username, user18Psychology, user18EnglishLanguage, user18PhysicalTraining, user18LifeSafety, user18StandardizationCertification, user18DevelopmentSoftwareModules, user18SupportTestingSoftwareModules, user18DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user19Id, user19Username, user19Psychology, user19EnglishLanguage, user19PhysicalTraining, user19LifeSafety, user19StandardizationCertification, user19DevelopmentSoftwareModules, user19SupportTestingSoftwareModules, user19DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user20Id, user20Username, user20Psychology, user20EnglishLanguage, user20PhysicalTraining, user20LifeSafety, user20StandardizationCertification, user20DevelopmentSoftwareModules, user20SupportTestingSoftwareModules, user20DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user21Id, user21Username, user21Psychology, user21EnglishLanguage, user21PhysicalTraining, user21LifeSafety, user21StandardizationCertification, user21DevelopmentSoftwareModules, user21SupportTestingSoftwareModules, user21DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user22Id, user22Username, user22Psychology, user22EnglishLanguage, user22PhysicalTraining, user22LifeSafety, user22StandardizationCertification, user22DevelopmentSoftwareModules, user22SupportTestingSoftwareModules, user22DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user23Id, user23Username, user23Psychology, user23EnglishLanguage, user23PhysicalTraining, user23LifeSafety, user23StandardizationCertification, user23DevelopmentSoftwareModules, user23SupportTestingSoftwareModules, user23DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user24Id, user24Username, user24Psychology, user24EnglishLanguage, user24PhysicalTraining, user24LifeSafety, user24StandardizationCertification, user24DevelopmentSoftwareModules, user24SupportTestingSoftwareModules, user24DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user25Id, user25Username, user25Psychology, user25EnglishLanguage, user25PhysicalTraining, user25LifeSafety, user25StandardizationCertification, user25DevelopmentSoftwareModules, user25SupportTestingSoftwareModules, user25DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user26Id, user26Username, user26Psychology, user26EnglishLanguage, user26PhysicalTraining, user26LifeSafety, user26StandardizationCertification, user26DevelopmentSoftwareModules, user26SupportTestingSoftwareModules, user26DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user27Id, user27Username, user27Psychology, user27EnglishLanguage, user27PhysicalTraining, user27LifeSafety, user27StandardizationCertification, user27DevelopmentSoftwareModules, user27SupportTestingSoftwareModules, user27DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user28Id, user28Username, user28Psychology, user28EnglishLanguage, user28PhysicalTraining, user28LifeSafety, user28StandardizationCertification, user28DevelopmentSoftwareModules, user28SupportTestingSoftwareModules, user28DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user29Id, user29Username, user29Psychology, user29EnglishLanguage, user29PhysicalTraining, user29LifeSafety, user29StandardizationCertification, user29DevelopmentSoftwareModules, user29SupportTestingSoftwareModules, user29DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user30Id, user30Username, user30Psychology, user30EnglishLanguage, user30PhysicalTraining, user30LifeSafety, user30StandardizationCertification, user30DevelopmentSoftwareModules, user30SupportTestingSoftwareModules, user30DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user31Id, user31Username, user31Psychology, user31EnglishLanguage, user31PhysicalTraining, user31LifeSafety, user31StandardizationCertification, user31DevelopmentSoftwareModules, user31SupportTestingSoftwareModules, user31DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user32Id, user32Username, user32Psychology, user32EnglishLanguage, user32PhysicalTraining, user32LifeSafety, user32StandardizationCertification, user32DevelopmentSoftwareModules, user32SupportTestingSoftwareModules, user32DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user33Id, user33Username, user33Psychology, user33EnglishLanguage, user33PhysicalTraining, user33LifeSafety, user33StandardizationCertification, user33DevelopmentSoftwareModules, user33SupportTestingSoftwareModules, user33DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user34Id, user34Username, user34Psychology, user34EnglishLanguage, user34PhysicalTraining, user34LifeSafety, user34StandardizationCertification, user34DevelopmentSoftwareModules, user34SupportTestingSoftwareModules, user34DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user35Id, user35Username, user35Psychology, user35EnglishLanguage, user35PhysicalTraining, user35LifeSafety, user35StandardizationCertification, user35DevelopmentSoftwareModules, user35SupportTestingSoftwareModules, user35DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user36Id, user36Username, user36Psychology, user36EnglishLanguage, user36PhysicalTraining, user36LifeSafety, user36StandardizationCertification, user36DevelopmentSoftwareModules, user36SupportTestingSoftwareModules, user36DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user37Id, user37Username, user37Psychology, user37EnglishLanguage, user37PhysicalTraining, user37LifeSafety, user37StandardizationCertification, user37DevelopmentSoftwareModules, user37SupportTestingSoftwareModules, user37DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user38Id, user38Username, user38Psychology, user38EnglishLanguage, user38PhysicalTraining, user38LifeSafety, user38StandardizationCertification, user38DevelopmentSoftwareModules, user38SupportTestingSoftwareModules, user38DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user39Id, user39Username, user39Psychology, user39EnglishLanguage, user39PhysicalTraining, user39LifeSafety, user39StandardizationCertification, user39DevelopmentSoftwareModules, user39SupportTestingSoftwareModules, user39DatabaseDevelopmentProtectionTechnology, month));
            addArr.add(new Grade_IS_1_1Course3Semester1(user40Id, user40Username, user40Psychology, user40EnglishLanguage, user40PhysicalTraining, user40LifeSafety, user40StandardizationCertification, user40DevelopmentSoftwareModules, user40SupportTestingSoftwareModules, user40DatabaseDevelopmentProtectionTechnology, month));


            if (gradeIs11Course3Semester1Repository.findAll().isEmpty()) {
                gradeIs11Course3Semester1Repository.saveAll(addArr);
            }
            if (!gradeIs11Course3Semester1Repository.existsByMonth(month)) {
                gradeIs11Course3Semester1Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course3Semester1> listAllGrade = gradeIs11Course3Semester1Repository.findAll();
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User1 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User2 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User3 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User4 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User5 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User6 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User7 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User8 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User9 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User10 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User11 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User12 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User13 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User14 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User15 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User16 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User17 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User18 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User19 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User20 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User21 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User22 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User23 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User24 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User25 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User26 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User27 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User28 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User29 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User30 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User31 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User32 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User33 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User34 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User35 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User36 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User37 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User38 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User39 = null;
            Grade_IS_1_1Course3Semester1 grade_IS_1_1Course3Semester1User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course3Semester1User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_IS_1_1Course3Semester1User1.setUsername(user1Username);
            grade_IS_1_1Course3Semester1User1.setGradePsychology(user1Psychology);
            grade_IS_1_1Course3Semester1User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_IS_1_1Course3Semester1User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_IS_1_1Course3Semester1User1.setGradeLifeSafety(user1LifeSafety);
            grade_IS_1_1Course3Semester1User1.setGradeStandardizationCertification(user1StandardizationCertification);
            grade_IS_1_1Course3Semester1User1.setGradeDevelopmentSoftwareModules(user1DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User1.setGradeSupportTestingSoftwareModules(user1SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User1.setGradeDatabaseDevelopmentProtectionTechnology(user1DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User1);

            //user2
            grade_IS_1_1Course3Semester1User2.setUsername(user2Username);
            grade_IS_1_1Course3Semester1User2.setGradePsychology(user2Psychology);
            grade_IS_1_1Course3Semester1User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_IS_1_1Course3Semester1User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_IS_1_1Course3Semester1User2.setGradeLifeSafety(user2LifeSafety);
            grade_IS_1_1Course3Semester1User2.setGradeStandardizationCertification(user2StandardizationCertification);
            grade_IS_1_1Course3Semester1User2.setGradeDevelopmentSoftwareModules(user2DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User2.setGradeSupportTestingSoftwareModules(user2SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User2.setGradeDatabaseDevelopmentProtectionTechnology(user2DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User2);

            //            //user3
            grade_IS_1_1Course3Semester1User3.setUsername(user3Username);
            grade_IS_1_1Course3Semester1User3.setGradePsychology(user3Psychology);
            grade_IS_1_1Course3Semester1User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_IS_1_1Course3Semester1User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_IS_1_1Course3Semester1User3.setGradeLifeSafety(user3LifeSafety);
            grade_IS_1_1Course3Semester1User3.setGradeStandardizationCertification(user3StandardizationCertification);
            grade_IS_1_1Course3Semester1User3.setGradeDevelopmentSoftwareModules(user3DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User3.setGradeSupportTestingSoftwareModules(user3SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User3.setGradeDatabaseDevelopmentProtectionTechnology(user3DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User3);

            //            //user4
            grade_IS_1_1Course3Semester1User4.setUsername(user4Username);
            grade_IS_1_1Course3Semester1User4.setGradePsychology(user4Psychology);
            grade_IS_1_1Course3Semester1User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_IS_1_1Course3Semester1User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_IS_1_1Course3Semester1User4.setGradeLifeSafety(user4LifeSafety);
            grade_IS_1_1Course3Semester1User4.setGradeStandardizationCertification(user4StandardizationCertification);
            grade_IS_1_1Course3Semester1User4.setGradeDevelopmentSoftwareModules(user4DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User4.setGradeSupportTestingSoftwareModules(user4SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User4.setGradeDatabaseDevelopmentProtectionTechnology(user4DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User4);

//            //user5
            grade_IS_1_1Course3Semester1User5.setUsername(user5Username);
            grade_IS_1_1Course3Semester1User5.setGradePsychology(user5Psychology);
            grade_IS_1_1Course3Semester1User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_IS_1_1Course3Semester1User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_IS_1_1Course3Semester1User5.setGradeLifeSafety(user5LifeSafety);
            grade_IS_1_1Course3Semester1User5.setGradeStandardizationCertification(user5StandardizationCertification);
            grade_IS_1_1Course3Semester1User5.setGradeDevelopmentSoftwareModules(user5DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User5.setGradeSupportTestingSoftwareModules(user5SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User5.setGradeDatabaseDevelopmentProtectionTechnology(user5DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User5);

            //            //user6
            grade_IS_1_1Course3Semester1User6.setUsername(user6Username);
            grade_IS_1_1Course3Semester1User6.setGradePsychology(user6Psychology);
            grade_IS_1_1Course3Semester1User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_IS_1_1Course3Semester1User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_IS_1_1Course3Semester1User6.setGradeLifeSafety(user6LifeSafety);
            grade_IS_1_1Course3Semester1User6.setGradeStandardizationCertification(user6StandardizationCertification);
            grade_IS_1_1Course3Semester1User6.setGradeDevelopmentSoftwareModules(user6DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User6.setGradeSupportTestingSoftwareModules(user6SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User6.setGradeDatabaseDevelopmentProtectionTechnology(user6DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User6);

            //            //user7
            grade_IS_1_1Course3Semester1User7.setUsername(user7Username);
            grade_IS_1_1Course3Semester1User7.setGradePsychology(user7Psychology);
            grade_IS_1_1Course3Semester1User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_IS_1_1Course3Semester1User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_IS_1_1Course3Semester1User7.setGradeLifeSafety(user7LifeSafety);
            grade_IS_1_1Course3Semester1User7.setGradeStandardizationCertification(user7StandardizationCertification);
            grade_IS_1_1Course3Semester1User7.setGradeDevelopmentSoftwareModules(user7DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User7.setGradeSupportTestingSoftwareModules(user7SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User7.setGradeDatabaseDevelopmentProtectionTechnology(user7DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User7);

            //            //user8
            grade_IS_1_1Course3Semester1User8.setUsername(user8Username);
            grade_IS_1_1Course3Semester1User8.setGradePsychology(user8Psychology);
            grade_IS_1_1Course3Semester1User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_IS_1_1Course3Semester1User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_IS_1_1Course3Semester1User8.setGradeLifeSafety(user8LifeSafety);
            grade_IS_1_1Course3Semester1User8.setGradeStandardizationCertification(user8StandardizationCertification);
            grade_IS_1_1Course3Semester1User8.setGradeDevelopmentSoftwareModules(user8DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User8.setGradeSupportTestingSoftwareModules(user8SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User8.setGradeDatabaseDevelopmentProtectionTechnology(user8DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User8);

            //            //user9
            grade_IS_1_1Course3Semester1User9.setUsername(user9Username);
            grade_IS_1_1Course3Semester1User9.setGradePsychology(user9Psychology);
            grade_IS_1_1Course3Semester1User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_IS_1_1Course3Semester1User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_IS_1_1Course3Semester1User9.setGradeLifeSafety(user9LifeSafety);
            grade_IS_1_1Course3Semester1User9.setGradeStandardizationCertification(user9StandardizationCertification);
            grade_IS_1_1Course3Semester1User9.setGradeDevelopmentSoftwareModules(user9DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User9.setGradeSupportTestingSoftwareModules(user9SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User9.setGradeDatabaseDevelopmentProtectionTechnology(user9DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User9);


            //            //user10
            grade_IS_1_1Course3Semester1User10.setUsername(user10Username);
            grade_IS_1_1Course3Semester1User10.setGradePsychology(user10Psychology);
            grade_IS_1_1Course3Semester1User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_IS_1_1Course3Semester1User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_IS_1_1Course3Semester1User10.setGradeLifeSafety(user10LifeSafety);
            grade_IS_1_1Course3Semester1User10.setGradeStandardizationCertification(user10StandardizationCertification);
            grade_IS_1_1Course3Semester1User10.setGradeDevelopmentSoftwareModules(user10DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User10.setGradeSupportTestingSoftwareModules(user10SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User10.setGradeDatabaseDevelopmentProtectionTechnology(user10DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User10);

            //            //user11
            grade_IS_1_1Course3Semester1User11.setUsername(user11Username);
            grade_IS_1_1Course3Semester1User11.setGradePsychology(user11Psychology);
            grade_IS_1_1Course3Semester1User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_IS_1_1Course3Semester1User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_IS_1_1Course3Semester1User11.setGradeLifeSafety(user11LifeSafety);
            grade_IS_1_1Course3Semester1User11.setGradeStandardizationCertification(user11StandardizationCertification);
            grade_IS_1_1Course3Semester1User11.setGradeDevelopmentSoftwareModules(user11DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User11.setGradeSupportTestingSoftwareModules(user11SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User11.setGradeDatabaseDevelopmentProtectionTechnology(user11DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User11);


            //            //user12
            grade_IS_1_1Course3Semester1User12.setUsername(user12Username);
            grade_IS_1_1Course3Semester1User12.setGradePsychology(user12Psychology);
            grade_IS_1_1Course3Semester1User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_IS_1_1Course3Semester1User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_IS_1_1Course3Semester1User12.setGradeLifeSafety(user12LifeSafety);
            grade_IS_1_1Course3Semester1User12.setGradeStandardizationCertification(user12StandardizationCertification);
            grade_IS_1_1Course3Semester1User12.setGradeDevelopmentSoftwareModules(user12DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User12.setGradeSupportTestingSoftwareModules(user12SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User12.setGradeDatabaseDevelopmentProtectionTechnology(user12DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User12);

            //            //user13
            grade_IS_1_1Course3Semester1User13.setUsername(user13Username);
            grade_IS_1_1Course3Semester1User13.setGradePsychology(user13Psychology);
            grade_IS_1_1Course3Semester1User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_IS_1_1Course3Semester1User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_IS_1_1Course3Semester1User13.setGradeLifeSafety(user13LifeSafety);
            grade_IS_1_1Course3Semester1User13.setGradeStandardizationCertification(user13StandardizationCertification);
            grade_IS_1_1Course3Semester1User13.setGradeDevelopmentSoftwareModules(user13DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User13.setGradeSupportTestingSoftwareModules(user13SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User13.setGradeDatabaseDevelopmentProtectionTechnology(user13DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User13);

            //            //user14
            grade_IS_1_1Course3Semester1User14.setUsername(user14Username);
            grade_IS_1_1Course3Semester1User14.setGradePsychology(user14Psychology);
            grade_IS_1_1Course3Semester1User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_IS_1_1Course3Semester1User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_IS_1_1Course3Semester1User14.setGradeLifeSafety(user14LifeSafety);
            grade_IS_1_1Course3Semester1User14.setGradeStandardizationCertification(user14StandardizationCertification);
            grade_IS_1_1Course3Semester1User14.setGradeDevelopmentSoftwareModules(user14DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User14.setGradeSupportTestingSoftwareModules(user14SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User14.setGradeDatabaseDevelopmentProtectionTechnology(user14DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User14);

            //            //user15
            grade_IS_1_1Course3Semester1User15.setUsername(user15Username);
            grade_IS_1_1Course3Semester1User15.setGradePsychology(user15Psychology);
            grade_IS_1_1Course3Semester1User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_IS_1_1Course3Semester1User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_IS_1_1Course3Semester1User15.setGradeLifeSafety(user15LifeSafety);
            grade_IS_1_1Course3Semester1User15.setGradeStandardizationCertification(user15StandardizationCertification);
            grade_IS_1_1Course3Semester1User15.setGradeDevelopmentSoftwareModules(user15DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User15.setGradeSupportTestingSoftwareModules(user15SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User15.setGradeDatabaseDevelopmentProtectionTechnology(user15DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User15);

            //           //user16

            grade_IS_1_1Course3Semester1User16.setUsername(user16Username);
            grade_IS_1_1Course3Semester1User16.setGradePsychology(user16Psychology);
            grade_IS_1_1Course3Semester1User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_IS_1_1Course3Semester1User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_IS_1_1Course3Semester1User16.setGradeLifeSafety(user16LifeSafety);
            grade_IS_1_1Course3Semester1User16.setGradeStandardizationCertification(user16StandardizationCertification);
            grade_IS_1_1Course3Semester1User16.setGradeDevelopmentSoftwareModules(user16DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User16.setGradeSupportTestingSoftwareModules(user16SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User16.setGradeDatabaseDevelopmentProtectionTechnology(user16DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User16);


            //            //user17

            grade_IS_1_1Course3Semester1User17.setUsername(user17Username);
            grade_IS_1_1Course3Semester1User17.setGradePsychology(user17Psychology);
            grade_IS_1_1Course3Semester1User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_IS_1_1Course3Semester1User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_IS_1_1Course3Semester1User17.setGradeLifeSafety(user17LifeSafety);
            grade_IS_1_1Course3Semester1User17.setGradeStandardizationCertification(user17StandardizationCertification);
            grade_IS_1_1Course3Semester1User17.setGradeDevelopmentSoftwareModules(user17DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User17.setGradeSupportTestingSoftwareModules(user17SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User17.setGradeDatabaseDevelopmentProtectionTechnology(user17DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User17);

            //            //user18

            grade_IS_1_1Course3Semester1User18.setUsername(user18Username);
            grade_IS_1_1Course3Semester1User18.setGradePsychology(user18Psychology);
            grade_IS_1_1Course3Semester1User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_IS_1_1Course3Semester1User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_IS_1_1Course3Semester1User18.setGradeLifeSafety(user18LifeSafety);
            grade_IS_1_1Course3Semester1User18.setGradeStandardizationCertification(user18StandardizationCertification);
            grade_IS_1_1Course3Semester1User18.setGradeDevelopmentSoftwareModules(user18DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User18.setGradeSupportTestingSoftwareModules(user18SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User18.setGradeDatabaseDevelopmentProtectionTechnology(user18DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User18);


            //            //user19

            grade_IS_1_1Course3Semester1User19.setUsername(user19Username);
            grade_IS_1_1Course3Semester1User19.setGradePsychology(user19Psychology);
            grade_IS_1_1Course3Semester1User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_IS_1_1Course3Semester1User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_IS_1_1Course3Semester1User19.setGradeLifeSafety(user19LifeSafety);
            grade_IS_1_1Course3Semester1User19.setGradeStandardizationCertification(user19StandardizationCertification);
            grade_IS_1_1Course3Semester1User19.setGradeDevelopmentSoftwareModules(user19DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User19.setGradeSupportTestingSoftwareModules(user19SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User19.setGradeDatabaseDevelopmentProtectionTechnology(user19DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User19);

            //            //user20

            grade_IS_1_1Course3Semester1User20.setUsername(user20Username);
            grade_IS_1_1Course3Semester1User20.setGradePsychology(user20Psychology);
            grade_IS_1_1Course3Semester1User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_IS_1_1Course3Semester1User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_IS_1_1Course3Semester1User20.setGradeLifeSafety(user20LifeSafety);
            grade_IS_1_1Course3Semester1User20.setGradeStandardizationCertification(user20StandardizationCertification);
            grade_IS_1_1Course3Semester1User20.setGradeDevelopmentSoftwareModules(user20DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User20.setGradeSupportTestingSoftwareModules(user20SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User20.setGradeDatabaseDevelopmentProtectionTechnology(user20DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User20);

            //            //user21

            grade_IS_1_1Course3Semester1User21.setUsername(user21Username);
            grade_IS_1_1Course3Semester1User21.setGradePsychology(user21Psychology);
            grade_IS_1_1Course3Semester1User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_IS_1_1Course3Semester1User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_IS_1_1Course3Semester1User21.setGradeLifeSafety(user21LifeSafety);
            grade_IS_1_1Course3Semester1User21.setGradeStandardizationCertification(user21StandardizationCertification);
            grade_IS_1_1Course3Semester1User21.setGradeDevelopmentSoftwareModules(user21DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User21.setGradeSupportTestingSoftwareModules(user21SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User21.setGradeDatabaseDevelopmentProtectionTechnology(user21DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User21);

            //            //user22

            grade_IS_1_1Course3Semester1User22.setUsername(user22Username);
            grade_IS_1_1Course3Semester1User22.setGradePsychology(user22Psychology);
            grade_IS_1_1Course3Semester1User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_IS_1_1Course3Semester1User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_IS_1_1Course3Semester1User22.setGradeLifeSafety(user22LifeSafety);
            grade_IS_1_1Course3Semester1User22.setGradeStandardizationCertification(user22StandardizationCertification);
            grade_IS_1_1Course3Semester1User22.setGradeDevelopmentSoftwareModules(user22DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User22.setGradeSupportTestingSoftwareModules(user22SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User22.setGradeDatabaseDevelopmentProtectionTechnology(user22DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User22);

            //            //user23

            grade_IS_1_1Course3Semester1User23.setUsername(user23Username);
            grade_IS_1_1Course3Semester1User23.setGradePsychology(user23Psychology);
            grade_IS_1_1Course3Semester1User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_IS_1_1Course3Semester1User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_IS_1_1Course3Semester1User23.setGradeLifeSafety(user23LifeSafety);
            grade_IS_1_1Course3Semester1User23.setGradeStandardizationCertification(user23StandardizationCertification);
            grade_IS_1_1Course3Semester1User23.setGradeDevelopmentSoftwareModules(user23DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User23.setGradeSupportTestingSoftwareModules(user23SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User23.setGradeDatabaseDevelopmentProtectionTechnology(user23DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User23);

            //            //user24

            grade_IS_1_1Course3Semester1User24.setUsername(user24Username);
            grade_IS_1_1Course3Semester1User24.setGradePsychology(user24Psychology);
            grade_IS_1_1Course3Semester1User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_IS_1_1Course3Semester1User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_IS_1_1Course3Semester1User24.setGradeLifeSafety(user24LifeSafety);
            grade_IS_1_1Course3Semester1User24.setGradeStandardizationCertification(user24StandardizationCertification);
            grade_IS_1_1Course3Semester1User24.setGradeDevelopmentSoftwareModules(user24DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User24.setGradeSupportTestingSoftwareModules(user24SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User24.setGradeDatabaseDevelopmentProtectionTechnology(user24DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User24);

            //            //user25

            grade_IS_1_1Course3Semester1User25.setUsername(user25Username);
            grade_IS_1_1Course3Semester1User25.setGradePsychology(user25Psychology);
            grade_IS_1_1Course3Semester1User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_IS_1_1Course3Semester1User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_IS_1_1Course3Semester1User25.setGradeLifeSafety(user25LifeSafety);
            grade_IS_1_1Course3Semester1User25.setGradeStandardizationCertification(user25StandardizationCertification);
            grade_IS_1_1Course3Semester1User25.setGradeDevelopmentSoftwareModules(user25DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User25.setGradeSupportTestingSoftwareModules(user25SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User25.setGradeDatabaseDevelopmentProtectionTechnology(user25DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User25);

            //            //user26

            grade_IS_1_1Course3Semester1User26.setUsername(user26Username);
            grade_IS_1_1Course3Semester1User26.setGradePsychology(user26Psychology);
            grade_IS_1_1Course3Semester1User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_IS_1_1Course3Semester1User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_IS_1_1Course3Semester1User26.setGradeLifeSafety(user26LifeSafety);
            grade_IS_1_1Course3Semester1User26.setGradeStandardizationCertification(user26StandardizationCertification);
            grade_IS_1_1Course3Semester1User26.setGradeDevelopmentSoftwareModules(user26DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User26.setGradeSupportTestingSoftwareModules(user26SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User26.setGradeDatabaseDevelopmentProtectionTechnology(user26DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User26);

            //            //user27

            grade_IS_1_1Course3Semester1User27.setUsername(user27Username);
            grade_IS_1_1Course3Semester1User27.setGradePsychology(user27Psychology);
            grade_IS_1_1Course3Semester1User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_IS_1_1Course3Semester1User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_IS_1_1Course3Semester1User27.setGradeLifeSafety(user27LifeSafety);
            grade_IS_1_1Course3Semester1User27.setGradeStandardizationCertification(user27StandardizationCertification);
            grade_IS_1_1Course3Semester1User27.setGradeDevelopmentSoftwareModules(user27DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User27.setGradeSupportTestingSoftwareModules(user27SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User27.setGradeDatabaseDevelopmentProtectionTechnology(user27DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User27);

            //            //user28

            grade_IS_1_1Course3Semester1User28.setUsername(user28Username);
            grade_IS_1_1Course3Semester1User28.setGradePsychology(user28Psychology);
            grade_IS_1_1Course3Semester1User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_IS_1_1Course3Semester1User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_IS_1_1Course3Semester1User28.setGradeLifeSafety(user28LifeSafety);
            grade_IS_1_1Course3Semester1User28.setGradeStandardizationCertification(user28StandardizationCertification);
            grade_IS_1_1Course3Semester1User28.setGradeDevelopmentSoftwareModules(user28DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User28.setGradeSupportTestingSoftwareModules(user28SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User28.setGradeDatabaseDevelopmentProtectionTechnology(user28DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User28);

            //            //user29

            grade_IS_1_1Course3Semester1User29.setUsername(user29Username);
            grade_IS_1_1Course3Semester1User29.setGradePsychology(user29Psychology);
            grade_IS_1_1Course3Semester1User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_IS_1_1Course3Semester1User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_IS_1_1Course3Semester1User29.setGradeLifeSafety(user29LifeSafety);
            grade_IS_1_1Course3Semester1User29.setGradeStandardizationCertification(user29StandardizationCertification);
            grade_IS_1_1Course3Semester1User29.setGradeDevelopmentSoftwareModules(user29DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User29.setGradeSupportTestingSoftwareModules(user29SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User29.setGradeDatabaseDevelopmentProtectionTechnology(user29DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User29);

            //            //user30

            grade_IS_1_1Course3Semester1User30.setUsername(user30Username);
            grade_IS_1_1Course3Semester1User30.setGradePsychology(user30Psychology);
            grade_IS_1_1Course3Semester1User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_IS_1_1Course3Semester1User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_IS_1_1Course3Semester1User30.setGradeLifeSafety(user30LifeSafety);
            grade_IS_1_1Course3Semester1User30.setGradeStandardizationCertification(user30StandardizationCertification);
            grade_IS_1_1Course3Semester1User30.setGradeDevelopmentSoftwareModules(user30DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User30.setGradeSupportTestingSoftwareModules(user30SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User30.setGradeDatabaseDevelopmentProtectionTechnology(user30DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User30);

            //            //user31

            grade_IS_1_1Course3Semester1User31.setUsername(user31Username);
            grade_IS_1_1Course3Semester1User31.setGradePsychology(user31Psychology);
            grade_IS_1_1Course3Semester1User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_IS_1_1Course3Semester1User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_IS_1_1Course3Semester1User31.setGradeLifeSafety(user31LifeSafety);
            grade_IS_1_1Course3Semester1User31.setGradeStandardizationCertification(user31StandardizationCertification);
            grade_IS_1_1Course3Semester1User31.setGradeDevelopmentSoftwareModules(user31DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User31.setGradeSupportTestingSoftwareModules(user31SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User31.setGradeDatabaseDevelopmentProtectionTechnology(user31DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User31);

            //            //user32

            grade_IS_1_1Course3Semester1User32.setUsername(user32Username);
            grade_IS_1_1Course3Semester1User32.setGradePsychology(user32Psychology);
            grade_IS_1_1Course3Semester1User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_IS_1_1Course3Semester1User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_IS_1_1Course3Semester1User32.setGradeLifeSafety(user32LifeSafety);
            grade_IS_1_1Course3Semester1User32.setGradeStandardizationCertification(user32StandardizationCertification);
            grade_IS_1_1Course3Semester1User32.setGradeDevelopmentSoftwareModules(user32DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User32.setGradeSupportTestingSoftwareModules(user32SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User32.setGradeDatabaseDevelopmentProtectionTechnology(user32DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User32);

            //            //user33

            grade_IS_1_1Course3Semester1User33.setUsername(user33Username);
            grade_IS_1_1Course3Semester1User33.setGradePsychology(user33Psychology);
            grade_IS_1_1Course3Semester1User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_IS_1_1Course3Semester1User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_IS_1_1Course3Semester1User33.setGradeLifeSafety(user33LifeSafety);
            grade_IS_1_1Course3Semester1User33.setGradeStandardizationCertification(user33StandardizationCertification);
            grade_IS_1_1Course3Semester1User33.setGradeDevelopmentSoftwareModules(user33DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User33.setGradeSupportTestingSoftwareModules(user33SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User33.setGradeDatabaseDevelopmentProtectionTechnology(user33DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User33);

            //            //user34

            grade_IS_1_1Course3Semester1User34.setUsername(user34Username);
            grade_IS_1_1Course3Semester1User34.setGradePsychology(user34Psychology);
            grade_IS_1_1Course3Semester1User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_IS_1_1Course3Semester1User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_IS_1_1Course3Semester1User34.setGradeLifeSafety(user34LifeSafety);
            grade_IS_1_1Course3Semester1User34.setGradeStandardizationCertification(user34StandardizationCertification);
            grade_IS_1_1Course3Semester1User34.setGradeDevelopmentSoftwareModules(user34DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User34.setGradeSupportTestingSoftwareModules(user34SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User34.setGradeDatabaseDevelopmentProtectionTechnology(user34DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User34);

            //            //user35

            grade_IS_1_1Course3Semester1User35.setUsername(user35Username);
            grade_IS_1_1Course3Semester1User35.setGradePsychology(user35Psychology);
            grade_IS_1_1Course3Semester1User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_IS_1_1Course3Semester1User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_IS_1_1Course3Semester1User35.setGradeLifeSafety(user35LifeSafety);
            grade_IS_1_1Course3Semester1User35.setGradeStandardizationCertification(user35StandardizationCertification);
            grade_IS_1_1Course3Semester1User35.setGradeDevelopmentSoftwareModules(user35DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User35.setGradeSupportTestingSoftwareModules(user35SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User35.setGradeDatabaseDevelopmentProtectionTechnology(user35DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User35);

            //            //user36

            grade_IS_1_1Course3Semester1User36.setUsername(user36Username);
            grade_IS_1_1Course3Semester1User36.setGradePsychology(user36Psychology);
            grade_IS_1_1Course3Semester1User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_IS_1_1Course3Semester1User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_IS_1_1Course3Semester1User36.setGradeLifeSafety(user36LifeSafety);
            grade_IS_1_1Course3Semester1User36.setGradeStandardizationCertification(user36StandardizationCertification);
            grade_IS_1_1Course3Semester1User36.setGradeDevelopmentSoftwareModules(user36DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User36.setGradeSupportTestingSoftwareModules(user36SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User36.setGradeDatabaseDevelopmentProtectionTechnology(user36DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User36);

            //            //user37

            grade_IS_1_1Course3Semester1User37.setUsername(user37Username);
            grade_IS_1_1Course3Semester1User37.setGradePsychology(user37Psychology);
            grade_IS_1_1Course3Semester1User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_IS_1_1Course3Semester1User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_IS_1_1Course3Semester1User37.setGradeLifeSafety(user37LifeSafety);
            grade_IS_1_1Course3Semester1User37.setGradeStandardizationCertification(user37StandardizationCertification);
            grade_IS_1_1Course3Semester1User37.setGradeDevelopmentSoftwareModules(user37DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User37.setGradeSupportTestingSoftwareModules(user37SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User37.setGradeDatabaseDevelopmentProtectionTechnology(user37DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User37);

            //            //user38

            grade_IS_1_1Course3Semester1User38.setUsername(user38Username);
            grade_IS_1_1Course3Semester1User38.setGradePsychology(user38Psychology);
            grade_IS_1_1Course3Semester1User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_IS_1_1Course3Semester1User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_IS_1_1Course3Semester1User38.setGradeLifeSafety(user38LifeSafety);
            grade_IS_1_1Course3Semester1User38.setGradeStandardizationCertification(user38StandardizationCertification);
            grade_IS_1_1Course3Semester1User38.setGradeDevelopmentSoftwareModules(user38DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User38.setGradeSupportTestingSoftwareModules(user38SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User38.setGradeDatabaseDevelopmentProtectionTechnology(user38DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User38);

            //            //user39

            grade_IS_1_1Course3Semester1User39.setUsername(user39Username);
            grade_IS_1_1Course3Semester1User39.setGradePsychology(user39Psychology);
            grade_IS_1_1Course3Semester1User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_IS_1_1Course3Semester1User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_IS_1_1Course3Semester1User39.setGradeLifeSafety(user39LifeSafety);
            grade_IS_1_1Course3Semester1User39.setGradeStandardizationCertification(user39StandardizationCertification);
            grade_IS_1_1Course3Semester1User39.setGradeDevelopmentSoftwareModules(user39DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User39.setGradeSupportTestingSoftwareModules(user39SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User39.setGradeDatabaseDevelopmentProtectionTechnology(user39DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User39);

            //            //user40

            grade_IS_1_1Course3Semester1User40.setUsername(user40Username);
            grade_IS_1_1Course3Semester1User40.setGradePsychology(user40Psychology);
            grade_IS_1_1Course3Semester1User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_IS_1_1Course3Semester1User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_IS_1_1Course3Semester1User40.setGradeLifeSafety(user40LifeSafety);
            grade_IS_1_1Course3Semester1User40.setGradeStandardizationCertification(user40StandardizationCertification);
            grade_IS_1_1Course3Semester1User40.setGradeDevelopmentSoftwareModules(user40DevelopmentSoftwareModules);
            grade_IS_1_1Course3Semester1User40.setGradeSupportTestingSoftwareModules(user40SupportTestingSoftwareModules);
            grade_IS_1_1Course3Semester1User40.setGradeDatabaseDevelopmentProtectionTechnology(user40DatabaseDevelopmentProtectionTechnology);
            gradeIs11Course3Semester1Repository.save(grade_IS_1_1Course3Semester1User40);

        } catch (Exception ignore) {

        }

    }
}
