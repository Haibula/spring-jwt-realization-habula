package com.example.demoauth.service.moderatorService.moderator_is1Service.course2;

import com.example.demoauth.models.grade_is1.models.course2.Grade_IS_1_1Course2Semester1;
import com.example.demoauth.repository.is1Repository.course1.Grade_IS_1_1Course1Semester1Repository;
import com.example.demoauth.repository.is1Repository.course2.Grade_IS_1_1Course2Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorGradeServiceIS1Course2Semester1 {
    @Autowired
    Grade_IS_1_1Course2Semester1Repository gradeIs11Course2Semester1Repository;
    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_is_1_1Course1Semester1Repository;
    //GetMappingGradeCourse2Semester1
    public void getMappingMethodModer_is_1_1GreadeСourse2Semester1(@PathVariable String month, Model model) {

        List<Grade_IS_1_1Course2Semester1> res = gradeIs11Course2Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course2Semester1::getUserID));
        List<Grade_IS_1_1Course2Semester1> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester1> septemberList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester1> octoberList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester1> novemberList = new ArrayList<>();
        List<Grade_IS_1_1Course2Semester1> decemberList = new ArrayList<>();

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
            voidList.add(new Grade_IS_1_1Course2Semester1());
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

    //PostMappingGradeCourse2Semester1
    public void postMappingMethodModer_is_1_1GreadeСourse2Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1Story = splitUser1Grades[2];
            String user1EnglishLanguage = splitUser1Grades[3];
            String user1PhysicalTraining = splitUser1Grades[4];
            String user1GNPRIT = splitUser1Grades[5];
            String user1ElementsOfHigherMathematics = splitUser1Grades[6];
            String user1DiscreteMath = splitUser1Grades[7];
            String user1OperatingSystemsAndEnvironments = splitUser1Grades[8];
            String user1FundamentalsOfAlgorithmizationAndProgramming = splitUser1Grades[9];
            String user1ComputerNetwork = splitUser1Grades[10];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2Story = splitUser2Grades[2];
            String user2EnglishLanguage = splitUser2Grades[3];
            String user2PhysicalTraining = splitUser2Grades[4];
            String user2GNPRIT = splitUser2Grades[5];
            String user2ElementsOfHigherMathematics = splitUser2Grades[6];
            String user2DiscreteMath = splitUser2Grades[7];
            String user2OperatingSystemsAndEnvironments = splitUser2Grades[8];
            String user2FundamentalsOfAlgorithmizationAndProgramming = splitUser2Grades[9];
            String user2ComputerNetwork = splitUser2Grades[10];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3Story = splitUser3Grades[2];
            String user3EnglishLanguage = splitUser3Grades[3];
            String user3PhysicalTraining = splitUser3Grades[4];
            String user3GNPRIT = splitUser3Grades[5];
            String user3ElementsOfHigherMathematics = splitUser3Grades[6];
            String user3DiscreteMath = splitUser3Grades[7];
            String user3OperatingSystemsAndEnvironments = splitUser3Grades[8];
            String user3FundamentalsOfAlgorithmizationAndProgramming = splitUser3Grades[9];
            String user3ComputerNetwork = splitUser3Grades[10];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4Story = splitUser4Grades[2];
            String user4EnglishLanguage = splitUser4Grades[3];
            String user4PhysicalTraining = splitUser4Grades[4];
            String user4GNPRIT = splitUser4Grades[5];
            String user4ElementsOfHigherMathematics = splitUser4Grades[6];
            String user4DiscreteMath = splitUser4Grades[7];
            String user4OperatingSystemsAndEnvironments = splitUser4Grades[8];
            String user4FundamentalsOfAlgorithmizationAndProgramming = splitUser4Grades[9];
            String user4ComputerNetwork = splitUser4Grades[10];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5Story = splitUser5Grades[2];
            String user5EnglishLanguage = splitUser5Grades[3];
            String user5PhysicalTraining = splitUser5Grades[4];
            String user5GNPRIT = splitUser5Grades[5];
            String user5ElementsOfHigherMathematics = splitUser5Grades[6];
            String user5DiscreteMath = splitUser5Grades[7];
            String user5OperatingSystemsAndEnvironments = splitUser5Grades[8];
            String user5FundamentalsOfAlgorithmizationAndProgramming = splitUser5Grades[9];
            String user5ComputerNetwork = splitUser5Grades[10];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6Story = splitUser6Grades[2];
            String user6EnglishLanguage = splitUser6Grades[3];
            String user6PhysicalTraining = splitUser6Grades[4];
            String user6GNPRIT = splitUser6Grades[5];
            String user6ElementsOfHigherMathematics = splitUser6Grades[6];
            String user6DiscreteMath = splitUser6Grades[7];
            String user6OperatingSystemsAndEnvironments = splitUser6Grades[8];
            String user6FundamentalsOfAlgorithmizationAndProgramming = splitUser6Grades[9];
            String user6ComputerNetwork = splitUser6Grades[10];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7Story = splitUser7Grades[2];
            String user7EnglishLanguage = splitUser7Grades[3];
            String user7PhysicalTraining = splitUser7Grades[4];
            String user7GNPRIT = splitUser7Grades[5];
            String user7ElementsOfHigherMathematics = splitUser7Grades[6];
            String user7DiscreteMath = splitUser7Grades[7];
            String user7OperatingSystemsAndEnvironments = splitUser7Grades[8];
            String user7FundamentalsOfAlgorithmizationAndProgramming = splitUser7Grades[9];
            String user7ComputerNetwork = splitUser7Grades[10];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8Story = splitUser8Grades[2];
            String user8EnglishLanguage = splitUser8Grades[3];
            String user8PhysicalTraining = splitUser8Grades[4];
            String user8GNPRIT = splitUser8Grades[5];
            String user8ElementsOfHigherMathematics = splitUser8Grades[6];
            String user8DiscreteMath = splitUser8Grades[7];
            String user8OperatingSystemsAndEnvironments = splitUser8Grades[8];
            String user8FundamentalsOfAlgorithmizationAndProgramming = splitUser8Grades[9];
            String user8ComputerNetwork = splitUser8Grades[10];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9Story = splitUser9Grades[2];
            String user9EnglishLanguage = splitUser9Grades[3];
            String user9PhysicalTraining = splitUser9Grades[4];
            String user9GNPRIT = splitUser9Grades[5];
            String user9ElementsOfHigherMathematics = splitUser9Grades[6];
            String user9DiscreteMath = splitUser9Grades[7];
            String user9OperatingSystemsAndEnvironments = splitUser9Grades[8];
            String user9FundamentalsOfAlgorithmizationAndProgramming = splitUser9Grades[9];
            String user9ComputerNetwork = splitUser9Grades[10];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10Story = splitUser10Grades[2];
            String user10EnglishLanguage = splitUser10Grades[3];
            String user10PhysicalTraining = splitUser10Grades[4];
            String user10GNPRIT = splitUser10Grades[5];
            String user10ElementsOfHigherMathematics = splitUser10Grades[6];
            String user10DiscreteMath = splitUser10Grades[7];
            String user10OperatingSystemsAndEnvironments = splitUser10Grades[8];
            String user10FundamentalsOfAlgorithmizationAndProgramming = splitUser10Grades[9];
            String user10ComputerNetwork = splitUser10Grades[10];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11Story = splitUser11Grades[2];
            String user11EnglishLanguage = splitUser11Grades[3];
            String user11PhysicalTraining = splitUser11Grades[4];
            String user11GNPRIT = splitUser11Grades[5];
            String user11ElementsOfHigherMathematics = splitUser11Grades[6];
            String user11DiscreteMath = splitUser11Grades[7];
            String user11OperatingSystemsAndEnvironments = splitUser11Grades[8];
            String user11FundamentalsOfAlgorithmizationAndProgramming = splitUser11Grades[9];
            String user11ComputerNetwork = splitUser11Grades[10];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12Story = splitUser12Grades[2];
            String user12EnglishLanguage = splitUser12Grades[3];
            String user12PhysicalTraining = splitUser12Grades[4];
            String user12GNPRIT = splitUser12Grades[5];
            String user12ElementsOfHigherMathematics = splitUser12Grades[6];
            String user12DiscreteMath = splitUser12Grades[7];
            String user12OperatingSystemsAndEnvironments = splitUser12Grades[8];
            String user12FundamentalsOfAlgorithmizationAndProgramming = splitUser12Grades[9];
            String user12ComputerNetwork = splitUser12Grades[10];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13Story = splitUser13Grades[2];
            String user13EnglishLanguage = splitUser13Grades[3];
            String user13PhysicalTraining = splitUser13Grades[4];
            String user13GNPRIT = splitUser13Grades[5];
            String user13ElementsOfHigherMathematics = splitUser13Grades[6];
            String user13DiscreteMath = splitUser13Grades[7];
            String user13OperatingSystemsAndEnvironments = splitUser13Grades[8];
            String user13FundamentalsOfAlgorithmizationAndProgramming = splitUser13Grades[9];
            String user13ComputerNetwork = splitUser13Grades[10];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14Story = splitUser14Grades[2];
            String user14EnglishLanguage = splitUser14Grades[3];
            String user14PhysicalTraining = splitUser14Grades[4];
            String user14GNPRIT = splitUser14Grades[5];
            String user14ElementsOfHigherMathematics = splitUser14Grades[6];
            String user14DiscreteMath = splitUser14Grades[7];
            String user14OperatingSystemsAndEnvironments = splitUser14Grades[8];
            String user14FundamentalsOfAlgorithmizationAndProgramming = splitUser14Grades[9];
            String user14ComputerNetwork = splitUser14Grades[10];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15Story = splitUser15Grades[2];
            String user15EnglishLanguage = splitUser15Grades[3];
            String user15PhysicalTraining = splitUser15Grades[4];
            String user15GNPRIT = splitUser15Grades[5];
            String user15ElementsOfHigherMathematics = splitUser15Grades[6];
            String user15DiscreteMath = splitUser15Grades[7];
            String user15OperatingSystemsAndEnvironments = splitUser15Grades[8];
            String user15FundamentalsOfAlgorithmizationAndProgramming = splitUser15Grades[9];
            String user15ComputerNetwork = splitUser15Grades[10];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16Story = splitUser16Grades[2];
            String user16EnglishLanguage = splitUser16Grades[3];
            String user16PhysicalTraining = splitUser16Grades[4];
            String user16GNPRIT = splitUser16Grades[5];
            String user16ElementsOfHigherMathematics = splitUser16Grades[6];
            String user16DiscreteMath = splitUser16Grades[7];
            String user16OperatingSystemsAndEnvironments = splitUser16Grades[8];
            String user16FundamentalsOfAlgorithmizationAndProgramming = splitUser16Grades[9];
            String user16ComputerNetwork = splitUser16Grades[10];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17Story = splitUser17Grades[2];
            String user17EnglishLanguage = splitUser17Grades[3];
            String user17PhysicalTraining = splitUser17Grades[4];
            String user17GNPRIT = splitUser17Grades[5];
            String user17ElementsOfHigherMathematics = splitUser17Grades[6];
            String user17DiscreteMath = splitUser17Grades[7];
            String user17OperatingSystemsAndEnvironments = splitUser17Grades[8];
            String user17FundamentalsOfAlgorithmizationAndProgramming = splitUser17Grades[9];
            String user17ComputerNetwork = splitUser17Grades[10];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18Story = splitUser18Grades[2];
            String user18EnglishLanguage = splitUser18Grades[3];
            String user18PhysicalTraining = splitUser18Grades[4];
            String user18GNPRIT = splitUser18Grades[5];
            String user18ElementsOfHigherMathematics = splitUser18Grades[6];
            String user18DiscreteMath = splitUser18Grades[7];
            String user18OperatingSystemsAndEnvironments = splitUser18Grades[8];
            String user18FundamentalsOfAlgorithmizationAndProgramming = splitUser18Grades[9];
            String user18ComputerNetwork = splitUser18Grades[10];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19Story = splitUser19Grades[2];
            String user19EnglishLanguage = splitUser19Grades[3];
            String user19PhysicalTraining = splitUser19Grades[4];
            String user19GNPRIT = splitUser19Grades[5];
            String user19ElementsOfHigherMathematics = splitUser19Grades[6];
            String user19DiscreteMath = splitUser19Grades[7];
            String user19OperatingSystemsAndEnvironments = splitUser19Grades[8];
            String user19FundamentalsOfAlgorithmizationAndProgramming = splitUser19Grades[9];
            String user19ComputerNetwork = splitUser19Grades[10];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20Story = splitUser20Grades[2];
            String user20EnglishLanguage = splitUser20Grades[3];
            String user20PhysicalTraining = splitUser20Grades[4];
            String user20GNPRIT = splitUser20Grades[5];
            String user20ElementsOfHigherMathematics = splitUser20Grades[6];
            String user20DiscreteMath = splitUser20Grades[7];
            String user20OperatingSystemsAndEnvironments = splitUser20Grades[8];
            String user20FundamentalsOfAlgorithmizationAndProgramming = splitUser20Grades[9];
            String user20ComputerNetwork = splitUser20Grades[10];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21Story = splitUser21Grades[2];
            String user21EnglishLanguage = splitUser21Grades[3];
            String user21PhysicalTraining = splitUser21Grades[4];
            String user21GNPRIT = splitUser21Grades[5];
            String user21ElementsOfHigherMathematics = splitUser21Grades[6];
            String user21DiscreteMath = splitUser21Grades[7];
            String user21OperatingSystemsAndEnvironments = splitUser21Grades[8];
            String user21FundamentalsOfAlgorithmizationAndProgramming = splitUser21Grades[9];
            String user21ComputerNetwork = splitUser21Grades[10];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22Story = splitUser22Grades[2];
            String user22EnglishLanguage = splitUser22Grades[3];
            String user22PhysicalTraining = splitUser22Grades[4];
            String user22GNPRIT = splitUser22Grades[5];
            String user22ElementsOfHigherMathematics = splitUser22Grades[6];
            String user22DiscreteMath = splitUser22Grades[7];
            String user22OperatingSystemsAndEnvironments = splitUser22Grades[8];
            String user22FundamentalsOfAlgorithmizationAndProgramming = splitUser22Grades[9];
            String user22ComputerNetwork = splitUser22Grades[10];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23Story = splitUser23Grades[2];
            String user23EnglishLanguage = splitUser23Grades[3];
            String user23PhysicalTraining = splitUser23Grades[4];
            String user23GNPRIT = splitUser23Grades[5];
            String user23ElementsOfHigherMathematics = splitUser23Grades[6];
            String user23DiscreteMath = splitUser23Grades[7];
            String user23OperatingSystemsAndEnvironments = splitUser23Grades[8];
            String user23FundamentalsOfAlgorithmizationAndProgramming = splitUser23Grades[9];
            String user23ComputerNetwork = splitUser23Grades[10];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24Story = splitUser24Grades[2];
            String user24EnglishLanguage = splitUser24Grades[3];
            String user24PhysicalTraining = splitUser24Grades[4];
            String user24GNPRIT = splitUser24Grades[5];
            String user24ElementsOfHigherMathematics = splitUser24Grades[6];
            String user24DiscreteMath = splitUser24Grades[7];
            String user24OperatingSystemsAndEnvironments = splitUser24Grades[8];
            String user24FundamentalsOfAlgorithmizationAndProgramming = splitUser24Grades[9];
            String user24ComputerNetwork = splitUser24Grades[10];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25Story = splitUser25Grades[2];
            String user25EnglishLanguage = splitUser25Grades[3];
            String user25PhysicalTraining = splitUser25Grades[4];
            String user25GNPRIT = splitUser25Grades[5];
            String user25ElementsOfHigherMathematics = splitUser25Grades[6];
            String user25DiscreteMath = splitUser25Grades[7];
            String user25OperatingSystemsAndEnvironments = splitUser25Grades[8];
            String user25FundamentalsOfAlgorithmizationAndProgramming = splitUser25Grades[9];
            String user25ComputerNetwork = splitUser25Grades[10];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26Story = splitUser26Grades[2];
            String user26EnglishLanguage = splitUser26Grades[3];
            String user26PhysicalTraining = splitUser26Grades[4];
            String user26GNPRIT = splitUser26Grades[5];
            String user26ElementsOfHigherMathematics = splitUser26Grades[6];
            String user26DiscreteMath = splitUser26Grades[7];
            String user26OperatingSystemsAndEnvironments = splitUser26Grades[8];
            String user26FundamentalsOfAlgorithmizationAndProgramming = splitUser26Grades[9];
            String user26ComputerNetwork = splitUser26Grades[10];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27Story = splitUser27Grades[2];
            String user27EnglishLanguage = splitUser27Grades[3];
            String user27PhysicalTraining = splitUser27Grades[4];
            String user27GNPRIT = splitUser27Grades[5];
            String user27ElementsOfHigherMathematics = splitUser27Grades[6];
            String user27DiscreteMath = splitUser27Grades[7];
            String user27OperatingSystemsAndEnvironments = splitUser27Grades[8];
            String user27FundamentalsOfAlgorithmizationAndProgramming = splitUser27Grades[9];
            String user27ComputerNetwork = splitUser27Grades[10];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28Story = splitUser28Grades[2];
            String user28EnglishLanguage = splitUser28Grades[3];
            String user28PhysicalTraining = splitUser28Grades[4];
            String user28GNPRIT = splitUser28Grades[5];
            String user28ElementsOfHigherMathematics = splitUser28Grades[6];
            String user28DiscreteMath = splitUser28Grades[7];
            String user28OperatingSystemsAndEnvironments = splitUser28Grades[8];
            String user28FundamentalsOfAlgorithmizationAndProgramming = splitUser28Grades[9];
            String user28ComputerNetwork = splitUser28Grades[10];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29Story = splitUser29Grades[2];
            String user29EnglishLanguage = splitUser29Grades[3];
            String user29PhysicalTraining = splitUser29Grades[4];
            String user29GNPRIT = splitUser29Grades[5];
            String user29ElementsOfHigherMathematics = splitUser29Grades[6];
            String user29DiscreteMath = splitUser29Grades[7];
            String user29OperatingSystemsAndEnvironments = splitUser29Grades[8];
            String user29FundamentalsOfAlgorithmizationAndProgramming = splitUser29Grades[9];
            String user29ComputerNetwork = splitUser29Grades[10];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30Story = splitUser30Grades[2];
            String user30EnglishLanguage = splitUser30Grades[3];
            String user30PhysicalTraining = splitUser30Grades[4];
            String user30GNPRIT = splitUser30Grades[5];
            String user30ElementsOfHigherMathematics = splitUser30Grades[6];
            String user30DiscreteMath = splitUser30Grades[7];
            String user30OperatingSystemsAndEnvironments = splitUser30Grades[8];
            String user30FundamentalsOfAlgorithmizationAndProgramming = splitUser30Grades[9];
            String user30ComputerNetwork = splitUser30Grades[10];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31Story = splitUser31Grades[2];
            String user31EnglishLanguage = splitUser31Grades[3];
            String user31PhysicalTraining = splitUser31Grades[4];
            String user31GNPRIT = splitUser31Grades[5];
            String user31ElementsOfHigherMathematics = splitUser31Grades[6];
            String user31DiscreteMath = splitUser31Grades[7];
            String user31OperatingSystemsAndEnvironments = splitUser31Grades[8];
            String user31FundamentalsOfAlgorithmizationAndProgramming = splitUser31Grades[9];
            String user31ComputerNetwork = splitUser31Grades[10];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32Story = splitUser32Grades[2];
            String user32EnglishLanguage = splitUser32Grades[3];
            String user32PhysicalTraining = splitUser32Grades[4];
            String user32GNPRIT = splitUser32Grades[5];
            String user32ElementsOfHigherMathematics = splitUser32Grades[6];
            String user32DiscreteMath = splitUser32Grades[7];
            String user32OperatingSystemsAndEnvironments = splitUser32Grades[8];
            String user32FundamentalsOfAlgorithmizationAndProgramming = splitUser32Grades[9];
            String user32ComputerNetwork = splitUser32Grades[10];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33Story = splitUser33Grades[2];
            String user33EnglishLanguage = splitUser33Grades[3];
            String user33PhysicalTraining = splitUser33Grades[4];
            String user33GNPRIT = splitUser33Grades[5];
            String user33ElementsOfHigherMathematics = splitUser33Grades[6];
            String user33DiscreteMath = splitUser33Grades[7];
            String user33OperatingSystemsAndEnvironments = splitUser33Grades[8];
            String user33FundamentalsOfAlgorithmizationAndProgramming = splitUser33Grades[9];
            String user33ComputerNetwork = splitUser33Grades[10];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34Story = splitUser34Grades[2];
            String user34EnglishLanguage = splitUser34Grades[3];
            String user34PhysicalTraining = splitUser34Grades[4];
            String user34GNPRIT = splitUser34Grades[5];
            String user34ElementsOfHigherMathematics = splitUser34Grades[6];
            String user34DiscreteMath = splitUser34Grades[7];
            String user34OperatingSystemsAndEnvironments = splitUser34Grades[8];
            String user34FundamentalsOfAlgorithmizationAndProgramming = splitUser34Grades[9];
            String user34ComputerNetwork = splitUser34Grades[10];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35Story = splitUser35Grades[2];
            String user35EnglishLanguage = splitUser35Grades[3];
            String user35PhysicalTraining = splitUser35Grades[4];
            String user35GNPRIT = splitUser35Grades[5];
            String user35ElementsOfHigherMathematics = splitUser35Grades[6];
            String user35DiscreteMath = splitUser35Grades[7];
            String user35OperatingSystemsAndEnvironments = splitUser35Grades[8];
            String user35FundamentalsOfAlgorithmizationAndProgramming = splitUser35Grades[9];
            String user35ComputerNetwork = splitUser35Grades[10];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36Story = splitUser36Grades[2];
            String user36EnglishLanguage = splitUser36Grades[3];
            String user36PhysicalTraining = splitUser36Grades[4];
            String user36GNPRIT = splitUser36Grades[5];
            String user36ElementsOfHigherMathematics = splitUser36Grades[6];
            String user36DiscreteMath = splitUser36Grades[7];
            String user36OperatingSystemsAndEnvironments = splitUser36Grades[8];
            String user36FundamentalsOfAlgorithmizationAndProgramming = splitUser36Grades[9];
            String user36ComputerNetwork = splitUser36Grades[10];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37Story = splitUser37Grades[2];
            String user37EnglishLanguage = splitUser37Grades[3];
            String user37PhysicalTraining = splitUser37Grades[4];
            String user37GNPRIT = splitUser37Grades[5];
            String user37ElementsOfHigherMathematics = splitUser37Grades[6];
            String user37DiscreteMath = splitUser37Grades[7];
            String user37OperatingSystemsAndEnvironments = splitUser37Grades[8];
            String user37FundamentalsOfAlgorithmizationAndProgramming = splitUser37Grades[9];
            String user37ComputerNetwork = splitUser37Grades[10];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38Story = splitUser38Grades[2];
            String user38EnglishLanguage = splitUser38Grades[3];
            String user38PhysicalTraining = splitUser38Grades[4];
            String user38GNPRIT = splitUser38Grades[5];
            String user38ElementsOfHigherMathematics = splitUser38Grades[6];
            String user38DiscreteMath = splitUser38Grades[7];
            String user38OperatingSystemsAndEnvironments = splitUser38Grades[8];
            String user38FundamentalsOfAlgorithmizationAndProgramming = splitUser38Grades[9];
            String user38ComputerNetwork = splitUser38Grades[10];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39Story = splitUser39Grades[2];
            String user39EnglishLanguage = splitUser39Grades[3];
            String user39PhysicalTraining = splitUser39Grades[4];
            String user39GNPRIT = splitUser39Grades[5];
            String user39ElementsOfHigherMathematics = splitUser39Grades[6];
            String user39DiscreteMath = splitUser39Grades[7];
            String user39OperatingSystemsAndEnvironments = splitUser39Grades[8];
            String user39FundamentalsOfAlgorithmizationAndProgramming = splitUser39Grades[9];
            String user39ComputerNetwork = splitUser39Grades[10];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40Story = splitUser40Grades[2];
            String user40EnglishLanguage = splitUser40Grades[3];
            String user40PhysicalTraining = splitUser40Grades[4];
            String user40GNPRIT = splitUser40Grades[5];
            String user40ElementsOfHigherMathematics = splitUser40Grades[6];
            String user40DiscreteMath = splitUser40Grades[7];
            String user40OperatingSystemsAndEnvironments = splitUser40Grades[8];
            String user40FundamentalsOfAlgorithmizationAndProgramming = splitUser40Grades[9];
            String user40ComputerNetwork = splitUser40Grades[10];


            ArrayList<Grade_IS_1_1Course2Semester1> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course2Semester1(user1Id, user1Username, user1Story, user1EnglishLanguage, user1PhysicalTraining, user1GNPRIT, user1ElementsOfHigherMathematics, user1DiscreteMath, user1OperatingSystemsAndEnvironments, user1FundamentalsOfAlgorithmizationAndProgramming, user1ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user2Id, user2Username, user2Story, user2EnglishLanguage, user2PhysicalTraining, user2GNPRIT, user2ElementsOfHigherMathematics, user2DiscreteMath, user2OperatingSystemsAndEnvironments, user2FundamentalsOfAlgorithmizationAndProgramming, user2ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user3Id, user3Username, user3Story, user3EnglishLanguage, user3PhysicalTraining, user3GNPRIT, user3ElementsOfHigherMathematics, user3DiscreteMath, user3OperatingSystemsAndEnvironments, user3FundamentalsOfAlgorithmizationAndProgramming, user3ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user4Id, user4Username, user4Story, user4EnglishLanguage, user4PhysicalTraining, user4GNPRIT, user4ElementsOfHigherMathematics, user4DiscreteMath, user4OperatingSystemsAndEnvironments, user4FundamentalsOfAlgorithmizationAndProgramming, user4ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user5Id, user5Username, user5Story, user5EnglishLanguage, user5PhysicalTraining, user5GNPRIT, user5ElementsOfHigherMathematics, user5DiscreteMath, user5OperatingSystemsAndEnvironments, user5FundamentalsOfAlgorithmizationAndProgramming, user5ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user6Id, user6Username, user6Story, user6EnglishLanguage, user6PhysicalTraining, user6GNPRIT, user6ElementsOfHigherMathematics, user6DiscreteMath, user6OperatingSystemsAndEnvironments, user6FundamentalsOfAlgorithmizationAndProgramming, user6ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user7Id, user7Username, user7Story, user7EnglishLanguage, user7PhysicalTraining, user7GNPRIT, user7ElementsOfHigherMathematics, user7DiscreteMath, user7OperatingSystemsAndEnvironments, user7FundamentalsOfAlgorithmizationAndProgramming, user7ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user8Id, user8Username, user8Story, user8EnglishLanguage, user8PhysicalTraining, user8GNPRIT, user8ElementsOfHigherMathematics, user8DiscreteMath, user8OperatingSystemsAndEnvironments, user8FundamentalsOfAlgorithmizationAndProgramming, user8ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user9Id, user9Username, user9Story, user9EnglishLanguage, user9PhysicalTraining, user9GNPRIT, user9ElementsOfHigherMathematics, user9DiscreteMath, user9OperatingSystemsAndEnvironments, user9FundamentalsOfAlgorithmizationAndProgramming, user9ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user10Id, user10Username, user10Story, user10EnglishLanguage, user10PhysicalTraining, user10GNPRIT, user10ElementsOfHigherMathematics, user10DiscreteMath, user10OperatingSystemsAndEnvironments, user10FundamentalsOfAlgorithmizationAndProgramming, user10ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user11Id, user11Username, user11Story, user11EnglishLanguage, user11PhysicalTraining, user11GNPRIT, user11ElementsOfHigherMathematics, user11DiscreteMath, user11OperatingSystemsAndEnvironments, user11FundamentalsOfAlgorithmizationAndProgramming, user11ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user12Id, user12Username, user12Story, user12EnglishLanguage, user12PhysicalTraining, user12GNPRIT, user12ElementsOfHigherMathematics, user12DiscreteMath, user12OperatingSystemsAndEnvironments, user12FundamentalsOfAlgorithmizationAndProgramming, user12ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user13Id, user13Username, user13Story, user13EnglishLanguage, user13PhysicalTraining, user13GNPRIT, user13ElementsOfHigherMathematics, user13DiscreteMath, user13OperatingSystemsAndEnvironments, user13FundamentalsOfAlgorithmizationAndProgramming, user13ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user14Id, user14Username, user14Story, user14EnglishLanguage, user14PhysicalTraining, user14GNPRIT, user14ElementsOfHigherMathematics, user14DiscreteMath, user14OperatingSystemsAndEnvironments, user14FundamentalsOfAlgorithmizationAndProgramming, user14ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user15Id, user15Username, user15Story, user15EnglishLanguage, user15PhysicalTraining, user15GNPRIT, user15ElementsOfHigherMathematics, user15DiscreteMath, user15OperatingSystemsAndEnvironments, user15FundamentalsOfAlgorithmizationAndProgramming, user15ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user16Id, user16Username, user16Story, user16EnglishLanguage, user16PhysicalTraining, user16GNPRIT, user16ElementsOfHigherMathematics, user16DiscreteMath, user16OperatingSystemsAndEnvironments, user16FundamentalsOfAlgorithmizationAndProgramming, user16ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user17Id, user17Username, user17Story, user17EnglishLanguage, user17PhysicalTraining, user17GNPRIT, user17ElementsOfHigherMathematics, user17DiscreteMath, user17OperatingSystemsAndEnvironments, user17FundamentalsOfAlgorithmizationAndProgramming, user17ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user18Id, user18Username, user18Story, user18EnglishLanguage, user18PhysicalTraining, user18GNPRIT, user18ElementsOfHigherMathematics, user18DiscreteMath, user18OperatingSystemsAndEnvironments, user18FundamentalsOfAlgorithmizationAndProgramming, user18ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user19Id, user19Username, user19Story, user19EnglishLanguage, user19PhysicalTraining, user19GNPRIT, user19ElementsOfHigherMathematics, user19DiscreteMath, user19OperatingSystemsAndEnvironments, user19FundamentalsOfAlgorithmizationAndProgramming, user19ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user20Id, user20Username, user20Story, user20EnglishLanguage, user20PhysicalTraining, user20GNPRIT, user20ElementsOfHigherMathematics, user20DiscreteMath, user20OperatingSystemsAndEnvironments, user20FundamentalsOfAlgorithmizationAndProgramming, user20ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user21Id, user21Username, user21Story, user21EnglishLanguage, user21PhysicalTraining, user21GNPRIT, user21ElementsOfHigherMathematics, user21DiscreteMath, user21OperatingSystemsAndEnvironments, user21FundamentalsOfAlgorithmizationAndProgramming, user21ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user22Id, user22Username, user22Story, user22EnglishLanguage, user22PhysicalTraining, user22GNPRIT, user22ElementsOfHigherMathematics, user22DiscreteMath, user22OperatingSystemsAndEnvironments, user22FundamentalsOfAlgorithmizationAndProgramming, user22ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user23Id, user23Username, user23Story, user23EnglishLanguage, user23PhysicalTraining, user23GNPRIT, user23ElementsOfHigherMathematics, user23DiscreteMath, user23OperatingSystemsAndEnvironments, user23FundamentalsOfAlgorithmizationAndProgramming, user23ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user24Id, user24Username, user24Story, user24EnglishLanguage, user24PhysicalTraining, user24GNPRIT, user24ElementsOfHigherMathematics, user24DiscreteMath, user24OperatingSystemsAndEnvironments, user24FundamentalsOfAlgorithmizationAndProgramming, user24ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user25Id, user25Username, user25Story, user25EnglishLanguage, user25PhysicalTraining, user25GNPRIT, user25ElementsOfHigherMathematics, user25DiscreteMath, user25OperatingSystemsAndEnvironments, user25FundamentalsOfAlgorithmizationAndProgramming, user25ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user26Id, user26Username, user26Story, user26EnglishLanguage, user26PhysicalTraining, user26GNPRIT, user26ElementsOfHigherMathematics, user26DiscreteMath, user26OperatingSystemsAndEnvironments, user26FundamentalsOfAlgorithmizationAndProgramming, user26ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user27Id, user27Username, user27Story, user27EnglishLanguage, user27PhysicalTraining, user27GNPRIT, user27ElementsOfHigherMathematics, user27DiscreteMath, user27OperatingSystemsAndEnvironments, user27FundamentalsOfAlgorithmizationAndProgramming, user27ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user28Id, user28Username, user28Story, user28EnglishLanguage, user28PhysicalTraining, user28GNPRIT, user28ElementsOfHigherMathematics, user28DiscreteMath, user28OperatingSystemsAndEnvironments, user28FundamentalsOfAlgorithmizationAndProgramming, user28ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user29Id, user29Username, user29Story, user29EnglishLanguage, user29PhysicalTraining, user29GNPRIT, user29ElementsOfHigherMathematics, user29DiscreteMath, user29OperatingSystemsAndEnvironments, user29FundamentalsOfAlgorithmizationAndProgramming, user29ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user30Id, user30Username, user30Story, user30EnglishLanguage, user30PhysicalTraining, user30GNPRIT, user30ElementsOfHigherMathematics, user30DiscreteMath, user30OperatingSystemsAndEnvironments, user30FundamentalsOfAlgorithmizationAndProgramming, user30ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user31Id, user31Username, user31Story, user31EnglishLanguage, user31PhysicalTraining, user31GNPRIT, user31ElementsOfHigherMathematics, user31DiscreteMath, user31OperatingSystemsAndEnvironments, user31FundamentalsOfAlgorithmizationAndProgramming, user31ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user32Id, user32Username, user32Story, user32EnglishLanguage, user32PhysicalTraining, user32GNPRIT, user32ElementsOfHigherMathematics, user32DiscreteMath, user32OperatingSystemsAndEnvironments, user32FundamentalsOfAlgorithmizationAndProgramming, user32ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user33Id, user33Username, user33Story, user33EnglishLanguage, user33PhysicalTraining, user33GNPRIT, user33ElementsOfHigherMathematics, user33DiscreteMath, user33OperatingSystemsAndEnvironments, user33FundamentalsOfAlgorithmizationAndProgramming, user33ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user34Id, user34Username, user34Story, user34EnglishLanguage, user34PhysicalTraining, user34GNPRIT, user34ElementsOfHigherMathematics, user34DiscreteMath, user34OperatingSystemsAndEnvironments, user34FundamentalsOfAlgorithmizationAndProgramming, user34ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user35Id, user35Username, user35Story, user35EnglishLanguage, user35PhysicalTraining, user35GNPRIT, user35ElementsOfHigherMathematics, user35DiscreteMath, user35OperatingSystemsAndEnvironments, user35FundamentalsOfAlgorithmizationAndProgramming, user35ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user36Id, user36Username, user36Story, user36EnglishLanguage, user36PhysicalTraining, user36GNPRIT, user36ElementsOfHigherMathematics, user36DiscreteMath, user36OperatingSystemsAndEnvironments, user36FundamentalsOfAlgorithmizationAndProgramming, user36ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user37Id, user37Username, user37Story, user37EnglishLanguage, user37PhysicalTraining, user37GNPRIT, user37ElementsOfHigherMathematics, user37DiscreteMath, user37OperatingSystemsAndEnvironments, user37FundamentalsOfAlgorithmizationAndProgramming, user37ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user38Id, user38Username, user38Story, user38EnglishLanguage, user38PhysicalTraining, user38GNPRIT, user38ElementsOfHigherMathematics, user38DiscreteMath, user38OperatingSystemsAndEnvironments, user38FundamentalsOfAlgorithmizationAndProgramming, user38ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user39Id, user39Username, user39Story, user39EnglishLanguage, user39PhysicalTraining, user39GNPRIT, user39ElementsOfHigherMathematics, user39DiscreteMath, user39OperatingSystemsAndEnvironments, user39FundamentalsOfAlgorithmizationAndProgramming, user39ComputerNetwork, month));
            addArr.add(new Grade_IS_1_1Course2Semester1(user40Id, user40Username, user40Story, user40EnglishLanguage, user40PhysicalTraining, user40GNPRIT, user40ElementsOfHigherMathematics, user40DiscreteMath, user40OperatingSystemsAndEnvironments, user40FundamentalsOfAlgorithmizationAndProgramming, user40ComputerNetwork, month));


            if (gradeIs11Course2Semester1Repository.findAll().isEmpty()) {
                gradeIs11Course2Semester1Repository.saveAll(addArr);
            }
            if (!gradeIs11Course2Semester1Repository.existsByMonth(month)) {
                gradeIs11Course2Semester1Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course2Semester1> listAllGrade = gradeIs11Course2Semester1Repository.findAll();
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User1 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User2 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User3 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User4 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User5 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User6 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User7 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User8 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User9 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User10 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User11 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User12 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User13 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User14 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User15 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User16 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User17 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User18 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User19 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User20 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User21 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User22 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User23 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User24 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User25 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User26 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User27 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User28 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User29 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User30 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User31 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User32 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User33 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User34 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User35 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User36 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User37 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User38 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User39 = null;
            Grade_IS_1_1Course2Semester1 grade_is_1_1Course2Semester1User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course2Semester1User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_is_1_1Course2Semester1User1.setUsername(user1Username);
            grade_is_1_1Course2Semester1User1.setGradeStory(user1Story);
            grade_is_1_1Course2Semester1User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_is_1_1Course2Semester1User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_is_1_1Course2Semester1User1.setGradeGNPRIT(user1GNPRIT);
            grade_is_1_1Course2Semester1User1.setGradeElementsOfHigherMathematics(user1ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User1.setGradeDiscreteMath(user1DiscreteMath);
            grade_is_1_1Course2Semester1User1.setGradeOperatingSystemsAndEnvironments(user1OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User1.setGradeFundamentalsOfAlgorithmizationAndProgramming(user1FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User1.setGradeComputerNetwork(user1ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User1);

            //user2
            grade_is_1_1Course2Semester1User2.setUsername(user2Username);
            grade_is_1_1Course2Semester1User2.setGradeStory(user2Story);
            grade_is_1_1Course2Semester1User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_is_1_1Course2Semester1User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_is_1_1Course2Semester1User2.setGradeGNPRIT(user2GNPRIT);
            grade_is_1_1Course2Semester1User2.setGradeElementsOfHigherMathematics(user2ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User2.setGradeDiscreteMath(user2DiscreteMath);
            grade_is_1_1Course2Semester1User2.setGradeOperatingSystemsAndEnvironments(user2OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User2.setGradeFundamentalsOfAlgorithmizationAndProgramming(user2FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User2.setGradeComputerNetwork(user2ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User2);

            //            //user3
            grade_is_1_1Course2Semester1User3.setUsername(user3Username);
            grade_is_1_1Course2Semester1User3.setGradeStory(user3Story);
            grade_is_1_1Course2Semester1User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_is_1_1Course2Semester1User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_is_1_1Course2Semester1User3.setGradeGNPRIT(user3GNPRIT);
            grade_is_1_1Course2Semester1User3.setGradeElementsOfHigherMathematics(user3ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User3.setGradeDiscreteMath(user3DiscreteMath);
            grade_is_1_1Course2Semester1User3.setGradeOperatingSystemsAndEnvironments(user3OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User3.setGradeFundamentalsOfAlgorithmizationAndProgramming(user3FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User3.setGradeComputerNetwork(user3ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User3);

            //            //user4
            grade_is_1_1Course2Semester1User4.setUsername(user4Username);
            grade_is_1_1Course2Semester1User4.setGradeStory(user4Story);
            grade_is_1_1Course2Semester1User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_is_1_1Course2Semester1User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_is_1_1Course2Semester1User4.setGradeGNPRIT(user4GNPRIT);
            grade_is_1_1Course2Semester1User4.setGradeElementsOfHigherMathematics(user4ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User4.setGradeDiscreteMath(user4DiscreteMath);
            grade_is_1_1Course2Semester1User4.setGradeOperatingSystemsAndEnvironments(user4OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User4.setGradeFundamentalsOfAlgorithmizationAndProgramming(user4FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User4.setGradeComputerNetwork(user4ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User4);

//            //user5
            grade_is_1_1Course2Semester1User5.setUsername(user5Username);
            grade_is_1_1Course2Semester1User5.setGradeStory(user5Story);
            grade_is_1_1Course2Semester1User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_is_1_1Course2Semester1User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_is_1_1Course2Semester1User5.setGradeGNPRIT(user5GNPRIT);
            grade_is_1_1Course2Semester1User5.setGradeElementsOfHigherMathematics(user5ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User5.setGradeDiscreteMath(user5DiscreteMath);
            grade_is_1_1Course2Semester1User5.setGradeOperatingSystemsAndEnvironments(user5OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User5.setGradeFundamentalsOfAlgorithmizationAndProgramming(user5FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User5.setGradeComputerNetwork(user5ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User5);

            //            //user6
            grade_is_1_1Course2Semester1User6.setUsername(user6Username);
            grade_is_1_1Course2Semester1User6.setGradeStory(user6Story);
            grade_is_1_1Course2Semester1User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_is_1_1Course2Semester1User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_is_1_1Course2Semester1User6.setGradeGNPRIT(user6GNPRIT);
            grade_is_1_1Course2Semester1User6.setGradeElementsOfHigherMathematics(user6ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User6.setGradeDiscreteMath(user6DiscreteMath);
            grade_is_1_1Course2Semester1User6.setGradeOperatingSystemsAndEnvironments(user6OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User6.setGradeFundamentalsOfAlgorithmizationAndProgramming(user6FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User6.setGradeComputerNetwork(user6ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User6);

            //            //user7
            grade_is_1_1Course2Semester1User7.setUsername(user7Username);
            grade_is_1_1Course2Semester1User7.setGradeStory(user7Story);
            grade_is_1_1Course2Semester1User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_is_1_1Course2Semester1User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_is_1_1Course2Semester1User7.setGradeGNPRIT(user7GNPRIT);
            grade_is_1_1Course2Semester1User7.setGradeElementsOfHigherMathematics(user7ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User7.setGradeDiscreteMath(user7DiscreteMath);
            grade_is_1_1Course2Semester1User7.setGradeOperatingSystemsAndEnvironments(user7OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User7.setGradeFundamentalsOfAlgorithmizationAndProgramming(user7FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User7.setGradeComputerNetwork(user7ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User7);

            //            //user8
            grade_is_1_1Course2Semester1User8.setUsername(user8Username);
            grade_is_1_1Course2Semester1User8.setGradeStory(user8Story);
            grade_is_1_1Course2Semester1User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_is_1_1Course2Semester1User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_is_1_1Course2Semester1User8.setGradeGNPRIT(user8GNPRIT);
            grade_is_1_1Course2Semester1User8.setGradeElementsOfHigherMathematics(user8ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User8.setGradeDiscreteMath(user8DiscreteMath);
            grade_is_1_1Course2Semester1User8.setGradeOperatingSystemsAndEnvironments(user8OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User8.setGradeFundamentalsOfAlgorithmizationAndProgramming(user8FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User8.setGradeComputerNetwork(user8ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User8);

            //            //user9
            grade_is_1_1Course2Semester1User9.setUsername(user9Username);
            grade_is_1_1Course2Semester1User9.setGradeStory(user9Story);
            grade_is_1_1Course2Semester1User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_is_1_1Course2Semester1User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_is_1_1Course2Semester1User9.setGradeGNPRIT(user9GNPRIT);
            grade_is_1_1Course2Semester1User9.setGradeElementsOfHigherMathematics(user9ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User9.setGradeDiscreteMath(user9DiscreteMath);
            grade_is_1_1Course2Semester1User9.setGradeOperatingSystemsAndEnvironments(user9OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User9.setGradeFundamentalsOfAlgorithmizationAndProgramming(user9FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User9.setGradeComputerNetwork(user9ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User9);


            //            //user10
            grade_is_1_1Course2Semester1User10.setUsername(user10Username);
            grade_is_1_1Course2Semester1User10.setGradeStory(user10Story);
            grade_is_1_1Course2Semester1User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_is_1_1Course2Semester1User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_is_1_1Course2Semester1User10.setGradeGNPRIT(user10GNPRIT);
            grade_is_1_1Course2Semester1User10.setGradeElementsOfHigherMathematics(user10ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User10.setGradeDiscreteMath(user10DiscreteMath);
            grade_is_1_1Course2Semester1User10.setGradeOperatingSystemsAndEnvironments(user10OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User10.setGradeFundamentalsOfAlgorithmizationAndProgramming(user10FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User10.setGradeComputerNetwork(user10ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User10);

            //            //user11
            grade_is_1_1Course2Semester1User11.setUsername(user11Username);
            grade_is_1_1Course2Semester1User11.setGradeStory(user11Story);
            grade_is_1_1Course2Semester1User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_is_1_1Course2Semester1User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_is_1_1Course2Semester1User11.setGradeGNPRIT(user11GNPRIT);
            grade_is_1_1Course2Semester1User11.setGradeElementsOfHigherMathematics(user11ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User11.setGradeDiscreteMath(user11DiscreteMath);
            grade_is_1_1Course2Semester1User11.setGradeOperatingSystemsAndEnvironments(user11OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User11.setGradeFundamentalsOfAlgorithmizationAndProgramming(user11FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User11.setGradeComputerNetwork(user11ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User11);


            //            //user12
            grade_is_1_1Course2Semester1User12.setUsername(user12Username);
            grade_is_1_1Course2Semester1User12.setGradeStory(user12Story);
            grade_is_1_1Course2Semester1User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_is_1_1Course2Semester1User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_is_1_1Course2Semester1User12.setGradeGNPRIT(user12GNPRIT);
            grade_is_1_1Course2Semester1User12.setGradeElementsOfHigherMathematics(user12ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User12.setGradeDiscreteMath(user12DiscreteMath);
            grade_is_1_1Course2Semester1User12.setGradeOperatingSystemsAndEnvironments(user12OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User12.setGradeFundamentalsOfAlgorithmizationAndProgramming(user12FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User12.setGradeComputerNetwork(user12ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User12);

            //            //user13
            grade_is_1_1Course2Semester1User13.setUsername(user13Username);
            grade_is_1_1Course2Semester1User13.setGradeStory(user13Story);
            grade_is_1_1Course2Semester1User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_is_1_1Course2Semester1User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_is_1_1Course2Semester1User13.setGradeGNPRIT(user13GNPRIT);
            grade_is_1_1Course2Semester1User13.setGradeElementsOfHigherMathematics(user13ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User13.setGradeDiscreteMath(user13DiscreteMath);
            grade_is_1_1Course2Semester1User13.setGradeOperatingSystemsAndEnvironments(user13OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User13.setGradeFundamentalsOfAlgorithmizationAndProgramming(user13FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User13.setGradeComputerNetwork(user13ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User13);

            //            //user14
            grade_is_1_1Course2Semester1User14.setUsername(user14Username);
            grade_is_1_1Course2Semester1User14.setGradeStory(user14Story);
            grade_is_1_1Course2Semester1User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_is_1_1Course2Semester1User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_is_1_1Course2Semester1User14.setGradeGNPRIT(user14GNPRIT);
            grade_is_1_1Course2Semester1User14.setGradeElementsOfHigherMathematics(user14ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User14.setGradeDiscreteMath(user14DiscreteMath);
            grade_is_1_1Course2Semester1User14.setGradeOperatingSystemsAndEnvironments(user14OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User14.setGradeFundamentalsOfAlgorithmizationAndProgramming(user14FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User14.setGradeComputerNetwork(user14ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User14);

            //            //user15
            grade_is_1_1Course2Semester1User15.setUsername(user15Username);
            grade_is_1_1Course2Semester1User15.setGradeStory(user15Story);
            grade_is_1_1Course2Semester1User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_is_1_1Course2Semester1User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_is_1_1Course2Semester1User15.setGradeGNPRIT(user15GNPRIT);
            grade_is_1_1Course2Semester1User15.setGradeElementsOfHigherMathematics(user15ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User15.setGradeDiscreteMath(user15DiscreteMath);
            grade_is_1_1Course2Semester1User15.setGradeOperatingSystemsAndEnvironments(user15OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User15.setGradeFundamentalsOfAlgorithmizationAndProgramming(user15FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User15.setGradeComputerNetwork(user15ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User15);

            //           //user16

            grade_is_1_1Course2Semester1User16.setUsername(user16Username);
            grade_is_1_1Course2Semester1User16.setGradeStory(user16Story);
            grade_is_1_1Course2Semester1User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_is_1_1Course2Semester1User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_is_1_1Course2Semester1User16.setGradeGNPRIT(user16GNPRIT);
            grade_is_1_1Course2Semester1User16.setGradeElementsOfHigherMathematics(user16ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User16.setGradeDiscreteMath(user16DiscreteMath);
            grade_is_1_1Course2Semester1User16.setGradeOperatingSystemsAndEnvironments(user16OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User16.setGradeFundamentalsOfAlgorithmizationAndProgramming(user16FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User16.setGradeComputerNetwork(user16ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User16);


            //            //user17

            grade_is_1_1Course2Semester1User17.setUsername(user17Username);
            grade_is_1_1Course2Semester1User17.setGradeStory(user17Story);
            grade_is_1_1Course2Semester1User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_is_1_1Course2Semester1User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_is_1_1Course2Semester1User17.setGradeGNPRIT(user17GNPRIT);
            grade_is_1_1Course2Semester1User17.setGradeElementsOfHigherMathematics(user17ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User17.setGradeDiscreteMath(user17DiscreteMath);
            grade_is_1_1Course2Semester1User17.setGradeOperatingSystemsAndEnvironments(user17OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User17.setGradeFundamentalsOfAlgorithmizationAndProgramming(user17FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User17.setGradeComputerNetwork(user17ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User17);

            //            //user18

            grade_is_1_1Course2Semester1User18.setUsername(user18Username);
            grade_is_1_1Course2Semester1User18.setGradeStory(user18Story);
            grade_is_1_1Course2Semester1User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_is_1_1Course2Semester1User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_is_1_1Course2Semester1User18.setGradeGNPRIT(user18GNPRIT);
            grade_is_1_1Course2Semester1User18.setGradeElementsOfHigherMathematics(user18ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User18.setGradeDiscreteMath(user18DiscreteMath);
            grade_is_1_1Course2Semester1User18.setGradeOperatingSystemsAndEnvironments(user18OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User18.setGradeFundamentalsOfAlgorithmizationAndProgramming(user18FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User18.setGradeComputerNetwork(user18ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User18);


            //            //user19

            grade_is_1_1Course2Semester1User19.setUsername(user19Username);
            grade_is_1_1Course2Semester1User19.setGradeStory(user19Story);
            grade_is_1_1Course2Semester1User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_is_1_1Course2Semester1User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_is_1_1Course2Semester1User19.setGradeGNPRIT(user19GNPRIT);
            grade_is_1_1Course2Semester1User19.setGradeElementsOfHigherMathematics(user19ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User19.setGradeDiscreteMath(user19DiscreteMath);
            grade_is_1_1Course2Semester1User19.setGradeOperatingSystemsAndEnvironments(user19OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User19.setGradeFundamentalsOfAlgorithmizationAndProgramming(user19FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User19.setGradeComputerNetwork(user19ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User19);

            //            //user20

            grade_is_1_1Course2Semester1User20.setUsername(user20Username);
            grade_is_1_1Course2Semester1User20.setGradeStory(user20Story);
            grade_is_1_1Course2Semester1User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_is_1_1Course2Semester1User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_is_1_1Course2Semester1User20.setGradeGNPRIT(user20GNPRIT);
            grade_is_1_1Course2Semester1User20.setGradeElementsOfHigherMathematics(user20ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User20.setGradeDiscreteMath(user20DiscreteMath);
            grade_is_1_1Course2Semester1User20.setGradeOperatingSystemsAndEnvironments(user20OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User20.setGradeFundamentalsOfAlgorithmizationAndProgramming(user20FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User20.setGradeComputerNetwork(user20ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User20);

            //            //user21

            grade_is_1_1Course2Semester1User21.setUsername(user21Username);
            grade_is_1_1Course2Semester1User21.setGradeStory(user21Story);
            grade_is_1_1Course2Semester1User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_is_1_1Course2Semester1User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_is_1_1Course2Semester1User21.setGradeGNPRIT(user21GNPRIT);
            grade_is_1_1Course2Semester1User21.setGradeElementsOfHigherMathematics(user21ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User21.setGradeDiscreteMath(user21DiscreteMath);
            grade_is_1_1Course2Semester1User21.setGradeOperatingSystemsAndEnvironments(user21OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User21.setGradeFundamentalsOfAlgorithmizationAndProgramming(user21FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User21.setGradeComputerNetwork(user21ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User21);

            //            //user22

            grade_is_1_1Course2Semester1User22.setUsername(user22Username);
            grade_is_1_1Course2Semester1User22.setGradeStory(user22Story);
            grade_is_1_1Course2Semester1User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_is_1_1Course2Semester1User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_is_1_1Course2Semester1User22.setGradeGNPRIT(user22GNPRIT);
            grade_is_1_1Course2Semester1User22.setGradeElementsOfHigherMathematics(user22ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User22.setGradeDiscreteMath(user22DiscreteMath);
            grade_is_1_1Course2Semester1User22.setGradeOperatingSystemsAndEnvironments(user22OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User22.setGradeFundamentalsOfAlgorithmizationAndProgramming(user22FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User22.setGradeComputerNetwork(user22ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User22);

            //            //user23

            grade_is_1_1Course2Semester1User23.setUsername(user23Username);
            grade_is_1_1Course2Semester1User23.setGradeStory(user23Story);
            grade_is_1_1Course2Semester1User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_is_1_1Course2Semester1User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_is_1_1Course2Semester1User23.setGradeGNPRIT(user23GNPRIT);
            grade_is_1_1Course2Semester1User23.setGradeElementsOfHigherMathematics(user23ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User23.setGradeDiscreteMath(user23DiscreteMath);
            grade_is_1_1Course2Semester1User23.setGradeOperatingSystemsAndEnvironments(user23OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User23.setGradeFundamentalsOfAlgorithmizationAndProgramming(user23FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User23.setGradeComputerNetwork(user23ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User23);

            //            //user24

            grade_is_1_1Course2Semester1User24.setUsername(user24Username);
            grade_is_1_1Course2Semester1User24.setGradeStory(user24Story);
            grade_is_1_1Course2Semester1User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_is_1_1Course2Semester1User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_is_1_1Course2Semester1User24.setGradeGNPRIT(user24GNPRIT);
            grade_is_1_1Course2Semester1User24.setGradeElementsOfHigherMathematics(user24ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User24.setGradeDiscreteMath(user24DiscreteMath);
            grade_is_1_1Course2Semester1User24.setGradeOperatingSystemsAndEnvironments(user24OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User24.setGradeFundamentalsOfAlgorithmizationAndProgramming(user24FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User24.setGradeComputerNetwork(user24ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User24);

            //            //user25

            grade_is_1_1Course2Semester1User25.setUsername(user25Username);
            grade_is_1_1Course2Semester1User25.setGradeStory(user25Story);
            grade_is_1_1Course2Semester1User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_is_1_1Course2Semester1User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_is_1_1Course2Semester1User25.setGradeGNPRIT(user25GNPRIT);
            grade_is_1_1Course2Semester1User25.setGradeElementsOfHigherMathematics(user25ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User25.setGradeDiscreteMath(user25DiscreteMath);
            grade_is_1_1Course2Semester1User25.setGradeOperatingSystemsAndEnvironments(user25OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User25.setGradeFundamentalsOfAlgorithmizationAndProgramming(user25FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User25.setGradeComputerNetwork(user25ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User25);

            //            //user26

            grade_is_1_1Course2Semester1User26.setUsername(user26Username);
            grade_is_1_1Course2Semester1User26.setGradeStory(user26Story);
            grade_is_1_1Course2Semester1User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_is_1_1Course2Semester1User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_is_1_1Course2Semester1User26.setGradeGNPRIT(user26GNPRIT);
            grade_is_1_1Course2Semester1User26.setGradeElementsOfHigherMathematics(user26ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User26.setGradeDiscreteMath(user26DiscreteMath);
            grade_is_1_1Course2Semester1User26.setGradeOperatingSystemsAndEnvironments(user26OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User26.setGradeFundamentalsOfAlgorithmizationAndProgramming(user26FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User26.setGradeComputerNetwork(user26ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User26);

            //            //user27

            grade_is_1_1Course2Semester1User27.setUsername(user27Username);
            grade_is_1_1Course2Semester1User27.setGradeStory(user27Story);
            grade_is_1_1Course2Semester1User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_is_1_1Course2Semester1User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_is_1_1Course2Semester1User27.setGradeGNPRIT(user27GNPRIT);
            grade_is_1_1Course2Semester1User27.setGradeElementsOfHigherMathematics(user27ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User27.setGradeDiscreteMath(user27DiscreteMath);
            grade_is_1_1Course2Semester1User27.setGradeOperatingSystemsAndEnvironments(user27OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User27.setGradeFundamentalsOfAlgorithmizationAndProgramming(user27FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User27.setGradeComputerNetwork(user27ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User27);

            //            //user28

            grade_is_1_1Course2Semester1User28.setUsername(user28Username);
            grade_is_1_1Course2Semester1User28.setGradeStory(user28Story);
            grade_is_1_1Course2Semester1User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_is_1_1Course2Semester1User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_is_1_1Course2Semester1User28.setGradeGNPRIT(user28GNPRIT);
            grade_is_1_1Course2Semester1User28.setGradeElementsOfHigherMathematics(user28ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User28.setGradeDiscreteMath(user28DiscreteMath);
            grade_is_1_1Course2Semester1User28.setGradeOperatingSystemsAndEnvironments(user28OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User28.setGradeFundamentalsOfAlgorithmizationAndProgramming(user28FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User28.setGradeComputerNetwork(user28ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User28);

            //            //user29

            grade_is_1_1Course2Semester1User29.setUsername(user29Username);
            grade_is_1_1Course2Semester1User29.setGradeStory(user29Story);
            grade_is_1_1Course2Semester1User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_is_1_1Course2Semester1User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_is_1_1Course2Semester1User29.setGradeGNPRIT(user29GNPRIT);
            grade_is_1_1Course2Semester1User29.setGradeElementsOfHigherMathematics(user29ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User29.setGradeDiscreteMath(user29DiscreteMath);
            grade_is_1_1Course2Semester1User29.setGradeOperatingSystemsAndEnvironments(user29OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User29.setGradeFundamentalsOfAlgorithmizationAndProgramming(user29FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User29.setGradeComputerNetwork(user29ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User29);

            //            //user30

            grade_is_1_1Course2Semester1User30.setUsername(user30Username);
            grade_is_1_1Course2Semester1User30.setGradeStory(user30Story);
            grade_is_1_1Course2Semester1User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_is_1_1Course2Semester1User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_is_1_1Course2Semester1User30.setGradeGNPRIT(user30GNPRIT);
            grade_is_1_1Course2Semester1User30.setGradeElementsOfHigherMathematics(user30ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User30.setGradeDiscreteMath(user30DiscreteMath);
            grade_is_1_1Course2Semester1User30.setGradeOperatingSystemsAndEnvironments(user30OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User30.setGradeFundamentalsOfAlgorithmizationAndProgramming(user30FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User30.setGradeComputerNetwork(user30ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User30);

            //            //user31

            grade_is_1_1Course2Semester1User31.setUsername(user31Username);
            grade_is_1_1Course2Semester1User31.setGradeStory(user31Story);
            grade_is_1_1Course2Semester1User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_is_1_1Course2Semester1User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_is_1_1Course2Semester1User31.setGradeGNPRIT(user31GNPRIT);
            grade_is_1_1Course2Semester1User31.setGradeElementsOfHigherMathematics(user31ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User31.setGradeDiscreteMath(user31DiscreteMath);
            grade_is_1_1Course2Semester1User31.setGradeOperatingSystemsAndEnvironments(user31OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User31.setGradeFundamentalsOfAlgorithmizationAndProgramming(user31FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User31.setGradeComputerNetwork(user31ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User31);

            //            //user32

            grade_is_1_1Course2Semester1User32.setUsername(user32Username);
            grade_is_1_1Course2Semester1User32.setGradeStory(user32Story);
            grade_is_1_1Course2Semester1User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_is_1_1Course2Semester1User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_is_1_1Course2Semester1User32.setGradeGNPRIT(user32GNPRIT);
            grade_is_1_1Course2Semester1User32.setGradeElementsOfHigherMathematics(user32ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User32.setGradeDiscreteMath(user32DiscreteMath);
            grade_is_1_1Course2Semester1User32.setGradeOperatingSystemsAndEnvironments(user32OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User32.setGradeFundamentalsOfAlgorithmizationAndProgramming(user32FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User32.setGradeComputerNetwork(user32ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User32);

            //            //user33

            grade_is_1_1Course2Semester1User33.setUsername(user33Username);
            grade_is_1_1Course2Semester1User33.setGradeStory(user33Story);
            grade_is_1_1Course2Semester1User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_is_1_1Course2Semester1User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_is_1_1Course2Semester1User33.setGradeGNPRIT(user33GNPRIT);
            grade_is_1_1Course2Semester1User33.setGradeElementsOfHigherMathematics(user33ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User33.setGradeDiscreteMath(user33DiscreteMath);
            grade_is_1_1Course2Semester1User33.setGradeOperatingSystemsAndEnvironments(user33OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User33.setGradeFundamentalsOfAlgorithmizationAndProgramming(user33FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User33.setGradeComputerNetwork(user33ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User33);

            //            //user34

            grade_is_1_1Course2Semester1User34.setUsername(user34Username);
            grade_is_1_1Course2Semester1User34.setGradeStory(user34Story);
            grade_is_1_1Course2Semester1User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_is_1_1Course2Semester1User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_is_1_1Course2Semester1User34.setGradeGNPRIT(user34GNPRIT);
            grade_is_1_1Course2Semester1User34.setGradeElementsOfHigherMathematics(user34ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User34.setGradeDiscreteMath(user34DiscreteMath);
            grade_is_1_1Course2Semester1User34.setGradeOperatingSystemsAndEnvironments(user34OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User34.setGradeFundamentalsOfAlgorithmizationAndProgramming(user34FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User34.setGradeComputerNetwork(user34ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User34);

            //            //user35

            grade_is_1_1Course2Semester1User35.setUsername(user35Username);
            grade_is_1_1Course2Semester1User35.setGradeStory(user35Story);
            grade_is_1_1Course2Semester1User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_is_1_1Course2Semester1User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_is_1_1Course2Semester1User35.setGradeGNPRIT(user35GNPRIT);
            grade_is_1_1Course2Semester1User35.setGradeElementsOfHigherMathematics(user35ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User35.setGradeDiscreteMath(user35DiscreteMath);
            grade_is_1_1Course2Semester1User35.setGradeOperatingSystemsAndEnvironments(user35OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User35.setGradeFundamentalsOfAlgorithmizationAndProgramming(user35FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User35.setGradeComputerNetwork(user35ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User35);

            //            //user36

            grade_is_1_1Course2Semester1User36.setUsername(user36Username);
            grade_is_1_1Course2Semester1User36.setGradeStory(user36Story);
            grade_is_1_1Course2Semester1User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_is_1_1Course2Semester1User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_is_1_1Course2Semester1User36.setGradeGNPRIT(user36GNPRIT);
            grade_is_1_1Course2Semester1User36.setGradeElementsOfHigherMathematics(user36ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User36.setGradeDiscreteMath(user36DiscreteMath);
            grade_is_1_1Course2Semester1User36.setGradeOperatingSystemsAndEnvironments(user36OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User36.setGradeFundamentalsOfAlgorithmizationAndProgramming(user36FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User36.setGradeComputerNetwork(user36ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User36);

            //            //user37

            grade_is_1_1Course2Semester1User37.setUsername(user37Username);
            grade_is_1_1Course2Semester1User37.setGradeStory(user37Story);
            grade_is_1_1Course2Semester1User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_is_1_1Course2Semester1User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_is_1_1Course2Semester1User37.setGradeGNPRIT(user37GNPRIT);
            grade_is_1_1Course2Semester1User37.setGradeElementsOfHigherMathematics(user37ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User37.setGradeDiscreteMath(user37DiscreteMath);
            grade_is_1_1Course2Semester1User37.setGradeOperatingSystemsAndEnvironments(user37OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User37.setGradeFundamentalsOfAlgorithmizationAndProgramming(user37FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User37.setGradeComputerNetwork(user37ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User37);

            //            //user38

            grade_is_1_1Course2Semester1User38.setUsername(user38Username);
            grade_is_1_1Course2Semester1User38.setGradeStory(user38Story);
            grade_is_1_1Course2Semester1User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_is_1_1Course2Semester1User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_is_1_1Course2Semester1User38.setGradeGNPRIT(user38GNPRIT);
            grade_is_1_1Course2Semester1User38.setGradeElementsOfHigherMathematics(user38ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User38.setGradeDiscreteMath(user38DiscreteMath);
            grade_is_1_1Course2Semester1User38.setGradeOperatingSystemsAndEnvironments(user38OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User38.setGradeFundamentalsOfAlgorithmizationAndProgramming(user38FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User38.setGradeComputerNetwork(user38ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User38);

            //            //user39

            grade_is_1_1Course2Semester1User39.setUsername(user39Username);
            grade_is_1_1Course2Semester1User39.setGradeStory(user39Story);
            grade_is_1_1Course2Semester1User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_is_1_1Course2Semester1User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_is_1_1Course2Semester1User39.setGradeGNPRIT(user39GNPRIT);
            grade_is_1_1Course2Semester1User39.setGradeElementsOfHigherMathematics(user39ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User39.setGradeDiscreteMath(user39DiscreteMath);
            grade_is_1_1Course2Semester1User39.setGradeOperatingSystemsAndEnvironments(user39OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User39.setGradeFundamentalsOfAlgorithmizationAndProgramming(user39FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User39.setGradeComputerNetwork(user39ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User39);

            //            //user40

            grade_is_1_1Course2Semester1User40.setUsername(user40Username);
            grade_is_1_1Course2Semester1User40.setGradeStory(user40Story);
            grade_is_1_1Course2Semester1User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_is_1_1Course2Semester1User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_is_1_1Course2Semester1User40.setGradeGNPRIT(user40GNPRIT);
            grade_is_1_1Course2Semester1User40.setGradeElementsOfHigherMathematics(user40ElementsOfHigherMathematics);
            grade_is_1_1Course2Semester1User40.setGradeDiscreteMath(user40DiscreteMath);
            grade_is_1_1Course2Semester1User40.setGradeOperatingSystemsAndEnvironments(user40OperatingSystemsAndEnvironments);
            grade_is_1_1Course2Semester1User40.setGradeFundamentalsOfAlgorithmizationAndProgramming(user40FundamentalsOfAlgorithmizationAndProgramming);
            grade_is_1_1Course2Semester1User40.setGradeComputerNetwork(user40ComputerNetwork);
            gradeIs11Course2Semester1Repository.save(grade_is_1_1Course2Semester1User40);

        } catch (Exception ignore) {

        }

    }
}
