package com.example.demoauth.service.moderatorService.moderator_is1Service.course3;

import com.example.demoauth.models.grade_is1.models.course3.SpecialGrade_IS_1_1Course3Semester2;
import com.example.demoauth.repository.is1Repository.course3.SpecialGrade_IS_1_1Course3Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course3Semester2 {
    @Autowired
    SpecialGrade_IS_1_1Course3Semester2Repository specialGradeIs11Course3Semester2Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse3Semester2
    public void getMappingModer_is_1_1SpecialGreadeСourse3Semester2(Model model) {
        List<SpecialGrade_IS_1_1Course3Semester2> res = specialGradeIs11Course3Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course3Semester2::getUserID));
        List<SpecialGrade_IS_1_1Course3Semester2> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course3Semester2());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse3Semester2
    public void postMappingModer_is_1_1SpecialGreadeСourse3Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetEnglishLanguage = splitUser1Grades[2];
            String user1DifOffsetDevelopmentSoftwareModules = splitUser1Grades[3];
            String user1DifOffsetSupportTestingSoftwareModules = splitUser1Grades[4];
            String user1OffsetPhysicalTraining = splitUser1Grades[5];
            String user1ExamIndustryEconomics = splitUser1Grades[6];
            String user1ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser1Grades[7];
            String user1QualificationExam = splitUser1Grades[8];
            String user1EducationalPractice = splitUser1Grades[9];
            String user1ProductionPractice = splitUser1Grades[10];



            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetEnglishLanguage = splitUser2Grades[2];
            String user2DifOffsetDevelopmentSoftwareModules = splitUser2Grades[3];
            String user2DifOffsetSupportTestingSoftwareModules = splitUser2Grades[4];
            String user2OffsetPhysicalTraining = splitUser2Grades[5];
            String user2ExamIndustryEconomics = splitUser2Grades[6];
            String user2ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser2Grades[7];
            String user2QualificationExam = splitUser2Grades[8];
            String user2EducationalPractice = splitUser2Grades[9];
            String user2ProductionPractice = splitUser2Grades[10];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetEnglishLanguage = splitUser3Grades[2];
            String user3DifOffsetDevelopmentSoftwareModules = splitUser3Grades[3];
            String user3DifOffsetSupportTestingSoftwareModules = splitUser3Grades[4];
            String user3OffsetPhysicalTraining = splitUser3Grades[5];
            String user3ExamIndustryEconomics = splitUser3Grades[6];
            String user3ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser3Grades[7];
            String user3QualificationExam = splitUser3Grades[8];
            String user3EducationalPractice = splitUser3Grades[9];
            String user3ProductionPractice = splitUser3Grades[10];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetEnglishLanguage = splitUser4Grades[2];
            String user4DifOffsetDevelopmentSoftwareModules = splitUser4Grades[3];
            String user4DifOffsetSupportTestingSoftwareModules = splitUser4Grades[4];
            String user4OffsetPhysicalTraining = splitUser4Grades[5];
            String user4ExamIndustryEconomics = splitUser4Grades[6];
            String user4ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser4Grades[7];
            String user4QualificationExam = splitUser4Grades[8];
            String user4EducationalPractice = splitUser4Grades[9];
            String user4ProductionPractice = splitUser4Grades[10];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetEnglishLanguage = splitUser5Grades[2];
            String user5DifOffsetDevelopmentSoftwareModules = splitUser5Grades[3];
            String user5DifOffsetSupportTestingSoftwareModules = splitUser5Grades[4];
            String user5OffsetPhysicalTraining = splitUser5Grades[5];
            String user5ExamIndustryEconomics = splitUser5Grades[6];
            String user5ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser5Grades[7];
            String user5QualificationExam = splitUser5Grades[8];
            String user5EducationalPractice = splitUser5Grades[9];
            String user5ProductionPractice = splitUser5Grades[10];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetEnglishLanguage = splitUser6Grades[2];
            String user6DifOffsetDevelopmentSoftwareModules = splitUser6Grades[3];
            String user6DifOffsetSupportTestingSoftwareModules = splitUser6Grades[4];
            String user6OffsetPhysicalTraining = splitUser6Grades[5];
            String user6ExamIndustryEconomics = splitUser6Grades[6];
            String user6ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser6Grades[7];
            String user6QualificationExam = splitUser6Grades[8];
            String user6EducationalPractice = splitUser6Grades[9];
            String user6ProductionPractice = splitUser6Grades[10];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetEnglishLanguage = splitUser7Grades[2];
            String user7DifOffsetDevelopmentSoftwareModules = splitUser7Grades[3];
            String user7DifOffsetSupportTestingSoftwareModules = splitUser7Grades[4];
            String user7OffsetPhysicalTraining = splitUser7Grades[5];
            String user7ExamIndustryEconomics = splitUser7Grades[6];
            String user7ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser7Grades[7];
            String user7QualificationExam = splitUser7Grades[8];
            String user7EducationalPractice = splitUser7Grades[9];
            String user7ProductionPractice = splitUser7Grades[10];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetEnglishLanguage = splitUser8Grades[2];
            String user8DifOffsetDevelopmentSoftwareModules = splitUser8Grades[3];
            String user8DifOffsetSupportTestingSoftwareModules = splitUser8Grades[4];
            String user8OffsetPhysicalTraining = splitUser8Grades[5];
            String user8ExamIndustryEconomics = splitUser8Grades[6];
            String user8ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser8Grades[7];
            String user8QualificationExam = splitUser8Grades[8];
            String user8EducationalPractice = splitUser8Grades[9];
            String user8ProductionPractice = splitUser8Grades[10];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetEnglishLanguage = splitUser9Grades[2];
            String user9DifOffsetDevelopmentSoftwareModules = splitUser9Grades[3];
            String user9DifOffsetSupportTestingSoftwareModules = splitUser9Grades[4];
            String user9OffsetPhysicalTraining = splitUser9Grades[5];
            String user9ExamIndustryEconomics = splitUser9Grades[6];
            String user9ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser9Grades[7];
            String user9QualificationExam = splitUser9Grades[8];
            String user9EducationalPractice = splitUser9Grades[9];
            String user9ProductionPractice = splitUser9Grades[10];


            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetEnglishLanguage = splitUser10Grades[2];
            String user10DifOffsetDevelopmentSoftwareModules = splitUser10Grades[3];
            String user10DifOffsetSupportTestingSoftwareModules = splitUser10Grades[4];
            String user10OffsetPhysicalTraining = splitUser10Grades[5];
            String user10ExamIndustryEconomics = splitUser10Grades[6];
            String user10ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser10Grades[7];
            String user10QualificationExam = splitUser10Grades[8];
            String user10EducationalPractice = splitUser10Grades[9];
            String user10ProductionPractice = splitUser10Grades[10];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetEnglishLanguage = splitUser11Grades[2];
            String user11DifOffsetDevelopmentSoftwareModules = splitUser11Grades[3];
            String user11DifOffsetSupportTestingSoftwareModules = splitUser11Grades[4];
            String user11OffsetPhysicalTraining = splitUser11Grades[5];
            String user11ExamIndustryEconomics = splitUser11Grades[6];
            String user11ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser11Grades[7];
            String user11QualificationExam = splitUser11Grades[8];
            String user11EducationalPractice = splitUser11Grades[9];
            String user11ProductionPractice = splitUser11Grades[10];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetEnglishLanguage = splitUser12Grades[2];
            String user12DifOffsetDevelopmentSoftwareModules = splitUser12Grades[3];
            String user12DifOffsetSupportTestingSoftwareModules = splitUser12Grades[4];
            String user12OffsetPhysicalTraining = splitUser12Grades[5];
            String user12ExamIndustryEconomics = splitUser12Grades[6];
            String user12ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser12Grades[7];
            String user12QualificationExam = splitUser12Grades[8];
            String user12EducationalPractice = splitUser12Grades[9];
            String user12ProductionPractice = splitUser12Grades[10];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetEnglishLanguage = splitUser13Grades[2];
            String user13DifOffsetDevelopmentSoftwareModules = splitUser13Grades[3];
            String user13DifOffsetSupportTestingSoftwareModules = splitUser13Grades[4];
            String user13OffsetPhysicalTraining = splitUser13Grades[5];
            String user13ExamIndustryEconomics = splitUser13Grades[6];
            String user13ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser13Grades[7];
            String user13QualificationExam = splitUser13Grades[8];
            String user13EducationalPractice = splitUser13Grades[9];
            String user13ProductionPractice = splitUser13Grades[10];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetEnglishLanguage = splitUser14Grades[2];
            String user14DifOffsetDevelopmentSoftwareModules = splitUser14Grades[3];
            String user14DifOffsetSupportTestingSoftwareModules = splitUser14Grades[4];
            String user14OffsetPhysicalTraining = splitUser14Grades[5];
            String user14ExamIndustryEconomics = splitUser14Grades[6];
            String user14ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser14Grades[7];
            String user14QualificationExam = splitUser14Grades[8];
            String user14EducationalPractice = splitUser14Grades[9];
            String user14ProductionPractice = splitUser14Grades[10];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetEnglishLanguage = splitUser15Grades[2];
            String user15DifOffsetDevelopmentSoftwareModules = splitUser15Grades[3];
            String user15DifOffsetSupportTestingSoftwareModules = splitUser15Grades[4];
            String user15OffsetPhysicalTraining = splitUser15Grades[5];
            String user15ExamIndustryEconomics = splitUser15Grades[6];
            String user15ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser15Grades[7];
            String user15QualificationExam = splitUser15Grades[8];
            String user15EducationalPractice = splitUser15Grades[9];
            String user15ProductionPractice = splitUser15Grades[10];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetEnglishLanguage = splitUser16Grades[2];
            String user16DifOffsetDevelopmentSoftwareModules = splitUser16Grades[3];
            String user16DifOffsetSupportTestingSoftwareModules = splitUser16Grades[4];
            String user16OffsetPhysicalTraining = splitUser16Grades[5];
            String user16ExamIndustryEconomics = splitUser16Grades[6];
            String user16ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser16Grades[7];
            String user16QualificationExam = splitUser16Grades[8];
            String user16EducationalPractice = splitUser16Grades[9];
            String user16ProductionPractice = splitUser16Grades[10];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetEnglishLanguage = splitUser17Grades[2];
            String user17DifOffsetDevelopmentSoftwareModules = splitUser17Grades[3];
            String user17DifOffsetSupportTestingSoftwareModules = splitUser17Grades[4];
            String user17OffsetPhysicalTraining = splitUser17Grades[5];
            String user17ExamIndustryEconomics = splitUser17Grades[6];
            String user17ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser17Grades[7];
            String user17QualificationExam = splitUser17Grades[8];
            String user17EducationalPractice = splitUser17Grades[9];
            String user17ProductionPractice = splitUser17Grades[10];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetEnglishLanguage = splitUser18Grades[2];
            String user18DifOffsetDevelopmentSoftwareModules = splitUser18Grades[3];
            String user18DifOffsetSupportTestingSoftwareModules = splitUser18Grades[4];
            String user18OffsetPhysicalTraining = splitUser18Grades[5];
            String user18ExamIndustryEconomics = splitUser18Grades[6];
            String user18ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser18Grades[7];
            String user18QualificationExam = splitUser18Grades[8];
            String user18EducationalPractice = splitUser18Grades[9];
            String user18ProductionPractice = splitUser18Grades[10];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetEnglishLanguage = splitUser19Grades[2];
            String user19DifOffsetDevelopmentSoftwareModules = splitUser19Grades[3];
            String user19DifOffsetSupportTestingSoftwareModules = splitUser19Grades[4];
            String user19OffsetPhysicalTraining = splitUser19Grades[5];
            String user19ExamIndustryEconomics = splitUser19Grades[6];
            String user19ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser19Grades[7];
            String user19QualificationExam = splitUser19Grades[8];
            String user19EducationalPractice = splitUser19Grades[9];
            String user19ProductionPractice = splitUser19Grades[10];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetEnglishLanguage = splitUser20Grades[2];
            String user20DifOffsetDevelopmentSoftwareModules = splitUser20Grades[3];
            String user20DifOffsetSupportTestingSoftwareModules = splitUser20Grades[4];
            String user20OffsetPhysicalTraining = splitUser20Grades[5];
            String user20ExamIndustryEconomics = splitUser20Grades[6];
            String user20ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser20Grades[7];
            String user20QualificationExam = splitUser20Grades[8];
            String user20EducationalPractice = splitUser20Grades[9];
            String user20ProductionPractice = splitUser20Grades[10];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetEnglishLanguage = splitUser21Grades[2];
            String user21DifOffsetDevelopmentSoftwareModules = splitUser21Grades[3];
            String user21DifOffsetSupportTestingSoftwareModules = splitUser21Grades[4];
            String user21OffsetPhysicalTraining = splitUser21Grades[5];
            String user21ExamIndustryEconomics = splitUser21Grades[6];
            String user21ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser21Grades[7];
            String user21QualificationExam = splitUser21Grades[8];
            String user21EducationalPractice = splitUser21Grades[9];
            String user21ProductionPractice = splitUser21Grades[10];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetEnglishLanguage = splitUser22Grades[2];
            String user22DifOffsetDevelopmentSoftwareModules = splitUser22Grades[3];
            String user22DifOffsetSupportTestingSoftwareModules = splitUser22Grades[4];
            String user22OffsetPhysicalTraining = splitUser22Grades[5];
            String user22ExamIndustryEconomics = splitUser22Grades[6];
            String user22ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser22Grades[7];
            String user22QualificationExam = splitUser22Grades[8];
            String user22EducationalPractice = splitUser22Grades[9];
            String user22ProductionPractice = splitUser22Grades[10];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetEnglishLanguage = splitUser23Grades[2];
            String user23DifOffsetDevelopmentSoftwareModules = splitUser23Grades[3];
            String user23DifOffsetSupportTestingSoftwareModules = splitUser23Grades[4];
            String user23OffsetPhysicalTraining = splitUser23Grades[5];
            String user23ExamIndustryEconomics = splitUser23Grades[6];
            String user23ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser23Grades[7];
            String user23QualificationExam = splitUser23Grades[8];
            String user23EducationalPractice = splitUser23Grades[9];
            String user23ProductionPractice = splitUser23Grades[10];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetEnglishLanguage = splitUser24Grades[2];
            String user24DifOffsetDevelopmentSoftwareModules = splitUser24Grades[3];
            String user24DifOffsetSupportTestingSoftwareModules = splitUser24Grades[4];
            String user24OffsetPhysicalTraining = splitUser24Grades[5];
            String user24ExamIndustryEconomics = splitUser24Grades[6];
            String user24ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser24Grades[7];
            String user24QualificationExam = splitUser24Grades[8];
            String user24EducationalPractice = splitUser24Grades[9];
            String user24ProductionPractice = splitUser24Grades[10];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetEnglishLanguage = splitUser25Grades[2];
            String user25DifOffsetDevelopmentSoftwareModules = splitUser25Grades[3];
            String user25DifOffsetSupportTestingSoftwareModules = splitUser25Grades[4];
            String user25OffsetPhysicalTraining = splitUser25Grades[5];
            String user25ExamIndustryEconomics = splitUser25Grades[6];
            String user25ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser25Grades[7];
            String user25QualificationExam = splitUser25Grades[8];
            String user25EducationalPractice = splitUser25Grades[9];
            String user25ProductionPractice = splitUser25Grades[10];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetEnglishLanguage = splitUser26Grades[2];
            String user26DifOffsetDevelopmentSoftwareModules = splitUser26Grades[3];
            String user26DifOffsetSupportTestingSoftwareModules = splitUser26Grades[4];
            String user26OffsetPhysicalTraining = splitUser26Grades[5];
            String user26ExamIndustryEconomics = splitUser26Grades[6];
            String user26ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser26Grades[7];
            String user26QualificationExam = splitUser26Grades[8];
            String user26EducationalPractice = splitUser26Grades[9];
            String user26ProductionPractice = splitUser26Grades[10];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetEnglishLanguage = splitUser27Grades[2];
            String user27DifOffsetDevelopmentSoftwareModules = splitUser27Grades[3];
            String user27DifOffsetSupportTestingSoftwareModules = splitUser27Grades[4];
            String user27OffsetPhysicalTraining = splitUser27Grades[5];
            String user27ExamIndustryEconomics = splitUser27Grades[6];
            String user27ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser27Grades[7];
            String user27QualificationExam = splitUser27Grades[8];
            String user27EducationalPractice = splitUser27Grades[9];
            String user27ProductionPractice = splitUser27Grades[10];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetEnglishLanguage = splitUser28Grades[2];
            String user28DifOffsetDevelopmentSoftwareModules = splitUser28Grades[3];
            String user28DifOffsetSupportTestingSoftwareModules = splitUser28Grades[4];
            String user28OffsetPhysicalTraining = splitUser28Grades[5];
            String user28ExamIndustryEconomics = splitUser28Grades[6];
            String user28ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser28Grades[7];
            String user28QualificationExam = splitUser28Grades[8];
            String user28EducationalPractice = splitUser28Grades[9];
            String user28ProductionPractice = splitUser28Grades[10];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetEnglishLanguage = splitUser29Grades[2];
            String user29DifOffsetDevelopmentSoftwareModules = splitUser29Grades[3];
            String user29DifOffsetSupportTestingSoftwareModules = splitUser29Grades[4];
            String user29OffsetPhysicalTraining = splitUser29Grades[5];
            String user29ExamIndustryEconomics = splitUser29Grades[6];
            String user29ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser29Grades[7];
            String user29QualificationExam = splitUser29Grades[8];
            String user29EducationalPractice = splitUser29Grades[9];
            String user29ProductionPractice = splitUser29Grades[10];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetEnglishLanguage = splitUser30Grades[2];
            String user30DifOffsetDevelopmentSoftwareModules = splitUser30Grades[3];
            String user30DifOffsetSupportTestingSoftwareModules = splitUser30Grades[4];
            String user30OffsetPhysicalTraining = splitUser30Grades[5];
            String user30ExamIndustryEconomics = splitUser30Grades[6];
            String user30ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser30Grades[7];
            String user30QualificationExam = splitUser30Grades[8];
            String user30EducationalPractice = splitUser30Grades[9];
            String user30ProductionPractice = splitUser30Grades[10];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetEnglishLanguage = splitUser31Grades[2];
            String user31DifOffsetDevelopmentSoftwareModules = splitUser31Grades[3];
            String user31DifOffsetSupportTestingSoftwareModules = splitUser31Grades[4];
            String user31OffsetPhysicalTraining = splitUser31Grades[5];
            String user31ExamIndustryEconomics = splitUser31Grades[6];
            String user31ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser31Grades[7];
            String user31QualificationExam = splitUser31Grades[8];
            String user31EducationalPractice = splitUser31Grades[9];
            String user31ProductionPractice = splitUser31Grades[10];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetEnglishLanguage = splitUser32Grades[2];
            String user32DifOffsetDevelopmentSoftwareModules = splitUser32Grades[3];
            String user32DifOffsetSupportTestingSoftwareModules = splitUser32Grades[4];
            String user32OffsetPhysicalTraining = splitUser32Grades[5];
            String user32ExamIndustryEconomics = splitUser32Grades[6];
            String user32ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser32Grades[7];
            String user32QualificationExam = splitUser32Grades[8];
            String user32EducationalPractice = splitUser32Grades[9];
            String user32ProductionPractice = splitUser32Grades[10];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetEnglishLanguage = splitUser33Grades[2];
            String user33DifOffsetDevelopmentSoftwareModules = splitUser33Grades[3];
            String user33DifOffsetSupportTestingSoftwareModules = splitUser33Grades[4];
            String user33OffsetPhysicalTraining = splitUser33Grades[5];
            String user33ExamIndustryEconomics = splitUser33Grades[6];
            String user33ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser33Grades[7];
            String user33QualificationExam = splitUser33Grades[8];
            String user33EducationalPractice = splitUser33Grades[9];
            String user33ProductionPractice = splitUser33Grades[10];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetEnglishLanguage = splitUser34Grades[2];
            String user34DifOffsetDevelopmentSoftwareModules = splitUser34Grades[3];
            String user34DifOffsetSupportTestingSoftwareModules = splitUser34Grades[4];
            String user34OffsetPhysicalTraining = splitUser34Grades[5];
            String user34ExamIndustryEconomics = splitUser34Grades[6];
            String user34ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser34Grades[7];
            String user34QualificationExam = splitUser34Grades[8];
            String user34EducationalPractice = splitUser34Grades[9];
            String user34ProductionPractice = splitUser34Grades[10];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetEnglishLanguage = splitUser35Grades[2];
            String user35DifOffsetDevelopmentSoftwareModules = splitUser35Grades[3];
            String user35DifOffsetSupportTestingSoftwareModules = splitUser35Grades[4];
            String user35OffsetPhysicalTraining = splitUser35Grades[5];
            String user35ExamIndustryEconomics = splitUser35Grades[6];
            String user35ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser35Grades[7];
            String user35QualificationExam = splitUser35Grades[8];
            String user35EducationalPractice = splitUser35Grades[9];
            String user35ProductionPractice = splitUser35Grades[10];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetEnglishLanguage = splitUser36Grades[2];
            String user36DifOffsetDevelopmentSoftwareModules = splitUser36Grades[3];
            String user36DifOffsetSupportTestingSoftwareModules = splitUser36Grades[4];
            String user36OffsetPhysicalTraining = splitUser36Grades[5];
            String user36ExamIndustryEconomics = splitUser36Grades[6];
            String user36ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser36Grades[7];
            String user36QualificationExam = splitUser36Grades[8];
            String user36EducationalPractice = splitUser36Grades[9];
            String user36ProductionPractice = splitUser36Grades[10];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetEnglishLanguage = splitUser37Grades[2];
            String user37DifOffsetDevelopmentSoftwareModules = splitUser37Grades[3];
            String user37DifOffsetSupportTestingSoftwareModules = splitUser37Grades[4];
            String user37OffsetPhysicalTraining = splitUser37Grades[5];
            String user37ExamIndustryEconomics = splitUser37Grades[6];
            String user37ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser37Grades[7];
            String user37QualificationExam = splitUser37Grades[8];
            String user37EducationalPractice = splitUser37Grades[9];
            String user37ProductionPractice = splitUser37Grades[10];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetEnglishLanguage = splitUser38Grades[2];
            String user38DifOffsetDevelopmentSoftwareModules = splitUser38Grades[3];
            String user38DifOffsetSupportTestingSoftwareModules = splitUser38Grades[4];
            String user38OffsetPhysicalTraining = splitUser38Grades[5];
            String user38ExamIndustryEconomics = splitUser38Grades[6];
            String user38ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser38Grades[7];
            String user38QualificationExam = splitUser38Grades[8];
            String user38EducationalPractice = splitUser38Grades[9];
            String user38ProductionPractice = splitUser38Grades[10];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetEnglishLanguage = splitUser39Grades[2];
            String user39DifOffsetDevelopmentSoftwareModules = splitUser39Grades[3];
            String user39DifOffsetSupportTestingSoftwareModules = splitUser39Grades[4];
            String user39OffsetPhysicalTraining = splitUser39Grades[5];
            String user39ExamIndustryEconomics = splitUser39Grades[6];
            String user39ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser39Grades[7];
            String user39QualificationExam = splitUser39Grades[8];
            String user39EducationalPractice = splitUser39Grades[9];
            String user39ProductionPractice = splitUser39Grades[10];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetEnglishLanguage = splitUser40Grades[2];
            String user40DifOffsetDevelopmentSoftwareModules = splitUser40Grades[3];
            String user40DifOffsetSupportTestingSoftwareModules = splitUser40Grades[4];
            String user40OffsetPhysicalTraining = splitUser40Grades[5];
            String user40ExamIndustryEconomics = splitUser40Grades[6];
            String user40ExamTechnologyDevelopingProtectingDatabasesDynamic = splitUser40Grades[7];
            String user40QualificationExam = splitUser40Grades[8];
            String user40EducationalPractice = splitUser40Grades[9];
            String user40ProductionPractice = splitUser40Grades[10];



            ArrayList<SpecialGrade_IS_1_1Course3Semester2> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user1Id, user1Username, user1DifOffsetEnglishLanguage, user1DifOffsetDevelopmentSoftwareModules, user1DifOffsetSupportTestingSoftwareModules, user1OffsetPhysicalTraining, user1ExamIndustryEconomics, user1ExamTechnologyDevelopingProtectingDatabasesDynamic, user1QualificationExam, user1EducationalPractice, user1ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user2Id, user2Username, user2DifOffsetEnglishLanguage, user2DifOffsetDevelopmentSoftwareModules, user2DifOffsetSupportTestingSoftwareModules, user2OffsetPhysicalTraining, user2ExamIndustryEconomics, user2ExamTechnologyDevelopingProtectingDatabasesDynamic, user2QualificationExam, user2EducationalPractice, user2ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user3Id, user3Username, user3DifOffsetEnglishLanguage, user3DifOffsetDevelopmentSoftwareModules, user3DifOffsetSupportTestingSoftwareModules, user3OffsetPhysicalTraining, user3ExamIndustryEconomics, user3ExamTechnologyDevelopingProtectingDatabasesDynamic, user3QualificationExam, user3EducationalPractice, user3ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user4Id, user4Username, user4DifOffsetEnglishLanguage, user4DifOffsetDevelopmentSoftwareModules, user4DifOffsetSupportTestingSoftwareModules, user4OffsetPhysicalTraining, user4ExamIndustryEconomics, user4ExamTechnologyDevelopingProtectingDatabasesDynamic, user4QualificationExam, user4EducationalPractice, user4ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user5Id, user5Username, user5DifOffsetEnglishLanguage, user5DifOffsetDevelopmentSoftwareModules, user5DifOffsetSupportTestingSoftwareModules, user5OffsetPhysicalTraining, user5ExamIndustryEconomics, user5ExamTechnologyDevelopingProtectingDatabasesDynamic, user5QualificationExam, user5EducationalPractice, user5ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user6Id, user6Username, user6DifOffsetEnglishLanguage, user6DifOffsetDevelopmentSoftwareModules, user6DifOffsetSupportTestingSoftwareModules, user6OffsetPhysicalTraining, user6ExamIndustryEconomics, user6ExamTechnologyDevelopingProtectingDatabasesDynamic, user6QualificationExam, user6EducationalPractice, user6ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user7Id, user7Username, user7DifOffsetEnglishLanguage, user7DifOffsetDevelopmentSoftwareModules, user7DifOffsetSupportTestingSoftwareModules, user7OffsetPhysicalTraining, user7ExamIndustryEconomics, user7ExamTechnologyDevelopingProtectingDatabasesDynamic, user7QualificationExam, user7EducationalPractice, user7ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user8Id, user8Username, user8DifOffsetEnglishLanguage, user8DifOffsetDevelopmentSoftwareModules, user8DifOffsetSupportTestingSoftwareModules, user8OffsetPhysicalTraining, user8ExamIndustryEconomics, user8ExamTechnologyDevelopingProtectingDatabasesDynamic, user8QualificationExam, user8EducationalPractice, user8ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user9Id, user9Username, user9DifOffsetEnglishLanguage, user9DifOffsetDevelopmentSoftwareModules, user9DifOffsetSupportTestingSoftwareModules, user9OffsetPhysicalTraining, user9ExamIndustryEconomics, user9ExamTechnologyDevelopingProtectingDatabasesDynamic, user9QualificationExam, user9EducationalPractice, user9ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user10Id, user10Username, user10DifOffsetEnglishLanguage, user10DifOffsetDevelopmentSoftwareModules, user10DifOffsetSupportTestingSoftwareModules, user10OffsetPhysicalTraining, user10ExamIndustryEconomics, user10ExamTechnologyDevelopingProtectingDatabasesDynamic, user10QualificationExam, user10EducationalPractice, user10ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user11Id, user11Username, user11DifOffsetEnglishLanguage, user11DifOffsetDevelopmentSoftwareModules, user11DifOffsetSupportTestingSoftwareModules, user11OffsetPhysicalTraining, user11ExamIndustryEconomics, user11ExamTechnologyDevelopingProtectingDatabasesDynamic, user11QualificationExam, user11EducationalPractice, user11ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user12Id, user12Username, user12DifOffsetEnglishLanguage, user12DifOffsetDevelopmentSoftwareModules, user12DifOffsetSupportTestingSoftwareModules, user12OffsetPhysicalTraining, user12ExamIndustryEconomics, user12ExamTechnologyDevelopingProtectingDatabasesDynamic, user12QualificationExam, user12EducationalPractice, user12ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user13Id, user13Username, user13DifOffsetEnglishLanguage, user13DifOffsetDevelopmentSoftwareModules, user13DifOffsetSupportTestingSoftwareModules, user13OffsetPhysicalTraining, user13ExamIndustryEconomics, user13ExamTechnologyDevelopingProtectingDatabasesDynamic, user13QualificationExam, user13EducationalPractice, user13ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user14Id, user14Username, user14DifOffsetEnglishLanguage, user14DifOffsetDevelopmentSoftwareModules, user14DifOffsetSupportTestingSoftwareModules, user14OffsetPhysicalTraining, user14ExamIndustryEconomics, user14ExamTechnologyDevelopingProtectingDatabasesDynamic, user14QualificationExam, user14EducationalPractice, user14ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user15Id, user15Username, user15DifOffsetEnglishLanguage, user15DifOffsetDevelopmentSoftwareModules, user15DifOffsetSupportTestingSoftwareModules, user15OffsetPhysicalTraining, user15ExamIndustryEconomics, user15ExamTechnologyDevelopingProtectingDatabasesDynamic, user15QualificationExam, user15EducationalPractice, user15ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user16Id, user16Username, user16DifOffsetEnglishLanguage, user16DifOffsetDevelopmentSoftwareModules, user16DifOffsetSupportTestingSoftwareModules, user16OffsetPhysicalTraining, user16ExamIndustryEconomics, user16ExamTechnologyDevelopingProtectingDatabasesDynamic, user16QualificationExam, user16EducationalPractice, user16ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user17Id, user17Username, user17DifOffsetEnglishLanguage, user17DifOffsetDevelopmentSoftwareModules, user17DifOffsetSupportTestingSoftwareModules, user17OffsetPhysicalTraining, user17ExamIndustryEconomics, user17ExamTechnologyDevelopingProtectingDatabasesDynamic, user17QualificationExam, user17EducationalPractice, user17ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user18Id, user18Username, user18DifOffsetEnglishLanguage, user18DifOffsetDevelopmentSoftwareModules, user18DifOffsetSupportTestingSoftwareModules, user18OffsetPhysicalTraining, user18ExamIndustryEconomics, user18ExamTechnologyDevelopingProtectingDatabasesDynamic, user18QualificationExam, user18EducationalPractice, user18ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user19Id, user19Username, user19DifOffsetEnglishLanguage, user19DifOffsetDevelopmentSoftwareModules, user19DifOffsetSupportTestingSoftwareModules, user19OffsetPhysicalTraining, user19ExamIndustryEconomics, user19ExamTechnologyDevelopingProtectingDatabasesDynamic, user19QualificationExam, user19EducationalPractice, user19ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user20Id, user20Username, user20DifOffsetEnglishLanguage, user20DifOffsetDevelopmentSoftwareModules, user20DifOffsetSupportTestingSoftwareModules, user20OffsetPhysicalTraining, user20ExamIndustryEconomics, user20ExamTechnologyDevelopingProtectingDatabasesDynamic, user20QualificationExam, user20EducationalPractice, user20ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user21Id, user21Username, user21DifOffsetEnglishLanguage, user21DifOffsetDevelopmentSoftwareModules, user21DifOffsetSupportTestingSoftwareModules, user21OffsetPhysicalTraining, user21ExamIndustryEconomics, user21ExamTechnologyDevelopingProtectingDatabasesDynamic, user21QualificationExam, user21EducationalPractice, user21ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user22Id, user22Username, user22DifOffsetEnglishLanguage, user22DifOffsetDevelopmentSoftwareModules, user22DifOffsetSupportTestingSoftwareModules, user22OffsetPhysicalTraining, user22ExamIndustryEconomics, user22ExamTechnologyDevelopingProtectingDatabasesDynamic, user22QualificationExam, user22EducationalPractice, user22ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user23Id, user23Username, user23DifOffsetEnglishLanguage, user23DifOffsetDevelopmentSoftwareModules, user23DifOffsetSupportTestingSoftwareModules, user23OffsetPhysicalTraining, user23ExamIndustryEconomics, user23ExamTechnologyDevelopingProtectingDatabasesDynamic, user23QualificationExam, user23EducationalPractice, user23ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user24Id, user24Username, user24DifOffsetEnglishLanguage, user24DifOffsetDevelopmentSoftwareModules, user24DifOffsetSupportTestingSoftwareModules, user24OffsetPhysicalTraining, user24ExamIndustryEconomics, user24ExamTechnologyDevelopingProtectingDatabasesDynamic, user24QualificationExam, user24EducationalPractice, user24ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user25Id, user25Username, user25DifOffsetEnglishLanguage, user25DifOffsetDevelopmentSoftwareModules, user25DifOffsetSupportTestingSoftwareModules, user25OffsetPhysicalTraining, user25ExamIndustryEconomics, user25ExamTechnologyDevelopingProtectingDatabasesDynamic, user25QualificationExam, user25EducationalPractice, user25ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user26Id, user26Username, user26DifOffsetEnglishLanguage, user26DifOffsetDevelopmentSoftwareModules, user26DifOffsetSupportTestingSoftwareModules, user26OffsetPhysicalTraining, user26ExamIndustryEconomics, user26ExamTechnologyDevelopingProtectingDatabasesDynamic, user26QualificationExam, user26EducationalPractice, user26ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user27Id, user27Username, user27DifOffsetEnglishLanguage, user27DifOffsetDevelopmentSoftwareModules, user27DifOffsetSupportTestingSoftwareModules, user27OffsetPhysicalTraining, user27ExamIndustryEconomics, user27ExamTechnologyDevelopingProtectingDatabasesDynamic, user27QualificationExam, user27EducationalPractice, user27ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user28Id, user28Username, user28DifOffsetEnglishLanguage, user28DifOffsetDevelopmentSoftwareModules, user28DifOffsetSupportTestingSoftwareModules, user28OffsetPhysicalTraining, user28ExamIndustryEconomics, user28ExamTechnologyDevelopingProtectingDatabasesDynamic, user28QualificationExam, user28EducationalPractice, user28ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user29Id, user29Username, user29DifOffsetEnglishLanguage, user29DifOffsetDevelopmentSoftwareModules, user29DifOffsetSupportTestingSoftwareModules, user29OffsetPhysicalTraining, user29ExamIndustryEconomics, user29ExamTechnologyDevelopingProtectingDatabasesDynamic, user29QualificationExam, user29EducationalPractice, user29ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user30Id, user30Username, user30DifOffsetEnglishLanguage, user30DifOffsetDevelopmentSoftwareModules, user30DifOffsetSupportTestingSoftwareModules, user30OffsetPhysicalTraining, user30ExamIndustryEconomics, user30ExamTechnologyDevelopingProtectingDatabasesDynamic, user30QualificationExam, user30EducationalPractice, user30ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user31Id, user31Username, user31DifOffsetEnglishLanguage, user31DifOffsetDevelopmentSoftwareModules, user31DifOffsetSupportTestingSoftwareModules, user31OffsetPhysicalTraining, user31ExamIndustryEconomics, user31ExamTechnologyDevelopingProtectingDatabasesDynamic, user31QualificationExam, user31EducationalPractice, user31ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user32Id, user32Username, user32DifOffsetEnglishLanguage, user32DifOffsetDevelopmentSoftwareModules, user32DifOffsetSupportTestingSoftwareModules, user32OffsetPhysicalTraining, user32ExamIndustryEconomics, user32ExamTechnologyDevelopingProtectingDatabasesDynamic, user32QualificationExam, user32EducationalPractice, user32ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user33Id, user33Username, user33DifOffsetEnglishLanguage, user33DifOffsetDevelopmentSoftwareModules, user33DifOffsetSupportTestingSoftwareModules, user33OffsetPhysicalTraining, user33ExamIndustryEconomics, user33ExamTechnologyDevelopingProtectingDatabasesDynamic, user33QualificationExam, user33EducationalPractice, user33ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user34Id, user34Username, user34DifOffsetEnglishLanguage, user34DifOffsetDevelopmentSoftwareModules, user34DifOffsetSupportTestingSoftwareModules, user34OffsetPhysicalTraining, user34ExamIndustryEconomics, user34ExamTechnologyDevelopingProtectingDatabasesDynamic, user34QualificationExam, user34EducationalPractice, user34ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user35Id, user35Username, user35DifOffsetEnglishLanguage, user35DifOffsetDevelopmentSoftwareModules, user35DifOffsetSupportTestingSoftwareModules, user35OffsetPhysicalTraining, user35ExamIndustryEconomics, user35ExamTechnologyDevelopingProtectingDatabasesDynamic, user35QualificationExam, user35EducationalPractice, user35ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user36Id, user36Username, user36DifOffsetEnglishLanguage, user36DifOffsetDevelopmentSoftwareModules, user36DifOffsetSupportTestingSoftwareModules, user36OffsetPhysicalTraining, user36ExamIndustryEconomics, user36ExamTechnologyDevelopingProtectingDatabasesDynamic, user36QualificationExam, user36EducationalPractice, user36ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user37Id, user37Username, user37DifOffsetEnglishLanguage, user37DifOffsetDevelopmentSoftwareModules, user37DifOffsetSupportTestingSoftwareModules, user37OffsetPhysicalTraining, user37ExamIndustryEconomics, user37ExamTechnologyDevelopingProtectingDatabasesDynamic, user37QualificationExam, user37EducationalPractice, user37ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user38Id, user38Username, user38DifOffsetEnglishLanguage, user38DifOffsetDevelopmentSoftwareModules, user38DifOffsetSupportTestingSoftwareModules, user38OffsetPhysicalTraining, user38ExamIndustryEconomics, user38ExamTechnologyDevelopingProtectingDatabasesDynamic, user38QualificationExam, user38EducationalPractice, user38ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user39Id, user39Username, user39DifOffsetEnglishLanguage, user39DifOffsetDevelopmentSoftwareModules, user39DifOffsetSupportTestingSoftwareModules, user39OffsetPhysicalTraining, user39ExamIndustryEconomics, user39ExamTechnologyDevelopingProtectingDatabasesDynamic, user39QualificationExam, user39EducationalPractice, user39ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course3Semester2(user40Id, user40Username, user40DifOffsetEnglishLanguage, user40DifOffsetDevelopmentSoftwareModules, user40DifOffsetSupportTestingSoftwareModules, user40OffsetPhysicalTraining, user40ExamIndustryEconomics, user40ExamTechnologyDevelopingProtectingDatabasesDynamic, user40QualificationExam, user40EducationalPractice, user40ProductionPractice));

            if (specialGradeIs11Course3Semester2Repository.findAll().isEmpty()) {
                specialGradeIs11Course3Semester2Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course3Semester2> user1Row = specialGradeIs11Course3Semester2Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User1 = user1Row.get();
            specialGrade_IS_1_1Course3Semester2User1.setUsername(user1Username);
            specialGrade_IS_1_1Course3Semester2User1.setDifOffsetEnglishLanguage(user1DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User1.setDifOffsetDevelopmentSoftwareModules(user1DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User1.setDifOffsetSupportTestingSoftwareModules(user1DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User1.setOffsetPhysicalTraining(user1OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User1.setExamIndustryEconomics(user1ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User1.setExamTechnologyDevelopingProtectingDatabasesDynamic(user1ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User1.setQualificationExam(user1QualificationExam);
            specialGrade_IS_1_1Course3Semester2User1.setEducationalPractice(user1EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User1.setProductionPractice(user1ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course3Semester2> user2Row = specialGradeIs11Course3Semester2Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User2 = user2Row.get();
            specialGrade_IS_1_1Course3Semester2User2.setUsername(user2Username);
            specialGrade_IS_1_1Course3Semester2User2.setDifOffsetEnglishLanguage(user2DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User2.setDifOffsetDevelopmentSoftwareModules(user2DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User2.setDifOffsetSupportTestingSoftwareModules(user2DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User2.setOffsetPhysicalTraining(user2OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User2.setExamIndustryEconomics(user2ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User2.setExamTechnologyDevelopingProtectingDatabasesDynamic(user2ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User2.setQualificationExam(user2QualificationExam);
            specialGrade_IS_1_1Course3Semester2User2.setEducationalPractice(user2EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User2.setProductionPractice(user2ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course3Semester2> user3Row = specialGradeIs11Course3Semester2Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User3 = user3Row.get();
            specialGrade_IS_1_1Course3Semester2User3.setUsername(user3Username);
            specialGrade_IS_1_1Course3Semester2User3.setDifOffsetEnglishLanguage(user3DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User3.setDifOffsetDevelopmentSoftwareModules(user3DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User3.setDifOffsetSupportTestingSoftwareModules(user3DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User3.setOffsetPhysicalTraining(user3OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User3.setExamIndustryEconomics(user3ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User3.setExamTechnologyDevelopingProtectingDatabasesDynamic(user3ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User3.setQualificationExam(user3QualificationExam);
            specialGrade_IS_1_1Course3Semester2User3.setEducationalPractice(user3EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User3.setProductionPractice(user3ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course3Semester2> user4Row = specialGradeIs11Course3Semester2Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User4 = user4Row.get();
            specialGrade_IS_1_1Course3Semester2User4.setUsername(user4Username);
            specialGrade_IS_1_1Course3Semester2User4.setDifOffsetEnglishLanguage(user4DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User4.setDifOffsetDevelopmentSoftwareModules(user4DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User4.setDifOffsetSupportTestingSoftwareModules(user4DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User4.setOffsetPhysicalTraining(user4OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User4.setExamIndustryEconomics(user4ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User4.setExamTechnologyDevelopingProtectingDatabasesDynamic(user4ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User4.setQualificationExam(user4QualificationExam);
            specialGrade_IS_1_1Course3Semester2User4.setEducationalPractice(user4EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User4.setProductionPractice(user4ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course3Semester2> user5Row = specialGradeIs11Course3Semester2Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User5 = user5Row.get();
            specialGrade_IS_1_1Course3Semester2User5.setUsername(user5Username);
            specialGrade_IS_1_1Course3Semester2User5.setDifOffsetEnglishLanguage(user5DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User5.setDifOffsetDevelopmentSoftwareModules(user5DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User5.setDifOffsetSupportTestingSoftwareModules(user5DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User5.setOffsetPhysicalTraining(user5OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User5.setExamIndustryEconomics(user5ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User5.setExamTechnologyDevelopingProtectingDatabasesDynamic(user5ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User5.setQualificationExam(user5QualificationExam);
            specialGrade_IS_1_1Course3Semester2User5.setEducationalPractice(user5EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User5.setProductionPractice(user5ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course3Semester2> user6Row = specialGradeIs11Course3Semester2Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User6 = user6Row.get();
            specialGrade_IS_1_1Course3Semester2User6.setUsername(user6Username);
            specialGrade_IS_1_1Course3Semester2User6.setDifOffsetEnglishLanguage(user6DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User6.setDifOffsetDevelopmentSoftwareModules(user6DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User6.setDifOffsetSupportTestingSoftwareModules(user6DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User6.setOffsetPhysicalTraining(user6OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User6.setExamIndustryEconomics(user6ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User6.setExamTechnologyDevelopingProtectingDatabasesDynamic(user6ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User6.setQualificationExam(user6QualificationExam);
            specialGrade_IS_1_1Course3Semester2User6.setEducationalPractice(user6EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User6.setProductionPractice(user6ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course3Semester2> user7Row = specialGradeIs11Course3Semester2Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User7 = user7Row.get();
            specialGrade_IS_1_1Course3Semester2User7.setUsername(user7Username);
            specialGrade_IS_1_1Course3Semester2User7.setDifOffsetEnglishLanguage(user7DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User7.setDifOffsetDevelopmentSoftwareModules(user7DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User7.setDifOffsetSupportTestingSoftwareModules(user7DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User7.setOffsetPhysicalTraining(user7OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User7.setExamIndustryEconomics(user7ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User7.setExamTechnologyDevelopingProtectingDatabasesDynamic(user7ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User7.setQualificationExam(user7QualificationExam);
            specialGrade_IS_1_1Course3Semester2User7.setEducationalPractice(user7EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User7.setProductionPractice(user7ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course3Semester2> user8Row = specialGradeIs11Course3Semester2Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User8 = user8Row.get();
            specialGrade_IS_1_1Course3Semester2User8.setUsername(user8Username);
            specialGrade_IS_1_1Course3Semester2User8.setDifOffsetEnglishLanguage(user8DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User8.setDifOffsetDevelopmentSoftwareModules(user8DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User8.setDifOffsetSupportTestingSoftwareModules(user8DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User8.setOffsetPhysicalTraining(user8OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User8.setExamIndustryEconomics(user8ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User8.setExamTechnologyDevelopingProtectingDatabasesDynamic(user8ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User8.setQualificationExam(user8QualificationExam);
            specialGrade_IS_1_1Course3Semester2User8.setEducationalPractice(user8EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User8.setProductionPractice(user8ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course3Semester2> user9Row = specialGradeIs11Course3Semester2Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User9 = user9Row.get();
            specialGrade_IS_1_1Course3Semester2User9.setUsername(user9Username);
            specialGrade_IS_1_1Course3Semester2User9.setDifOffsetEnglishLanguage(user9DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User9.setDifOffsetDevelopmentSoftwareModules(user9DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User9.setDifOffsetSupportTestingSoftwareModules(user9DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User9.setOffsetPhysicalTraining(user9OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User9.setExamIndustryEconomics(user9ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User9.setExamTechnologyDevelopingProtectingDatabasesDynamic(user9ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User9.setQualificationExam(user9QualificationExam);
            specialGrade_IS_1_1Course3Semester2User9.setEducationalPractice(user9EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User9.setProductionPractice(user9ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course3Semester2> user10Row = specialGradeIs11Course3Semester2Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User10 = user10Row.get();
            specialGrade_IS_1_1Course3Semester2User10.setUsername(user10Username);
            specialGrade_IS_1_1Course3Semester2User10.setDifOffsetEnglishLanguage(user10DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User10.setDifOffsetDevelopmentSoftwareModules(user10DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User10.setDifOffsetSupportTestingSoftwareModules(user10DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User10.setOffsetPhysicalTraining(user10OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User10.setExamIndustryEconomics(user10ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User10.setExamTechnologyDevelopingProtectingDatabasesDynamic(user10ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User10.setQualificationExam(user10QualificationExam);
            specialGrade_IS_1_1Course3Semester2User10.setEducationalPractice(user10EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User10.setProductionPractice(user10ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course3Semester2> user11Row = specialGradeIs11Course3Semester2Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User11 = user11Row.get();
            specialGrade_IS_1_1Course3Semester2User11.setUsername(user11Username);
            specialGrade_IS_1_1Course3Semester2User11.setDifOffsetEnglishLanguage(user11DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User11.setDifOffsetDevelopmentSoftwareModules(user11DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User11.setDifOffsetSupportTestingSoftwareModules(user11DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User11.setOffsetPhysicalTraining(user11OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User11.setExamIndustryEconomics(user11ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User11.setExamTechnologyDevelopingProtectingDatabasesDynamic(user11ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User11.setQualificationExam(user11QualificationExam);
            specialGrade_IS_1_1Course3Semester2User11.setEducationalPractice(user11EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User11.setProductionPractice(user11ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course3Semester2> user12Row = specialGradeIs11Course3Semester2Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User12 = user12Row.get();
            specialGrade_IS_1_1Course3Semester2User12.setUsername(user12Username);
            specialGrade_IS_1_1Course3Semester2User12.setDifOffsetEnglishLanguage(user12DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User12.setDifOffsetDevelopmentSoftwareModules(user12DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User12.setDifOffsetSupportTestingSoftwareModules(user12DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User12.setOffsetPhysicalTraining(user12OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User12.setExamIndustryEconomics(user12ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User12.setExamTechnologyDevelopingProtectingDatabasesDynamic(user12ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User12.setQualificationExam(user12QualificationExam);
            specialGrade_IS_1_1Course3Semester2User12.setEducationalPractice(user12EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User12.setProductionPractice(user12ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course3Semester2> user13Row = specialGradeIs11Course3Semester2Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User13 = user13Row.get();
            specialGrade_IS_1_1Course3Semester2User13.setUsername(user13Username);
            specialGrade_IS_1_1Course3Semester2User13.setDifOffsetEnglishLanguage(user13DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User13.setDifOffsetDevelopmentSoftwareModules(user13DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User13.setDifOffsetSupportTestingSoftwareModules(user13DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User13.setOffsetPhysicalTraining(user13OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User13.setExamIndustryEconomics(user13ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User13.setExamTechnologyDevelopingProtectingDatabasesDynamic(user13ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User13.setQualificationExam(user13QualificationExam);
            specialGrade_IS_1_1Course3Semester2User13.setEducationalPractice(user13EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User13.setProductionPractice(user13ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course3Semester2> user14Row = specialGradeIs11Course3Semester2Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User14 = user14Row.get();
            specialGrade_IS_1_1Course3Semester2User14.setUsername(user14Username);
            specialGrade_IS_1_1Course3Semester2User14.setDifOffsetEnglishLanguage(user14DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User14.setDifOffsetDevelopmentSoftwareModules(user14DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User14.setDifOffsetSupportTestingSoftwareModules(user14DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User14.setOffsetPhysicalTraining(user14OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User14.setExamIndustryEconomics(user14ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User14.setExamTechnologyDevelopingProtectingDatabasesDynamic(user14ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User14.setQualificationExam(user14QualificationExam);
            specialGrade_IS_1_1Course3Semester2User14.setEducationalPractice(user14EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User14.setProductionPractice(user14ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course3Semester2> user15Row = specialGradeIs11Course3Semester2Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User15 = user15Row.get();
            specialGrade_IS_1_1Course3Semester2User15.setUsername(user15Username);
            specialGrade_IS_1_1Course3Semester2User15.setDifOffsetEnglishLanguage(user15DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User15.setDifOffsetDevelopmentSoftwareModules(user15DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User15.setDifOffsetSupportTestingSoftwareModules(user15DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User15.setOffsetPhysicalTraining(user15OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User15.setExamIndustryEconomics(user15ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User15.setExamTechnologyDevelopingProtectingDatabasesDynamic(user15ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User15.setQualificationExam(user15QualificationExam);
            specialGrade_IS_1_1Course3Semester2User15.setEducationalPractice(user15EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User15.setProductionPractice(user15ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course3Semester2> user16Row = specialGradeIs11Course3Semester2Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User16 = user16Row.get();
            specialGrade_IS_1_1Course3Semester2User16.setUsername(user16Username);
            specialGrade_IS_1_1Course3Semester2User16.setDifOffsetEnglishLanguage(user16DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User16.setDifOffsetDevelopmentSoftwareModules(user16DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User16.setDifOffsetSupportTestingSoftwareModules(user16DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User16.setOffsetPhysicalTraining(user16OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User16.setExamIndustryEconomics(user16ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User16.setExamTechnologyDevelopingProtectingDatabasesDynamic(user16ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User16.setQualificationExam(user16QualificationExam);
            specialGrade_IS_1_1Course3Semester2User16.setEducationalPractice(user16EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User16.setProductionPractice(user16ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course3Semester2> user17Row = specialGradeIs11Course3Semester2Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User17 = user17Row.get();
            specialGrade_IS_1_1Course3Semester2User17.setUsername(user17Username);
            specialGrade_IS_1_1Course3Semester2User17.setDifOffsetEnglishLanguage(user17DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User17.setDifOffsetDevelopmentSoftwareModules(user17DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User17.setDifOffsetSupportTestingSoftwareModules(user17DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User17.setOffsetPhysicalTraining(user17OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User17.setExamIndustryEconomics(user17ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User17.setExamTechnologyDevelopingProtectingDatabasesDynamic(user17ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User17.setQualificationExam(user17QualificationExam);
            specialGrade_IS_1_1Course3Semester2User17.setEducationalPractice(user17EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User17.setProductionPractice(user17ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course3Semester2> user18Row = specialGradeIs11Course3Semester2Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User18 = user18Row.get();
            specialGrade_IS_1_1Course3Semester2User18.setUsername(user18Username);
            specialGrade_IS_1_1Course3Semester2User18.setDifOffsetEnglishLanguage(user18DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User18.setDifOffsetDevelopmentSoftwareModules(user18DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User18.setDifOffsetSupportTestingSoftwareModules(user18DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User18.setOffsetPhysicalTraining(user18OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User18.setExamIndustryEconomics(user18ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User18.setExamTechnologyDevelopingProtectingDatabasesDynamic(user18ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User18.setQualificationExam(user18QualificationExam);
            specialGrade_IS_1_1Course3Semester2User18.setEducationalPractice(user18EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User18.setProductionPractice(user18ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course3Semester2> user19Row = specialGradeIs11Course3Semester2Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User19 = user19Row.get();
            specialGrade_IS_1_1Course3Semester2User19.setUsername(user19Username);
            specialGrade_IS_1_1Course3Semester2User19.setDifOffsetEnglishLanguage(user19DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User19.setDifOffsetDevelopmentSoftwareModules(user19DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User19.setDifOffsetSupportTestingSoftwareModules(user19DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User19.setOffsetPhysicalTraining(user19OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User19.setExamIndustryEconomics(user19ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User19.setExamTechnologyDevelopingProtectingDatabasesDynamic(user19ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User19.setQualificationExam(user19QualificationExam);
            specialGrade_IS_1_1Course3Semester2User19.setEducationalPractice(user19EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User19.setProductionPractice(user19ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course3Semester2> user20Row = specialGradeIs11Course3Semester2Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User20 = user20Row.get();
            specialGrade_IS_1_1Course3Semester2User20.setUsername(user20Username);
            specialGrade_IS_1_1Course3Semester2User20.setDifOffsetEnglishLanguage(user20DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User20.setDifOffsetDevelopmentSoftwareModules(user20DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User20.setDifOffsetSupportTestingSoftwareModules(user20DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User20.setOffsetPhysicalTraining(user20OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User20.setExamIndustryEconomics(user20ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User20.setExamTechnologyDevelopingProtectingDatabasesDynamic(user20ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User20.setQualificationExam(user20QualificationExam);
            specialGrade_IS_1_1Course3Semester2User20.setEducationalPractice(user20EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User20.setProductionPractice(user20ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course3Semester2> user21Row = specialGradeIs11Course3Semester2Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User21 = user21Row.get();
            specialGrade_IS_1_1Course3Semester2User21.setUsername(user21Username);
            specialGrade_IS_1_1Course3Semester2User21.setDifOffsetEnglishLanguage(user21DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User21.setDifOffsetDevelopmentSoftwareModules(user21DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User21.setDifOffsetSupportTestingSoftwareModules(user21DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User21.setOffsetPhysicalTraining(user21OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User21.setExamIndustryEconomics(user21ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User21.setExamTechnologyDevelopingProtectingDatabasesDynamic(user21ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User21.setQualificationExam(user21QualificationExam);
            specialGrade_IS_1_1Course3Semester2User21.setEducationalPractice(user21EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User21.setProductionPractice(user21ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course3Semester2> user22Row = specialGradeIs11Course3Semester2Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User22 = user22Row.get();
            specialGrade_IS_1_1Course3Semester2User22.setUsername(user22Username);
            specialGrade_IS_1_1Course3Semester2User22.setDifOffsetEnglishLanguage(user22DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User22.setDifOffsetDevelopmentSoftwareModules(user22DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User22.setDifOffsetSupportTestingSoftwareModules(user22DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User22.setOffsetPhysicalTraining(user22OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User22.setExamIndustryEconomics(user22ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User22.setExamTechnologyDevelopingProtectingDatabasesDynamic(user22ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User22.setQualificationExam(user22QualificationExam);
            specialGrade_IS_1_1Course3Semester2User22.setEducationalPractice(user22EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User22.setProductionPractice(user22ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course3Semester2> user23Row = specialGradeIs11Course3Semester2Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User23 = user23Row.get();
            specialGrade_IS_1_1Course3Semester2User23.setUsername(user23Username);
            specialGrade_IS_1_1Course3Semester2User23.setDifOffsetEnglishLanguage(user23DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User23.setDifOffsetDevelopmentSoftwareModules(user23DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User23.setDifOffsetSupportTestingSoftwareModules(user23DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User23.setOffsetPhysicalTraining(user23OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User23.setExamIndustryEconomics(user23ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User23.setExamTechnologyDevelopingProtectingDatabasesDynamic(user23ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User23.setQualificationExam(user23QualificationExam);
            specialGrade_IS_1_1Course3Semester2User23.setEducationalPractice(user23EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User23.setProductionPractice(user23ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course3Semester2> user24Row = specialGradeIs11Course3Semester2Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User24 = user24Row.get();
            specialGrade_IS_1_1Course3Semester2User24.setUsername(user24Username);
            specialGrade_IS_1_1Course3Semester2User24.setDifOffsetEnglishLanguage(user24DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User24.setDifOffsetDevelopmentSoftwareModules(user24DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User24.setDifOffsetSupportTestingSoftwareModules(user24DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User24.setOffsetPhysicalTraining(user24OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User24.setExamIndustryEconomics(user24ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User24.setExamTechnologyDevelopingProtectingDatabasesDynamic(user24ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User24.setQualificationExam(user24QualificationExam);
            specialGrade_IS_1_1Course3Semester2User24.setEducationalPractice(user24EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User24.setProductionPractice(user24ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course3Semester2> user25Row = specialGradeIs11Course3Semester2Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User25 = user25Row.get();
            specialGrade_IS_1_1Course3Semester2User25.setUsername(user25Username);
            specialGrade_IS_1_1Course3Semester2User25.setDifOffsetEnglishLanguage(user25DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User25.setDifOffsetDevelopmentSoftwareModules(user25DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User25.setDifOffsetSupportTestingSoftwareModules(user25DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User25.setOffsetPhysicalTraining(user25OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User25.setExamIndustryEconomics(user25ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User25.setExamTechnologyDevelopingProtectingDatabasesDynamic(user25ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User25.setQualificationExam(user25QualificationExam);
            specialGrade_IS_1_1Course3Semester2User25.setEducationalPractice(user25EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User25.setProductionPractice(user25ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course3Semester2> user26Row = specialGradeIs11Course3Semester2Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User26 = user26Row.get();
            specialGrade_IS_1_1Course3Semester2User26.setUsername(user26Username);
            specialGrade_IS_1_1Course3Semester2User26.setDifOffsetEnglishLanguage(user26DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User26.setDifOffsetDevelopmentSoftwareModules(user26DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User26.setDifOffsetSupportTestingSoftwareModules(user26DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User26.setOffsetPhysicalTraining(user26OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User26.setExamIndustryEconomics(user26ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User26.setExamTechnologyDevelopingProtectingDatabasesDynamic(user26ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User26.setQualificationExam(user26QualificationExam);
            specialGrade_IS_1_1Course3Semester2User26.setEducationalPractice(user26EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User26.setProductionPractice(user26ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course3Semester2> user27Row = specialGradeIs11Course3Semester2Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User27 = user27Row.get();
            specialGrade_IS_1_1Course3Semester2User27.setUsername(user27Username);
            specialGrade_IS_1_1Course3Semester2User27.setDifOffsetEnglishLanguage(user27DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User27.setDifOffsetDevelopmentSoftwareModules(user27DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User27.setDifOffsetSupportTestingSoftwareModules(user27DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User27.setOffsetPhysicalTraining(user27OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User27.setExamIndustryEconomics(user27ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User27.setExamTechnologyDevelopingProtectingDatabasesDynamic(user27ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User27.setQualificationExam(user27QualificationExam);
            specialGrade_IS_1_1Course3Semester2User27.setEducationalPractice(user27EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User27.setProductionPractice(user27ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course3Semester2> user28Row = specialGradeIs11Course3Semester2Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User28 = user28Row.get();
            specialGrade_IS_1_1Course3Semester2User28.setUsername(user28Username);
            specialGrade_IS_1_1Course3Semester2User28.setDifOffsetEnglishLanguage(user28DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User28.setDifOffsetDevelopmentSoftwareModules(user28DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User28.setDifOffsetSupportTestingSoftwareModules(user28DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User28.setOffsetPhysicalTraining(user28OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User28.setExamIndustryEconomics(user28ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User28.setExamTechnologyDevelopingProtectingDatabasesDynamic(user28ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User28.setQualificationExam(user28QualificationExam);
            specialGrade_IS_1_1Course3Semester2User28.setEducationalPractice(user28EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User28.setProductionPractice(user28ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course3Semester2> user29Row = specialGradeIs11Course3Semester2Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User29 = user29Row.get();
            specialGrade_IS_1_1Course3Semester2User29.setUsername(user29Username);
            specialGrade_IS_1_1Course3Semester2User29.setDifOffsetEnglishLanguage(user29DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User29.setDifOffsetDevelopmentSoftwareModules(user29DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User29.setDifOffsetSupportTestingSoftwareModules(user29DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User29.setOffsetPhysicalTraining(user29OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User29.setExamIndustryEconomics(user29ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User29.setExamTechnologyDevelopingProtectingDatabasesDynamic(user29ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User29.setQualificationExam(user29QualificationExam);
            specialGrade_IS_1_1Course3Semester2User29.setEducationalPractice(user29EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User29.setProductionPractice(user29ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course3Semester2> user30Row = specialGradeIs11Course3Semester2Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User30 = user30Row.get();
            specialGrade_IS_1_1Course3Semester2User30.setUsername(user30Username);
            specialGrade_IS_1_1Course3Semester2User30.setDifOffsetEnglishLanguage(user30DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User30.setDifOffsetDevelopmentSoftwareModules(user30DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User30.setDifOffsetSupportTestingSoftwareModules(user30DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User30.setOffsetPhysicalTraining(user30OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User30.setExamIndustryEconomics(user30ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User30.setExamTechnologyDevelopingProtectingDatabasesDynamic(user30ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User30.setQualificationExam(user30QualificationExam);
            specialGrade_IS_1_1Course3Semester2User30.setEducationalPractice(user30EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User30.setProductionPractice(user30ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course3Semester2> user31Row = specialGradeIs11Course3Semester2Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User31 = user31Row.get();
            specialGrade_IS_1_1Course3Semester2User31.setUsername(user31Username);
            specialGrade_IS_1_1Course3Semester2User31.setDifOffsetEnglishLanguage(user31DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User31.setDifOffsetDevelopmentSoftwareModules(user31DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User31.setDifOffsetSupportTestingSoftwareModules(user31DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User31.setOffsetPhysicalTraining(user31OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User31.setExamIndustryEconomics(user31ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User31.setExamTechnologyDevelopingProtectingDatabasesDynamic(user31ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User31.setQualificationExam(user31QualificationExam);
            specialGrade_IS_1_1Course3Semester2User31.setEducationalPractice(user31EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User31.setProductionPractice(user31ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course3Semester2> user32Row = specialGradeIs11Course3Semester2Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User32 = user32Row.get();
            specialGrade_IS_1_1Course3Semester2User32.setUsername(user32Username);
            specialGrade_IS_1_1Course3Semester2User32.setDifOffsetEnglishLanguage(user32DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User32.setDifOffsetDevelopmentSoftwareModules(user32DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User32.setDifOffsetSupportTestingSoftwareModules(user32DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User32.setOffsetPhysicalTraining(user32OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User32.setExamIndustryEconomics(user32ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User32.setExamTechnologyDevelopingProtectingDatabasesDynamic(user32ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User32.setQualificationExam(user32QualificationExam);
            specialGrade_IS_1_1Course3Semester2User32.setEducationalPractice(user32EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User32.setProductionPractice(user32ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course3Semester2> user33Row = specialGradeIs11Course3Semester2Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User33 = user33Row.get();
            specialGrade_IS_1_1Course3Semester2User33.setUsername(user33Username);
            specialGrade_IS_1_1Course3Semester2User33.setDifOffsetEnglishLanguage(user33DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User33.setDifOffsetDevelopmentSoftwareModules(user33DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User33.setDifOffsetSupportTestingSoftwareModules(user33DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User33.setOffsetPhysicalTraining(user33OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User33.setExamIndustryEconomics(user33ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User33.setExamTechnologyDevelopingProtectingDatabasesDynamic(user33ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User33.setQualificationExam(user33QualificationExam);
            specialGrade_IS_1_1Course3Semester2User33.setEducationalPractice(user33EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User33.setProductionPractice(user33ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course3Semester2> user34Row = specialGradeIs11Course3Semester2Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User34 = user34Row.get();
            specialGrade_IS_1_1Course3Semester2User34.setUsername(user34Username);
            specialGrade_IS_1_1Course3Semester2User34.setDifOffsetEnglishLanguage(user34DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User34.setDifOffsetDevelopmentSoftwareModules(user34DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User34.setDifOffsetSupportTestingSoftwareModules(user34DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User34.setOffsetPhysicalTraining(user34OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User34.setExamIndustryEconomics(user34ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User34.setExamTechnologyDevelopingProtectingDatabasesDynamic(user34ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User34.setQualificationExam(user34QualificationExam);
            specialGrade_IS_1_1Course3Semester2User34.setEducationalPractice(user34EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User34.setProductionPractice(user34ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course3Semester2> user35Row = specialGradeIs11Course3Semester2Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User35 = user35Row.get();
            specialGrade_IS_1_1Course3Semester2User35.setUsername(user35Username);
            specialGrade_IS_1_1Course3Semester2User35.setDifOffsetEnglishLanguage(user35DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User35.setDifOffsetDevelopmentSoftwareModules(user35DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User35.setDifOffsetSupportTestingSoftwareModules(user35DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User35.setOffsetPhysicalTraining(user35OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User35.setExamIndustryEconomics(user35ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User35.setExamTechnologyDevelopingProtectingDatabasesDynamic(user35ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User35.setQualificationExam(user35QualificationExam);
            specialGrade_IS_1_1Course3Semester2User35.setEducationalPractice(user35EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User35.setProductionPractice(user35ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course3Semester2> user36Row = specialGradeIs11Course3Semester2Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User36 = user36Row.get();
            specialGrade_IS_1_1Course3Semester2User36.setUsername(user36Username);
            specialGrade_IS_1_1Course3Semester2User36.setDifOffsetEnglishLanguage(user36DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User36.setDifOffsetDevelopmentSoftwareModules(user36DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User36.setDifOffsetSupportTestingSoftwareModules(user36DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User36.setOffsetPhysicalTraining(user36OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User36.setExamIndustryEconomics(user36ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User36.setExamTechnologyDevelopingProtectingDatabasesDynamic(user36ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User36.setQualificationExam(user36QualificationExam);
            specialGrade_IS_1_1Course3Semester2User36.setEducationalPractice(user36EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User36.setProductionPractice(user36ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course3Semester2> user37Row = specialGradeIs11Course3Semester2Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User37 = user37Row.get();
            specialGrade_IS_1_1Course3Semester2User37.setUsername(user37Username);
            specialGrade_IS_1_1Course3Semester2User37.setDifOffsetEnglishLanguage(user37DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User37.setDifOffsetDevelopmentSoftwareModules(user37DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User37.setDifOffsetSupportTestingSoftwareModules(user37DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User37.setOffsetPhysicalTraining(user37OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User37.setExamIndustryEconomics(user37ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User37.setExamTechnologyDevelopingProtectingDatabasesDynamic(user37ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User37.setQualificationExam(user37QualificationExam);
            specialGrade_IS_1_1Course3Semester2User37.setEducationalPractice(user37EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User37.setProductionPractice(user37ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course3Semester2> user38Row = specialGradeIs11Course3Semester2Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User38 = user38Row.get();
            specialGrade_IS_1_1Course3Semester2User38.setUsername(user38Username);
            specialGrade_IS_1_1Course3Semester2User38.setDifOffsetEnglishLanguage(user38DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User38.setDifOffsetDevelopmentSoftwareModules(user38DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User38.setDifOffsetSupportTestingSoftwareModules(user38DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User38.setOffsetPhysicalTraining(user38OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User38.setExamIndustryEconomics(user38ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User38.setExamTechnologyDevelopingProtectingDatabasesDynamic(user38ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User38.setQualificationExam(user38QualificationExam);
            specialGrade_IS_1_1Course3Semester2User38.setEducationalPractice(user38EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User38.setProductionPractice(user38ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course3Semester2> user39Row = specialGradeIs11Course3Semester2Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User39 = user39Row.get();
            specialGrade_IS_1_1Course3Semester2User39.setUsername(user39Username);
            specialGrade_IS_1_1Course3Semester2User39.setDifOffsetEnglishLanguage(user39DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User39.setDifOffsetDevelopmentSoftwareModules(user39DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User39.setDifOffsetSupportTestingSoftwareModules(user39DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User39.setOffsetPhysicalTraining(user39OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User39.setExamIndustryEconomics(user39ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User39.setExamTechnologyDevelopingProtectingDatabasesDynamic(user39ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User39.setQualificationExam(user39QualificationExam);
            specialGrade_IS_1_1Course3Semester2User39.setEducationalPractice(user39EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User39.setProductionPractice(user39ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course3Semester2> user40Row = specialGradeIs11Course3Semester2Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course3Semester2 specialGrade_IS_1_1Course3Semester2User40 = user40Row.get();
            specialGrade_IS_1_1Course3Semester2User40.setUsername(user40Username);
            specialGrade_IS_1_1Course3Semester2User40.setDifOffsetEnglishLanguage(user40DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course3Semester2User40.setDifOffsetDevelopmentSoftwareModules(user40DifOffsetDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User40.setDifOffsetSupportTestingSoftwareModules(user40DifOffsetSupportTestingSoftwareModules);
            specialGrade_IS_1_1Course3Semester2User40.setOffsetPhysicalTraining(user40OffsetPhysicalTraining);
            specialGrade_IS_1_1Course3Semester2User40.setExamIndustryEconomics(user40ExamIndustryEconomics);
            specialGrade_IS_1_1Course3Semester2User40.setExamTechnologyDevelopingProtectingDatabasesDynamic(user40ExamTechnologyDevelopingProtectingDatabasesDynamic);
            specialGrade_IS_1_1Course3Semester2User40.setQualificationExam(user40QualificationExam);
            specialGrade_IS_1_1Course3Semester2User40.setEducationalPractice(user40EducationalPractice);
            specialGrade_IS_1_1Course3Semester2User40.setProductionPractice(user40ProductionPractice);
            specialGradeIs11Course3Semester2Repository.save(specialGrade_IS_1_1Course3Semester2User40);
        } catch (Exception ignore) {

        }
    }
}
