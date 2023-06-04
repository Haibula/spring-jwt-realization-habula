package com.example.demoauth.service.moderatorService.moderator_is1Service.course2;

import com.example.demoauth.models.grade_is1.models.course2.SpecialGrade_IS_1_1Course2Semester2;
import com.example.demoauth.repository.is1Repository.course2.SpecialGrade_IS_1_1Course2Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course2Semester2 {
    @Autowired
    SpecialGrade_IS_1_1Course2Semester2Repository specialGradeIs11Course2Semester2Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse2Semester2
    public void getMappingModer_is_1_1SpecialGreadeСourse2Semester2(Model model) {
        List<SpecialGrade_IS_1_1Course2Semester2> res = specialGradeIs11Course2Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course2Semester2::getUserID));
        List<SpecialGrade_IS_1_1Course2Semester2> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course2Semester2());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse2Semester2
    public void postMappingModer_is_1_1SpecialGreadeСourse2Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetProbabilityTheory = splitUser1Grades[3];
            String user1DifOffsetHardwareArchitecture = splitUser1Grades[4];
            String user1DifOffsetInformationTechnology = splitUser1Grades[5];
            String user1DifOffsetDatabaseDesignFundamentals = splitUser1Grades[6];
            String user1DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser1Grades[7];
            String user1OffsetPhysicalTraining = splitUser1Grades[8];
            String user1ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser1Grades[9];
            String user1ExamImplementationAndSupportOfComputerSystems = splitUser1Grades[10];
            String user1QualificationExam = splitUser1Grades[11];
            String user1EducationalPractice = splitUser1Grades[12];
            String user1ProductionPractice = splitUser1Grades[13];
            

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetEnglishLanguage = splitUser2Grades[2];
            String user2DifOffsetProbabilityTheory = splitUser2Grades[3];
            String user2DifOffsetHardwareArchitecture = splitUser2Grades[4];
            String user2DifOffsetInformationTechnology = splitUser2Grades[5];
            String user2DifOffsetDatabaseDesignFundamentals = splitUser2Grades[6];
            String user2DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser2Grades[7];
            String user2OffsetPhysicalTraining = splitUser2Grades[8];
            String user2ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser2Grades[9];
            String user2ExamImplementationAndSupportOfComputerSystems = splitUser2Grades[10];
            String user2QualificationExam = splitUser2Grades[11];
            String user2EducationalPractice = splitUser2Grades[12];
            String user2ProductionPractice = splitUser2Grades[13];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetEnglishLanguage = splitUser3Grades[2];
            String user3DifOffsetProbabilityTheory = splitUser3Grades[3];
            String user3DifOffsetHardwareArchitecture = splitUser3Grades[4];
            String user3DifOffsetInformationTechnology = splitUser3Grades[5];
            String user3DifOffsetDatabaseDesignFundamentals = splitUser3Grades[6];
            String user3DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser3Grades[7];
            String user3OffsetPhysicalTraining = splitUser3Grades[8];
            String user3ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser3Grades[9];
            String user3ExamImplementationAndSupportOfComputerSystems = splitUser3Grades[10];
            String user3QualificationExam = splitUser3Grades[11];
            String user3EducationalPractice = splitUser3Grades[12];
            String user3ProductionPractice = splitUser3Grades[13];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetEnglishLanguage = splitUser4Grades[2];
            String user4DifOffsetProbabilityTheory = splitUser4Grades[3];
            String user4DifOffsetHardwareArchitecture = splitUser4Grades[4];
            String user4DifOffsetInformationTechnology = splitUser4Grades[5];
            String user4DifOffsetDatabaseDesignFundamentals = splitUser4Grades[6];
            String user4DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser4Grades[7];
            String user4OffsetPhysicalTraining = splitUser4Grades[8];
            String user4ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser4Grades[9];
            String user4ExamImplementationAndSupportOfComputerSystems = splitUser4Grades[10];
            String user4QualificationExam = splitUser4Grades[11];
            String user4EducationalPractice = splitUser4Grades[12];
            String user4ProductionPractice = splitUser4Grades[13];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetEnglishLanguage = splitUser5Grades[2];
            String user5DifOffsetProbabilityTheory = splitUser5Grades[3];
            String user5DifOffsetHardwareArchitecture = splitUser5Grades[4];
            String user5DifOffsetInformationTechnology = splitUser5Grades[5];
            String user5DifOffsetDatabaseDesignFundamentals = splitUser5Grades[6];
            String user5DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser5Grades[7];
            String user5OffsetPhysicalTraining = splitUser5Grades[8];
            String user5ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser5Grades[9];
            String user5ExamImplementationAndSupportOfComputerSystems = splitUser5Grades[10];
            String user5QualificationExam = splitUser5Grades[11];
            String user5EducationalPractice = splitUser5Grades[12];
            String user5ProductionPractice = splitUser5Grades[13];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetEnglishLanguage = splitUser6Grades[2];
            String user6DifOffsetProbabilityTheory = splitUser6Grades[3];
            String user6DifOffsetHardwareArchitecture = splitUser6Grades[4];
            String user6DifOffsetInformationTechnology = splitUser6Grades[5];
            String user6DifOffsetDatabaseDesignFundamentals = splitUser6Grades[6];
            String user6DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser6Grades[7];
            String user6OffsetPhysicalTraining = splitUser6Grades[8];
            String user6ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser6Grades[9];
            String user6ExamImplementationAndSupportOfComputerSystems = splitUser6Grades[10];
            String user6QualificationExam = splitUser6Grades[11];
            String user6EducationalPractice = splitUser6Grades[12];
            String user6ProductionPractice = splitUser6Grades[13];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetEnglishLanguage = splitUser7Grades[2];
            String user7DifOffsetProbabilityTheory = splitUser7Grades[3];
            String user7DifOffsetHardwareArchitecture = splitUser7Grades[4];
            String user7DifOffsetInformationTechnology = splitUser7Grades[5];
            String user7DifOffsetDatabaseDesignFundamentals = splitUser7Grades[6];
            String user7DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser7Grades[7];
            String user7OffsetPhysicalTraining = splitUser7Grades[8];
            String user7ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser7Grades[9];
            String user7ExamImplementationAndSupportOfComputerSystems = splitUser7Grades[10];
            String user7QualificationExam = splitUser7Grades[11];
            String user7EducationalPractice = splitUser7Grades[12];
            String user7ProductionPractice = splitUser7Grades[13];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetEnglishLanguage = splitUser8Grades[2];
            String user8DifOffsetProbabilityTheory = splitUser8Grades[3];
            String user8DifOffsetHardwareArchitecture = splitUser8Grades[4];
            String user8DifOffsetInformationTechnology = splitUser8Grades[5];
            String user8DifOffsetDatabaseDesignFundamentals = splitUser8Grades[6];
            String user8DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser8Grades[7];
            String user8OffsetPhysicalTraining = splitUser8Grades[8];
            String user8ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser8Grades[9];
            String user8ExamImplementationAndSupportOfComputerSystems = splitUser8Grades[10];
            String user8QualificationExam = splitUser8Grades[11];
            String user8EducationalPractice = splitUser8Grades[12];
            String user8ProductionPractice = splitUser8Grades[13];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetEnglishLanguage = splitUser9Grades[2];
            String user9DifOffsetProbabilityTheory = splitUser9Grades[3];
            String user9DifOffsetHardwareArchitecture = splitUser9Grades[4];
            String user9DifOffsetInformationTechnology = splitUser9Grades[5];
            String user9DifOffsetDatabaseDesignFundamentals = splitUser9Grades[6];
            String user9DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser9Grades[7];
            String user9OffsetPhysicalTraining = splitUser9Grades[8];
            String user9ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser9Grades[9];
            String user9ExamImplementationAndSupportOfComputerSystems = splitUser9Grades[10];
            String user9QualificationExam = splitUser9Grades[11];
            String user9EducationalPractice = splitUser9Grades[12];
            String user9ProductionPractice = splitUser9Grades[13];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetEnglishLanguage = splitUser10Grades[2];
            String user10DifOffsetProbabilityTheory = splitUser10Grades[3];
            String user10DifOffsetHardwareArchitecture = splitUser10Grades[4];
            String user10DifOffsetInformationTechnology = splitUser10Grades[5];
            String user10DifOffsetDatabaseDesignFundamentals = splitUser10Grades[6];
            String user10DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser10Grades[7];
            String user10OffsetPhysicalTraining = splitUser10Grades[8];
            String user10ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser10Grades[9];
            String user10ExamImplementationAndSupportOfComputerSystems = splitUser10Grades[10];
            String user10QualificationExam = splitUser10Grades[11];
            String user10EducationalPractice = splitUser10Grades[12];
            String user10ProductionPractice = splitUser10Grades[13];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetEnglishLanguage = splitUser11Grades[2];
            String user11DifOffsetProbabilityTheory = splitUser11Grades[3];
            String user11DifOffsetHardwareArchitecture = splitUser11Grades[4];
            String user11DifOffsetInformationTechnology = splitUser11Grades[5];
            String user11DifOffsetDatabaseDesignFundamentals = splitUser11Grades[6];
            String user11DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser11Grades[7];
            String user11OffsetPhysicalTraining = splitUser11Grades[8];
            String user11ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser11Grades[9];
            String user11ExamImplementationAndSupportOfComputerSystems = splitUser11Grades[10];
            String user11QualificationExam = splitUser11Grades[11];
            String user11EducationalPractice = splitUser11Grades[12];
            String user11ProductionPractice = splitUser11Grades[13];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetEnglishLanguage = splitUser12Grades[2];
            String user12DifOffsetProbabilityTheory = splitUser12Grades[3];
            String user12DifOffsetHardwareArchitecture = splitUser12Grades[4];
            String user12DifOffsetInformationTechnology = splitUser12Grades[5];
            String user12DifOffsetDatabaseDesignFundamentals = splitUser12Grades[6];
            String user12DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser12Grades[7];
            String user12OffsetPhysicalTraining = splitUser12Grades[8];
            String user12ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser12Grades[9];
            String user12ExamImplementationAndSupportOfComputerSystems = splitUser12Grades[10];
            String user12QualificationExam = splitUser12Grades[11];
            String user12EducationalPractice = splitUser12Grades[12];
            String user12ProductionPractice = splitUser12Grades[13];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetEnglishLanguage = splitUser13Grades[2];
            String user13DifOffsetProbabilityTheory = splitUser13Grades[3];
            String user13DifOffsetHardwareArchitecture = splitUser13Grades[4];
            String user13DifOffsetInformationTechnology = splitUser13Grades[5];
            String user13DifOffsetDatabaseDesignFundamentals = splitUser13Grades[6];
            String user13DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser13Grades[7];
            String user13OffsetPhysicalTraining = splitUser13Grades[8];
            String user13ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser13Grades[9];
            String user13ExamImplementationAndSupportOfComputerSystems = splitUser13Grades[10];
            String user13QualificationExam = splitUser13Grades[11];
            String user13EducationalPractice = splitUser13Grades[12];
            String user13ProductionPractice = splitUser13Grades[13];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetEnglishLanguage = splitUser14Grades[2];
            String user14DifOffsetProbabilityTheory = splitUser14Grades[3];
            String user14DifOffsetHardwareArchitecture = splitUser14Grades[4];
            String user14DifOffsetInformationTechnology = splitUser14Grades[5];
            String user14DifOffsetDatabaseDesignFundamentals = splitUser14Grades[6];
            String user14DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser14Grades[7];
            String user14OffsetPhysicalTraining = splitUser14Grades[8];
            String user14ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser14Grades[9];
            String user14ExamImplementationAndSupportOfComputerSystems = splitUser14Grades[10];
            String user14QualificationExam = splitUser14Grades[11];
            String user14EducationalPractice = splitUser14Grades[12];
            String user14ProductionPractice = splitUser14Grades[13];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetEnglishLanguage = splitUser15Grades[2];
            String user15DifOffsetProbabilityTheory = splitUser15Grades[3];
            String user15DifOffsetHardwareArchitecture = splitUser15Grades[4];
            String user15DifOffsetInformationTechnology = splitUser15Grades[5];
            String user15DifOffsetDatabaseDesignFundamentals = splitUser15Grades[6];
            String user15DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser15Grades[7];
            String user15OffsetPhysicalTraining = splitUser15Grades[8];
            String user15ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser15Grades[9];
            String user15ExamImplementationAndSupportOfComputerSystems = splitUser15Grades[10];
            String user15QualificationExam = splitUser15Grades[11];
            String user15EducationalPractice = splitUser15Grades[12];
            String user15ProductionPractice = splitUser15Grades[13];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetEnglishLanguage = splitUser16Grades[2];
            String user16DifOffsetProbabilityTheory = splitUser16Grades[3];
            String user16DifOffsetHardwareArchitecture = splitUser16Grades[4];
            String user16DifOffsetInformationTechnology = splitUser16Grades[5];
            String user16DifOffsetDatabaseDesignFundamentals = splitUser16Grades[6];
            String user16DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser16Grades[7];
            String user16OffsetPhysicalTraining = splitUser16Grades[8];
            String user16ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser16Grades[9];
            String user16ExamImplementationAndSupportOfComputerSystems = splitUser16Grades[10];
            String user16QualificationExam = splitUser16Grades[11];
            String user16EducationalPractice = splitUser16Grades[12];
            String user16ProductionPractice = splitUser16Grades[13];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetEnglishLanguage = splitUser17Grades[2];
            String user17DifOffsetProbabilityTheory = splitUser17Grades[3];
            String user17DifOffsetHardwareArchitecture = splitUser17Grades[4];
            String user17DifOffsetInformationTechnology = splitUser17Grades[5];
            String user17DifOffsetDatabaseDesignFundamentals = splitUser17Grades[6];
            String user17DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser17Grades[7];
            String user17OffsetPhysicalTraining = splitUser17Grades[8];
            String user17ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser17Grades[9];
            String user17ExamImplementationAndSupportOfComputerSystems = splitUser17Grades[10];
            String user17QualificationExam = splitUser17Grades[11];
            String user17EducationalPractice = splitUser17Grades[12];
            String user17ProductionPractice = splitUser17Grades[13];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetEnglishLanguage = splitUser18Grades[2];
            String user18DifOffsetProbabilityTheory = splitUser18Grades[3];
            String user18DifOffsetHardwareArchitecture = splitUser18Grades[4];
            String user18DifOffsetInformationTechnology = splitUser18Grades[5];
            String user18DifOffsetDatabaseDesignFundamentals = splitUser18Grades[6];
            String user18DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser18Grades[7];
            String user18OffsetPhysicalTraining = splitUser18Grades[8];
            String user18ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser18Grades[9];
            String user18ExamImplementationAndSupportOfComputerSystems = splitUser18Grades[10];
            String user18QualificationExam = splitUser18Grades[11];
            String user18EducationalPractice = splitUser18Grades[12];
            String user18ProductionPractice = splitUser18Grades[13];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetEnglishLanguage = splitUser19Grades[2];
            String user19DifOffsetProbabilityTheory = splitUser19Grades[3];
            String user19DifOffsetHardwareArchitecture = splitUser19Grades[4];
            String user19DifOffsetInformationTechnology = splitUser19Grades[5];
            String user19DifOffsetDatabaseDesignFundamentals = splitUser19Grades[6];
            String user19DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser19Grades[7];
            String user19OffsetPhysicalTraining = splitUser19Grades[8];
            String user19ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser19Grades[9];
            String user19ExamImplementationAndSupportOfComputerSystems = splitUser19Grades[10];
            String user19QualificationExam = splitUser19Grades[11];
            String user19EducationalPractice = splitUser19Grades[12];
            String user19ProductionPractice = splitUser19Grades[13];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetEnglishLanguage = splitUser20Grades[2];
            String user20DifOffsetProbabilityTheory = splitUser20Grades[3];
            String user20DifOffsetHardwareArchitecture = splitUser20Grades[4];
            String user20DifOffsetInformationTechnology = splitUser20Grades[5];
            String user20DifOffsetDatabaseDesignFundamentals = splitUser20Grades[6];
            String user20DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser20Grades[7];
            String user20OffsetPhysicalTraining = splitUser20Grades[8];
            String user20ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser20Grades[9];
            String user20ExamImplementationAndSupportOfComputerSystems = splitUser20Grades[10];
            String user20QualificationExam = splitUser20Grades[11];
            String user20EducationalPractice = splitUser20Grades[12];
            String user20ProductionPractice = splitUser20Grades[13];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetEnglishLanguage = splitUser21Grades[2];
            String user21DifOffsetProbabilityTheory = splitUser21Grades[3];
            String user21DifOffsetHardwareArchitecture = splitUser21Grades[4];
            String user21DifOffsetInformationTechnology = splitUser21Grades[5];
            String user21DifOffsetDatabaseDesignFundamentals = splitUser21Grades[6];
            String user21DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser21Grades[7];
            String user21OffsetPhysicalTraining = splitUser21Grades[8];
            String user21ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser21Grades[9];
            String user21ExamImplementationAndSupportOfComputerSystems = splitUser21Grades[10];
            String user21QualificationExam = splitUser21Grades[11];
            String user21EducationalPractice = splitUser21Grades[12];
            String user21ProductionPractice = splitUser21Grades[13];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetEnglishLanguage = splitUser22Grades[2];
            String user22DifOffsetProbabilityTheory = splitUser22Grades[3];
            String user22DifOffsetHardwareArchitecture = splitUser22Grades[4];
            String user22DifOffsetInformationTechnology = splitUser22Grades[5];
            String user22DifOffsetDatabaseDesignFundamentals = splitUser22Grades[6];
            String user22DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser22Grades[7];
            String user22OffsetPhysicalTraining = splitUser22Grades[8];
            String user22ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser22Grades[9];
            String user22ExamImplementationAndSupportOfComputerSystems = splitUser22Grades[10];
            String user22QualificationExam = splitUser22Grades[11];
            String user22EducationalPractice = splitUser22Grades[12];
            String user22ProductionPractice = splitUser22Grades[13];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetEnglishLanguage = splitUser23Grades[2];
            String user23DifOffsetProbabilityTheory = splitUser23Grades[3];
            String user23DifOffsetHardwareArchitecture = splitUser23Grades[4];
            String user23DifOffsetInformationTechnology = splitUser23Grades[5];
            String user23DifOffsetDatabaseDesignFundamentals = splitUser23Grades[6];
            String user23DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser23Grades[7];
            String user23OffsetPhysicalTraining = splitUser23Grades[8];
            String user23ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser23Grades[9];
            String user23ExamImplementationAndSupportOfComputerSystems = splitUser23Grades[10];
            String user23QualificationExam = splitUser23Grades[11];
            String user23EducationalPractice = splitUser23Grades[12];
            String user23ProductionPractice = splitUser23Grades[13];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetEnglishLanguage = splitUser24Grades[2];
            String user24DifOffsetProbabilityTheory = splitUser24Grades[3];
            String user24DifOffsetHardwareArchitecture = splitUser24Grades[4];
            String user24DifOffsetInformationTechnology = splitUser24Grades[5];
            String user24DifOffsetDatabaseDesignFundamentals = splitUser24Grades[6];
            String user24DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser24Grades[7];
            String user24OffsetPhysicalTraining = splitUser24Grades[8];
            String user24ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser24Grades[9];
            String user24ExamImplementationAndSupportOfComputerSystems = splitUser24Grades[10];
            String user24QualificationExam = splitUser24Grades[11];
            String user24EducationalPractice = splitUser24Grades[12];
            String user24ProductionPractice = splitUser24Grades[13];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetEnglishLanguage = splitUser25Grades[2];
            String user25DifOffsetProbabilityTheory = splitUser25Grades[3];
            String user25DifOffsetHardwareArchitecture = splitUser25Grades[4];
            String user25DifOffsetInformationTechnology = splitUser25Grades[5];
            String user25DifOffsetDatabaseDesignFundamentals = splitUser25Grades[6];
            String user25DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser25Grades[7];
            String user25OffsetPhysicalTraining = splitUser25Grades[8];
            String user25ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser25Grades[9];
            String user25ExamImplementationAndSupportOfComputerSystems = splitUser25Grades[10];
            String user25QualificationExam = splitUser25Grades[11];
            String user25EducationalPractice = splitUser25Grades[12];
            String user25ProductionPractice = splitUser25Grades[13];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetEnglishLanguage = splitUser26Grades[2];
            String user26DifOffsetProbabilityTheory = splitUser26Grades[3];
            String user26DifOffsetHardwareArchitecture = splitUser26Grades[4];
            String user26DifOffsetInformationTechnology = splitUser26Grades[5];
            String user26DifOffsetDatabaseDesignFundamentals = splitUser26Grades[6];
            String user26DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser26Grades[7];
            String user26OffsetPhysicalTraining = splitUser26Grades[8];
            String user26ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser26Grades[9];
            String user26ExamImplementationAndSupportOfComputerSystems = splitUser26Grades[10];
            String user26QualificationExam = splitUser26Grades[11];
            String user26EducationalPractice = splitUser26Grades[12];
            String user26ProductionPractice = splitUser26Grades[13];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetEnglishLanguage = splitUser27Grades[2];
            String user27DifOffsetProbabilityTheory = splitUser27Grades[3];
            String user27DifOffsetHardwareArchitecture = splitUser27Grades[4];
            String user27DifOffsetInformationTechnology = splitUser27Grades[5];
            String user27DifOffsetDatabaseDesignFundamentals = splitUser27Grades[6];
            String user27DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser27Grades[7];
            String user27OffsetPhysicalTraining = splitUser27Grades[8];
            String user27ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser27Grades[9];
            String user27ExamImplementationAndSupportOfComputerSystems = splitUser27Grades[10];
            String user27QualificationExam = splitUser27Grades[11];
            String user27EducationalPractice = splitUser27Grades[12];
            String user27ProductionPractice = splitUser27Grades[13];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetEnglishLanguage = splitUser28Grades[2];
            String user28DifOffsetProbabilityTheory = splitUser28Grades[3];
            String user28DifOffsetHardwareArchitecture = splitUser28Grades[4];
            String user28DifOffsetInformationTechnology = splitUser28Grades[5];
            String user28DifOffsetDatabaseDesignFundamentals = splitUser28Grades[6];
            String user28DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser28Grades[7];
            String user28OffsetPhysicalTraining = splitUser28Grades[8];
            String user28ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser28Grades[9];
            String user28ExamImplementationAndSupportOfComputerSystems = splitUser28Grades[10];
            String user28QualificationExam = splitUser28Grades[11];
            String user28EducationalPractice = splitUser28Grades[12];
            String user28ProductionPractice = splitUser28Grades[13];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetEnglishLanguage = splitUser29Grades[2];
            String user29DifOffsetProbabilityTheory = splitUser29Grades[3];
            String user29DifOffsetHardwareArchitecture = splitUser29Grades[4];
            String user29DifOffsetInformationTechnology = splitUser29Grades[5];
            String user29DifOffsetDatabaseDesignFundamentals = splitUser29Grades[6];
            String user29DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser29Grades[7];
            String user29OffsetPhysicalTraining = splitUser29Grades[8];
            String user29ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser29Grades[9];
            String user29ExamImplementationAndSupportOfComputerSystems = splitUser29Grades[10];
            String user29QualificationExam = splitUser29Grades[11];
            String user29EducationalPractice = splitUser29Grades[12];
            String user29ProductionPractice = splitUser29Grades[13];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetEnglishLanguage = splitUser30Grades[2];
            String user30DifOffsetProbabilityTheory = splitUser30Grades[3];
            String user30DifOffsetHardwareArchitecture = splitUser30Grades[4];
            String user30DifOffsetInformationTechnology = splitUser30Grades[5];
            String user30DifOffsetDatabaseDesignFundamentals = splitUser30Grades[6];
            String user30DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser30Grades[7];
            String user30OffsetPhysicalTraining = splitUser30Grades[8];
            String user30ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser30Grades[9];
            String user30ExamImplementationAndSupportOfComputerSystems = splitUser30Grades[10];
            String user30QualificationExam = splitUser30Grades[11];
            String user30EducationalPractice = splitUser30Grades[12];
            String user30ProductionPractice = splitUser30Grades[13];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetEnglishLanguage = splitUser31Grades[2];
            String user31DifOffsetProbabilityTheory = splitUser31Grades[3];
            String user31DifOffsetHardwareArchitecture = splitUser31Grades[4];
            String user31DifOffsetInformationTechnology = splitUser31Grades[5];
            String user31DifOffsetDatabaseDesignFundamentals = splitUser31Grades[6];
            String user31DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser31Grades[7];
            String user31OffsetPhysicalTraining = splitUser31Grades[8];
            String user31ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser31Grades[9];
            String user31ExamImplementationAndSupportOfComputerSystems = splitUser31Grades[10];
            String user31QualificationExam = splitUser31Grades[11];
            String user31EducationalPractice = splitUser31Grades[12];
            String user31ProductionPractice = splitUser31Grades[13];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetEnglishLanguage = splitUser32Grades[2];
            String user32DifOffsetProbabilityTheory = splitUser32Grades[3];
            String user32DifOffsetHardwareArchitecture = splitUser32Grades[4];
            String user32DifOffsetInformationTechnology = splitUser32Grades[5];
            String user32DifOffsetDatabaseDesignFundamentals = splitUser32Grades[6];
            String user32DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser32Grades[7];
            String user32OffsetPhysicalTraining = splitUser32Grades[8];
            String user32ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser32Grades[9];
            String user32ExamImplementationAndSupportOfComputerSystems = splitUser32Grades[10];
            String user32QualificationExam = splitUser32Grades[11];
            String user32EducationalPractice = splitUser32Grades[12];
            String user32ProductionPractice = splitUser32Grades[13];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetEnglishLanguage = splitUser33Grades[2];
            String user33DifOffsetProbabilityTheory = splitUser33Grades[3];
            String user33DifOffsetHardwareArchitecture = splitUser33Grades[4];
            String user33DifOffsetInformationTechnology = splitUser33Grades[5];
            String user33DifOffsetDatabaseDesignFundamentals = splitUser33Grades[6];
            String user33DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser33Grades[7];
            String user33OffsetPhysicalTraining = splitUser33Grades[8];
            String user33ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser33Grades[9];
            String user33ExamImplementationAndSupportOfComputerSystems = splitUser33Grades[10];
            String user33QualificationExam = splitUser33Grades[11];
            String user33EducationalPractice = splitUser33Grades[12];
            String user33ProductionPractice = splitUser33Grades[13];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetEnglishLanguage = splitUser34Grades[2];
            String user34DifOffsetProbabilityTheory = splitUser34Grades[3];
            String user34DifOffsetHardwareArchitecture = splitUser34Grades[4];
            String user34DifOffsetInformationTechnology = splitUser34Grades[5];
            String user34DifOffsetDatabaseDesignFundamentals = splitUser34Grades[6];
            String user34DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser34Grades[7];
            String user34OffsetPhysicalTraining = splitUser34Grades[8];
            String user34ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser34Grades[9];
            String user34ExamImplementationAndSupportOfComputerSystems = splitUser34Grades[10];
            String user34QualificationExam = splitUser34Grades[11];
            String user34EducationalPractice = splitUser34Grades[12];
            String user34ProductionPractice = splitUser34Grades[13];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetEnglishLanguage = splitUser35Grades[2];
            String user35DifOffsetProbabilityTheory = splitUser35Grades[3];
            String user35DifOffsetHardwareArchitecture = splitUser35Grades[4];
            String user35DifOffsetInformationTechnology = splitUser35Grades[5];
            String user35DifOffsetDatabaseDesignFundamentals = splitUser35Grades[6];
            String user35DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser35Grades[7];
            String user35OffsetPhysicalTraining = splitUser35Grades[8];
            String user35ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser35Grades[9];
            String user35ExamImplementationAndSupportOfComputerSystems = splitUser35Grades[10];
            String user35QualificationExam = splitUser35Grades[11];
            String user35EducationalPractice = splitUser35Grades[12];
            String user35ProductionPractice = splitUser35Grades[13];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetEnglishLanguage = splitUser36Grades[2];
            String user36DifOffsetProbabilityTheory = splitUser36Grades[3];
            String user36DifOffsetHardwareArchitecture = splitUser36Grades[4];
            String user36DifOffsetInformationTechnology = splitUser36Grades[5];
            String user36DifOffsetDatabaseDesignFundamentals = splitUser36Grades[6];
            String user36DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser36Grades[7];
            String user36OffsetPhysicalTraining = splitUser36Grades[8];
            String user36ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser36Grades[9];
            String user36ExamImplementationAndSupportOfComputerSystems = splitUser36Grades[10];
            String user36QualificationExam = splitUser36Grades[11];
            String user36EducationalPractice = splitUser36Grades[12];
            String user36ProductionPractice = splitUser36Grades[13];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetEnglishLanguage = splitUser37Grades[2];
            String user37DifOffsetProbabilityTheory = splitUser37Grades[3];
            String user37DifOffsetHardwareArchitecture = splitUser37Grades[4];
            String user37DifOffsetInformationTechnology = splitUser37Grades[5];
            String user37DifOffsetDatabaseDesignFundamentals = splitUser37Grades[6];
            String user37DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser37Grades[7];
            String user37OffsetPhysicalTraining = splitUser37Grades[8];
            String user37ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser37Grades[9];
            String user37ExamImplementationAndSupportOfComputerSystems = splitUser37Grades[10];
            String user37QualificationExam = splitUser37Grades[11];
            String user37EducationalPractice = splitUser37Grades[12];
            String user37ProductionPractice = splitUser37Grades[13];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetEnglishLanguage = splitUser38Grades[2];
            String user38DifOffsetProbabilityTheory = splitUser38Grades[3];
            String user38DifOffsetHardwareArchitecture = splitUser38Grades[4];
            String user38DifOffsetInformationTechnology = splitUser38Grades[5];
            String user38DifOffsetDatabaseDesignFundamentals = splitUser38Grades[6];
            String user38DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser38Grades[7];
            String user38OffsetPhysicalTraining = splitUser38Grades[8];
            String user38ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser38Grades[9];
            String user38ExamImplementationAndSupportOfComputerSystems = splitUser38Grades[10];
            String user38QualificationExam = splitUser38Grades[11];
            String user38EducationalPractice = splitUser38Grades[12];
            String user38ProductionPractice = splitUser38Grades[13];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetEnglishLanguage = splitUser39Grades[2];
            String user39DifOffsetProbabilityTheory = splitUser39Grades[3];
            String user39DifOffsetHardwareArchitecture = splitUser39Grades[4];
            String user39DifOffsetInformationTechnology = splitUser39Grades[5];
            String user39DifOffsetDatabaseDesignFundamentals = splitUser39Grades[6];
            String user39DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser39Grades[7];
            String user39OffsetPhysicalTraining = splitUser39Grades[8];
            String user39ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser39Grades[9];
            String user39ExamImplementationAndSupportOfComputerSystems = splitUser39Grades[10];
            String user39QualificationExam = splitUser39Grades[11];
            String user39EducationalPractice = splitUser39Grades[12];
            String user39ProductionPractice = splitUser39Grades[13];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetEnglishLanguage = splitUser40Grades[2];
            String user40DifOffsetProbabilityTheory = splitUser40Grades[3];
            String user40DifOffsetHardwareArchitecture = splitUser40Grades[4];
            String user40DifOffsetInformationTechnology = splitUser40Grades[5];
            String user40DifOffsetDatabaseDesignFundamentals = splitUser40Grades[6];
            String user40DifOffsetEnsuringAndQualityFunctioningComputerSystems = splitUser40Grades[7];
            String user40OffsetPhysicalTraining = splitUser40Grades[8];
            String user40ExamFundamentalsOfAlgorithmizationAndProgramming = splitUser40Grades[9];
            String user40ExamImplementationAndSupportOfComputerSystems = splitUser40Grades[10];
            String user40QualificationExam = splitUser40Grades[11];
            String user40EducationalPractice = splitUser40Grades[12];
            String user40ProductionPractice = splitUser40Grades[13];

            ArrayList<SpecialGrade_IS_1_1Course2Semester2> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user1Id, user1Username, user1DifOffsetEnglishLanguage, user1DifOffsetProbabilityTheory, user1DifOffsetHardwareArchitecture, user1DifOffsetInformationTechnology, user1DifOffsetDatabaseDesignFundamentals, user1DifOffsetEnsuringAndQualityFunctioningComputerSystems, user1OffsetPhysicalTraining, user1ExamFundamentalsOfAlgorithmizationAndProgramming, user1ExamImplementationAndSupportOfComputerSystems, user1QualificationExam, user1EducationalPractice, user1ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user2Id, user2Username, user2DifOffsetEnglishLanguage, user2DifOffsetProbabilityTheory, user2DifOffsetHardwareArchitecture, user2DifOffsetInformationTechnology, user2DifOffsetDatabaseDesignFundamentals, user2DifOffsetEnsuringAndQualityFunctioningComputerSystems, user2OffsetPhysicalTraining, user2ExamFundamentalsOfAlgorithmizationAndProgramming, user2ExamImplementationAndSupportOfComputerSystems, user2QualificationExam, user2EducationalPractice, user2ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user3Id, user3Username, user3DifOffsetEnglishLanguage, user3DifOffsetProbabilityTheory, user3DifOffsetHardwareArchitecture, user3DifOffsetInformationTechnology, user3DifOffsetDatabaseDesignFundamentals, user3DifOffsetEnsuringAndQualityFunctioningComputerSystems, user3OffsetPhysicalTraining, user3ExamFundamentalsOfAlgorithmizationAndProgramming, user3ExamImplementationAndSupportOfComputerSystems, user3QualificationExam, user3EducationalPractice, user3ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user4Id, user4Username, user4DifOffsetEnglishLanguage, user4DifOffsetProbabilityTheory, user4DifOffsetHardwareArchitecture, user4DifOffsetInformationTechnology, user4DifOffsetDatabaseDesignFundamentals, user4DifOffsetEnsuringAndQualityFunctioningComputerSystems, user4OffsetPhysicalTraining, user4ExamFundamentalsOfAlgorithmizationAndProgramming, user4ExamImplementationAndSupportOfComputerSystems, user4QualificationExam, user4EducationalPractice, user4ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user5Id, user5Username, user5DifOffsetEnglishLanguage, user5DifOffsetProbabilityTheory, user5DifOffsetHardwareArchitecture, user5DifOffsetInformationTechnology, user5DifOffsetDatabaseDesignFundamentals, user5DifOffsetEnsuringAndQualityFunctioningComputerSystems, user5OffsetPhysicalTraining, user5ExamFundamentalsOfAlgorithmizationAndProgramming, user5ExamImplementationAndSupportOfComputerSystems, user5QualificationExam, user5EducationalPractice, user5ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user6Id, user6Username, user6DifOffsetEnglishLanguage, user6DifOffsetProbabilityTheory, user6DifOffsetHardwareArchitecture, user6DifOffsetInformationTechnology, user6DifOffsetDatabaseDesignFundamentals, user6DifOffsetEnsuringAndQualityFunctioningComputerSystems, user6OffsetPhysicalTraining, user6ExamFundamentalsOfAlgorithmizationAndProgramming, user6ExamImplementationAndSupportOfComputerSystems, user6QualificationExam, user6EducationalPractice, user6ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user7Id, user7Username, user7DifOffsetEnglishLanguage, user7DifOffsetProbabilityTheory, user7DifOffsetHardwareArchitecture, user7DifOffsetInformationTechnology, user7DifOffsetDatabaseDesignFundamentals, user7DifOffsetEnsuringAndQualityFunctioningComputerSystems, user7OffsetPhysicalTraining, user7ExamFundamentalsOfAlgorithmizationAndProgramming, user7ExamImplementationAndSupportOfComputerSystems, user7QualificationExam, user7EducationalPractice, user7ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user8Id, user8Username, user8DifOffsetEnglishLanguage, user8DifOffsetProbabilityTheory, user8DifOffsetHardwareArchitecture, user8DifOffsetInformationTechnology, user8DifOffsetDatabaseDesignFundamentals, user8DifOffsetEnsuringAndQualityFunctioningComputerSystems, user8OffsetPhysicalTraining, user8ExamFundamentalsOfAlgorithmizationAndProgramming, user8ExamImplementationAndSupportOfComputerSystems, user8QualificationExam, user8EducationalPractice, user8ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user9Id, user9Username, user9DifOffsetEnglishLanguage, user9DifOffsetProbabilityTheory, user9DifOffsetHardwareArchitecture, user9DifOffsetInformationTechnology, user9DifOffsetDatabaseDesignFundamentals, user9DifOffsetEnsuringAndQualityFunctioningComputerSystems, user9OffsetPhysicalTraining, user9ExamFundamentalsOfAlgorithmizationAndProgramming, user9ExamImplementationAndSupportOfComputerSystems, user9QualificationExam, user9EducationalPractice, user9ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user10Id, user10Username, user10DifOffsetEnglishLanguage, user10DifOffsetProbabilityTheory, user10DifOffsetHardwareArchitecture, user10DifOffsetInformationTechnology, user10DifOffsetDatabaseDesignFundamentals, user10DifOffsetEnsuringAndQualityFunctioningComputerSystems, user10OffsetPhysicalTraining, user10ExamFundamentalsOfAlgorithmizationAndProgramming, user10ExamImplementationAndSupportOfComputerSystems, user10QualificationExam, user10EducationalPractice, user10ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user11Id, user11Username, user11DifOffsetEnglishLanguage, user11DifOffsetProbabilityTheory, user11DifOffsetHardwareArchitecture, user11DifOffsetInformationTechnology, user11DifOffsetDatabaseDesignFundamentals, user11DifOffsetEnsuringAndQualityFunctioningComputerSystems, user11OffsetPhysicalTraining, user11ExamFundamentalsOfAlgorithmizationAndProgramming, user11ExamImplementationAndSupportOfComputerSystems, user11QualificationExam, user11EducationalPractice, user11ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user12Id, user12Username, user12DifOffsetEnglishLanguage, user12DifOffsetProbabilityTheory, user12DifOffsetHardwareArchitecture, user12DifOffsetInformationTechnology, user12DifOffsetDatabaseDesignFundamentals, user12DifOffsetEnsuringAndQualityFunctioningComputerSystems, user12OffsetPhysicalTraining, user12ExamFundamentalsOfAlgorithmizationAndProgramming, user12ExamImplementationAndSupportOfComputerSystems, user12QualificationExam, user12EducationalPractice, user12ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user13Id, user13Username, user13DifOffsetEnglishLanguage, user13DifOffsetProbabilityTheory, user13DifOffsetHardwareArchitecture, user13DifOffsetInformationTechnology, user13DifOffsetDatabaseDesignFundamentals, user13DifOffsetEnsuringAndQualityFunctioningComputerSystems, user13OffsetPhysicalTraining, user13ExamFundamentalsOfAlgorithmizationAndProgramming, user13ExamImplementationAndSupportOfComputerSystems, user13QualificationExam, user13EducationalPractice, user13ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user14Id, user14Username, user14DifOffsetEnglishLanguage, user14DifOffsetProbabilityTheory, user14DifOffsetHardwareArchitecture, user14DifOffsetInformationTechnology, user14DifOffsetDatabaseDesignFundamentals, user14DifOffsetEnsuringAndQualityFunctioningComputerSystems, user14OffsetPhysicalTraining, user14ExamFundamentalsOfAlgorithmizationAndProgramming, user14ExamImplementationAndSupportOfComputerSystems, user14QualificationExam, user14EducationalPractice, user14ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user15Id, user15Username, user15DifOffsetEnglishLanguage, user15DifOffsetProbabilityTheory, user15DifOffsetHardwareArchitecture, user15DifOffsetInformationTechnology, user15DifOffsetDatabaseDesignFundamentals, user15DifOffsetEnsuringAndQualityFunctioningComputerSystems, user15OffsetPhysicalTraining, user15ExamFundamentalsOfAlgorithmizationAndProgramming, user15ExamImplementationAndSupportOfComputerSystems, user15QualificationExam, user15EducationalPractice, user15ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user16Id, user16Username, user16DifOffsetEnglishLanguage, user16DifOffsetProbabilityTheory, user16DifOffsetHardwareArchitecture, user16DifOffsetInformationTechnology, user16DifOffsetDatabaseDesignFundamentals, user16DifOffsetEnsuringAndQualityFunctioningComputerSystems, user16OffsetPhysicalTraining, user16ExamFundamentalsOfAlgorithmizationAndProgramming, user16ExamImplementationAndSupportOfComputerSystems, user16QualificationExam, user16EducationalPractice, user16ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user17Id, user17Username, user17DifOffsetEnglishLanguage, user17DifOffsetProbabilityTheory, user17DifOffsetHardwareArchitecture, user17DifOffsetInformationTechnology, user17DifOffsetDatabaseDesignFundamentals, user17DifOffsetEnsuringAndQualityFunctioningComputerSystems, user17OffsetPhysicalTraining, user17ExamFundamentalsOfAlgorithmizationAndProgramming, user17ExamImplementationAndSupportOfComputerSystems, user17QualificationExam, user17EducationalPractice, user17ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user18Id, user18Username, user18DifOffsetEnglishLanguage, user18DifOffsetProbabilityTheory, user18DifOffsetHardwareArchitecture, user18DifOffsetInformationTechnology, user18DifOffsetDatabaseDesignFundamentals, user18DifOffsetEnsuringAndQualityFunctioningComputerSystems, user18OffsetPhysicalTraining, user18ExamFundamentalsOfAlgorithmizationAndProgramming, user18ExamImplementationAndSupportOfComputerSystems, user18QualificationExam, user18EducationalPractice, user18ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user19Id, user19Username, user19DifOffsetEnglishLanguage, user19DifOffsetProbabilityTheory, user19DifOffsetHardwareArchitecture, user19DifOffsetInformationTechnology, user19DifOffsetDatabaseDesignFundamentals, user19DifOffsetEnsuringAndQualityFunctioningComputerSystems, user19OffsetPhysicalTraining, user19ExamFundamentalsOfAlgorithmizationAndProgramming, user19ExamImplementationAndSupportOfComputerSystems, user19QualificationExam, user19EducationalPractice, user19ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user20Id, user20Username, user20DifOffsetEnglishLanguage, user20DifOffsetProbabilityTheory, user20DifOffsetHardwareArchitecture, user20DifOffsetInformationTechnology, user20DifOffsetDatabaseDesignFundamentals, user20DifOffsetEnsuringAndQualityFunctioningComputerSystems, user20OffsetPhysicalTraining, user20ExamFundamentalsOfAlgorithmizationAndProgramming, user20ExamImplementationAndSupportOfComputerSystems, user20QualificationExam, user20EducationalPractice, user20ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user21Id, user21Username, user21DifOffsetEnglishLanguage, user21DifOffsetProbabilityTheory, user21DifOffsetHardwareArchitecture, user21DifOffsetInformationTechnology, user21DifOffsetDatabaseDesignFundamentals, user21DifOffsetEnsuringAndQualityFunctioningComputerSystems, user21OffsetPhysicalTraining, user21ExamFundamentalsOfAlgorithmizationAndProgramming, user21ExamImplementationAndSupportOfComputerSystems, user21QualificationExam, user21EducationalPractice, user21ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user22Id, user22Username, user22DifOffsetEnglishLanguage, user22DifOffsetProbabilityTheory, user22DifOffsetHardwareArchitecture, user22DifOffsetInformationTechnology, user22DifOffsetDatabaseDesignFundamentals, user22DifOffsetEnsuringAndQualityFunctioningComputerSystems, user22OffsetPhysicalTraining, user22ExamFundamentalsOfAlgorithmizationAndProgramming, user22ExamImplementationAndSupportOfComputerSystems, user22QualificationExam, user22EducationalPractice, user22ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user23Id, user23Username, user23DifOffsetEnglishLanguage, user23DifOffsetProbabilityTheory, user23DifOffsetHardwareArchitecture, user23DifOffsetInformationTechnology, user23DifOffsetDatabaseDesignFundamentals, user23DifOffsetEnsuringAndQualityFunctioningComputerSystems, user23OffsetPhysicalTraining, user23ExamFundamentalsOfAlgorithmizationAndProgramming, user23ExamImplementationAndSupportOfComputerSystems, user23QualificationExam, user23EducationalPractice, user23ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user24Id, user24Username, user24DifOffsetEnglishLanguage, user24DifOffsetProbabilityTheory, user24DifOffsetHardwareArchitecture, user24DifOffsetInformationTechnology, user24DifOffsetDatabaseDesignFundamentals, user24DifOffsetEnsuringAndQualityFunctioningComputerSystems, user24OffsetPhysicalTraining, user24ExamFundamentalsOfAlgorithmizationAndProgramming, user24ExamImplementationAndSupportOfComputerSystems, user24QualificationExam, user24EducationalPractice, user24ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user25Id, user25Username, user25DifOffsetEnglishLanguage, user25DifOffsetProbabilityTheory, user25DifOffsetHardwareArchitecture, user25DifOffsetInformationTechnology, user25DifOffsetDatabaseDesignFundamentals, user25DifOffsetEnsuringAndQualityFunctioningComputerSystems, user25OffsetPhysicalTraining, user25ExamFundamentalsOfAlgorithmizationAndProgramming, user25ExamImplementationAndSupportOfComputerSystems, user25QualificationExam, user25EducationalPractice, user25ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user26Id, user26Username, user26DifOffsetEnglishLanguage, user26DifOffsetProbabilityTheory, user26DifOffsetHardwareArchitecture, user26DifOffsetInformationTechnology, user26DifOffsetDatabaseDesignFundamentals, user26DifOffsetEnsuringAndQualityFunctioningComputerSystems, user26OffsetPhysicalTraining, user26ExamFundamentalsOfAlgorithmizationAndProgramming, user26ExamImplementationAndSupportOfComputerSystems, user26QualificationExam, user26EducationalPractice, user26ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user27Id, user27Username, user27DifOffsetEnglishLanguage, user27DifOffsetProbabilityTheory, user27DifOffsetHardwareArchitecture, user27DifOffsetInformationTechnology, user27DifOffsetDatabaseDesignFundamentals, user27DifOffsetEnsuringAndQualityFunctioningComputerSystems, user27OffsetPhysicalTraining, user27ExamFundamentalsOfAlgorithmizationAndProgramming, user27ExamImplementationAndSupportOfComputerSystems, user27QualificationExam, user27EducationalPractice, user27ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user28Id, user28Username, user28DifOffsetEnglishLanguage, user28DifOffsetProbabilityTheory, user28DifOffsetHardwareArchitecture, user28DifOffsetInformationTechnology, user28DifOffsetDatabaseDesignFundamentals, user28DifOffsetEnsuringAndQualityFunctioningComputerSystems, user28OffsetPhysicalTraining, user28ExamFundamentalsOfAlgorithmizationAndProgramming, user28ExamImplementationAndSupportOfComputerSystems, user28QualificationExam, user28EducationalPractice, user28ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user29Id, user29Username, user29DifOffsetEnglishLanguage, user29DifOffsetProbabilityTheory, user29DifOffsetHardwareArchitecture, user29DifOffsetInformationTechnology, user29DifOffsetDatabaseDesignFundamentals, user29DifOffsetEnsuringAndQualityFunctioningComputerSystems, user29OffsetPhysicalTraining, user29ExamFundamentalsOfAlgorithmizationAndProgramming, user29ExamImplementationAndSupportOfComputerSystems, user29QualificationExam, user29EducationalPractice, user29ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user30Id, user30Username, user30DifOffsetEnglishLanguage, user30DifOffsetProbabilityTheory, user30DifOffsetHardwareArchitecture, user30DifOffsetInformationTechnology, user30DifOffsetDatabaseDesignFundamentals, user30DifOffsetEnsuringAndQualityFunctioningComputerSystems, user30OffsetPhysicalTraining, user30ExamFundamentalsOfAlgorithmizationAndProgramming, user30ExamImplementationAndSupportOfComputerSystems, user30QualificationExam, user30EducationalPractice, user30ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user31Id, user31Username, user31DifOffsetEnglishLanguage, user31DifOffsetProbabilityTheory, user31DifOffsetHardwareArchitecture, user31DifOffsetInformationTechnology, user31DifOffsetDatabaseDesignFundamentals, user31DifOffsetEnsuringAndQualityFunctioningComputerSystems, user31OffsetPhysicalTraining, user31ExamFundamentalsOfAlgorithmizationAndProgramming, user31ExamImplementationAndSupportOfComputerSystems, user31QualificationExam, user31EducationalPractice, user31ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user32Id, user32Username, user32DifOffsetEnglishLanguage, user32DifOffsetProbabilityTheory, user32DifOffsetHardwareArchitecture, user32DifOffsetInformationTechnology, user32DifOffsetDatabaseDesignFundamentals, user32DifOffsetEnsuringAndQualityFunctioningComputerSystems, user32OffsetPhysicalTraining, user32ExamFundamentalsOfAlgorithmizationAndProgramming, user32ExamImplementationAndSupportOfComputerSystems, user32QualificationExam, user32EducationalPractice, user32ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user33Id, user33Username, user33DifOffsetEnglishLanguage, user33DifOffsetProbabilityTheory, user33DifOffsetHardwareArchitecture, user33DifOffsetInformationTechnology, user33DifOffsetDatabaseDesignFundamentals, user33DifOffsetEnsuringAndQualityFunctioningComputerSystems, user33OffsetPhysicalTraining, user33ExamFundamentalsOfAlgorithmizationAndProgramming, user33ExamImplementationAndSupportOfComputerSystems, user33QualificationExam, user33EducationalPractice, user33ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user34Id, user34Username, user34DifOffsetEnglishLanguage, user34DifOffsetProbabilityTheory, user34DifOffsetHardwareArchitecture, user34DifOffsetInformationTechnology, user34DifOffsetDatabaseDesignFundamentals, user34DifOffsetEnsuringAndQualityFunctioningComputerSystems, user34OffsetPhysicalTraining, user34ExamFundamentalsOfAlgorithmizationAndProgramming, user34ExamImplementationAndSupportOfComputerSystems, user34QualificationExam, user34EducationalPractice, user34ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user35Id, user35Username, user35DifOffsetEnglishLanguage, user35DifOffsetProbabilityTheory, user35DifOffsetHardwareArchitecture, user35DifOffsetInformationTechnology, user35DifOffsetDatabaseDesignFundamentals, user35DifOffsetEnsuringAndQualityFunctioningComputerSystems, user35OffsetPhysicalTraining, user35ExamFundamentalsOfAlgorithmizationAndProgramming, user35ExamImplementationAndSupportOfComputerSystems, user35QualificationExam, user35EducationalPractice, user35ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user36Id, user36Username, user36DifOffsetEnglishLanguage, user36DifOffsetProbabilityTheory, user36DifOffsetHardwareArchitecture, user36DifOffsetInformationTechnology, user36DifOffsetDatabaseDesignFundamentals, user36DifOffsetEnsuringAndQualityFunctioningComputerSystems, user36OffsetPhysicalTraining, user36ExamFundamentalsOfAlgorithmizationAndProgramming, user36ExamImplementationAndSupportOfComputerSystems, user36QualificationExam, user36EducationalPractice, user36ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user37Id, user37Username, user37DifOffsetEnglishLanguage, user37DifOffsetProbabilityTheory, user37DifOffsetHardwareArchitecture, user37DifOffsetInformationTechnology, user37DifOffsetDatabaseDesignFundamentals, user37DifOffsetEnsuringAndQualityFunctioningComputerSystems, user37OffsetPhysicalTraining, user37ExamFundamentalsOfAlgorithmizationAndProgramming, user37ExamImplementationAndSupportOfComputerSystems, user37QualificationExam, user37EducationalPractice, user37ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user38Id, user38Username, user38DifOffsetEnglishLanguage, user38DifOffsetProbabilityTheory, user38DifOffsetHardwareArchitecture, user38DifOffsetInformationTechnology, user38DifOffsetDatabaseDesignFundamentals, user38DifOffsetEnsuringAndQualityFunctioningComputerSystems, user38OffsetPhysicalTraining, user38ExamFundamentalsOfAlgorithmizationAndProgramming, user38ExamImplementationAndSupportOfComputerSystems, user38QualificationExam, user38EducationalPractice, user38ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user39Id, user39Username, user39DifOffsetEnglishLanguage, user39DifOffsetProbabilityTheory, user39DifOffsetHardwareArchitecture, user39DifOffsetInformationTechnology, user39DifOffsetDatabaseDesignFundamentals, user39DifOffsetEnsuringAndQualityFunctioningComputerSystems, user39OffsetPhysicalTraining, user39ExamFundamentalsOfAlgorithmizationAndProgramming, user39ExamImplementationAndSupportOfComputerSystems, user39QualificationExam, user39EducationalPractice, user39ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course2Semester2(user40Id, user40Username, user40DifOffsetEnglishLanguage, user40DifOffsetProbabilityTheory, user40DifOffsetHardwareArchitecture, user40DifOffsetInformationTechnology, user40DifOffsetDatabaseDesignFundamentals, user40DifOffsetEnsuringAndQualityFunctioningComputerSystems, user40OffsetPhysicalTraining, user40ExamFundamentalsOfAlgorithmizationAndProgramming, user40ExamImplementationAndSupportOfComputerSystems, user40QualificationExam, user40EducationalPractice, user40ProductionPractice));

            if (specialGradeIs11Course2Semester2Repository.findAll().isEmpty()) {
                specialGradeIs11Course2Semester2Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course2Semester2> user1Row = specialGradeIs11Course2Semester2Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User1 = user1Row.get();
            specialGrade_IS_1_1Course2Semester2User1.setUsername(user1Username);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetEnglishLanguage(user1DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetProbabilityTheory(user1DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetHardwareArchitecture(user1DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetInformationTechnology(user1DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetDatabaseDesignFundamentals(user1DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User1.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user1DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User1.setOffsetPhysicalTraining(user1OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User1.setExamFundamentalsOfAlgorithmizationAndProgramming(user1ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User1.setExamImplementationAndSupportOfComputerSystems(user1ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User1.setQualificationExam(user1QualificationExam);
            specialGrade_IS_1_1Course2Semester2User1.setEducationalPractice(user1EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User1.setProductionPractice(user1ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course2Semester2> user2Row = specialGradeIs11Course2Semester2Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User2 = user2Row.get();
            specialGrade_IS_1_1Course2Semester2User2.setUsername(user2Username);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetEnglishLanguage(user2DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetProbabilityTheory(user2DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetHardwareArchitecture(user2DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetInformationTechnology(user2DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetDatabaseDesignFundamentals(user2DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User2.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user2DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User2.setOffsetPhysicalTraining(user2OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User2.setExamFundamentalsOfAlgorithmizationAndProgramming(user2ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User2.setExamImplementationAndSupportOfComputerSystems(user2ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User2.setQualificationExam(user2QualificationExam);
            specialGrade_IS_1_1Course2Semester2User2.setEducationalPractice(user2EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User2.setProductionPractice(user2ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course2Semester2> user3Row = specialGradeIs11Course2Semester2Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User3 = user3Row.get();
            specialGrade_IS_1_1Course2Semester2User3.setUsername(user3Username);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetEnglishLanguage(user3DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetProbabilityTheory(user3DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetHardwareArchitecture(user3DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetInformationTechnology(user3DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetDatabaseDesignFundamentals(user3DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User3.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user3DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User3.setOffsetPhysicalTraining(user3OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User3.setExamFundamentalsOfAlgorithmizationAndProgramming(user3ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User3.setExamImplementationAndSupportOfComputerSystems(user3ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User3.setQualificationExam(user3QualificationExam);
            specialGrade_IS_1_1Course2Semester2User3.setEducationalPractice(user3EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User3.setProductionPractice(user3ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course2Semester2> user4Row = specialGradeIs11Course2Semester2Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User4 = user4Row.get();
            specialGrade_IS_1_1Course2Semester2User4.setUsername(user4Username);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetEnglishLanguage(user4DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetProbabilityTheory(user4DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetHardwareArchitecture(user4DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetInformationTechnology(user4DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetDatabaseDesignFundamentals(user4DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User4.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user4DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User4.setOffsetPhysicalTraining(user4OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User4.setExamFundamentalsOfAlgorithmizationAndProgramming(user4ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User4.setExamImplementationAndSupportOfComputerSystems(user4ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User4.setQualificationExam(user4QualificationExam);
            specialGrade_IS_1_1Course2Semester2User4.setEducationalPractice(user4EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User4.setProductionPractice(user4ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course2Semester2> user5Row = specialGradeIs11Course2Semester2Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User5 = user5Row.get();
            specialGrade_IS_1_1Course2Semester2User5.setUsername(user5Username);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetEnglishLanguage(user5DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetProbabilityTheory(user5DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetHardwareArchitecture(user5DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetInformationTechnology(user5DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetDatabaseDesignFundamentals(user5DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User5.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user5DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User5.setOffsetPhysicalTraining(user5OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User5.setExamFundamentalsOfAlgorithmizationAndProgramming(user5ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User5.setExamImplementationAndSupportOfComputerSystems(user5ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User5.setQualificationExam(user5QualificationExam);
            specialGrade_IS_1_1Course2Semester2User5.setEducationalPractice(user5EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User5.setProductionPractice(user5ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course2Semester2> user6Row = specialGradeIs11Course2Semester2Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User6 = user6Row.get();
            specialGrade_IS_1_1Course2Semester2User6.setUsername(user6Username);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetEnglishLanguage(user6DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetProbabilityTheory(user6DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetHardwareArchitecture(user6DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetInformationTechnology(user6DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetDatabaseDesignFundamentals(user6DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User6.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user6DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User6.setOffsetPhysicalTraining(user6OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User6.setExamFundamentalsOfAlgorithmizationAndProgramming(user6ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User6.setExamImplementationAndSupportOfComputerSystems(user6ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User6.setQualificationExam(user6QualificationExam);
            specialGrade_IS_1_1Course2Semester2User6.setEducationalPractice(user6EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User6.setProductionPractice(user6ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course2Semester2> user7Row = specialGradeIs11Course2Semester2Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User7 = user7Row.get();
            specialGrade_IS_1_1Course2Semester2User7.setUsername(user7Username);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetEnglishLanguage(user7DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetProbabilityTheory(user7DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetHardwareArchitecture(user7DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetInformationTechnology(user7DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetDatabaseDesignFundamentals(user7DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User7.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user7DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User7.setOffsetPhysicalTraining(user7OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User7.setExamFundamentalsOfAlgorithmizationAndProgramming(user7ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User7.setExamImplementationAndSupportOfComputerSystems(user7ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User7.setQualificationExam(user7QualificationExam);
            specialGrade_IS_1_1Course2Semester2User7.setEducationalPractice(user7EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User7.setProductionPractice(user7ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course2Semester2> user8Row = specialGradeIs11Course2Semester2Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User8 = user8Row.get();
            specialGrade_IS_1_1Course2Semester2User8.setUsername(user8Username);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetEnglishLanguage(user8DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetProbabilityTheory(user8DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetHardwareArchitecture(user8DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetInformationTechnology(user8DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetDatabaseDesignFundamentals(user8DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User8.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user8DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User8.setOffsetPhysicalTraining(user8OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User8.setExamFundamentalsOfAlgorithmizationAndProgramming(user8ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User8.setExamImplementationAndSupportOfComputerSystems(user8ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User8.setQualificationExam(user8QualificationExam);
            specialGrade_IS_1_1Course2Semester2User8.setEducationalPractice(user8EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User8.setProductionPractice(user8ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course2Semester2> user9Row = specialGradeIs11Course2Semester2Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User9 = user9Row.get();
            specialGrade_IS_1_1Course2Semester2User9.setUsername(user9Username);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetEnglishLanguage(user9DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetProbabilityTheory(user9DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetHardwareArchitecture(user9DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetInformationTechnology(user9DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetDatabaseDesignFundamentals(user9DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User9.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user9DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User9.setOffsetPhysicalTraining(user9OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User9.setExamFundamentalsOfAlgorithmizationAndProgramming(user9ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User9.setExamImplementationAndSupportOfComputerSystems(user9ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User9.setQualificationExam(user9QualificationExam);
            specialGrade_IS_1_1Course2Semester2User9.setEducationalPractice(user9EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User9.setProductionPractice(user9ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course2Semester2> user10Row = specialGradeIs11Course2Semester2Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User10 = user10Row.get();
            specialGrade_IS_1_1Course2Semester2User10.setUsername(user10Username);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetEnglishLanguage(user10DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetProbabilityTheory(user10DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetHardwareArchitecture(user10DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetInformationTechnology(user10DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetDatabaseDesignFundamentals(user10DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User10.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user10DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User10.setOffsetPhysicalTraining(user10OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User10.setExamFundamentalsOfAlgorithmizationAndProgramming(user10ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User10.setExamImplementationAndSupportOfComputerSystems(user10ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User10.setQualificationExam(user10QualificationExam);
            specialGrade_IS_1_1Course2Semester2User10.setEducationalPractice(user10EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User10.setProductionPractice(user10ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course2Semester2> user11Row = specialGradeIs11Course2Semester2Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User11 = user11Row.get();
            specialGrade_IS_1_1Course2Semester2User11.setUsername(user11Username);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetEnglishLanguage(user11DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetProbabilityTheory(user11DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetHardwareArchitecture(user11DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetInformationTechnology(user11DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetDatabaseDesignFundamentals(user11DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User11.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user11DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User11.setOffsetPhysicalTraining(user11OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User11.setExamFundamentalsOfAlgorithmizationAndProgramming(user11ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User11.setExamImplementationAndSupportOfComputerSystems(user11ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User11.setQualificationExam(user11QualificationExam);
            specialGrade_IS_1_1Course2Semester2User11.setEducationalPractice(user11EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User11.setProductionPractice(user11ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course2Semester2> user12Row = specialGradeIs11Course2Semester2Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User12 = user12Row.get();
            specialGrade_IS_1_1Course2Semester2User12.setUsername(user12Username);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetEnglishLanguage(user12DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetProbabilityTheory(user12DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetHardwareArchitecture(user12DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetInformationTechnology(user12DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetDatabaseDesignFundamentals(user12DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User12.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user12DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User12.setOffsetPhysicalTraining(user12OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User12.setExamFundamentalsOfAlgorithmizationAndProgramming(user12ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User12.setExamImplementationAndSupportOfComputerSystems(user12ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User12.setQualificationExam(user12QualificationExam);
            specialGrade_IS_1_1Course2Semester2User12.setEducationalPractice(user12EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User12.setProductionPractice(user12ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course2Semester2> user13Row = specialGradeIs11Course2Semester2Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User13 = user13Row.get();
            specialGrade_IS_1_1Course2Semester2User13.setUsername(user13Username);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetEnglishLanguage(user13DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetProbabilityTheory(user13DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetHardwareArchitecture(user13DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetInformationTechnology(user13DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetDatabaseDesignFundamentals(user13DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User13.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user13DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User13.setOffsetPhysicalTraining(user13OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User13.setExamFundamentalsOfAlgorithmizationAndProgramming(user13ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User13.setExamImplementationAndSupportOfComputerSystems(user13ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User13.setQualificationExam(user13QualificationExam);
            specialGrade_IS_1_1Course2Semester2User13.setEducationalPractice(user13EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User13.setProductionPractice(user13ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course2Semester2> user14Row = specialGradeIs11Course2Semester2Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User14 = user14Row.get();
            specialGrade_IS_1_1Course2Semester2User14.setUsername(user14Username);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetEnglishLanguage(user14DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetProbabilityTheory(user14DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetHardwareArchitecture(user14DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetInformationTechnology(user14DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetDatabaseDesignFundamentals(user14DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User14.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user14DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User14.setOffsetPhysicalTraining(user14OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User14.setExamFundamentalsOfAlgorithmizationAndProgramming(user14ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User14.setExamImplementationAndSupportOfComputerSystems(user14ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User14.setQualificationExam(user14QualificationExam);
            specialGrade_IS_1_1Course2Semester2User14.setEducationalPractice(user14EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User14.setProductionPractice(user14ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course2Semester2> user15Row = specialGradeIs11Course2Semester2Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User15 = user15Row.get();
            specialGrade_IS_1_1Course2Semester2User15.setUsername(user15Username);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetEnglishLanguage(user15DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetProbabilityTheory(user15DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetHardwareArchitecture(user15DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetInformationTechnology(user15DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetDatabaseDesignFundamentals(user15DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User15.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user15DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User15.setOffsetPhysicalTraining(user15OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User15.setExamFundamentalsOfAlgorithmizationAndProgramming(user15ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User15.setExamImplementationAndSupportOfComputerSystems(user15ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User15.setQualificationExam(user15QualificationExam);
            specialGrade_IS_1_1Course2Semester2User15.setEducationalPractice(user15EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User15.setProductionPractice(user15ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course2Semester2> user16Row = specialGradeIs11Course2Semester2Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User16 = user16Row.get();
            specialGrade_IS_1_1Course2Semester2User16.setUsername(user16Username);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetEnglishLanguage(user16DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetProbabilityTheory(user16DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetHardwareArchitecture(user16DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetInformationTechnology(user16DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetDatabaseDesignFundamentals(user16DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User16.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user16DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User16.setOffsetPhysicalTraining(user16OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User16.setExamFundamentalsOfAlgorithmizationAndProgramming(user16ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User16.setExamImplementationAndSupportOfComputerSystems(user16ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User16.setQualificationExam(user16QualificationExam);
            specialGrade_IS_1_1Course2Semester2User16.setEducationalPractice(user16EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User16.setProductionPractice(user16ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course2Semester2> user17Row = specialGradeIs11Course2Semester2Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User17 = user17Row.get();
            specialGrade_IS_1_1Course2Semester2User17.setUsername(user17Username);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetEnglishLanguage(user17DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetProbabilityTheory(user17DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetHardwareArchitecture(user17DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetInformationTechnology(user17DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetDatabaseDesignFundamentals(user17DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User17.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user17DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User17.setOffsetPhysicalTraining(user17OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User17.setExamFundamentalsOfAlgorithmizationAndProgramming(user17ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User17.setExamImplementationAndSupportOfComputerSystems(user17ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User17.setQualificationExam(user17QualificationExam);
            specialGrade_IS_1_1Course2Semester2User17.setEducationalPractice(user17EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User17.setProductionPractice(user17ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course2Semester2> user18Row = specialGradeIs11Course2Semester2Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User18 = user18Row.get();
            specialGrade_IS_1_1Course2Semester2User18.setUsername(user18Username);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetEnglishLanguage(user18DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetProbabilityTheory(user18DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetHardwareArchitecture(user18DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetInformationTechnology(user18DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetDatabaseDesignFundamentals(user18DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User18.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user18DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User18.setOffsetPhysicalTraining(user18OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User18.setExamFundamentalsOfAlgorithmizationAndProgramming(user18ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User18.setExamImplementationAndSupportOfComputerSystems(user18ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User18.setQualificationExam(user18QualificationExam);
            specialGrade_IS_1_1Course2Semester2User18.setEducationalPractice(user18EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User18.setProductionPractice(user18ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course2Semester2> user19Row = specialGradeIs11Course2Semester2Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User19 = user19Row.get();
            specialGrade_IS_1_1Course2Semester2User19.setUsername(user19Username);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetEnglishLanguage(user19DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetProbabilityTheory(user19DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetHardwareArchitecture(user19DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetInformationTechnology(user19DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetDatabaseDesignFundamentals(user19DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User19.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user19DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User19.setOffsetPhysicalTraining(user19OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User19.setExamFundamentalsOfAlgorithmizationAndProgramming(user19ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User19.setExamImplementationAndSupportOfComputerSystems(user19ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User19.setQualificationExam(user19QualificationExam);
            specialGrade_IS_1_1Course2Semester2User19.setEducationalPractice(user19EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User19.setProductionPractice(user19ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course2Semester2> user20Row = specialGradeIs11Course2Semester2Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User20 = user20Row.get();
            specialGrade_IS_1_1Course2Semester2User20.setUsername(user20Username);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetEnglishLanguage(user20DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetProbabilityTheory(user20DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetHardwareArchitecture(user20DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetInformationTechnology(user20DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetDatabaseDesignFundamentals(user20DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User20.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user20DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User20.setOffsetPhysicalTraining(user20OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User20.setExamFundamentalsOfAlgorithmizationAndProgramming(user20ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User20.setExamImplementationAndSupportOfComputerSystems(user20ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User20.setQualificationExam(user20QualificationExam);
            specialGrade_IS_1_1Course2Semester2User20.setEducationalPractice(user20EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User20.setProductionPractice(user20ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course2Semester2> user21Row = specialGradeIs11Course2Semester2Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User21 = user21Row.get();
            specialGrade_IS_1_1Course2Semester2User21.setUsername(user21Username);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetEnglishLanguage(user21DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetProbabilityTheory(user21DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetHardwareArchitecture(user21DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetInformationTechnology(user21DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetDatabaseDesignFundamentals(user21DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User21.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user21DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User21.setOffsetPhysicalTraining(user21OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User21.setExamFundamentalsOfAlgorithmizationAndProgramming(user21ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User21.setExamImplementationAndSupportOfComputerSystems(user21ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User21.setQualificationExam(user21QualificationExam);
            specialGrade_IS_1_1Course2Semester2User21.setEducationalPractice(user21EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User21.setProductionPractice(user21ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course2Semester2> user22Row = specialGradeIs11Course2Semester2Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User22 = user22Row.get();
            specialGrade_IS_1_1Course2Semester2User22.setUsername(user22Username);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetEnglishLanguage(user22DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetProbabilityTheory(user22DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetHardwareArchitecture(user22DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetInformationTechnology(user22DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetDatabaseDesignFundamentals(user22DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User22.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user22DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User22.setOffsetPhysicalTraining(user22OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User22.setExamFundamentalsOfAlgorithmizationAndProgramming(user22ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User22.setExamImplementationAndSupportOfComputerSystems(user22ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User22.setQualificationExam(user22QualificationExam);
            specialGrade_IS_1_1Course2Semester2User22.setEducationalPractice(user22EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User22.setProductionPractice(user22ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course2Semester2> user23Row = specialGradeIs11Course2Semester2Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User23 = user23Row.get();
            specialGrade_IS_1_1Course2Semester2User23.setUsername(user23Username);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetEnglishLanguage(user23DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetProbabilityTheory(user23DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetHardwareArchitecture(user23DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetInformationTechnology(user23DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetDatabaseDesignFundamentals(user23DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User23.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user23DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User23.setOffsetPhysicalTraining(user23OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User23.setExamFundamentalsOfAlgorithmizationAndProgramming(user23ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User23.setExamImplementationAndSupportOfComputerSystems(user23ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User23.setQualificationExam(user23QualificationExam);
            specialGrade_IS_1_1Course2Semester2User23.setEducationalPractice(user23EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User23.setProductionPractice(user23ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course2Semester2> user24Row = specialGradeIs11Course2Semester2Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User24 = user24Row.get();
            specialGrade_IS_1_1Course2Semester2User24.setUsername(user24Username);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetEnglishLanguage(user24DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetProbabilityTheory(user24DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetHardwareArchitecture(user24DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetInformationTechnology(user24DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetDatabaseDesignFundamentals(user24DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User24.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user24DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User24.setOffsetPhysicalTraining(user24OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User24.setExamFundamentalsOfAlgorithmizationAndProgramming(user24ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User24.setExamImplementationAndSupportOfComputerSystems(user24ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User24.setQualificationExam(user24QualificationExam);
            specialGrade_IS_1_1Course2Semester2User24.setEducationalPractice(user24EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User24.setProductionPractice(user24ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course2Semester2> user25Row = specialGradeIs11Course2Semester2Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User25 = user25Row.get();
            specialGrade_IS_1_1Course2Semester2User25.setUsername(user25Username);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetEnglishLanguage(user25DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetProbabilityTheory(user25DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetHardwareArchitecture(user25DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetInformationTechnology(user25DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetDatabaseDesignFundamentals(user25DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User25.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user25DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User25.setOffsetPhysicalTraining(user25OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User25.setExamFundamentalsOfAlgorithmizationAndProgramming(user25ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User25.setExamImplementationAndSupportOfComputerSystems(user25ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User25.setQualificationExam(user25QualificationExam);
            specialGrade_IS_1_1Course2Semester2User25.setEducationalPractice(user25EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User25.setProductionPractice(user25ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course2Semester2> user26Row = specialGradeIs11Course2Semester2Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User26 = user26Row.get();
            specialGrade_IS_1_1Course2Semester2User26.setUsername(user26Username);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetEnglishLanguage(user26DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetProbabilityTheory(user26DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetHardwareArchitecture(user26DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetInformationTechnology(user26DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetDatabaseDesignFundamentals(user26DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User26.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user26DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User26.setOffsetPhysicalTraining(user26OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User26.setExamFundamentalsOfAlgorithmizationAndProgramming(user26ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User26.setExamImplementationAndSupportOfComputerSystems(user26ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User26.setQualificationExam(user26QualificationExam);
            specialGrade_IS_1_1Course2Semester2User26.setEducationalPractice(user26EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User26.setProductionPractice(user26ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course2Semester2> user27Row = specialGradeIs11Course2Semester2Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User27 = user27Row.get();
            specialGrade_IS_1_1Course2Semester2User27.setUsername(user27Username);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetEnglishLanguage(user27DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetProbabilityTheory(user27DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetHardwareArchitecture(user27DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetInformationTechnology(user27DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetDatabaseDesignFundamentals(user27DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User27.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user27DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User27.setOffsetPhysicalTraining(user27OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User27.setExamFundamentalsOfAlgorithmizationAndProgramming(user27ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User27.setExamImplementationAndSupportOfComputerSystems(user27ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User27.setQualificationExam(user27QualificationExam);
            specialGrade_IS_1_1Course2Semester2User27.setEducationalPractice(user27EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User27.setProductionPractice(user27ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course2Semester2> user28Row = specialGradeIs11Course2Semester2Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User28 = user28Row.get();
            specialGrade_IS_1_1Course2Semester2User28.setUsername(user28Username);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetEnglishLanguage(user28DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetProbabilityTheory(user28DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetHardwareArchitecture(user28DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetInformationTechnology(user28DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetDatabaseDesignFundamentals(user28DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User28.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user28DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User28.setOffsetPhysicalTraining(user28OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User28.setExamFundamentalsOfAlgorithmizationAndProgramming(user28ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User28.setExamImplementationAndSupportOfComputerSystems(user28ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User28.setQualificationExam(user28QualificationExam);
            specialGrade_IS_1_1Course2Semester2User28.setEducationalPractice(user28EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User28.setProductionPractice(user28ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course2Semester2> user29Row = specialGradeIs11Course2Semester2Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User29 = user29Row.get();
            specialGrade_IS_1_1Course2Semester2User29.setUsername(user29Username);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetEnglishLanguage(user29DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetProbabilityTheory(user29DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetHardwareArchitecture(user29DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetInformationTechnology(user29DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetDatabaseDesignFundamentals(user29DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User29.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user29DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User29.setOffsetPhysicalTraining(user29OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User29.setExamFundamentalsOfAlgorithmizationAndProgramming(user29ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User29.setExamImplementationAndSupportOfComputerSystems(user29ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User29.setQualificationExam(user29QualificationExam);
            specialGrade_IS_1_1Course2Semester2User29.setEducationalPractice(user29EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User29.setProductionPractice(user29ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course2Semester2> user30Row = specialGradeIs11Course2Semester2Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User30 = user30Row.get();
            specialGrade_IS_1_1Course2Semester2User30.setUsername(user30Username);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetEnglishLanguage(user30DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetProbabilityTheory(user30DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetHardwareArchitecture(user30DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetInformationTechnology(user30DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetDatabaseDesignFundamentals(user30DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User30.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user30DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User30.setOffsetPhysicalTraining(user30OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User30.setExamFundamentalsOfAlgorithmizationAndProgramming(user30ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User30.setExamImplementationAndSupportOfComputerSystems(user30ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User30.setQualificationExam(user30QualificationExam);
            specialGrade_IS_1_1Course2Semester2User30.setEducationalPractice(user30EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User30.setProductionPractice(user30ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course2Semester2> user31Row = specialGradeIs11Course2Semester2Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User31 = user31Row.get();
            specialGrade_IS_1_1Course2Semester2User31.setUsername(user31Username);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetEnglishLanguage(user31DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetProbabilityTheory(user31DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetHardwareArchitecture(user31DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetInformationTechnology(user31DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetDatabaseDesignFundamentals(user31DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User31.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user31DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User31.setOffsetPhysicalTraining(user31OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User31.setExamFundamentalsOfAlgorithmizationAndProgramming(user31ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User31.setExamImplementationAndSupportOfComputerSystems(user31ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User31.setQualificationExam(user31QualificationExam);
            specialGrade_IS_1_1Course2Semester2User31.setEducationalPractice(user31EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User31.setProductionPractice(user31ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course2Semester2> user32Row = specialGradeIs11Course2Semester2Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User32 = user32Row.get();
            specialGrade_IS_1_1Course2Semester2User32.setUsername(user32Username);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetEnglishLanguage(user32DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetProbabilityTheory(user32DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetHardwareArchitecture(user32DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetInformationTechnology(user32DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetDatabaseDesignFundamentals(user32DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User32.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user32DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User32.setOffsetPhysicalTraining(user32OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User32.setExamFundamentalsOfAlgorithmizationAndProgramming(user32ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User32.setExamImplementationAndSupportOfComputerSystems(user32ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User32.setQualificationExam(user32QualificationExam);
            specialGrade_IS_1_1Course2Semester2User32.setEducationalPractice(user32EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User32.setProductionPractice(user32ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course2Semester2> user33Row = specialGradeIs11Course2Semester2Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User33 = user33Row.get();
            specialGrade_IS_1_1Course2Semester2User33.setUsername(user33Username);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetEnglishLanguage(user33DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetProbabilityTheory(user33DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetHardwareArchitecture(user33DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetInformationTechnology(user33DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetDatabaseDesignFundamentals(user33DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User33.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user33DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User33.setOffsetPhysicalTraining(user33OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User33.setExamFundamentalsOfAlgorithmizationAndProgramming(user33ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User33.setExamImplementationAndSupportOfComputerSystems(user33ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User33.setQualificationExam(user33QualificationExam);
            specialGrade_IS_1_1Course2Semester2User33.setEducationalPractice(user33EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User33.setProductionPractice(user33ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course2Semester2> user34Row = specialGradeIs11Course2Semester2Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User34 = user34Row.get();
            specialGrade_IS_1_1Course2Semester2User34.setUsername(user34Username);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetEnglishLanguage(user34DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetProbabilityTheory(user34DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetHardwareArchitecture(user34DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetInformationTechnology(user34DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetDatabaseDesignFundamentals(user34DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User34.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user34DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User34.setOffsetPhysicalTraining(user34OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User34.setExamFundamentalsOfAlgorithmizationAndProgramming(user34ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User34.setExamImplementationAndSupportOfComputerSystems(user34ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User34.setQualificationExam(user34QualificationExam);
            specialGrade_IS_1_1Course2Semester2User34.setEducationalPractice(user34EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User34.setProductionPractice(user34ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course2Semester2> user35Row = specialGradeIs11Course2Semester2Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User35 = user35Row.get();
            specialGrade_IS_1_1Course2Semester2User35.setUsername(user35Username);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetEnglishLanguage(user35DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetProbabilityTheory(user35DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetHardwareArchitecture(user35DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetInformationTechnology(user35DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetDatabaseDesignFundamentals(user35DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User35.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user35DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User35.setOffsetPhysicalTraining(user35OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User35.setExamFundamentalsOfAlgorithmizationAndProgramming(user35ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User35.setExamImplementationAndSupportOfComputerSystems(user35ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User35.setQualificationExam(user35QualificationExam);
            specialGrade_IS_1_1Course2Semester2User35.setEducationalPractice(user35EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User35.setProductionPractice(user35ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course2Semester2> user36Row = specialGradeIs11Course2Semester2Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User36 = user36Row.get();
            specialGrade_IS_1_1Course2Semester2User36.setUsername(user36Username);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetEnglishLanguage(user36DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetProbabilityTheory(user36DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetHardwareArchitecture(user36DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetInformationTechnology(user36DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetDatabaseDesignFundamentals(user36DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User36.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user36DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User36.setOffsetPhysicalTraining(user36OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User36.setExamFundamentalsOfAlgorithmizationAndProgramming(user36ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User36.setExamImplementationAndSupportOfComputerSystems(user36ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User36.setQualificationExam(user36QualificationExam);
            specialGrade_IS_1_1Course2Semester2User36.setEducationalPractice(user36EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User36.setProductionPractice(user36ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course2Semester2> user37Row = specialGradeIs11Course2Semester2Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User37 = user37Row.get();
            specialGrade_IS_1_1Course2Semester2User37.setUsername(user37Username);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetEnglishLanguage(user37DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetProbabilityTheory(user37DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetHardwareArchitecture(user37DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetInformationTechnology(user37DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetDatabaseDesignFundamentals(user37DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User37.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user37DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User37.setOffsetPhysicalTraining(user37OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User37.setExamFundamentalsOfAlgorithmizationAndProgramming(user37ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User37.setExamImplementationAndSupportOfComputerSystems(user37ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User37.setQualificationExam(user37QualificationExam);
            specialGrade_IS_1_1Course2Semester2User37.setEducationalPractice(user37EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User37.setProductionPractice(user37ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course2Semester2> user38Row = specialGradeIs11Course2Semester2Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User38 = user38Row.get();
            specialGrade_IS_1_1Course2Semester2User38.setUsername(user38Username);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetEnglishLanguage(user38DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetProbabilityTheory(user38DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetHardwareArchitecture(user38DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetInformationTechnology(user38DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetDatabaseDesignFundamentals(user38DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User38.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user38DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User38.setOffsetPhysicalTraining(user38OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User38.setExamFundamentalsOfAlgorithmizationAndProgramming(user38ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User38.setExamImplementationAndSupportOfComputerSystems(user38ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User38.setQualificationExam(user38QualificationExam);
            specialGrade_IS_1_1Course2Semester2User38.setEducationalPractice(user38EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User38.setProductionPractice(user38ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course2Semester2> user39Row = specialGradeIs11Course2Semester2Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User39 = user39Row.get();
            specialGrade_IS_1_1Course2Semester2User39.setUsername(user39Username);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetEnglishLanguage(user39DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetProbabilityTheory(user39DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetHardwareArchitecture(user39DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetInformationTechnology(user39DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetDatabaseDesignFundamentals(user39DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User39.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user39DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User39.setOffsetPhysicalTraining(user39OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User39.setExamFundamentalsOfAlgorithmizationAndProgramming(user39ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User39.setExamImplementationAndSupportOfComputerSystems(user39ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User39.setQualificationExam(user39QualificationExam);
            specialGrade_IS_1_1Course2Semester2User39.setEducationalPractice(user39EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User39.setProductionPractice(user39ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course2Semester2> user40Row = specialGradeIs11Course2Semester2Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course2Semester2 specialGrade_IS_1_1Course2Semester2User40 = user40Row.get();
            specialGrade_IS_1_1Course2Semester2User40.setUsername(user40Username);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetEnglishLanguage(user40DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetProbabilityTheory(user40DifOffsetProbabilityTheory);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetHardwareArchitecture(user40DifOffsetHardwareArchitecture);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetInformationTechnology(user40DifOffsetInformationTechnology);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetDatabaseDesignFundamentals(user40DifOffsetDatabaseDesignFundamentals);
            specialGrade_IS_1_1Course2Semester2User40.setDifOffsetEnsuringAndQualityFunctioningComputerSystems(user40DifOffsetEnsuringAndQualityFunctioningComputerSystems);
            specialGrade_IS_1_1Course2Semester2User40.setOffsetPhysicalTraining(user40OffsetPhysicalTraining);
            specialGrade_IS_1_1Course2Semester2User40.setExamFundamentalsOfAlgorithmizationAndProgramming(user40ExamFundamentalsOfAlgorithmizationAndProgramming);
            specialGrade_IS_1_1Course2Semester2User40.setExamImplementationAndSupportOfComputerSystems(user40ExamImplementationAndSupportOfComputerSystems);
            specialGrade_IS_1_1Course2Semester2User40.setQualificationExam(user40QualificationExam);
            specialGrade_IS_1_1Course2Semester2User40.setEducationalPractice(user40EducationalPractice);
            specialGrade_IS_1_1Course2Semester2User40.setProductionPractice(user40ProductionPractice);
            specialGradeIs11Course2Semester2Repository.save(specialGrade_IS_1_1Course2Semester2User40);
        } catch (Exception ignore) {

        }
    }
}
