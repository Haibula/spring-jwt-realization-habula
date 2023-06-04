package com.example.demoauth.service.moderatorService.moderator_is1Service.course3;

import com.example.demoauth.models.grade_is1.models.course3.SpecialGrade_IS_1_1Course3Semester1;
import com.example.demoauth.repository.is1Repository.course3.SpecialGrade_IS_1_1Course3Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course3Semester1 {
    @Autowired

    SpecialGrade_IS_1_1Course3Semester1Repository specialGradeIs11Course3Semester1Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse3Semester1
    public void getMappingModer_is_1_1SpecialGreadeСourse3Semester1(Model model) {
        List<SpecialGrade_IS_1_1Course3Semester1> res = specialGradeIs11Course3Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course3Semester1::getUserID));
        List<SpecialGrade_IS_1_1Course3Semester1> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course3Semester1());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse3Semester1
    public void postMappingModer_is_1_1SpecialGreadeСourse3Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetPsychology = splitUser1Grades[2];
            String user1DifOffsetLifeSafety = splitUser1Grades[3];
            String user1DifOffsetStandardizationCertification = splitUser1Grades[4];
            String user1DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser1Grades[5];
            String user1OffsetPhysicalTraining = splitUser1Grades[6];
            String user1EducationalPractice = splitUser1Grades[7];



            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetPsychology = splitUser2Grades[2];
            String user2DifOffsetLifeSafety = splitUser2Grades[3];
            String user2DifOffsetStandardizationCertification = splitUser2Grades[4];
            String user2DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser2Grades[5];
            String user2OffsetPhysicalTraining = splitUser2Grades[6];
            String user2EducationalPractice = splitUser2Grades[7];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetPsychology = splitUser3Grades[2];
            String user3DifOffsetLifeSafety = splitUser3Grades[3];
            String user3DifOffsetStandardizationCertification = splitUser3Grades[4];
            String user3DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser3Grades[5];
            String user3OffsetPhysicalTraining = splitUser3Grades[6];
            String user3EducationalPractice = splitUser3Grades[7];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetPsychology = splitUser4Grades[2];
            String user4DifOffsetLifeSafety = splitUser4Grades[3];
            String user4DifOffsetStandardizationCertification = splitUser4Grades[4];
            String user4DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser4Grades[5];
            String user4OffsetPhysicalTraining = splitUser4Grades[6];
            String user4EducationalPractice = splitUser4Grades[7];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetPsychology = splitUser5Grades[2];
            String user5DifOffsetLifeSafety = splitUser5Grades[3];
            String user5DifOffsetStandardizationCertification = splitUser5Grades[4];
            String user5DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser5Grades[5];
            String user5OffsetPhysicalTraining = splitUser5Grades[6];
            String user5EducationalPractice = splitUser5Grades[7];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetPsychology = splitUser6Grades[2];
            String user6DifOffsetLifeSafety = splitUser6Grades[3];
            String user6DifOffsetStandardizationCertification = splitUser6Grades[4];
            String user6DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser6Grades[5];
            String user6OffsetPhysicalTraining = splitUser6Grades[6];
            String user6EducationalPractice = splitUser6Grades[7];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetPsychology = splitUser7Grades[2];
            String user7DifOffsetLifeSafety = splitUser7Grades[3];
            String user7DifOffsetStandardizationCertification = splitUser7Grades[4];
            String user7DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser7Grades[5];
            String user7OffsetPhysicalTraining = splitUser7Grades[6];
            String user7EducationalPractice = splitUser7Grades[7];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetPsychology = splitUser8Grades[2];
            String user8DifOffsetLifeSafety = splitUser8Grades[3];
            String user8DifOffsetStandardizationCertification = splitUser8Grades[4];
            String user8DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser8Grades[5];
            String user8OffsetPhysicalTraining = splitUser8Grades[6];
            String user8EducationalPractice = splitUser8Grades[7];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetPsychology = splitUser9Grades[2];
            String user9DifOffsetLifeSafety = splitUser9Grades[3];
            String user9DifOffsetStandardizationCertification = splitUser9Grades[4];
            String user9DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser9Grades[5];
            String user9OffsetPhysicalTraining = splitUser9Grades[6];
            String user9EducationalPractice = splitUser9Grades[7];


            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetPsychology = splitUser10Grades[2];
            String user10DifOffsetLifeSafety = splitUser10Grades[3];
            String user10DifOffsetStandardizationCertification = splitUser10Grades[4];
            String user10DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser10Grades[5];
            String user10OffsetPhysicalTraining = splitUser10Grades[6];
            String user10EducationalPractice = splitUser10Grades[7];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetPsychology = splitUser11Grades[2];
            String user11DifOffsetLifeSafety = splitUser11Grades[3];
            String user11DifOffsetStandardizationCertification = splitUser11Grades[4];
            String user11DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser11Grades[5];
            String user11OffsetPhysicalTraining = splitUser11Grades[6];
            String user11EducationalPractice = splitUser11Grades[7];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetPsychology = splitUser12Grades[2];
            String user12DifOffsetLifeSafety = splitUser12Grades[3];
            String user12DifOffsetStandardizationCertification = splitUser12Grades[4];
            String user12DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser12Grades[5];
            String user12OffsetPhysicalTraining = splitUser12Grades[6];
            String user12EducationalPractice = splitUser12Grades[7];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetPsychology = splitUser13Grades[2];
            String user13DifOffsetLifeSafety = splitUser13Grades[3];
            String user13DifOffsetStandardizationCertification = splitUser13Grades[4];
            String user13DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser13Grades[5];
            String user13OffsetPhysicalTraining = splitUser13Grades[6];
            String user13EducationalPractice = splitUser13Grades[7];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetPsychology = splitUser14Grades[2];
            String user14DifOffsetLifeSafety = splitUser14Grades[3];
            String user14DifOffsetStandardizationCertification = splitUser14Grades[4];
            String user14DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser14Grades[5];
            String user14OffsetPhysicalTraining = splitUser14Grades[6];
            String user14EducationalPractice = splitUser14Grades[7];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetPsychology = splitUser15Grades[2];
            String user15DifOffsetLifeSafety = splitUser15Grades[3];
            String user15DifOffsetStandardizationCertification = splitUser15Grades[4];
            String user15DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser15Grades[5];
            String user15OffsetPhysicalTraining = splitUser15Grades[6];
            String user15EducationalPractice = splitUser15Grades[7];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetPsychology = splitUser16Grades[2];
            String user16DifOffsetLifeSafety = splitUser16Grades[3];
            String user16DifOffsetStandardizationCertification = splitUser16Grades[4];
            String user16DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser16Grades[5];
            String user16OffsetPhysicalTraining = splitUser16Grades[6];
            String user16EducationalPractice = splitUser16Grades[7];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetPsychology = splitUser17Grades[2];
            String user17DifOffsetLifeSafety = splitUser17Grades[3];
            String user17DifOffsetStandardizationCertification = splitUser17Grades[4];
            String user17DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser17Grades[5];
            String user17OffsetPhysicalTraining = splitUser17Grades[6];
            String user17EducationalPractice = splitUser17Grades[7];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetPsychology = splitUser18Grades[2];
            String user18DifOffsetLifeSafety = splitUser18Grades[3];
            String user18DifOffsetStandardizationCertification = splitUser18Grades[4];
            String user18DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser18Grades[5];
            String user18OffsetPhysicalTraining = splitUser18Grades[6];
            String user18EducationalPractice = splitUser18Grades[7];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetPsychology = splitUser19Grades[2];
            String user19DifOffsetLifeSafety = splitUser19Grades[3];
            String user19DifOffsetStandardizationCertification = splitUser19Grades[4];
            String user19DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser19Grades[5];
            String user19OffsetPhysicalTraining = splitUser19Grades[6];
            String user19EducationalPractice = splitUser19Grades[7];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetPsychology = splitUser20Grades[2];
            String user20DifOffsetLifeSafety = splitUser20Grades[3];
            String user20DifOffsetStandardizationCertification = splitUser20Grades[4];
            String user20DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser20Grades[5];
            String user20OffsetPhysicalTraining = splitUser20Grades[6];
            String user20EducationalPractice = splitUser20Grades[7];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetPsychology = splitUser21Grades[2];
            String user21DifOffsetLifeSafety = splitUser21Grades[3];
            String user21DifOffsetStandardizationCertification = splitUser21Grades[4];
            String user21DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser21Grades[5];
            String user21OffsetPhysicalTraining = splitUser21Grades[6];
            String user21EducationalPractice = splitUser21Grades[7];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetPsychology = splitUser22Grades[2];
            String user22DifOffsetLifeSafety = splitUser22Grades[3];
            String user22DifOffsetStandardizationCertification = splitUser22Grades[4];
            String user22DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser22Grades[5];
            String user22OffsetPhysicalTraining = splitUser22Grades[6];
            String user22EducationalPractice = splitUser22Grades[7];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetPsychology = splitUser23Grades[2];
            String user23DifOffsetLifeSafety = splitUser23Grades[3];
            String user23DifOffsetStandardizationCertification = splitUser23Grades[4];
            String user23DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser23Grades[5];
            String user23OffsetPhysicalTraining = splitUser23Grades[6];
            String user23EducationalPractice = splitUser23Grades[7];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetPsychology = splitUser24Grades[2];
            String user24DifOffsetLifeSafety = splitUser24Grades[3];
            String user24DifOffsetStandardizationCertification = splitUser24Grades[4];
            String user24DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser24Grades[5];
            String user24OffsetPhysicalTraining = splitUser24Grades[6];
            String user24EducationalPractice = splitUser24Grades[7];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetPsychology = splitUser25Grades[2];
            String user25DifOffsetLifeSafety = splitUser25Grades[3];
            String user25DifOffsetStandardizationCertification = splitUser25Grades[4];
            String user25DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser25Grades[5];
            String user25OffsetPhysicalTraining = splitUser25Grades[6];
            String user25EducationalPractice = splitUser25Grades[7];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetPsychology = splitUser26Grades[2];
            String user26DifOffsetLifeSafety = splitUser26Grades[3];
            String user26DifOffsetStandardizationCertification = splitUser26Grades[4];
            String user26DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser26Grades[5];
            String user26OffsetPhysicalTraining = splitUser26Grades[6];
            String user26EducationalPractice = splitUser26Grades[7];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetPsychology = splitUser27Grades[2];
            String user27DifOffsetLifeSafety = splitUser27Grades[3];
            String user27DifOffsetStandardizationCertification = splitUser27Grades[4];
            String user27DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser27Grades[5];
            String user27OffsetPhysicalTraining = splitUser27Grades[6];
            String user27EducationalPractice = splitUser27Grades[7];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetPsychology = splitUser28Grades[2];
            String user28DifOffsetLifeSafety = splitUser28Grades[3];
            String user28DifOffsetStandardizationCertification = splitUser28Grades[4];
            String user28DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser28Grades[5];
            String user28OffsetPhysicalTraining = splitUser28Grades[6];
            String user28EducationalPractice = splitUser28Grades[7];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetPsychology = splitUser29Grades[2];
            String user29DifOffsetLifeSafety = splitUser29Grades[3];
            String user29DifOffsetStandardizationCertification = splitUser29Grades[4];
            String user29DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser29Grades[5];
            String user29OffsetPhysicalTraining = splitUser29Grades[6];
            String user29EducationalPractice = splitUser29Grades[7];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetPsychology = splitUser30Grades[2];
            String user30DifOffsetLifeSafety = splitUser30Grades[3];
            String user30DifOffsetStandardizationCertification = splitUser30Grades[4];
            String user30DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser30Grades[5];
            String user30OffsetPhysicalTraining = splitUser30Grades[6];
            String user30EducationalPractice = splitUser30Grades[7];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetPsychology = splitUser31Grades[2];
            String user31DifOffsetLifeSafety = splitUser31Grades[3];
            String user31DifOffsetStandardizationCertification = splitUser31Grades[4];
            String user31DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser31Grades[5];
            String user31OffsetPhysicalTraining = splitUser31Grades[6];
            String user31EducationalPractice = splitUser31Grades[7];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetPsychology = splitUser32Grades[2];
            String user32DifOffsetLifeSafety = splitUser32Grades[3];
            String user32DifOffsetStandardizationCertification = splitUser32Grades[4];
            String user32DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser32Grades[5];
            String user32OffsetPhysicalTraining = splitUser32Grades[6];
            String user32EducationalPractice = splitUser32Grades[7];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetPsychology = splitUser33Grades[2];
            String user33DifOffsetLifeSafety = splitUser33Grades[3];
            String user33DifOffsetStandardizationCertification = splitUser33Grades[4];
            String user33DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser33Grades[5];
            String user33OffsetPhysicalTraining = splitUser33Grades[6];
            String user33EducationalPractice = splitUser33Grades[7];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetPsychology = splitUser34Grades[2];
            String user34DifOffsetLifeSafety = splitUser34Grades[3];
            String user34DifOffsetStandardizationCertification = splitUser34Grades[4];
            String user34DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser34Grades[5];
            String user34OffsetPhysicalTraining = splitUser34Grades[6];
            String user34EducationalPractice = splitUser34Grades[7];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetPsychology = splitUser35Grades[2];
            String user35DifOffsetLifeSafety = splitUser35Grades[3];
            String user35DifOffsetStandardizationCertification = splitUser35Grades[4];
            String user35DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser35Grades[5];
            String user35OffsetPhysicalTraining = splitUser35Grades[6];
            String user35EducationalPractice = splitUser35Grades[7];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetPsychology = splitUser36Grades[2];
            String user36DifOffsetLifeSafety = splitUser36Grades[3];
            String user36DifOffsetStandardizationCertification = splitUser36Grades[4];
            String user36DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser36Grades[5];
            String user36OffsetPhysicalTraining = splitUser36Grades[6];
            String user36EducationalPractice = splitUser36Grades[7];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetPsychology = splitUser37Grades[2];
            String user37DifOffsetLifeSafety = splitUser37Grades[3];
            String user37DifOffsetStandardizationCertification = splitUser37Grades[4];
            String user37DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser37Grades[5];
            String user37OffsetPhysicalTraining = splitUser37Grades[6];
            String user37EducationalPractice = splitUser37Grades[7];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetPsychology = splitUser38Grades[2];
            String user38DifOffsetLifeSafety = splitUser38Grades[3];
            String user38DifOffsetStandardizationCertification = splitUser38Grades[4];
            String user38DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser38Grades[5];
            String user38OffsetPhysicalTraining = splitUser38Grades[6];
            String user38EducationalPractice = splitUser38Grades[7];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetPsychology = splitUser39Grades[2];
            String user39DifOffsetLifeSafety = splitUser39Grades[3];
            String user39DifOffsetStandardizationCertification = splitUser39Grades[4];
            String user39DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser39Grades[5];
            String user39OffsetPhysicalTraining = splitUser39Grades[6];
            String user39EducationalPractice = splitUser39Grades[7];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetPsychology = splitUser40Grades[2];
            String user40DifOffsetLifeSafety = splitUser40Grades[3];
            String user40DifOffsetStandardizationCertification = splitUser40Grades[4];
            String user40DifOffsetDatabaseDevelopmentProtectionTechnology = splitUser40Grades[5];
            String user40OffsetPhysicalTraining = splitUser40Grades[6];
            String user40EducationalPractice = splitUser40Grades[7];


            ArrayList<SpecialGrade_IS_1_1Course3Semester1> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user1Id, user1Username, user1DifOffsetPsychology, user1DifOffsetLifeSafety, user1DifOffsetStandardizationCertification, user1DifOffsetDatabaseDevelopmentProtectionTechnology, user1OffsetPhysicalTraining, user1EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user2Id, user2Username, user2DifOffsetPsychology, user2DifOffsetLifeSafety, user2DifOffsetStandardizationCertification, user2DifOffsetDatabaseDevelopmentProtectionTechnology, user2OffsetPhysicalTraining, user2EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user3Id, user3Username, user3DifOffsetPsychology, user3DifOffsetLifeSafety, user3DifOffsetStandardizationCertification, user3DifOffsetDatabaseDevelopmentProtectionTechnology, user3OffsetPhysicalTraining, user3EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user4Id, user4Username, user4DifOffsetPsychology, user4DifOffsetLifeSafety, user4DifOffsetStandardizationCertification, user4DifOffsetDatabaseDevelopmentProtectionTechnology, user4OffsetPhysicalTraining, user4EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user5Id, user5Username, user5DifOffsetPsychology, user5DifOffsetLifeSafety, user5DifOffsetStandardizationCertification, user5DifOffsetDatabaseDevelopmentProtectionTechnology, user5OffsetPhysicalTraining, user5EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user6Id, user6Username, user6DifOffsetPsychology, user6DifOffsetLifeSafety, user6DifOffsetStandardizationCertification, user6DifOffsetDatabaseDevelopmentProtectionTechnology, user6OffsetPhysicalTraining, user6EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user7Id, user7Username, user7DifOffsetPsychology, user7DifOffsetLifeSafety, user7DifOffsetStandardizationCertification, user7DifOffsetDatabaseDevelopmentProtectionTechnology, user7OffsetPhysicalTraining, user7EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user8Id, user8Username, user8DifOffsetPsychology, user8DifOffsetLifeSafety, user8DifOffsetStandardizationCertification, user8DifOffsetDatabaseDevelopmentProtectionTechnology, user8OffsetPhysicalTraining, user8EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user9Id, user9Username, user9DifOffsetPsychology, user9DifOffsetLifeSafety, user9DifOffsetStandardizationCertification, user9DifOffsetDatabaseDevelopmentProtectionTechnology, user9OffsetPhysicalTraining, user9EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user10Id, user10Username, user10DifOffsetPsychology, user10DifOffsetLifeSafety, user10DifOffsetStandardizationCertification, user10DifOffsetDatabaseDevelopmentProtectionTechnology, user10OffsetPhysicalTraining, user10EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user11Id, user11Username, user11DifOffsetPsychology, user11DifOffsetLifeSafety, user11DifOffsetStandardizationCertification, user11DifOffsetDatabaseDevelopmentProtectionTechnology, user11OffsetPhysicalTraining, user11EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user12Id, user12Username, user12DifOffsetPsychology, user12DifOffsetLifeSafety, user12DifOffsetStandardizationCertification, user12DifOffsetDatabaseDevelopmentProtectionTechnology, user12OffsetPhysicalTraining, user12EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user13Id, user13Username, user13DifOffsetPsychology, user13DifOffsetLifeSafety, user13DifOffsetStandardizationCertification, user13DifOffsetDatabaseDevelopmentProtectionTechnology, user13OffsetPhysicalTraining, user13EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user14Id, user14Username, user14DifOffsetPsychology, user14DifOffsetLifeSafety, user14DifOffsetStandardizationCertification, user14DifOffsetDatabaseDevelopmentProtectionTechnology, user14OffsetPhysicalTraining, user14EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user15Id, user15Username, user15DifOffsetPsychology, user15DifOffsetLifeSafety, user15DifOffsetStandardizationCertification, user15DifOffsetDatabaseDevelopmentProtectionTechnology, user15OffsetPhysicalTraining, user15EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user16Id, user16Username, user16DifOffsetPsychology, user16DifOffsetLifeSafety, user16DifOffsetStandardizationCertification, user16DifOffsetDatabaseDevelopmentProtectionTechnology, user16OffsetPhysicalTraining, user16EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user17Id, user17Username, user17DifOffsetPsychology, user17DifOffsetLifeSafety, user17DifOffsetStandardizationCertification, user17DifOffsetDatabaseDevelopmentProtectionTechnology, user17OffsetPhysicalTraining, user17EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user18Id, user18Username, user18DifOffsetPsychology, user18DifOffsetLifeSafety, user18DifOffsetStandardizationCertification, user18DifOffsetDatabaseDevelopmentProtectionTechnology, user18OffsetPhysicalTraining, user18EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user19Id, user19Username, user19DifOffsetPsychology, user19DifOffsetLifeSafety, user19DifOffsetStandardizationCertification, user19DifOffsetDatabaseDevelopmentProtectionTechnology, user19OffsetPhysicalTraining, user19EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user20Id, user20Username, user20DifOffsetPsychology, user20DifOffsetLifeSafety, user20DifOffsetStandardizationCertification, user20DifOffsetDatabaseDevelopmentProtectionTechnology, user20OffsetPhysicalTraining, user20EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user21Id, user21Username, user21DifOffsetPsychology, user21DifOffsetLifeSafety, user21DifOffsetStandardizationCertification, user21DifOffsetDatabaseDevelopmentProtectionTechnology, user21OffsetPhysicalTraining, user21EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user22Id, user22Username, user22DifOffsetPsychology, user22DifOffsetLifeSafety, user22DifOffsetStandardizationCertification, user22DifOffsetDatabaseDevelopmentProtectionTechnology, user22OffsetPhysicalTraining, user22EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user23Id, user23Username, user23DifOffsetPsychology, user23DifOffsetLifeSafety, user23DifOffsetStandardizationCertification, user23DifOffsetDatabaseDevelopmentProtectionTechnology, user23OffsetPhysicalTraining, user23EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user24Id, user24Username, user24DifOffsetPsychology, user24DifOffsetLifeSafety, user24DifOffsetStandardizationCertification, user24DifOffsetDatabaseDevelopmentProtectionTechnology, user24OffsetPhysicalTraining, user24EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user25Id, user25Username, user25DifOffsetPsychology, user25DifOffsetLifeSafety, user25DifOffsetStandardizationCertification, user25DifOffsetDatabaseDevelopmentProtectionTechnology, user25OffsetPhysicalTraining, user25EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user26Id, user26Username, user26DifOffsetPsychology, user26DifOffsetLifeSafety, user26DifOffsetStandardizationCertification, user26DifOffsetDatabaseDevelopmentProtectionTechnology, user26OffsetPhysicalTraining, user26EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user27Id, user27Username, user27DifOffsetPsychology, user27DifOffsetLifeSafety, user27DifOffsetStandardizationCertification, user27DifOffsetDatabaseDevelopmentProtectionTechnology, user27OffsetPhysicalTraining, user27EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user28Id, user28Username, user28DifOffsetPsychology, user28DifOffsetLifeSafety, user28DifOffsetStandardizationCertification, user28DifOffsetDatabaseDevelopmentProtectionTechnology, user28OffsetPhysicalTraining, user28EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user29Id, user29Username, user29DifOffsetPsychology, user29DifOffsetLifeSafety, user29DifOffsetStandardizationCertification, user29DifOffsetDatabaseDevelopmentProtectionTechnology, user29OffsetPhysicalTraining, user29EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user30Id, user30Username, user30DifOffsetPsychology, user30DifOffsetLifeSafety, user30DifOffsetStandardizationCertification, user30DifOffsetDatabaseDevelopmentProtectionTechnology, user30OffsetPhysicalTraining, user30EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user31Id, user31Username, user31DifOffsetPsychology, user31DifOffsetLifeSafety, user31DifOffsetStandardizationCertification, user31DifOffsetDatabaseDevelopmentProtectionTechnology, user31OffsetPhysicalTraining, user31EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user32Id, user32Username, user32DifOffsetPsychology, user32DifOffsetLifeSafety, user32DifOffsetStandardizationCertification, user32DifOffsetDatabaseDevelopmentProtectionTechnology, user32OffsetPhysicalTraining, user32EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user33Id, user33Username, user33DifOffsetPsychology, user33DifOffsetLifeSafety, user33DifOffsetStandardizationCertification, user33DifOffsetDatabaseDevelopmentProtectionTechnology, user33OffsetPhysicalTraining, user33EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user34Id, user34Username, user34DifOffsetPsychology, user34DifOffsetLifeSafety, user34DifOffsetStandardizationCertification, user34DifOffsetDatabaseDevelopmentProtectionTechnology, user34OffsetPhysicalTraining, user34EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user35Id, user35Username, user35DifOffsetPsychology, user35DifOffsetLifeSafety, user35DifOffsetStandardizationCertification, user35DifOffsetDatabaseDevelopmentProtectionTechnology, user35OffsetPhysicalTraining, user35EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user36Id, user36Username, user36DifOffsetPsychology, user36DifOffsetLifeSafety, user36DifOffsetStandardizationCertification, user36DifOffsetDatabaseDevelopmentProtectionTechnology, user36OffsetPhysicalTraining, user36EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user37Id, user37Username, user37DifOffsetPsychology, user37DifOffsetLifeSafety, user37DifOffsetStandardizationCertification, user37DifOffsetDatabaseDevelopmentProtectionTechnology, user37OffsetPhysicalTraining, user37EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user38Id, user38Username, user38DifOffsetPsychology, user38DifOffsetLifeSafety, user38DifOffsetStandardizationCertification, user38DifOffsetDatabaseDevelopmentProtectionTechnology, user38OffsetPhysicalTraining, user38EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user39Id, user39Username, user39DifOffsetPsychology, user39DifOffsetLifeSafety, user39DifOffsetStandardizationCertification, user39DifOffsetDatabaseDevelopmentProtectionTechnology, user39OffsetPhysicalTraining, user39EducationalPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester1(user40Id, user40Username, user40DifOffsetPsychology, user40DifOffsetLifeSafety, user40DifOffsetStandardizationCertification, user40DifOffsetDatabaseDevelopmentProtectionTechnology, user40OffsetPhysicalTraining, user40EducationalPractice));

            if (specialGradeIs11Course3Semester1Repository.findAll().isEmpty()) {
                specialGradeIs11Course3Semester1Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course3Semester1> user1Row = specialGradeIs11Course3Semester1Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User1 = user1Row.get();
            specialGrade_IS_1_1Course3Semester1User1.setUsername(user1Username);
            specialGrade_IS_1_1Course3Semester1User1.setDifOffsetPsychology(user1DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User1.setDifOffsetLifeSafety(user1DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User1.setDifOffsetStandardizationCertification(user1DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User1.setDifOffsetDatabaseDevelopmentProtectionTechnology(user1DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User1.setOffsetPhysicalTraining(user1OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User1.setEducationalPractice(user1EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course3Semester1> user2Row = specialGradeIs11Course3Semester1Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User2 = user2Row.get();
            specialGrade_IS_1_1Course3Semester1User2.setUsername(user2Username);
            specialGrade_IS_1_1Course3Semester1User2.setDifOffsetPsychology(user2DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User2.setDifOffsetLifeSafety(user2DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User2.setDifOffsetStandardizationCertification(user2DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User2.setDifOffsetDatabaseDevelopmentProtectionTechnology(user2DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User2.setOffsetPhysicalTraining(user2OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User2.setEducationalPractice(user2EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course3Semester1> user3Row = specialGradeIs11Course3Semester1Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User3 = user3Row.get();
            specialGrade_IS_1_1Course3Semester1User3.setUsername(user3Username);
            specialGrade_IS_1_1Course3Semester1User3.setDifOffsetPsychology(user3DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User3.setDifOffsetLifeSafety(user3DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User3.setDifOffsetStandardizationCertification(user3DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User3.setDifOffsetDatabaseDevelopmentProtectionTechnology(user3DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User3.setOffsetPhysicalTraining(user3OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User3.setEducationalPractice(user3EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course3Semester1> user4Row = specialGradeIs11Course3Semester1Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User4 = user4Row.get();
            specialGrade_IS_1_1Course3Semester1User4.setUsername(user4Username);
            specialGrade_IS_1_1Course3Semester1User4.setDifOffsetPsychology(user4DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User4.setDifOffsetLifeSafety(user4DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User4.setDifOffsetStandardizationCertification(user4DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User4.setDifOffsetDatabaseDevelopmentProtectionTechnology(user4DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User4.setOffsetPhysicalTraining(user4OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User4.setEducationalPractice(user4EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course3Semester1> user5Row = specialGradeIs11Course3Semester1Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User5 = user5Row.get();
            specialGrade_IS_1_1Course3Semester1User5.setUsername(user5Username);
            specialGrade_IS_1_1Course3Semester1User5.setDifOffsetPsychology(user5DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User5.setDifOffsetLifeSafety(user5DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User5.setDifOffsetStandardizationCertification(user5DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User5.setDifOffsetDatabaseDevelopmentProtectionTechnology(user5DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User5.setOffsetPhysicalTraining(user5OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User5.setEducationalPractice(user5EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course3Semester1> user6Row = specialGradeIs11Course3Semester1Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User6 = user6Row.get();
            specialGrade_IS_1_1Course3Semester1User6.setUsername(user6Username);
            specialGrade_IS_1_1Course3Semester1User6.setDifOffsetPsychology(user6DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User6.setDifOffsetLifeSafety(user6DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User6.setDifOffsetStandardizationCertification(user6DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User6.setDifOffsetDatabaseDevelopmentProtectionTechnology(user6DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User6.setOffsetPhysicalTraining(user6OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User6.setEducationalPractice(user6EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course3Semester1> user7Row = specialGradeIs11Course3Semester1Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User7 = user7Row.get();
            specialGrade_IS_1_1Course3Semester1User7.setUsername(user7Username);
            specialGrade_IS_1_1Course3Semester1User7.setDifOffsetPsychology(user7DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User7.setDifOffsetLifeSafety(user7DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User7.setDifOffsetStandardizationCertification(user7DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User7.setDifOffsetDatabaseDevelopmentProtectionTechnology(user7DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User7.setOffsetPhysicalTraining(user7OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User7.setEducationalPractice(user7EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course3Semester1> user8Row = specialGradeIs11Course3Semester1Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User8 = user8Row.get();
            specialGrade_IS_1_1Course3Semester1User8.setUsername(user8Username);
            specialGrade_IS_1_1Course3Semester1User8.setDifOffsetPsychology(user8DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User8.setDifOffsetLifeSafety(user8DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User8.setDifOffsetStandardizationCertification(user8DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User8.setDifOffsetDatabaseDevelopmentProtectionTechnology(user8DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User8.setOffsetPhysicalTraining(user8OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User8.setEducationalPractice(user8EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course3Semester1> user9Row = specialGradeIs11Course3Semester1Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User9 = user9Row.get();
            specialGrade_IS_1_1Course3Semester1User9.setUsername(user9Username);
            specialGrade_IS_1_1Course3Semester1User9.setDifOffsetPsychology(user9DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User9.setDifOffsetLifeSafety(user9DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User9.setDifOffsetStandardizationCertification(user9DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User9.setDifOffsetDatabaseDevelopmentProtectionTechnology(user9DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User9.setOffsetPhysicalTraining(user9OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User9.setEducationalPractice(user9EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course3Semester1> user10Row = specialGradeIs11Course3Semester1Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User10 = user10Row.get();
            specialGrade_IS_1_1Course3Semester1User10.setUsername(user10Username);
            specialGrade_IS_1_1Course3Semester1User10.setDifOffsetPsychology(user10DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User10.setDifOffsetLifeSafety(user10DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User10.setDifOffsetStandardizationCertification(user10DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User10.setDifOffsetDatabaseDevelopmentProtectionTechnology(user10DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User10.setOffsetPhysicalTraining(user10OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User10.setEducationalPractice(user10EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course3Semester1> user11Row = specialGradeIs11Course3Semester1Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User11 = user11Row.get();
            specialGrade_IS_1_1Course3Semester1User11.setUsername(user11Username);
            specialGrade_IS_1_1Course3Semester1User11.setDifOffsetPsychology(user11DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User11.setDifOffsetLifeSafety(user11DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User11.setDifOffsetStandardizationCertification(user11DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User11.setDifOffsetDatabaseDevelopmentProtectionTechnology(user11DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User11.setOffsetPhysicalTraining(user11OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User11.setEducationalPractice(user11EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course3Semester1> user12Row = specialGradeIs11Course3Semester1Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User12 = user12Row.get();
            specialGrade_IS_1_1Course3Semester1User12.setUsername(user12Username);
            specialGrade_IS_1_1Course3Semester1User12.setDifOffsetPsychology(user12DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User12.setDifOffsetLifeSafety(user12DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User12.setDifOffsetStandardizationCertification(user12DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User12.setDifOffsetDatabaseDevelopmentProtectionTechnology(user12DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User12.setOffsetPhysicalTraining(user12OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User12.setEducationalPractice(user12EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course3Semester1> user13Row = specialGradeIs11Course3Semester1Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User13 = user13Row.get();
            specialGrade_IS_1_1Course3Semester1User13.setUsername(user13Username);
            specialGrade_IS_1_1Course3Semester1User13.setDifOffsetPsychology(user13DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User13.setDifOffsetLifeSafety(user13DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User13.setDifOffsetStandardizationCertification(user13DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User13.setDifOffsetDatabaseDevelopmentProtectionTechnology(user13DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User13.setOffsetPhysicalTraining(user13OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User13.setEducationalPractice(user13EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course3Semester1> user14Row = specialGradeIs11Course3Semester1Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User14 = user14Row.get();
            specialGrade_IS_1_1Course3Semester1User14.setUsername(user14Username);
            specialGrade_IS_1_1Course3Semester1User14.setDifOffsetPsychology(user14DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User14.setDifOffsetLifeSafety(user14DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User14.setDifOffsetStandardizationCertification(user14DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User14.setDifOffsetDatabaseDevelopmentProtectionTechnology(user14DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User14.setOffsetPhysicalTraining(user14OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User14.setEducationalPractice(user14EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course3Semester1> user15Row = specialGradeIs11Course3Semester1Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User15 = user15Row.get();
            specialGrade_IS_1_1Course3Semester1User15.setUsername(user15Username);
            specialGrade_IS_1_1Course3Semester1User15.setDifOffsetPsychology(user15DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User15.setDifOffsetLifeSafety(user15DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User15.setDifOffsetStandardizationCertification(user15DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User15.setDifOffsetDatabaseDevelopmentProtectionTechnology(user15DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User15.setOffsetPhysicalTraining(user15OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User15.setEducationalPractice(user15EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course3Semester1> user16Row = specialGradeIs11Course3Semester1Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User16 = user16Row.get();
            specialGrade_IS_1_1Course3Semester1User16.setUsername(user16Username);
            specialGrade_IS_1_1Course3Semester1User16.setDifOffsetPsychology(user16DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User16.setDifOffsetLifeSafety(user16DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User16.setDifOffsetStandardizationCertification(user16DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User16.setDifOffsetDatabaseDevelopmentProtectionTechnology(user16DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User16.setOffsetPhysicalTraining(user16OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User16.setEducationalPractice(user16EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course3Semester1> user17Row = specialGradeIs11Course3Semester1Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User17 = user17Row.get();
            specialGrade_IS_1_1Course3Semester1User17.setUsername(user17Username);
            specialGrade_IS_1_1Course3Semester1User17.setDifOffsetPsychology(user17DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User17.setDifOffsetLifeSafety(user17DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User17.setDifOffsetStandardizationCertification(user17DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User17.setDifOffsetDatabaseDevelopmentProtectionTechnology(user17DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User17.setOffsetPhysicalTraining(user17OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User17.setEducationalPractice(user17EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course3Semester1> user18Row = specialGradeIs11Course3Semester1Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User18 = user18Row.get();
            specialGrade_IS_1_1Course3Semester1User18.setUsername(user18Username);
            specialGrade_IS_1_1Course3Semester1User18.setDifOffsetPsychology(user18DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User18.setDifOffsetLifeSafety(user18DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User18.setDifOffsetStandardizationCertification(user18DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User18.setDifOffsetDatabaseDevelopmentProtectionTechnology(user18DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User18.setOffsetPhysicalTraining(user18OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User18.setEducationalPractice(user18EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course3Semester1> user19Row = specialGradeIs11Course3Semester1Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User19 = user19Row.get();
            specialGrade_IS_1_1Course3Semester1User19.setUsername(user19Username);
            specialGrade_IS_1_1Course3Semester1User19.setDifOffsetPsychology(user19DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User19.setDifOffsetLifeSafety(user19DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User19.setDifOffsetStandardizationCertification(user19DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User19.setDifOffsetDatabaseDevelopmentProtectionTechnology(user19DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User19.setOffsetPhysicalTraining(user19OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User19.setEducationalPractice(user19EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course3Semester1> user20Row = specialGradeIs11Course3Semester1Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User20 = user20Row.get();
            specialGrade_IS_1_1Course3Semester1User20.setUsername(user20Username);
            specialGrade_IS_1_1Course3Semester1User20.setDifOffsetPsychology(user20DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User20.setDifOffsetLifeSafety(user20DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User20.setDifOffsetStandardizationCertification(user20DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User20.setDifOffsetDatabaseDevelopmentProtectionTechnology(user20DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User20.setOffsetPhysicalTraining(user20OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User20.setEducationalPractice(user20EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course3Semester1> user21Row = specialGradeIs11Course3Semester1Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User21 = user21Row.get();
            specialGrade_IS_1_1Course3Semester1User21.setUsername(user21Username);
            specialGrade_IS_1_1Course3Semester1User21.setDifOffsetPsychology(user21DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User21.setDifOffsetLifeSafety(user21DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User21.setDifOffsetStandardizationCertification(user21DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User21.setDifOffsetDatabaseDevelopmentProtectionTechnology(user21DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User21.setOffsetPhysicalTraining(user21OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User21.setEducationalPractice(user21EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course3Semester1> user22Row = specialGradeIs11Course3Semester1Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User22 = user22Row.get();
            specialGrade_IS_1_1Course3Semester1User22.setUsername(user22Username);
            specialGrade_IS_1_1Course3Semester1User22.setDifOffsetPsychology(user22DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User22.setDifOffsetLifeSafety(user22DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User22.setDifOffsetStandardizationCertification(user22DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User22.setDifOffsetDatabaseDevelopmentProtectionTechnology(user22DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User22.setOffsetPhysicalTraining(user22OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User22.setEducationalPractice(user22EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course3Semester1> user23Row = specialGradeIs11Course3Semester1Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User23 = user23Row.get();
            specialGrade_IS_1_1Course3Semester1User23.setUsername(user23Username);
            specialGrade_IS_1_1Course3Semester1User23.setDifOffsetPsychology(user23DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User23.setDifOffsetLifeSafety(user23DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User23.setDifOffsetStandardizationCertification(user23DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User23.setDifOffsetDatabaseDevelopmentProtectionTechnology(user23DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User23.setOffsetPhysicalTraining(user23OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User23.setEducationalPractice(user23EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course3Semester1> user24Row = specialGradeIs11Course3Semester1Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User24 = user24Row.get();
            specialGrade_IS_1_1Course3Semester1User24.setUsername(user24Username);
            specialGrade_IS_1_1Course3Semester1User24.setDifOffsetPsychology(user24DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User24.setDifOffsetLifeSafety(user24DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User24.setDifOffsetStandardizationCertification(user24DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User24.setDifOffsetDatabaseDevelopmentProtectionTechnology(user24DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User24.setOffsetPhysicalTraining(user24OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User24.setEducationalPractice(user24EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course3Semester1> user25Row = specialGradeIs11Course3Semester1Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User25 = user25Row.get();
            specialGrade_IS_1_1Course3Semester1User25.setUsername(user25Username);
            specialGrade_IS_1_1Course3Semester1User25.setDifOffsetPsychology(user25DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User25.setDifOffsetLifeSafety(user25DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User25.setDifOffsetStandardizationCertification(user25DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User25.setDifOffsetDatabaseDevelopmentProtectionTechnology(user25DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User25.setOffsetPhysicalTraining(user25OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User25.setEducationalPractice(user25EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course3Semester1> user26Row = specialGradeIs11Course3Semester1Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User26 = user26Row.get();
            specialGrade_IS_1_1Course3Semester1User26.setUsername(user26Username);
            specialGrade_IS_1_1Course3Semester1User26.setDifOffsetPsychology(user26DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User26.setDifOffsetLifeSafety(user26DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User26.setDifOffsetStandardizationCertification(user26DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User26.setDifOffsetDatabaseDevelopmentProtectionTechnology(user26DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User26.setOffsetPhysicalTraining(user26OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User26.setEducationalPractice(user26EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course3Semester1> user27Row = specialGradeIs11Course3Semester1Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User27 = user27Row.get();
            specialGrade_IS_1_1Course3Semester1User27.setUsername(user27Username);
            specialGrade_IS_1_1Course3Semester1User27.setDifOffsetPsychology(user27DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User27.setDifOffsetLifeSafety(user27DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User27.setDifOffsetStandardizationCertification(user27DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User27.setDifOffsetDatabaseDevelopmentProtectionTechnology(user27DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User27.setOffsetPhysicalTraining(user27OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User27.setEducationalPractice(user27EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course3Semester1> user28Row = specialGradeIs11Course3Semester1Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User28 = user28Row.get();
            specialGrade_IS_1_1Course3Semester1User28.setUsername(user28Username);
            specialGrade_IS_1_1Course3Semester1User28.setDifOffsetPsychology(user28DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User28.setDifOffsetLifeSafety(user28DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User28.setDifOffsetStandardizationCertification(user28DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User28.setDifOffsetDatabaseDevelopmentProtectionTechnology(user28DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User28.setOffsetPhysicalTraining(user28OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User28.setEducationalPractice(user28EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course3Semester1> user29Row = specialGradeIs11Course3Semester1Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User29 = user29Row.get();
            specialGrade_IS_1_1Course3Semester1User29.setUsername(user29Username);
            specialGrade_IS_1_1Course3Semester1User29.setDifOffsetPsychology(user29DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User29.setDifOffsetLifeSafety(user29DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User29.setDifOffsetStandardizationCertification(user29DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User29.setDifOffsetDatabaseDevelopmentProtectionTechnology(user29DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User29.setOffsetPhysicalTraining(user29OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User29.setEducationalPractice(user29EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course3Semester1> user30Row = specialGradeIs11Course3Semester1Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User30 = user30Row.get();
            specialGrade_IS_1_1Course3Semester1User30.setUsername(user30Username);
            specialGrade_IS_1_1Course3Semester1User30.setDifOffsetPsychology(user30DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User30.setDifOffsetLifeSafety(user30DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User30.setDifOffsetStandardizationCertification(user30DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User30.setDifOffsetDatabaseDevelopmentProtectionTechnology(user30DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User30.setOffsetPhysicalTraining(user30OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User30.setEducationalPractice(user30EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course3Semester1> user31Row = specialGradeIs11Course3Semester1Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User31 = user31Row.get();
            specialGrade_IS_1_1Course3Semester1User31.setUsername(user31Username);
            specialGrade_IS_1_1Course3Semester1User31.setDifOffsetPsychology(user31DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User31.setDifOffsetLifeSafety(user31DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User31.setDifOffsetStandardizationCertification(user31DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User31.setDifOffsetDatabaseDevelopmentProtectionTechnology(user31DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User31.setOffsetPhysicalTraining(user31OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User31.setEducationalPractice(user31EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course3Semester1> user32Row = specialGradeIs11Course3Semester1Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User32 = user32Row.get();
            specialGrade_IS_1_1Course3Semester1User32.setUsername(user32Username);
            specialGrade_IS_1_1Course3Semester1User32.setDifOffsetPsychology(user32DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User32.setDifOffsetLifeSafety(user32DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User32.setDifOffsetStandardizationCertification(user32DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User32.setDifOffsetDatabaseDevelopmentProtectionTechnology(user32DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User32.setOffsetPhysicalTraining(user32OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User32.setEducationalPractice(user32EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course3Semester1> user33Row = specialGradeIs11Course3Semester1Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User33 = user33Row.get();
            specialGrade_IS_1_1Course3Semester1User33.setUsername(user33Username);
            specialGrade_IS_1_1Course3Semester1User33.setDifOffsetPsychology(user33DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User33.setDifOffsetLifeSafety(user33DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User33.setDifOffsetStandardizationCertification(user33DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User33.setDifOffsetDatabaseDevelopmentProtectionTechnology(user33DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User33.setOffsetPhysicalTraining(user33OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User33.setEducationalPractice(user33EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course3Semester1> user34Row = specialGradeIs11Course3Semester1Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User34 = user34Row.get();
            specialGrade_IS_1_1Course3Semester1User34.setUsername(user34Username);
            specialGrade_IS_1_1Course3Semester1User34.setDifOffsetPsychology(user34DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User34.setDifOffsetLifeSafety(user34DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User34.setDifOffsetStandardizationCertification(user34DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User34.setDifOffsetDatabaseDevelopmentProtectionTechnology(user34DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User34.setOffsetPhysicalTraining(user34OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User34.setEducationalPractice(user34EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course3Semester1> user35Row = specialGradeIs11Course3Semester1Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User35 = user35Row.get();
            specialGrade_IS_1_1Course3Semester1User35.setUsername(user35Username);
            specialGrade_IS_1_1Course3Semester1User35.setDifOffsetPsychology(user35DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User35.setDifOffsetLifeSafety(user35DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User35.setDifOffsetStandardizationCertification(user35DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User35.setDifOffsetDatabaseDevelopmentProtectionTechnology(user35DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User35.setOffsetPhysicalTraining(user35OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User35.setEducationalPractice(user35EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course3Semester1> user36Row = specialGradeIs11Course3Semester1Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User36 = user36Row.get();
            specialGrade_IS_1_1Course3Semester1User36.setUsername(user36Username);
            specialGrade_IS_1_1Course3Semester1User36.setDifOffsetPsychology(user36DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User36.setDifOffsetLifeSafety(user36DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User36.setDifOffsetStandardizationCertification(user36DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User36.setDifOffsetDatabaseDevelopmentProtectionTechnology(user36DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User36.setOffsetPhysicalTraining(user36OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User36.setEducationalPractice(user36EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course3Semester1> user37Row = specialGradeIs11Course3Semester1Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User37 = user37Row.get();
            specialGrade_IS_1_1Course3Semester1User37.setUsername(user37Username);
            specialGrade_IS_1_1Course3Semester1User37.setDifOffsetPsychology(user37DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User37.setDifOffsetLifeSafety(user37DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User37.setDifOffsetStandardizationCertification(user37DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User37.setDifOffsetDatabaseDevelopmentProtectionTechnology(user37DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User37.setOffsetPhysicalTraining(user37OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User37.setEducationalPractice(user37EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course3Semester1> user38Row = specialGradeIs11Course3Semester1Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User38 = user38Row.get();
            specialGrade_IS_1_1Course3Semester1User38.setUsername(user38Username);
            specialGrade_IS_1_1Course3Semester1User38.setDifOffsetPsychology(user38DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User38.setDifOffsetLifeSafety(user38DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User38.setDifOffsetStandardizationCertification(user38DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User38.setDifOffsetDatabaseDevelopmentProtectionTechnology(user38DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User38.setOffsetPhysicalTraining(user38OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User38.setEducationalPractice(user38EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course3Semester1> user39Row = specialGradeIs11Course3Semester1Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User39 = user39Row.get();
            specialGrade_IS_1_1Course3Semester1User39.setUsername(user39Username);
            specialGrade_IS_1_1Course3Semester1User39.setDifOffsetPsychology(user39DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User39.setDifOffsetLifeSafety(user39DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User39.setDifOffsetStandardizationCertification(user39DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User39.setDifOffsetDatabaseDevelopmentProtectionTechnology(user39DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User39.setOffsetPhysicalTraining(user39OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User39.setEducationalPractice(user39EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course3Semester1> user40Row = specialGradeIs11Course3Semester1Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course3Semester1 specialGrade_IS_1_1Course3Semester1User40 = user40Row.get();
            specialGrade_IS_1_1Course3Semester1User40.setUsername(user40Username);
            specialGrade_IS_1_1Course3Semester1User40.setDifOffsetPsychology(user40DifOffsetPsychology);
            specialGrade_IS_1_1Course3Semester1User40.setDifOffsetLifeSafety(user40DifOffsetLifeSafety);
            specialGrade_IS_1_1Course3Semester1User40.setDifOffsetStandardizationCertification(user40DifOffsetStandardizationCertification);
            specialGrade_IS_1_1Course3Semester1User40.setDifOffsetDatabaseDevelopmentProtectionTechnology(user40DifOffsetDatabaseDevelopmentProtectionTechnology);
            specialGrade_IS_1_1Course3Semester1User40.setOffsetPhysicalTraining(user40OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester1User40.setEducationalPractice(user40EducationalPractice);
            specialGradeIs11Course3Semester1Repository.save(specialGrade_IS_1_1Course3Semester1User40);
        } catch (Exception ignore) {

        }
    }
}
