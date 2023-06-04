package com.example.demoauth.service.moderatorService.moderator_is1Service.course2;

import com.example.demoauth.models.grade_is1.models.course2.Grade_IS_1_1Course2Semester2;
import com.example.demoauth.repository.is1Repository.course2.Grade_IS_1_1Course2Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1Course2Semester2 {
    @Autowired
    Grade_IS_1_1Course2Semester2Repository gradeIs11Course2Semester2Repository;

    //GetMappingGradeCourse2Semester1
    public void getMappingMethodModer_is_1_1GreadeСourse2Semester2(@PathVariable String month, Model model) {

        List<Grade_IS_1_1Course2Semester2> res = gradeIs11Course2Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course2Semester2::getUserID));
        List<Grade_IS_1_1Course2Semester2> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> januaryList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> februaryList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> marchList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> aprilList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> mayList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester2> juneList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new Grade_IS_1_1Course2Semester2());
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

    //PostMappingGradeCourse2Semester1
    public void postMappingMethodModer_is_1_1GreadeСourse2Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1ProbabilityTheory = splitUser1Grades[4];
            String user1HardwareArchitecture = splitUser1Grades[5];
            String user1InformationTechnology = splitUser1Grades[6];
            String user1FundamentalsOfAlgorithmizationAndProgramming = splitUser1Grades[7];
            String user1DatabaseDesignFundamentals = splitUser1Grades[8];
            String user1ImplementationAndSupportOfComputerSystems = splitUser1Grades[9];
            String user1EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser1Grades[10];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2EnglishLanguage = splitUser2Grades[2];
            String user2PhysicalTraining = splitUser2Grades[3];
            String user2ProbabilityTheory = splitUser2Grades[4];
            String user2HardwareArchitecture = splitUser2Grades[5];
            String user2InformationTechnology = splitUser2Grades[6];
            String user2FundamentalsOfAlgorithmizationAndProgramming = splitUser2Grades[7];
            String user2DatabaseDesignFundamentals = splitUser2Grades[8];
            String user2ImplementationAndSupportOfComputerSystems = splitUser2Grades[9];
            String user2EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser2Grades[10];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3EnglishLanguage = splitUser3Grades[2];
            String user3PhysicalTraining = splitUser3Grades[3];
            String user3ProbabilityTheory = splitUser3Grades[4];
            String user3HardwareArchitecture = splitUser3Grades[5];
            String user3InformationTechnology = splitUser3Grades[6];
            String user3FundamentalsOfAlgorithmizationAndProgramming = splitUser3Grades[7];
            String user3DatabaseDesignFundamentals = splitUser3Grades[8];
            String user3ImplementationAndSupportOfComputerSystems = splitUser3Grades[9];
            String user3EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser3Grades[10];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4EnglishLanguage = splitUser4Grades[2];
            String user4PhysicalTraining = splitUser4Grades[3];
            String user4ProbabilityTheory = splitUser4Grades[4];
            String user4HardwareArchitecture = splitUser4Grades[5];
            String user4InformationTechnology = splitUser4Grades[6];
            String user4FundamentalsOfAlgorithmizationAndProgramming = splitUser4Grades[7];
            String user4DatabaseDesignFundamentals = splitUser4Grades[8];
            String user4ImplementationAndSupportOfComputerSystems = splitUser4Grades[9];
            String user4EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser4Grades[10];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5EnglishLanguage = splitUser5Grades[2];
            String user5PhysicalTraining = splitUser5Grades[3];
            String user5ProbabilityTheory = splitUser5Grades[4];
            String user5HardwareArchitecture = splitUser5Grades[5];
            String user5InformationTechnology = splitUser5Grades[6];
            String user5FundamentalsOfAlgorithmizationAndProgramming = splitUser5Grades[7];
            String user5DatabaseDesignFundamentals = splitUser5Grades[8];
            String user5ImplementationAndSupportOfComputerSystems = splitUser5Grades[9];
            String user5EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser5Grades[10];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6EnglishLanguage = splitUser6Grades[2];
            String user6PhysicalTraining = splitUser6Grades[3];
            String user6ProbabilityTheory = splitUser6Grades[4];
            String user6HardwareArchitecture = splitUser6Grades[5];
            String user6InformationTechnology = splitUser6Grades[6];
            String user6FundamentalsOfAlgorithmizationAndProgramming = splitUser6Grades[7];
            String user6DatabaseDesignFundamentals = splitUser6Grades[8];
            String user6ImplementationAndSupportOfComputerSystems = splitUser6Grades[9];
            String user6EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser6Grades[10];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7EnglishLanguage = splitUser7Grades[2];
            String user7PhysicalTraining = splitUser7Grades[3];
            String user7ProbabilityTheory = splitUser7Grades[4];
            String user7HardwareArchitecture = splitUser7Grades[5];
            String user7InformationTechnology = splitUser7Grades[6];
            String user7FundamentalsOfAlgorithmizationAndProgramming = splitUser7Grades[7];
            String user7DatabaseDesignFundamentals = splitUser7Grades[8];
            String user7ImplementationAndSupportOfComputerSystems = splitUser7Grades[9];
            String user7EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser7Grades[10];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8EnglishLanguage = splitUser8Grades[2];
            String user8PhysicalTraining = splitUser8Grades[3];
            String user8ProbabilityTheory = splitUser8Grades[4];
            String user8HardwareArchitecture = splitUser8Grades[5];
            String user8InformationTechnology = splitUser8Grades[6];
            String user8FundamentalsOfAlgorithmizationAndProgramming = splitUser8Grades[7];
            String user8DatabaseDesignFundamentals = splitUser8Grades[8];
            String user8ImplementationAndSupportOfComputerSystems = splitUser8Grades[9];
            String user8EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser8Grades[10];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9EnglishLanguage = splitUser9Grades[2];
            String user9PhysicalTraining = splitUser9Grades[3];
            String user9ProbabilityTheory = splitUser9Grades[4];
            String user9HardwareArchitecture = splitUser9Grades[5];
            String user9InformationTechnology = splitUser9Grades[6];
            String user9FundamentalsOfAlgorithmizationAndProgramming = splitUser9Grades[7];
            String user9DatabaseDesignFundamentals = splitUser9Grades[8];
            String user9ImplementationAndSupportOfComputerSystems = splitUser9Grades[9];
            String user9EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser9Grades[10];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10EnglishLanguage = splitUser10Grades[2];
            String user10PhysicalTraining = splitUser10Grades[3];
            String user10ProbabilityTheory = splitUser10Grades[4];
            String user10HardwareArchitecture = splitUser10Grades[5];
            String user10InformationTechnology = splitUser10Grades[6];
            String user10FundamentalsOfAlgorithmizationAndProgramming = splitUser10Grades[7];
            String user10DatabaseDesignFundamentals = splitUser10Grades[8];
            String user10ImplementationAndSupportOfComputerSystems = splitUser10Grades[9];
            String user10EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser10Grades[10];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11EnglishLanguage = splitUser11Grades[2];
            String user11PhysicalTraining = splitUser11Grades[3];
            String user11ProbabilityTheory = splitUser11Grades[4];
            String user11HardwareArchitecture = splitUser11Grades[5];
            String user11InformationTechnology = splitUser11Grades[6];
            String user11FundamentalsOfAlgorithmizationAndProgramming = splitUser11Grades[7];
            String user11DatabaseDesignFundamentals = splitUser11Grades[8];
            String user11ImplementationAndSupportOfComputerSystems = splitUser11Grades[9];
            String user11EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser11Grades[10];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12EnglishLanguage = splitUser12Grades[2];
            String user12PhysicalTraining = splitUser12Grades[3];
            String user12ProbabilityTheory = splitUser12Grades[4];
            String user12HardwareArchitecture = splitUser12Grades[5];
            String user12InformationTechnology = splitUser12Grades[6];
            String user12FundamentalsOfAlgorithmizationAndProgramming = splitUser12Grades[7];
            String user12DatabaseDesignFundamentals = splitUser12Grades[8];
            String user12ImplementationAndSupportOfComputerSystems = splitUser12Grades[9];
            String user12EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser12Grades[10];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13EnglishLanguage = splitUser13Grades[2];
            String user13PhysicalTraining = splitUser13Grades[3];
            String user13ProbabilityTheory = splitUser13Grades[4];
            String user13HardwareArchitecture = splitUser13Grades[5];
            String user13InformationTechnology = splitUser13Grades[6];
            String user13FundamentalsOfAlgorithmizationAndProgramming = splitUser13Grades[7];
            String user13DatabaseDesignFundamentals = splitUser13Grades[8];
            String user13ImplementationAndSupportOfComputerSystems = splitUser13Grades[9];
            String user13EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser13Grades[10];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14EnglishLanguage = splitUser14Grades[2];
            String user14PhysicalTraining = splitUser14Grades[3];
            String user14ProbabilityTheory = splitUser14Grades[4];
            String user14HardwareArchitecture = splitUser14Grades[5];
            String user14InformationTechnology = splitUser14Grades[6];
            String user14FundamentalsOfAlgorithmizationAndProgramming = splitUser14Grades[7];
            String user14DatabaseDesignFundamentals = splitUser14Grades[8];
            String user14ImplementationAndSupportOfComputerSystems = splitUser14Grades[9];
            String user14EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser14Grades[10];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15EnglishLanguage = splitUser15Grades[2];
            String user15PhysicalTraining = splitUser15Grades[3];
            String user15ProbabilityTheory = splitUser15Grades[4];
            String user15HardwareArchitecture = splitUser15Grades[5];
            String user15InformationTechnology = splitUser15Grades[6];
            String user15FundamentalsOfAlgorithmizationAndProgramming = splitUser15Grades[7];
            String user15DatabaseDesignFundamentals = splitUser15Grades[8];
            String user15ImplementationAndSupportOfComputerSystems = splitUser15Grades[9];
            String user15EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser15Grades[10];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16EnglishLanguage = splitUser16Grades[2];
            String user16PhysicalTraining = splitUser16Grades[3];
            String user16ProbabilityTheory = splitUser16Grades[4];
            String user16HardwareArchitecture = splitUser16Grades[5];
            String user16InformationTechnology = splitUser16Grades[6];
            String user16FundamentalsOfAlgorithmizationAndProgramming = splitUser16Grades[7];
            String user16DatabaseDesignFundamentals = splitUser16Grades[8];
            String user16ImplementationAndSupportOfComputerSystems = splitUser16Grades[9];
            String user16EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser16Grades[10];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17EnglishLanguage = splitUser17Grades[2];
            String user17PhysicalTraining = splitUser17Grades[3];
            String user17ProbabilityTheory = splitUser17Grades[4];
            String user17HardwareArchitecture = splitUser17Grades[5];
            String user17InformationTechnology = splitUser17Grades[6];
            String user17FundamentalsOfAlgorithmizationAndProgramming = splitUser17Grades[7];
            String user17DatabaseDesignFundamentals = splitUser17Grades[8];
            String user17ImplementationAndSupportOfComputerSystems = splitUser17Grades[9];
            String user17EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser17Grades[10];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18EnglishLanguage = splitUser18Grades[2];
            String user18PhysicalTraining = splitUser18Grades[3];
            String user18ProbabilityTheory = splitUser18Grades[4];
            String user18HardwareArchitecture = splitUser18Grades[5];
            String user18InformationTechnology = splitUser18Grades[6];
            String user18FundamentalsOfAlgorithmizationAndProgramming = splitUser18Grades[7];
            String user18DatabaseDesignFundamentals = splitUser18Grades[8];
            String user18ImplementationAndSupportOfComputerSystems = splitUser18Grades[9];
            String user18EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser18Grades[10];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19EnglishLanguage = splitUser19Grades[2];
            String user19PhysicalTraining = splitUser19Grades[3];
            String user19ProbabilityTheory = splitUser19Grades[4];
            String user19HardwareArchitecture = splitUser19Grades[5];
            String user19InformationTechnology = splitUser19Grades[6];
            String user19FundamentalsOfAlgorithmizationAndProgramming = splitUser19Grades[7];
            String user19DatabaseDesignFundamentals = splitUser19Grades[8];
            String user19ImplementationAndSupportOfComputerSystems = splitUser19Grades[9];
            String user19EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser19Grades[10];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20EnglishLanguage = splitUser20Grades[2];
            String user20PhysicalTraining = splitUser20Grades[3];
            String user20ProbabilityTheory = splitUser20Grades[4];
            String user20HardwareArchitecture = splitUser20Grades[5];
            String user20InformationTechnology = splitUser20Grades[6];
            String user20FundamentalsOfAlgorithmizationAndProgramming = splitUser20Grades[7];
            String user20DatabaseDesignFundamentals = splitUser20Grades[8];
            String user20ImplementationAndSupportOfComputerSystems = splitUser20Grades[9];
            String user20EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser20Grades[10];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21EnglishLanguage = splitUser21Grades[2];
            String user21PhysicalTraining = splitUser21Grades[3];
            String user21ProbabilityTheory = splitUser21Grades[4];
            String user21HardwareArchitecture = splitUser21Grades[5];
            String user21InformationTechnology = splitUser21Grades[6];
            String user21FundamentalsOfAlgorithmizationAndProgramming = splitUser21Grades[7];
            String user21DatabaseDesignFundamentals = splitUser21Grades[8];
            String user21ImplementationAndSupportOfComputerSystems = splitUser21Grades[9];
            String user21EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser21Grades[10];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22EnglishLanguage = splitUser22Grades[2];
            String user22PhysicalTraining = splitUser22Grades[3];
            String user22ProbabilityTheory = splitUser22Grades[4];
            String user22HardwareArchitecture = splitUser22Grades[5];
            String user22InformationTechnology = splitUser22Grades[6];
            String user22FundamentalsOfAlgorithmizationAndProgramming = splitUser22Grades[7];
            String user22DatabaseDesignFundamentals = splitUser22Grades[8];
            String user22ImplementationAndSupportOfComputerSystems = splitUser22Grades[9];
            String user22EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser22Grades[10];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23EnglishLanguage = splitUser23Grades[2];
            String user23PhysicalTraining = splitUser23Grades[3];
            String user23ProbabilityTheory = splitUser23Grades[4];
            String user23HardwareArchitecture = splitUser23Grades[5];
            String user23InformationTechnology = splitUser23Grades[6];
            String user23FundamentalsOfAlgorithmizationAndProgramming = splitUser23Grades[7];
            String user23DatabaseDesignFundamentals = splitUser23Grades[8];
            String user23ImplementationAndSupportOfComputerSystems = splitUser23Grades[9];
            String user23EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser23Grades[10];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24EnglishLanguage = splitUser24Grades[2];
            String user24PhysicalTraining = splitUser24Grades[3];
            String user24ProbabilityTheory = splitUser24Grades[4];
            String user24HardwareArchitecture = splitUser24Grades[5];
            String user24InformationTechnology = splitUser24Grades[6];
            String user24FundamentalsOfAlgorithmizationAndProgramming = splitUser24Grades[7];
            String user24DatabaseDesignFundamentals = splitUser24Grades[8];
            String user24ImplementationAndSupportOfComputerSystems = splitUser24Grades[9];
            String user24EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser24Grades[10];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25EnglishLanguage = splitUser25Grades[2];
            String user25PhysicalTraining = splitUser25Grades[3];
            String user25ProbabilityTheory = splitUser25Grades[4];
            String user25HardwareArchitecture = splitUser25Grades[5];
            String user25InformationTechnology = splitUser25Grades[6];
            String user25FundamentalsOfAlgorithmizationAndProgramming = splitUser25Grades[7];
            String user25DatabaseDesignFundamentals = splitUser25Grades[8];
            String user25ImplementationAndSupportOfComputerSystems = splitUser25Grades[9];
            String user25EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser25Grades[10];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26EnglishLanguage = splitUser26Grades[2];
            String user26PhysicalTraining = splitUser26Grades[3];
            String user26ProbabilityTheory = splitUser26Grades[4];
            String user26HardwareArchitecture = splitUser26Grades[5];
            String user26InformationTechnology = splitUser26Grades[6];
            String user26FundamentalsOfAlgorithmizationAndProgramming = splitUser26Grades[7];
            String user26DatabaseDesignFundamentals = splitUser26Grades[8];
            String user26ImplementationAndSupportOfComputerSystems = splitUser26Grades[9];
            String user26EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser26Grades[10];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27EnglishLanguage = splitUser27Grades[2];
            String user27PhysicalTraining = splitUser27Grades[3];
            String user27ProbabilityTheory = splitUser27Grades[4];
            String user27HardwareArchitecture = splitUser27Grades[5];
            String user27InformationTechnology = splitUser27Grades[6];
            String user27FundamentalsOfAlgorithmizationAndProgramming = splitUser27Grades[7];
            String user27DatabaseDesignFundamentals = splitUser27Grades[8];
            String user27ImplementationAndSupportOfComputerSystems = splitUser27Grades[9];
            String user27EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser27Grades[10];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28EnglishLanguage = splitUser28Grades[2];
            String user28PhysicalTraining = splitUser28Grades[3];
            String user28ProbabilityTheory = splitUser28Grades[4];
            String user28HardwareArchitecture = splitUser28Grades[5];
            String user28InformationTechnology = splitUser28Grades[6];
            String user28FundamentalsOfAlgorithmizationAndProgramming = splitUser28Grades[7];
            String user28DatabaseDesignFundamentals = splitUser28Grades[8];
            String user28ImplementationAndSupportOfComputerSystems = splitUser28Grades[9];
            String user28EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser28Grades[10];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29EnglishLanguage = splitUser29Grades[2];
            String user29PhysicalTraining = splitUser29Grades[3];
            String user29ProbabilityTheory = splitUser29Grades[4];
            String user29HardwareArchitecture = splitUser29Grades[5];
            String user29InformationTechnology = splitUser29Grades[6];
            String user29FundamentalsOfAlgorithmizationAndProgramming = splitUser29Grades[7];
            String user29DatabaseDesignFundamentals = splitUser29Grades[8];
            String user29ImplementationAndSupportOfComputerSystems = splitUser29Grades[9];
            String user29EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser29Grades[10];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30EnglishLanguage = splitUser30Grades[2];
            String user30PhysicalTraining = splitUser30Grades[3];
            String user30ProbabilityTheory = splitUser30Grades[4];
            String user30HardwareArchitecture = splitUser30Grades[5];
            String user30InformationTechnology = splitUser30Grades[6];
            String user30FundamentalsOfAlgorithmizationAndProgramming = splitUser30Grades[7];
            String user30DatabaseDesignFundamentals = splitUser30Grades[8];
            String user30ImplementationAndSupportOfComputerSystems = splitUser30Grades[9];
            String user30EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser30Grades[10];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31EnglishLanguage = splitUser31Grades[2];
            String user31PhysicalTraining = splitUser31Grades[3];
            String user31ProbabilityTheory = splitUser31Grades[4];
            String user31HardwareArchitecture = splitUser31Grades[5];
            String user31InformationTechnology = splitUser31Grades[6];
            String user31FundamentalsOfAlgorithmizationAndProgramming = splitUser31Grades[7];
            String user31DatabaseDesignFundamentals = splitUser31Grades[8];
            String user31ImplementationAndSupportOfComputerSystems = splitUser31Grades[9];
            String user31EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser31Grades[10];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32EnglishLanguage = splitUser32Grades[2];
            String user32PhysicalTraining = splitUser32Grades[3];
            String user32ProbabilityTheory = splitUser32Grades[4];
            String user32HardwareArchitecture = splitUser32Grades[5];
            String user32InformationTechnology = splitUser32Grades[6];
            String user32FundamentalsOfAlgorithmizationAndProgramming = splitUser32Grades[7];
            String user32DatabaseDesignFundamentals = splitUser32Grades[8];
            String user32ImplementationAndSupportOfComputerSystems = splitUser32Grades[9];
            String user32EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser32Grades[10];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33EnglishLanguage = splitUser33Grades[2];
            String user33PhysicalTraining = splitUser33Grades[3];
            String user33ProbabilityTheory = splitUser33Grades[4];
            String user33HardwareArchitecture = splitUser33Grades[5];
            String user33InformationTechnology = splitUser33Grades[6];
            String user33FundamentalsOfAlgorithmizationAndProgramming = splitUser33Grades[7];
            String user33DatabaseDesignFundamentals = splitUser33Grades[8];
            String user33ImplementationAndSupportOfComputerSystems = splitUser33Grades[9];
            String user33EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser33Grades[10];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34EnglishLanguage = splitUser34Grades[2];
            String user34PhysicalTraining = splitUser34Grades[3];
            String user34ProbabilityTheory = splitUser34Grades[4];
            String user34HardwareArchitecture = splitUser34Grades[5];
            String user34InformationTechnology = splitUser34Grades[6];
            String user34FundamentalsOfAlgorithmizationAndProgramming = splitUser34Grades[7];
            String user34DatabaseDesignFundamentals = splitUser34Grades[8];
            String user34ImplementationAndSupportOfComputerSystems = splitUser34Grades[9];
            String user34EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser34Grades[10];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35EnglishLanguage = splitUser35Grades[2];
            String user35PhysicalTraining = splitUser35Grades[3];
            String user35ProbabilityTheory = splitUser35Grades[4];
            String user35HardwareArchitecture = splitUser35Grades[5];
            String user35InformationTechnology = splitUser35Grades[6];
            String user35FundamentalsOfAlgorithmizationAndProgramming = splitUser35Grades[7];
            String user35DatabaseDesignFundamentals = splitUser35Grades[8];
            String user35ImplementationAndSupportOfComputerSystems = splitUser35Grades[9];
            String user35EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser35Grades[10];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36EnglishLanguage = splitUser36Grades[2];
            String user36PhysicalTraining = splitUser36Grades[3];
            String user36ProbabilityTheory = splitUser36Grades[4];
            String user36HardwareArchitecture = splitUser36Grades[5];
            String user36InformationTechnology = splitUser36Grades[6];
            String user36FundamentalsOfAlgorithmizationAndProgramming = splitUser36Grades[7];
            String user36DatabaseDesignFundamentals = splitUser36Grades[8];
            String user36ImplementationAndSupportOfComputerSystems = splitUser36Grades[9];
            String user36EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser36Grades[10];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37EnglishLanguage = splitUser37Grades[2];
            String user37PhysicalTraining = splitUser37Grades[3];
            String user37ProbabilityTheory = splitUser37Grades[4];
            String user37HardwareArchitecture = splitUser37Grades[5];
            String user37InformationTechnology = splitUser37Grades[6];
            String user37FundamentalsOfAlgorithmizationAndProgramming = splitUser37Grades[7];
            String user37DatabaseDesignFundamentals = splitUser37Grades[8];
            String user37ImplementationAndSupportOfComputerSystems = splitUser37Grades[9];
            String user37EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser37Grades[10];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38EnglishLanguage = splitUser38Grades[2];
            String user38PhysicalTraining = splitUser38Grades[3];
            String user38ProbabilityTheory = splitUser38Grades[4];
            String user38HardwareArchitecture = splitUser38Grades[5];
            String user38InformationTechnology = splitUser38Grades[6];
            String user38FundamentalsOfAlgorithmizationAndProgramming = splitUser38Grades[7];
            String user38DatabaseDesignFundamentals = splitUser38Grades[8];
            String user38ImplementationAndSupportOfComputerSystems = splitUser38Grades[9];
            String user38EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser38Grades[10];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39EnglishLanguage = splitUser39Grades[2];
            String user39PhysicalTraining = splitUser39Grades[3];
            String user39ProbabilityTheory = splitUser39Grades[4];
            String user39HardwareArchitecture = splitUser39Grades[5];
            String user39InformationTechnology = splitUser39Grades[6];
            String user39FundamentalsOfAlgorithmizationAndProgramming = splitUser39Grades[7];
            String user39DatabaseDesignFundamentals = splitUser39Grades[8];
            String user39ImplementationAndSupportOfComputerSystems = splitUser39Grades[9];
            String user39EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser39Grades[10];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40EnglishLanguage = splitUser40Grades[2];
            String user40PhysicalTraining = splitUser40Grades[3];
            String user40ProbabilityTheory = splitUser40Grades[4];
            String user40HardwareArchitecture = splitUser40Grades[5];
            String user40InformationTechnology = splitUser40Grades[6];
            String user40FundamentalsOfAlgorithmizationAndProgramming = splitUser40Grades[7];
            String user40DatabaseDesignFundamentals = splitUser40Grades[8];
            String user40ImplementationAndSupportOfComputerSystems = splitUser40Grades[9];
            String user40EnsuringAndQualityOfFunctioningOfComputerSystems = splitUser40Grades[10];


            ArrayList<Grade_IS_1_1Course2Semester2> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course2Semester2(user1Id, user1Username, user1EnglishLanguage, user1PhysicalTraining, user1ProbabilityTheory, user1HardwareArchitecture, user1InformationTechnology, user1FundamentalsOfAlgorithmizationAndProgramming, user1DatabaseDesignFundamentals, user1ImplementationAndSupportOfComputerSystems, user1EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user2Id, user2Username, user2EnglishLanguage, user2PhysicalTraining, user2ProbabilityTheory, user2HardwareArchitecture, user2InformationTechnology, user2FundamentalsOfAlgorithmizationAndProgramming, user2DatabaseDesignFundamentals, user2ImplementationAndSupportOfComputerSystems, user2EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user3Id, user3Username, user3EnglishLanguage, user3PhysicalTraining, user3ProbabilityTheory, user3HardwareArchitecture, user3InformationTechnology, user3FundamentalsOfAlgorithmizationAndProgramming, user3DatabaseDesignFundamentals, user3ImplementationAndSupportOfComputerSystems, user3EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user4Id, user4Username, user4EnglishLanguage, user4PhysicalTraining, user4ProbabilityTheory, user4HardwareArchitecture, user4InformationTechnology, user4FundamentalsOfAlgorithmizationAndProgramming, user4DatabaseDesignFundamentals, user4ImplementationAndSupportOfComputerSystems, user4EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user5Id, user5Username, user5EnglishLanguage, user5PhysicalTraining, user5ProbabilityTheory, user5HardwareArchitecture, user5InformationTechnology, user5FundamentalsOfAlgorithmizationAndProgramming, user5DatabaseDesignFundamentals, user5ImplementationAndSupportOfComputerSystems, user5EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user6Id, user6Username, user6EnglishLanguage, user6PhysicalTraining, user6ProbabilityTheory, user6HardwareArchitecture, user6InformationTechnology, user6FundamentalsOfAlgorithmizationAndProgramming, user6DatabaseDesignFundamentals, user6ImplementationAndSupportOfComputerSystems, user6EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user7Id, user7Username, user7EnglishLanguage, user7PhysicalTraining, user7ProbabilityTheory, user7HardwareArchitecture, user7InformationTechnology, user7FundamentalsOfAlgorithmizationAndProgramming, user7DatabaseDesignFundamentals, user7ImplementationAndSupportOfComputerSystems, user7EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user8Id, user8Username, user8EnglishLanguage, user8PhysicalTraining, user8ProbabilityTheory, user8HardwareArchitecture, user8InformationTechnology, user8FundamentalsOfAlgorithmizationAndProgramming, user8DatabaseDesignFundamentals, user8ImplementationAndSupportOfComputerSystems, user8EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user9Id, user9Username, user9EnglishLanguage, user9PhysicalTraining, user9ProbabilityTheory, user9HardwareArchitecture, user9InformationTechnology, user9FundamentalsOfAlgorithmizationAndProgramming, user9DatabaseDesignFundamentals, user9ImplementationAndSupportOfComputerSystems, user9EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user10Id, user10Username, user10EnglishLanguage, user10PhysicalTraining, user10ProbabilityTheory, user10HardwareArchitecture, user10InformationTechnology, user10FundamentalsOfAlgorithmizationAndProgramming, user10DatabaseDesignFundamentals, user10ImplementationAndSupportOfComputerSystems, user10EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user11Id, user11Username, user11EnglishLanguage, user11PhysicalTraining, user11ProbabilityTheory, user11HardwareArchitecture, user11InformationTechnology, user11FundamentalsOfAlgorithmizationAndProgramming, user11DatabaseDesignFundamentals, user11ImplementationAndSupportOfComputerSystems, user11EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user12Id, user12Username, user12EnglishLanguage, user12PhysicalTraining, user12ProbabilityTheory, user12HardwareArchitecture, user12InformationTechnology, user12FundamentalsOfAlgorithmizationAndProgramming, user12DatabaseDesignFundamentals, user12ImplementationAndSupportOfComputerSystems, user12EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user13Id, user13Username, user13EnglishLanguage, user13PhysicalTraining, user13ProbabilityTheory, user13HardwareArchitecture, user13InformationTechnology, user13FundamentalsOfAlgorithmizationAndProgramming, user13DatabaseDesignFundamentals, user13ImplementationAndSupportOfComputerSystems, user13EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user14Id, user14Username, user14EnglishLanguage, user14PhysicalTraining, user14ProbabilityTheory, user14HardwareArchitecture, user14InformationTechnology, user14FundamentalsOfAlgorithmizationAndProgramming, user14DatabaseDesignFundamentals, user14ImplementationAndSupportOfComputerSystems, user14EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user15Id, user15Username, user15EnglishLanguage, user15PhysicalTraining, user15ProbabilityTheory, user15HardwareArchitecture, user15InformationTechnology, user15FundamentalsOfAlgorithmizationAndProgramming, user15DatabaseDesignFundamentals, user15ImplementationAndSupportOfComputerSystems, user15EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user16Id, user16Username, user16EnglishLanguage, user16PhysicalTraining, user16ProbabilityTheory, user16HardwareArchitecture, user16InformationTechnology, user16FundamentalsOfAlgorithmizationAndProgramming, user16DatabaseDesignFundamentals, user16ImplementationAndSupportOfComputerSystems, user16EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user17Id, user17Username, user17EnglishLanguage, user17PhysicalTraining, user17ProbabilityTheory, user17HardwareArchitecture, user17InformationTechnology, user17FundamentalsOfAlgorithmizationAndProgramming, user17DatabaseDesignFundamentals, user17ImplementationAndSupportOfComputerSystems, user17EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user18Id, user18Username, user18EnglishLanguage, user18PhysicalTraining, user18ProbabilityTheory, user18HardwareArchitecture, user18InformationTechnology, user18FundamentalsOfAlgorithmizationAndProgramming, user18DatabaseDesignFundamentals, user18ImplementationAndSupportOfComputerSystems, user18EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user19Id, user19Username, user19EnglishLanguage, user19PhysicalTraining, user19ProbabilityTheory, user19HardwareArchitecture, user19InformationTechnology, user19FundamentalsOfAlgorithmizationAndProgramming, user19DatabaseDesignFundamentals, user19ImplementationAndSupportOfComputerSystems, user19EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user20Id, user20Username, user20EnglishLanguage, user20PhysicalTraining, user20ProbabilityTheory, user20HardwareArchitecture, user20InformationTechnology, user20FundamentalsOfAlgorithmizationAndProgramming, user20DatabaseDesignFundamentals, user20ImplementationAndSupportOfComputerSystems, user20EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user21Id, user21Username, user21EnglishLanguage, user21PhysicalTraining, user21ProbabilityTheory, user21HardwareArchitecture, user21InformationTechnology, user21FundamentalsOfAlgorithmizationAndProgramming, user21DatabaseDesignFundamentals, user21ImplementationAndSupportOfComputerSystems, user21EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user22Id, user22Username, user22EnglishLanguage, user22PhysicalTraining, user22ProbabilityTheory, user22HardwareArchitecture, user22InformationTechnology, user22FundamentalsOfAlgorithmizationAndProgramming, user22DatabaseDesignFundamentals, user22ImplementationAndSupportOfComputerSystems, user22EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user23Id, user23Username, user23EnglishLanguage, user23PhysicalTraining, user23ProbabilityTheory, user23HardwareArchitecture, user23InformationTechnology, user23FundamentalsOfAlgorithmizationAndProgramming, user23DatabaseDesignFundamentals, user23ImplementationAndSupportOfComputerSystems, user23EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user24Id, user24Username, user24EnglishLanguage, user24PhysicalTraining, user24ProbabilityTheory, user24HardwareArchitecture, user24InformationTechnology, user24FundamentalsOfAlgorithmizationAndProgramming, user24DatabaseDesignFundamentals, user24ImplementationAndSupportOfComputerSystems, user24EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user25Id, user25Username, user25EnglishLanguage, user25PhysicalTraining, user25ProbabilityTheory, user25HardwareArchitecture, user25InformationTechnology, user25FundamentalsOfAlgorithmizationAndProgramming, user25DatabaseDesignFundamentals, user25ImplementationAndSupportOfComputerSystems, user25EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user26Id, user26Username, user26EnglishLanguage, user26PhysicalTraining, user26ProbabilityTheory, user26HardwareArchitecture, user26InformationTechnology, user26FundamentalsOfAlgorithmizationAndProgramming, user26DatabaseDesignFundamentals, user26ImplementationAndSupportOfComputerSystems, user26EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user27Id, user27Username, user27EnglishLanguage, user27PhysicalTraining, user27ProbabilityTheory, user27HardwareArchitecture, user27InformationTechnology, user27FundamentalsOfAlgorithmizationAndProgramming, user27DatabaseDesignFundamentals, user27ImplementationAndSupportOfComputerSystems, user27EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user28Id, user28Username, user28EnglishLanguage, user28PhysicalTraining, user28ProbabilityTheory, user28HardwareArchitecture, user28InformationTechnology, user28FundamentalsOfAlgorithmizationAndProgramming, user28DatabaseDesignFundamentals, user28ImplementationAndSupportOfComputerSystems, user28EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user29Id, user29Username, user29EnglishLanguage, user29PhysicalTraining, user29ProbabilityTheory, user29HardwareArchitecture, user29InformationTechnology, user29FundamentalsOfAlgorithmizationAndProgramming, user29DatabaseDesignFundamentals, user29ImplementationAndSupportOfComputerSystems, user29EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user30Id, user30Username, user30EnglishLanguage, user30PhysicalTraining, user30ProbabilityTheory, user30HardwareArchitecture, user30InformationTechnology, user30FundamentalsOfAlgorithmizationAndProgramming, user30DatabaseDesignFundamentals, user30ImplementationAndSupportOfComputerSystems, user30EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user31Id, user31Username, user31EnglishLanguage, user31PhysicalTraining, user31ProbabilityTheory, user31HardwareArchitecture, user31InformationTechnology, user31FundamentalsOfAlgorithmizationAndProgramming, user31DatabaseDesignFundamentals, user31ImplementationAndSupportOfComputerSystems, user31EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user32Id, user32Username, user32EnglishLanguage, user32PhysicalTraining, user32ProbabilityTheory, user32HardwareArchitecture, user32InformationTechnology, user32FundamentalsOfAlgorithmizationAndProgramming, user32DatabaseDesignFundamentals, user32ImplementationAndSupportOfComputerSystems, user32EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user33Id, user33Username, user33EnglishLanguage, user33PhysicalTraining, user33ProbabilityTheory, user33HardwareArchitecture, user33InformationTechnology, user33FundamentalsOfAlgorithmizationAndProgramming, user33DatabaseDesignFundamentals, user33ImplementationAndSupportOfComputerSystems, user33EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user34Id, user34Username, user34EnglishLanguage, user34PhysicalTraining, user34ProbabilityTheory, user34HardwareArchitecture, user34InformationTechnology, user34FundamentalsOfAlgorithmizationAndProgramming, user34DatabaseDesignFundamentals, user34ImplementationAndSupportOfComputerSystems, user34EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user35Id, user35Username, user35EnglishLanguage, user35PhysicalTraining, user35ProbabilityTheory, user35HardwareArchitecture, user35InformationTechnology, user35FundamentalsOfAlgorithmizationAndProgramming, user35DatabaseDesignFundamentals, user35ImplementationAndSupportOfComputerSystems, user35EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user36Id, user36Username, user36EnglishLanguage, user36PhysicalTraining, user36ProbabilityTheory, user36HardwareArchitecture, user36InformationTechnology, user36FundamentalsOfAlgorithmizationAndProgramming, user36DatabaseDesignFundamentals, user36ImplementationAndSupportOfComputerSystems, user36EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user37Id, user37Username, user37EnglishLanguage, user37PhysicalTraining, user37ProbabilityTheory, user37HardwareArchitecture, user37InformationTechnology, user37FundamentalsOfAlgorithmizationAndProgramming, user37DatabaseDesignFundamentals, user37ImplementationAndSupportOfComputerSystems, user37EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user38Id, user38Username, user38EnglishLanguage, user38PhysicalTraining, user38ProbabilityTheory, user38HardwareArchitecture, user38InformationTechnology, user38FundamentalsOfAlgorithmizationAndProgramming, user38DatabaseDesignFundamentals, user38ImplementationAndSupportOfComputerSystems, user38EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user39Id, user39Username, user39EnglishLanguage, user39PhysicalTraining, user39ProbabilityTheory, user39HardwareArchitecture, user39InformationTechnology, user39FundamentalsOfAlgorithmizationAndProgramming, user39DatabaseDesignFundamentals, user39ImplementationAndSupportOfComputerSystems, user39EnsuringAndQualityOfFunctioningOfComputerSystems, month));
            addArr.add(new Grade_IS_1_1Course2Semester2(user40Id, user40Username, user40EnglishLanguage, user40PhysicalTraining, user40ProbabilityTheory, user40HardwareArchitecture, user40InformationTechnology, user40FundamentalsOfAlgorithmizationAndProgramming, user40DatabaseDesignFundamentals, user40ImplementationAndSupportOfComputerSystems, user40EnsuringAndQualityOfFunctioningOfComputerSystems, month));


            if (gradeIs11Course2Semester2Repository.findAll().isEmpty()) {
                gradeIs11Course2Semester2Repository.saveAll(addArr);
            }
            if (!gradeIs11Course2Semester2Repository.existsByMonth(month)) {
                gradeIs11Course2Semester2Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1

            List<Grade_IS_1_1Course2Semester2> listAllGrade = gradeIs11Course2Semester2Repository.findAll();
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User1 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User2 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User3 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User4 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User5 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User6 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User7 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User8 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User9 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User10 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User11 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User12 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User13 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User14 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User15 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User16 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User17 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User18 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User19 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User20 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User21 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User22 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User23 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User24 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User25 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User26 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User27 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User28 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User29 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User30 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User31 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User32 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User33 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User34 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User35 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User36 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User37 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User38 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User39 = null;
            Grade_IS_1_1Course2Semester2 grade_is_1_1Course2Semester2User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester2User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_is_1_1Course2Semester2User1.setUsername(user1Username);
            grade_is_1_1Course2Semester2User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_is_1_1Course2Semester2User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_is_1_1Course2Semester2User1.setGradeProbabilityTheory(user1ProbabilityTheory);
            grade_is_1_1Course2Semester2User1.setGradeHardwareArchitecture(user1HardwareArchitecture);
            grade_is_1_1Course2Semester2User1.setGradeInformationTechnology(user1InformationTechnology);
            grade_is_1_1Course2Semester2User1.setGradeFundamentalsOfAlgorithmizationAndProgramming(user1FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User1.setGradeDatabaseDesignFundamentals(user1DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User1.setGradeImplementationAndSupportOfComputerSystems(user1ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User1.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user1EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User1);

            //user2
            grade_is_1_1Course2Semester2User2.setUsername(user2Username);
            grade_is_1_1Course2Semester2User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_is_1_1Course2Semester2User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_is_1_1Course2Semester2User2.setGradeProbabilityTheory(user2ProbabilityTheory);
            grade_is_1_1Course2Semester2User2.setGradeHardwareArchitecture(user2HardwareArchitecture);
            grade_is_1_1Course2Semester2User2.setGradeInformationTechnology(user2InformationTechnology);
            grade_is_1_1Course2Semester2User2.setGradeFundamentalsOfAlgorithmizationAndProgramming(user2FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User2.setGradeDatabaseDesignFundamentals(user2DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User2.setGradeImplementationAndSupportOfComputerSystems(user2ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User2.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user2EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User2);

            //            //user3
            grade_is_1_1Course2Semester2User3.setUsername(user3Username);
            grade_is_1_1Course2Semester2User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_is_1_1Course2Semester2User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_is_1_1Course2Semester2User3.setGradeProbabilityTheory(user3ProbabilityTheory);
            grade_is_1_1Course2Semester2User3.setGradeHardwareArchitecture(user3HardwareArchitecture);
            grade_is_1_1Course2Semester2User3.setGradeInformationTechnology(user3InformationTechnology);
            grade_is_1_1Course2Semester2User3.setGradeFundamentalsOfAlgorithmizationAndProgramming(user3FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User3.setGradeDatabaseDesignFundamentals(user3DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User3.setGradeImplementationAndSupportOfComputerSystems(user3ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User3.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user3EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User3);

            //            //user4
            grade_is_1_1Course2Semester2User4.setUsername(user4Username);
            grade_is_1_1Course2Semester2User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_is_1_1Course2Semester2User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_is_1_1Course2Semester2User4.setGradeProbabilityTheory(user4ProbabilityTheory);
            grade_is_1_1Course2Semester2User4.setGradeHardwareArchitecture(user4HardwareArchitecture);
            grade_is_1_1Course2Semester2User4.setGradeInformationTechnology(user4InformationTechnology);
            grade_is_1_1Course2Semester2User4.setGradeFundamentalsOfAlgorithmizationAndProgramming(user4FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User4.setGradeDatabaseDesignFundamentals(user4DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User4.setGradeImplementationAndSupportOfComputerSystems(user4ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User4.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user4EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User4);

//            //user5
            grade_is_1_1Course2Semester2User5.setUsername(user5Username);
            grade_is_1_1Course2Semester2User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_is_1_1Course2Semester2User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_is_1_1Course2Semester2User5.setGradeProbabilityTheory(user5ProbabilityTheory);
            grade_is_1_1Course2Semester2User5.setGradeHardwareArchitecture(user5HardwareArchitecture);
            grade_is_1_1Course2Semester2User5.setGradeInformationTechnology(user5InformationTechnology);
            grade_is_1_1Course2Semester2User5.setGradeFundamentalsOfAlgorithmizationAndProgramming(user5FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User5.setGradeDatabaseDesignFundamentals(user5DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User5.setGradeImplementationAndSupportOfComputerSystems(user5ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User5.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user5EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User5);

            //            //user6
            grade_is_1_1Course2Semester2User6.setUsername(user6Username);
            grade_is_1_1Course2Semester2User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_is_1_1Course2Semester2User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_is_1_1Course2Semester2User6.setGradeProbabilityTheory(user6ProbabilityTheory);
            grade_is_1_1Course2Semester2User6.setGradeHardwareArchitecture(user6HardwareArchitecture);
            grade_is_1_1Course2Semester2User6.setGradeInformationTechnology(user6InformationTechnology);
            grade_is_1_1Course2Semester2User6.setGradeFundamentalsOfAlgorithmizationAndProgramming(user6FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User6.setGradeDatabaseDesignFundamentals(user6DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User6.setGradeImplementationAndSupportOfComputerSystems(user6ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User6.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user6EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User6);

            //            //user7
            grade_is_1_1Course2Semester2User7.setUsername(user7Username);
            grade_is_1_1Course2Semester2User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_is_1_1Course2Semester2User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_is_1_1Course2Semester2User7.setGradeProbabilityTheory(user7ProbabilityTheory);
            grade_is_1_1Course2Semester2User7.setGradeHardwareArchitecture(user7HardwareArchitecture);
            grade_is_1_1Course2Semester2User7.setGradeInformationTechnology(user7InformationTechnology);
            grade_is_1_1Course2Semester2User7.setGradeFundamentalsOfAlgorithmizationAndProgramming(user7FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User7.setGradeDatabaseDesignFundamentals(user7DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User7.setGradeImplementationAndSupportOfComputerSystems(user7ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User7.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user7EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User7);

            //            //user8
            grade_is_1_1Course2Semester2User8.setUsername(user8Username);
            grade_is_1_1Course2Semester2User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_is_1_1Course2Semester2User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_is_1_1Course2Semester2User8.setGradeProbabilityTheory(user8ProbabilityTheory);
            grade_is_1_1Course2Semester2User8.setGradeHardwareArchitecture(user8HardwareArchitecture);
            grade_is_1_1Course2Semester2User8.setGradeInformationTechnology(user8InformationTechnology);
            grade_is_1_1Course2Semester2User8.setGradeFundamentalsOfAlgorithmizationAndProgramming(user8FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User8.setGradeDatabaseDesignFundamentals(user8DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User8.setGradeImplementationAndSupportOfComputerSystems(user8ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User8.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user8EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User8);

            //            //user9
            grade_is_1_1Course2Semester2User9.setUsername(user9Username);
            grade_is_1_1Course2Semester2User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_is_1_1Course2Semester2User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_is_1_1Course2Semester2User9.setGradeProbabilityTheory(user9ProbabilityTheory);
            grade_is_1_1Course2Semester2User9.setGradeHardwareArchitecture(user9HardwareArchitecture);
            grade_is_1_1Course2Semester2User9.setGradeInformationTechnology(user9InformationTechnology);
            grade_is_1_1Course2Semester2User9.setGradeFundamentalsOfAlgorithmizationAndProgramming(user9FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User9.setGradeDatabaseDesignFundamentals(user9DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User9.setGradeImplementationAndSupportOfComputerSystems(user9ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User9.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user9EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User9);


            //            //user10
            grade_is_1_1Course2Semester2User10.setUsername(user10Username);
            grade_is_1_1Course2Semester2User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_is_1_1Course2Semester2User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_is_1_1Course2Semester2User10.setGradeProbabilityTheory(user10ProbabilityTheory);
            grade_is_1_1Course2Semester2User10.setGradeHardwareArchitecture(user10HardwareArchitecture);
            grade_is_1_1Course2Semester2User10.setGradeInformationTechnology(user10InformationTechnology);
            grade_is_1_1Course2Semester2User10.setGradeFundamentalsOfAlgorithmizationAndProgramming(user10FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User10.setGradeDatabaseDesignFundamentals(user10DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User10.setGradeImplementationAndSupportOfComputerSystems(user10ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User10.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user10EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User10);

            //            //user11
            grade_is_1_1Course2Semester2User11.setUsername(user11Username);
            grade_is_1_1Course2Semester2User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_is_1_1Course2Semester2User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_is_1_1Course2Semester2User11.setGradeProbabilityTheory(user11ProbabilityTheory);
            grade_is_1_1Course2Semester2User11.setGradeHardwareArchitecture(user11HardwareArchitecture);
            grade_is_1_1Course2Semester2User11.setGradeInformationTechnology(user11InformationTechnology);
            grade_is_1_1Course2Semester2User11.setGradeFundamentalsOfAlgorithmizationAndProgramming(user11FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User11.setGradeDatabaseDesignFundamentals(user11DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User11.setGradeImplementationAndSupportOfComputerSystems(user11ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User11.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user11EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User11);


            //            //user12
            grade_is_1_1Course2Semester2User12.setUsername(user12Username);
            grade_is_1_1Course2Semester2User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_is_1_1Course2Semester2User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_is_1_1Course2Semester2User12.setGradeProbabilityTheory(user12ProbabilityTheory);
            grade_is_1_1Course2Semester2User12.setGradeHardwareArchitecture(user12HardwareArchitecture);
            grade_is_1_1Course2Semester2User12.setGradeInformationTechnology(user12InformationTechnology);
            grade_is_1_1Course2Semester2User12.setGradeFundamentalsOfAlgorithmizationAndProgramming(user12FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User12.setGradeDatabaseDesignFundamentals(user12DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User12.setGradeImplementationAndSupportOfComputerSystems(user12ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User12.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user12EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User12);

            //            //user13
            grade_is_1_1Course2Semester2User13.setUsername(user13Username);
            grade_is_1_1Course2Semester2User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_is_1_1Course2Semester2User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_is_1_1Course2Semester2User13.setGradeProbabilityTheory(user13ProbabilityTheory);
            grade_is_1_1Course2Semester2User13.setGradeHardwareArchitecture(user13HardwareArchitecture);
            grade_is_1_1Course2Semester2User13.setGradeInformationTechnology(user13InformationTechnology);
            grade_is_1_1Course2Semester2User13.setGradeFundamentalsOfAlgorithmizationAndProgramming(user13FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User13.setGradeDatabaseDesignFundamentals(user13DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User13.setGradeImplementationAndSupportOfComputerSystems(user13ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User13.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user13EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User13);

            //            //user14
            grade_is_1_1Course2Semester2User14.setUsername(user14Username);
            grade_is_1_1Course2Semester2User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_is_1_1Course2Semester2User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_is_1_1Course2Semester2User14.setGradeProbabilityTheory(user14ProbabilityTheory);
            grade_is_1_1Course2Semester2User14.setGradeHardwareArchitecture(user14HardwareArchitecture);
            grade_is_1_1Course2Semester2User14.setGradeInformationTechnology(user14InformationTechnology);
            grade_is_1_1Course2Semester2User14.setGradeFundamentalsOfAlgorithmizationAndProgramming(user14FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User14.setGradeDatabaseDesignFundamentals(user14DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User14.setGradeImplementationAndSupportOfComputerSystems(user14ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User14.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user14EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User14);

            //            //user15
            grade_is_1_1Course2Semester2User15.setUsername(user15Username);
            grade_is_1_1Course2Semester2User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_is_1_1Course2Semester2User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_is_1_1Course2Semester2User15.setGradeProbabilityTheory(user15ProbabilityTheory);
            grade_is_1_1Course2Semester2User15.setGradeHardwareArchitecture(user15HardwareArchitecture);
            grade_is_1_1Course2Semester2User15.setGradeInformationTechnology(user15InformationTechnology);
            grade_is_1_1Course2Semester2User15.setGradeFundamentalsOfAlgorithmizationAndProgramming(user15FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User15.setGradeDatabaseDesignFundamentals(user15DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User15.setGradeImplementationAndSupportOfComputerSystems(user15ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User15.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user15EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User15);

            //           //user16

            grade_is_1_1Course2Semester2User16.setUsername(user16Username);
            grade_is_1_1Course2Semester2User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_is_1_1Course2Semester2User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_is_1_1Course2Semester2User16.setGradeProbabilityTheory(user16ProbabilityTheory);
            grade_is_1_1Course2Semester2User16.setGradeHardwareArchitecture(user16HardwareArchitecture);
            grade_is_1_1Course2Semester2User16.setGradeInformationTechnology(user16InformationTechnology);
            grade_is_1_1Course2Semester2User16.setGradeFundamentalsOfAlgorithmizationAndProgramming(user16FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User16.setGradeDatabaseDesignFundamentals(user16DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User16.setGradeImplementationAndSupportOfComputerSystems(user16ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User16.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user16EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User16);


            //            //user17

            grade_is_1_1Course2Semester2User17.setUsername(user17Username);
            grade_is_1_1Course2Semester2User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_is_1_1Course2Semester2User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_is_1_1Course2Semester2User17.setGradeProbabilityTheory(user17ProbabilityTheory);
            grade_is_1_1Course2Semester2User17.setGradeHardwareArchitecture(user17HardwareArchitecture);
            grade_is_1_1Course2Semester2User17.setGradeInformationTechnology(user17InformationTechnology);
            grade_is_1_1Course2Semester2User17.setGradeFundamentalsOfAlgorithmizationAndProgramming(user17FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User17.setGradeDatabaseDesignFundamentals(user17DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User17.setGradeImplementationAndSupportOfComputerSystems(user17ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User17.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user17EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User17);

            //            //user18

            grade_is_1_1Course2Semester2User18.setUsername(user18Username);
            grade_is_1_1Course2Semester2User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_is_1_1Course2Semester2User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_is_1_1Course2Semester2User18.setGradeProbabilityTheory(user18ProbabilityTheory);
            grade_is_1_1Course2Semester2User18.setGradeHardwareArchitecture(user18HardwareArchitecture);
            grade_is_1_1Course2Semester2User18.setGradeInformationTechnology(user18InformationTechnology);
            grade_is_1_1Course2Semester2User18.setGradeFundamentalsOfAlgorithmizationAndProgramming(user18FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User18.setGradeDatabaseDesignFundamentals(user18DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User18.setGradeImplementationAndSupportOfComputerSystems(user18ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User18.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user18EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User18);


            //            //user19

            grade_is_1_1Course2Semester2User19.setUsername(user19Username);
            grade_is_1_1Course2Semester2User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_is_1_1Course2Semester2User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_is_1_1Course2Semester2User19.setGradeProbabilityTheory(user19ProbabilityTheory);
            grade_is_1_1Course2Semester2User19.setGradeHardwareArchitecture(user19HardwareArchitecture);
            grade_is_1_1Course2Semester2User19.setGradeInformationTechnology(user19InformationTechnology);
            grade_is_1_1Course2Semester2User19.setGradeFundamentalsOfAlgorithmizationAndProgramming(user19FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User19.setGradeDatabaseDesignFundamentals(user19DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User19.setGradeImplementationAndSupportOfComputerSystems(user19ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User19.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user19EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User19);

            //            //user20

            grade_is_1_1Course2Semester2User20.setUsername(user20Username);
            grade_is_1_1Course2Semester2User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_is_1_1Course2Semester2User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_is_1_1Course2Semester2User20.setGradeProbabilityTheory(user20ProbabilityTheory);
            grade_is_1_1Course2Semester2User20.setGradeHardwareArchitecture(user20HardwareArchitecture);
            grade_is_1_1Course2Semester2User20.setGradeInformationTechnology(user20InformationTechnology);
            grade_is_1_1Course2Semester2User20.setGradeFundamentalsOfAlgorithmizationAndProgramming(user20FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User20.setGradeDatabaseDesignFundamentals(user20DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User20.setGradeImplementationAndSupportOfComputerSystems(user20ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User20.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user20EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User20);

            //            //user21

            grade_is_1_1Course2Semester2User21.setUsername(user21Username);
            grade_is_1_1Course2Semester2User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_is_1_1Course2Semester2User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_is_1_1Course2Semester2User21.setGradeProbabilityTheory(user21ProbabilityTheory);
            grade_is_1_1Course2Semester2User21.setGradeHardwareArchitecture(user21HardwareArchitecture);
            grade_is_1_1Course2Semester2User21.setGradeInformationTechnology(user21InformationTechnology);
            grade_is_1_1Course2Semester2User21.setGradeFundamentalsOfAlgorithmizationAndProgramming(user21FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User21.setGradeDatabaseDesignFundamentals(user21DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User21.setGradeImplementationAndSupportOfComputerSystems(user21ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User21.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user21EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User21);

            //            //user22

            grade_is_1_1Course2Semester2User22.setUsername(user22Username);
            grade_is_1_1Course2Semester2User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_is_1_1Course2Semester2User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_is_1_1Course2Semester2User22.setGradeProbabilityTheory(user22ProbabilityTheory);
            grade_is_1_1Course2Semester2User22.setGradeHardwareArchitecture(user22HardwareArchitecture);
            grade_is_1_1Course2Semester2User22.setGradeInformationTechnology(user22InformationTechnology);
            grade_is_1_1Course2Semester2User22.setGradeFundamentalsOfAlgorithmizationAndProgramming(user22FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User22.setGradeDatabaseDesignFundamentals(user22DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User22.setGradeImplementationAndSupportOfComputerSystems(user22ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User22.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user22EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User22);

            //            //user23

            grade_is_1_1Course2Semester2User23.setUsername(user23Username);
            grade_is_1_1Course2Semester2User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_is_1_1Course2Semester2User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_is_1_1Course2Semester2User23.setGradeProbabilityTheory(user23ProbabilityTheory);
            grade_is_1_1Course2Semester2User23.setGradeHardwareArchitecture(user23HardwareArchitecture);
            grade_is_1_1Course2Semester2User23.setGradeInformationTechnology(user23InformationTechnology);
            grade_is_1_1Course2Semester2User23.setGradeFundamentalsOfAlgorithmizationAndProgramming(user23FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User23.setGradeDatabaseDesignFundamentals(user23DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User23.setGradeImplementationAndSupportOfComputerSystems(user23ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User23.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user23EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User23);

            //            //user24

            grade_is_1_1Course2Semester2User24.setUsername(user24Username);
            grade_is_1_1Course2Semester2User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_is_1_1Course2Semester2User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_is_1_1Course2Semester2User24.setGradeProbabilityTheory(user24ProbabilityTheory);
            grade_is_1_1Course2Semester2User24.setGradeHardwareArchitecture(user24HardwareArchitecture);
            grade_is_1_1Course2Semester2User24.setGradeInformationTechnology(user24InformationTechnology);
            grade_is_1_1Course2Semester2User24.setGradeFundamentalsOfAlgorithmizationAndProgramming(user24FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User24.setGradeDatabaseDesignFundamentals(user24DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User24.setGradeImplementationAndSupportOfComputerSystems(user24ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User24.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user24EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User24);

            //            //user25

            grade_is_1_1Course2Semester2User25.setUsername(user25Username);
            grade_is_1_1Course2Semester2User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_is_1_1Course2Semester2User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_is_1_1Course2Semester2User25.setGradeProbabilityTheory(user25ProbabilityTheory);
            grade_is_1_1Course2Semester2User25.setGradeHardwareArchitecture(user25HardwareArchitecture);
            grade_is_1_1Course2Semester2User25.setGradeInformationTechnology(user25InformationTechnology);
            grade_is_1_1Course2Semester2User25.setGradeFundamentalsOfAlgorithmizationAndProgramming(user25FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User25.setGradeDatabaseDesignFundamentals(user25DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User25.setGradeImplementationAndSupportOfComputerSystems(user25ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User25.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user25EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User25);

            //            //user26

            grade_is_1_1Course2Semester2User26.setUsername(user26Username);
            grade_is_1_1Course2Semester2User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_is_1_1Course2Semester2User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_is_1_1Course2Semester2User26.setGradeProbabilityTheory(user26ProbabilityTheory);
            grade_is_1_1Course2Semester2User26.setGradeHardwareArchitecture(user26HardwareArchitecture);
            grade_is_1_1Course2Semester2User26.setGradeInformationTechnology(user26InformationTechnology);
            grade_is_1_1Course2Semester2User26.setGradeFundamentalsOfAlgorithmizationAndProgramming(user26FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User26.setGradeDatabaseDesignFundamentals(user26DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User26.setGradeImplementationAndSupportOfComputerSystems(user26ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User26.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user26EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User26);

            //            //user27

            grade_is_1_1Course2Semester2User27.setUsername(user27Username);
            grade_is_1_1Course2Semester2User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_is_1_1Course2Semester2User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_is_1_1Course2Semester2User27.setGradeProbabilityTheory(user27ProbabilityTheory);
            grade_is_1_1Course2Semester2User27.setGradeHardwareArchitecture(user27HardwareArchitecture);
            grade_is_1_1Course2Semester2User27.setGradeInformationTechnology(user27InformationTechnology);
            grade_is_1_1Course2Semester2User27.setGradeFundamentalsOfAlgorithmizationAndProgramming(user27FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User27.setGradeDatabaseDesignFundamentals(user27DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User27.setGradeImplementationAndSupportOfComputerSystems(user27ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User27.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user27EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User27);

            //            //user28

            grade_is_1_1Course2Semester2User28.setUsername(user28Username);
            grade_is_1_1Course2Semester2User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_is_1_1Course2Semester2User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_is_1_1Course2Semester2User28.setGradeProbabilityTheory(user28ProbabilityTheory);
            grade_is_1_1Course2Semester2User28.setGradeHardwareArchitecture(user28HardwareArchitecture);
            grade_is_1_1Course2Semester2User28.setGradeInformationTechnology(user28InformationTechnology);
            grade_is_1_1Course2Semester2User28.setGradeFundamentalsOfAlgorithmizationAndProgramming(user28FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User28.setGradeDatabaseDesignFundamentals(user28DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User28.setGradeImplementationAndSupportOfComputerSystems(user28ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User28.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user28EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User28);

            //            //user29

            grade_is_1_1Course2Semester2User29.setUsername(user29Username);
            grade_is_1_1Course2Semester2User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_is_1_1Course2Semester2User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_is_1_1Course2Semester2User29.setGradeProbabilityTheory(user29ProbabilityTheory);
            grade_is_1_1Course2Semester2User29.setGradeHardwareArchitecture(user29HardwareArchitecture);
            grade_is_1_1Course2Semester2User29.setGradeInformationTechnology(user29InformationTechnology);
            grade_is_1_1Course2Semester2User29.setGradeFundamentalsOfAlgorithmizationAndProgramming(user29FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User29.setGradeDatabaseDesignFundamentals(user29DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User29.setGradeImplementationAndSupportOfComputerSystems(user29ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User29.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user29EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User29);

            //            //user30

            grade_is_1_1Course2Semester2User30.setUsername(user30Username);
            grade_is_1_1Course2Semester2User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_is_1_1Course2Semester2User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_is_1_1Course2Semester2User30.setGradeProbabilityTheory(user30ProbabilityTheory);
            grade_is_1_1Course2Semester2User30.setGradeHardwareArchitecture(user30HardwareArchitecture);
            grade_is_1_1Course2Semester2User30.setGradeInformationTechnology(user30InformationTechnology);
            grade_is_1_1Course2Semester2User30.setGradeFundamentalsOfAlgorithmizationAndProgramming(user30FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User30.setGradeDatabaseDesignFundamentals(user30DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User30.setGradeImplementationAndSupportOfComputerSystems(user30ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User30.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user30EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User30);

            //            //user31

            grade_is_1_1Course2Semester2User31.setUsername(user31Username);
            grade_is_1_1Course2Semester2User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_is_1_1Course2Semester2User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_is_1_1Course2Semester2User31.setGradeProbabilityTheory(user31ProbabilityTheory);
            grade_is_1_1Course2Semester2User31.setGradeHardwareArchitecture(user31HardwareArchitecture);
            grade_is_1_1Course2Semester2User31.setGradeInformationTechnology(user31InformationTechnology);
            grade_is_1_1Course2Semester2User31.setGradeFundamentalsOfAlgorithmizationAndProgramming(user31FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User31.setGradeDatabaseDesignFundamentals(user31DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User31.setGradeImplementationAndSupportOfComputerSystems(user31ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User31.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user31EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User31);

            //            //user32

            grade_is_1_1Course2Semester2User32.setUsername(user32Username);
            grade_is_1_1Course2Semester2User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_is_1_1Course2Semester2User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_is_1_1Course2Semester2User32.setGradeProbabilityTheory(user32ProbabilityTheory);
            grade_is_1_1Course2Semester2User32.setGradeHardwareArchitecture(user32HardwareArchitecture);
            grade_is_1_1Course2Semester2User32.setGradeInformationTechnology(user32InformationTechnology);
            grade_is_1_1Course2Semester2User32.setGradeFundamentalsOfAlgorithmizationAndProgramming(user32FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User32.setGradeDatabaseDesignFundamentals(user32DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User32.setGradeImplementationAndSupportOfComputerSystems(user32ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User32.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user32EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User32);

            //            //user33

            grade_is_1_1Course2Semester2User33.setUsername(user33Username);
            grade_is_1_1Course2Semester2User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_is_1_1Course2Semester2User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_is_1_1Course2Semester2User33.setGradeProbabilityTheory(user33ProbabilityTheory);
            grade_is_1_1Course2Semester2User33.setGradeHardwareArchitecture(user33HardwareArchitecture);
            grade_is_1_1Course2Semester2User33.setGradeInformationTechnology(user33InformationTechnology);
            grade_is_1_1Course2Semester2User33.setGradeFundamentalsOfAlgorithmizationAndProgramming(user33FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User33.setGradeDatabaseDesignFundamentals(user33DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User33.setGradeImplementationAndSupportOfComputerSystems(user33ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User33.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user33EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User33);

            //            //user34

            grade_is_1_1Course2Semester2User34.setUsername(user34Username);
            grade_is_1_1Course2Semester2User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_is_1_1Course2Semester2User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_is_1_1Course2Semester2User34.setGradeProbabilityTheory(user34ProbabilityTheory);
            grade_is_1_1Course2Semester2User34.setGradeHardwareArchitecture(user34HardwareArchitecture);
            grade_is_1_1Course2Semester2User34.setGradeInformationTechnology(user34InformationTechnology);
            grade_is_1_1Course2Semester2User34.setGradeFundamentalsOfAlgorithmizationAndProgramming(user34FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User34.setGradeDatabaseDesignFundamentals(user34DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User34.setGradeImplementationAndSupportOfComputerSystems(user34ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User34.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user34EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User34);

            //            //user35

            grade_is_1_1Course2Semester2User35.setUsername(user35Username);
            grade_is_1_1Course2Semester2User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_is_1_1Course2Semester2User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_is_1_1Course2Semester2User35.setGradeProbabilityTheory(user35ProbabilityTheory);
            grade_is_1_1Course2Semester2User35.setGradeHardwareArchitecture(user35HardwareArchitecture);
            grade_is_1_1Course2Semester2User35.setGradeInformationTechnology(user35InformationTechnology);
            grade_is_1_1Course2Semester2User35.setGradeFundamentalsOfAlgorithmizationAndProgramming(user35FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User35.setGradeDatabaseDesignFundamentals(user35DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User35.setGradeImplementationAndSupportOfComputerSystems(user35ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User35.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user35EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User35);

            //            //user36

            grade_is_1_1Course2Semester2User36.setUsername(user36Username);
            grade_is_1_1Course2Semester2User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_is_1_1Course2Semester2User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_is_1_1Course2Semester2User36.setGradeProbabilityTheory(user36ProbabilityTheory);
            grade_is_1_1Course2Semester2User36.setGradeHardwareArchitecture(user36HardwareArchitecture);
            grade_is_1_1Course2Semester2User36.setGradeInformationTechnology(user36InformationTechnology);
            grade_is_1_1Course2Semester2User36.setGradeFundamentalsOfAlgorithmizationAndProgramming(user36FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User36.setGradeDatabaseDesignFundamentals(user36DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User36.setGradeImplementationAndSupportOfComputerSystems(user36ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User36.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user36EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User36);

            //            //user37

            grade_is_1_1Course2Semester2User37.setUsername(user37Username);
            grade_is_1_1Course2Semester2User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_is_1_1Course2Semester2User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_is_1_1Course2Semester2User37.setGradeProbabilityTheory(user37ProbabilityTheory);
            grade_is_1_1Course2Semester2User37.setGradeHardwareArchitecture(user37HardwareArchitecture);
            grade_is_1_1Course2Semester2User37.setGradeInformationTechnology(user37InformationTechnology);
            grade_is_1_1Course2Semester2User37.setGradeFundamentalsOfAlgorithmizationAndProgramming(user37FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User37.setGradeDatabaseDesignFundamentals(user37DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User37.setGradeImplementationAndSupportOfComputerSystems(user37ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User37.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user37EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User37);

            //            //user38

            grade_is_1_1Course2Semester2User38.setUsername(user38Username);
            grade_is_1_1Course2Semester2User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_is_1_1Course2Semester2User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_is_1_1Course2Semester2User38.setGradeProbabilityTheory(user38ProbabilityTheory);
            grade_is_1_1Course2Semester2User38.setGradeHardwareArchitecture(user38HardwareArchitecture);
            grade_is_1_1Course2Semester2User38.setGradeInformationTechnology(user38InformationTechnology);
            grade_is_1_1Course2Semester2User38.setGradeFundamentalsOfAlgorithmizationAndProgramming(user38FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User38.setGradeDatabaseDesignFundamentals(user38DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User38.setGradeImplementationAndSupportOfComputerSystems(user38ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User38.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user38EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User38);

            //            //user39

            grade_is_1_1Course2Semester2User39.setUsername(user39Username);
            grade_is_1_1Course2Semester2User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_is_1_1Course2Semester2User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_is_1_1Course2Semester2User39.setGradeProbabilityTheory(user39ProbabilityTheory);
            grade_is_1_1Course2Semester2User39.setGradeHardwareArchitecture(user39HardwareArchitecture);
            grade_is_1_1Course2Semester2User39.setGradeInformationTechnology(user39InformationTechnology);
            grade_is_1_1Course2Semester2User39.setGradeFundamentalsOfAlgorithmizationAndProgramming(user39FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User39.setGradeDatabaseDesignFundamentals(user39DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User39.setGradeImplementationAndSupportOfComputerSystems(user39ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User39.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user39EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User39);

            //            //user40

            grade_is_1_1Course2Semester2User40.setUsername(user40Username);
            grade_is_1_1Course2Semester2User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_is_1_1Course2Semester2User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_is_1_1Course2Semester2User40.setGradeProbabilityTheory(user40ProbabilityTheory);
            grade_is_1_1Course2Semester2User40.setGradeHardwareArchitecture(user40HardwareArchitecture);
            grade_is_1_1Course2Semester2User40.setGradeInformationTechnology(user40InformationTechnology);
            grade_is_1_1Course2Semester2User40.setGradeFundamentalsOfAlgorithmizationAndProgramming(user40FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester2User40.setGradeDatabaseDesignFundamentals(user40DatabaseDesignFundamentals);
            grade_is_1_1Course2Semester2User40.setGradeImplementationAndSupportOfComputerSystems(user40ImplementationAndSupportOfComputerSystems);
            grade_is_1_1Course2Semester2User40.setGradeEnsuringAndQualityOfFunctioningOfComputerSystems(user40EnsuringAndQualityOfFunctioningOfComputerSystems);
            gradeIs11Course2Semester2Repository.save(grade_is_1_1Course2Semester2User40);

        } catch (Exception ignore) {

        }

    }
}
