package com.example.demoauth.service.moderatorService.moderator_is1Service.course1;

import com.example.demoauth.models.grade_is1.models.course1.Grade_IS_1_1Course1Semester2;
import com.example.demoauth.repository.is1Repository.course1.Grade_IS_1_1Course1Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1Course1Semester2 {
    @Autowired
    Grade_IS_1_1Course1Semester2Repository grade_is_1_1Course1Semester2Repository;

    //GetMappingGradeCourse1Semester2
    public void getMappingModer_is_1_1GreadeСourse1Semester2(@PathVariable String month, Model model) {
        List<Grade_IS_1_1Course1Semester2> res = grade_is_1_1Course1Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(Grade_IS_1_1Course1Semester2::getUserID));
        List<Grade_IS_1_1Course1Semester2> voidList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> januaryList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> februaryList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> marchList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> aprilList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> mayList = new ArrayList<>();
        List<Grade_IS_1_1Course1Semester2> juneList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new Grade_IS_1_1Course1Semester2());
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

    //PostMappingGradeCourse1Semester2
    public void postMappingMethodModer_is_1_1GreadeСourse1Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades, @PathVariable String month) {
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
            String user1Chemistry = splitUser1Grades[8];
            String user1Story = splitUser1Grades[9];
            String user1SocialScience = splitUser1Grades[10];
            String user1PhysicalTraining = splitUser1Grades[11];
            String user1SecurityBasics = splitUser1Grades[12];
            String user1NativeLiterature = splitUser1Grades[13];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2RussianLanguage = splitUser2Grades[2];
            String user2Literature = splitUser2Grades[3];
            String user2Mathematics = splitUser2Grades[4];
            String user2EnglishLanguage = splitUser2Grades[5];
            String user2ComputerScience = splitUser2Grades[6];
            String user2Physics = splitUser2Grades[7];
            String user2Chemistry = splitUser2Grades[8];
            String user2Story = splitUser2Grades[9];
            String user2SocialScience = splitUser2Grades[10];
            String user2PhysicalTraining = splitUser2Grades[11];
            String user2SecurityBasics = splitUser2Grades[12];
            String user2NativeLiterature = splitUser2Grades[13];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3RussianLanguage = splitUser3Grades[2];
            String user3Literature = splitUser3Grades[3];
            String user3Mathematics = splitUser3Grades[4];
            String user3EnglishLanguage = splitUser3Grades[5];
            String user3ComputerScience = splitUser3Grades[6];
            String user3Physics = splitUser3Grades[7];
            String user3Chemistry = splitUser3Grades[8];
            String user3Story = splitUser3Grades[9];
            String user3SocialScience = splitUser3Grades[10];
            String user3PhysicalTraining = splitUser3Grades[11];
            String user3SecurityBasics = splitUser3Grades[12];
            String user3NativeLiterature = splitUser3Grades[13];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4RussianLanguage = splitUser4Grades[2];
            String user4Literature = splitUser4Grades[3];
            String user4Mathematics = splitUser4Grades[4];
            String user4EnglishLanguage = splitUser4Grades[5];
            String user4ComputerScience = splitUser4Grades[6];
            String user4Physics = splitUser4Grades[7];
            String user4Chemistry = splitUser4Grades[8];
            String user4Story = splitUser4Grades[9];
            String user4SocialScience = splitUser4Grades[10];
            String user4PhysicalTraining = splitUser4Grades[11];
            String user4SecurityBasics = splitUser4Grades[12];
            String user4NativeLiterature = splitUser4Grades[13];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5RussianLanguage = splitUser5Grades[2];
            String user5Literature = splitUser5Grades[3];
            String user5Mathematics = splitUser5Grades[4];
            String user5EnglishLanguage = splitUser5Grades[5];
            String user5ComputerScience = splitUser5Grades[6];
            String user5Physics = splitUser5Grades[7];
            String user5Chemistry = splitUser5Grades[8];
            String user5Story = splitUser5Grades[9];
            String user5SocialScience = splitUser5Grades[10];
            String user5PhysicalTraining = splitUser5Grades[11];
            String user5SecurityBasics = splitUser5Grades[12];
            String user5NativeLiterature = splitUser5Grades[13];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6RussianLanguage = splitUser6Grades[2];
            String user6Literature = splitUser6Grades[3];
            String user6Mathematics = splitUser6Grades[4];
            String user6EnglishLanguage = splitUser6Grades[5];
            String user6ComputerScience = splitUser6Grades[6];
            String user6Physics = splitUser6Grades[7];
            String user6Chemistry = splitUser6Grades[8];
            String user6Story = splitUser6Grades[9];
            String user6SocialScience = splitUser6Grades[10];
            String user6PhysicalTraining = splitUser6Grades[11];
            String user6SecurityBasics = splitUser6Grades[12];
            String user6NativeLiterature = splitUser6Grades[13];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7RussianLanguage = splitUser7Grades[2];
            String user7Literature = splitUser7Grades[3];
            String user7Mathematics = splitUser7Grades[4];
            String user7EnglishLanguage = splitUser7Grades[5];
            String user7ComputerScience = splitUser7Grades[6];
            String user7Physics = splitUser7Grades[7];
            String user7Chemistry = splitUser7Grades[8];
            String user7Story = splitUser7Grades[9];
            String user7SocialScience = splitUser7Grades[10];
            String user7PhysicalTraining = splitUser7Grades[11];
            String user7SecurityBasics = splitUser7Grades[12];
            String user7NativeLiterature = splitUser7Grades[13];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8RussianLanguage = splitUser8Grades[2];
            String user8Literature = splitUser8Grades[3];
            String user8Mathematics = splitUser8Grades[4];
            String user8EnglishLanguage = splitUser8Grades[5];
            String user8ComputerScience = splitUser8Grades[6];
            String user8Physics = splitUser8Grades[7];
            String user8Chemistry = splitUser8Grades[8];
            String user8Story = splitUser8Grades[9];
            String user8SocialScience = splitUser8Grades[10];
            String user8PhysicalTraining = splitUser8Grades[11];
            String user8SecurityBasics = splitUser8Grades[12];
            String user8NativeLiterature = splitUser8Grades[13];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9RussianLanguage = splitUser9Grades[2];
            String user9Literature = splitUser9Grades[3];
            String user9Mathematics = splitUser9Grades[4];
            String user9EnglishLanguage = splitUser9Grades[5];
            String user9ComputerScience = splitUser9Grades[6];
            String user9Physics = splitUser9Grades[7];
            String user9Chemistry = splitUser9Grades[8];
            String user9Story = splitUser9Grades[9];
            String user9SocialScience = splitUser9Grades[10];
            String user9PhysicalTraining = splitUser9Grades[11];
            String user9SecurityBasics = splitUser9Grades[12];
            String user9NativeLiterature = splitUser9Grades[13];


            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10RussianLanguage = splitUser10Grades[2];
            String user10Literature = splitUser10Grades[3];
            String user10Mathematics = splitUser10Grades[4];
            String user10EnglishLanguage = splitUser10Grades[5];
            String user10ComputerScience = splitUser10Grades[6];
            String user10Physics = splitUser10Grades[7];
            String user10Chemistry = splitUser10Grades[8];
            String user10Story = splitUser10Grades[9];
            String user10SocialScience = splitUser10Grades[10];
            String user10PhysicalTraining = splitUser10Grades[11];
            String user10SecurityBasics = splitUser10Grades[12];
            String user10NativeLiterature = splitUser10Grades[13];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11RussianLanguage = splitUser11Grades[2];
            String user11Literature = splitUser11Grades[3];
            String user11Mathematics = splitUser11Grades[4];
            String user11EnglishLanguage = splitUser11Grades[5];
            String user11ComputerScience = splitUser11Grades[6];
            String user11Physics = splitUser11Grades[7];
            String user11Chemistry = splitUser11Grades[8];
            String user11Story = splitUser11Grades[9];
            String user11SocialScience = splitUser11Grades[10];
            String user11PhysicalTraining = splitUser11Grades[11];
            String user11SecurityBasics = splitUser11Grades[12];
            String user11NativeLiterature = splitUser11Grades[13];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12RussianLanguage = splitUser12Grades[2];
            String user12Literature = splitUser12Grades[3];
            String user12Mathematics = splitUser12Grades[4];
            String user12EnglishLanguage = splitUser12Grades[5];
            String user12ComputerScience = splitUser12Grades[6];
            String user12Physics = splitUser12Grades[7];
            String user12Chemistry = splitUser12Grades[8];
            String user12Story = splitUser12Grades[9];
            String user12SocialScience = splitUser12Grades[10];
            String user12PhysicalTraining = splitUser12Grades[11];
            String user12SecurityBasics = splitUser12Grades[12];
            String user12NativeLiterature = splitUser12Grades[13];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13RussianLanguage = splitUser13Grades[2];
            String user13Literature = splitUser13Grades[3];
            String user13Mathematics = splitUser13Grades[4];
            String user13EnglishLanguage = splitUser13Grades[5];
            String user13ComputerScience = splitUser13Grades[6];
            String user13Physics = splitUser13Grades[7];
            String user13Chemistry = splitUser13Grades[8];
            String user13Story = splitUser13Grades[9];
            String user13SocialScience = splitUser13Grades[10];
            String user13PhysicalTraining = splitUser13Grades[11];
            String user13SecurityBasics = splitUser13Grades[12];
            String user13NativeLiterature = splitUser13Grades[13];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14RussianLanguage = splitUser14Grades[2];
            String user14Literature = splitUser14Grades[3];
            String user14Mathematics = splitUser14Grades[4];
            String user14EnglishLanguage = splitUser14Grades[5];
            String user14ComputerScience = splitUser14Grades[6];
            String user14Physics = splitUser14Grades[7];
            String user14Chemistry = splitUser14Grades[8];
            String user14Story = splitUser14Grades[9];
            String user14SocialScience = splitUser14Grades[10];
            String user14PhysicalTraining = splitUser14Grades[11];
            String user14SecurityBasics = splitUser14Grades[12];
            String user14NativeLiterature = splitUser14Grades[13];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15RussianLanguage = splitUser15Grades[2];
            String user15Literature = splitUser15Grades[3];
            String user15Mathematics = splitUser15Grades[4];
            String user15EnglishLanguage = splitUser15Grades[5];
            String user15ComputerScience = splitUser15Grades[6];
            String user15Physics = splitUser15Grades[7];
            String user15Chemistry = splitUser15Grades[8];
            String user15Story = splitUser15Grades[9];
            String user15SocialScience = splitUser15Grades[10];
            String user15PhysicalTraining = splitUser15Grades[11];
            String user15SecurityBasics = splitUser15Grades[12];
            String user15NativeLiterature = splitUser15Grades[13];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16RussianLanguage = splitUser16Grades[2];
            String user16Literature = splitUser16Grades[3];
            String user16Mathematics = splitUser16Grades[4];
            String user16EnglishLanguage = splitUser16Grades[5];
            String user16ComputerScience = splitUser16Grades[6];
            String user16Physics = splitUser16Grades[7];
            String user16Chemistry = splitUser16Grades[8];
            String user16Story = splitUser16Grades[9];
            String user16SocialScience = splitUser16Grades[10];
            String user16PhysicalTraining = splitUser16Grades[11];
            String user16SecurityBasics = splitUser16Grades[12];
            String user16NativeLiterature = splitUser16Grades[13];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17RussianLanguage = splitUser17Grades[2];
            String user17Literature = splitUser17Grades[3];
            String user17Mathematics = splitUser17Grades[4];
            String user17EnglishLanguage = splitUser17Grades[5];
            String user17ComputerScience = splitUser17Grades[6];
            String user17Physics = splitUser17Grades[7];
            String user17Chemistry = splitUser17Grades[8];
            String user17Story = splitUser17Grades[9];
            String user17SocialScience = splitUser17Grades[10];
            String user17PhysicalTraining = splitUser17Grades[11];
            String user17SecurityBasics = splitUser17Grades[12];
            String user17NativeLiterature = splitUser17Grades[13];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18RussianLanguage = splitUser18Grades[2];
            String user18Literature = splitUser18Grades[3];
            String user18Mathematics = splitUser18Grades[4];
            String user18EnglishLanguage = splitUser18Grades[5];
            String user18ComputerScience = splitUser18Grades[6];
            String user18Physics = splitUser18Grades[7];
            String user18Chemistry = splitUser18Grades[8];
            String user18Story = splitUser18Grades[9];
            String user18SocialScience = splitUser18Grades[10];
            String user18PhysicalTraining = splitUser18Grades[11];
            String user18SecurityBasics = splitUser18Grades[12];
            String user18NativeLiterature = splitUser18Grades[13];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19RussianLanguage = splitUser19Grades[2];
            String user19Literature = splitUser19Grades[3];
            String user19Mathematics = splitUser19Grades[4];
            String user19EnglishLanguage = splitUser19Grades[5];
            String user19ComputerScience = splitUser19Grades[6];
            String user19Physics = splitUser19Grades[7];
            String user19Chemistry = splitUser19Grades[8];
            String user19Story = splitUser19Grades[9];
            String user19SocialScience = splitUser19Grades[10];
            String user19PhysicalTraining = splitUser19Grades[11];
            String user19SecurityBasics = splitUser19Grades[12];
            String user19NativeLiterature = splitUser19Grades[13];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20RussianLanguage = splitUser20Grades[2];
            String user20Literature = splitUser20Grades[3];
            String user20Mathematics = splitUser20Grades[4];
            String user20EnglishLanguage = splitUser20Grades[5];
            String user20ComputerScience = splitUser20Grades[6];
            String user20Physics = splitUser20Grades[7];
            String user20Chemistry = splitUser20Grades[8];
            String user20Story = splitUser20Grades[9];
            String user20SocialScience = splitUser20Grades[10];
            String user20PhysicalTraining = splitUser20Grades[11];
            String user20SecurityBasics = splitUser20Grades[12];
            String user20NativeLiterature = splitUser20Grades[13];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21RussianLanguage = splitUser21Grades[2];
            String user21Literature = splitUser21Grades[3];
            String user21Mathematics = splitUser21Grades[4];
            String user21EnglishLanguage = splitUser21Grades[5];
            String user21ComputerScience = splitUser21Grades[6];
            String user21Physics = splitUser21Grades[7];
            String user21Chemistry = splitUser21Grades[8];
            String user21Story = splitUser21Grades[9];
            String user21SocialScience = splitUser21Grades[10];
            String user21PhysicalTraining = splitUser21Grades[11];
            String user21SecurityBasics = splitUser21Grades[12];
            String user21NativeLiterature = splitUser21Grades[13];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22RussianLanguage = splitUser22Grades[2];
            String user22Literature = splitUser22Grades[3];
            String user22Mathematics = splitUser22Grades[4];
            String user22EnglishLanguage = splitUser22Grades[5];
            String user22ComputerScience = splitUser22Grades[6];
            String user22Physics = splitUser22Grades[7];
            String user22Chemistry = splitUser22Grades[8];
            String user22Story = splitUser22Grades[9];
            String user22SocialScience = splitUser22Grades[10];
            String user22PhysicalTraining = splitUser22Grades[11];
            String user22SecurityBasics = splitUser22Grades[12];
            String user22NativeLiterature = splitUser22Grades[13];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23RussianLanguage = splitUser23Grades[2];
            String user23Literature = splitUser23Grades[3];
            String user23Mathematics = splitUser23Grades[4];
            String user23EnglishLanguage = splitUser23Grades[5];
            String user23ComputerScience = splitUser23Grades[6];
            String user23Physics = splitUser23Grades[7];
            String user23Chemistry = splitUser23Grades[8];
            String user23Story = splitUser23Grades[9];
            String user23SocialScience = splitUser23Grades[10];
            String user23PhysicalTraining = splitUser23Grades[11];
            String user23SecurityBasics = splitUser23Grades[12];
            String user23NativeLiterature = splitUser23Grades[13];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24RussianLanguage = splitUser24Grades[2];
            String user24Literature = splitUser24Grades[3];
            String user24Mathematics = splitUser24Grades[4];
            String user24EnglishLanguage = splitUser24Grades[5];
            String user24ComputerScience = splitUser24Grades[6];
            String user24Physics = splitUser24Grades[7];
            String user24Chemistry = splitUser24Grades[8];
            String user24Story = splitUser24Grades[9];
            String user24SocialScience = splitUser24Grades[10];
            String user24PhysicalTraining = splitUser24Grades[11];
            String user24SecurityBasics = splitUser24Grades[12];
            String user24NativeLiterature = splitUser24Grades[13];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25RussianLanguage = splitUser25Grades[2];
            String user25Literature = splitUser25Grades[3];
            String user25Mathematics = splitUser25Grades[4];
            String user25EnglishLanguage = splitUser25Grades[5];
            String user25ComputerScience = splitUser25Grades[6];
            String user25Physics = splitUser25Grades[7];
            String user25Chemistry = splitUser25Grades[8];
            String user25Story = splitUser25Grades[9];
            String user25SocialScience = splitUser25Grades[10];
            String user25PhysicalTraining = splitUser25Grades[11];
            String user25SecurityBasics = splitUser25Grades[12];
            String user25NativeLiterature = splitUser25Grades[13];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26RussianLanguage = splitUser26Grades[2];
            String user26Literature = splitUser26Grades[3];
            String user26Mathematics = splitUser26Grades[4];
            String user26EnglishLanguage = splitUser26Grades[5];
            String user26ComputerScience = splitUser26Grades[6];
            String user26Physics = splitUser26Grades[7];
            String user26Chemistry = splitUser26Grades[8];
            String user26Story = splitUser26Grades[9];
            String user26SocialScience = splitUser26Grades[10];
            String user26PhysicalTraining = splitUser26Grades[11];
            String user26SecurityBasics = splitUser26Grades[12];
            String user26NativeLiterature = splitUser26Grades[13];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27RussianLanguage = splitUser27Grades[2];
            String user27Literature = splitUser27Grades[3];
            String user27Mathematics = splitUser27Grades[4];
            String user27EnglishLanguage = splitUser27Grades[5];
            String user27ComputerScience = splitUser27Grades[6];
            String user27Physics = splitUser27Grades[7];
            String user27Chemistry = splitUser27Grades[8];
            String user27Story = splitUser27Grades[9];
            String user27SocialScience = splitUser27Grades[10];
            String user27PhysicalTraining = splitUser27Grades[11];
            String user27SecurityBasics = splitUser27Grades[12];
            String user27NativeLiterature = splitUser27Grades[13];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28RussianLanguage = splitUser28Grades[2];
            String user28Literature = splitUser28Grades[3];
            String user28Mathematics = splitUser28Grades[4];
            String user28EnglishLanguage = splitUser28Grades[5];
            String user28ComputerScience = splitUser28Grades[6];
            String user28Physics = splitUser28Grades[7];
            String user28Chemistry = splitUser28Grades[8];
            String user28Story = splitUser28Grades[9];
            String user28SocialScience = splitUser28Grades[10];
            String user28PhysicalTraining = splitUser28Grades[11];
            String user28SecurityBasics = splitUser28Grades[12];
            String user28NativeLiterature = splitUser28Grades[13];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29RussianLanguage = splitUser29Grades[2];
            String user29Literature = splitUser29Grades[3];
            String user29Mathematics = splitUser29Grades[4];
            String user29EnglishLanguage = splitUser29Grades[5];
            String user29ComputerScience = splitUser29Grades[6];
            String user29Physics = splitUser29Grades[7];
            String user29Chemistry = splitUser29Grades[8];
            String user29Story = splitUser29Grades[9];
            String user29SocialScience = splitUser29Grades[10];
            String user29PhysicalTraining = splitUser29Grades[11];
            String user29SecurityBasics = splitUser29Grades[12];
            String user29NativeLiterature = splitUser29Grades[13];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30RussianLanguage = splitUser30Grades[2];
            String user30Literature = splitUser30Grades[3];
            String user30Mathematics = splitUser30Grades[4];
            String user30EnglishLanguage = splitUser30Grades[5];
            String user30ComputerScience = splitUser30Grades[6];
            String user30Physics = splitUser30Grades[7];
            String user30Chemistry = splitUser30Grades[8];
            String user30Story = splitUser30Grades[9];
            String user30SocialScience = splitUser30Grades[10];
            String user30PhysicalTraining = splitUser30Grades[11];
            String user30SecurityBasics = splitUser30Grades[12];
            String user30NativeLiterature = splitUser30Grades[13];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31RussianLanguage = splitUser31Grades[2];
            String user31Literature = splitUser31Grades[3];
            String user31Mathematics = splitUser31Grades[4];
            String user31EnglishLanguage = splitUser31Grades[5];
            String user31ComputerScience = splitUser31Grades[6];
            String user31Physics = splitUser31Grades[7];
            String user31Chemistry = splitUser31Grades[8];
            String user31Story = splitUser31Grades[9];
            String user31SocialScience = splitUser31Grades[10];
            String user31PhysicalTraining = splitUser31Grades[11];
            String user31SecurityBasics = splitUser31Grades[12];
            String user31NativeLiterature = splitUser31Grades[13];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32RussianLanguage = splitUser32Grades[2];
            String user32Literature = splitUser32Grades[3];
            String user32Mathematics = splitUser32Grades[4];
            String user32EnglishLanguage = splitUser32Grades[5];
            String user32ComputerScience = splitUser32Grades[6];
            String user32Physics = splitUser32Grades[7];
            String user32Chemistry = splitUser32Grades[8];
            String user32Story = splitUser32Grades[9];
            String user32SocialScience = splitUser32Grades[10];
            String user32PhysicalTraining = splitUser32Grades[11];
            String user32SecurityBasics = splitUser32Grades[12];
            String user32NativeLiterature = splitUser32Grades[13];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33RussianLanguage = splitUser33Grades[2];
            String user33Literature = splitUser33Grades[3];
            String user33Mathematics = splitUser33Grades[4];
            String user33EnglishLanguage = splitUser33Grades[5];
            String user33ComputerScience = splitUser33Grades[6];
            String user33Physics = splitUser33Grades[7];
            String user33Chemistry = splitUser33Grades[8];
            String user33Story = splitUser33Grades[9];
            String user33SocialScience = splitUser33Grades[10];
            String user33PhysicalTraining = splitUser33Grades[11];
            String user33SecurityBasics = splitUser33Grades[12];
            String user33NativeLiterature = splitUser33Grades[13];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34RussianLanguage = splitUser34Grades[2];
            String user34Literature = splitUser34Grades[3];
            String user34Mathematics = splitUser34Grades[4];
            String user34EnglishLanguage = splitUser34Grades[5];
            String user34ComputerScience = splitUser34Grades[6];
            String user34Physics = splitUser34Grades[7];
            String user34Chemistry = splitUser34Grades[8];
            String user34Story = splitUser34Grades[9];
            String user34SocialScience = splitUser34Grades[10];
            String user34PhysicalTraining = splitUser34Grades[11];
            String user34SecurityBasics = splitUser34Grades[12];
            String user34NativeLiterature = splitUser34Grades[13];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35RussianLanguage = splitUser35Grades[2];
            String user35Literature = splitUser35Grades[3];
            String user35Mathematics = splitUser35Grades[4];
            String user35EnglishLanguage = splitUser35Grades[5];
            String user35ComputerScience = splitUser35Grades[6];
            String user35Physics = splitUser35Grades[7];
            String user35Chemistry = splitUser35Grades[8];
            String user35Story = splitUser35Grades[9];
            String user35SocialScience = splitUser35Grades[10];
            String user35PhysicalTraining = splitUser35Grades[11];
            String user35SecurityBasics = splitUser35Grades[12];
            String user35NativeLiterature = splitUser35Grades[13];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36RussianLanguage = splitUser36Grades[2];
            String user36Literature = splitUser36Grades[3];
            String user36Mathematics = splitUser36Grades[4];
            String user36EnglishLanguage = splitUser36Grades[5];
            String user36ComputerScience = splitUser36Grades[6];
            String user36Physics = splitUser36Grades[7];
            String user36Chemistry = splitUser36Grades[8];
            String user36Story = splitUser36Grades[9];
            String user36SocialScience = splitUser36Grades[10];
            String user36PhysicalTraining = splitUser36Grades[11];
            String user36SecurityBasics = splitUser36Grades[12];
            String user36NativeLiterature = splitUser36Grades[13];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37RussianLanguage = splitUser37Grades[2];
            String user37Literature = splitUser37Grades[3];
            String user37Mathematics = splitUser37Grades[4];
            String user37EnglishLanguage = splitUser37Grades[5];
            String user37ComputerScience = splitUser37Grades[6];
            String user37Physics = splitUser37Grades[7];
            String user37Chemistry = splitUser37Grades[8];
            String user37Story = splitUser37Grades[9];
            String user37SocialScience = splitUser37Grades[10];
            String user37PhysicalTraining = splitUser37Grades[11];
            String user37SecurityBasics = splitUser37Grades[12];
            String user37NativeLiterature = splitUser37Grades[13];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38RussianLanguage = splitUser38Grades[2];
            String user38Literature = splitUser38Grades[3];
            String user38Mathematics = splitUser38Grades[4];
            String user38EnglishLanguage = splitUser38Grades[5];
            String user38ComputerScience = splitUser38Grades[6];
            String user38Physics = splitUser38Grades[7];
            String user38Chemistry = splitUser38Grades[8];
            String user38Story = splitUser38Grades[9];
            String user38SocialScience = splitUser38Grades[10];
            String user38PhysicalTraining = splitUser38Grades[11];
            String user38SecurityBasics = splitUser38Grades[12];
            String user38NativeLiterature = splitUser38Grades[13];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39RussianLanguage = splitUser39Grades[2];
            String user39Literature = splitUser39Grades[3];
            String user39Mathematics = splitUser39Grades[4];
            String user39EnglishLanguage = splitUser39Grades[5];
            String user39ComputerScience = splitUser39Grades[6];
            String user39Physics = splitUser39Grades[7];
            String user39Chemistry = splitUser39Grades[8];
            String user39Story = splitUser39Grades[9];
            String user39SocialScience = splitUser39Grades[10];
            String user39PhysicalTraining = splitUser39Grades[11];
            String user39SecurityBasics = splitUser39Grades[12];
            String user39NativeLiterature = splitUser39Grades[13];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40RussianLanguage = splitUser40Grades[2];
            String user40Literature = splitUser40Grades[3];
            String user40Mathematics = splitUser40Grades[4];
            String user40EnglishLanguage = splitUser40Grades[5];
            String user40ComputerScience = splitUser40Grades[6];
            String user40Physics = splitUser40Grades[7];
            String user40Chemistry = splitUser40Grades[8];
            String user40Story = splitUser40Grades[9];
            String user40SocialScience = splitUser40Grades[10];
            String user40PhysicalTraining = splitUser40Grades[11];
            String user40SecurityBasics = splitUser40Grades[12];
            String user40NativeLiterature = splitUser40Grades[13];


            ArrayList<Grade_IS_1_1Course1Semester2> addArr = new ArrayList<>();
            addArr.add(new Grade_IS_1_1Course1Semester2(user1Id, user1Username, user1RussianLanguage, user1Literature, user1Mathematics, user1EnglishLanguage, user1ComputerScience, user1Physics, user1Chemistry, user1Story, user1SocialScience, user1PhysicalTraining, user1SecurityBasics, user1NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user2Id, user2Username, user2RussianLanguage, user2Literature, user2Mathematics, user2EnglishLanguage, user2ComputerScience, user2Physics, user2Chemistry, user2Story, user2SocialScience, user2PhysicalTraining, user2SecurityBasics, user2NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user3Id, user3Username, user3RussianLanguage, user3Literature, user3Mathematics, user3EnglishLanguage, user3ComputerScience, user3Physics, user3Chemistry, user3Story, user3SocialScience, user3PhysicalTraining, user3SecurityBasics, user3NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user4Id, user4Username, user4RussianLanguage, user4Literature, user4Mathematics, user4EnglishLanguage, user4ComputerScience, user4Physics, user4Chemistry, user4Story, user4SocialScience, user4PhysicalTraining, user4SecurityBasics, user4NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user5Id, user5Username, user5RussianLanguage, user5Literature, user5Mathematics, user5EnglishLanguage, user5ComputerScience, user5Physics, user5Chemistry, user5Story, user5SocialScience, user5PhysicalTraining, user5SecurityBasics, user5NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user6Id, user6Username, user6RussianLanguage, user6Literature, user6Mathematics, user6EnglishLanguage, user6ComputerScience, user6Physics, user6Chemistry, user6Story, user6SocialScience, user6PhysicalTraining, user6SecurityBasics, user6NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user7Id, user7Username, user7RussianLanguage, user7Literature, user7Mathematics, user7EnglishLanguage, user7ComputerScience, user7Physics, user7Chemistry, user7Story, user7SocialScience, user7PhysicalTraining, user7SecurityBasics, user7NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user8Id, user8Username, user8RussianLanguage, user8Literature, user8Mathematics, user8EnglishLanguage, user8ComputerScience, user8Physics, user8Chemistry, user8Story, user8SocialScience, user8PhysicalTraining, user8SecurityBasics, user8NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user9Id, user9Username, user9RussianLanguage, user9Literature, user9Mathematics, user9EnglishLanguage, user9ComputerScience, user9Physics, user9Chemistry, user9Story, user9SocialScience, user9PhysicalTraining, user9SecurityBasics, user9NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user10Id, user10Username, user10RussianLanguage, user10Literature, user10Mathematics, user10EnglishLanguage, user10ComputerScience, user10Physics, user10Chemistry, user10Story, user10SocialScience, user10PhysicalTraining, user10SecurityBasics, user10NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user11Id, user11Username, user11RussianLanguage, user11Literature, user11Mathematics, user11EnglishLanguage, user11ComputerScience, user11Physics, user11Chemistry, user11Story, user11SocialScience, user11PhysicalTraining, user11SecurityBasics, user11NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user12Id, user12Username, user12RussianLanguage, user12Literature, user12Mathematics, user12EnglishLanguage, user12ComputerScience, user12Physics, user12Chemistry, user12Story, user12SocialScience, user12PhysicalTraining, user12SecurityBasics, user12NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user13Id, user13Username, user13RussianLanguage, user13Literature, user13Mathematics, user13EnglishLanguage, user13ComputerScience, user13Physics, user13Chemistry, user13Story, user13SocialScience, user13PhysicalTraining, user13SecurityBasics, user13NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user14Id, user14Username, user14RussianLanguage, user14Literature, user14Mathematics, user14EnglishLanguage, user14ComputerScience, user14Physics, user14Chemistry, user14Story, user14SocialScience, user14PhysicalTraining, user14SecurityBasics, user14NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user15Id, user15Username, user15RussianLanguage, user15Literature, user15Mathematics, user15EnglishLanguage, user15ComputerScience, user15Physics, user15Chemistry, user15Story, user15SocialScience, user15PhysicalTraining, user15SecurityBasics, user15NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user16Id, user16Username, user16RussianLanguage, user16Literature, user16Mathematics, user16EnglishLanguage, user16ComputerScience, user16Physics, user16Chemistry, user16Story, user16SocialScience, user16PhysicalTraining, user16SecurityBasics, user16NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user17Id, user17Username, user17RussianLanguage, user17Literature, user17Mathematics, user17EnglishLanguage, user17ComputerScience, user17Physics, user17Chemistry, user17Story, user17SocialScience, user17PhysicalTraining, user17SecurityBasics, user17NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user18Id, user18Username, user18RussianLanguage, user18Literature, user18Mathematics, user18EnglishLanguage, user18ComputerScience, user18Physics, user18Chemistry, user18Story, user18SocialScience, user18PhysicalTraining, user18SecurityBasics, user18NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user19Id, user19Username, user19RussianLanguage, user19Literature, user19Mathematics, user19EnglishLanguage, user19ComputerScience, user19Physics, user19Chemistry, user19Story, user19SocialScience, user19PhysicalTraining, user19SecurityBasics, user19NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user20Id, user20Username, user20RussianLanguage, user20Literature, user20Mathematics, user20EnglishLanguage, user20ComputerScience, user20Physics, user20Chemistry, user20Story, user20SocialScience, user20PhysicalTraining, user20SecurityBasics, user20NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user21Id, user21Username, user21RussianLanguage, user21Literature, user21Mathematics, user21EnglishLanguage, user21ComputerScience, user21Physics, user21Chemistry, user21Story, user21SocialScience, user21PhysicalTraining, user21SecurityBasics, user21NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user22Id, user22Username, user22RussianLanguage, user22Literature, user22Mathematics, user22EnglishLanguage, user22ComputerScience, user22Physics, user22Chemistry, user22Story, user22SocialScience, user22PhysicalTraining, user22SecurityBasics, user22NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user23Id, user23Username, user23RussianLanguage, user23Literature, user23Mathematics, user23EnglishLanguage, user23ComputerScience, user23Physics, user23Chemistry, user23Story, user23SocialScience, user23PhysicalTraining, user23SecurityBasics, user23NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user24Id, user24Username, user24RussianLanguage, user24Literature, user24Mathematics, user24EnglishLanguage, user24ComputerScience, user24Physics, user24Chemistry, user24Story, user24SocialScience, user24PhysicalTraining, user24SecurityBasics, user24NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user25Id, user25Username, user25RussianLanguage, user25Literature, user25Mathematics, user25EnglishLanguage, user25ComputerScience, user25Physics, user25Chemistry, user25Story, user25SocialScience, user25PhysicalTraining, user25SecurityBasics, user25NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user26Id, user26Username, user26RussianLanguage, user26Literature, user26Mathematics, user26EnglishLanguage, user26ComputerScience, user26Physics, user26Chemistry, user26Story, user26SocialScience, user26PhysicalTraining, user26SecurityBasics, user26NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user27Id, user27Username, user27RussianLanguage, user27Literature, user27Mathematics, user27EnglishLanguage, user27ComputerScience, user27Physics, user27Chemistry, user27Story, user27SocialScience, user27PhysicalTraining, user27SecurityBasics, user27NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user28Id, user28Username, user28RussianLanguage, user28Literature, user28Mathematics, user28EnglishLanguage, user28ComputerScience, user28Physics, user28Chemistry, user28Story, user28SocialScience, user28PhysicalTraining, user28SecurityBasics, user28NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user29Id, user29Username, user29RussianLanguage, user29Literature, user29Mathematics, user29EnglishLanguage, user29ComputerScience, user29Physics, user29Chemistry, user29Story, user29SocialScience, user29PhysicalTraining, user29SecurityBasics, user29NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user30Id, user30Username, user30RussianLanguage, user30Literature, user30Mathematics, user30EnglishLanguage, user30ComputerScience, user30Physics, user30Chemistry, user30Story, user30SocialScience, user30PhysicalTraining, user30SecurityBasics, user30NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user31Id, user31Username, user31RussianLanguage, user31Literature, user31Mathematics, user31EnglishLanguage, user31ComputerScience, user31Physics, user31Chemistry, user31Story, user31SocialScience, user31PhysicalTraining, user31SecurityBasics, user31NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user32Id, user32Username, user32RussianLanguage, user32Literature, user32Mathematics, user32EnglishLanguage, user32ComputerScience, user32Physics, user32Chemistry, user32Story, user32SocialScience, user32PhysicalTraining, user32SecurityBasics, user32NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user33Id, user33Username, user33RussianLanguage, user33Literature, user33Mathematics, user33EnglishLanguage, user33ComputerScience, user33Physics, user33Chemistry, user33Story, user33SocialScience, user33PhysicalTraining, user33SecurityBasics, user33NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user34Id, user34Username, user34RussianLanguage, user34Literature, user34Mathematics, user34EnglishLanguage, user34ComputerScience, user34Physics, user34Chemistry, user34Story, user34SocialScience, user34PhysicalTraining, user34SecurityBasics, user34NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user35Id, user35Username, user35RussianLanguage, user35Literature, user35Mathematics, user35EnglishLanguage, user35ComputerScience, user35Physics, user35Chemistry, user35Story, user35SocialScience, user35PhysicalTraining, user35SecurityBasics, user35NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user36Id, user36Username, user36RussianLanguage, user36Literature, user36Mathematics, user36EnglishLanguage, user36ComputerScience, user36Physics, user36Chemistry, user36Story, user36SocialScience, user36PhysicalTraining, user36SecurityBasics, user36NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user37Id, user37Username, user37RussianLanguage, user37Literature, user37Mathematics, user37EnglishLanguage, user37ComputerScience, user37Physics, user37Chemistry, user37Story, user37SocialScience, user37PhysicalTraining, user37SecurityBasics, user37NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user38Id, user38Username, user38RussianLanguage, user38Literature, user38Mathematics, user38EnglishLanguage, user38ComputerScience, user38Physics, user38Chemistry, user38Story, user38SocialScience, user38PhysicalTraining, user38SecurityBasics, user38NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user39Id, user39Username, user39RussianLanguage, user39Literature, user39Mathematics, user39EnglishLanguage, user39ComputerScience, user39Physics, user39Chemistry, user39Story, user39SocialScience, user39PhysicalTraining, user39SecurityBasics, user39NativeLiterature, month));
            addArr.add(new Grade_IS_1_1Course1Semester2(user40Id, user40Username, user40RussianLanguage, user40Literature, user40Mathematics, user40EnglishLanguage, user40ComputerScience, user40Physics, user40Chemistry, user40Story, user40SocialScience, user40PhysicalTraining, user40SecurityBasics, user40NativeLiterature, month));

            if (grade_is_1_1Course1Semester2Repository.findAll().isEmpty()) {
                grade_is_1_1Course1Semester2Repository.saveAll(addArr);
            }
            if (!grade_is_1_1Course1Semester2Repository.existsByMonth(month)) {
                grade_is_1_1Course1Semester2Repository.saveAll(addArr);
            }
            //PostMapping работает замена, а PutMapping нет
            //user1
            List<Grade_IS_1_1Course1Semester2> listAllGrade = grade_is_1_1Course1Semester2Repository.findAll();
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User1 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User2 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User3 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User4 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User5 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User6 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User7 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User8 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User9 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User10 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User11 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User12 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User13 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User14 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User15 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User16 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User17 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User18 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User19 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User20 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User21 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User22 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User23 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User24 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User25 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User26 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User27 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User28 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User29 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User30 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User31 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User32 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User33 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User34 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User35 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User36 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User37 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User38 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User39 = null;
            Grade_IS_1_1Course1Semester2 grade_is_1_1Course1Semester2User40 = null;

//            for (int i = 0; i < listAllGrade.size(); i++) {
//                if (listAllGrade.get(i).getUserID() == user1Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User1 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user2Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User2 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user3Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User3 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user4Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User4 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user5Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User5 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user6Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User6 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user7Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User7 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user8Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User8 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user9Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User9 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user10Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User10 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user11Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User11 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user12Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User12 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user13Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User13 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user14Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User14 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user15Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User15 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user16Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User16 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user17Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User17 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user18Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User18 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user19Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User19 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user20Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User20 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user21Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User21 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user22Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User22 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user23Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User23 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user24Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User24 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user25Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User25 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user26Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User26 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user27Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User27 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user28Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User28 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user29Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User29 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user30Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User30 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user31Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User31 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user32Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User32 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user33Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User33 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user34Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User34 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user35Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User35 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user36Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User36 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user37Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User37 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user38Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User38 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user39Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User39 = listAllGrade.get(i);
//                }
//                if (listAllGrade.get(i).getUserID() == user40Id && listAllGrade.get(i).getMonth().equals(month)) {
//                    grade_is_1_1Course1Semester2User40 = listAllGrade.get(i);
//                }
//
//            }

            grade_is_1_1Course1Semester2User1.setUsername(user1Username);
            grade_is_1_1Course1Semester2User1.setGradeRussianLanguage(user1RussianLanguage);
            grade_is_1_1Course1Semester2User1.setGradeLiterature(user1Literature);
            grade_is_1_1Course1Semester2User1.setGradeMathematics(user1Mathematics);
            grade_is_1_1Course1Semester2User1.setGradeEnglishLanguage(user1EnglishLanguage);
            grade_is_1_1Course1Semester2User1.setGradeComputerScience(user1ComputerScience);
            grade_is_1_1Course1Semester2User1.setGradePhysics(user1Physics);
            grade_is_1_1Course1Semester2User1.setGradeChemistry(user1Chemistry);
            grade_is_1_1Course1Semester2User1.setGradeStory(user1Story);
            grade_is_1_1Course1Semester2User1.setGradeSocialScience(user1SocialScience);
            grade_is_1_1Course1Semester2User1.setGradePhysicalTraining(user1PhysicalTraining);
            grade_is_1_1Course1Semester2User1.setGradeSecurityBasics(user1SecurityBasics);
            grade_is_1_1Course1Semester2User1.setGradeNativeLiterature(user1NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User1);

            //user2
            grade_is_1_1Course1Semester2User2.setUsername(user2Username);
            grade_is_1_1Course1Semester2User2.setGradeRussianLanguage(user2RussianLanguage);
            grade_is_1_1Course1Semester2User2.setGradeLiterature(user2Literature);
            grade_is_1_1Course1Semester2User2.setGradeMathematics(user2Mathematics);
            grade_is_1_1Course1Semester2User2.setGradeEnglishLanguage(user2EnglishLanguage);
            grade_is_1_1Course1Semester2User2.setGradeComputerScience(user2ComputerScience);
            grade_is_1_1Course1Semester2User2.setGradePhysics(user2Physics);
            grade_is_1_1Course1Semester2User2.setGradeChemistry(user2Chemistry);
            grade_is_1_1Course1Semester2User2.setGradeStory(user2Story);
            grade_is_1_1Course1Semester2User2.setGradeSocialScience(user2SocialScience);
            grade_is_1_1Course1Semester2User2.setGradePhysicalTraining(user2PhysicalTraining);
            grade_is_1_1Course1Semester2User2.setGradeSecurityBasics(user2SecurityBasics);
            grade_is_1_1Course1Semester2User2.setGradeNativeLiterature(user2NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User2);
//            //user3

            grade_is_1_1Course1Semester2User3.setUsername(user3Username);
            grade_is_1_1Course1Semester2User3.setGradeRussianLanguage(user3RussianLanguage);
            grade_is_1_1Course1Semester2User3.setGradeLiterature(user3Literature);
            grade_is_1_1Course1Semester2User3.setGradeMathematics(user3Mathematics);
            grade_is_1_1Course1Semester2User3.setGradeEnglishLanguage(user3EnglishLanguage);
            grade_is_1_1Course1Semester2User3.setGradeComputerScience(user3ComputerScience);
            grade_is_1_1Course1Semester2User3.setGradePhysics(user3Physics);
            grade_is_1_1Course1Semester2User3.setGradeChemistry(user3Chemistry);
            grade_is_1_1Course1Semester2User3.setGradeStory(user3Story);
            grade_is_1_1Course1Semester2User3.setGradeSocialScience(user3SocialScience);
            grade_is_1_1Course1Semester2User3.setGradePhysicalTraining(user3PhysicalTraining);
            grade_is_1_1Course1Semester2User3.setGradeSecurityBasics(user3SecurityBasics);
            grade_is_1_1Course1Semester2User3.setGradeNativeLiterature(user3NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User3);
//            //user4

            grade_is_1_1Course1Semester2User4.setUsername(user4Username);
            grade_is_1_1Course1Semester2User4.setGradeRussianLanguage(user4RussianLanguage);
            grade_is_1_1Course1Semester2User4.setGradeLiterature(user4Literature);
            grade_is_1_1Course1Semester2User4.setGradeMathematics(user4Mathematics);
            grade_is_1_1Course1Semester2User4.setGradeEnglishLanguage(user4EnglishLanguage);
            grade_is_1_1Course1Semester2User4.setGradeComputerScience(user4ComputerScience);
            grade_is_1_1Course1Semester2User4.setGradePhysics(user4Physics);
            grade_is_1_1Course1Semester2User4.setGradeChemistry(user4Chemistry);
            grade_is_1_1Course1Semester2User4.setGradeStory(user4Story);
            grade_is_1_1Course1Semester2User4.setGradeSocialScience(user4SocialScience);
            grade_is_1_1Course1Semester2User4.setGradePhysicalTraining(user4PhysicalTraining);
            grade_is_1_1Course1Semester2User4.setGradeSecurityBasics(user4SecurityBasics);
            grade_is_1_1Course1Semester2User4.setGradeNativeLiterature(user4NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User4);
//            //user5

            grade_is_1_1Course1Semester2User5.setUsername(user5Username);
            grade_is_1_1Course1Semester2User5.setGradeRussianLanguage(user5RussianLanguage);
            grade_is_1_1Course1Semester2User5.setGradeLiterature(user5Literature);
            grade_is_1_1Course1Semester2User5.setGradeMathematics(user5Mathematics);
            grade_is_1_1Course1Semester2User5.setGradeEnglishLanguage(user5EnglishLanguage);
            grade_is_1_1Course1Semester2User5.setGradeComputerScience(user5ComputerScience);
            grade_is_1_1Course1Semester2User5.setGradePhysics(user5Physics);
            grade_is_1_1Course1Semester2User5.setGradeChemistry(user5Chemistry);
            grade_is_1_1Course1Semester2User5.setGradeStory(user5Story);
            grade_is_1_1Course1Semester2User5.setGradeSocialScience(user5SocialScience);
            grade_is_1_1Course1Semester2User5.setGradePhysicalTraining(user5PhysicalTraining);
            grade_is_1_1Course1Semester2User5.setGradeSecurityBasics(user5SecurityBasics);
            grade_is_1_1Course1Semester2User5.setGradeNativeLiterature(user5NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User5);
//            //user6

            grade_is_1_1Course1Semester2User6.setUsername(user6Username);
            grade_is_1_1Course1Semester2User6.setGradeRussianLanguage(user6RussianLanguage);
            grade_is_1_1Course1Semester2User6.setGradeLiterature(user6Literature);
            grade_is_1_1Course1Semester2User6.setGradeMathematics(user6Mathematics);
            grade_is_1_1Course1Semester2User6.setGradeEnglishLanguage(user6EnglishLanguage);
            grade_is_1_1Course1Semester2User6.setGradeComputerScience(user6ComputerScience);
            grade_is_1_1Course1Semester2User6.setGradePhysics(user6Physics);
            grade_is_1_1Course1Semester2User6.setGradeChemistry(user6Chemistry);
            grade_is_1_1Course1Semester2User6.setGradeStory(user6Story);
            grade_is_1_1Course1Semester2User6.setGradeSocialScience(user6SocialScience);
            grade_is_1_1Course1Semester2User6.setGradePhysicalTraining(user6PhysicalTraining);
            grade_is_1_1Course1Semester2User6.setGradeSecurityBasics(user6SecurityBasics);
            grade_is_1_1Course1Semester2User6.setGradeNativeLiterature(user6NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User6);
//            //user7

            grade_is_1_1Course1Semester2User7.setUsername(user7Username);
            grade_is_1_1Course1Semester2User7.setGradeRussianLanguage(user7RussianLanguage);
            grade_is_1_1Course1Semester2User7.setGradeLiterature(user7Literature);
            grade_is_1_1Course1Semester2User7.setGradeMathematics(user7Mathematics);
            grade_is_1_1Course1Semester2User7.setGradeEnglishLanguage(user7EnglishLanguage);
            grade_is_1_1Course1Semester2User7.setGradeComputerScience(user7ComputerScience);
            grade_is_1_1Course1Semester2User7.setGradePhysics(user7Physics);
            grade_is_1_1Course1Semester2User7.setGradeChemistry(user7Chemistry);
            grade_is_1_1Course1Semester2User7.setGradeStory(user7Story);
            grade_is_1_1Course1Semester2User7.setGradeSocialScience(user7SocialScience);
            grade_is_1_1Course1Semester2User7.setGradePhysicalTraining(user7PhysicalTraining);
            grade_is_1_1Course1Semester2User7.setGradeSecurityBasics(user7SecurityBasics);
            grade_is_1_1Course1Semester2User7.setGradeNativeLiterature(user7NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User7);
//            //user8

            grade_is_1_1Course1Semester2User8.setUsername(user8Username);
            grade_is_1_1Course1Semester2User8.setGradeRussianLanguage(user8RussianLanguage);
            grade_is_1_1Course1Semester2User8.setGradeLiterature(user8Literature);
            grade_is_1_1Course1Semester2User8.setGradeMathematics(user8Mathematics);
            grade_is_1_1Course1Semester2User8.setGradeEnglishLanguage(user8EnglishLanguage);
            grade_is_1_1Course1Semester2User8.setGradeComputerScience(user8ComputerScience);
            grade_is_1_1Course1Semester2User8.setGradePhysics(user8Physics);
            grade_is_1_1Course1Semester2User8.setGradeChemistry(user8Chemistry);
            grade_is_1_1Course1Semester2User8.setGradeStory(user8Story);
            grade_is_1_1Course1Semester2User8.setGradeSocialScience(user8SocialScience);
            grade_is_1_1Course1Semester2User8.setGradePhysicalTraining(user8PhysicalTraining);
            grade_is_1_1Course1Semester2User8.setGradeSecurityBasics(user8SecurityBasics);
            grade_is_1_1Course1Semester2User8.setGradeNativeLiterature(user8NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User8);
//            //user9

            grade_is_1_1Course1Semester2User9.setUsername(user9Username);
            grade_is_1_1Course1Semester2User9.setGradeRussianLanguage(user9RussianLanguage);
            grade_is_1_1Course1Semester2User9.setGradeLiterature(user9Literature);
            grade_is_1_1Course1Semester2User9.setGradeMathematics(user9Mathematics);
            grade_is_1_1Course1Semester2User9.setGradeEnglishLanguage(user9EnglishLanguage);
            grade_is_1_1Course1Semester2User9.setGradeComputerScience(user9ComputerScience);
            grade_is_1_1Course1Semester2User9.setGradePhysics(user9Physics);
            grade_is_1_1Course1Semester2User9.setGradeChemistry(user9Chemistry);
            grade_is_1_1Course1Semester2User9.setGradeStory(user9Story);
            grade_is_1_1Course1Semester2User9.setGradeSocialScience(user9SocialScience);
            grade_is_1_1Course1Semester2User9.setGradePhysicalTraining(user9PhysicalTraining);
            grade_is_1_1Course1Semester2User9.setGradeSecurityBasics(user9SecurityBasics);
            grade_is_1_1Course1Semester2User9.setGradeNativeLiterature(user9NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User9);

//            //user10
            grade_is_1_1Course1Semester2User10.setUsername(user10Username);
            grade_is_1_1Course1Semester2User10.setGradeRussianLanguage(user10RussianLanguage);
            grade_is_1_1Course1Semester2User10.setGradeLiterature(user10Literature);
            grade_is_1_1Course1Semester2User10.setGradeMathematics(user10Mathematics);
            grade_is_1_1Course1Semester2User10.setGradeEnglishLanguage(user10EnglishLanguage);
            grade_is_1_1Course1Semester2User10.setGradeComputerScience(user10ComputerScience);
            grade_is_1_1Course1Semester2User10.setGradePhysics(user10Physics);
            grade_is_1_1Course1Semester2User10.setGradeChemistry(user10Chemistry);
            grade_is_1_1Course1Semester2User10.setGradeStory(user10Story);
            grade_is_1_1Course1Semester2User10.setGradeSocialScience(user10SocialScience);
            grade_is_1_1Course1Semester2User10.setGradePhysicalTraining(user10PhysicalTraining);
            grade_is_1_1Course1Semester2User10.setGradeSecurityBasics(user10SecurityBasics);
            grade_is_1_1Course1Semester2User10.setGradeNativeLiterature(user10NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User10);

//            //user11
            grade_is_1_1Course1Semester2User11.setUsername(user11Username);
            grade_is_1_1Course1Semester2User11.setGradeRussianLanguage(user11RussianLanguage);
            grade_is_1_1Course1Semester2User11.setGradeLiterature(user11Literature);
            grade_is_1_1Course1Semester2User11.setGradeMathematics(user11Mathematics);
            grade_is_1_1Course1Semester2User11.setGradeEnglishLanguage(user11EnglishLanguage);
            grade_is_1_1Course1Semester2User11.setGradeComputerScience(user11ComputerScience);
            grade_is_1_1Course1Semester2User11.setGradePhysics(user11Physics);
            grade_is_1_1Course1Semester2User11.setGradeChemistry(user11Chemistry);
            grade_is_1_1Course1Semester2User11.setGradeStory(user11Story);
            grade_is_1_1Course1Semester2User11.setGradeSocialScience(user11SocialScience);
            grade_is_1_1Course1Semester2User11.setGradePhysicalTraining(user11PhysicalTraining);
            grade_is_1_1Course1Semester2User11.setGradeSecurityBasics(user11SecurityBasics);
            grade_is_1_1Course1Semester2User11.setGradeNativeLiterature(user11NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User11);

//            //user12
            grade_is_1_1Course1Semester2User12.setUsername(user12Username);
            grade_is_1_1Course1Semester2User12.setGradeRussianLanguage(user12RussianLanguage);
            grade_is_1_1Course1Semester2User12.setGradeLiterature(user12Literature);
            grade_is_1_1Course1Semester2User12.setGradeMathematics(user12Mathematics);
            grade_is_1_1Course1Semester2User12.setGradeEnglishLanguage(user12EnglishLanguage);
            grade_is_1_1Course1Semester2User12.setGradeComputerScience(user12ComputerScience);
            grade_is_1_1Course1Semester2User12.setGradePhysics(user12Physics);
            grade_is_1_1Course1Semester2User12.setGradeChemistry(user12Chemistry);
            grade_is_1_1Course1Semester2User12.setGradeStory(user12Story);
            grade_is_1_1Course1Semester2User12.setGradeSocialScience(user12SocialScience);
            grade_is_1_1Course1Semester2User12.setGradePhysicalTraining(user12PhysicalTraining);
            grade_is_1_1Course1Semester2User12.setGradeSecurityBasics(user12SecurityBasics);
            grade_is_1_1Course1Semester2User12.setGradeNativeLiterature(user12NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User12);
//            //user13

            grade_is_1_1Course1Semester2User13.setUsername(user13Username);
            grade_is_1_1Course1Semester2User13.setGradeRussianLanguage(user13RussianLanguage);
            grade_is_1_1Course1Semester2User13.setGradeLiterature(user13Literature);
            grade_is_1_1Course1Semester2User13.setGradeMathematics(user13Mathematics);
            grade_is_1_1Course1Semester2User13.setGradeEnglishLanguage(user13EnglishLanguage);
            grade_is_1_1Course1Semester2User13.setGradeComputerScience(user13ComputerScience);
            grade_is_1_1Course1Semester2User13.setGradePhysics(user13Physics);
            grade_is_1_1Course1Semester2User13.setGradeChemistry(user13Chemistry);
            grade_is_1_1Course1Semester2User13.setGradeStory(user13Story);
            grade_is_1_1Course1Semester2User13.setGradeSocialScience(user13SocialScience);
            grade_is_1_1Course1Semester2User13.setGradePhysicalTraining(user13PhysicalTraining);
            grade_is_1_1Course1Semester2User13.setGradeSecurityBasics(user13SecurityBasics);
            grade_is_1_1Course1Semester2User13.setGradeNativeLiterature(user13NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User13);
//            //user14

            grade_is_1_1Course1Semester2User14.setUsername(user14Username);
            grade_is_1_1Course1Semester2User14.setGradeRussianLanguage(user14RussianLanguage);
            grade_is_1_1Course1Semester2User14.setGradeLiterature(user14Literature);
            grade_is_1_1Course1Semester2User14.setGradeMathematics(user14Mathematics);
            grade_is_1_1Course1Semester2User14.setGradeEnglishLanguage(user14EnglishLanguage);
            grade_is_1_1Course1Semester2User14.setGradeComputerScience(user14ComputerScience);
            grade_is_1_1Course1Semester2User14.setGradePhysics(user14Physics);
            grade_is_1_1Course1Semester2User14.setGradeChemistry(user14Chemistry);
            grade_is_1_1Course1Semester2User14.setGradeStory(user14Story);
            grade_is_1_1Course1Semester2User14.setGradeSocialScience(user14SocialScience);
            grade_is_1_1Course1Semester2User14.setGradePhysicalTraining(user14PhysicalTraining);
            grade_is_1_1Course1Semester2User14.setGradeSecurityBasics(user14SecurityBasics);
            grade_is_1_1Course1Semester2User14.setGradeNativeLiterature(user14NativeLiterature);

            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User14);
//            //user15

            grade_is_1_1Course1Semester2User15.setUsername(user15Username);
            grade_is_1_1Course1Semester2User15.setGradeRussianLanguage(user15RussianLanguage);
            grade_is_1_1Course1Semester2User15.setGradeLiterature(user15Literature);
            grade_is_1_1Course1Semester2User15.setGradeMathematics(user15Mathematics);
            grade_is_1_1Course1Semester2User15.setGradeEnglishLanguage(user15EnglishLanguage);
            grade_is_1_1Course1Semester2User15.setGradeComputerScience(user15ComputerScience);
            grade_is_1_1Course1Semester2User15.setGradePhysics(user15Physics);
            grade_is_1_1Course1Semester2User15.setGradeChemistry(user15Chemistry);
            grade_is_1_1Course1Semester2User15.setGradeStory(user15Story);
            grade_is_1_1Course1Semester2User15.setGradeSocialScience(user15SocialScience);
            grade_is_1_1Course1Semester2User15.setGradePhysicalTraining(user15PhysicalTraining);
            grade_is_1_1Course1Semester2User15.setGradeSecurityBasics(user15SecurityBasics);
            grade_is_1_1Course1Semester2User15.setGradeNativeLiterature(user15NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User15);
//            //user16

            grade_is_1_1Course1Semester2User16.setUsername(user16Username);
            grade_is_1_1Course1Semester2User16.setGradeRussianLanguage(user16RussianLanguage);
            grade_is_1_1Course1Semester2User16.setGradeLiterature(user16Literature);
            grade_is_1_1Course1Semester2User16.setGradeMathematics(user16Mathematics);
            grade_is_1_1Course1Semester2User16.setGradeEnglishLanguage(user16EnglishLanguage);
            grade_is_1_1Course1Semester2User16.setGradeComputerScience(user16ComputerScience);
            grade_is_1_1Course1Semester2User16.setGradePhysics(user16Physics);
            grade_is_1_1Course1Semester2User16.setGradeChemistry(user16Chemistry);
            grade_is_1_1Course1Semester2User16.setGradeStory(user16Story);
            grade_is_1_1Course1Semester2User16.setGradeSocialScience(user16SocialScience);
            grade_is_1_1Course1Semester2User16.setGradePhysicalTraining(user16PhysicalTraining);
            grade_is_1_1Course1Semester2User16.setGradeSecurityBasics(user16SecurityBasics);
            grade_is_1_1Course1Semester2User16.setGradeNativeLiterature(user16NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User16);


            //            //user17

            grade_is_1_1Course1Semester2User17.setUsername(user17Username);
            grade_is_1_1Course1Semester2User17.setGradeRussianLanguage(user17RussianLanguage);
            grade_is_1_1Course1Semester2User17.setGradeLiterature(user17Literature);
            grade_is_1_1Course1Semester2User17.setGradeMathematics(user17Mathematics);
            grade_is_1_1Course1Semester2User17.setGradeEnglishLanguage(user17EnglishLanguage);
            grade_is_1_1Course1Semester2User17.setGradeComputerScience(user17ComputerScience);
            grade_is_1_1Course1Semester2User17.setGradePhysics(user17Physics);
            grade_is_1_1Course1Semester2User17.setGradeChemistry(user17Chemistry);
            grade_is_1_1Course1Semester2User17.setGradeStory(user17Story);
            grade_is_1_1Course1Semester2User17.setGradeSocialScience(user17SocialScience);
            grade_is_1_1Course1Semester2User17.setGradePhysicalTraining(user17PhysicalTraining);
            grade_is_1_1Course1Semester2User17.setGradeSecurityBasics(user17SecurityBasics);
            grade_is_1_1Course1Semester2User17.setGradeNativeLiterature(user17NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User17);

            //            //user18

            grade_is_1_1Course1Semester2User18.setUsername(user18Username);
            grade_is_1_1Course1Semester2User18.setGradeRussianLanguage(user18RussianLanguage);
            grade_is_1_1Course1Semester2User18.setGradeLiterature(user18Literature);
            grade_is_1_1Course1Semester2User18.setGradeMathematics(user18Mathematics);
            grade_is_1_1Course1Semester2User18.setGradeEnglishLanguage(user18EnglishLanguage);
            grade_is_1_1Course1Semester2User18.setGradeComputerScience(user18ComputerScience);
            grade_is_1_1Course1Semester2User18.setGradePhysics(user18Physics);
            grade_is_1_1Course1Semester2User18.setGradeChemistry(user18Chemistry);
            grade_is_1_1Course1Semester2User18.setGradeStory(user18Story);
            grade_is_1_1Course1Semester2User18.setGradeSocialScience(user18SocialScience);
            grade_is_1_1Course1Semester2User18.setGradePhysicalTraining(user18PhysicalTraining);
            grade_is_1_1Course1Semester2User18.setGradeSecurityBasics(user18SecurityBasics);
            grade_is_1_1Course1Semester2User18.setGradeNativeLiterature(user18NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User18);


            //            //user19

            grade_is_1_1Course1Semester2User19.setUsername(user19Username);
            grade_is_1_1Course1Semester2User19.setGradeRussianLanguage(user19RussianLanguage);
            grade_is_1_1Course1Semester2User19.setGradeLiterature(user19Literature);
            grade_is_1_1Course1Semester2User19.setGradeMathematics(user19Mathematics);
            grade_is_1_1Course1Semester2User19.setGradeEnglishLanguage(user19EnglishLanguage);
            grade_is_1_1Course1Semester2User19.setGradeComputerScience(user19ComputerScience);
            grade_is_1_1Course1Semester2User19.setGradePhysics(user19Physics);
            grade_is_1_1Course1Semester2User19.setGradeChemistry(user19Chemistry);
            grade_is_1_1Course1Semester2User19.setGradeStory(user19Story);
            grade_is_1_1Course1Semester2User19.setGradeSocialScience(user19SocialScience);
            grade_is_1_1Course1Semester2User19.setGradePhysicalTraining(user19PhysicalTraining);
            grade_is_1_1Course1Semester2User19.setGradeSecurityBasics(user19SecurityBasics);
            grade_is_1_1Course1Semester2User19.setGradeNativeLiterature(user19NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User19);

            //            //user20

            grade_is_1_1Course1Semester2User20.setUsername(user20Username);
            grade_is_1_1Course1Semester2User20.setGradeRussianLanguage(user20RussianLanguage);
            grade_is_1_1Course1Semester2User20.setGradeLiterature(user20Literature);
            grade_is_1_1Course1Semester2User20.setGradeMathematics(user20Mathematics);
            grade_is_1_1Course1Semester2User20.setGradeEnglishLanguage(user20EnglishLanguage);
            grade_is_1_1Course1Semester2User20.setGradeComputerScience(user20ComputerScience);
            grade_is_1_1Course1Semester2User20.setGradePhysics(user20Physics);
            grade_is_1_1Course1Semester2User20.setGradeChemistry(user20Chemistry);
            grade_is_1_1Course1Semester2User20.setGradeStory(user20Story);
            grade_is_1_1Course1Semester2User20.setGradeSocialScience(user20SocialScience);
            grade_is_1_1Course1Semester2User20.setGradePhysicalTraining(user20PhysicalTraining);
            grade_is_1_1Course1Semester2User20.setGradeSecurityBasics(user20SecurityBasics);
            grade_is_1_1Course1Semester2User20.setGradeNativeLiterature(user20NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User20);

            //            //user21

            grade_is_1_1Course1Semester2User21.setUsername(user21Username);
            grade_is_1_1Course1Semester2User21.setGradeRussianLanguage(user21RussianLanguage);
            grade_is_1_1Course1Semester2User21.setGradeLiterature(user21Literature);
            grade_is_1_1Course1Semester2User21.setGradeMathematics(user21Mathematics);
            grade_is_1_1Course1Semester2User21.setGradeEnglishLanguage(user21EnglishLanguage);
            grade_is_1_1Course1Semester2User21.setGradeComputerScience(user21ComputerScience);
            grade_is_1_1Course1Semester2User21.setGradePhysics(user21Physics);
            grade_is_1_1Course1Semester2User21.setGradeChemistry(user21Chemistry);
            grade_is_1_1Course1Semester2User21.setGradeStory(user21Story);
            grade_is_1_1Course1Semester2User21.setGradeSocialScience(user21SocialScience);
            grade_is_1_1Course1Semester2User21.setGradePhysicalTraining(user21PhysicalTraining);
            grade_is_1_1Course1Semester2User21.setGradeSecurityBasics(user21SecurityBasics);
            grade_is_1_1Course1Semester2User21.setGradeNativeLiterature(user21NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User21);

            //            //user22

            grade_is_1_1Course1Semester2User22.setUsername(user22Username);
            grade_is_1_1Course1Semester2User22.setGradeRussianLanguage(user22RussianLanguage);
            grade_is_1_1Course1Semester2User22.setGradeLiterature(user22Literature);
            grade_is_1_1Course1Semester2User22.setGradeMathematics(user22Mathematics);
            grade_is_1_1Course1Semester2User22.setGradeEnglishLanguage(user22EnglishLanguage);
            grade_is_1_1Course1Semester2User22.setGradeComputerScience(user22ComputerScience);
            grade_is_1_1Course1Semester2User22.setGradePhysics(user22Physics);
            grade_is_1_1Course1Semester2User22.setGradeChemistry(user22Chemistry);
            grade_is_1_1Course1Semester2User22.setGradeStory(user22Story);
            grade_is_1_1Course1Semester2User22.setGradeSocialScience(user22SocialScience);
            grade_is_1_1Course1Semester2User22.setGradePhysicalTraining(user22PhysicalTraining);
            grade_is_1_1Course1Semester2User22.setGradeSecurityBasics(user22SecurityBasics);
            grade_is_1_1Course1Semester2User22.setGradeNativeLiterature(user22NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User22);

            //            //user23

            grade_is_1_1Course1Semester2User23.setUsername(user23Username);
            grade_is_1_1Course1Semester2User23.setGradeRussianLanguage(user23RussianLanguage);
            grade_is_1_1Course1Semester2User23.setGradeLiterature(user23Literature);
            grade_is_1_1Course1Semester2User23.setGradeMathematics(user23Mathematics);
            grade_is_1_1Course1Semester2User23.setGradeEnglishLanguage(user23EnglishLanguage);
            grade_is_1_1Course1Semester2User23.setGradeComputerScience(user23ComputerScience);
            grade_is_1_1Course1Semester2User23.setGradePhysics(user23Physics);
            grade_is_1_1Course1Semester2User23.setGradeChemistry(user23Chemistry);
            grade_is_1_1Course1Semester2User23.setGradeStory(user23Story);
            grade_is_1_1Course1Semester2User23.setGradeSocialScience(user23SocialScience);
            grade_is_1_1Course1Semester2User23.setGradePhysicalTraining(user23PhysicalTraining);
            grade_is_1_1Course1Semester2User23.setGradeSecurityBasics(user23SecurityBasics);
            grade_is_1_1Course1Semester2User23.setGradeNativeLiterature(user23NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User23);

            //            //user24

            grade_is_1_1Course1Semester2User24.setUsername(user24Username);
            grade_is_1_1Course1Semester2User24.setGradeRussianLanguage(user24RussianLanguage);
            grade_is_1_1Course1Semester2User24.setGradeLiterature(user24Literature);
            grade_is_1_1Course1Semester2User24.setGradeMathematics(user24Mathematics);
            grade_is_1_1Course1Semester2User24.setGradeEnglishLanguage(user24EnglishLanguage);
            grade_is_1_1Course1Semester2User24.setGradeComputerScience(user24ComputerScience);
            grade_is_1_1Course1Semester2User24.setGradePhysics(user24Physics);
            grade_is_1_1Course1Semester2User24.setGradeChemistry(user24Chemistry);
            grade_is_1_1Course1Semester2User24.setGradeStory(user24Story);
            grade_is_1_1Course1Semester2User24.setGradeSocialScience(user24SocialScience);
            grade_is_1_1Course1Semester2User24.setGradePhysicalTraining(user24PhysicalTraining);
            grade_is_1_1Course1Semester2User24.setGradeSecurityBasics(user24SecurityBasics);
            grade_is_1_1Course1Semester2User24.setGradeNativeLiterature(user24NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User24);

            //            //user25

            grade_is_1_1Course1Semester2User25.setUsername(user25Username);
            grade_is_1_1Course1Semester2User25.setGradeRussianLanguage(user25RussianLanguage);
            grade_is_1_1Course1Semester2User25.setGradeLiterature(user25Literature);
            grade_is_1_1Course1Semester2User25.setGradeMathematics(user25Mathematics);
            grade_is_1_1Course1Semester2User25.setGradeEnglishLanguage(user25EnglishLanguage);
            grade_is_1_1Course1Semester2User25.setGradeComputerScience(user25ComputerScience);
            grade_is_1_1Course1Semester2User25.setGradePhysics(user25Physics);
            grade_is_1_1Course1Semester2User25.setGradeChemistry(user25Chemistry);
            grade_is_1_1Course1Semester2User25.setGradeStory(user25Story);
            grade_is_1_1Course1Semester2User25.setGradeSocialScience(user25SocialScience);
            grade_is_1_1Course1Semester2User25.setGradePhysicalTraining(user25PhysicalTraining);
            grade_is_1_1Course1Semester2User25.setGradeSecurityBasics(user25SecurityBasics);
            grade_is_1_1Course1Semester2User25.setGradeNativeLiterature(user25NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User25);

            //            //user26

            grade_is_1_1Course1Semester2User26.setUsername(user26Username);
            grade_is_1_1Course1Semester2User26.setGradeRussianLanguage(user26RussianLanguage);
            grade_is_1_1Course1Semester2User26.setGradeLiterature(user26Literature);
            grade_is_1_1Course1Semester2User26.setGradeMathematics(user26Mathematics);
            grade_is_1_1Course1Semester2User26.setGradeEnglishLanguage(user26EnglishLanguage);
            grade_is_1_1Course1Semester2User26.setGradeComputerScience(user26ComputerScience);
            grade_is_1_1Course1Semester2User26.setGradePhysics(user26Physics);
            grade_is_1_1Course1Semester2User26.setGradeChemistry(user26Chemistry);
            grade_is_1_1Course1Semester2User26.setGradeStory(user26Story);
            grade_is_1_1Course1Semester2User26.setGradeSocialScience(user26SocialScience);
            grade_is_1_1Course1Semester2User26.setGradePhysicalTraining(user26PhysicalTraining);
            grade_is_1_1Course1Semester2User26.setGradeSecurityBasics(user26SecurityBasics);
            grade_is_1_1Course1Semester2User26.setGradeNativeLiterature(user26NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User26);

            //            //user27

            grade_is_1_1Course1Semester2User27.setUsername(user27Username);
            grade_is_1_1Course1Semester2User27.setGradeRussianLanguage(user27RussianLanguage);
            grade_is_1_1Course1Semester2User27.setGradeLiterature(user27Literature);
            grade_is_1_1Course1Semester2User27.setGradeMathematics(user27Mathematics);
            grade_is_1_1Course1Semester2User27.setGradeEnglishLanguage(user27EnglishLanguage);
            grade_is_1_1Course1Semester2User27.setGradeComputerScience(user27ComputerScience);
            grade_is_1_1Course1Semester2User27.setGradePhysics(user27Physics);
            grade_is_1_1Course1Semester2User27.setGradeChemistry(user27Chemistry);
            grade_is_1_1Course1Semester2User27.setGradeStory(user27Story);
            grade_is_1_1Course1Semester2User27.setGradeSocialScience(user27SocialScience);
            grade_is_1_1Course1Semester2User27.setGradePhysicalTraining(user27PhysicalTraining);
            grade_is_1_1Course1Semester2User27.setGradeSecurityBasics(user27SecurityBasics);
            grade_is_1_1Course1Semester2User27.setGradeNativeLiterature(user27NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User27);

            //            //user28

            grade_is_1_1Course1Semester2User28.setUsername(user28Username);
            grade_is_1_1Course1Semester2User28.setGradeRussianLanguage(user28RussianLanguage);
            grade_is_1_1Course1Semester2User28.setGradeLiterature(user28Literature);
            grade_is_1_1Course1Semester2User28.setGradeMathematics(user28Mathematics);
            grade_is_1_1Course1Semester2User28.setGradeEnglishLanguage(user28EnglishLanguage);
            grade_is_1_1Course1Semester2User28.setGradeComputerScience(user28ComputerScience);
            grade_is_1_1Course1Semester2User28.setGradePhysics(user28Physics);
            grade_is_1_1Course1Semester2User28.setGradeChemistry(user28Chemistry);
            grade_is_1_1Course1Semester2User28.setGradeStory(user28Story);
            grade_is_1_1Course1Semester2User28.setGradeSocialScience(user28SocialScience);
            grade_is_1_1Course1Semester2User28.setGradePhysicalTraining(user28PhysicalTraining);
            grade_is_1_1Course1Semester2User28.setGradeSecurityBasics(user28SecurityBasics);
            grade_is_1_1Course1Semester2User28.setGradeNativeLiterature(user28NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User28);

            //            //user29

            grade_is_1_1Course1Semester2User29.setUsername(user29Username);
            grade_is_1_1Course1Semester2User29.setGradeRussianLanguage(user29RussianLanguage);
            grade_is_1_1Course1Semester2User29.setGradeLiterature(user29Literature);
            grade_is_1_1Course1Semester2User29.setGradeMathematics(user29Mathematics);
            grade_is_1_1Course1Semester2User29.setGradeEnglishLanguage(user29EnglishLanguage);
            grade_is_1_1Course1Semester2User29.setGradeComputerScience(user29ComputerScience);
            grade_is_1_1Course1Semester2User29.setGradePhysics(user29Physics);
            grade_is_1_1Course1Semester2User29.setGradeChemistry(user29Chemistry);
            grade_is_1_1Course1Semester2User29.setGradeStory(user29Story);
            grade_is_1_1Course1Semester2User29.setGradeSocialScience(user29SocialScience);
            grade_is_1_1Course1Semester2User29.setGradePhysicalTraining(user29PhysicalTraining);
            grade_is_1_1Course1Semester2User29.setGradeSecurityBasics(user29SecurityBasics);
            grade_is_1_1Course1Semester2User29.setGradeNativeLiterature(user29NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User29);

            //            //user30

            grade_is_1_1Course1Semester2User30.setUsername(user30Username);
            grade_is_1_1Course1Semester2User30.setGradeRussianLanguage(user30RussianLanguage);
            grade_is_1_1Course1Semester2User30.setGradeLiterature(user30Literature);
            grade_is_1_1Course1Semester2User30.setGradeMathematics(user30Mathematics);
            grade_is_1_1Course1Semester2User30.setGradeEnglishLanguage(user30EnglishLanguage);
            grade_is_1_1Course1Semester2User30.setGradeComputerScience(user30ComputerScience);
            grade_is_1_1Course1Semester2User30.setGradePhysics(user30Physics);
            grade_is_1_1Course1Semester2User30.setGradeChemistry(user30Chemistry);
            grade_is_1_1Course1Semester2User30.setGradeStory(user30Story);
            grade_is_1_1Course1Semester2User30.setGradeSocialScience(user30SocialScience);
            grade_is_1_1Course1Semester2User30.setGradePhysicalTraining(user30PhysicalTraining);
            grade_is_1_1Course1Semester2User30.setGradeSecurityBasics(user30SecurityBasics);
            grade_is_1_1Course1Semester2User30.setGradeNativeLiterature(user30NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User30);

            //            //user31

            grade_is_1_1Course1Semester2User31.setUsername(user31Username);
            grade_is_1_1Course1Semester2User31.setGradeRussianLanguage(user31RussianLanguage);
            grade_is_1_1Course1Semester2User31.setGradeLiterature(user31Literature);
            grade_is_1_1Course1Semester2User31.setGradeMathematics(user31Mathematics);
            grade_is_1_1Course1Semester2User31.setGradeEnglishLanguage(user31EnglishLanguage);
            grade_is_1_1Course1Semester2User31.setGradeComputerScience(user31ComputerScience);
            grade_is_1_1Course1Semester2User31.setGradePhysics(user31Physics);
            grade_is_1_1Course1Semester2User31.setGradeChemistry(user31Chemistry);
            grade_is_1_1Course1Semester2User31.setGradeStory(user31Story);
            grade_is_1_1Course1Semester2User31.setGradeSocialScience(user31SocialScience);
            grade_is_1_1Course1Semester2User31.setGradePhysicalTraining(user31PhysicalTraining);
            grade_is_1_1Course1Semester2User31.setGradeSecurityBasics(user31SecurityBasics);
            grade_is_1_1Course1Semester2User31.setGradeNativeLiterature(user31NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User31);

            //            //user32

            grade_is_1_1Course1Semester2User32.setUsername(user32Username);
            grade_is_1_1Course1Semester2User32.setGradeRussianLanguage(user32RussianLanguage);
            grade_is_1_1Course1Semester2User32.setGradeLiterature(user32Literature);
            grade_is_1_1Course1Semester2User32.setGradeMathematics(user32Mathematics);
            grade_is_1_1Course1Semester2User32.setGradeEnglishLanguage(user32EnglishLanguage);
            grade_is_1_1Course1Semester2User32.setGradeComputerScience(user32ComputerScience);
            grade_is_1_1Course1Semester2User32.setGradePhysics(user32Physics);
            grade_is_1_1Course1Semester2User32.setGradeChemistry(user32Chemistry);
            grade_is_1_1Course1Semester2User32.setGradeStory(user32Story);
            grade_is_1_1Course1Semester2User32.setGradeSocialScience(user32SocialScience);
            grade_is_1_1Course1Semester2User32.setGradePhysicalTraining(user32PhysicalTraining);
            grade_is_1_1Course1Semester2User32.setGradeSecurityBasics(user32SecurityBasics);
            grade_is_1_1Course1Semester2User32.setGradeNativeLiterature(user32NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User32);

            //            //user33

            grade_is_1_1Course1Semester2User33.setUsername(user33Username);
            grade_is_1_1Course1Semester2User33.setGradeRussianLanguage(user33RussianLanguage);
            grade_is_1_1Course1Semester2User33.setGradeLiterature(user33Literature);
            grade_is_1_1Course1Semester2User33.setGradeMathematics(user33Mathematics);
            grade_is_1_1Course1Semester2User33.setGradeEnglishLanguage(user33EnglishLanguage);
            grade_is_1_1Course1Semester2User33.setGradeComputerScience(user33ComputerScience);
            grade_is_1_1Course1Semester2User33.setGradePhysics(user33Physics);
            grade_is_1_1Course1Semester2User33.setGradeChemistry(user33Chemistry);
            grade_is_1_1Course1Semester2User33.setGradeStory(user33Story);
            grade_is_1_1Course1Semester2User33.setGradeSocialScience(user33SocialScience);
            grade_is_1_1Course1Semester2User33.setGradePhysicalTraining(user33PhysicalTraining);
            grade_is_1_1Course1Semester2User33.setGradeSecurityBasics(user33SecurityBasics);
            grade_is_1_1Course1Semester2User33.setGradeNativeLiterature(user33NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User33);

            //            //user34

            grade_is_1_1Course1Semester2User34.setUsername(user34Username);
            grade_is_1_1Course1Semester2User34.setGradeRussianLanguage(user34RussianLanguage);
            grade_is_1_1Course1Semester2User34.setGradeLiterature(user34Literature);
            grade_is_1_1Course1Semester2User34.setGradeMathematics(user34Mathematics);
            grade_is_1_1Course1Semester2User34.setGradeEnglishLanguage(user34EnglishLanguage);
            grade_is_1_1Course1Semester2User34.setGradeComputerScience(user34ComputerScience);
            grade_is_1_1Course1Semester2User34.setGradePhysics(user34Physics);
            grade_is_1_1Course1Semester2User34.setGradeChemistry(user34Chemistry);
            grade_is_1_1Course1Semester2User34.setGradeStory(user34Story);
            grade_is_1_1Course1Semester2User34.setGradeSocialScience(user34SocialScience);
            grade_is_1_1Course1Semester2User34.setGradePhysicalTraining(user34PhysicalTraining);
            grade_is_1_1Course1Semester2User34.setGradeSecurityBasics(user34SecurityBasics);
            grade_is_1_1Course1Semester2User34.setGradeNativeLiterature(user34NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User34);

            //            //user35

            grade_is_1_1Course1Semester2User35.setUsername(user35Username);
            grade_is_1_1Course1Semester2User35.setGradeRussianLanguage(user35RussianLanguage);
            grade_is_1_1Course1Semester2User35.setGradeLiterature(user35Literature);
            grade_is_1_1Course1Semester2User35.setGradeMathematics(user35Mathematics);
            grade_is_1_1Course1Semester2User35.setGradeEnglishLanguage(user35EnglishLanguage);
            grade_is_1_1Course1Semester2User35.setGradeComputerScience(user35ComputerScience);
            grade_is_1_1Course1Semester2User35.setGradePhysics(user35Physics);
            grade_is_1_1Course1Semester2User35.setGradeChemistry(user35Chemistry);
            grade_is_1_1Course1Semester2User35.setGradeStory(user35Story);
            grade_is_1_1Course1Semester2User35.setGradeSocialScience(user35SocialScience);
            grade_is_1_1Course1Semester2User35.setGradePhysicalTraining(user35PhysicalTraining);
            grade_is_1_1Course1Semester2User35.setGradeSecurityBasics(user35SecurityBasics);
            grade_is_1_1Course1Semester2User35.setGradeNativeLiterature(user35NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User35);

            //            //user36

            grade_is_1_1Course1Semester2User36.setUsername(user36Username);
            grade_is_1_1Course1Semester2User36.setGradeRussianLanguage(user36RussianLanguage);
            grade_is_1_1Course1Semester2User36.setGradeLiterature(user36Literature);
            grade_is_1_1Course1Semester2User36.setGradeMathematics(user36Mathematics);
            grade_is_1_1Course1Semester2User36.setGradeEnglishLanguage(user36EnglishLanguage);
            grade_is_1_1Course1Semester2User36.setGradeComputerScience(user36ComputerScience);
            grade_is_1_1Course1Semester2User36.setGradePhysics(user36Physics);
            grade_is_1_1Course1Semester2User36.setGradeChemistry(user36Chemistry);
            grade_is_1_1Course1Semester2User36.setGradeStory(user36Story);
            grade_is_1_1Course1Semester2User36.setGradeSocialScience(user36SocialScience);
            grade_is_1_1Course1Semester2User36.setGradePhysicalTraining(user36PhysicalTraining);
            grade_is_1_1Course1Semester2User36.setGradeSecurityBasics(user36SecurityBasics);
            grade_is_1_1Course1Semester2User36.setGradeNativeLiterature(user36NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User36);

            //            //user37

            grade_is_1_1Course1Semester2User37.setUsername(user37Username);
            grade_is_1_1Course1Semester2User37.setGradeRussianLanguage(user37RussianLanguage);
            grade_is_1_1Course1Semester2User37.setGradeLiterature(user37Literature);
            grade_is_1_1Course1Semester2User37.setGradeMathematics(user37Mathematics);
            grade_is_1_1Course1Semester2User37.setGradeEnglishLanguage(user37EnglishLanguage);
            grade_is_1_1Course1Semester2User37.setGradeComputerScience(user37ComputerScience);
            grade_is_1_1Course1Semester2User37.setGradePhysics(user37Physics);
            grade_is_1_1Course1Semester2User37.setGradeChemistry(user37Chemistry);
            grade_is_1_1Course1Semester2User37.setGradeStory(user37Story);
            grade_is_1_1Course1Semester2User37.setGradeSocialScience(user37SocialScience);
            grade_is_1_1Course1Semester2User37.setGradePhysicalTraining(user37PhysicalTraining);
            grade_is_1_1Course1Semester2User37.setGradeSecurityBasics(user37SecurityBasics);
            grade_is_1_1Course1Semester2User37.setGradeNativeLiterature(user37NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User37);

            //            //user38

            grade_is_1_1Course1Semester2User38.setUsername(user38Username);
            grade_is_1_1Course1Semester2User38.setGradeRussianLanguage(user38RussianLanguage);
            grade_is_1_1Course1Semester2User38.setGradeLiterature(user38Literature);
            grade_is_1_1Course1Semester2User38.setGradeMathematics(user38Mathematics);
            grade_is_1_1Course1Semester2User38.setGradeEnglishLanguage(user38EnglishLanguage);
            grade_is_1_1Course1Semester2User38.setGradeComputerScience(user38ComputerScience);
            grade_is_1_1Course1Semester2User38.setGradePhysics(user38Physics);
            grade_is_1_1Course1Semester2User38.setGradeChemistry(user38Chemistry);
            grade_is_1_1Course1Semester2User38.setGradeStory(user38Story);
            grade_is_1_1Course1Semester2User38.setGradeSocialScience(user38SocialScience);
            grade_is_1_1Course1Semester2User38.setGradePhysicalTraining(user38PhysicalTraining);
            grade_is_1_1Course1Semester2User38.setGradeSecurityBasics(user38SecurityBasics);
            grade_is_1_1Course1Semester2User38.setGradeNativeLiterature(user38NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User38);

            //            //user39

            grade_is_1_1Course1Semester2User39.setUsername(user39Username);
            grade_is_1_1Course1Semester2User39.setGradeRussianLanguage(user39RussianLanguage);
            grade_is_1_1Course1Semester2User39.setGradeLiterature(user39Literature);
            grade_is_1_1Course1Semester2User39.setGradeMathematics(user39Mathematics);
            grade_is_1_1Course1Semester2User39.setGradeEnglishLanguage(user39EnglishLanguage);
            grade_is_1_1Course1Semester2User39.setGradeComputerScience(user39ComputerScience);
            grade_is_1_1Course1Semester2User39.setGradePhysics(user39Physics);
            grade_is_1_1Course1Semester2User39.setGradeChemistry(user39Chemistry);
            grade_is_1_1Course1Semester2User39.setGradeStory(user39Story);
            grade_is_1_1Course1Semester2User39.setGradeSocialScience(user39SocialScience);
            grade_is_1_1Course1Semester2User39.setGradePhysicalTraining(user39PhysicalTraining);
            grade_is_1_1Course1Semester2User39.setGradeSecurityBasics(user39SecurityBasics);
            grade_is_1_1Course1Semester2User39.setGradeNativeLiterature(user39NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User39);

            //            //user40

            grade_is_1_1Course1Semester2User40.setUsername(user40Username);
            grade_is_1_1Course1Semester2User40.setGradeRussianLanguage(user40RussianLanguage);
            grade_is_1_1Course1Semester2User40.setGradeLiterature(user40Literature);
            grade_is_1_1Course1Semester2User40.setGradeMathematics(user40Mathematics);
            grade_is_1_1Course1Semester2User40.setGradeEnglishLanguage(user40EnglishLanguage);
            grade_is_1_1Course1Semester2User40.setGradeComputerScience(user40ComputerScience);
            grade_is_1_1Course1Semester2User40.setGradePhysics(user40Physics);
            grade_is_1_1Course1Semester2User40.setGradeChemistry(user40Chemistry);
            grade_is_1_1Course1Semester2User40.setGradeStory(user40Story);
            grade_is_1_1Course1Semester2User40.setGradeSocialScience(user40SocialScience);
            grade_is_1_1Course1Semester2User40.setGradePhysicalTraining(user40PhysicalTraining);
            grade_is_1_1Course1Semester2User40.setGradeSecurityBasics(user40SecurityBasics);
            grade_is_1_1Course1Semester2User40.setGradeNativeLiterature(user40NativeLiterature);
            grade_is_1_1Course1Semester2Repository.save(grade_is_1_1Course1Semester2User40);

        } catch (Exception ignore) {

        }

    }


}
