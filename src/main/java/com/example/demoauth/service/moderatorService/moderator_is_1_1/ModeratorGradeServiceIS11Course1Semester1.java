package com.example.demoauth.service.moderatorService.moderator_is_1_1;

import com.example.demoauth.models.grade_is_1_1.models.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.models.grade_is_1_1.models.SpecialGrade_IS_1_1Course1Semester1;
import com.example.demoauth.repository.Grade_IS_1_1Course1Semester1Repository;
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
public class ModeratorGradeServiceIS11Course1Semester1 {
    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_is_1_1Course1Semester1Repository;

    //GetMappingGradeCourse1Semester1
    public void getMappingMethodModer_is_1_1GreadeСourse1Semester1SendGroupName(Model model) {
        List<Grade_IS_1_1Course1Semester1> res = grade_is_1_1Course1Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course1Semester1::getUserID));
        List<Grade_IS_1_1Course1Semester1> voidList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            voidList.add(new Grade_IS_1_1Course1Semester1());
        }
        if (res.isEmpty()) {
            model.addAttribute("groupName", voidList);
        } else {
            model.addAttribute("groupName", res);
        }
    }

    public void getMappingMethodModer_is_1_1GreadeСourse1Semester1(@PathVariable String month, Model model) {
        List<Grade_IS_1_1Course1Semester1> res = grade_is_1_1Course1Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course1Semester1::getUserID));
        List<Grade_IS_1_1Course1Semester1> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester1> septemberList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester1> octoberList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester1> novemberList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester1> decemberList = new ArrayList<>();

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
            voidList.add(new Grade_IS_1_1Course1Semester1());
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


    //PostMappingGradeCourse1Semester1
    public void postMappingMethodModer_is_1_1GreadeСourse1Semester1Post(@RequestParam String inputGroup, @RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1RussianLanguage = splitUser1Grades[2];
            String user1Literature = splitUser1Grades[3];
            String user1Mathematics = splitUser1Grades[4];
            String user1EnglishLanguage = splitUser1Grades[5];
            String user1ComputerScience = splitUser1Grades[6];
            String user1Physics = splitUser1Grades[7];
            String user1Biology = splitUser1Grades[8];
            String user1Story = splitUser1Grades[9];
            String user1SocialScience = splitUser1Grades[10];
            String user1Geography = splitUser1Grades[11];
            String user1PhysicalTraining = splitUser1Grades[12];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2RussianLanguage = splitUser2Grades[2];
            String user2Literature = splitUser2Grades[3];
            String user2Mathematics = splitUser2Grades[4];
            String user2EnglishLanguage = splitUser2Grades[5];
            String user2ComputerScience = splitUser2Grades[6];
            String user2Physics = splitUser2Grades[7];
            String user2Biology = splitUser2Grades[8];
            String user2Story = splitUser2Grades[9];
            String user2SocialScience = splitUser2Grades[10];
            String user2Geography = splitUser2Grades[11];
            String user2PhysicalTraining = splitUser2Grades[12];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3RussianLanguage = splitUser3Grades[2];
            String user3Literature = splitUser3Grades[3];
            String user3Mathematics = splitUser3Grades[4];
            String user3EnglishLanguage = splitUser3Grades[5];
            String user3ComputerScience = splitUser3Grades[6];
            String user3Physics = splitUser3Grades[7];
            String user3Biology = splitUser3Grades[8];
            String user3Story = splitUser3Grades[9];
            String user3SocialScience = splitUser3Grades[10];
            String user3Geography = splitUser3Grades[11];
            String user3PhysicalTraining = splitUser3Grades[12];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4RussianLanguage = splitUser4Grades[2];
            String user4Literature = splitUser4Grades[3];
            String user4Mathematics = splitUser4Grades[4];
            String user4EnglishLanguage = splitUser4Grades[5];
            String user4ComputerScience = splitUser4Grades[6];
            String user4Physics = splitUser4Grades[7];
            String user4Biology = splitUser4Grades[8];
            String user4Story = splitUser4Grades[9];
            String user4SocialScience = splitUser4Grades[10];
            String user4Geography = splitUser4Grades[11];
            String user4PhysicalTraining = splitUser4Grades[12];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5RussianLanguage = splitUser5Grades[2];
            String user5Literature = splitUser5Grades[3];
            String user5Mathematics = splitUser5Grades[4];
            String user5EnglishLanguage = splitUser5Grades[5];
            String user5ComputerScience = splitUser5Grades[6];
            String user5Physics = splitUser5Grades[7];
            String user5Biology = splitUser5Grades[8];
            String user5Story = splitUser5Grades[9];
            String user5SocialScience = splitUser5Grades[10];
            String user5Geography = splitUser5Grades[11];
            String user5PhysicalTraining = splitUser5Grades[12];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6RussianLanguage = splitUser6Grades[2];
            String user6Literature = splitUser6Grades[3];
            String user6Mathematics = splitUser6Grades[4];
            String user6EnglishLanguage = splitUser6Grades[5];
            String user6ComputerScience = splitUser6Grades[6];
            String user6Physics = splitUser6Grades[7];
            String user6Biology = splitUser6Grades[8];
            String user6Story = splitUser6Grades[9];
            String user6SocialScience = splitUser6Grades[10];
            String user6Geography = splitUser6Grades[11];
            String user6PhysicalTraining = splitUser6Grades[12];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7RussianLanguage = splitUser7Grades[2];
            String user7Literature = splitUser7Grades[3];
            String user7Mathematics = splitUser7Grades[4];
            String user7EnglishLanguage = splitUser7Grades[5];
            String user7ComputerScience = splitUser7Grades[6];
            String user7Physics = splitUser7Grades[7];
            String user7Biology = splitUser7Grades[8];
            String user7Story = splitUser7Grades[9];
            String user7SocialScience = splitUser7Grades[10];
            String user7Geography = splitUser7Grades[11];
            String user7PhysicalTraining = splitUser7Grades[12];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8RussianLanguage = splitUser8Grades[2];
            String user8Literature = splitUser8Grades[3];
            String user8Mathematics = splitUser8Grades[4];
            String user8EnglishLanguage = splitUser8Grades[5];
            String user8ComputerScience = splitUser8Grades[6];
            String user8Physics = splitUser8Grades[7];
            String user8Biology = splitUser8Grades[8];
            String user8Story = splitUser8Grades[9];
            String user8SocialScience = splitUser8Grades[10];
            String user8Geography = splitUser8Grades[11];
            String user8PhysicalTraining = splitUser8Grades[12];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9RussianLanguage = splitUser9Grades[2];
            String user9Literature = splitUser9Grades[3];
            String user9Mathematics = splitUser9Grades[4];
            String user9EnglishLanguage = splitUser9Grades[5];
            String user9ComputerScience = splitUser9Grades[6];
            String user9Physics = splitUser9Grades[7];
            String user9Biology = splitUser9Grades[8];
            String user9Story = splitUser9Grades[9];
            String user9SocialScience = splitUser9Grades[10];
            String user9Geography = splitUser9Grades[11];
            String user9PhysicalTraining = splitUser9Grades[12];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10RussianLanguage = splitUser10Grades[2];
            String user10Literature = splitUser10Grades[3];
            String user10Mathematics = splitUser10Grades[4];
            String user10EnglishLanguage = splitUser10Grades[5];
            String user10ComputerScience = splitUser10Grades[6];
            String user10Physics = splitUser10Grades[7];
            String user10Biology = splitUser10Grades[8];
            String user10Story = splitUser10Grades[9];
            String user10SocialScience = splitUser10Grades[10];
            String user10Geography = splitUser10Grades[11];
            String user10PhysicalTraining = splitUser10Grades[12];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11RussianLanguage = splitUser11Grades[2];
            String user11Literature = splitUser11Grades[3];
            String user11Mathematics = splitUser11Grades[4];
            String user11EnglishLanguage = splitUser11Grades[5];
            String user11ComputerScience = splitUser11Grades[6];
            String user11Physics = splitUser11Grades[7];
            String user11Biology = splitUser11Grades[8];
            String user11Story = splitUser11Grades[9];
            String user11SocialScience = splitUser11Grades[10];
            String user11Geography = splitUser11Grades[11];
            String user11PhysicalTraining = splitUser11Grades[12];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12RussianLanguage = splitUser12Grades[2];
            String user12Literature = splitUser12Grades[3];
            String user12Mathematics = splitUser12Grades[4];
            String user12EnglishLanguage = splitUser12Grades[5];
            String user12ComputerScience = splitUser12Grades[6];
            String user12Physics = splitUser12Grades[7];
            String user12Biology = splitUser12Grades[8];
            String user12Story = splitUser12Grades[9];
            String user12SocialScience = splitUser12Grades[10];
            String user12Geography = splitUser12Grades[11];
            String user12PhysicalTraining = splitUser12Grades[12];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13RussianLanguage = splitUser13Grades[2];
            String user13Literature = splitUser13Grades[3];
            String user13Mathematics = splitUser13Grades[4];
            String user13EnglishLanguage = splitUser13Grades[5];
            String user13ComputerScience = splitUser13Grades[6];
            String user13Physics = splitUser13Grades[7];
            String user13Biology = splitUser13Grades[8];
            String user13Story = splitUser13Grades[9];
            String user13SocialScience = splitUser13Grades[10];
            String user13Geography = splitUser13Grades[11];
            String user13PhysicalTraining = splitUser13Grades[12];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14RussianLanguage = splitUser14Grades[2];
            String user14Literature = splitUser14Grades[3];
            String user14Mathematics = splitUser14Grades[4];
            String user14EnglishLanguage = splitUser14Grades[5];
            String user14ComputerScience = splitUser14Grades[6];
            String user14Physics = splitUser14Grades[7];
            String user14Biology = splitUser14Grades[8];
            String user14Story = splitUser14Grades[9];
            String user14SocialScience = splitUser14Grades[10];
            String user14Geography = splitUser14Grades[11];
            String user14PhysicalTraining = splitUser14Grades[12];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15RussianLanguage = splitUser15Grades[2];
            String user15Literature = splitUser15Grades[3];
            String user15Mathematics = splitUser15Grades[4];
            String user15EnglishLanguage = splitUser15Grades[5];
            String user15ComputerScience = splitUser15Grades[6];
            String user15Physics = splitUser15Grades[7];
            String user15Biology = splitUser15Grades[8];
            String user15Story = splitUser15Grades[9];
            String user15SocialScience = splitUser15Grades[10];
            String user15Geography = splitUser15Grades[11];
            String user15PhysicalTraining = splitUser15Grades[12];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16RussianLanguage = splitUser16Grades[2];
            String user16Literature = splitUser16Grades[3];
            String user16Mathematics = splitUser16Grades[4];
            String user16EnglishLanguage = splitUser16Grades[5];
            String user16ComputerScience = splitUser16Grades[6];
            String user16Physics = splitUser16Grades[7];
            String user16Biology = splitUser16Grades[8];
            String user16Story = splitUser16Grades[9];
            String user16SocialScience = splitUser16Grades[10];
            String user16Geography = splitUser16Grades[11];
            String user16PhysicalTraining = splitUser16Grades[12];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17RussianLanguage = splitUser17Grades[2];
            String user17Literature = splitUser17Grades[3];
            String user17Mathematics = splitUser17Grades[4];
            String user17EnglishLanguage = splitUser17Grades[5];
            String user17ComputerScience = splitUser17Grades[6];
            String user17Physics = splitUser17Grades[7];
            String user17Biology = splitUser17Grades[8];
            String user17Story = splitUser17Grades[9];
            String user17SocialScience = splitUser17Grades[10];
            String user17Geography = splitUser17Grades[11];
            String user17PhysicalTraining = splitUser17Grades[12];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18RussianLanguage = splitUser18Grades[2];
            String user18Literature = splitUser18Grades[3];
            String user18Mathematics = splitUser18Grades[4];
            String user18EnglishLanguage = splitUser18Grades[5];
            String user18ComputerScience = splitUser18Grades[6];
            String user18Physics = splitUser18Grades[7];
            String user18Biology = splitUser18Grades[8];
            String user18Story = splitUser18Grades[9];
            String user18SocialScience = splitUser18Grades[10];
            String user18Geography = splitUser18Grades[11];
            String user18PhysicalTraining = splitUser18Grades[12];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19RussianLanguage = splitUser19Grades[2];
            String user19Literature = splitUser19Grades[3];
            String user19Mathematics = splitUser19Grades[4];
            String user19EnglishLanguage = splitUser19Grades[5];
            String user19ComputerScience = splitUser19Grades[6];
            String user19Physics = splitUser19Grades[7];
            String user19Biology = splitUser19Grades[8];
            String user19Story = splitUser19Grades[9];
            String user19SocialScience = splitUser19Grades[10];
            String user19Geography = splitUser19Grades[11];
            String user19PhysicalTraining = splitUser19Grades[12];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20RussianLanguage = splitUser20Grades[2];
            String user20Literature = splitUser20Grades[3];
            String user20Mathematics = splitUser20Grades[4];
            String user20EnglishLanguage = splitUser20Grades[5];
            String user20ComputerScience = splitUser20Grades[6];
            String user20Physics = splitUser20Grades[7];
            String user20Biology = splitUser20Grades[8];
            String user20Story = splitUser20Grades[9];
            String user20SocialScience = splitUser20Grades[10];
            String user20Geography = splitUser20Grades[11];
            String user20PhysicalTraining = splitUser20Grades[12];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21RussianLanguage = splitUser21Grades[2];
            String user21Literature = splitUser21Grades[3];
            String user21Mathematics = splitUser21Grades[4];
            String user21EnglishLanguage = splitUser21Grades[5];
            String user21ComputerScience = splitUser21Grades[6];
            String user21Physics = splitUser21Grades[7];
            String user21Biology = splitUser21Grades[8];
            String user21Story = splitUser21Grades[9];
            String user21SocialScience = splitUser21Grades[10];
            String user21Geography = splitUser21Grades[11];
            String user21PhysicalTraining = splitUser21Grades[12];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22RussianLanguage = splitUser22Grades[2];
            String user22Literature = splitUser22Grades[3];
            String user22Mathematics = splitUser22Grades[4];
            String user22EnglishLanguage = splitUser22Grades[5];
            String user22ComputerScience = splitUser22Grades[6];
            String user22Physics = splitUser22Grades[7];
            String user22Biology = splitUser22Grades[8];
            String user22Story = splitUser22Grades[9];
            String user22SocialScience = splitUser22Grades[10];
            String user22Geography = splitUser22Grades[11];
            String user22PhysicalTraining = splitUser22Grades[12];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23RussianLanguage = splitUser23Grades[2];
            String user23Literature = splitUser23Grades[3];
            String user23Mathematics = splitUser23Grades[4];
            String user23EnglishLanguage = splitUser23Grades[5];
            String user23ComputerScience = splitUser23Grades[6];
            String user23Physics = splitUser23Grades[7];
            String user23Biology = splitUser23Grades[8];
            String user23Story = splitUser23Grades[9];
            String user23SocialScience = splitUser23Grades[10];
            String user23Geography = splitUser23Grades[11];
            String user23PhysicalTraining = splitUser23Grades[12];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24RussianLanguage = splitUser24Grades[2];
            String user24Literature = splitUser24Grades[3];
            String user24Mathematics = splitUser24Grades[4];
            String user24EnglishLanguage = splitUser24Grades[5];
            String user24ComputerScience = splitUser24Grades[6];
            String user24Physics = splitUser24Grades[7];
            String user24Biology = splitUser24Grades[8];
            String user24Story = splitUser24Grades[9];
            String user24SocialScience = splitUser24Grades[10];
            String user24Geography = splitUser24Grades[11];
            String user24PhysicalTraining = splitUser24Grades[12];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25RussianLanguage = splitUser25Grades[2];
            String user25Literature = splitUser25Grades[3];
            String user25Mathematics = splitUser25Grades[4];
            String user25EnglishLanguage = splitUser25Grades[5];
            String user25ComputerScience = splitUser25Grades[6];
            String user25Physics = splitUser25Grades[7];
            String user25Biology = splitUser25Grades[8];
            String user25Story = splitUser25Grades[9];
            String user25SocialScience = splitUser25Grades[10];
            String user25Geography = splitUser25Grades[11];
            String user25PhysicalTraining = splitUser25Grades[12];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26RussianLanguage = splitUser26Grades[2];
            String user26Literature = splitUser26Grades[3];
            String user26Mathematics = splitUser26Grades[4];
            String user26EnglishLanguage = splitUser26Grades[5];
            String user26ComputerScience = splitUser26Grades[6];
            String user26Physics = splitUser26Grades[7];
            String user26Biology = splitUser26Grades[8];
            String user26Story = splitUser26Grades[9];
            String user26SocialScience = splitUser26Grades[10];
            String user26Geography = splitUser26Grades[11];
            String user26PhysicalTraining = splitUser26Grades[12];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27RussianLanguage = splitUser27Grades[2];
            String user27Literature = splitUser27Grades[3];
            String user27Mathematics = splitUser27Grades[4];
            String user27EnglishLanguage = splitUser27Grades[5];
            String user27ComputerScience = splitUser27Grades[6];
            String user27Physics = splitUser27Grades[7];
            String user27Biology = splitUser27Grades[8];
            String user27Story = splitUser27Grades[9];
            String user27SocialScience = splitUser27Grades[10];
            String user27Geography = splitUser27Grades[11];
            String user27PhysicalTraining = splitUser27Grades[12];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28RussianLanguage = splitUser28Grades[2];
            String user28Literature = splitUser28Grades[3];
            String user28Mathematics = splitUser28Grades[4];
            String user28EnglishLanguage = splitUser28Grades[5];
            String user28ComputerScience = splitUser28Grades[6];
            String user28Physics = splitUser28Grades[7];
            String user28Biology = splitUser28Grades[8];
            String user28Story = splitUser28Grades[9];
            String user28SocialScience = splitUser28Grades[10];
            String user28Geography = splitUser28Grades[11];
            String user28PhysicalTraining = splitUser28Grades[12];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29RussianLanguage = splitUser29Grades[2];
            String user29Literature = splitUser29Grades[3];
            String user29Mathematics = splitUser29Grades[4];
            String user29EnglishLanguage = splitUser29Grades[5];
            String user29ComputerScience = splitUser29Grades[6];
            String user29Physics = splitUser29Grades[7];
            String user29Biology = splitUser29Grades[8];
            String user29Story = splitUser29Grades[9];
            String user29SocialScience = splitUser29Grades[10];
            String user29Geography = splitUser29Grades[11];
            String user29PhysicalTraining = splitUser29Grades[12];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30RussianLanguage = splitUser30Grades[2];
            String user30Literature = splitUser30Grades[3];
            String user30Mathematics = splitUser30Grades[4];
            String user30EnglishLanguage = splitUser30Grades[5];
            String user30ComputerScience = splitUser30Grades[6];
            String user30Physics = splitUser30Grades[7];
            String user30Biology = splitUser30Grades[8];
            String user30Story = splitUser30Grades[9];
            String user30SocialScience = splitUser30Grades[10];
            String user30Geography = splitUser30Grades[11];
            String user30PhysicalTraining = splitUser30Grades[12];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31RussianLanguage = splitUser31Grades[2];
            String user31Literature = splitUser31Grades[3];
            String user31Mathematics = splitUser31Grades[4];
            String user31EnglishLanguage = splitUser31Grades[5];
            String user31ComputerScience = splitUser31Grades[6];
            String user31Physics = splitUser31Grades[7];
            String user31Biology = splitUser31Grades[8];
            String user31Story = splitUser31Grades[9];
            String user31SocialScience = splitUser31Grades[10];
            String user31Geography = splitUser31Grades[11];
            String user31PhysicalTraining = splitUser31Grades[12];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32RussianLanguage = splitUser32Grades[2];
            String user32Literature = splitUser32Grades[3];
            String user32Mathematics = splitUser32Grades[4];
            String user32EnglishLanguage = splitUser32Grades[5];
            String user32ComputerScience = splitUser32Grades[6];
            String user32Physics = splitUser32Grades[7];
            String user32Biology = splitUser32Grades[8];
            String user32Story = splitUser32Grades[9];
            String user32SocialScience = splitUser32Grades[10];
            String user32Geography = splitUser32Grades[11];
            String user32PhysicalTraining = splitUser32Grades[12];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33RussianLanguage = splitUser33Grades[2];
            String user33Literature = splitUser33Grades[3];
            String user33Mathematics = splitUser33Grades[4];
            String user33EnglishLanguage = splitUser33Grades[5];
            String user33ComputerScience = splitUser33Grades[6];
            String user33Physics = splitUser33Grades[7];
            String user33Biology = splitUser33Grades[8];
            String user33Story = splitUser33Grades[9];
            String user33SocialScience = splitUser33Grades[10];
            String user33Geography = splitUser33Grades[11];
            String user33PhysicalTraining = splitUser33Grades[12];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34RussianLanguage = splitUser34Grades[2];
            String user34Literature = splitUser34Grades[3];
            String user34Mathematics = splitUser34Grades[4];
            String user34EnglishLanguage = splitUser34Grades[5];
            String user34ComputerScience = splitUser34Grades[6];
            String user34Physics = splitUser34Grades[7];
            String user34Biology = splitUser34Grades[8];
            String user34Story = splitUser34Grades[9];
            String user34SocialScience = splitUser34Grades[10];
            String user34Geography = splitUser34Grades[11];
            String user34PhysicalTraining = splitUser34Grades[12];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35RussianLanguage = splitUser35Grades[2];
            String user35Literature = splitUser35Grades[3];
            String user35Mathematics = splitUser35Grades[4];
            String user35EnglishLanguage = splitUser35Grades[5];
            String user35ComputerScience = splitUser35Grades[6];
            String user35Physics = splitUser35Grades[7];
            String user35Biology = splitUser35Grades[8];
            String user35Story = splitUser35Grades[9];
            String user35SocialScience = splitUser35Grades[10];
            String user35Geography = splitUser35Grades[11];
            String user35PhysicalTraining = splitUser35Grades[12];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36RussianLanguage = splitUser36Grades[2];
            String user36Literature = splitUser36Grades[3];
            String user36Mathematics = splitUser36Grades[4];
            String user36EnglishLanguage = splitUser36Grades[5];
            String user36ComputerScience = splitUser36Grades[6];
            String user36Physics = splitUser36Grades[7];
            String user36Biology = splitUser36Grades[8];
            String user36Story = splitUser36Grades[9];
            String user36SocialScience = splitUser36Grades[10];
            String user36Geography = splitUser36Grades[11];
            String user36PhysicalTraining = splitUser36Grades[12];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37RussianLanguage = splitUser37Grades[2];
            String user37Literature = splitUser37Grades[3];
            String user37Mathematics = splitUser37Grades[4];
            String user37EnglishLanguage = splitUser37Grades[5];
            String user37ComputerScience = splitUser37Grades[6];
            String user37Physics = splitUser37Grades[7];
            String user37Biology = splitUser37Grades[8];
            String user37Story = splitUser37Grades[9];
            String user37SocialScience = splitUser37Grades[10];
            String user37Geography = splitUser37Grades[11];
            String user37PhysicalTraining = splitUser37Grades[12];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38RussianLanguage = splitUser38Grades[2];
            String user38Literature = splitUser38Grades[3];
            String user38Mathematics = splitUser38Grades[4];
            String user38EnglishLanguage = splitUser38Grades[5];
            String user38ComputerScience = splitUser38Grades[6];
            String user38Physics = splitUser38Grades[7];
            String user38Biology = splitUser38Grades[8];
            String user38Story = splitUser38Grades[9];
            String user38SocialScience = splitUser38Grades[10];
            String user38Geography = splitUser38Grades[11];
            String user38PhysicalTraining = splitUser38Grades[12];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39RussianLanguage = splitUser39Grades[2];
            String user39Literature = splitUser39Grades[3];
            String user39Mathematics = splitUser39Grades[4];
            String user39EnglishLanguage = splitUser39Grades[5];
            String user39ComputerScience = splitUser39Grades[6];
            String user39Physics = splitUser39Grades[7];
            String user39Biology = splitUser39Grades[8];
            String user39Story = splitUser39Grades[9];
            String user39SocialScience = splitUser39Grades[10];
            String user39Geography = splitUser39Grades[11];
            String user39PhysicalTraining = splitUser39Grades[12];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40RussianLanguage = splitUser40Grades[2];
            String user40Literature = splitUser40Grades[3];
            String user40Mathematics = splitUser40Grades[4];
            String user40EnglishLanguage = splitUser40Grades[5];
            String user40ComputerScience = splitUser40Grades[6];
            String user40Physics = splitUser40Grades[7];
            String user40Biology = splitUser40Grades[8];
            String user40Story = splitUser40Grades[9];
            String user40SocialScience = splitUser40Grades[10];
            String user40Geography = splitUser40Grades[11];
            String user40PhysicalTraining = splitUser40Grades[12];

            ArrayList<Grade_IS_1_1Course1Semester1> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course1Semester1(user1Id, user1Username, user1RussianLanguage, user1Literature, user1Mathematics, user1EnglishLanguage, user1ComputerScience, user1Physics, user1Biology, user1Story, user1SocialScience, user1Geography, user1PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user2Id, user2Username, user2RussianLanguage, user2Literature, user2Mathematics, user2EnglishLanguage, user2ComputerScience, user2Physics, user2Biology, user2Story, user2SocialScience, user2Geography, user2PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user3Id, user3Username, user3RussianLanguage, user3Literature, user3Mathematics, user3EnglishLanguage, user3ComputerScience, user3Physics, user3Biology, user3Story, user3SocialScience, user3Geography, user3PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user4Id, user4Username, user4RussianLanguage, user4Literature, user4Mathematics, user4EnglishLanguage, user4ComputerScience, user4Physics, user4Biology, user4Story, user4SocialScience, user4Geography, user4PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user5Id, user5Username, user5RussianLanguage, user5Literature, user5Mathematics, user5EnglishLanguage, user5ComputerScience, user5Physics, user5Biology, user5Story, user5SocialScience, user5Geography, user5PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user6Id, user6Username, user6RussianLanguage, user6Literature, user6Mathematics, user6EnglishLanguage, user6ComputerScience, user6Physics, user6Biology, user6Story, user6SocialScience, user6Geography, user6PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user7Id, user7Username, user7RussianLanguage, user7Literature, user7Mathematics, user7EnglishLanguage, user7ComputerScience, user7Physics, user7Biology, user7Story, user7SocialScience, user7Geography, user7PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user8Id, user8Username, user8RussianLanguage, user8Literature, user8Mathematics, user8EnglishLanguage, user8ComputerScience, user8Physics, user8Biology, user8Story, user8SocialScience, user8Geography, user8PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user9Id, user9Username, user9RussianLanguage, user9Literature, user9Mathematics, user9EnglishLanguage, user9ComputerScience, user9Physics, user9Biology, user9Story, user9SocialScience, user9Geography, user9PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user10Id, user10Username, user10RussianLanguage, user10Literature, user10Mathematics, user10EnglishLanguage, user10ComputerScience, user10Physics, user10Biology, user10Story, user10SocialScience, user10Geography, user10PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user11Id, user11Username, user11RussianLanguage, user11Literature, user11Mathematics, user11EnglishLanguage, user11ComputerScience, user11Physics, user11Biology, user11Story, user11SocialScience, user11Geography, user11PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user12Id, user12Username, user12RussianLanguage, user12Literature, user12Mathematics, user12EnglishLanguage, user12ComputerScience, user12Physics, user12Biology, user12Story, user12SocialScience, user12Geography, user12PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user13Id, user13Username, user13RussianLanguage, user13Literature, user13Mathematics, user13EnglishLanguage, user13ComputerScience, user13Physics, user13Biology, user13Story, user13SocialScience, user13Geography, user13PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user14Id, user14Username, user14RussianLanguage, user14Literature, user14Mathematics, user14EnglishLanguage, user14ComputerScience, user14Physics, user14Biology, user14Story, user14SocialScience, user14Geography, user14PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user15Id, user15Username, user15RussianLanguage, user15Literature, user15Mathematics, user15EnglishLanguage, user15ComputerScience, user15Physics, user15Biology, user15Story, user15SocialScience, user15Geography, user15PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user16Id, user16Username, user16RussianLanguage, user16Literature, user16Mathematics, user16EnglishLanguage, user16ComputerScience, user16Physics, user16Biology, user16Story, user16SocialScience, user16Geography, user16PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user17Id, user17Username, user17RussianLanguage, user17Literature, user17Mathematics, user17EnglishLanguage, user17ComputerScience, user17Physics, user17Biology, user17Story, user17SocialScience, user17Geography, user17PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user18Id, user18Username, user18RussianLanguage, user18Literature, user18Mathematics, user18EnglishLanguage, user18ComputerScience, user18Physics, user18Biology, user18Story, user18SocialScience, user18Geography, user18PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user19Id, user19Username, user19RussianLanguage, user19Literature, user19Mathematics, user19EnglishLanguage, user19ComputerScience, user19Physics, user19Biology, user19Story, user19SocialScience, user19Geography, user19PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user20Id, user20Username, user20RussianLanguage, user20Literature, user20Mathematics, user20EnglishLanguage, user20ComputerScience, user20Physics, user20Biology, user20Story, user20SocialScience, user20Geography, user20PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user21Id, user21Username, user21RussianLanguage, user21Literature, user21Mathematics, user21EnglishLanguage, user21ComputerScience, user21Physics, user21Biology, user21Story, user21SocialScience, user21Geography, user21PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user22Id, user22Username, user22RussianLanguage, user22Literature, user22Mathematics, user22EnglishLanguage, user22ComputerScience, user22Physics, user22Biology, user22Story, user22SocialScience, user22Geography, user22PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user23Id, user23Username, user23RussianLanguage, user23Literature, user23Mathematics, user23EnglishLanguage, user23ComputerScience, user23Physics, user23Biology, user23Story, user23SocialScience, user23Geography, user23PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user24Id, user24Username, user24RussianLanguage, user24Literature, user24Mathematics, user24EnglishLanguage, user24ComputerScience, user24Physics, user24Biology, user24Story, user24SocialScience, user24Geography, user24PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user25Id, user25Username, user25RussianLanguage, user25Literature, user25Mathematics, user25EnglishLanguage, user25ComputerScience, user25Physics, user25Biology, user25Story, user25SocialScience, user25Geography, user25PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user26Id, user26Username, user26RussianLanguage, user26Literature, user26Mathematics, user26EnglishLanguage, user26ComputerScience, user26Physics, user26Biology, user26Story, user26SocialScience, user26Geography, user26PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user27Id, user27Username, user27RussianLanguage, user27Literature, user27Mathematics, user27EnglishLanguage, user27ComputerScience, user27Physics, user27Biology, user27Story, user27SocialScience, user27Geography, user27PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user28Id, user28Username, user28RussianLanguage, user28Literature, user28Mathematics, user28EnglishLanguage, user28ComputerScience, user28Physics, user28Biology, user28Story, user28SocialScience, user28Geography, user28PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user29Id, user29Username, user29RussianLanguage, user29Literature, user29Mathematics, user29EnglishLanguage, user29ComputerScience, user29Physics, user29Biology, user29Story, user29SocialScience, user29Geography, user29PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user30Id, user30Username, user30RussianLanguage, user30Literature, user30Mathematics, user30EnglishLanguage, user30ComputerScience, user30Physics, user30Biology, user30Story, user30SocialScience, user30Geography, user30PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user31Id, user31Username, user31RussianLanguage, user31Literature, user31Mathematics, user31EnglishLanguage, user31ComputerScience, user31Physics, user31Biology, user31Story, user31SocialScience, user31Geography, user31PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user32Id, user32Username, user32RussianLanguage, user32Literature, user32Mathematics, user32EnglishLanguage, user32ComputerScience, user32Physics, user32Biology, user32Story, user32SocialScience, user32Geography, user32PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user33Id, user33Username, user33RussianLanguage, user33Literature, user33Mathematics, user33EnglishLanguage, user33ComputerScience, user33Physics, user33Biology, user33Story, user33SocialScience, user33Geography, user33PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user34Id, user34Username, user34RussianLanguage, user34Literature, user34Mathematics, user34EnglishLanguage, user34ComputerScience, user34Physics, user34Biology, user34Story, user34SocialScience, user34Geography, user34PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user35Id, user35Username, user35RussianLanguage, user35Literature, user35Mathematics, user35EnglishLanguage, user35ComputerScience, user35Physics, user35Biology, user35Story, user35SocialScience, user35Geography, user35PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user36Id, user36Username, user36RussianLanguage, user36Literature, user36Mathematics, user36EnglishLanguage, user36ComputerScience, user36Physics, user36Biology, user36Story, user36SocialScience, user36Geography, user36PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user37Id, user37Username, user37RussianLanguage, user37Literature, user37Mathematics, user37EnglishLanguage, user37ComputerScience, user37Physics, user37Biology, user37Story, user37SocialScience, user37Geography, user37PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user38Id, user38Username, user38RussianLanguage, user38Literature, user38Mathematics, user38EnglishLanguage, user38ComputerScience, user38Physics, user38Biology, user38Story, user38SocialScience, user38Geography, user38PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user39Id, user39Username, user39RussianLanguage, user39Literature, user39Mathematics, user39EnglishLanguage, user39ComputerScience, user39Physics, user39Biology, user39Story, user39SocialScience, user39Geography, user39PhysicalTraining, month, inputGroup));
            addArr.add(new Grade_IS_1_1Course1Semester1(user40Id, user40Username, user40RussianLanguage, user40Literature, user40Mathematics, user40EnglishLanguage, user40ComputerScience, user40Physics, user40Biology, user40Story, user40SocialScience, user40Geography, user40PhysicalTraining, month, inputGroup));

            if (grade_is_1_1Course1Semester1Repository.findAll().isEmpty()) {
                grade_is_1_1Course1Semester1Repository.saveAll(addArr);
            }
            if (!grade_is_1_1Course1Semester1Repository.existsByMonth(month)) {
                grade_is_1_1Course1Semester1Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course1Semester1> listAllGrade = grade_is_1_1Course1Semester1Repository.findAll();
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User1 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User2 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User3 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User4 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User5 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User6 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User7 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User8 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User9 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User10 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User11 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User12 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User13 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User14 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User15 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User16 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User17 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User18 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User19 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User20 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User21 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User22 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User23 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User24 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User25 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User26 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User27 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User28 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User29 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User30 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User31 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User32 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User33 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User34 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User35 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User36 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User37 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User38 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User39 = null;
            Grade_IS_1_1Course1Semester1 grade_is_1_1Course1Semester1User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester1User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_is_1_1Course1Semester1User1.setUsername(user1Username);
            grade_is_1_1Course1Semester1User1.setGradeRussianLanguage(user1RussianLanguage);
            grade_is_1_1Course1Semester1User1.setGradeLiterature(user1Literature);
            grade_is_1_1Course1Semester1User1.setGradeMathematics(user1Mathematics);
            grade_is_1_1Course1Semester1User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_is_1_1Course1Semester1User1.setGradeComputerScience(user1ComputerScience);
            grade_is_1_1Course1Semester1User1.setGradePhysics(user1Physics);
            grade_is_1_1Course1Semester1User1.setGradeBiology(user1Biology);
            grade_is_1_1Course1Semester1User1.setGradeStory(user1Story);
            grade_is_1_1Course1Semester1User1.setGradeSocialScience(user1SocialScience);
            grade_is_1_1Course1Semester1User1.setGradeGeography(user1Geography);
            grade_is_1_1Course1Semester1User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_is_1_1Course1Semester1User1.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User1);

            //user2
            grade_is_1_1Course1Semester1User2.setUsername(user2Username);
            grade_is_1_1Course1Semester1User2.setGradeRussianLanguage(user2RussianLanguage);
            grade_is_1_1Course1Semester1User2.setGradeLiterature(user2Literature);
            grade_is_1_1Course1Semester1User2.setGradeMathematics(user2Mathematics);
            grade_is_1_1Course1Semester1User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_is_1_1Course1Semester1User2.setGradeComputerScience(user2ComputerScience);
            grade_is_1_1Course1Semester1User2.setGradePhysics(user2Physics);
            grade_is_1_1Course1Semester1User2.setGradeBiology(user2Biology);
            grade_is_1_1Course1Semester1User2.setGradeStory(user2Story);
            grade_is_1_1Course1Semester1User2.setGradeSocialScience(user2SocialScience);
            grade_is_1_1Course1Semester1User2.setGradeGeography(user2Geography);
            grade_is_1_1Course1Semester1User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_is_1_1Course1Semester1User2.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User2);
//            //user3

            grade_is_1_1Course1Semester1User3.setUsername(user3Username);
            grade_is_1_1Course1Semester1User3.setGradeRussianLanguage(user3RussianLanguage);
            grade_is_1_1Course1Semester1User3.setGradeLiterature(user3Literature);
            grade_is_1_1Course1Semester1User3.setGradeMathematics(user3Mathematics);
            grade_is_1_1Course1Semester1User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_is_1_1Course1Semester1User3.setGradeComputerScience(user3ComputerScience);
            grade_is_1_1Course1Semester1User3.setGradePhysics(user3Physics);
            grade_is_1_1Course1Semester1User3.setGradeBiology(user3Biology);
            grade_is_1_1Course1Semester1User3.setGradeStory(user3Story);
            grade_is_1_1Course1Semester1User3.setGradeSocialScience(user3SocialScience);
            grade_is_1_1Course1Semester1User3.setGradeGeography(user3Geography);
            grade_is_1_1Course1Semester1User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_is_1_1Course1Semester1User3.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User3);
//            //user4

            grade_is_1_1Course1Semester1User4.setUsername(user4Username);
            grade_is_1_1Course1Semester1User4.setGradeRussianLanguage(user4RussianLanguage);
            grade_is_1_1Course1Semester1User4.setGradeLiterature(user4Literature);
            grade_is_1_1Course1Semester1User4.setGradeMathematics(user4Mathematics);
            grade_is_1_1Course1Semester1User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_is_1_1Course1Semester1User4.setGradeComputerScience(user4ComputerScience);
            grade_is_1_1Course1Semester1User4.setGradePhysics(user4Physics);
            grade_is_1_1Course1Semester1User4.setGradeBiology(user4Biology);
            grade_is_1_1Course1Semester1User4.setGradeStory(user4Story);
            grade_is_1_1Course1Semester1User4.setGradeSocialScience(user4SocialScience);
            grade_is_1_1Course1Semester1User4.setGradeGeography(user4Geography);
            grade_is_1_1Course1Semester1User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_is_1_1Course1Semester1User4.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User4);
//            //user5

            grade_is_1_1Course1Semester1User5.setUsername(user5Username);
            grade_is_1_1Course1Semester1User5.setGradeRussianLanguage(user5RussianLanguage);
            grade_is_1_1Course1Semester1User5.setGradeLiterature(user5Literature);
            grade_is_1_1Course1Semester1User5.setGradeMathematics(user5Mathematics);
            grade_is_1_1Course1Semester1User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_is_1_1Course1Semester1User5.setGradeComputerScience(user5ComputerScience);
            grade_is_1_1Course1Semester1User5.setGradePhysics(user5Physics);
            grade_is_1_1Course1Semester1User5.setGradeBiology(user5Biology);
            grade_is_1_1Course1Semester1User5.setGradeStory(user5Story);
            grade_is_1_1Course1Semester1User5.setGradeSocialScience(user5SocialScience);
            grade_is_1_1Course1Semester1User5.setGradeGeography(user5Geography);
            grade_is_1_1Course1Semester1User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_is_1_1Course1Semester1User5.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User5);
//            //user6

            grade_is_1_1Course1Semester1User6.setUsername(user6Username);
            grade_is_1_1Course1Semester1User6.setGradeRussianLanguage(user6RussianLanguage);
            grade_is_1_1Course1Semester1User6.setGradeLiterature(user6Literature);
            grade_is_1_1Course1Semester1User6.setGradeMathematics(user6Mathematics);
            grade_is_1_1Course1Semester1User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_is_1_1Course1Semester1User6.setGradeComputerScience(user6ComputerScience);
            grade_is_1_1Course1Semester1User6.setGradePhysics(user6Physics);
            grade_is_1_1Course1Semester1User6.setGradeBiology(user6Biology);
            grade_is_1_1Course1Semester1User6.setGradeStory(user6Story);
            grade_is_1_1Course1Semester1User6.setGradeSocialScience(user6SocialScience);
            grade_is_1_1Course1Semester1User6.setGradeGeography(user6Geography);
            grade_is_1_1Course1Semester1User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_is_1_1Course1Semester1User6.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User6);
//            //user7

            grade_is_1_1Course1Semester1User7.setUsername(user7Username);
            grade_is_1_1Course1Semester1User7.setGradeRussianLanguage(user7RussianLanguage);
            grade_is_1_1Course1Semester1User7.setGradeLiterature(user7Literature);
            grade_is_1_1Course1Semester1User7.setGradeMathematics(user7Mathematics);
            grade_is_1_1Course1Semester1User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_is_1_1Course1Semester1User7.setGradeComputerScience(user7ComputerScience);
            grade_is_1_1Course1Semester1User7.setGradePhysics(user7Physics);
            grade_is_1_1Course1Semester1User7.setGradeBiology(user7Biology);
            grade_is_1_1Course1Semester1User7.setGradeStory(user7Story);
            grade_is_1_1Course1Semester1User7.setGradeSocialScience(user7SocialScience);
            grade_is_1_1Course1Semester1User7.setGradeGeography(user7Geography);
            grade_is_1_1Course1Semester1User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_is_1_1Course1Semester1User7.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User7);
//            //user8

            grade_is_1_1Course1Semester1User8.setUsername(user8Username);
            grade_is_1_1Course1Semester1User8.setGradeRussianLanguage(user8RussianLanguage);
            grade_is_1_1Course1Semester1User8.setGradeLiterature(user8Literature);
            grade_is_1_1Course1Semester1User8.setGradeMathematics(user8Mathematics);
            grade_is_1_1Course1Semester1User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_is_1_1Course1Semester1User8.setGradeComputerScience(user8ComputerScience);
            grade_is_1_1Course1Semester1User8.setGradePhysics(user8Physics);
            grade_is_1_1Course1Semester1User8.setGradeBiology(user8Biology);
            grade_is_1_1Course1Semester1User8.setGradeStory(user8Story);
            grade_is_1_1Course1Semester1User8.setGradeSocialScience(user8SocialScience);
            grade_is_1_1Course1Semester1User8.setGradeGeography(user8Geography);
            grade_is_1_1Course1Semester1User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_is_1_1Course1Semester1User8.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User8);
//            //user9

            grade_is_1_1Course1Semester1User9.setUsername(user9Username);
            grade_is_1_1Course1Semester1User9.setGradeRussianLanguage(user9RussianLanguage);
            grade_is_1_1Course1Semester1User9.setGradeLiterature(user9Literature);
            grade_is_1_1Course1Semester1User9.setGradeMathematics(user9Mathematics);
            grade_is_1_1Course1Semester1User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_is_1_1Course1Semester1User9.setGradeComputerScience(user9ComputerScience);
            grade_is_1_1Course1Semester1User9.setGradePhysics(user9Physics);
            grade_is_1_1Course1Semester1User9.setGradeBiology(user9Biology);
            grade_is_1_1Course1Semester1User9.setGradeStory(user9Story);
            grade_is_1_1Course1Semester1User9.setGradeSocialScience(user9SocialScience);
            grade_is_1_1Course1Semester1User9.setGradeGeography(user9Geography);
            grade_is_1_1Course1Semester1User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_is_1_1Course1Semester1User9.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User9);
//            //user10

            grade_is_1_1Course1Semester1User10.setUsername(user10Username);
            grade_is_1_1Course1Semester1User10.setGradeRussianLanguage(user10RussianLanguage);
            grade_is_1_1Course1Semester1User10.setGradeLiterature(user10Literature);
            grade_is_1_1Course1Semester1User10.setGradeMathematics(user10Mathematics);
            grade_is_1_1Course1Semester1User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_is_1_1Course1Semester1User10.setGradeComputerScience(user10ComputerScience);
            grade_is_1_1Course1Semester1User10.setGradePhysics(user10Physics);
            grade_is_1_1Course1Semester1User10.setGradeBiology(user10Biology);
            grade_is_1_1Course1Semester1User10.setGradeStory(user10Story);
            grade_is_1_1Course1Semester1User10.setGradeSocialScience(user10SocialScience);
            grade_is_1_1Course1Semester1User10.setGradeGeography(user10Geography);
            grade_is_1_1Course1Semester1User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_is_1_1Course1Semester1User10.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User10);
//            //user11

            grade_is_1_1Course1Semester1User11.setUsername(user11Username);
            grade_is_1_1Course1Semester1User11.setGradeRussianLanguage(user11RussianLanguage);
            grade_is_1_1Course1Semester1User11.setGradeLiterature(user11Literature);
            grade_is_1_1Course1Semester1User11.setGradeMathematics(user11Mathematics);
            grade_is_1_1Course1Semester1User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_is_1_1Course1Semester1User11.setGradeComputerScience(user11ComputerScience);
            grade_is_1_1Course1Semester1User11.setGradePhysics(user11Physics);
            grade_is_1_1Course1Semester1User11.setGradeBiology(user11Biology);
            grade_is_1_1Course1Semester1User11.setGradeStory(user11Story);
            grade_is_1_1Course1Semester1User11.setGradeSocialScience(user11SocialScience);
            grade_is_1_1Course1Semester1User11.setGradeGeography(user11Geography);
            grade_is_1_1Course1Semester1User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_is_1_1Course1Semester1User11.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User11);
//            //user12

            grade_is_1_1Course1Semester1User12.setUsername(user12Username);
            grade_is_1_1Course1Semester1User12.setGradeRussianLanguage(user12RussianLanguage);
            grade_is_1_1Course1Semester1User12.setGradeLiterature(user12Literature);
            grade_is_1_1Course1Semester1User12.setGradeMathematics(user12Mathematics);
            grade_is_1_1Course1Semester1User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_is_1_1Course1Semester1User12.setGradeComputerScience(user12ComputerScience);
            grade_is_1_1Course1Semester1User12.setGradePhysics(user12Physics);
            grade_is_1_1Course1Semester1User12.setGradeBiology(user12Biology);
            grade_is_1_1Course1Semester1User12.setGradeStory(user12Story);
            grade_is_1_1Course1Semester1User12.setGradeSocialScience(user12SocialScience);
            grade_is_1_1Course1Semester1User12.setGradeGeography(user12Geography);
            grade_is_1_1Course1Semester1User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_is_1_1Course1Semester1User12.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User12);
//            //user13

            grade_is_1_1Course1Semester1User13.setUsername(user13Username);
            grade_is_1_1Course1Semester1User13.setGradeRussianLanguage(user13RussianLanguage);
            grade_is_1_1Course1Semester1User13.setGradeLiterature(user13Literature);
            grade_is_1_1Course1Semester1User13.setGradeMathematics(user13Mathematics);
            grade_is_1_1Course1Semester1User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_is_1_1Course1Semester1User13.setGradeComputerScience(user13ComputerScience);
            grade_is_1_1Course1Semester1User13.setGradePhysics(user13Physics);
            grade_is_1_1Course1Semester1User13.setGradeBiology(user13Biology);
            grade_is_1_1Course1Semester1User13.setGradeStory(user13Story);
            grade_is_1_1Course1Semester1User13.setGradeSocialScience(user13SocialScience);
            grade_is_1_1Course1Semester1User13.setGradeGeography(user13Geography);
            grade_is_1_1Course1Semester1User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_is_1_1Course1Semester1User13.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User13);
//            //user14

            grade_is_1_1Course1Semester1User14.setUsername(user14Username);
            grade_is_1_1Course1Semester1User14.setGradeRussianLanguage(user14RussianLanguage);
            grade_is_1_1Course1Semester1User14.setGradeLiterature(user14Literature);
            grade_is_1_1Course1Semester1User14.setGradeMathematics(user14Mathematics);
            grade_is_1_1Course1Semester1User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_is_1_1Course1Semester1User14.setGradeComputerScience(user14ComputerScience);
            grade_is_1_1Course1Semester1User14.setGradePhysics(user14Physics);
            grade_is_1_1Course1Semester1User14.setGradeBiology(user14Biology);
            grade_is_1_1Course1Semester1User14.setGradeStory(user14Story);
            grade_is_1_1Course1Semester1User14.setGradeSocialScience(user14SocialScience);
            grade_is_1_1Course1Semester1User14.setGradeGeography(user14Geography);
            grade_is_1_1Course1Semester1User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_is_1_1Course1Semester1User14.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User14);
//            //user15

            grade_is_1_1Course1Semester1User15.setUsername(user15Username);
            grade_is_1_1Course1Semester1User15.setGradeRussianLanguage(user15RussianLanguage);
            grade_is_1_1Course1Semester1User15.setGradeLiterature(user15Literature);
            grade_is_1_1Course1Semester1User15.setGradeMathematics(user15Mathematics);
            grade_is_1_1Course1Semester1User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_is_1_1Course1Semester1User15.setGradeComputerScience(user15ComputerScience);
            grade_is_1_1Course1Semester1User15.setGradePhysics(user15Physics);
            grade_is_1_1Course1Semester1User15.setGradeBiology(user15Biology);
            grade_is_1_1Course1Semester1User15.setGradeStory(user15Story);
            grade_is_1_1Course1Semester1User15.setGradeSocialScience(user15SocialScience);
            grade_is_1_1Course1Semester1User15.setGradeGeography(user15Geography);
            grade_is_1_1Course1Semester1User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_is_1_1Course1Semester1User15.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User15);
//            //user16

            grade_is_1_1Course1Semester1User16.setUsername(user16Username);
            grade_is_1_1Course1Semester1User16.setGradeRussianLanguage(user16RussianLanguage);
            grade_is_1_1Course1Semester1User16.setGradeLiterature(user16Literature);
            grade_is_1_1Course1Semester1User16.setGradeMathematics(user16Mathematics);
            grade_is_1_1Course1Semester1User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_is_1_1Course1Semester1User16.setGradeComputerScience(user16ComputerScience);
            grade_is_1_1Course1Semester1User16.setGradePhysics(user16Physics);
            grade_is_1_1Course1Semester1User16.setGradeBiology(user16Biology);
            grade_is_1_1Course1Semester1User16.setGradeStory(user16Story);
            grade_is_1_1Course1Semester1User16.setGradeSocialScience(user16SocialScience);
            grade_is_1_1Course1Semester1User16.setGradeGeography(user16Geography);
            grade_is_1_1Course1Semester1User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_is_1_1Course1Semester1User16.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User16);


            //            //user17

            grade_is_1_1Course1Semester1User17.setUsername(user17Username);
            grade_is_1_1Course1Semester1User17.setGradeRussianLanguage(user17RussianLanguage);
            grade_is_1_1Course1Semester1User17.setGradeLiterature(user17Literature);
            grade_is_1_1Course1Semester1User17.setGradeMathematics(user17Mathematics);
            grade_is_1_1Course1Semester1User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_is_1_1Course1Semester1User17.setGradeComputerScience(user17ComputerScience);
            grade_is_1_1Course1Semester1User17.setGradePhysics(user17Physics);
            grade_is_1_1Course1Semester1User17.setGradeBiology(user17Biology);
            grade_is_1_1Course1Semester1User17.setGradeStory(user17Story);
            grade_is_1_1Course1Semester1User17.setGradeSocialScience(user17SocialScience);
            grade_is_1_1Course1Semester1User17.setGradeGeography(user17Geography);
            grade_is_1_1Course1Semester1User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_is_1_1Course1Semester1User17.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User17);

            //            //user18

            grade_is_1_1Course1Semester1User18.setUsername(user18Username);
            grade_is_1_1Course1Semester1User18.setGradeRussianLanguage(user18RussianLanguage);
            grade_is_1_1Course1Semester1User18.setGradeLiterature(user18Literature);
            grade_is_1_1Course1Semester1User18.setGradeMathematics(user18Mathematics);
            grade_is_1_1Course1Semester1User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_is_1_1Course1Semester1User18.setGradeComputerScience(user18ComputerScience);
            grade_is_1_1Course1Semester1User18.setGradePhysics(user18Physics);
            grade_is_1_1Course1Semester1User18.setGradeBiology(user18Biology);
            grade_is_1_1Course1Semester1User18.setGradeStory(user18Story);
            grade_is_1_1Course1Semester1User18.setGradeSocialScience(user18SocialScience);
            grade_is_1_1Course1Semester1User18.setGradeGeography(user18Geography);
            grade_is_1_1Course1Semester1User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_is_1_1Course1Semester1User18.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User18);


            //            //user19

            grade_is_1_1Course1Semester1User19.setUsername(user19Username);
            grade_is_1_1Course1Semester1User19.setGradeRussianLanguage(user19RussianLanguage);
            grade_is_1_1Course1Semester1User19.setGradeLiterature(user19Literature);
            grade_is_1_1Course1Semester1User19.setGradeMathematics(user19Mathematics);
            grade_is_1_1Course1Semester1User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_is_1_1Course1Semester1User19.setGradeComputerScience(user19ComputerScience);
            grade_is_1_1Course1Semester1User19.setGradePhysics(user19Physics);
            grade_is_1_1Course1Semester1User19.setGradeBiology(user19Biology);
            grade_is_1_1Course1Semester1User19.setGradeStory(user19Story);
            grade_is_1_1Course1Semester1User19.setGradeSocialScience(user19SocialScience);
            grade_is_1_1Course1Semester1User19.setGradeGeography(user19Geography);
            grade_is_1_1Course1Semester1User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_is_1_1Course1Semester1User19.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User19);

            //            //user20

            grade_is_1_1Course1Semester1User20.setUsername(user20Username);
            grade_is_1_1Course1Semester1User20.setGradeRussianLanguage(user20RussianLanguage);
            grade_is_1_1Course1Semester1User20.setGradeLiterature(user20Literature);
            grade_is_1_1Course1Semester1User20.setGradeMathematics(user20Mathematics);
            grade_is_1_1Course1Semester1User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_is_1_1Course1Semester1User20.setGradeComputerScience(user20ComputerScience);
            grade_is_1_1Course1Semester1User20.setGradePhysics(user20Physics);
            grade_is_1_1Course1Semester1User20.setGradeBiology(user20Biology);
            grade_is_1_1Course1Semester1User20.setGradeStory(user20Story);
            grade_is_1_1Course1Semester1User20.setGradeSocialScience(user20SocialScience);
            grade_is_1_1Course1Semester1User20.setGradeGeography(user20Geography);
            grade_is_1_1Course1Semester1User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_is_1_1Course1Semester1User20.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User20);

            //            //user21

            grade_is_1_1Course1Semester1User21.setUsername(user21Username);
            grade_is_1_1Course1Semester1User21.setGradeRussianLanguage(user21RussianLanguage);
            grade_is_1_1Course1Semester1User21.setGradeLiterature(user21Literature);
            grade_is_1_1Course1Semester1User21.setGradeMathematics(user21Mathematics);
            grade_is_1_1Course1Semester1User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_is_1_1Course1Semester1User21.setGradeComputerScience(user21ComputerScience);
            grade_is_1_1Course1Semester1User21.setGradePhysics(user21Physics);
            grade_is_1_1Course1Semester1User21.setGradeBiology(user21Biology);
            grade_is_1_1Course1Semester1User21.setGradeStory(user21Story);
            grade_is_1_1Course1Semester1User21.setGradeSocialScience(user21SocialScience);
            grade_is_1_1Course1Semester1User21.setGradeGeography(user21Geography);
            grade_is_1_1Course1Semester1User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_is_1_1Course1Semester1User21.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User21);

            //            //user22

            grade_is_1_1Course1Semester1User22.setUsername(user22Username);
            grade_is_1_1Course1Semester1User22.setGradeRussianLanguage(user22RussianLanguage);
            grade_is_1_1Course1Semester1User22.setGradeLiterature(user22Literature);
            grade_is_1_1Course1Semester1User22.setGradeMathematics(user22Mathematics);
            grade_is_1_1Course1Semester1User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_is_1_1Course1Semester1User22.setGradeComputerScience(user22ComputerScience);
            grade_is_1_1Course1Semester1User22.setGradePhysics(user22Physics);
            grade_is_1_1Course1Semester1User22.setGradeBiology(user22Biology);
            grade_is_1_1Course1Semester1User22.setGradeStory(user22Story);
            grade_is_1_1Course1Semester1User22.setGradeSocialScience(user22SocialScience);
            grade_is_1_1Course1Semester1User22.setGradeGeography(user22Geography);
            grade_is_1_1Course1Semester1User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_is_1_1Course1Semester1User22.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User22);

            //            //user23

            grade_is_1_1Course1Semester1User23.setUsername(user23Username);
            grade_is_1_1Course1Semester1User23.setGradeRussianLanguage(user23RussianLanguage);
            grade_is_1_1Course1Semester1User23.setGradeLiterature(user23Literature);
            grade_is_1_1Course1Semester1User23.setGradeMathematics(user23Mathematics);
            grade_is_1_1Course1Semester1User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_is_1_1Course1Semester1User23.setGradeComputerScience(user23ComputerScience);
            grade_is_1_1Course1Semester1User23.setGradePhysics(user23Physics);
            grade_is_1_1Course1Semester1User23.setGradeBiology(user23Biology);
            grade_is_1_1Course1Semester1User23.setGradeStory(user23Story);
            grade_is_1_1Course1Semester1User23.setGradeSocialScience(user23SocialScience);
            grade_is_1_1Course1Semester1User23.setGradeGeography(user23Geography);
            grade_is_1_1Course1Semester1User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_is_1_1Course1Semester1User23.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User23);

            //            //user24

            grade_is_1_1Course1Semester1User24.setUsername(user24Username);
            grade_is_1_1Course1Semester1User24.setGradeRussianLanguage(user24RussianLanguage);
            grade_is_1_1Course1Semester1User24.setGradeLiterature(user24Literature);
            grade_is_1_1Course1Semester1User24.setGradeMathematics(user24Mathematics);
            grade_is_1_1Course1Semester1User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_is_1_1Course1Semester1User24.setGradeComputerScience(user24ComputerScience);
            grade_is_1_1Course1Semester1User24.setGradePhysics(user24Physics);
            grade_is_1_1Course1Semester1User24.setGradeBiology(user24Biology);
            grade_is_1_1Course1Semester1User24.setGradeStory(user24Story);
            grade_is_1_1Course1Semester1User24.setGradeSocialScience(user24SocialScience);
            grade_is_1_1Course1Semester1User24.setGradeGeography(user24Geography);
            grade_is_1_1Course1Semester1User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_is_1_1Course1Semester1User24.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User24);

            //            //user25

            grade_is_1_1Course1Semester1User25.setUsername(user25Username);
            grade_is_1_1Course1Semester1User25.setGradeRussianLanguage(user25RussianLanguage);
            grade_is_1_1Course1Semester1User25.setGradeLiterature(user25Literature);
            grade_is_1_1Course1Semester1User25.setGradeMathematics(user25Mathematics);
            grade_is_1_1Course1Semester1User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_is_1_1Course1Semester1User25.setGradeComputerScience(user25ComputerScience);
            grade_is_1_1Course1Semester1User25.setGradePhysics(user25Physics);
            grade_is_1_1Course1Semester1User25.setGradeBiology(user25Biology);
            grade_is_1_1Course1Semester1User25.setGradeStory(user25Story);
            grade_is_1_1Course1Semester1User25.setGradeSocialScience(user25SocialScience);
            grade_is_1_1Course1Semester1User25.setGradeGeography(user25Geography);
            grade_is_1_1Course1Semester1User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_is_1_1Course1Semester1User25.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User25);

            //            //user26

            grade_is_1_1Course1Semester1User26.setUsername(user26Username);
            grade_is_1_1Course1Semester1User26.setGradeRussianLanguage(user26RussianLanguage);
            grade_is_1_1Course1Semester1User26.setGradeLiterature(user26Literature);
            grade_is_1_1Course1Semester1User26.setGradeMathematics(user26Mathematics);
            grade_is_1_1Course1Semester1User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_is_1_1Course1Semester1User26.setGradeComputerScience(user26ComputerScience);
            grade_is_1_1Course1Semester1User26.setGradePhysics(user26Physics);
            grade_is_1_1Course1Semester1User26.setGradeBiology(user26Biology);
            grade_is_1_1Course1Semester1User26.setGradeStory(user26Story);
            grade_is_1_1Course1Semester1User26.setGradeSocialScience(user26SocialScience);
            grade_is_1_1Course1Semester1User26.setGradeGeography(user26Geography);
            grade_is_1_1Course1Semester1User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_is_1_1Course1Semester1User26.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User26);

            //            //user27

            grade_is_1_1Course1Semester1User27.setUsername(user27Username);
            grade_is_1_1Course1Semester1User27.setGradeRussianLanguage(user27RussianLanguage);
            grade_is_1_1Course1Semester1User27.setGradeLiterature(user27Literature);
            grade_is_1_1Course1Semester1User27.setGradeMathematics(user27Mathematics);
            grade_is_1_1Course1Semester1User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_is_1_1Course1Semester1User27.setGradeComputerScience(user27ComputerScience);
            grade_is_1_1Course1Semester1User27.setGradePhysics(user27Physics);
            grade_is_1_1Course1Semester1User27.setGradeBiology(user27Biology);
            grade_is_1_1Course1Semester1User27.setGradeStory(user27Story);
            grade_is_1_1Course1Semester1User27.setGradeSocialScience(user27SocialScience);
            grade_is_1_1Course1Semester1User27.setGradeGeography(user27Geography);
            grade_is_1_1Course1Semester1User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_is_1_1Course1Semester1User27.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User27);

            //            //user28

            grade_is_1_1Course1Semester1User28.setUsername(user28Username);
            grade_is_1_1Course1Semester1User28.setGradeRussianLanguage(user28RussianLanguage);
            grade_is_1_1Course1Semester1User28.setGradeLiterature(user28Literature);
            grade_is_1_1Course1Semester1User28.setGradeMathematics(user28Mathematics);
            grade_is_1_1Course1Semester1User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_is_1_1Course1Semester1User28.setGradeComputerScience(user28ComputerScience);
            grade_is_1_1Course1Semester1User28.setGradePhysics(user28Physics);
            grade_is_1_1Course1Semester1User28.setGradeBiology(user28Biology);
            grade_is_1_1Course1Semester1User28.setGradeStory(user28Story);
            grade_is_1_1Course1Semester1User28.setGradeSocialScience(user28SocialScience);
            grade_is_1_1Course1Semester1User28.setGradeGeography(user28Geography);
            grade_is_1_1Course1Semester1User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_is_1_1Course1Semester1User28.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User28);

            //            //user29

            grade_is_1_1Course1Semester1User29.setUsername(user29Username);
            grade_is_1_1Course1Semester1User29.setGradeRussianLanguage(user29RussianLanguage);
            grade_is_1_1Course1Semester1User29.setGradeLiterature(user29Literature);
            grade_is_1_1Course1Semester1User29.setGradeMathematics(user29Mathematics);
            grade_is_1_1Course1Semester1User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_is_1_1Course1Semester1User29.setGradeComputerScience(user29ComputerScience);
            grade_is_1_1Course1Semester1User29.setGradePhysics(user29Physics);
            grade_is_1_1Course1Semester1User29.setGradeBiology(user29Biology);
            grade_is_1_1Course1Semester1User29.setGradeStory(user29Story);
            grade_is_1_1Course1Semester1User29.setGradeSocialScience(user29SocialScience);
            grade_is_1_1Course1Semester1User29.setGradeGeography(user29Geography);
            grade_is_1_1Course1Semester1User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_is_1_1Course1Semester1User29.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User29);

            //            //user30

            grade_is_1_1Course1Semester1User30.setUsername(user30Username);
            grade_is_1_1Course1Semester1User30.setGradeRussianLanguage(user30RussianLanguage);
            grade_is_1_1Course1Semester1User30.setGradeLiterature(user30Literature);
            grade_is_1_1Course1Semester1User30.setGradeMathematics(user30Mathematics);
            grade_is_1_1Course1Semester1User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_is_1_1Course1Semester1User30.setGradeComputerScience(user30ComputerScience);
            grade_is_1_1Course1Semester1User30.setGradePhysics(user30Physics);
            grade_is_1_1Course1Semester1User30.setGradeBiology(user30Biology);
            grade_is_1_1Course1Semester1User30.setGradeStory(user30Story);
            grade_is_1_1Course1Semester1User30.setGradeSocialScience(user30SocialScience);
            grade_is_1_1Course1Semester1User30.setGradeGeography(user30Geography);
            grade_is_1_1Course1Semester1User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_is_1_1Course1Semester1User30.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User30);

            //            //user31

            grade_is_1_1Course1Semester1User31.setUsername(user31Username);
            grade_is_1_1Course1Semester1User31.setGradeRussianLanguage(user31RussianLanguage);
            grade_is_1_1Course1Semester1User31.setGradeLiterature(user31Literature);
            grade_is_1_1Course1Semester1User31.setGradeMathematics(user31Mathematics);
            grade_is_1_1Course1Semester1User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_is_1_1Course1Semester1User31.setGradeComputerScience(user31ComputerScience);
            grade_is_1_1Course1Semester1User31.setGradePhysics(user31Physics);
            grade_is_1_1Course1Semester1User31.setGradeBiology(user31Biology);
            grade_is_1_1Course1Semester1User31.setGradeStory(user31Story);
            grade_is_1_1Course1Semester1User31.setGradeSocialScience(user31SocialScience);
            grade_is_1_1Course1Semester1User31.setGradeGeography(user31Geography);
            grade_is_1_1Course1Semester1User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_is_1_1Course1Semester1User31.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User31);

            //            //user32

            grade_is_1_1Course1Semester1User32.setUsername(user32Username);
            grade_is_1_1Course1Semester1User32.setGradeRussianLanguage(user32RussianLanguage);
            grade_is_1_1Course1Semester1User32.setGradeLiterature(user32Literature);
            grade_is_1_1Course1Semester1User32.setGradeMathematics(user32Mathematics);
            grade_is_1_1Course1Semester1User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_is_1_1Course1Semester1User32.setGradeComputerScience(user32ComputerScience);
            grade_is_1_1Course1Semester1User32.setGradePhysics(user32Physics);
            grade_is_1_1Course1Semester1User32.setGradeBiology(user32Biology);
            grade_is_1_1Course1Semester1User32.setGradeStory(user32Story);
            grade_is_1_1Course1Semester1User32.setGradeSocialScience(user32SocialScience);
            grade_is_1_1Course1Semester1User32.setGradeGeography(user32Geography);
            grade_is_1_1Course1Semester1User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_is_1_1Course1Semester1User32.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User32);

            //            //user33

            grade_is_1_1Course1Semester1User33.setUsername(user33Username);
            grade_is_1_1Course1Semester1User33.setGradeRussianLanguage(user33RussianLanguage);
            grade_is_1_1Course1Semester1User33.setGradeLiterature(user33Literature);
            grade_is_1_1Course1Semester1User33.setGradeMathematics(user33Mathematics);
            grade_is_1_1Course1Semester1User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_is_1_1Course1Semester1User33.setGradeComputerScience(user33ComputerScience);
            grade_is_1_1Course1Semester1User33.setGradePhysics(user33Physics);
            grade_is_1_1Course1Semester1User33.setGradeBiology(user33Biology);
            grade_is_1_1Course1Semester1User33.setGradeStory(user33Story);
            grade_is_1_1Course1Semester1User33.setGradeSocialScience(user33SocialScience);
            grade_is_1_1Course1Semester1User33.setGradeGeography(user33Geography);
            grade_is_1_1Course1Semester1User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_is_1_1Course1Semester1User33.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User33);

            //            //user34

            grade_is_1_1Course1Semester1User34.setUsername(user34Username);
            grade_is_1_1Course1Semester1User34.setGradeRussianLanguage(user34RussianLanguage);
            grade_is_1_1Course1Semester1User34.setGradeLiterature(user34Literature);
            grade_is_1_1Course1Semester1User34.setGradeMathematics(user34Mathematics);
            grade_is_1_1Course1Semester1User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_is_1_1Course1Semester1User34.setGradeComputerScience(user34ComputerScience);
            grade_is_1_1Course1Semester1User34.setGradePhysics(user34Physics);
            grade_is_1_1Course1Semester1User34.setGradeBiology(user34Biology);
            grade_is_1_1Course1Semester1User34.setGradeStory(user34Story);
            grade_is_1_1Course1Semester1User34.setGradeSocialScience(user34SocialScience);
            grade_is_1_1Course1Semester1User34.setGradeGeography(user34Geography);
            grade_is_1_1Course1Semester1User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_is_1_1Course1Semester1User34.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User34);

            //            //user35

            grade_is_1_1Course1Semester1User35.setUsername(user35Username);
            grade_is_1_1Course1Semester1User35.setGradeRussianLanguage(user35RussianLanguage);
            grade_is_1_1Course1Semester1User35.setGradeLiterature(user35Literature);
            grade_is_1_1Course1Semester1User35.setGradeMathematics(user35Mathematics);
            grade_is_1_1Course1Semester1User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_is_1_1Course1Semester1User35.setGradeComputerScience(user35ComputerScience);
            grade_is_1_1Course1Semester1User35.setGradePhysics(user35Physics);
            grade_is_1_1Course1Semester1User35.setGradeBiology(user35Biology);
            grade_is_1_1Course1Semester1User35.setGradeStory(user35Story);
            grade_is_1_1Course1Semester1User35.setGradeSocialScience(user35SocialScience);
            grade_is_1_1Course1Semester1User35.setGradeGeography(user35Geography);
            grade_is_1_1Course1Semester1User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_is_1_1Course1Semester1User35.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User35);

            //            //user36

            grade_is_1_1Course1Semester1User36.setUsername(user36Username);
            grade_is_1_1Course1Semester1User36.setGradeRussianLanguage(user36RussianLanguage);
            grade_is_1_1Course1Semester1User36.setGradeLiterature(user36Literature);
            grade_is_1_1Course1Semester1User36.setGradeMathematics(user36Mathematics);
            grade_is_1_1Course1Semester1User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_is_1_1Course1Semester1User36.setGradeComputerScience(user36ComputerScience);
            grade_is_1_1Course1Semester1User36.setGradePhysics(user36Physics);
            grade_is_1_1Course1Semester1User36.setGradeBiology(user36Biology);
            grade_is_1_1Course1Semester1User36.setGradeStory(user36Story);
            grade_is_1_1Course1Semester1User36.setGradeSocialScience(user36SocialScience);
            grade_is_1_1Course1Semester1User36.setGradeGeography(user36Geography);
            grade_is_1_1Course1Semester1User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_is_1_1Course1Semester1User36.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User36);

            //            //user37

            grade_is_1_1Course1Semester1User37.setUsername(user37Username);
            grade_is_1_1Course1Semester1User37.setGradeRussianLanguage(user37RussianLanguage);
            grade_is_1_1Course1Semester1User37.setGradeLiterature(user37Literature);
            grade_is_1_1Course1Semester1User37.setGradeMathematics(user37Mathematics);
            grade_is_1_1Course1Semester1User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_is_1_1Course1Semester1User37.setGradeComputerScience(user37ComputerScience);
            grade_is_1_1Course1Semester1User37.setGradePhysics(user37Physics);
            grade_is_1_1Course1Semester1User37.setGradeBiology(user37Biology);
            grade_is_1_1Course1Semester1User37.setGradeStory(user37Story);
            grade_is_1_1Course1Semester1User37.setGradeSocialScience(user37SocialScience);
            grade_is_1_1Course1Semester1User37.setGradeGeography(user37Geography);
            grade_is_1_1Course1Semester1User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_is_1_1Course1Semester1User37.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User37);

            //            //user38

            grade_is_1_1Course1Semester1User38.setUsername(user38Username);
            grade_is_1_1Course1Semester1User38.setGradeRussianLanguage(user38RussianLanguage);
            grade_is_1_1Course1Semester1User38.setGradeLiterature(user38Literature);
            grade_is_1_1Course1Semester1User38.setGradeMathematics(user38Mathematics);
            grade_is_1_1Course1Semester1User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_is_1_1Course1Semester1User38.setGradeComputerScience(user38ComputerScience);
            grade_is_1_1Course1Semester1User38.setGradePhysics(user38Physics);
            grade_is_1_1Course1Semester1User38.setGradeBiology(user38Biology);
            grade_is_1_1Course1Semester1User38.setGradeStory(user38Story);
            grade_is_1_1Course1Semester1User38.setGradeSocialScience(user38SocialScience);
            grade_is_1_1Course1Semester1User38.setGradeGeography(user38Geography);
            grade_is_1_1Course1Semester1User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_is_1_1Course1Semester1User38.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User38);

            //            //user39

            grade_is_1_1Course1Semester1User39.setUsername(user39Username);
            grade_is_1_1Course1Semester1User39.setGradeRussianLanguage(user39RussianLanguage);
            grade_is_1_1Course1Semester1User39.setGradeLiterature(user39Literature);
            grade_is_1_1Course1Semester1User39.setGradeMathematics(user39Mathematics);
            grade_is_1_1Course1Semester1User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_is_1_1Course1Semester1User39.setGradeComputerScience(user39ComputerScience);
            grade_is_1_1Course1Semester1User39.setGradePhysics(user39Physics);
            grade_is_1_1Course1Semester1User39.setGradeBiology(user39Biology);
            grade_is_1_1Course1Semester1User39.setGradeStory(user39Story);
            grade_is_1_1Course1Semester1User39.setGradeSocialScience(user39SocialScience);
            grade_is_1_1Course1Semester1User39.setGradeGeography(user39Geography);
            grade_is_1_1Course1Semester1User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_is_1_1Course1Semester1User39.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User39);

            //            //user40

            grade_is_1_1Course1Semester1User40.setUsername(user40Username);
            grade_is_1_1Course1Semester1User40.setGradeRussianLanguage(user40RussianLanguage);
            grade_is_1_1Course1Semester1User40.setGradeLiterature(user40Literature);
            grade_is_1_1Course1Semester1User40.setGradeMathematics(user40Mathematics);
            grade_is_1_1Course1Semester1User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_is_1_1Course1Semester1User40.setGradeComputerScience(user40ComputerScience);
            grade_is_1_1Course1Semester1User40.setGradePhysics(user40Physics);
            grade_is_1_1Course1Semester1User40.setGradeBiology(user40Biology);
            grade_is_1_1Course1Semester1User40.setGradeStory(user40Story);
            grade_is_1_1Course1Semester1User40.setGradeSocialScience(user40SocialScience);
            grade_is_1_1Course1Semester1User40.setGradeGeography(user40Geography);
            grade_is_1_1Course1Semester1User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_is_1_1Course1Semester1User40.setInputGroup(inputGroup);
            grade_is_1_1Course1Semester1Repository.save(grade_is_1_1Course1Semester1User40);

        } catch (Exception ignore) {

        }

    }

}
