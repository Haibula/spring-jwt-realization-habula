package com.example.demoauth.service.moderatorService.moderator_is1Service.course2;

import com.example.demoauth.models.grade_is1.models.course2.SpecialGrade_IS_1_1Course2Semester1;
import com.example.demoauth.repository.is1Repository.course2.SpecialGrade_IS_1_1Course2Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course2Semester1 {
    @Autowired
    SpecialGrade_IS_1_1Course2Semester1Repository specialGradeIs11Course2Semester1Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse2Semester1
    public void getMappingModer_is_1_1SpecialGreadeСourse2Semester1(Model model) {
        List<SpecialGrade_IS_1_1Course2Semester1> res = specialGradeIs11Course2Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course2Semester1::getUserID));
        List<SpecialGrade_IS_1_1Course2Semester1> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course2Semester1());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse2Semester2
    public void postMappingModer_is_1_1SpecialGreadeСourse2Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetStory = splitUser1Grades[2];
            String user1OffsetPhysicalTraining = splitUser1Grades[3];
            String user1OffsetGNPRIT = splitUser1Grades[4];
            String user1ExamElementsOfHigherMathematics = splitUser1Grades[5];
            String user1ExamDiscreteMathematics = splitUser1Grades[6];
            String user1ExamOperatingSystemsAndEnvironments = splitUser1Grades[7];
            String user1ExamComputerNetworks = splitUser1Grades[8];


            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetStory = splitUser2Grades[2];
            String user2OffsetPhysicalTraining = splitUser2Grades[3];
            String user2OffsetGNPRIT = splitUser2Grades[4];
            String user2ExamElementsOfHigherMathematics = splitUser2Grades[5];
            String user2ExamDiscreteMathematics = splitUser2Grades[6];
            String user2ExamOperatingSystemsAndEnvironments = splitUser2Grades[7];
            String user2ExamComputerNetworks = splitUser2Grades[8];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetStory = splitUser3Grades[2];
            String user3OffsetPhysicalTraining = splitUser3Grades[3];
            String user3OffsetGNPRIT = splitUser3Grades[4];
            String user3ExamElementsOfHigherMathematics = splitUser3Grades[5];
            String user3ExamDiscreteMathematics = splitUser3Grades[6];
            String user3ExamOperatingSystemsAndEnvironments = splitUser3Grades[7];
            String user3ExamComputerNetworks = splitUser3Grades[8];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetStory = splitUser4Grades[2];
            String user4OffsetPhysicalTraining = splitUser4Grades[3];
            String user4OffsetGNPRIT = splitUser4Grades[4];
            String user4ExamElementsOfHigherMathematics = splitUser4Grades[5];
            String user4ExamDiscreteMathematics = splitUser4Grades[6];
            String user4ExamOperatingSystemsAndEnvironments = splitUser4Grades[7];
            String user4ExamComputerNetworks = splitUser4Grades[8];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetStory = splitUser5Grades[2];
            String user5OffsetPhysicalTraining = splitUser5Grades[3];
            String user5OffsetGNPRIT = splitUser5Grades[4];
            String user5ExamElementsOfHigherMathematics = splitUser5Grades[5];
            String user5ExamDiscreteMathematics = splitUser5Grades[6];
            String user5ExamOperatingSystemsAndEnvironments = splitUser5Grades[7];
            String user5ExamComputerNetworks = splitUser5Grades[8];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetStory = splitUser6Grades[2];
            String user6OffsetPhysicalTraining = splitUser6Grades[3];
            String user6OffsetGNPRIT = splitUser6Grades[4];
            String user6ExamElementsOfHigherMathematics = splitUser6Grades[5];
            String user6ExamDiscreteMathematics = splitUser6Grades[6];
            String user6ExamOperatingSystemsAndEnvironments = splitUser6Grades[7];
            String user6ExamComputerNetworks = splitUser6Grades[8];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetStory = splitUser7Grades[2];
            String user7OffsetPhysicalTraining = splitUser7Grades[3];
            String user7OffsetGNPRIT = splitUser7Grades[4];
            String user7ExamElementsOfHigherMathematics = splitUser7Grades[5];
            String user7ExamDiscreteMathematics = splitUser7Grades[6];
            String user7ExamOperatingSystemsAndEnvironments = splitUser7Grades[7];
            String user7ExamComputerNetworks = splitUser7Grades[8];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetStory = splitUser8Grades[2];
            String user8OffsetPhysicalTraining = splitUser8Grades[3];
            String user8OffsetGNPRIT = splitUser8Grades[4];
            String user8ExamElementsOfHigherMathematics = splitUser8Grades[5];
            String user8ExamDiscreteMathematics = splitUser8Grades[6];
            String user8ExamOperatingSystemsAndEnvironments = splitUser8Grades[7];
            String user8ExamComputerNetworks = splitUser8Grades[8];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetStory = splitUser9Grades[2];
            String user9OffsetPhysicalTraining = splitUser9Grades[3];
            String user9OffsetGNPRIT = splitUser9Grades[4];
            String user9ExamElementsOfHigherMathematics = splitUser9Grades[5];
            String user9ExamDiscreteMathematics = splitUser9Grades[6];
            String user9ExamOperatingSystemsAndEnvironments = splitUser9Grades[7];
            String user9ExamComputerNetworks = splitUser9Grades[8];


            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetStory = splitUser10Grades[2];
            String user10OffsetPhysicalTraining = splitUser10Grades[3];
            String user10OffsetGNPRIT = splitUser10Grades[4];
            String user10ExamElementsOfHigherMathematics = splitUser10Grades[5];
            String user10ExamDiscreteMathematics = splitUser10Grades[6];
            String user10ExamOperatingSystemsAndEnvironments = splitUser10Grades[7];
            String user10ExamComputerNetworks = splitUser10Grades[8];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetStory = splitUser11Grades[2];
            String user11OffsetPhysicalTraining = splitUser11Grades[3];
            String user11OffsetGNPRIT = splitUser11Grades[4];
            String user11ExamElementsOfHigherMathematics = splitUser11Grades[5];
            String user11ExamDiscreteMathematics = splitUser11Grades[6];
            String user11ExamOperatingSystemsAndEnvironments = splitUser11Grades[7];
            String user11ExamComputerNetworks = splitUser11Grades[8];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetStory = splitUser12Grades[2];
            String user12OffsetPhysicalTraining = splitUser12Grades[3];
            String user12OffsetGNPRIT = splitUser12Grades[4];
            String user12ExamElementsOfHigherMathematics = splitUser12Grades[5];
            String user12ExamDiscreteMathematics = splitUser12Grades[6];
            String user12ExamOperatingSystemsAndEnvironments = splitUser12Grades[7];
            String user12ExamComputerNetworks = splitUser12Grades[8];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetStory = splitUser13Grades[2];
            String user13OffsetPhysicalTraining = splitUser13Grades[3];
            String user13OffsetGNPRIT = splitUser13Grades[4];
            String user13ExamElementsOfHigherMathematics = splitUser13Grades[5];
            String user13ExamDiscreteMathematics = splitUser13Grades[6];
            String user13ExamOperatingSystemsAndEnvironments = splitUser13Grades[7];
            String user13ExamComputerNetworks = splitUser13Grades[8];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetStory = splitUser14Grades[2];
            String user14OffsetPhysicalTraining = splitUser14Grades[3];
            String user14OffsetGNPRIT = splitUser14Grades[4];
            String user14ExamElementsOfHigherMathematics = splitUser14Grades[5];
            String user14ExamDiscreteMathematics = splitUser14Grades[6];
            String user14ExamOperatingSystemsAndEnvironments = splitUser14Grades[7];
            String user14ExamComputerNetworks = splitUser14Grades[8];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetStory = splitUser15Grades[2];
            String user15OffsetPhysicalTraining = splitUser15Grades[3];
            String user15OffsetGNPRIT = splitUser15Grades[4];
            String user15ExamElementsOfHigherMathematics = splitUser15Grades[5];
            String user15ExamDiscreteMathematics = splitUser15Grades[6];
            String user15ExamOperatingSystemsAndEnvironments = splitUser15Grades[7];
            String user15ExamComputerNetworks = splitUser15Grades[8];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetStory = splitUser16Grades[2];
            String user16OffsetPhysicalTraining = splitUser16Grades[3];
            String user16OffsetGNPRIT = splitUser16Grades[4];
            String user16ExamElementsOfHigherMathematics = splitUser16Grades[5];
            String user16ExamDiscreteMathematics = splitUser16Grades[6];
            String user16ExamOperatingSystemsAndEnvironments = splitUser16Grades[7];
            String user16ExamComputerNetworks = splitUser16Grades[8];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetStory = splitUser17Grades[2];
            String user17OffsetPhysicalTraining = splitUser17Grades[3];
            String user17OffsetGNPRIT = splitUser17Grades[4];
            String user17ExamElementsOfHigherMathematics = splitUser17Grades[5];
            String user17ExamDiscreteMathematics = splitUser17Grades[6];
            String user17ExamOperatingSystemsAndEnvironments = splitUser17Grades[7];
            String user17ExamComputerNetworks = splitUser17Grades[8];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetStory = splitUser18Grades[2];
            String user18OffsetPhysicalTraining = splitUser18Grades[3];
            String user18OffsetGNPRIT = splitUser18Grades[4];
            String user18ExamElementsOfHigherMathematics = splitUser18Grades[5];
            String user18ExamDiscreteMathematics = splitUser18Grades[6];
            String user18ExamOperatingSystemsAndEnvironments = splitUser18Grades[7];
            String user18ExamComputerNetworks = splitUser18Grades[8];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetStory = splitUser19Grades[2];
            String user19OffsetPhysicalTraining = splitUser19Grades[3];
            String user19OffsetGNPRIT = splitUser19Grades[4];
            String user19ExamElementsOfHigherMathematics = splitUser19Grades[5];
            String user19ExamDiscreteMathematics = splitUser19Grades[6];
            String user19ExamOperatingSystemsAndEnvironments = splitUser19Grades[7];
            String user19ExamComputerNetworks = splitUser19Grades[8];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetStory = splitUser20Grades[2];
            String user20OffsetPhysicalTraining = splitUser20Grades[3];
            String user20OffsetGNPRIT = splitUser20Grades[4];
            String user20ExamElementsOfHigherMathematics = splitUser20Grades[5];
            String user20ExamDiscreteMathematics = splitUser20Grades[6];
            String user20ExamOperatingSystemsAndEnvironments = splitUser20Grades[7];
            String user20ExamComputerNetworks = splitUser20Grades[8];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetStory = splitUser21Grades[2];
            String user21OffsetPhysicalTraining = splitUser21Grades[3];
            String user21OffsetGNPRIT = splitUser21Grades[4];
            String user21ExamElementsOfHigherMathematics = splitUser21Grades[5];
            String user21ExamDiscreteMathematics = splitUser21Grades[6];
            String user21ExamOperatingSystemsAndEnvironments = splitUser21Grades[7];
            String user21ExamComputerNetworks = splitUser21Grades[8];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetStory = splitUser22Grades[2];
            String user22OffsetPhysicalTraining = splitUser22Grades[3];
            String user22OffsetGNPRIT = splitUser22Grades[4];
            String user22ExamElementsOfHigherMathematics = splitUser22Grades[5];
            String user22ExamDiscreteMathematics = splitUser22Grades[6];
            String user22ExamOperatingSystemsAndEnvironments = splitUser22Grades[7];
            String user22ExamComputerNetworks = splitUser22Grades[8];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetStory = splitUser23Grades[2];
            String user23OffsetPhysicalTraining = splitUser23Grades[3];
            String user23OffsetGNPRIT = splitUser23Grades[4];
            String user23ExamElementsOfHigherMathematics = splitUser23Grades[5];
            String user23ExamDiscreteMathematics = splitUser23Grades[6];
            String user23ExamOperatingSystemsAndEnvironments = splitUser23Grades[7];
            String user23ExamComputerNetworks = splitUser23Grades[8];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetStory = splitUser24Grades[2];
            String user24OffsetPhysicalTraining = splitUser24Grades[3];
            String user24OffsetGNPRIT = splitUser24Grades[4];
            String user24ExamElementsOfHigherMathematics = splitUser24Grades[5];
            String user24ExamDiscreteMathematics = splitUser24Grades[6];
            String user24ExamOperatingSystemsAndEnvironments = splitUser24Grades[7];
            String user24ExamComputerNetworks = splitUser24Grades[8];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetStory = splitUser25Grades[2];
            String user25OffsetPhysicalTraining = splitUser25Grades[3];
            String user25OffsetGNPRIT = splitUser25Grades[4];
            String user25ExamElementsOfHigherMathematics = splitUser25Grades[5];
            String user25ExamDiscreteMathematics = splitUser25Grades[6];
            String user25ExamOperatingSystemsAndEnvironments = splitUser25Grades[7];
            String user25ExamComputerNetworks = splitUser25Grades[8];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetStory = splitUser26Grades[2];
            String user26OffsetPhysicalTraining = splitUser26Grades[3];
            String user26OffsetGNPRIT = splitUser26Grades[4];
            String user26ExamElementsOfHigherMathematics = splitUser26Grades[5];
            String user26ExamDiscreteMathematics = splitUser26Grades[6];
            String user26ExamOperatingSystemsAndEnvironments = splitUser26Grades[7];
            String user26ExamComputerNetworks = splitUser26Grades[8];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetStory = splitUser27Grades[2];
            String user27OffsetPhysicalTraining = splitUser27Grades[3];
            String user27OffsetGNPRIT = splitUser27Grades[4];
            String user27ExamElementsOfHigherMathematics = splitUser27Grades[5];
            String user27ExamDiscreteMathematics = splitUser27Grades[6];
            String user27ExamOperatingSystemsAndEnvironments = splitUser27Grades[7];
            String user27ExamComputerNetworks = splitUser27Grades[8];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetStory = splitUser28Grades[2];
            String user28OffsetPhysicalTraining = splitUser28Grades[3];
            String user28OffsetGNPRIT = splitUser28Grades[4];
            String user28ExamElementsOfHigherMathematics = splitUser28Grades[5];
            String user28ExamDiscreteMathematics = splitUser28Grades[6];
            String user28ExamOperatingSystemsAndEnvironments = splitUser28Grades[7];
            String user28ExamComputerNetworks = splitUser28Grades[8];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetStory = splitUser29Grades[2];
            String user29OffsetPhysicalTraining = splitUser29Grades[3];
            String user29OffsetGNPRIT = splitUser29Grades[4];
            String user29ExamElementsOfHigherMathematics = splitUser29Grades[5];
            String user29ExamDiscreteMathematics = splitUser29Grades[6];
            String user29ExamOperatingSystemsAndEnvironments = splitUser29Grades[7];
            String user29ExamComputerNetworks = splitUser29Grades[8];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetStory = splitUser30Grades[2];
            String user30OffsetPhysicalTraining = splitUser30Grades[3];
            String user30OffsetGNPRIT = splitUser30Grades[4];
            String user30ExamElementsOfHigherMathematics = splitUser30Grades[5];
            String user30ExamDiscreteMathematics = splitUser30Grades[6];
            String user30ExamOperatingSystemsAndEnvironments = splitUser30Grades[7];
            String user30ExamComputerNetworks = splitUser30Grades[8];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetStory = splitUser31Grades[2];
            String user31OffsetPhysicalTraining = splitUser31Grades[3];
            String user31OffsetGNPRIT = splitUser31Grades[4];
            String user31ExamElementsOfHigherMathematics = splitUser31Grades[5];
            String user31ExamDiscreteMathematics = splitUser31Grades[6];
            String user31ExamOperatingSystemsAndEnvironments = splitUser31Grades[7];
            String user31ExamComputerNetworks = splitUser31Grades[8];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetStory = splitUser32Grades[2];
            String user32OffsetPhysicalTraining = splitUser32Grades[3];
            String user32OffsetGNPRIT = splitUser32Grades[4];
            String user32ExamElementsOfHigherMathematics = splitUser32Grades[5];
            String user32ExamDiscreteMathematics = splitUser32Grades[6];
            String user32ExamOperatingSystemsAndEnvironments = splitUser32Grades[7];
            String user32ExamComputerNetworks = splitUser32Grades[8];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetStory = splitUser33Grades[2];
            String user33OffsetPhysicalTraining = splitUser33Grades[3];
            String user33OffsetGNPRIT = splitUser33Grades[4];
            String user33ExamElementsOfHigherMathematics = splitUser33Grades[5];
            String user33ExamDiscreteMathematics = splitUser33Grades[6];
            String user33ExamOperatingSystemsAndEnvironments = splitUser33Grades[7];
            String user33ExamComputerNetworks = splitUser33Grades[8];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetStory = splitUser34Grades[2];
            String user34OffsetPhysicalTraining = splitUser34Grades[3];
            String user34OffsetGNPRIT = splitUser34Grades[4];
            String user34ExamElementsOfHigherMathematics = splitUser34Grades[5];
            String user34ExamDiscreteMathematics = splitUser34Grades[6];
            String user34ExamOperatingSystemsAndEnvironments = splitUser34Grades[7];
            String user34ExamComputerNetworks = splitUser34Grades[8];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetStory = splitUser35Grades[2];
            String user35OffsetPhysicalTraining = splitUser35Grades[3];
            String user35OffsetGNPRIT = splitUser35Grades[4];
            String user35ExamElementsOfHigherMathematics = splitUser35Grades[5];
            String user35ExamDiscreteMathematics = splitUser35Grades[6];
            String user35ExamOperatingSystemsAndEnvironments = splitUser35Grades[7];
            String user35ExamComputerNetworks = splitUser35Grades[8];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetStory = splitUser36Grades[2];
            String user36OffsetPhysicalTraining = splitUser36Grades[3];
            String user36OffsetGNPRIT = splitUser36Grades[4];
            String user36ExamElementsOfHigherMathematics = splitUser36Grades[5];
            String user36ExamDiscreteMathematics = splitUser36Grades[6];
            String user36ExamOperatingSystemsAndEnvironments = splitUser36Grades[7];
            String user36ExamComputerNetworks = splitUser36Grades[8];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetStory = splitUser37Grades[2];
            String user37OffsetPhysicalTraining = splitUser37Grades[3];
            String user37OffsetGNPRIT = splitUser37Grades[4];
            String user37ExamElementsOfHigherMathematics = splitUser37Grades[5];
            String user37ExamDiscreteMathematics = splitUser37Grades[6];
            String user37ExamOperatingSystemsAndEnvironments = splitUser37Grades[7];
            String user37ExamComputerNetworks = splitUser37Grades[8];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetStory = splitUser38Grades[2];
            String user38OffsetPhysicalTraining = splitUser38Grades[3];
            String user38OffsetGNPRIT = splitUser38Grades[4];
            String user38ExamElementsOfHigherMathematics = splitUser38Grades[5];
            String user38ExamDiscreteMathematics = splitUser38Grades[6];
            String user38ExamOperatingSystemsAndEnvironments = splitUser38Grades[7];
            String user38ExamComputerNetworks = splitUser38Grades[8];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetStory = splitUser39Grades[2];
            String user39OffsetPhysicalTraining = splitUser39Grades[3];
            String user39OffsetGNPRIT = splitUser39Grades[4];
            String user39ExamElementsOfHigherMathematics = splitUser39Grades[5];
            String user39ExamDiscreteMathematics = splitUser39Grades[6];
            String user39ExamOperatingSystemsAndEnvironments = splitUser39Grades[7];
            String user39ExamComputerNetworks = splitUser39Grades[8];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetStory = splitUser40Grades[2];
            String user40OffsetPhysicalTraining = splitUser40Grades[3];
            String user40OffsetGNPRIT = splitUser40Grades[4];
            String user40ExamElementsOfHigherMathematics = splitUser40Grades[5];
            String user40ExamDiscreteMathematics = splitUser40Grades[6];
            String user40ExamOperatingSystemsAndEnvironments = splitUser40Grades[7];
            String user40ExamComputerNetworks = splitUser40Grades[8];


            ArrayList<SpecialGrade_IS_1_1Course2Semester1> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user1Id, user1Username, user1DifOffsetStory, user1OffsetPhysicalTraining, user1OffsetGNPRIT, user1ExamElementsOfHigherMathematics, user1ExamDiscreteMathematics, user1ExamOperatingSystemsAndEnvironments, user1ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user2Id, user2Username, user2DifOffsetStory, user2OffsetPhysicalTraining, user2OffsetGNPRIT, user2ExamElementsOfHigherMathematics, user2ExamDiscreteMathematics, user2ExamOperatingSystemsAndEnvironments, user2ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user3Id, user3Username, user3DifOffsetStory, user3OffsetPhysicalTraining, user3OffsetGNPRIT, user3ExamElementsOfHigherMathematics, user3ExamDiscreteMathematics, user3ExamOperatingSystemsAndEnvironments, user3ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user4Id, user4Username, user4DifOffsetStory, user4OffsetPhysicalTraining, user4OffsetGNPRIT, user4ExamElementsOfHigherMathematics, user4ExamDiscreteMathematics, user4ExamOperatingSystemsAndEnvironments, user4ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user5Id, user5Username, user5DifOffsetStory, user5OffsetPhysicalTraining, user5OffsetGNPRIT, user5ExamElementsOfHigherMathematics, user5ExamDiscreteMathematics, user5ExamOperatingSystemsAndEnvironments, user5ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user6Id, user6Username, user6DifOffsetStory, user6OffsetPhysicalTraining, user6OffsetGNPRIT, user6ExamElementsOfHigherMathematics, user6ExamDiscreteMathematics, user6ExamOperatingSystemsAndEnvironments, user6ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user7Id, user7Username, user7DifOffsetStory, user7OffsetPhysicalTraining, user7OffsetGNPRIT, user7ExamElementsOfHigherMathematics, user7ExamDiscreteMathematics, user7ExamOperatingSystemsAndEnvironments, user7ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user8Id, user8Username, user8DifOffsetStory, user8OffsetPhysicalTraining, user8OffsetGNPRIT, user8ExamElementsOfHigherMathematics, user8ExamDiscreteMathematics, user8ExamOperatingSystemsAndEnvironments, user8ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user9Id, user9Username, user9DifOffsetStory, user9OffsetPhysicalTraining, user9OffsetGNPRIT, user9ExamElementsOfHigherMathematics, user9ExamDiscreteMathematics, user9ExamOperatingSystemsAndEnvironments, user9ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user10Id, user10Username, user10DifOffsetStory, user10OffsetPhysicalTraining, user10OffsetGNPRIT, user10ExamElementsOfHigherMathematics, user10ExamDiscreteMathematics, user10ExamOperatingSystemsAndEnvironments, user10ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user11Id, user11Username, user11DifOffsetStory, user11OffsetPhysicalTraining, user11OffsetGNPRIT, user11ExamElementsOfHigherMathematics, user11ExamDiscreteMathematics, user11ExamOperatingSystemsAndEnvironments, user11ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user12Id, user12Username, user12DifOffsetStory, user12OffsetPhysicalTraining, user12OffsetGNPRIT, user12ExamElementsOfHigherMathematics, user12ExamDiscreteMathematics, user12ExamOperatingSystemsAndEnvironments, user12ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user13Id, user13Username, user13DifOffsetStory, user13OffsetPhysicalTraining, user13OffsetGNPRIT, user13ExamElementsOfHigherMathematics, user13ExamDiscreteMathematics, user13ExamOperatingSystemsAndEnvironments, user13ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user14Id, user14Username, user14DifOffsetStory, user14OffsetPhysicalTraining, user14OffsetGNPRIT, user14ExamElementsOfHigherMathematics, user14ExamDiscreteMathematics, user14ExamOperatingSystemsAndEnvironments, user14ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user15Id, user15Username, user15DifOffsetStory, user15OffsetPhysicalTraining, user15OffsetGNPRIT, user15ExamElementsOfHigherMathematics, user15ExamDiscreteMathematics, user15ExamOperatingSystemsAndEnvironments, user15ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user16Id, user16Username, user16DifOffsetStory, user16OffsetPhysicalTraining, user16OffsetGNPRIT, user16ExamElementsOfHigherMathematics, user16ExamDiscreteMathematics, user16ExamOperatingSystemsAndEnvironments, user16ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user17Id, user17Username, user17DifOffsetStory, user17OffsetPhysicalTraining, user17OffsetGNPRIT, user17ExamElementsOfHigherMathematics, user17ExamDiscreteMathematics, user17ExamOperatingSystemsAndEnvironments, user17ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user18Id, user18Username, user18DifOffsetStory, user18OffsetPhysicalTraining, user18OffsetGNPRIT, user18ExamElementsOfHigherMathematics, user18ExamDiscreteMathematics, user18ExamOperatingSystemsAndEnvironments, user18ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user19Id, user19Username, user19DifOffsetStory, user19OffsetPhysicalTraining, user19OffsetGNPRIT, user19ExamElementsOfHigherMathematics, user19ExamDiscreteMathematics, user19ExamOperatingSystemsAndEnvironments, user19ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user20Id, user20Username, user20DifOffsetStory, user20OffsetPhysicalTraining, user20OffsetGNPRIT, user20ExamElementsOfHigherMathematics, user20ExamDiscreteMathematics, user20ExamOperatingSystemsAndEnvironments, user20ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user21Id, user21Username, user21DifOffsetStory, user21OffsetPhysicalTraining, user21OffsetGNPRIT, user21ExamElementsOfHigherMathematics, user21ExamDiscreteMathematics, user21ExamOperatingSystemsAndEnvironments, user21ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user22Id, user22Username, user22DifOffsetStory, user22OffsetPhysicalTraining, user22OffsetGNPRIT, user22ExamElementsOfHigherMathematics, user22ExamDiscreteMathematics, user22ExamOperatingSystemsAndEnvironments, user22ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user23Id, user23Username, user23DifOffsetStory, user23OffsetPhysicalTraining, user23OffsetGNPRIT, user23ExamElementsOfHigherMathematics, user23ExamDiscreteMathematics, user23ExamOperatingSystemsAndEnvironments, user23ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user24Id, user24Username, user24DifOffsetStory, user24OffsetPhysicalTraining, user24OffsetGNPRIT, user24ExamElementsOfHigherMathematics, user24ExamDiscreteMathematics, user24ExamOperatingSystemsAndEnvironments, user24ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user25Id, user25Username, user25DifOffsetStory, user25OffsetPhysicalTraining, user25OffsetGNPRIT, user25ExamElementsOfHigherMathematics, user25ExamDiscreteMathematics, user25ExamOperatingSystemsAndEnvironments, user25ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user26Id, user26Username, user26DifOffsetStory, user26OffsetPhysicalTraining, user26OffsetGNPRIT, user26ExamElementsOfHigherMathematics, user26ExamDiscreteMathematics, user26ExamOperatingSystemsAndEnvironments, user26ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user27Id, user27Username, user27DifOffsetStory, user27OffsetPhysicalTraining, user27OffsetGNPRIT, user27ExamElementsOfHigherMathematics, user27ExamDiscreteMathematics, user27ExamOperatingSystemsAndEnvironments, user27ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user28Id, user28Username, user28DifOffsetStory, user28OffsetPhysicalTraining, user28OffsetGNPRIT, user28ExamElementsOfHigherMathematics, user28ExamDiscreteMathematics, user28ExamOperatingSystemsAndEnvironments, user28ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user29Id, user29Username, user29DifOffsetStory, user29OffsetPhysicalTraining, user29OffsetGNPRIT, user29ExamElementsOfHigherMathematics, user29ExamDiscreteMathematics, user29ExamOperatingSystemsAndEnvironments, user29ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user30Id, user30Username, user30DifOffsetStory, user30OffsetPhysicalTraining, user30OffsetGNPRIT, user30ExamElementsOfHigherMathematics, user30ExamDiscreteMathematics, user30ExamOperatingSystemsAndEnvironments, user30ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user31Id, user31Username, user31DifOffsetStory, user31OffsetPhysicalTraining, user31OffsetGNPRIT, user31ExamElementsOfHigherMathematics, user31ExamDiscreteMathematics, user31ExamOperatingSystemsAndEnvironments, user31ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user32Id, user32Username, user32DifOffsetStory, user32OffsetPhysicalTraining, user32OffsetGNPRIT, user32ExamElementsOfHigherMathematics, user32ExamDiscreteMathematics, user32ExamOperatingSystemsAndEnvironments, user32ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user33Id, user33Username, user33DifOffsetStory, user33OffsetPhysicalTraining, user33OffsetGNPRIT, user33ExamElementsOfHigherMathematics, user33ExamDiscreteMathematics, user33ExamOperatingSystemsAndEnvironments, user33ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user34Id, user34Username, user34DifOffsetStory, user34OffsetPhysicalTraining, user34OffsetGNPRIT, user34ExamElementsOfHigherMathematics, user34ExamDiscreteMathematics, user34ExamOperatingSystemsAndEnvironments, user34ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user35Id, user35Username, user35DifOffsetStory, user35OffsetPhysicalTraining, user35OffsetGNPRIT, user35ExamElementsOfHigherMathematics, user35ExamDiscreteMathematics, user35ExamOperatingSystemsAndEnvironments, user35ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user36Id, user36Username, user36DifOffsetStory, user36OffsetPhysicalTraining, user36OffsetGNPRIT, user36ExamElementsOfHigherMathematics, user36ExamDiscreteMathematics, user36ExamOperatingSystemsAndEnvironments, user36ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user37Id, user37Username, user37DifOffsetStory, user37OffsetPhysicalTraining, user37OffsetGNPRIT, user37ExamElementsOfHigherMathematics, user37ExamDiscreteMathematics, user37ExamOperatingSystemsAndEnvironments, user37ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user38Id, user38Username, user38DifOffsetStory, user38OffsetPhysicalTraining, user38OffsetGNPRIT, user38ExamElementsOfHigherMathematics, user38ExamDiscreteMathematics, user38ExamOperatingSystemsAndEnvironments, user38ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user39Id, user39Username, user39DifOffsetStory, user39OffsetPhysicalTraining, user39OffsetGNPRIT, user39ExamElementsOfHigherMathematics, user39ExamDiscreteMathematics, user39ExamOperatingSystemsAndEnvironments, user39ExamComputerNetworks));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester1(user40Id, user40Username, user40DifOffsetStory, user40OffsetPhysicalTraining, user40OffsetGNPRIT, user40ExamElementsOfHigherMathematics, user40ExamDiscreteMathematics, user40ExamOperatingSystemsAndEnvironments, user40ExamComputerNetworks));

            if (specialGradeIs11Course2Semester1Repository.findAll().isEmpty()) {
                specialGradeIs11Course2Semester1Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course2Semester1> user1Row = specialGradeIs11Course2Semester1Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User1 = user1Row.get();
            specialGrade_IS_1_1Course2Semester1User1.setUsername(user1Username);
            specialGrade_IS_1_1Course2Semester1User1.setDifOffsetStory(user1DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User1.setOffsetPhysicalTraining(user1OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User1.setOffsetGNPRIT(user1OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User1.setExamElementsOfHigherMathematics(user1ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User1.setExamDiscreteMathematics(user1ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User1.setExamOperatingSystemsAndEnvironments(user1ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User1.setExamComputerNetworks(user1ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course2Semester1> user2Row = specialGradeIs11Course2Semester1Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User2 = user2Row.get();
            specialGrade_IS_1_1Course2Semester1User2.setUsername(user2Username);
            specialGrade_IS_1_1Course2Semester1User2.setDifOffsetStory(user2DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User2.setOffsetPhysicalTraining(user2OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User2.setOffsetGNPRIT(user2OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User2.setExamElementsOfHigherMathematics(user2ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User2.setExamDiscreteMathematics(user2ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User2.setExamOperatingSystemsAndEnvironments(user2ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User2.setExamComputerNetworks(user2ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course2Semester1> user3Row = specialGradeIs11Course2Semester1Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User3 = user3Row.get();
            specialGrade_IS_1_1Course2Semester1User3.setUsername(user3Username);
            specialGrade_IS_1_1Course2Semester1User3.setDifOffsetStory(user3DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User3.setOffsetPhysicalTraining(user3OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User3.setOffsetGNPRIT(user3OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User3.setExamElementsOfHigherMathematics(user3ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User3.setExamDiscreteMathematics(user3ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User3.setExamOperatingSystemsAndEnvironments(user3ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User3.setExamComputerNetworks(user3ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course2Semester1> user4Row = specialGradeIs11Course2Semester1Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User4 = user4Row.get();
            specialGrade_IS_1_1Course2Semester1User4.setUsername(user4Username);
            specialGrade_IS_1_1Course2Semester1User4.setDifOffsetStory(user4DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User4.setOffsetPhysicalTraining(user4OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User4.setOffsetGNPRIT(user4OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User4.setExamElementsOfHigherMathematics(user4ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User4.setExamDiscreteMathematics(user4ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User4.setExamOperatingSystemsAndEnvironments(user4ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User4.setExamComputerNetworks(user4ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course2Semester1> user5Row = specialGradeIs11Course2Semester1Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User5 = user5Row.get();
            specialGrade_IS_1_1Course2Semester1User5.setUsername(user5Username);
            specialGrade_IS_1_1Course2Semester1User5.setDifOffsetStory(user5DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User5.setOffsetPhysicalTraining(user5OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User5.setOffsetGNPRIT(user5OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User5.setExamElementsOfHigherMathematics(user5ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User5.setExamDiscreteMathematics(user5ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User5.setExamOperatingSystemsAndEnvironments(user5ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User5.setExamComputerNetworks(user5ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course2Semester1> user6Row = specialGradeIs11Course2Semester1Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User6 = user6Row.get();
            specialGrade_IS_1_1Course2Semester1User6.setUsername(user6Username);
            specialGrade_IS_1_1Course2Semester1User6.setDifOffsetStory(user6DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User6.setOffsetPhysicalTraining(user6OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User6.setOffsetGNPRIT(user6OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User6.setExamElementsOfHigherMathematics(user6ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User6.setExamDiscreteMathematics(user6ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User6.setExamOperatingSystemsAndEnvironments(user6ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User6.setExamComputerNetworks(user6ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course2Semester1> user7Row = specialGradeIs11Course2Semester1Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User7 = user7Row.get();
            specialGrade_IS_1_1Course2Semester1User7.setUsername(user7Username);
            specialGrade_IS_1_1Course2Semester1User7.setDifOffsetStory(user7DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User7.setOffsetPhysicalTraining(user7OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User7.setOffsetGNPRIT(user7OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User7.setExamElementsOfHigherMathematics(user7ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User7.setExamDiscreteMathematics(user7ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User7.setExamOperatingSystemsAndEnvironments(user7ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User7.setExamComputerNetworks(user7ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course2Semester1> user8Row = specialGradeIs11Course2Semester1Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User8 = user8Row.get();
            specialGrade_IS_1_1Course2Semester1User8.setUsername(user8Username);
            specialGrade_IS_1_1Course2Semester1User8.setDifOffsetStory(user8DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User8.setOffsetPhysicalTraining(user8OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User8.setOffsetGNPRIT(user8OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User8.setExamElementsOfHigherMathematics(user8ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User8.setExamDiscreteMathematics(user8ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User8.setExamOperatingSystemsAndEnvironments(user8ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User8.setExamComputerNetworks(user8ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course2Semester1> user9Row = specialGradeIs11Course2Semester1Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User9 = user9Row.get();
            specialGrade_IS_1_1Course2Semester1User9.setUsername(user9Username);
            specialGrade_IS_1_1Course2Semester1User9.setDifOffsetStory(user9DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User9.setOffsetPhysicalTraining(user9OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User9.setOffsetGNPRIT(user9OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User9.setExamElementsOfHigherMathematics(user9ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User9.setExamDiscreteMathematics(user9ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User9.setExamOperatingSystemsAndEnvironments(user9ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User9.setExamComputerNetworks(user9ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course2Semester1> user10Row = specialGradeIs11Course2Semester1Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User10 = user10Row.get();
            specialGrade_IS_1_1Course2Semester1User10.setUsername(user10Username);
            specialGrade_IS_1_1Course2Semester1User10.setDifOffsetStory(user10DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User10.setOffsetPhysicalTraining(user10OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User10.setOffsetGNPRIT(user10OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User10.setExamElementsOfHigherMathematics(user10ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User10.setExamDiscreteMathematics(user10ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User10.setExamOperatingSystemsAndEnvironments(user10ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User10.setExamComputerNetworks(user10ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course2Semester1> user11Row = specialGradeIs11Course2Semester1Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User11 = user11Row.get();
            specialGrade_IS_1_1Course2Semester1User11.setUsername(user11Username);
            specialGrade_IS_1_1Course2Semester1User11.setDifOffsetStory(user11DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User11.setOffsetPhysicalTraining(user11OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User11.setOffsetGNPRIT(user11OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User11.setExamElementsOfHigherMathematics(user11ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User11.setExamDiscreteMathematics(user11ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User11.setExamOperatingSystemsAndEnvironments(user11ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User11.setExamComputerNetworks(user11ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course2Semester1> user12Row = specialGradeIs11Course2Semester1Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User12 = user12Row.get();
            specialGrade_IS_1_1Course2Semester1User12.setUsername(user12Username);
            specialGrade_IS_1_1Course2Semester1User12.setDifOffsetStory(user12DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User12.setOffsetPhysicalTraining(user12OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User12.setOffsetGNPRIT(user12OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User12.setExamElementsOfHigherMathematics(user12ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User12.setExamDiscreteMathematics(user12ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User12.setExamOperatingSystemsAndEnvironments(user12ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User12.setExamComputerNetworks(user12ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course2Semester1> user13Row = specialGradeIs11Course2Semester1Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User13 = user13Row.get();
            specialGrade_IS_1_1Course2Semester1User13.setUsername(user13Username);
            specialGrade_IS_1_1Course2Semester1User13.setDifOffsetStory(user13DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User13.setOffsetPhysicalTraining(user13OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User13.setOffsetGNPRIT(user13OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User13.setExamElementsOfHigherMathematics(user13ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User13.setExamDiscreteMathematics(user13ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User13.setExamOperatingSystemsAndEnvironments(user13ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User13.setExamComputerNetworks(user13ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course2Semester1> user14Row = specialGradeIs11Course2Semester1Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User14 = user14Row.get();
            specialGrade_IS_1_1Course2Semester1User14.setUsername(user14Username);
            specialGrade_IS_1_1Course2Semester1User14.setDifOffsetStory(user14DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User14.setOffsetPhysicalTraining(user14OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User14.setOffsetGNPRIT(user14OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User14.setExamElementsOfHigherMathematics(user14ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User14.setExamDiscreteMathematics(user14ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User14.setExamOperatingSystemsAndEnvironments(user14ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User14.setExamComputerNetworks(user14ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course2Semester1> user15Row = specialGradeIs11Course2Semester1Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User15 = user15Row.get();
            specialGrade_IS_1_1Course2Semester1User15.setUsername(user15Username);
            specialGrade_IS_1_1Course2Semester1User15.setDifOffsetStory(user15DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User15.setOffsetPhysicalTraining(user15OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User15.setOffsetGNPRIT(user15OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User15.setExamElementsOfHigherMathematics(user15ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User15.setExamDiscreteMathematics(user15ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User15.setExamOperatingSystemsAndEnvironments(user15ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User15.setExamComputerNetworks(user15ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course2Semester1> user16Row = specialGradeIs11Course2Semester1Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User16 = user16Row.get();
            specialGrade_IS_1_1Course2Semester1User16.setUsername(user16Username);
            specialGrade_IS_1_1Course2Semester1User16.setDifOffsetStory(user16DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User16.setOffsetPhysicalTraining(user16OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User16.setOffsetGNPRIT(user16OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User16.setExamElementsOfHigherMathematics(user16ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User16.setExamDiscreteMathematics(user16ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User16.setExamOperatingSystemsAndEnvironments(user16ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User16.setExamComputerNetworks(user16ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course2Semester1> user17Row = specialGradeIs11Course2Semester1Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User17 = user17Row.get();
            specialGrade_IS_1_1Course2Semester1User17.setUsername(user17Username);
            specialGrade_IS_1_1Course2Semester1User17.setDifOffsetStory(user17DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User17.setOffsetPhysicalTraining(user17OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User17.setOffsetGNPRIT(user17OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User17.setExamElementsOfHigherMathematics(user17ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User17.setExamDiscreteMathematics(user17ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User17.setExamOperatingSystemsAndEnvironments(user17ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User17.setExamComputerNetworks(user17ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course2Semester1> user18Row = specialGradeIs11Course2Semester1Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User18 = user18Row.get();
            specialGrade_IS_1_1Course2Semester1User18.setUsername(user18Username);
            specialGrade_IS_1_1Course2Semester1User18.setDifOffsetStory(user18DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User18.setOffsetPhysicalTraining(user18OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User18.setOffsetGNPRIT(user18OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User18.setExamElementsOfHigherMathematics(user18ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User18.setExamDiscreteMathematics(user18ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User18.setExamOperatingSystemsAndEnvironments(user18ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User18.setExamComputerNetworks(user18ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course2Semester1> user19Row = specialGradeIs11Course2Semester1Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User19 = user19Row.get();
            specialGrade_IS_1_1Course2Semester1User19.setUsername(user19Username);
            specialGrade_IS_1_1Course2Semester1User19.setDifOffsetStory(user19DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User19.setOffsetPhysicalTraining(user19OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User19.setOffsetGNPRIT(user19OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User19.setExamElementsOfHigherMathematics(user19ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User19.setExamDiscreteMathematics(user19ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User19.setExamOperatingSystemsAndEnvironments(user19ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User19.setExamComputerNetworks(user19ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course2Semester1> user20Row = specialGradeIs11Course2Semester1Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User20 = user20Row.get();
            specialGrade_IS_1_1Course2Semester1User20.setUsername(user20Username);
            specialGrade_IS_1_1Course2Semester1User20.setDifOffsetStory(user20DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User20.setOffsetPhysicalTraining(user20OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User20.setOffsetGNPRIT(user20OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User20.setExamElementsOfHigherMathematics(user20ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User20.setExamDiscreteMathematics(user20ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User20.setExamOperatingSystemsAndEnvironments(user20ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User20.setExamComputerNetworks(user20ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course2Semester1> user21Row = specialGradeIs11Course2Semester1Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User21 = user21Row.get();
            specialGrade_IS_1_1Course2Semester1User21.setUsername(user21Username);
            specialGrade_IS_1_1Course2Semester1User21.setDifOffsetStory(user21DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User21.setOffsetPhysicalTraining(user21OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User21.setOffsetGNPRIT(user21OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User21.setExamElementsOfHigherMathematics(user21ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User21.setExamDiscreteMathematics(user21ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User21.setExamOperatingSystemsAndEnvironments(user21ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User21.setExamComputerNetworks(user21ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course2Semester1> user22Row = specialGradeIs11Course2Semester1Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User22 = user22Row.get();
            specialGrade_IS_1_1Course2Semester1User22.setUsername(user22Username);
            specialGrade_IS_1_1Course2Semester1User22.setDifOffsetStory(user22DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User22.setOffsetPhysicalTraining(user22OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User22.setOffsetGNPRIT(user22OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User22.setExamElementsOfHigherMathematics(user22ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User22.setExamDiscreteMathematics(user22ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User22.setExamOperatingSystemsAndEnvironments(user22ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User22.setExamComputerNetworks(user22ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course2Semester1> user23Row = specialGradeIs11Course2Semester1Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User23 = user23Row.get();
            specialGrade_IS_1_1Course2Semester1User23.setUsername(user23Username);
            specialGrade_IS_1_1Course2Semester1User23.setDifOffsetStory(user23DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User23.setOffsetPhysicalTraining(user23OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User23.setOffsetGNPRIT(user23OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User23.setExamElementsOfHigherMathematics(user23ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User23.setExamDiscreteMathematics(user23ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User23.setExamOperatingSystemsAndEnvironments(user23ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User23.setExamComputerNetworks(user23ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course2Semester1> user24Row = specialGradeIs11Course2Semester1Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User24 = user24Row.get();
            specialGrade_IS_1_1Course2Semester1User24.setUsername(user24Username);
            specialGrade_IS_1_1Course2Semester1User24.setDifOffsetStory(user24DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User24.setOffsetPhysicalTraining(user24OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User24.setOffsetGNPRIT(user24OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User24.setExamElementsOfHigherMathematics(user24ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User24.setExamDiscreteMathematics(user24ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User24.setExamOperatingSystemsAndEnvironments(user24ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User24.setExamComputerNetworks(user24ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course2Semester1> user25Row = specialGradeIs11Course2Semester1Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User25 = user25Row.get();
            specialGrade_IS_1_1Course2Semester1User25.setUsername(user25Username);
            specialGrade_IS_1_1Course2Semester1User25.setDifOffsetStory(user25DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User25.setOffsetPhysicalTraining(user25OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User25.setOffsetGNPRIT(user25OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User25.setExamElementsOfHigherMathematics(user25ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User25.setExamDiscreteMathematics(user25ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User25.setExamOperatingSystemsAndEnvironments(user25ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User25.setExamComputerNetworks(user25ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course2Semester1> user26Row = specialGradeIs11Course2Semester1Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User26 = user26Row.get();
            specialGrade_IS_1_1Course2Semester1User26.setUsername(user26Username);
            specialGrade_IS_1_1Course2Semester1User26.setDifOffsetStory(user26DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User26.setOffsetPhysicalTraining(user26OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User26.setOffsetGNPRIT(user26OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User26.setExamElementsOfHigherMathematics(user26ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User26.setExamDiscreteMathematics(user26ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User26.setExamOperatingSystemsAndEnvironments(user26ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User26.setExamComputerNetworks(user26ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course2Semester1> user27Row = specialGradeIs11Course2Semester1Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User27 = user27Row.get();
            specialGrade_IS_1_1Course2Semester1User27.setUsername(user27Username);
            specialGrade_IS_1_1Course2Semester1User27.setDifOffsetStory(user27DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User27.setOffsetPhysicalTraining(user27OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User27.setOffsetGNPRIT(user27OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User27.setExamElementsOfHigherMathematics(user27ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User27.setExamDiscreteMathematics(user27ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User27.setExamOperatingSystemsAndEnvironments(user27ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User27.setExamComputerNetworks(user27ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course2Semester1> user28Row = specialGradeIs11Course2Semester1Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User28 = user28Row.get();
            specialGrade_IS_1_1Course2Semester1User28.setUsername(user28Username);
            specialGrade_IS_1_1Course2Semester1User28.setDifOffsetStory(user28DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User28.setOffsetPhysicalTraining(user28OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User28.setOffsetGNPRIT(user28OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User28.setExamElementsOfHigherMathematics(user28ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User28.setExamDiscreteMathematics(user28ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User28.setExamOperatingSystemsAndEnvironments(user28ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User28.setExamComputerNetworks(user28ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course2Semester1> user29Row = specialGradeIs11Course2Semester1Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User29 = user29Row.get();
            specialGrade_IS_1_1Course2Semester1User29.setUsername(user29Username);
            specialGrade_IS_1_1Course2Semester1User29.setDifOffsetStory(user29DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User29.setOffsetPhysicalTraining(user29OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User29.setOffsetGNPRIT(user29OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User29.setExamElementsOfHigherMathematics(user29ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User29.setExamDiscreteMathematics(user29ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User29.setExamOperatingSystemsAndEnvironments(user29ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User29.setExamComputerNetworks(user29ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course2Semester1> user30Row = specialGradeIs11Course2Semester1Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User30 = user30Row.get();
            specialGrade_IS_1_1Course2Semester1User30.setUsername(user30Username);
            specialGrade_IS_1_1Course2Semester1User30.setDifOffsetStory(user30DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User30.setOffsetPhysicalTraining(user30OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User30.setOffsetGNPRIT(user30OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User30.setExamElementsOfHigherMathematics(user30ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User30.setExamDiscreteMathematics(user30ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User30.setExamOperatingSystemsAndEnvironments(user30ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User30.setExamComputerNetworks(user30ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course2Semester1> user31Row = specialGradeIs11Course2Semester1Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User31 = user31Row.get();
            specialGrade_IS_1_1Course2Semester1User31.setUsername(user31Username);
            specialGrade_IS_1_1Course2Semester1User31.setDifOffsetStory(user31DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User31.setOffsetPhysicalTraining(user31OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User31.setOffsetGNPRIT(user31OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User31.setExamElementsOfHigherMathematics(user31ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User31.setExamDiscreteMathematics(user31ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User31.setExamOperatingSystemsAndEnvironments(user31ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User31.setExamComputerNetworks(user31ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course2Semester1> user32Row = specialGradeIs11Course2Semester1Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User32 = user32Row.get();
            specialGrade_IS_1_1Course2Semester1User32.setUsername(user32Username);
            specialGrade_IS_1_1Course2Semester1User32.setDifOffsetStory(user32DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User32.setOffsetPhysicalTraining(user32OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User32.setOffsetGNPRIT(user32OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User32.setExamElementsOfHigherMathematics(user32ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User32.setExamDiscreteMathematics(user32ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User32.setExamOperatingSystemsAndEnvironments(user32ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User32.setExamComputerNetworks(user32ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course2Semester1> user33Row = specialGradeIs11Course2Semester1Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User33 = user33Row.get();
            specialGrade_IS_1_1Course2Semester1User33.setUsername(user33Username);
            specialGrade_IS_1_1Course2Semester1User33.setDifOffsetStory(user33DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User33.setOffsetPhysicalTraining(user33OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User33.setOffsetGNPRIT(user33OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User33.setExamElementsOfHigherMathematics(user33ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User33.setExamDiscreteMathematics(user33ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User33.setExamOperatingSystemsAndEnvironments(user33ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User33.setExamComputerNetworks(user33ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course2Semester1> user34Row = specialGradeIs11Course2Semester1Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User34 = user34Row.get();
            specialGrade_IS_1_1Course2Semester1User34.setUsername(user34Username);
            specialGrade_IS_1_1Course2Semester1User34.setDifOffsetStory(user34DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User34.setOffsetPhysicalTraining(user34OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User34.setOffsetGNPRIT(user34OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User34.setExamElementsOfHigherMathematics(user34ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User34.setExamDiscreteMathematics(user34ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User34.setExamOperatingSystemsAndEnvironments(user34ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User34.setExamComputerNetworks(user34ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course2Semester1> user35Row = specialGradeIs11Course2Semester1Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User35 = user35Row.get();
            specialGrade_IS_1_1Course2Semester1User35.setUsername(user35Username);
            specialGrade_IS_1_1Course2Semester1User35.setDifOffsetStory(user35DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User35.setOffsetPhysicalTraining(user35OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User35.setOffsetGNPRIT(user35OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User35.setExamElementsOfHigherMathematics(user35ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User35.setExamDiscreteMathematics(user35ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User35.setExamOperatingSystemsAndEnvironments(user35ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User35.setExamComputerNetworks(user35ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course2Semester1> user36Row = specialGradeIs11Course2Semester1Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User36 = user36Row.get();
            specialGrade_IS_1_1Course2Semester1User36.setUsername(user36Username);
            specialGrade_IS_1_1Course2Semester1User36.setDifOffsetStory(user36DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User36.setOffsetPhysicalTraining(user36OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User36.setOffsetGNPRIT(user36OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User36.setExamElementsOfHigherMathematics(user36ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User36.setExamDiscreteMathematics(user36ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User36.setExamOperatingSystemsAndEnvironments(user36ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User36.setExamComputerNetworks(user36ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course2Semester1> user37Row = specialGradeIs11Course2Semester1Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User37 = user37Row.get();
            specialGrade_IS_1_1Course2Semester1User37.setUsername(user37Username);
            specialGrade_IS_1_1Course2Semester1User37.setDifOffsetStory(user37DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User37.setOffsetPhysicalTraining(user37OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User37.setOffsetGNPRIT(user37OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User37.setExamElementsOfHigherMathematics(user37ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User37.setExamDiscreteMathematics(user37ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User37.setExamOperatingSystemsAndEnvironments(user37ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User37.setExamComputerNetworks(user37ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course2Semester1> user38Row = specialGradeIs11Course2Semester1Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User38 = user38Row.get();
            specialGrade_IS_1_1Course2Semester1User38.setUsername(user38Username);
            specialGrade_IS_1_1Course2Semester1User38.setDifOffsetStory(user38DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User38.setOffsetPhysicalTraining(user38OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User38.setOffsetGNPRIT(user38OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User38.setExamElementsOfHigherMathematics(user38ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User38.setExamDiscreteMathematics(user38ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User38.setExamOperatingSystemsAndEnvironments(user38ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User38.setExamComputerNetworks(user38ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course2Semester1> user39Row = specialGradeIs11Course2Semester1Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User39 = user39Row.get();
            specialGrade_IS_1_1Course2Semester1User39.setUsername(user39Username);
            specialGrade_IS_1_1Course2Semester1User39.setDifOffsetStory(user39DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User39.setOffsetPhysicalTraining(user39OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User39.setOffsetGNPRIT(user39OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User39.setExamElementsOfHigherMathematics(user39ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User39.setExamDiscreteMathematics(user39ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User39.setExamOperatingSystemsAndEnvironments(user39ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User39.setExamComputerNetworks(user39ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course2Semester1> user40Row = specialGradeIs11Course2Semester1Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course2Semester1 specialGrade_IS_1_1Course2Semester1User40 = user40Row.get();
            specialGrade_IS_1_1Course2Semester1User40.setUsername(user40Username);
            specialGrade_IS_1_1Course2Semester1User40.setDifOffsetStory(user40DifOffsetStory);
            specialGrade_IS_1_1Course2Semester1User40.setOffsetPhysicalTraining(user40OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester1User40.setOffsetGNPRIT(user40OffsetGNPRIT);
            specialGrade_IS_1_1Course2Semester1User40.setExamElementsOfHigherMathematics(user40ExamElementsOfHigherMathematics);
            specialGrade_IS_1_1Course2Semester1User40.setExamDiscreteMathematics(user40ExamDiscreteMathematics);
            specialGrade_IS_1_1Course2Semester1User40.setExamOperatingSystemsAndEnvironments(user40ExamOperatingSystemsAndEnvironments);
            specialGrade_IS_1_1Course2Semester1User40.setExamComputerNetworks(user40ExamComputerNetworks);
            specialGradeIs11Course2Semester1Repository.save(specialGrade_IS_1_1Course2Semester1User40);
        } catch (Exception ignore) {

        }
    }
}
