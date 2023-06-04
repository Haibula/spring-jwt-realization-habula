package com.example.demoauth.service.moderatorService.moderator_is1Service.course4;

import com.example.demoauth.models.grade_is1.models.course4.Grade_IS_1_1Course4Semester2;
import com.example.demoauth.repository.is1Repository.course4.Grade_IS_1_1Course4Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1Course4Semester2 {
    @Autowired
    Grade_IS_1_1Course4Semester2Repository gradeIs11Course4Semester2Repository;

    //GetMappingGradeCourse4Semester2
    public void getMappingMethodModer_is_1_1GreadeСourse4Semester2(@PathVariable String month, Model model) {

        List<Grade_IS_1_1Course4Semester2> res = gradeIs11Course4Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course4Semester2::getUserID));
        List<Grade_IS_1_1Course4Semester2> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> januaryList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> februaryList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> marchList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> aprilList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> mayList = new ArrayList<>();
        List<Grade_IS_1_1Course4Semester2> juneList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new Grade_IS_1_1Course4Semester2());
        }

        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).getMonth().equals("january")) {
                januaryList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("february")) {
                februaryList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("march")) {
                marchList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("april")) {
                aprilList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("may")) {
                mayList.add(res.get(i));
            } else if (res.get(i).getMonth().equals("june")) {
                juneList.add(res.get(i));
            }
        }

        if (month.equals("january") && !januaryList.isEmpty()) {
            model.addAttribute("post", januaryList);
        } else if (month.equals("february") && !februaryList.isEmpty()) {
            model.addAttribute("post", februaryList);
        } else if (month.equals("march") && !marchList.isEmpty()) {
            model.addAttribute("post", marchList);
        } else if (month.equals("april") && !aprilList.isEmpty()) {
            model.addAttribute("post", aprilList);
        } else if (month.equals("may") && !mayList.isEmpty()) {
            model.addAttribute("post", mayList);
        } else if (month.equals("june") && !juneList.isEmpty()) {
            model.addAttribute("post", juneList);
        } else {
            model.addAttribute("post", voidList);
        }

        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        }
    }

    //PostMappingGradeCourse4Semester2
    public void postMappingMethodModer_is_1_1GreadeСourse4Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1FundamentalsPhilosophy = splitUser1Grades[2];
            String user1EnglishLanguage = splitUser1Grades[3];
            String user1PhysicalTraining = splitUser1Grades[4];
            String user1LegalSupportProfessionalActivity = splitUser1Grades[5];
            String user1NumericalMethods = splitUser1Grades[6];
            String user1ManagementProfessionalActivity = splitUser1Grades[7];
            String user1MathematicalModels = splitUser1Grades[8];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2FundamentalsPhilosophy = splitUser2Grades[2];
            String user2EnglishLanguage = splitUser2Grades[3];
            String user2PhysicalTraining = splitUser2Grades[4];
            String user2LegalSupportProfessionalActivity = splitUser2Grades[5];
            String user2NumericalMethods = splitUser2Grades[6];
            String user2ManagementProfessionalActivity = splitUser2Grades[7];
            String user2MathematicalModels = splitUser2Grades[8];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3FundamentalsPhilosophy = splitUser3Grades[2];
            String user3EnglishLanguage = splitUser3Grades[3];
            String user3PhysicalTraining = splitUser3Grades[4];
            String user3LegalSupportProfessionalActivity = splitUser3Grades[5];
            String user3NumericalMethods = splitUser3Grades[6];
            String user3ManagementProfessionalActivity = splitUser3Grades[7];
            String user3MathematicalModels = splitUser3Grades[8];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4FundamentalsPhilosophy = splitUser4Grades[2];
            String user4EnglishLanguage = splitUser4Grades[3];
            String user4PhysicalTraining = splitUser4Grades[4];
            String user4LegalSupportProfessionalActivity = splitUser4Grades[5];
            String user4NumericalMethods = splitUser4Grades[6];
            String user4ManagementProfessionalActivity = splitUser4Grades[7];
            String user4MathematicalModels = splitUser4Grades[8];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5FundamentalsPhilosophy = splitUser5Grades[2];
            String user5EnglishLanguage = splitUser5Grades[3];
            String user5PhysicalTraining = splitUser5Grades[4];
            String user5LegalSupportProfessionalActivity = splitUser5Grades[5];
            String user5NumericalMethods = splitUser5Grades[6];
            String user5ManagementProfessionalActivity = splitUser5Grades[7];
            String user5MathematicalModels = splitUser5Grades[8];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6FundamentalsPhilosophy = splitUser6Grades[2];
            String user6EnglishLanguage = splitUser6Grades[3];
            String user6PhysicalTraining = splitUser6Grades[4];
            String user6LegalSupportProfessionalActivity = splitUser6Grades[5];
            String user6NumericalMethods = splitUser6Grades[6];
            String user6ManagementProfessionalActivity = splitUser6Grades[7];
            String user6MathematicalModels = splitUser6Grades[8];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7FundamentalsPhilosophy = splitUser7Grades[2];
            String user7EnglishLanguage = splitUser7Grades[3];
            String user7PhysicalTraining = splitUser7Grades[4];
            String user7LegalSupportProfessionalActivity = splitUser7Grades[5];
            String user7NumericalMethods = splitUser7Grades[6];
            String user7ManagementProfessionalActivity = splitUser7Grades[7];
            String user7MathematicalModels = splitUser7Grades[8];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8FundamentalsPhilosophy = splitUser8Grades[2];
            String user8EnglishLanguage = splitUser8Grades[3];
            String user8PhysicalTraining = splitUser8Grades[4];
            String user8LegalSupportProfessionalActivity = splitUser8Grades[5];
            String user8NumericalMethods = splitUser8Grades[6];
            String user8ManagementProfessionalActivity = splitUser8Grades[7];
            String user8MathematicalModels = splitUser8Grades[8];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9FundamentalsPhilosophy = splitUser9Grades[2];
            String user9EnglishLanguage = splitUser9Grades[3];
            String user9PhysicalTraining = splitUser9Grades[4];
            String user9LegalSupportProfessionalActivity = splitUser9Grades[5];
            String user9NumericalMethods = splitUser9Grades[6];
            String user9ManagementProfessionalActivity = splitUser9Grades[7];
            String user9MathematicalModels = splitUser9Grades[8];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10FundamentalsPhilosophy = splitUser10Grades[2];
            String user10EnglishLanguage = splitUser10Grades[3];
            String user10PhysicalTraining = splitUser10Grades[4];
            String user10LegalSupportProfessionalActivity = splitUser10Grades[5];
            String user10NumericalMethods = splitUser10Grades[6];
            String user10ManagementProfessionalActivity = splitUser10Grades[7];
            String user10MathematicalModels = splitUser10Grades[8];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11FundamentalsPhilosophy = splitUser11Grades[2];
            String user11EnglishLanguage = splitUser11Grades[3];
            String user11PhysicalTraining = splitUser11Grades[4];
            String user11LegalSupportProfessionalActivity = splitUser11Grades[5];
            String user11NumericalMethods = splitUser11Grades[6];
            String user11ManagementProfessionalActivity = splitUser11Grades[7];
            String user11MathematicalModels = splitUser11Grades[8];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12FundamentalsPhilosophy = splitUser12Grades[2];
            String user12EnglishLanguage = splitUser12Grades[3];
            String user12PhysicalTraining = splitUser12Grades[4];
            String user12LegalSupportProfessionalActivity = splitUser12Grades[5];
            String user12NumericalMethods = splitUser12Grades[6];
            String user12ManagementProfessionalActivity = splitUser12Grades[7];
            String user12MathematicalModels = splitUser12Grades[8];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13FundamentalsPhilosophy = splitUser13Grades[2];
            String user13EnglishLanguage = splitUser13Grades[3];
            String user13PhysicalTraining = splitUser13Grades[4];
            String user13LegalSupportProfessionalActivity = splitUser13Grades[5];
            String user13NumericalMethods = splitUser13Grades[6];
            String user13ManagementProfessionalActivity = splitUser13Grades[7];
            String user13MathematicalModels = splitUser13Grades[8];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14FundamentalsPhilosophy = splitUser14Grades[2];
            String user14EnglishLanguage = splitUser14Grades[3];
            String user14PhysicalTraining = splitUser14Grades[4];
            String user14LegalSupportProfessionalActivity = splitUser14Grades[5];
            String user14NumericalMethods = splitUser14Grades[6];
            String user14ManagementProfessionalActivity = splitUser14Grades[7];
            String user14MathematicalModels = splitUser14Grades[8];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15FundamentalsPhilosophy = splitUser15Grades[2];
            String user15EnglishLanguage = splitUser15Grades[3];
            String user15PhysicalTraining = splitUser15Grades[4];
            String user15LegalSupportProfessionalActivity = splitUser15Grades[5];
            String user15NumericalMethods = splitUser15Grades[6];
            String user15ManagementProfessionalActivity = splitUser15Grades[7];
            String user15MathematicalModels = splitUser15Grades[8];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16FundamentalsPhilosophy = splitUser16Grades[2];
            String user16EnglishLanguage = splitUser16Grades[3];
            String user16PhysicalTraining = splitUser16Grades[4];
            String user16LegalSupportProfessionalActivity = splitUser16Grades[5];
            String user16NumericalMethods = splitUser16Grades[6];
            String user16ManagementProfessionalActivity = splitUser16Grades[7];
            String user16MathematicalModels = splitUser16Grades[8];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17FundamentalsPhilosophy = splitUser17Grades[2];
            String user17EnglishLanguage = splitUser17Grades[3];
            String user17PhysicalTraining = splitUser17Grades[4];
            String user17LegalSupportProfessionalActivity = splitUser17Grades[5];
            String user17NumericalMethods = splitUser17Grades[6];
            String user17ManagementProfessionalActivity = splitUser17Grades[7];
            String user17MathematicalModels = splitUser17Grades[8];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18FundamentalsPhilosophy = splitUser18Grades[2];
            String user18EnglishLanguage = splitUser18Grades[3];
            String user18PhysicalTraining = splitUser18Grades[4];
            String user18LegalSupportProfessionalActivity = splitUser18Grades[5];
            String user18NumericalMethods = splitUser18Grades[6];
            String user18ManagementProfessionalActivity = splitUser18Grades[7];
            String user18MathematicalModels = splitUser18Grades[8];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19FundamentalsPhilosophy = splitUser19Grades[2];
            String user19EnglishLanguage = splitUser19Grades[3];
            String user19PhysicalTraining = splitUser19Grades[4];
            String user19LegalSupportProfessionalActivity = splitUser19Grades[5];
            String user19NumericalMethods = splitUser19Grades[6];
            String user19ManagementProfessionalActivity = splitUser19Grades[7];
            String user19MathematicalModels = splitUser19Grades[8];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20FundamentalsPhilosophy = splitUser20Grades[2];
            String user20EnglishLanguage = splitUser20Grades[3];
            String user20PhysicalTraining = splitUser20Grades[4];
            String user20LegalSupportProfessionalActivity = splitUser20Grades[5];
            String user20NumericalMethods = splitUser20Grades[6];
            String user20ManagementProfessionalActivity = splitUser20Grades[7];
            String user20MathematicalModels = splitUser20Grades[8];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21FundamentalsPhilosophy = splitUser21Grades[2];
            String user21EnglishLanguage = splitUser21Grades[3];
            String user21PhysicalTraining = splitUser21Grades[4];
            String user21LegalSupportProfessionalActivity = splitUser21Grades[5];
            String user21NumericalMethods = splitUser21Grades[6];
            String user21ManagementProfessionalActivity = splitUser21Grades[7];
            String user21MathematicalModels = splitUser21Grades[8];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22FundamentalsPhilosophy = splitUser22Grades[2];
            String user22EnglishLanguage = splitUser22Grades[3];
            String user22PhysicalTraining = splitUser22Grades[4];
            String user22LegalSupportProfessionalActivity = splitUser22Grades[5];
            String user22NumericalMethods = splitUser22Grades[6];
            String user22ManagementProfessionalActivity = splitUser22Grades[7];
            String user22MathematicalModels = splitUser22Grades[8];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23FundamentalsPhilosophy = splitUser23Grades[2];
            String user23EnglishLanguage = splitUser23Grades[3];
            String user23PhysicalTraining = splitUser23Grades[4];
            String user23LegalSupportProfessionalActivity = splitUser23Grades[5];
            String user23NumericalMethods = splitUser23Grades[6];
            String user23ManagementProfessionalActivity = splitUser23Grades[7];
            String user23MathematicalModels = splitUser23Grades[8];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24FundamentalsPhilosophy = splitUser24Grades[2];
            String user24EnglishLanguage = splitUser24Grades[3];
            String user24PhysicalTraining = splitUser24Grades[4];
            String user24LegalSupportProfessionalActivity = splitUser24Grades[5];
            String user24NumericalMethods = splitUser24Grades[6];
            String user24ManagementProfessionalActivity = splitUser24Grades[7];
            String user24MathematicalModels = splitUser24Grades[8];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25FundamentalsPhilosophy = splitUser25Grades[2];
            String user25EnglishLanguage = splitUser25Grades[3];
            String user25PhysicalTraining = splitUser25Grades[4];
            String user25LegalSupportProfessionalActivity = splitUser25Grades[5];
            String user25NumericalMethods = splitUser25Grades[6];
            String user25ManagementProfessionalActivity = splitUser25Grades[7];
            String user25MathematicalModels = splitUser25Grades[8];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26FundamentalsPhilosophy = splitUser26Grades[2];
            String user26EnglishLanguage = splitUser26Grades[3];
            String user26PhysicalTraining = splitUser26Grades[4];
            String user26LegalSupportProfessionalActivity = splitUser26Grades[5];
            String user26NumericalMethods = splitUser26Grades[6];
            String user26ManagementProfessionalActivity = splitUser26Grades[7];
            String user26MathematicalModels = splitUser26Grades[8];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27FundamentalsPhilosophy = splitUser27Grades[2];
            String user27EnglishLanguage = splitUser27Grades[3];
            String user27PhysicalTraining = splitUser27Grades[4];
            String user27LegalSupportProfessionalActivity = splitUser27Grades[5];
            String user27NumericalMethods = splitUser27Grades[6];
            String user27ManagementProfessionalActivity = splitUser27Grades[7];
            String user27MathematicalModels = splitUser27Grades[8];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28FundamentalsPhilosophy = splitUser28Grades[2];
            String user28EnglishLanguage = splitUser28Grades[3];
            String user28PhysicalTraining = splitUser28Grades[4];
            String user28LegalSupportProfessionalActivity = splitUser28Grades[5];
            String user28NumericalMethods = splitUser28Grades[6];
            String user28ManagementProfessionalActivity = splitUser28Grades[7];
            String user28MathematicalModels = splitUser28Grades[8];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29FundamentalsPhilosophy = splitUser29Grades[2];
            String user29EnglishLanguage = splitUser29Grades[3];
            String user29PhysicalTraining = splitUser29Grades[4];
            String user29LegalSupportProfessionalActivity = splitUser29Grades[5];
            String user29NumericalMethods = splitUser29Grades[6];
            String user29ManagementProfessionalActivity = splitUser29Grades[7];
            String user29MathematicalModels = splitUser29Grades[8];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30FundamentalsPhilosophy = splitUser30Grades[2];
            String user30EnglishLanguage = splitUser30Grades[3];
            String user30PhysicalTraining = splitUser30Grades[4];
            String user30LegalSupportProfessionalActivity = splitUser30Grades[5];
            String user30NumericalMethods = splitUser30Grades[6];
            String user30ManagementProfessionalActivity = splitUser30Grades[7];
            String user30MathematicalModels = splitUser30Grades[8];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31FundamentalsPhilosophy = splitUser31Grades[2];
            String user31EnglishLanguage = splitUser31Grades[3];
            String user31PhysicalTraining = splitUser31Grades[4];
            String user31LegalSupportProfessionalActivity = splitUser31Grades[5];
            String user31NumericalMethods = splitUser31Grades[6];
            String user31ManagementProfessionalActivity = splitUser31Grades[7];
            String user31MathematicalModels = splitUser31Grades[8];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32FundamentalsPhilosophy = splitUser32Grades[2];
            String user32EnglishLanguage = splitUser32Grades[3];
            String user32PhysicalTraining = splitUser32Grades[4];
            String user32LegalSupportProfessionalActivity = splitUser32Grades[5];
            String user32NumericalMethods = splitUser32Grades[6];
            String user32ManagementProfessionalActivity = splitUser32Grades[7];
            String user32MathematicalModels = splitUser32Grades[8];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33FundamentalsPhilosophy = splitUser33Grades[2];
            String user33EnglishLanguage = splitUser33Grades[3];
            String user33PhysicalTraining = splitUser33Grades[4];
            String user33LegalSupportProfessionalActivity = splitUser33Grades[5];
            String user33NumericalMethods = splitUser33Grades[6];
            String user33ManagementProfessionalActivity = splitUser33Grades[7];
            String user33MathematicalModels = splitUser33Grades[8];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34FundamentalsPhilosophy = splitUser34Grades[2];
            String user34EnglishLanguage = splitUser34Grades[3];
            String user34PhysicalTraining = splitUser34Grades[4];
            String user34LegalSupportProfessionalActivity = splitUser34Grades[5];
            String user34NumericalMethods = splitUser34Grades[6];
            String user34ManagementProfessionalActivity = splitUser34Grades[7];
            String user34MathematicalModels = splitUser34Grades[8];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35FundamentalsPhilosophy = splitUser35Grades[2];
            String user35EnglishLanguage = splitUser35Grades[3];
            String user35PhysicalTraining = splitUser35Grades[4];
            String user35LegalSupportProfessionalActivity = splitUser35Grades[5];
            String user35NumericalMethods = splitUser35Grades[6];
            String user35ManagementProfessionalActivity = splitUser35Grades[7];
            String user35MathematicalModels = splitUser35Grades[8];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36FundamentalsPhilosophy = splitUser36Grades[2];
            String user36EnglishLanguage = splitUser36Grades[3];
            String user36PhysicalTraining = splitUser36Grades[4];
            String user36LegalSupportProfessionalActivity = splitUser36Grades[5];
            String user36NumericalMethods = splitUser36Grades[6];
            String user36ManagementProfessionalActivity = splitUser36Grades[7];
            String user36MathematicalModels = splitUser36Grades[8];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37FundamentalsPhilosophy = splitUser37Grades[2];
            String user37EnglishLanguage = splitUser37Grades[3];
            String user37PhysicalTraining = splitUser37Grades[4];
            String user37LegalSupportProfessionalActivity = splitUser37Grades[5];
            String user37NumericalMethods = splitUser37Grades[6];
            String user37ManagementProfessionalActivity = splitUser37Grades[7];
            String user37MathematicalModels = splitUser37Grades[8];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38FundamentalsPhilosophy = splitUser38Grades[2];
            String user38EnglishLanguage = splitUser38Grades[3];
            String user38PhysicalTraining = splitUser38Grades[4];
            String user38LegalSupportProfessionalActivity = splitUser38Grades[5];
            String user38NumericalMethods = splitUser38Grades[6];
            String user38ManagementProfessionalActivity = splitUser38Grades[7];
            String user38MathematicalModels = splitUser38Grades[8];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39FundamentalsPhilosophy = splitUser39Grades[2];
            String user39EnglishLanguage = splitUser39Grades[3];
            String user39PhysicalTraining = splitUser39Grades[4];
            String user39LegalSupportProfessionalActivity = splitUser39Grades[5];
            String user39NumericalMethods = splitUser39Grades[6];
            String user39ManagementProfessionalActivity = splitUser39Grades[7];
            String user39MathematicalModels = splitUser39Grades[8];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40FundamentalsPhilosophy = splitUser40Grades[2];
            String user40EnglishLanguage = splitUser40Grades[3];
            String user40PhysicalTraining = splitUser40Grades[4];
            String user40LegalSupportProfessionalActivity = splitUser40Grades[5];
            String user40NumericalMethods = splitUser40Grades[6];
            String user40ManagementProfessionalActivity = splitUser40Grades[7];
            String user40MathematicalModels = splitUser40Grades[8];


            ArrayList<Grade_IS_1_1Course4Semester2> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course4Semester2(user1Id, user1Username, user1FundamentalsPhilosophy, user1EnglishLanguage, user1PhysicalTraining, user1LegalSupportProfessionalActivity, user1NumericalMethods, user1ManagementProfessionalActivity, user1MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user2Id, user2Username, user2FundamentalsPhilosophy, user2EnglishLanguage, user2PhysicalTraining, user2LegalSupportProfessionalActivity, user2NumericalMethods, user2ManagementProfessionalActivity, user2MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user3Id, user3Username, user3FundamentalsPhilosophy, user3EnglishLanguage, user3PhysicalTraining, user3LegalSupportProfessionalActivity, user3NumericalMethods, user3ManagementProfessionalActivity, user3MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user4Id, user4Username, user4FundamentalsPhilosophy, user4EnglishLanguage, user4PhysicalTraining, user4LegalSupportProfessionalActivity, user4NumericalMethods, user4ManagementProfessionalActivity, user4MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user5Id, user5Username, user5FundamentalsPhilosophy, user5EnglishLanguage, user5PhysicalTraining, user5LegalSupportProfessionalActivity, user5NumericalMethods, user5ManagementProfessionalActivity, user5MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user6Id, user6Username, user6FundamentalsPhilosophy, user6EnglishLanguage, user6PhysicalTraining, user6LegalSupportProfessionalActivity, user6NumericalMethods, user6ManagementProfessionalActivity, user6MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user7Id, user7Username, user7FundamentalsPhilosophy, user7EnglishLanguage, user7PhysicalTraining, user7LegalSupportProfessionalActivity, user7NumericalMethods, user7ManagementProfessionalActivity, user7MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user8Id, user8Username, user8FundamentalsPhilosophy, user8EnglishLanguage, user8PhysicalTraining, user8LegalSupportProfessionalActivity, user8NumericalMethods, user8ManagementProfessionalActivity, user8MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user9Id, user9Username, user9FundamentalsPhilosophy, user9EnglishLanguage, user9PhysicalTraining, user9LegalSupportProfessionalActivity, user9NumericalMethods, user9ManagementProfessionalActivity, user9MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user10Id, user10Username, user10FundamentalsPhilosophy, user10EnglishLanguage, user10PhysicalTraining, user10LegalSupportProfessionalActivity, user10NumericalMethods, user10ManagementProfessionalActivity, user10MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user11Id, user11Username, user11FundamentalsPhilosophy, user11EnglishLanguage, user11PhysicalTraining, user11LegalSupportProfessionalActivity, user11NumericalMethods, user11ManagementProfessionalActivity, user11MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user12Id, user12Username, user12FundamentalsPhilosophy, user12EnglishLanguage, user12PhysicalTraining, user12LegalSupportProfessionalActivity, user12NumericalMethods, user12ManagementProfessionalActivity, user12MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user13Id, user13Username, user13FundamentalsPhilosophy, user13EnglishLanguage, user13PhysicalTraining, user13LegalSupportProfessionalActivity, user13NumericalMethods, user13ManagementProfessionalActivity, user13MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user14Id, user14Username, user14FundamentalsPhilosophy, user14EnglishLanguage, user14PhysicalTraining, user14LegalSupportProfessionalActivity, user14NumericalMethods, user14ManagementProfessionalActivity, user14MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user15Id, user15Username, user15FundamentalsPhilosophy, user15EnglishLanguage, user15PhysicalTraining, user15LegalSupportProfessionalActivity, user15NumericalMethods, user15ManagementProfessionalActivity, user15MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user16Id, user16Username, user16FundamentalsPhilosophy, user16EnglishLanguage, user16PhysicalTraining, user16LegalSupportProfessionalActivity, user16NumericalMethods, user16ManagementProfessionalActivity, user16MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user17Id, user17Username, user17FundamentalsPhilosophy, user17EnglishLanguage, user17PhysicalTraining, user17LegalSupportProfessionalActivity, user17NumericalMethods, user17ManagementProfessionalActivity, user17MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user18Id, user18Username, user18FundamentalsPhilosophy, user18EnglishLanguage, user18PhysicalTraining, user18LegalSupportProfessionalActivity, user18NumericalMethods, user18ManagementProfessionalActivity, user18MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user19Id, user19Username, user19FundamentalsPhilosophy, user19EnglishLanguage, user19PhysicalTraining, user19LegalSupportProfessionalActivity, user19NumericalMethods, user19ManagementProfessionalActivity, user19MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user20Id, user20Username, user20FundamentalsPhilosophy, user20EnglishLanguage, user20PhysicalTraining, user20LegalSupportProfessionalActivity, user20NumericalMethods, user20ManagementProfessionalActivity, user20MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user21Id, user21Username, user21FundamentalsPhilosophy, user21EnglishLanguage, user21PhysicalTraining, user21LegalSupportProfessionalActivity, user21NumericalMethods, user21ManagementProfessionalActivity, user21MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user22Id, user22Username, user22FundamentalsPhilosophy, user22EnglishLanguage, user22PhysicalTraining, user22LegalSupportProfessionalActivity, user22NumericalMethods, user22ManagementProfessionalActivity, user22MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user23Id, user23Username, user23FundamentalsPhilosophy, user23EnglishLanguage, user23PhysicalTraining, user23LegalSupportProfessionalActivity, user23NumericalMethods, user23ManagementProfessionalActivity, user23MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user24Id, user24Username, user24FundamentalsPhilosophy, user24EnglishLanguage, user24PhysicalTraining, user24LegalSupportProfessionalActivity, user24NumericalMethods, user24ManagementProfessionalActivity, user24MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user25Id, user25Username, user25FundamentalsPhilosophy, user25EnglishLanguage, user25PhysicalTraining, user25LegalSupportProfessionalActivity, user25NumericalMethods, user25ManagementProfessionalActivity, user25MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user26Id, user26Username, user26FundamentalsPhilosophy, user26EnglishLanguage, user26PhysicalTraining, user26LegalSupportProfessionalActivity, user26NumericalMethods, user26ManagementProfessionalActivity, user26MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user27Id, user27Username, user27FundamentalsPhilosophy, user27EnglishLanguage, user27PhysicalTraining, user27LegalSupportProfessionalActivity, user27NumericalMethods, user27ManagementProfessionalActivity, user27MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user28Id, user28Username, user28FundamentalsPhilosophy, user28EnglishLanguage, user28PhysicalTraining, user28LegalSupportProfessionalActivity, user28NumericalMethods, user28ManagementProfessionalActivity, user28MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user29Id, user29Username, user29FundamentalsPhilosophy, user29EnglishLanguage, user29PhysicalTraining, user29LegalSupportProfessionalActivity, user29NumericalMethods, user29ManagementProfessionalActivity, user29MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user30Id, user30Username, user30FundamentalsPhilosophy, user30EnglishLanguage, user30PhysicalTraining, user30LegalSupportProfessionalActivity, user30NumericalMethods, user30ManagementProfessionalActivity, user30MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user31Id, user31Username, user31FundamentalsPhilosophy, user31EnglishLanguage, user31PhysicalTraining, user31LegalSupportProfessionalActivity, user31NumericalMethods, user31ManagementProfessionalActivity, user31MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user32Id, user32Username, user32FundamentalsPhilosophy, user32EnglishLanguage, user32PhysicalTraining, user32LegalSupportProfessionalActivity, user32NumericalMethods, user32ManagementProfessionalActivity, user32MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user33Id, user33Username, user33FundamentalsPhilosophy, user33EnglishLanguage, user33PhysicalTraining, user33LegalSupportProfessionalActivity, user33NumericalMethods, user33ManagementProfessionalActivity, user33MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user34Id, user34Username, user34FundamentalsPhilosophy, user34EnglishLanguage, user34PhysicalTraining, user34LegalSupportProfessionalActivity, user34NumericalMethods, user34ManagementProfessionalActivity, user34MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user35Id, user35Username, user35FundamentalsPhilosophy, user35EnglishLanguage, user35PhysicalTraining, user35LegalSupportProfessionalActivity, user35NumericalMethods, user35ManagementProfessionalActivity, user35MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user36Id, user36Username, user36FundamentalsPhilosophy, user36EnglishLanguage, user36PhysicalTraining, user36LegalSupportProfessionalActivity, user36NumericalMethods, user36ManagementProfessionalActivity, user36MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user37Id, user37Username, user37FundamentalsPhilosophy, user37EnglishLanguage, user37PhysicalTraining, user37LegalSupportProfessionalActivity, user37NumericalMethods, user37ManagementProfessionalActivity, user37MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user38Id, user38Username, user38FundamentalsPhilosophy, user38EnglishLanguage, user38PhysicalTraining, user38LegalSupportProfessionalActivity, user38NumericalMethods, user38ManagementProfessionalActivity, user38MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user39Id, user39Username, user39FundamentalsPhilosophy, user39EnglishLanguage, user39PhysicalTraining, user39LegalSupportProfessionalActivity, user39NumericalMethods, user39ManagementProfessionalActivity, user39MathematicalModels, month));
            addArr.add(new Grade_IS_1_1Course4Semester2(user40Id, user40Username, user40FundamentalsPhilosophy, user40EnglishLanguage, user40PhysicalTraining, user40LegalSupportProfessionalActivity, user40NumericalMethods, user40ManagementProfessionalActivity, user40MathematicalModels, month));


            if (gradeIs11Course4Semester2Repository.findAll().isEmpty()) {
                gradeIs11Course4Semester2Repository.saveAll(addArr);
            }
            if (!gradeIs11Course4Semester2Repository.existsByMonth(month)) {
                gradeIs11Course4Semester2Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course4Semester2> listAllGrade = gradeIs11Course4Semester2Repository.findAll();
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User1 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User2 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User3 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User4 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User5 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User6 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User7 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User8 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User9 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User10 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User11 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User12 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User13 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User14 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User15 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User16 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User17 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User18 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User19 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User20 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User21 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User22 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User23 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User24 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User25 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User26 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User27 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User28 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User29 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User30 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User31 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User32 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User33 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User34 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User35 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User36 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User37 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User38 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User39 = null;
            Grade_IS_1_1Course4Semester2 grade_IS_1_1Course4Semester2User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_IS_1_1Course4Semester2User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_IS_1_1Course4Semester2User1.setUsername(user1Username);
            grade_IS_1_1Course4Semester2User1.setGradeFundamentalsPhilosophy(user1FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_IS_1_1Course4Semester2User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_IS_1_1Course4Semester2User1.setGradeLegalSupportProfessionalActivity(user1LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User1.setGradeNumericalMethods(user1NumericalMethods);
            grade_IS_1_1Course4Semester2User1.setGradeManagementProfessionalActivity(user1ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User1.setGradeMathematicalModels(user1MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User1);

            //user2
            grade_IS_1_1Course4Semester2User2.setUsername(user2Username);
            grade_IS_1_1Course4Semester2User2.setGradeFundamentalsPhilosophy(user2FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_IS_1_1Course4Semester2User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_IS_1_1Course4Semester2User2.setGradeLegalSupportProfessionalActivity(user2LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User2.setGradeNumericalMethods(user2NumericalMethods);
            grade_IS_1_1Course4Semester2User2.setGradeManagementProfessionalActivity(user2ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User2.setGradeMathematicalModels(user2MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User2);

            //            //user3
            grade_IS_1_1Course4Semester2User3.setUsername(user3Username);
            grade_IS_1_1Course4Semester2User3.setGradeFundamentalsPhilosophy(user3FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_IS_1_1Course4Semester2User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_IS_1_1Course4Semester2User3.setGradeLegalSupportProfessionalActivity(user3LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User3.setGradeNumericalMethods(user3NumericalMethods);
            grade_IS_1_1Course4Semester2User3.setGradeManagementProfessionalActivity(user3ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User3.setGradeMathematicalModels(user3MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User3);

            //            //user4
            grade_IS_1_1Course4Semester2User4.setUsername(user4Username);
            grade_IS_1_1Course4Semester2User4.setGradeFundamentalsPhilosophy(user4FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_IS_1_1Course4Semester2User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_IS_1_1Course4Semester2User4.setGradeLegalSupportProfessionalActivity(user4LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User4.setGradeNumericalMethods(user4NumericalMethods);
            grade_IS_1_1Course4Semester2User4.setGradeManagementProfessionalActivity(user4ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User4.setGradeMathematicalModels(user4MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User4);

//            //user5
            grade_IS_1_1Course4Semester2User5.setUsername(user5Username);
            grade_IS_1_1Course4Semester2User5.setGradeFundamentalsPhilosophy(user5FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_IS_1_1Course4Semester2User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_IS_1_1Course4Semester2User5.setGradeLegalSupportProfessionalActivity(user5LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User5.setGradeNumericalMethods(user5NumericalMethods);
            grade_IS_1_1Course4Semester2User5.setGradeManagementProfessionalActivity(user5ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User5.setGradeMathematicalModels(user5MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User5);

            //            //user6
            grade_IS_1_1Course4Semester2User6.setUsername(user6Username);
            grade_IS_1_1Course4Semester2User6.setGradeFundamentalsPhilosophy(user6FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_IS_1_1Course4Semester2User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_IS_1_1Course4Semester2User6.setGradeLegalSupportProfessionalActivity(user6LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User6.setGradeNumericalMethods(user6NumericalMethods);
            grade_IS_1_1Course4Semester2User6.setGradeManagementProfessionalActivity(user6ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User6.setGradeMathematicalModels(user6MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User6);

            //            //user7
            grade_IS_1_1Course4Semester2User7.setUsername(user7Username);
            grade_IS_1_1Course4Semester2User7.setGradeFundamentalsPhilosophy(user7FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_IS_1_1Course4Semester2User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_IS_1_1Course4Semester2User7.setGradeLegalSupportProfessionalActivity(user7LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User7.setGradeNumericalMethods(user7NumericalMethods);
            grade_IS_1_1Course4Semester2User7.setGradeManagementProfessionalActivity(user7ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User7.setGradeMathematicalModels(user7MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User7);

            //            //user8
            grade_IS_1_1Course4Semester2User8.setUsername(user8Username);
            grade_IS_1_1Course4Semester2User8.setGradeFundamentalsPhilosophy(user8FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_IS_1_1Course4Semester2User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_IS_1_1Course4Semester2User8.setGradeLegalSupportProfessionalActivity(user8LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User8.setGradeNumericalMethods(user8NumericalMethods);
            grade_IS_1_1Course4Semester2User8.setGradeManagementProfessionalActivity(user8ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User8.setGradeMathematicalModels(user8MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User8);

            //            //user9
            grade_IS_1_1Course4Semester2User9.setUsername(user9Username);
            grade_IS_1_1Course4Semester2User9.setGradeFundamentalsPhilosophy(user9FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_IS_1_1Course4Semester2User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_IS_1_1Course4Semester2User9.setGradeLegalSupportProfessionalActivity(user9LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User9.setGradeNumericalMethods(user9NumericalMethods);
            grade_IS_1_1Course4Semester2User9.setGradeManagementProfessionalActivity(user9ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User9.setGradeMathematicalModels(user9MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User9);


            //            //user10
            grade_IS_1_1Course4Semester2User10.setUsername(user10Username);
            grade_IS_1_1Course4Semester2User10.setGradeFundamentalsPhilosophy(user10FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_IS_1_1Course4Semester2User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_IS_1_1Course4Semester2User10.setGradeLegalSupportProfessionalActivity(user10LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User10.setGradeNumericalMethods(user10NumericalMethods);
            grade_IS_1_1Course4Semester2User10.setGradeManagementProfessionalActivity(user10ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User10.setGradeMathematicalModels(user10MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User10);

            //            //user11
            grade_IS_1_1Course4Semester2User11.setUsername(user11Username);
            grade_IS_1_1Course4Semester2User11.setGradeFundamentalsPhilosophy(user11FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_IS_1_1Course4Semester2User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_IS_1_1Course4Semester2User11.setGradeLegalSupportProfessionalActivity(user11LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User11.setGradeNumericalMethods(user11NumericalMethods);
            grade_IS_1_1Course4Semester2User11.setGradeManagementProfessionalActivity(user11ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User11.setGradeMathematicalModels(user11MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User11);


            //            //user12
            grade_IS_1_1Course4Semester2User12.setUsername(user12Username);
            grade_IS_1_1Course4Semester2User12.setGradeFundamentalsPhilosophy(user12FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_IS_1_1Course4Semester2User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_IS_1_1Course4Semester2User12.setGradeLegalSupportProfessionalActivity(user12LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User12.setGradeNumericalMethods(user12NumericalMethods);
            grade_IS_1_1Course4Semester2User12.setGradeManagementProfessionalActivity(user12ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User12.setGradeMathematicalModels(user12MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User12);

            //            //user13
            grade_IS_1_1Course4Semester2User13.setUsername(user13Username);
            grade_IS_1_1Course4Semester2User13.setGradeFundamentalsPhilosophy(user13FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_IS_1_1Course4Semester2User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_IS_1_1Course4Semester2User13.setGradeLegalSupportProfessionalActivity(user13LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User13.setGradeNumericalMethods(user13NumericalMethods);
            grade_IS_1_1Course4Semester2User13.setGradeManagementProfessionalActivity(user13ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User13.setGradeMathematicalModels(user13MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User13);

            //            //user14
            grade_IS_1_1Course4Semester2User14.setUsername(user14Username);
            grade_IS_1_1Course4Semester2User14.setGradeFundamentalsPhilosophy(user14FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_IS_1_1Course4Semester2User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_IS_1_1Course4Semester2User14.setGradeLegalSupportProfessionalActivity(user14LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User14.setGradeNumericalMethods(user14NumericalMethods);
            grade_IS_1_1Course4Semester2User14.setGradeManagementProfessionalActivity(user14ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User14.setGradeMathematicalModels(user14MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User14);

            //            //user15
            grade_IS_1_1Course4Semester2User15.setUsername(user15Username);
            grade_IS_1_1Course4Semester2User15.setGradeFundamentalsPhilosophy(user15FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_IS_1_1Course4Semester2User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_IS_1_1Course4Semester2User15.setGradeLegalSupportProfessionalActivity(user15LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User15.setGradeNumericalMethods(user15NumericalMethods);
            grade_IS_1_1Course4Semester2User15.setGradeManagementProfessionalActivity(user15ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User15.setGradeMathematicalModels(user15MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User15);

            //           //user16

            grade_IS_1_1Course4Semester2User16.setUsername(user16Username);
            grade_IS_1_1Course4Semester2User16.setGradeFundamentalsPhilosophy(user16FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_IS_1_1Course4Semester2User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_IS_1_1Course4Semester2User16.setGradeLegalSupportProfessionalActivity(user16LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User16.setGradeNumericalMethods(user16NumericalMethods);
            grade_IS_1_1Course4Semester2User16.setGradeManagementProfessionalActivity(user16ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User16.setGradeMathematicalModels(user16MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User16);


            //            //user17

            grade_IS_1_1Course4Semester2User17.setUsername(user17Username);
            grade_IS_1_1Course4Semester2User17.setGradeFundamentalsPhilosophy(user17FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_IS_1_1Course4Semester2User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_IS_1_1Course4Semester2User17.setGradeLegalSupportProfessionalActivity(user17LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User17.setGradeNumericalMethods(user17NumericalMethods);
            grade_IS_1_1Course4Semester2User17.setGradeManagementProfessionalActivity(user17ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User17.setGradeMathematicalModels(user17MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User17);

            //            //user18

            grade_IS_1_1Course4Semester2User18.setUsername(user18Username);
            grade_IS_1_1Course4Semester2User18.setGradeFundamentalsPhilosophy(user18FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_IS_1_1Course4Semester2User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_IS_1_1Course4Semester2User18.setGradeLegalSupportProfessionalActivity(user18LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User18.setGradeNumericalMethods(user18NumericalMethods);
            grade_IS_1_1Course4Semester2User18.setGradeManagementProfessionalActivity(user18ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User18.setGradeMathematicalModels(user18MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User18);


            //            //user19

            grade_IS_1_1Course4Semester2User19.setUsername(user19Username);
            grade_IS_1_1Course4Semester2User19.setGradeFundamentalsPhilosophy(user19FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_IS_1_1Course4Semester2User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_IS_1_1Course4Semester2User19.setGradeLegalSupportProfessionalActivity(user19LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User19.setGradeNumericalMethods(user19NumericalMethods);
            grade_IS_1_1Course4Semester2User19.setGradeManagementProfessionalActivity(user19ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User19.setGradeMathematicalModels(user19MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User19);

            //            //user20

            grade_IS_1_1Course4Semester2User20.setUsername(user20Username);
            grade_IS_1_1Course4Semester2User20.setGradeFundamentalsPhilosophy(user20FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_IS_1_1Course4Semester2User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_IS_1_1Course4Semester2User20.setGradeLegalSupportProfessionalActivity(user20LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User20.setGradeNumericalMethods(user20NumericalMethods);
            grade_IS_1_1Course4Semester2User20.setGradeManagementProfessionalActivity(user20ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User20.setGradeMathematicalModels(user20MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User20);

            //            //user21

            grade_IS_1_1Course4Semester2User21.setUsername(user21Username);
            grade_IS_1_1Course4Semester2User21.setGradeFundamentalsPhilosophy(user21FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_IS_1_1Course4Semester2User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_IS_1_1Course4Semester2User21.setGradeLegalSupportProfessionalActivity(user21LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User21.setGradeNumericalMethods(user21NumericalMethods);
            grade_IS_1_1Course4Semester2User21.setGradeManagementProfessionalActivity(user21ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User21.setGradeMathematicalModels(user21MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User21);

            //            //user22

            grade_IS_1_1Course4Semester2User22.setUsername(user22Username);
            grade_IS_1_1Course4Semester2User22.setGradeFundamentalsPhilosophy(user22FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_IS_1_1Course4Semester2User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_IS_1_1Course4Semester2User22.setGradeLegalSupportProfessionalActivity(user22LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User22.setGradeNumericalMethods(user22NumericalMethods);
            grade_IS_1_1Course4Semester2User22.setGradeManagementProfessionalActivity(user22ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User22.setGradeMathematicalModels(user22MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User22);

            //            //user23

            grade_IS_1_1Course4Semester2User23.setUsername(user23Username);
            grade_IS_1_1Course4Semester2User23.setGradeFundamentalsPhilosophy(user23FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_IS_1_1Course4Semester2User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_IS_1_1Course4Semester2User23.setGradeLegalSupportProfessionalActivity(user23LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User23.setGradeNumericalMethods(user23NumericalMethods);
            grade_IS_1_1Course4Semester2User23.setGradeManagementProfessionalActivity(user23ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User23.setGradeMathematicalModels(user23MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User23);

            //            //user24

            grade_IS_1_1Course4Semester2User24.setUsername(user24Username);
            grade_IS_1_1Course4Semester2User24.setGradeFundamentalsPhilosophy(user24FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_IS_1_1Course4Semester2User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_IS_1_1Course4Semester2User24.setGradeLegalSupportProfessionalActivity(user24LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User24.setGradeNumericalMethods(user24NumericalMethods);
            grade_IS_1_1Course4Semester2User24.setGradeManagementProfessionalActivity(user24ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User24.setGradeMathematicalModels(user24MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User24);

            //            //user25

            grade_IS_1_1Course4Semester2User25.setUsername(user25Username);
            grade_IS_1_1Course4Semester2User25.setGradeFundamentalsPhilosophy(user25FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_IS_1_1Course4Semester2User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_IS_1_1Course4Semester2User25.setGradeLegalSupportProfessionalActivity(user25LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User25.setGradeNumericalMethods(user25NumericalMethods);
            grade_IS_1_1Course4Semester2User25.setGradeManagementProfessionalActivity(user25ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User25.setGradeMathematicalModels(user25MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User25);

            //            //user26

            grade_IS_1_1Course4Semester2User26.setUsername(user26Username);
            grade_IS_1_1Course4Semester2User26.setGradeFundamentalsPhilosophy(user26FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_IS_1_1Course4Semester2User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_IS_1_1Course4Semester2User26.setGradeLegalSupportProfessionalActivity(user26LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User26.setGradeNumericalMethods(user26NumericalMethods);
            grade_IS_1_1Course4Semester2User26.setGradeManagementProfessionalActivity(user26ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User26.setGradeMathematicalModels(user26MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User26);

            //            //user27

            grade_IS_1_1Course4Semester2User27.setUsername(user27Username);
            grade_IS_1_1Course4Semester2User27.setGradeFundamentalsPhilosophy(user27FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_IS_1_1Course4Semester2User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_IS_1_1Course4Semester2User27.setGradeLegalSupportProfessionalActivity(user27LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User27.setGradeNumericalMethods(user27NumericalMethods);
            grade_IS_1_1Course4Semester2User27.setGradeManagementProfessionalActivity(user27ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User27.setGradeMathematicalModels(user27MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User27);

            //            //user28

            grade_IS_1_1Course4Semester2User28.setUsername(user28Username);
            grade_IS_1_1Course4Semester2User28.setGradeFundamentalsPhilosophy(user28FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_IS_1_1Course4Semester2User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_IS_1_1Course4Semester2User28.setGradeLegalSupportProfessionalActivity(user28LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User28.setGradeNumericalMethods(user28NumericalMethods);
            grade_IS_1_1Course4Semester2User28.setGradeManagementProfessionalActivity(user28ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User28.setGradeMathematicalModels(user28MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User28);

            //            //user29

            grade_IS_1_1Course4Semester2User29.setUsername(user29Username);
            grade_IS_1_1Course4Semester2User29.setGradeFundamentalsPhilosophy(user29FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_IS_1_1Course4Semester2User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_IS_1_1Course4Semester2User29.setGradeLegalSupportProfessionalActivity(user29LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User29.setGradeNumericalMethods(user29NumericalMethods);
            grade_IS_1_1Course4Semester2User29.setGradeManagementProfessionalActivity(user29ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User29.setGradeMathematicalModels(user29MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User29);

            //            //user30

            grade_IS_1_1Course4Semester2User30.setUsername(user30Username);
            grade_IS_1_1Course4Semester2User30.setGradeFundamentalsPhilosophy(user30FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_IS_1_1Course4Semester2User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_IS_1_1Course4Semester2User30.setGradeLegalSupportProfessionalActivity(user30LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User30.setGradeNumericalMethods(user30NumericalMethods);
            grade_IS_1_1Course4Semester2User30.setGradeManagementProfessionalActivity(user30ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User30.setGradeMathematicalModels(user30MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User30);

            //            //user31

            grade_IS_1_1Course4Semester2User31.setUsername(user31Username);
            grade_IS_1_1Course4Semester2User31.setGradeFundamentalsPhilosophy(user31FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_IS_1_1Course4Semester2User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_IS_1_1Course4Semester2User31.setGradeLegalSupportProfessionalActivity(user31LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User31.setGradeNumericalMethods(user31NumericalMethods);
            grade_IS_1_1Course4Semester2User31.setGradeManagementProfessionalActivity(user31ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User31.setGradeMathematicalModels(user31MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User31);

            //            //user32

            grade_IS_1_1Course4Semester2User32.setUsername(user32Username);
            grade_IS_1_1Course4Semester2User32.setGradeFundamentalsPhilosophy(user32FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_IS_1_1Course4Semester2User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_IS_1_1Course4Semester2User32.setGradeLegalSupportProfessionalActivity(user32LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User32.setGradeNumericalMethods(user32NumericalMethods);
            grade_IS_1_1Course4Semester2User32.setGradeManagementProfessionalActivity(user32ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User32.setGradeMathematicalModels(user32MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User32);

            //            //user33

            grade_IS_1_1Course4Semester2User33.setUsername(user33Username);
            grade_IS_1_1Course4Semester2User33.setGradeFundamentalsPhilosophy(user33FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_IS_1_1Course4Semester2User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_IS_1_1Course4Semester2User33.setGradeLegalSupportProfessionalActivity(user33LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User33.setGradeNumericalMethods(user33NumericalMethods);
            grade_IS_1_1Course4Semester2User33.setGradeManagementProfessionalActivity(user33ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User33.setGradeMathematicalModels(user33MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User33);

            //            //user34

            grade_IS_1_1Course4Semester2User34.setUsername(user34Username);
            grade_IS_1_1Course4Semester2User34.setGradeFundamentalsPhilosophy(user34FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_IS_1_1Course4Semester2User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_IS_1_1Course4Semester2User34.setGradeLegalSupportProfessionalActivity(user34LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User34.setGradeNumericalMethods(user34NumericalMethods);
            grade_IS_1_1Course4Semester2User34.setGradeManagementProfessionalActivity(user34ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User34.setGradeMathematicalModels(user34MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User34);

            //            //user35

            grade_IS_1_1Course4Semester2User35.setUsername(user35Username);
            grade_IS_1_1Course4Semester2User35.setGradeFundamentalsPhilosophy(user35FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_IS_1_1Course4Semester2User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_IS_1_1Course4Semester2User35.setGradeLegalSupportProfessionalActivity(user35LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User35.setGradeNumericalMethods(user35NumericalMethods);
            grade_IS_1_1Course4Semester2User35.setGradeManagementProfessionalActivity(user35ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User35.setGradeMathematicalModels(user35MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User35);

            //            //user36

            grade_IS_1_1Course4Semester2User36.setUsername(user36Username);
            grade_IS_1_1Course4Semester2User36.setGradeFundamentalsPhilosophy(user36FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_IS_1_1Course4Semester2User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_IS_1_1Course4Semester2User36.setGradeLegalSupportProfessionalActivity(user36LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User36.setGradeNumericalMethods(user36NumericalMethods);
            grade_IS_1_1Course4Semester2User36.setGradeManagementProfessionalActivity(user36ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User36.setGradeMathematicalModels(user36MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User36);

            //            //user37

            grade_IS_1_1Course4Semester2User37.setUsername(user37Username);
            grade_IS_1_1Course4Semester2User37.setGradeFundamentalsPhilosophy(user37FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_IS_1_1Course4Semester2User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_IS_1_1Course4Semester2User37.setGradeLegalSupportProfessionalActivity(user37LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User37.setGradeNumericalMethods(user37NumericalMethods);
            grade_IS_1_1Course4Semester2User37.setGradeManagementProfessionalActivity(user37ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User37.setGradeMathematicalModels(user37MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User37);

            //            //user38

            grade_IS_1_1Course4Semester2User38.setUsername(user38Username);
            grade_IS_1_1Course4Semester2User38.setGradeFundamentalsPhilosophy(user38FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_IS_1_1Course4Semester2User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_IS_1_1Course4Semester2User38.setGradeLegalSupportProfessionalActivity(user38LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User38.setGradeNumericalMethods(user38NumericalMethods);
            grade_IS_1_1Course4Semester2User38.setGradeManagementProfessionalActivity(user38ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User38.setGradeMathematicalModels(user38MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User38);

            //            //user39

            grade_IS_1_1Course4Semester2User39.setUsername(user39Username);
            grade_IS_1_1Course4Semester2User39.setGradeFundamentalsPhilosophy(user39FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_IS_1_1Course4Semester2User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_IS_1_1Course4Semester2User39.setGradeLegalSupportProfessionalActivity(user39LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User39.setGradeNumericalMethods(user39NumericalMethods);
            grade_IS_1_1Course4Semester2User39.setGradeManagementProfessionalActivity(user39ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User39.setGradeMathematicalModels(user39MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User39);

            //            //user40

            grade_IS_1_1Course4Semester2User40.setUsername(user40Username);
            grade_IS_1_1Course4Semester2User40.setGradeFundamentalsPhilosophy(user40FundamentalsPhilosophy);
            grade_IS_1_1Course4Semester2User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_IS_1_1Course4Semester2User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_IS_1_1Course4Semester2User40.setGradeLegalSupportProfessionalActivity(user40LegalSupportProfessionalActivity);
            grade_IS_1_1Course4Semester2User40.setGradeNumericalMethods(user40NumericalMethods);
            grade_IS_1_1Course4Semester2User40.setGradeManagementProfessionalActivity(user40ManagementProfessionalActivity);
            grade_IS_1_1Course4Semester2User40.setGradeMathematicalModels(user40MathematicalModels);
            gradeIs11Course4Semester2Repository.save(grade_IS_1_1Course4Semester2User40);

        } catch (Exception ignore) {

        }

    }
}
