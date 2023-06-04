package com.example.demoauth.service.moderatorService.moderator_is1Service.course4;

import com.example.demoauth.models.grade_is1.models.course4.SpecialGrade_IS_1_1Course4Semester2;
import com.example.demoauth.repository.is1Repository.course4.SpecialGrade_IS_1_1Course4Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course4Semester2 {
    @Autowired
    SpecialGrade_IS_1_1Course4Semester2Repository specialGradeIs11Course4Semester2Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse4Semester2
    public void getMappingModer_is_1_1SpecialGreadeСourse4Semester2(Model model) {
        List<SpecialGrade_IS_1_1Course4Semester2> res = specialGradeIs11Course4Semester2Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course4Semester2::getUserID));

        List<SpecialGrade_IS_1_1Course4Semester2> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course4Semester2());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse4Semester2
    public void postMappingModer_is_1_1SpecialGreadeСourse4Semester2Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetFundamentalsPhilosophy = splitUser1Grades[2];
            String user1DifOffsetEnglishLanguage = splitUser1Grades[3];
            String user1DifOffsetPhysicalTraining = splitUser1Grades[4];
            String user1DifOffsetLegalSupportProfessionalActivity = splitUser1Grades[5];
            String user1DifOffsetNumericalMethods = splitUser1Grades[6];
            String user1DifOffsetManagementProfessionalActivity = splitUser1Grades[7];
            String user1DifOffsetISRPO = splitUser1Grades[8];
            String user1ExamMathematicalModels = splitUser1Grades[9];
            String user1QualificationExam = splitUser1Grades[10];
            String user1ProductionPractice = splitUser1Grades[11];
            String user1UndergraduatePractice = splitUser1Grades[12];
            String user1GraduationProjectDefense = splitUser1Grades[13];
            String user1DemoExam = splitUser1Grades[14];

            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetFundamentalsPhilosophy = splitUser2Grades[2];
            String user2DifOffsetEnglishLanguage = splitUser2Grades[3];
            String user2DifOffsetPhysicalTraining = splitUser2Grades[4];
            String user2DifOffsetLegalSupportProfessionalActivity = splitUser2Grades[5];
            String user2DifOffsetNumericalMethods = splitUser2Grades[6];
            String user2DifOffsetManagementProfessionalActivity = splitUser2Grades[7];
            String user2DifOffsetISRPO = splitUser2Grades[8];
            String user2ExamMathematicalModels = splitUser2Grades[9];
            String user2QualificationExam = splitUser2Grades[10];
            String user2ProductionPractice = splitUser2Grades[11];
            String user2UndergraduatePractice = splitUser2Grades[12];
            String user2GraduationProjectDefense = splitUser2Grades[13];
            String user2DemoExam = splitUser2Grades[14];

            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetFundamentalsPhilosophy = splitUser3Grades[2];
            String user3DifOffsetEnglishLanguage = splitUser3Grades[3];
            String user3DifOffsetPhysicalTraining = splitUser3Grades[4];
            String user3DifOffsetLegalSupportProfessionalActivity = splitUser3Grades[5];
            String user3DifOffsetNumericalMethods = splitUser3Grades[6];
            String user3DifOffsetManagementProfessionalActivity = splitUser3Grades[7];
            String user3DifOffsetISRPO = splitUser3Grades[8];
            String user3ExamMathematicalModels = splitUser3Grades[9];
            String user3QualificationExam = splitUser3Grades[10];
            String user3ProductionPractice = splitUser3Grades[11];
            String user3UndergraduatePractice = splitUser3Grades[12];
            String user3GraduationProjectDefense = splitUser3Grades[13];
            String user3DemoExam = splitUser3Grades[14];

            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetFundamentalsPhilosophy = splitUser4Grades[2];
            String user4DifOffsetEnglishLanguage = splitUser4Grades[3];
            String user4DifOffsetPhysicalTraining = splitUser4Grades[4];
            String user4DifOffsetLegalSupportProfessionalActivity = splitUser4Grades[5];
            String user4DifOffsetNumericalMethods = splitUser4Grades[6];
            String user4DifOffsetManagementProfessionalActivity = splitUser4Grades[7];
            String user4DifOffsetISRPO = splitUser4Grades[8];
            String user4ExamMathematicalModels = splitUser4Grades[9];
            String user4QualificationExam = splitUser4Grades[10];
            String user4ProductionPractice = splitUser4Grades[11];
            String user4UndergraduatePractice = splitUser4Grades[12];
            String user4GraduationProjectDefense = splitUser4Grades[13];
            String user4DemoExam = splitUser4Grades[14];

            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetFundamentalsPhilosophy = splitUser5Grades[2];
            String user5DifOffsetEnglishLanguage = splitUser5Grades[3];
            String user5DifOffsetPhysicalTraining = splitUser5Grades[4];
            String user5DifOffsetLegalSupportProfessionalActivity = splitUser5Grades[5];
            String user5DifOffsetNumericalMethods = splitUser5Grades[6];
            String user5DifOffsetManagementProfessionalActivity = splitUser5Grades[7];
            String user5DifOffsetISRPO = splitUser5Grades[8];
            String user5ExamMathematicalModels = splitUser5Grades[9];
            String user5QualificationExam = splitUser5Grades[10];
            String user5ProductionPractice = splitUser5Grades[11];
            String user5UndergraduatePractice = splitUser5Grades[12];
            String user5GraduationProjectDefense = splitUser5Grades[13];
            String user5DemoExam = splitUser5Grades[14];

            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetFundamentalsPhilosophy = splitUser6Grades[2];
            String user6DifOffsetEnglishLanguage = splitUser6Grades[3];
            String user6DifOffsetPhysicalTraining = splitUser6Grades[4];
            String user6DifOffsetLegalSupportProfessionalActivity = splitUser6Grades[5];
            String user6DifOffsetNumericalMethods = splitUser6Grades[6];
            String user6DifOffsetManagementProfessionalActivity = splitUser6Grades[7];
            String user6DifOffsetISRPO = splitUser6Grades[8];
            String user6ExamMathematicalModels = splitUser6Grades[9];
            String user6QualificationExam = splitUser6Grades[10];
            String user6ProductionPractice = splitUser6Grades[11];
            String user6UndergraduatePractice = splitUser6Grades[12];
            String user6GraduationProjectDefense = splitUser6Grades[13];
            String user6DemoExam = splitUser6Grades[14];

            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetFundamentalsPhilosophy = splitUser7Grades[2];
            String user7DifOffsetEnglishLanguage = splitUser7Grades[3];
            String user7DifOffsetPhysicalTraining = splitUser7Grades[4];
            String user7DifOffsetLegalSupportProfessionalActivity = splitUser7Grades[5];
            String user7DifOffsetNumericalMethods = splitUser7Grades[6];
            String user7DifOffsetManagementProfessionalActivity = splitUser7Grades[7];
            String user7DifOffsetISRPO = splitUser7Grades[8];
            String user7ExamMathematicalModels = splitUser7Grades[9];
            String user7QualificationExam = splitUser7Grades[10];
            String user7ProductionPractice = splitUser7Grades[11];
            String user7UndergraduatePractice = splitUser7Grades[12];
            String user7GraduationProjectDefense = splitUser7Grades[13];
            String user7DemoExam = splitUser7Grades[14];

            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetFundamentalsPhilosophy = splitUser8Grades[2];
            String user8DifOffsetEnglishLanguage = splitUser8Grades[3];
            String user8DifOffsetPhysicalTraining = splitUser8Grades[4];
            String user8DifOffsetLegalSupportProfessionalActivity = splitUser8Grades[5];
            String user8DifOffsetNumericalMethods = splitUser8Grades[6];
            String user8DifOffsetManagementProfessionalActivity = splitUser8Grades[7];
            String user8DifOffsetISRPO = splitUser8Grades[8];
            String user8ExamMathematicalModels = splitUser8Grades[9];
            String user8QualificationExam = splitUser8Grades[10];
            String user8ProductionPractice = splitUser8Grades[11];
            String user8UndergraduatePractice = splitUser8Grades[12];
            String user8GraduationProjectDefense = splitUser8Grades[13];
            String user8DemoExam = splitUser8Grades[14];

            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetFundamentalsPhilosophy = splitUser9Grades[2];
            String user9DifOffsetEnglishLanguage = splitUser9Grades[3];
            String user9DifOffsetPhysicalTraining = splitUser9Grades[4];
            String user9DifOffsetLegalSupportProfessionalActivity = splitUser9Grades[5];
            String user9DifOffsetNumericalMethods = splitUser9Grades[6];
            String user9DifOffsetManagementProfessionalActivity = splitUser9Grades[7];
            String user9DifOffsetISRPO = splitUser9Grades[8];
            String user9ExamMathematicalModels = splitUser9Grades[9];
            String user9QualificationExam = splitUser9Grades[10];
            String user9ProductionPractice = splitUser9Grades[11];
            String user9UndergraduatePractice = splitUser9Grades[12];
            String user9GraduationProjectDefense = splitUser9Grades[13];
            String user9DemoExam = splitUser9Grades[14];

            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetFundamentalsPhilosophy = splitUser10Grades[2];
            String user10DifOffsetEnglishLanguage = splitUser10Grades[3];
            String user10DifOffsetPhysicalTraining = splitUser10Grades[4];
            String user10DifOffsetLegalSupportProfessionalActivity = splitUser10Grades[5];
            String user10DifOffsetNumericalMethods = splitUser10Grades[6];
            String user10DifOffsetManagementProfessionalActivity = splitUser10Grades[7];
            String user10DifOffsetISRPO = splitUser10Grades[8];
            String user10ExamMathematicalModels = splitUser10Grades[9];
            String user10QualificationExam = splitUser10Grades[10];
            String user10ProductionPractice = splitUser10Grades[11];
            String user10UndergraduatePractice = splitUser10Grades[12];
            String user10GraduationProjectDefense = splitUser10Grades[13];
            String user10DemoExam = splitUser10Grades[14];

            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetFundamentalsPhilosophy = splitUser11Grades[2];
            String user11DifOffsetEnglishLanguage = splitUser11Grades[3];
            String user11DifOffsetPhysicalTraining = splitUser11Grades[4];
            String user11DifOffsetLegalSupportProfessionalActivity = splitUser11Grades[5];
            String user11DifOffsetNumericalMethods = splitUser11Grades[6];
            String user11DifOffsetManagementProfessionalActivity = splitUser11Grades[7];
            String user11DifOffsetISRPO = splitUser11Grades[8];
            String user11ExamMathematicalModels = splitUser11Grades[9];
            String user11QualificationExam = splitUser11Grades[10];
            String user11ProductionPractice = splitUser11Grades[11];
            String user11UndergraduatePractice = splitUser11Grades[12];
            String user11GraduationProjectDefense = splitUser11Grades[13];
            String user11DemoExam = splitUser11Grades[14];

            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetFundamentalsPhilosophy = splitUser12Grades[2];
            String user12DifOffsetEnglishLanguage = splitUser12Grades[3];
            String user12DifOffsetPhysicalTraining = splitUser12Grades[4];
            String user12DifOffsetLegalSupportProfessionalActivity = splitUser12Grades[5];
            String user12DifOffsetNumericalMethods = splitUser12Grades[6];
            String user12DifOffsetManagementProfessionalActivity = splitUser12Grades[7];
            String user12DifOffsetISRPO = splitUser12Grades[8];
            String user12ExamMathematicalModels = splitUser12Grades[9];
            String user12QualificationExam = splitUser12Grades[10];
            String user12ProductionPractice = splitUser12Grades[11];
            String user12UndergraduatePractice = splitUser12Grades[12];
            String user12GraduationProjectDefense = splitUser12Grades[13];
            String user12DemoExam = splitUser12Grades[14];

            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetFundamentalsPhilosophy = splitUser13Grades[2];
            String user13DifOffsetEnglishLanguage = splitUser13Grades[3];
            String user13DifOffsetPhysicalTraining = splitUser13Grades[4];
            String user13DifOffsetLegalSupportProfessionalActivity = splitUser13Grades[5];
            String user13DifOffsetNumericalMethods = splitUser13Grades[6];
            String user13DifOffsetManagementProfessionalActivity = splitUser13Grades[7];
            String user13DifOffsetISRPO = splitUser13Grades[8];
            String user13ExamMathematicalModels = splitUser13Grades[9];
            String user13QualificationExam = splitUser13Grades[10];
            String user13ProductionPractice = splitUser13Grades[11];
            String user13UndergraduatePractice = splitUser13Grades[12];
            String user13GraduationProjectDefense = splitUser13Grades[13];
            String user13DemoExam = splitUser13Grades[14];

            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetFundamentalsPhilosophy = splitUser14Grades[2];
            String user14DifOffsetEnglishLanguage = splitUser14Grades[3];
            String user14DifOffsetPhysicalTraining = splitUser14Grades[4];
            String user14DifOffsetLegalSupportProfessionalActivity = splitUser14Grades[5];
            String user14DifOffsetNumericalMethods = splitUser14Grades[6];
            String user14DifOffsetManagementProfessionalActivity = splitUser14Grades[7];
            String user14DifOffsetISRPO = splitUser14Grades[8];
            String user14ExamMathematicalModels = splitUser14Grades[9];
            String user14QualificationExam = splitUser14Grades[10];
            String user14ProductionPractice = splitUser14Grades[11];
            String user14UndergraduatePractice = splitUser14Grades[12];
            String user14GraduationProjectDefense = splitUser14Grades[13];
            String user14DemoExam = splitUser14Grades[14];

            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetFundamentalsPhilosophy = splitUser15Grades[2];
            String user15DifOffsetEnglishLanguage = splitUser15Grades[3];
            String user15DifOffsetPhysicalTraining = splitUser15Grades[4];
            String user15DifOffsetLegalSupportProfessionalActivity = splitUser15Grades[5];
            String user15DifOffsetNumericalMethods = splitUser15Grades[6];
            String user15DifOffsetManagementProfessionalActivity = splitUser15Grades[7];
            String user15DifOffsetISRPO = splitUser15Grades[8];
            String user15ExamMathematicalModels = splitUser15Grades[9];
            String user15QualificationExam = splitUser15Grades[10];
            String user15ProductionPractice = splitUser15Grades[11];
            String user15UndergraduatePractice = splitUser15Grades[12];
            String user15GraduationProjectDefense = splitUser15Grades[13];
            String user15DemoExam = splitUser15Grades[14];

            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetFundamentalsPhilosophy = splitUser16Grades[2];
            String user16DifOffsetEnglishLanguage = splitUser16Grades[3];
            String user16DifOffsetPhysicalTraining = splitUser16Grades[4];
            String user16DifOffsetLegalSupportProfessionalActivity = splitUser16Grades[5];
            String user16DifOffsetNumericalMethods = splitUser16Grades[6];
            String user16DifOffsetManagementProfessionalActivity = splitUser16Grades[7];
            String user16DifOffsetISRPO = splitUser16Grades[8];
            String user16ExamMathematicalModels = splitUser16Grades[9];
            String user16QualificationExam = splitUser16Grades[10];
            String user16ProductionPractice = splitUser16Grades[11];
            String user16UndergraduatePractice = splitUser16Grades[12];
            String user16GraduationProjectDefense = splitUser16Grades[13];
            String user16DemoExam = splitUser16Grades[14];

            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetFundamentalsPhilosophy = splitUser17Grades[2];
            String user17DifOffsetEnglishLanguage = splitUser17Grades[3];
            String user17DifOffsetPhysicalTraining = splitUser17Grades[4];
            String user17DifOffsetLegalSupportProfessionalActivity = splitUser17Grades[5];
            String user17DifOffsetNumericalMethods = splitUser17Grades[6];
            String user17DifOffsetManagementProfessionalActivity = splitUser17Grades[7];
            String user17DifOffsetISRPO = splitUser17Grades[8];
            String user17ExamMathematicalModels = splitUser17Grades[9];
            String user17QualificationExam = splitUser17Grades[10];
            String user17ProductionPractice = splitUser17Grades[11];
            String user17UndergraduatePractice = splitUser17Grades[12];
            String user17GraduationProjectDefense = splitUser17Grades[13];
            String user17DemoExam = splitUser17Grades[14];

            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetFundamentalsPhilosophy = splitUser18Grades[2];
            String user18DifOffsetEnglishLanguage = splitUser18Grades[3];
            String user18DifOffsetPhysicalTraining = splitUser18Grades[4];
            String user18DifOffsetLegalSupportProfessionalActivity = splitUser18Grades[5];
            String user18DifOffsetNumericalMethods = splitUser18Grades[6];
            String user18DifOffsetManagementProfessionalActivity = splitUser18Grades[7];
            String user18DifOffsetISRPO = splitUser18Grades[8];
            String user18ExamMathematicalModels = splitUser18Grades[9];
            String user18QualificationExam = splitUser18Grades[10];
            String user18ProductionPractice = splitUser18Grades[11];
            String user18UndergraduatePractice = splitUser18Grades[12];
            String user18GraduationProjectDefense = splitUser18Grades[13];
            String user18DemoExam = splitUser18Grades[14];

            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetFundamentalsPhilosophy = splitUser19Grades[2];
            String user19DifOffsetEnglishLanguage = splitUser19Grades[3];
            String user19DifOffsetPhysicalTraining = splitUser19Grades[4];
            String user19DifOffsetLegalSupportProfessionalActivity = splitUser19Grades[5];
            String user19DifOffsetNumericalMethods = splitUser19Grades[6];
            String user19DifOffsetManagementProfessionalActivity = splitUser19Grades[7];
            String user19DifOffsetISRPO = splitUser19Grades[8];
            String user19ExamMathematicalModels = splitUser19Grades[9];
            String user19QualificationExam = splitUser19Grades[10];
            String user19ProductionPractice = splitUser19Grades[11];
            String user19UndergraduatePractice = splitUser19Grades[12];
            String user19GraduationProjectDefense = splitUser19Grades[13];
            String user19DemoExam = splitUser19Grades[14];

            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetFundamentalsPhilosophy = splitUser20Grades[2];
            String user20DifOffsetEnglishLanguage = splitUser20Grades[3];
            String user20DifOffsetPhysicalTraining = splitUser20Grades[4];
            String user20DifOffsetLegalSupportProfessionalActivity = splitUser20Grades[5];
            String user20DifOffsetNumericalMethods = splitUser20Grades[6];
            String user20DifOffsetManagementProfessionalActivity = splitUser20Grades[7];
            String user20DifOffsetISRPO = splitUser20Grades[8];
            String user20ExamMathematicalModels = splitUser20Grades[9];
            String user20QualificationExam = splitUser20Grades[10];
            String user20ProductionPractice = splitUser20Grades[11];
            String user20UndergraduatePractice = splitUser20Grades[12];
            String user20GraduationProjectDefense = splitUser20Grades[13];
            String user20DemoExam = splitUser20Grades[14];

            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetFundamentalsPhilosophy = splitUser21Grades[2];
            String user21DifOffsetEnglishLanguage = splitUser21Grades[3];
            String user21DifOffsetPhysicalTraining = splitUser21Grades[4];
            String user21DifOffsetLegalSupportProfessionalActivity = splitUser21Grades[5];
            String user21DifOffsetNumericalMethods = splitUser21Grades[6];
            String user21DifOffsetManagementProfessionalActivity = splitUser21Grades[7];
            String user21DifOffsetISRPO = splitUser21Grades[8];
            String user21ExamMathematicalModels = splitUser21Grades[9];
            String user21QualificationExam = splitUser21Grades[10];
            String user21ProductionPractice = splitUser21Grades[11];
            String user21UndergraduatePractice = splitUser21Grades[12];
            String user21GraduationProjectDefense = splitUser21Grades[13];
            String user21DemoExam = splitUser21Grades[14];

            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetFundamentalsPhilosophy = splitUser22Grades[2];
            String user22DifOffsetEnglishLanguage = splitUser22Grades[3];
            String user22DifOffsetPhysicalTraining = splitUser22Grades[4];
            String user22DifOffsetLegalSupportProfessionalActivity = splitUser22Grades[5];
            String user22DifOffsetNumericalMethods = splitUser22Grades[6];
            String user22DifOffsetManagementProfessionalActivity = splitUser22Grades[7];
            String user22DifOffsetISRPO = splitUser22Grades[8];
            String user22ExamMathematicalModels = splitUser22Grades[9];
            String user22QualificationExam = splitUser22Grades[10];
            String user22ProductionPractice = splitUser22Grades[11];
            String user22UndergraduatePractice = splitUser22Grades[12];
            String user22GraduationProjectDefense = splitUser22Grades[13];
            String user22DemoExam = splitUser22Grades[14];

            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetFundamentalsPhilosophy = splitUser23Grades[2];
            String user23DifOffsetEnglishLanguage = splitUser23Grades[3];
            String user23DifOffsetPhysicalTraining = splitUser23Grades[4];
            String user23DifOffsetLegalSupportProfessionalActivity = splitUser23Grades[5];
            String user23DifOffsetNumericalMethods = splitUser23Grades[6];
            String user23DifOffsetManagementProfessionalActivity = splitUser23Grades[7];
            String user23DifOffsetISRPO = splitUser23Grades[8];
            String user23ExamMathematicalModels = splitUser23Grades[9];
            String user23QualificationExam = splitUser23Grades[10];
            String user23ProductionPractice = splitUser23Grades[11];
            String user23UndergraduatePractice = splitUser23Grades[12];
            String user23GraduationProjectDefense = splitUser23Grades[13];
            String user23DemoExam = splitUser23Grades[14];

            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetFundamentalsPhilosophy = splitUser24Grades[2];
            String user24DifOffsetEnglishLanguage = splitUser24Grades[3];
            String user24DifOffsetPhysicalTraining = splitUser24Grades[4];
            String user24DifOffsetLegalSupportProfessionalActivity = splitUser24Grades[5];
            String user24DifOffsetNumericalMethods = splitUser24Grades[6];
            String user24DifOffsetManagementProfessionalActivity = splitUser24Grades[7];
            String user24DifOffsetISRPO = splitUser24Grades[8];
            String user24ExamMathematicalModels = splitUser24Grades[9];
            String user24QualificationExam = splitUser24Grades[10];
            String user24ProductionPractice = splitUser24Grades[11];
            String user24UndergraduatePractice = splitUser24Grades[12];
            String user24GraduationProjectDefense = splitUser24Grades[13];
            String user24DemoExam = splitUser24Grades[14];

            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetFundamentalsPhilosophy = splitUser25Grades[2];
            String user25DifOffsetEnglishLanguage = splitUser25Grades[3];
            String user25DifOffsetPhysicalTraining = splitUser25Grades[4];
            String user25DifOffsetLegalSupportProfessionalActivity = splitUser25Grades[5];
            String user25DifOffsetNumericalMethods = splitUser25Grades[6];
            String user25DifOffsetManagementProfessionalActivity = splitUser25Grades[7];
            String user25DifOffsetISRPO = splitUser25Grades[8];
            String user25ExamMathematicalModels = splitUser25Grades[9];
            String user25QualificationExam = splitUser25Grades[10];
            String user25ProductionPractice = splitUser25Grades[11];
            String user25UndergraduatePractice = splitUser25Grades[12];
            String user25GraduationProjectDefense = splitUser25Grades[13];
            String user25DemoExam = splitUser25Grades[14];

            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetFundamentalsPhilosophy = splitUser26Grades[2];
            String user26DifOffsetEnglishLanguage = splitUser26Grades[3];
            String user26DifOffsetPhysicalTraining = splitUser26Grades[4];
            String user26DifOffsetLegalSupportProfessionalActivity = splitUser26Grades[5];
            String user26DifOffsetNumericalMethods = splitUser26Grades[6];
            String user26DifOffsetManagementProfessionalActivity = splitUser26Grades[7];
            String user26DifOffsetISRPO = splitUser26Grades[8];
            String user26ExamMathematicalModels = splitUser26Grades[9];
            String user26QualificationExam = splitUser26Grades[10];
            String user26ProductionPractice = splitUser26Grades[11];
            String user26UndergraduatePractice = splitUser26Grades[12];
            String user26GraduationProjectDefense = splitUser26Grades[13];
            String user26DemoExam = splitUser26Grades[14];

            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetFundamentalsPhilosophy = splitUser27Grades[2];
            String user27DifOffsetEnglishLanguage = splitUser27Grades[3];
            String user27DifOffsetPhysicalTraining = splitUser27Grades[4];
            String user27DifOffsetLegalSupportProfessionalActivity = splitUser27Grades[5];
            String user27DifOffsetNumericalMethods = splitUser27Grades[6];
            String user27DifOffsetManagementProfessionalActivity = splitUser27Grades[7];
            String user27DifOffsetISRPO = splitUser27Grades[8];
            String user27ExamMathematicalModels = splitUser27Grades[9];
            String user27QualificationExam = splitUser27Grades[10];
            String user27ProductionPractice = splitUser27Grades[11];
            String user27UndergraduatePractice = splitUser27Grades[12];
            String user27GraduationProjectDefense = splitUser27Grades[13];
            String user27DemoExam = splitUser27Grades[14];

            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetFundamentalsPhilosophy = splitUser28Grades[2];
            String user28DifOffsetEnglishLanguage = splitUser28Grades[3];
            String user28DifOffsetPhysicalTraining = splitUser28Grades[4];
            String user28DifOffsetLegalSupportProfessionalActivity = splitUser28Grades[5];
            String user28DifOffsetNumericalMethods = splitUser28Grades[6];
            String user28DifOffsetManagementProfessionalActivity = splitUser28Grades[7];
            String user28DifOffsetISRPO = splitUser28Grades[8];
            String user28ExamMathematicalModels = splitUser28Grades[9];
            String user28QualificationExam = splitUser28Grades[10];
            String user28ProductionPractice = splitUser28Grades[11];
            String user28UndergraduatePractice = splitUser28Grades[12];
            String user28GraduationProjectDefense = splitUser28Grades[13];
            String user28DemoExam = splitUser28Grades[14];

            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetFundamentalsPhilosophy = splitUser29Grades[2];
            String user29DifOffsetEnglishLanguage = splitUser29Grades[3];
            String user29DifOffsetPhysicalTraining = splitUser29Grades[4];
            String user29DifOffsetLegalSupportProfessionalActivity = splitUser29Grades[5];
            String user29DifOffsetNumericalMethods = splitUser29Grades[6];
            String user29DifOffsetManagementProfessionalActivity = splitUser29Grades[7];
            String user29DifOffsetISRPO = splitUser29Grades[8];
            String user29ExamMathematicalModels = splitUser29Grades[9];
            String user29QualificationExam = splitUser29Grades[10];
            String user29ProductionPractice = splitUser29Grades[11];
            String user29UndergraduatePractice = splitUser29Grades[12];
            String user29GraduationProjectDefense = splitUser29Grades[13];
            String user29DemoExam = splitUser29Grades[14];

            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetFundamentalsPhilosophy = splitUser30Grades[2];
            String user30DifOffsetEnglishLanguage = splitUser30Grades[3];
            String user30DifOffsetPhysicalTraining = splitUser30Grades[4];
            String user30DifOffsetLegalSupportProfessionalActivity = splitUser30Grades[5];
            String user30DifOffsetNumericalMethods = splitUser30Grades[6];
            String user30DifOffsetManagementProfessionalActivity = splitUser30Grades[7];
            String user30DifOffsetISRPO = splitUser30Grades[8];
            String user30ExamMathematicalModels = splitUser30Grades[9];
            String user30QualificationExam = splitUser30Grades[10];
            String user30ProductionPractice = splitUser30Grades[11];
            String user30UndergraduatePractice = splitUser30Grades[12];
            String user30GraduationProjectDefense = splitUser30Grades[13];
            String user30DemoExam = splitUser30Grades[14];

            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetFundamentalsPhilosophy = splitUser31Grades[2];
            String user31DifOffsetEnglishLanguage = splitUser31Grades[3];
            String user31DifOffsetPhysicalTraining = splitUser31Grades[4];
            String user31DifOffsetLegalSupportProfessionalActivity = splitUser31Grades[5];
            String user31DifOffsetNumericalMethods = splitUser31Grades[6];
            String user31DifOffsetManagementProfessionalActivity = splitUser31Grades[7];
            String user31DifOffsetISRPO = splitUser31Grades[8];
            String user31ExamMathematicalModels = splitUser31Grades[9];
            String user31QualificationExam = splitUser31Grades[10];
            String user31ProductionPractice = splitUser31Grades[11];
            String user31UndergraduatePractice = splitUser31Grades[12];
            String user31GraduationProjectDefense = splitUser31Grades[13];
            String user31DemoExam = splitUser31Grades[14];

            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetFundamentalsPhilosophy = splitUser32Grades[2];
            String user32DifOffsetEnglishLanguage = splitUser32Grades[3];
            String user32DifOffsetPhysicalTraining = splitUser32Grades[4];
            String user32DifOffsetLegalSupportProfessionalActivity = splitUser32Grades[5];
            String user32DifOffsetNumericalMethods = splitUser32Grades[6];
            String user32DifOffsetManagementProfessionalActivity = splitUser32Grades[7];
            String user32DifOffsetISRPO = splitUser32Grades[8];
            String user32ExamMathematicalModels = splitUser32Grades[9];
            String user32QualificationExam = splitUser32Grades[10];
            String user32ProductionPractice = splitUser32Grades[11];
            String user32UndergraduatePractice = splitUser32Grades[12];
            String user32GraduationProjectDefense = splitUser32Grades[13];
            String user32DemoExam = splitUser32Grades[14];

            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetFundamentalsPhilosophy = splitUser33Grades[2];
            String user33DifOffsetEnglishLanguage = splitUser33Grades[3];
            String user33DifOffsetPhysicalTraining = splitUser33Grades[4];
            String user33DifOffsetLegalSupportProfessionalActivity = splitUser33Grades[5];
            String user33DifOffsetNumericalMethods = splitUser33Grades[6];
            String user33DifOffsetManagementProfessionalActivity = splitUser33Grades[7];
            String user33DifOffsetISRPO = splitUser33Grades[8];
            String user33ExamMathematicalModels = splitUser33Grades[9];
            String user33QualificationExam = splitUser33Grades[10];
            String user33ProductionPractice = splitUser33Grades[11];
            String user33UndergraduatePractice = splitUser33Grades[12];
            String user33GraduationProjectDefense = splitUser33Grades[13];
            String user33DemoExam = splitUser33Grades[14];

            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetFundamentalsPhilosophy = splitUser34Grades[2];
            String user34DifOffsetEnglishLanguage = splitUser34Grades[3];
            String user34DifOffsetPhysicalTraining = splitUser34Grades[4];
            String user34DifOffsetLegalSupportProfessionalActivity = splitUser34Grades[5];
            String user34DifOffsetNumericalMethods = splitUser34Grades[6];
            String user34DifOffsetManagementProfessionalActivity = splitUser34Grades[7];
            String user34DifOffsetISRPO = splitUser34Grades[8];
            String user34ExamMathematicalModels = splitUser34Grades[9];
            String user34QualificationExam = splitUser34Grades[10];
            String user34ProductionPractice = splitUser34Grades[11];
            String user34UndergraduatePractice = splitUser34Grades[12];
            String user34GraduationProjectDefense = splitUser34Grades[13];
            String user34DemoExam = splitUser34Grades[14];

            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetFundamentalsPhilosophy = splitUser35Grades[2];
            String user35DifOffsetEnglishLanguage = splitUser35Grades[3];
            String user35DifOffsetPhysicalTraining = splitUser35Grades[4];
            String user35DifOffsetLegalSupportProfessionalActivity = splitUser35Grades[5];
            String user35DifOffsetNumericalMethods = splitUser35Grades[6];
            String user35DifOffsetManagementProfessionalActivity = splitUser35Grades[7];
            String user35DifOffsetISRPO = splitUser35Grades[8];
            String user35ExamMathematicalModels = splitUser35Grades[9];
            String user35QualificationExam = splitUser35Grades[10];
            String user35ProductionPractice = splitUser35Grades[11];
            String user35UndergraduatePractice = splitUser35Grades[12];
            String user35GraduationProjectDefense = splitUser35Grades[13];
            String user35DemoExam = splitUser35Grades[14];

            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetFundamentalsPhilosophy = splitUser36Grades[2];
            String user36DifOffsetEnglishLanguage = splitUser36Grades[3];
            String user36DifOffsetPhysicalTraining = splitUser36Grades[4];
            String user36DifOffsetLegalSupportProfessionalActivity = splitUser36Grades[5];
            String user36DifOffsetNumericalMethods = splitUser36Grades[6];
            String user36DifOffsetManagementProfessionalActivity = splitUser36Grades[7];
            String user36DifOffsetISRPO = splitUser36Grades[8];
            String user36ExamMathematicalModels = splitUser36Grades[9];
            String user36QualificationExam = splitUser36Grades[10];
            String user36ProductionPractice = splitUser36Grades[11];
            String user36UndergraduatePractice = splitUser36Grades[12];
            String user36GraduationProjectDefense = splitUser36Grades[13];
            String user36DemoExam = splitUser36Grades[14];

            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetFundamentalsPhilosophy = splitUser37Grades[2];
            String user37DifOffsetEnglishLanguage = splitUser37Grades[3];
            String user37DifOffsetPhysicalTraining = splitUser37Grades[4];
            String user37DifOffsetLegalSupportProfessionalActivity = splitUser37Grades[5];
            String user37DifOffsetNumericalMethods = splitUser37Grades[6];
            String user37DifOffsetManagementProfessionalActivity = splitUser37Grades[7];
            String user37DifOffsetISRPO = splitUser37Grades[8];
            String user37ExamMathematicalModels = splitUser37Grades[9];
            String user37QualificationExam = splitUser37Grades[10];
            String user37ProductionPractice = splitUser37Grades[11];
            String user37UndergraduatePractice = splitUser37Grades[12];
            String user37GraduationProjectDefense = splitUser37Grades[13];
            String user37DemoExam = splitUser37Grades[14];

            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetFundamentalsPhilosophy = splitUser38Grades[2];
            String user38DifOffsetEnglishLanguage = splitUser38Grades[3];
            String user38DifOffsetPhysicalTraining = splitUser38Grades[4];
            String user38DifOffsetLegalSupportProfessionalActivity = splitUser38Grades[5];
            String user38DifOffsetNumericalMethods = splitUser38Grades[6];
            String user38DifOffsetManagementProfessionalActivity = splitUser38Grades[7];
            String user38DifOffsetISRPO = splitUser38Grades[8];
            String user38ExamMathematicalModels = splitUser38Grades[9];
            String user38QualificationExam = splitUser38Grades[10];
            String user38ProductionPractice = splitUser38Grades[11];
            String user38UndergraduatePractice = splitUser38Grades[12];
            String user38GraduationProjectDefense = splitUser38Grades[13];
            String user38DemoExam = splitUser38Grades[14];

            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetFundamentalsPhilosophy = splitUser39Grades[2];
            String user39DifOffsetEnglishLanguage = splitUser39Grades[3];
            String user39DifOffsetPhysicalTraining = splitUser39Grades[4];
            String user39DifOffsetLegalSupportProfessionalActivity = splitUser39Grades[5];
            String user39DifOffsetNumericalMethods = splitUser39Grades[6];
            String user39DifOffsetManagementProfessionalActivity = splitUser39Grades[7];
            String user39DifOffsetISRPO = splitUser39Grades[8];
            String user39ExamMathematicalModels = splitUser39Grades[9];
            String user39QualificationExam = splitUser39Grades[10];
            String user39ProductionPractice = splitUser39Grades[11];
            String user39UndergraduatePractice = splitUser39Grades[12];
            String user39GraduationProjectDefense = splitUser39Grades[13];
            String user39DemoExam = splitUser39Grades[14];

            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetFundamentalsPhilosophy = splitUser40Grades[2];
            String user40DifOffsetEnglishLanguage = splitUser40Grades[3];
            String user40DifOffsetPhysicalTraining = splitUser40Grades[4];
            String user40DifOffsetLegalSupportProfessionalActivity = splitUser40Grades[5];
            String user40DifOffsetNumericalMethods = splitUser40Grades[6];
            String user40DifOffsetManagementProfessionalActivity = splitUser40Grades[7];
            String user40DifOffsetISRPO = splitUser40Grades[8];
            String user40ExamMathematicalModels = splitUser40Grades[9];
            String user40QualificationExam = splitUser40Grades[10];
            String user40ProductionPractice = splitUser40Grades[11];
            String user40UndergraduatePractice = splitUser40Grades[12];
            String user40GraduationProjectDefense = splitUser40Grades[13];
            String user40DemoExam = splitUser40Grades[14];

            ArrayList<SpecialGrade_IS_1_1Course4Semester2> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user1Id, user1Username, user1DifOffsetFundamentalsPhilosophy, user1DifOffsetEnglishLanguage, user1DifOffsetPhysicalTraining, user1DifOffsetLegalSupportProfessionalActivity, user1DifOffsetNumericalMethods, user1DifOffsetManagementProfessionalActivity, user1DifOffsetISRPO, user1ExamMathematicalModels, user1QualificationExam, user1ProductionPractice, user1UndergraduatePractice, user1GraduationProjectDefense, user1DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user2Id, user2Username, user2DifOffsetFundamentalsPhilosophy, user2DifOffsetEnglishLanguage, user2DifOffsetPhysicalTraining, user2DifOffsetLegalSupportProfessionalActivity, user2DifOffsetNumericalMethods, user2DifOffsetManagementProfessionalActivity, user2DifOffsetISRPO, user2ExamMathematicalModels, user2QualificationExam, user2ProductionPractice, user2UndergraduatePractice, user2GraduationProjectDefense, user2DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user3Id, user3Username, user3DifOffsetFundamentalsPhilosophy, user3DifOffsetEnglishLanguage, user3DifOffsetPhysicalTraining, user3DifOffsetLegalSupportProfessionalActivity, user3DifOffsetNumericalMethods, user3DifOffsetManagementProfessionalActivity, user3DifOffsetISRPO, user3ExamMathematicalModels, user3QualificationExam, user3ProductionPractice, user3UndergraduatePractice, user3GraduationProjectDefense, user3DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user4Id, user4Username, user4DifOffsetFundamentalsPhilosophy, user4DifOffsetEnglishLanguage, user4DifOffsetPhysicalTraining, user4DifOffsetLegalSupportProfessionalActivity, user4DifOffsetNumericalMethods, user4DifOffsetManagementProfessionalActivity, user4DifOffsetISRPO, user4ExamMathematicalModels, user4QualificationExam, user4ProductionPractice, user4UndergraduatePractice, user4GraduationProjectDefense, user4DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user5Id, user5Username, user5DifOffsetFundamentalsPhilosophy, user5DifOffsetEnglishLanguage, user5DifOffsetPhysicalTraining, user5DifOffsetLegalSupportProfessionalActivity, user5DifOffsetNumericalMethods, user5DifOffsetManagementProfessionalActivity, user5DifOffsetISRPO, user5ExamMathematicalModels, user5QualificationExam, user5ProductionPractice, user5UndergraduatePractice, user5GraduationProjectDefense, user5DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user6Id, user6Username, user6DifOffsetFundamentalsPhilosophy, user6DifOffsetEnglishLanguage, user6DifOffsetPhysicalTraining, user6DifOffsetLegalSupportProfessionalActivity, user6DifOffsetNumericalMethods, user6DifOffsetManagementProfessionalActivity, user6DifOffsetISRPO, user6ExamMathematicalModels, user6QualificationExam, user6ProductionPractice, user6UndergraduatePractice, user6GraduationProjectDefense, user6DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user7Id, user7Username, user7DifOffsetFundamentalsPhilosophy, user7DifOffsetEnglishLanguage, user7DifOffsetPhysicalTraining, user7DifOffsetLegalSupportProfessionalActivity, user7DifOffsetNumericalMethods, user7DifOffsetManagementProfessionalActivity, user7DifOffsetISRPO, user7ExamMathematicalModels, user7QualificationExam, user7ProductionPractice, user7UndergraduatePractice, user7GraduationProjectDefense, user7DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user8Id, user8Username, user8DifOffsetFundamentalsPhilosophy, user8DifOffsetEnglishLanguage, user8DifOffsetPhysicalTraining, user8DifOffsetLegalSupportProfessionalActivity, user8DifOffsetNumericalMethods, user8DifOffsetManagementProfessionalActivity, user8DifOffsetISRPO, user8ExamMathematicalModels, user8QualificationExam, user8ProductionPractice, user8UndergraduatePractice, user8GraduationProjectDefense, user8DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user9Id, user9Username, user9DifOffsetFundamentalsPhilosophy, user9DifOffsetEnglishLanguage, user9DifOffsetPhysicalTraining, user9DifOffsetLegalSupportProfessionalActivity, user9DifOffsetNumericalMethods, user9DifOffsetManagementProfessionalActivity, user9DifOffsetISRPO, user9ExamMathematicalModels, user9QualificationExam, user9ProductionPractice, user9UndergraduatePractice, user9GraduationProjectDefense, user9DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user10Id, user10Username, user10DifOffsetFundamentalsPhilosophy, user10DifOffsetEnglishLanguage, user10DifOffsetPhysicalTraining, user10DifOffsetLegalSupportProfessionalActivity, user10DifOffsetNumericalMethods, user10DifOffsetManagementProfessionalActivity, user10DifOffsetISRPO, user10ExamMathematicalModels, user10QualificationExam, user10ProductionPractice, user10UndergraduatePractice, user10GraduationProjectDefense, user10DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user11Id, user11Username, user11DifOffsetFundamentalsPhilosophy, user11DifOffsetEnglishLanguage, user11DifOffsetPhysicalTraining, user11DifOffsetLegalSupportProfessionalActivity, user11DifOffsetNumericalMethods, user11DifOffsetManagementProfessionalActivity, user11DifOffsetISRPO, user11ExamMathematicalModels, user11QualificationExam, user11ProductionPractice, user11UndergraduatePractice, user11GraduationProjectDefense, user11DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user12Id, user12Username, user12DifOffsetFundamentalsPhilosophy, user12DifOffsetEnglishLanguage, user12DifOffsetPhysicalTraining, user12DifOffsetLegalSupportProfessionalActivity, user12DifOffsetNumericalMethods, user12DifOffsetManagementProfessionalActivity, user12DifOffsetISRPO, user12ExamMathematicalModels, user12QualificationExam, user12ProductionPractice, user12UndergraduatePractice, user12GraduationProjectDefense, user12DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user13Id, user13Username, user13DifOffsetFundamentalsPhilosophy, user13DifOffsetEnglishLanguage, user13DifOffsetPhysicalTraining, user13DifOffsetLegalSupportProfessionalActivity, user13DifOffsetNumericalMethods, user13DifOffsetManagementProfessionalActivity, user13DifOffsetISRPO, user13ExamMathematicalModels, user13QualificationExam, user13ProductionPractice, user13UndergraduatePractice, user13GraduationProjectDefense, user13DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user14Id, user14Username, user14DifOffsetFundamentalsPhilosophy, user14DifOffsetEnglishLanguage, user14DifOffsetPhysicalTraining, user14DifOffsetLegalSupportProfessionalActivity, user14DifOffsetNumericalMethods, user14DifOffsetManagementProfessionalActivity, user14DifOffsetISRPO, user14ExamMathematicalModels, user14QualificationExam, user14ProductionPractice, user14UndergraduatePractice, user14GraduationProjectDefense, user14DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user15Id, user15Username, user15DifOffsetFundamentalsPhilosophy, user15DifOffsetEnglishLanguage, user15DifOffsetPhysicalTraining, user15DifOffsetLegalSupportProfessionalActivity, user15DifOffsetNumericalMethods, user15DifOffsetManagementProfessionalActivity, user15DifOffsetISRPO, user15ExamMathematicalModels, user15QualificationExam, user15ProductionPractice, user15UndergraduatePractice, user15GraduationProjectDefense, user15DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user16Id, user16Username, user16DifOffsetFundamentalsPhilosophy, user16DifOffsetEnglishLanguage, user16DifOffsetPhysicalTraining, user16DifOffsetLegalSupportProfessionalActivity, user16DifOffsetNumericalMethods, user16DifOffsetManagementProfessionalActivity, user16DifOffsetISRPO, user16ExamMathematicalModels, user16QualificationExam, user16ProductionPractice, user16UndergraduatePractice, user16GraduationProjectDefense, user16DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user17Id, user17Username, user17DifOffsetFundamentalsPhilosophy, user17DifOffsetEnglishLanguage, user17DifOffsetPhysicalTraining, user17DifOffsetLegalSupportProfessionalActivity, user17DifOffsetNumericalMethods, user17DifOffsetManagementProfessionalActivity, user17DifOffsetISRPO, user17ExamMathematicalModels, user17QualificationExam, user17ProductionPractice, user17UndergraduatePractice, user17GraduationProjectDefense, user17DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user18Id, user18Username, user18DifOffsetFundamentalsPhilosophy, user18DifOffsetEnglishLanguage, user18DifOffsetPhysicalTraining, user18DifOffsetLegalSupportProfessionalActivity, user18DifOffsetNumericalMethods, user18DifOffsetManagementProfessionalActivity, user18DifOffsetISRPO, user18ExamMathematicalModels, user18QualificationExam, user18ProductionPractice, user18UndergraduatePractice, user18GraduationProjectDefense, user18DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user19Id, user19Username, user19DifOffsetFundamentalsPhilosophy, user19DifOffsetEnglishLanguage, user19DifOffsetPhysicalTraining, user19DifOffsetLegalSupportProfessionalActivity, user19DifOffsetNumericalMethods, user19DifOffsetManagementProfessionalActivity, user19DifOffsetISRPO, user19ExamMathematicalModels, user19QualificationExam, user19ProductionPractice, user19UndergraduatePractice, user19GraduationProjectDefense, user19DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user20Id, user20Username, user20DifOffsetFundamentalsPhilosophy, user20DifOffsetEnglishLanguage, user20DifOffsetPhysicalTraining, user20DifOffsetLegalSupportProfessionalActivity, user20DifOffsetNumericalMethods, user20DifOffsetManagementProfessionalActivity, user20DifOffsetISRPO, user20ExamMathematicalModels, user20QualificationExam, user20ProductionPractice, user20UndergraduatePractice, user20GraduationProjectDefense, user20DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user21Id, user21Username, user21DifOffsetFundamentalsPhilosophy, user21DifOffsetEnglishLanguage, user21DifOffsetPhysicalTraining, user21DifOffsetLegalSupportProfessionalActivity, user21DifOffsetNumericalMethods, user21DifOffsetManagementProfessionalActivity, user21DifOffsetISRPO, user21ExamMathematicalModels, user21QualificationExam, user21ProductionPractice, user21UndergraduatePractice, user21GraduationProjectDefense, user21DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user22Id, user22Username, user22DifOffsetFundamentalsPhilosophy, user22DifOffsetEnglishLanguage, user22DifOffsetPhysicalTraining, user22DifOffsetLegalSupportProfessionalActivity, user22DifOffsetNumericalMethods, user22DifOffsetManagementProfessionalActivity, user22DifOffsetISRPO, user22ExamMathematicalModels, user22QualificationExam, user22ProductionPractice, user22UndergraduatePractice, user22GraduationProjectDefense, user22DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user23Id, user23Username, user23DifOffsetFundamentalsPhilosophy, user23DifOffsetEnglishLanguage, user23DifOffsetPhysicalTraining, user23DifOffsetLegalSupportProfessionalActivity, user23DifOffsetNumericalMethods, user23DifOffsetManagementProfessionalActivity, user23DifOffsetISRPO, user23ExamMathematicalModels, user23QualificationExam, user23ProductionPractice, user23UndergraduatePractice, user23GraduationProjectDefense, user23DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user24Id, user24Username, user24DifOffsetFundamentalsPhilosophy, user24DifOffsetEnglishLanguage, user24DifOffsetPhysicalTraining, user24DifOffsetLegalSupportProfessionalActivity, user24DifOffsetNumericalMethods, user24DifOffsetManagementProfessionalActivity, user24DifOffsetISRPO, user24ExamMathematicalModels, user24QualificationExam, user24ProductionPractice, user24UndergraduatePractice, user24GraduationProjectDefense, user24DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user25Id, user25Username, user25DifOffsetFundamentalsPhilosophy, user25DifOffsetEnglishLanguage, user25DifOffsetPhysicalTraining, user25DifOffsetLegalSupportProfessionalActivity, user25DifOffsetNumericalMethods, user25DifOffsetManagementProfessionalActivity, user25DifOffsetISRPO, user25ExamMathematicalModels, user25QualificationExam, user25ProductionPractice, user25UndergraduatePractice, user25GraduationProjectDefense, user25DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user26Id, user26Username, user26DifOffsetFundamentalsPhilosophy, user26DifOffsetEnglishLanguage, user26DifOffsetPhysicalTraining, user26DifOffsetLegalSupportProfessionalActivity, user26DifOffsetNumericalMethods, user26DifOffsetManagementProfessionalActivity, user26DifOffsetISRPO, user26ExamMathematicalModels, user26QualificationExam, user26ProductionPractice, user26UndergraduatePractice, user26GraduationProjectDefense, user26DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user27Id, user27Username, user27DifOffsetFundamentalsPhilosophy, user27DifOffsetEnglishLanguage, user27DifOffsetPhysicalTraining, user27DifOffsetLegalSupportProfessionalActivity, user27DifOffsetNumericalMethods, user27DifOffsetManagementProfessionalActivity, user27DifOffsetISRPO, user27ExamMathematicalModels, user27QualificationExam, user27ProductionPractice, user27UndergraduatePractice, user27GraduationProjectDefense, user27DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user28Id, user28Username, user28DifOffsetFundamentalsPhilosophy, user28DifOffsetEnglishLanguage, user28DifOffsetPhysicalTraining, user28DifOffsetLegalSupportProfessionalActivity, user28DifOffsetNumericalMethods, user28DifOffsetManagementProfessionalActivity, user28DifOffsetISRPO, user28ExamMathematicalModels, user28QualificationExam, user28ProductionPractice, user28UndergraduatePractice, user28GraduationProjectDefense, user28DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user29Id, user29Username, user29DifOffsetFundamentalsPhilosophy, user29DifOffsetEnglishLanguage, user29DifOffsetPhysicalTraining, user29DifOffsetLegalSupportProfessionalActivity, user29DifOffsetNumericalMethods, user29DifOffsetManagementProfessionalActivity, user29DifOffsetISRPO, user29ExamMathematicalModels, user29QualificationExam, user29ProductionPractice, user29UndergraduatePractice, user29GraduationProjectDefense, user29DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user30Id, user30Username, user30DifOffsetFundamentalsPhilosophy, user30DifOffsetEnglishLanguage, user30DifOffsetPhysicalTraining, user30DifOffsetLegalSupportProfessionalActivity, user30DifOffsetNumericalMethods, user30DifOffsetManagementProfessionalActivity, user30DifOffsetISRPO, user30ExamMathematicalModels, user30QualificationExam, user30ProductionPractice, user30UndergraduatePractice, user30GraduationProjectDefense, user30DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user31Id, user31Username, user31DifOffsetFundamentalsPhilosophy, user31DifOffsetEnglishLanguage, user31DifOffsetPhysicalTraining, user31DifOffsetLegalSupportProfessionalActivity, user31DifOffsetNumericalMethods, user31DifOffsetManagementProfessionalActivity, user31DifOffsetISRPO, user31ExamMathematicalModels, user31QualificationExam, user31ProductionPractice, user31UndergraduatePractice, user31GraduationProjectDefense, user31DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user32Id, user32Username, user32DifOffsetFundamentalsPhilosophy, user32DifOffsetEnglishLanguage, user32DifOffsetPhysicalTraining, user32DifOffsetLegalSupportProfessionalActivity, user32DifOffsetNumericalMethods, user32DifOffsetManagementProfessionalActivity, user32DifOffsetISRPO, user32ExamMathematicalModels, user32QualificationExam, user32ProductionPractice, user32UndergraduatePractice, user32GraduationProjectDefense, user32DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user33Id, user33Username, user33DifOffsetFundamentalsPhilosophy, user33DifOffsetEnglishLanguage, user33DifOffsetPhysicalTraining, user33DifOffsetLegalSupportProfessionalActivity, user33DifOffsetNumericalMethods, user33DifOffsetManagementProfessionalActivity, user33DifOffsetISRPO, user33ExamMathematicalModels, user33QualificationExam, user33ProductionPractice, user33UndergraduatePractice, user33GraduationProjectDefense, user33DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user34Id, user34Username, user34DifOffsetFundamentalsPhilosophy, user34DifOffsetEnglishLanguage, user34DifOffsetPhysicalTraining, user34DifOffsetLegalSupportProfessionalActivity, user34DifOffsetNumericalMethods, user34DifOffsetManagementProfessionalActivity, user34DifOffsetISRPO, user34ExamMathematicalModels, user34QualificationExam, user34ProductionPractice, user34UndergraduatePractice, user34GraduationProjectDefense, user34DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user35Id, user35Username, user35DifOffsetFundamentalsPhilosophy, user35DifOffsetEnglishLanguage, user35DifOffsetPhysicalTraining, user35DifOffsetLegalSupportProfessionalActivity, user35DifOffsetNumericalMethods, user35DifOffsetManagementProfessionalActivity, user35DifOffsetISRPO, user35ExamMathematicalModels, user35QualificationExam, user35ProductionPractice, user35UndergraduatePractice, user35GraduationProjectDefense, user35DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user36Id, user36Username, user36DifOffsetFundamentalsPhilosophy, user36DifOffsetEnglishLanguage, user36DifOffsetPhysicalTraining, user36DifOffsetLegalSupportProfessionalActivity, user36DifOffsetNumericalMethods, user36DifOffsetManagementProfessionalActivity, user36DifOffsetISRPO, user36ExamMathematicalModels, user36QualificationExam, user36ProductionPractice, user36UndergraduatePractice, user36GraduationProjectDefense, user36DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user37Id, user37Username, user37DifOffsetFundamentalsPhilosophy, user37DifOffsetEnglishLanguage, user37DifOffsetPhysicalTraining, user37DifOffsetLegalSupportProfessionalActivity, user37DifOffsetNumericalMethods, user37DifOffsetManagementProfessionalActivity, user37DifOffsetISRPO, user37ExamMathematicalModels, user37QualificationExam, user37ProductionPractice, user37UndergraduatePractice, user37GraduationProjectDefense, user37DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user38Id, user38Username, user38DifOffsetFundamentalsPhilosophy, user38DifOffsetEnglishLanguage, user38DifOffsetPhysicalTraining, user38DifOffsetLegalSupportProfessionalActivity, user38DifOffsetNumericalMethods, user38DifOffsetManagementProfessionalActivity, user38DifOffsetISRPO, user38ExamMathematicalModels, user38QualificationExam, user38ProductionPractice, user38UndergraduatePractice, user38GraduationProjectDefense, user38DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user39Id, user39Username, user39DifOffsetFundamentalsPhilosophy, user39DifOffsetEnglishLanguage, user39DifOffsetPhysicalTraining, user39DifOffsetLegalSupportProfessionalActivity, user39DifOffsetNumericalMethods, user39DifOffsetManagementProfessionalActivity, user39DifOffsetISRPO, user39ExamMathematicalModels, user39QualificationExam, user39ProductionPractice, user39UndergraduatePractice, user39GraduationProjectDefense, user39DemoExam));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester2(user40Id, user40Username, user40DifOffsetFundamentalsPhilosophy, user40DifOffsetEnglishLanguage, user40DifOffsetPhysicalTraining, user40DifOffsetLegalSupportProfessionalActivity, user40DifOffsetNumericalMethods, user40DifOffsetManagementProfessionalActivity, user40DifOffsetISRPO, user40ExamMathematicalModels, user40QualificationExam, user40ProductionPractice, user40UndergraduatePractice, user40GraduationProjectDefense, user40DemoExam));

            if (specialGradeIs11Course4Semester2Repository.findAll().isEmpty()) {
                specialGradeIs11Course4Semester2Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course4Semester2> user1Row = specialGradeIs11Course4Semester2Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User1 = user1Row.get();
            specialGrade_IS_1_1Course4Semester2User1.setUsername(user1Username);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetFundamentalsPhilosophy(user1DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetEnglishLanguage(user1DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetPhysicalTraining(user1DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetLegalSupportProfessionalActivity(user1DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetNumericalMethods(user1DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetManagementProfessionalActivity(user1DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User1.setDifOffsetISRPO(user1DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User1.setExamMathematicalModels(user1ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User1.setQualificationExam(user1QualificationExam);
            specialGrade_IS_1_1Course4Semester2User1.setProductionPractice(user1ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User1.setUndergraduatePractice(user1UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User1.setGraduationProjectDefense(user1GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User1.setDemoExam(user1DemoExam);
            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course4Semester2> user2Row = specialGradeIs11Course4Semester2Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User2 = user2Row.get();
            specialGrade_IS_1_1Course4Semester2User2.setUsername(user2Username);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetFundamentalsPhilosophy(user2DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetEnglishLanguage(user2DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetPhysicalTraining(user2DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetLegalSupportProfessionalActivity(user2DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetNumericalMethods(user2DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetManagementProfessionalActivity(user2DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User2.setDifOffsetISRPO(user2DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User2.setExamMathematicalModels(user2ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User2.setQualificationExam(user2QualificationExam);
            specialGrade_IS_1_1Course4Semester2User2.setProductionPractice(user2ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User2.setUndergraduatePractice(user2UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User2.setGraduationProjectDefense(user2GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User2.setDemoExam(user2DemoExam);
            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course4Semester2> user3Row = specialGradeIs11Course4Semester2Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User3 = user3Row.get();
            specialGrade_IS_1_1Course4Semester2User3.setUsername(user3Username);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetFundamentalsPhilosophy(user3DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetEnglishLanguage(user3DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetPhysicalTraining(user3DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetLegalSupportProfessionalActivity(user3DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetNumericalMethods(user3DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetManagementProfessionalActivity(user3DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User3.setDifOffsetISRPO(user3DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User3.setExamMathematicalModels(user3ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User3.setQualificationExam(user3QualificationExam);
            specialGrade_IS_1_1Course4Semester2User3.setProductionPractice(user3ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User3.setUndergraduatePractice(user3UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User3.setGraduationProjectDefense(user3GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User3.setDemoExam(user3DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course4Semester2> user4Row = specialGradeIs11Course4Semester2Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User4 = user4Row.get();
            specialGrade_IS_1_1Course4Semester2User4.setUsername(user4Username);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetFundamentalsPhilosophy(user4DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetEnglishLanguage(user4DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetPhysicalTraining(user4DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetLegalSupportProfessionalActivity(user4DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetNumericalMethods(user4DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetManagementProfessionalActivity(user4DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User4.setDifOffsetISRPO(user4DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User4.setExamMathematicalModels(user4ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User4.setQualificationExam(user4QualificationExam);
            specialGrade_IS_1_1Course4Semester2User4.setProductionPractice(user4ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User4.setUndergraduatePractice(user4UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User4.setGraduationProjectDefense(user4GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User4.setDemoExam(user4DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course4Semester2> user5Row = specialGradeIs11Course4Semester2Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User5 = user5Row.get();
            specialGrade_IS_1_1Course4Semester2User5.setUsername(user5Username);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetFundamentalsPhilosophy(user5DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetEnglishLanguage(user5DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetPhysicalTraining(user5DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetLegalSupportProfessionalActivity(user5DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetNumericalMethods(user5DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetManagementProfessionalActivity(user5DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User5.setDifOffsetISRPO(user5DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User5.setExamMathematicalModels(user5ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User5.setQualificationExam(user5QualificationExam);
            specialGrade_IS_1_1Course4Semester2User5.setProductionPractice(user5ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User5.setUndergraduatePractice(user5UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User5.setGraduationProjectDefense(user5GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User5.setDemoExam(user5DemoExam);
            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course4Semester2> user6Row = specialGradeIs11Course4Semester2Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User6 = user6Row.get();
            specialGrade_IS_1_1Course4Semester2User6.setUsername(user6Username);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetFundamentalsPhilosophy(user6DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetEnglishLanguage(user6DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetPhysicalTraining(user6DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetLegalSupportProfessionalActivity(user6DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetNumericalMethods(user6DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetManagementProfessionalActivity(user6DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User6.setDifOffsetISRPO(user6DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User6.setExamMathematicalModels(user6ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User6.setQualificationExam(user6QualificationExam);
            specialGrade_IS_1_1Course4Semester2User6.setProductionPractice(user6ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User6.setUndergraduatePractice(user6UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User6.setGraduationProjectDefense(user6GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User6.setDemoExam(user6DemoExam);
            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course4Semester2> user7Row = specialGradeIs11Course4Semester2Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User7 = user7Row.get();
            specialGrade_IS_1_1Course4Semester2User7.setUsername(user7Username);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetFundamentalsPhilosophy(user7DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetEnglishLanguage(user7DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetPhysicalTraining(user7DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetLegalSupportProfessionalActivity(user7DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetNumericalMethods(user7DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetManagementProfessionalActivity(user7DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User7.setDifOffsetISRPO(user7DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User7.setExamMathematicalModels(user7ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User7.setQualificationExam(user7QualificationExam);
            specialGrade_IS_1_1Course4Semester2User7.setProductionPractice(user7ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User7.setUndergraduatePractice(user7UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User7.setGraduationProjectDefense(user7GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User7.setDemoExam(user7DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course4Semester2> user8Row = specialGradeIs11Course4Semester2Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User8 = user8Row.get();
            specialGrade_IS_1_1Course4Semester2User8.setUsername(user8Username);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetFundamentalsPhilosophy(user8DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetEnglishLanguage(user8DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetPhysicalTraining(user8DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetLegalSupportProfessionalActivity(user8DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetNumericalMethods(user8DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetManagementProfessionalActivity(user8DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User8.setDifOffsetISRPO(user8DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User8.setExamMathematicalModels(user8ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User8.setQualificationExam(user8QualificationExam);
            specialGrade_IS_1_1Course4Semester2User8.setProductionPractice(user8ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User8.setUndergraduatePractice(user8UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User8.setGraduationProjectDefense(user8GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User8.setDemoExam(user8DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course4Semester2> user9Row = specialGradeIs11Course4Semester2Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User9 = user9Row.get();
            specialGrade_IS_1_1Course4Semester2User9.setUsername(user9Username);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetFundamentalsPhilosophy(user9DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetEnglishLanguage(user9DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetPhysicalTraining(user9DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetLegalSupportProfessionalActivity(user9DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetNumericalMethods(user9DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetManagementProfessionalActivity(user9DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User9.setDifOffsetISRPO(user9DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User9.setExamMathematicalModels(user9ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User9.setQualificationExam(user9QualificationExam);
            specialGrade_IS_1_1Course4Semester2User9.setProductionPractice(user9ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User9.setUndergraduatePractice(user9UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User9.setGraduationProjectDefense(user9GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User9.setDemoExam(user9DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course4Semester2> user10Row = specialGradeIs11Course4Semester2Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User10 = user10Row.get();
            specialGrade_IS_1_1Course4Semester2User10.setUsername(user10Username);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetFundamentalsPhilosophy(user10DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetEnglishLanguage(user10DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetPhysicalTraining(user10DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetLegalSupportProfessionalActivity(user10DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetNumericalMethods(user10DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetManagementProfessionalActivity(user10DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User10.setDifOffsetISRPO(user10DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User10.setExamMathematicalModels(user10ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User10.setQualificationExam(user10QualificationExam);
            specialGrade_IS_1_1Course4Semester2User10.setProductionPractice(user10ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User10.setUndergraduatePractice(user10UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User10.setGraduationProjectDefense(user10GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User10.setDemoExam(user10DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course4Semester2> user11Row = specialGradeIs11Course4Semester2Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User11 = user11Row.get();
            specialGrade_IS_1_1Course4Semester2User11.setUsername(user11Username);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetFundamentalsPhilosophy(user11DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetEnglishLanguage(user11DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetPhysicalTraining(user11DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetLegalSupportProfessionalActivity(user11DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetNumericalMethods(user11DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetManagementProfessionalActivity(user11DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User11.setDifOffsetISRPO(user11DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User11.setExamMathematicalModels(user11ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User11.setQualificationExam(user11QualificationExam);
            specialGrade_IS_1_1Course4Semester2User11.setProductionPractice(user11ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User11.setUndergraduatePractice(user11UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User11.setGraduationProjectDefense(user11GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User11.setDemoExam(user11DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course4Semester2> user12Row = specialGradeIs11Course4Semester2Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User12 = user12Row.get();
            specialGrade_IS_1_1Course4Semester2User12.setUsername(user12Username);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetFundamentalsPhilosophy(user12DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetEnglishLanguage(user12DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetPhysicalTraining(user12DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetLegalSupportProfessionalActivity(user12DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetNumericalMethods(user12DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetManagementProfessionalActivity(user12DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User12.setDifOffsetISRPO(user12DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User12.setExamMathematicalModels(user12ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User12.setQualificationExam(user12QualificationExam);
            specialGrade_IS_1_1Course4Semester2User12.setProductionPractice(user12ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User12.setUndergraduatePractice(user12UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User12.setGraduationProjectDefense(user12GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User12.setDemoExam(user12DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course4Semester2> user13Row = specialGradeIs11Course4Semester2Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User13 = user13Row.get();
            specialGrade_IS_1_1Course4Semester2User13.setUsername(user13Username);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetFundamentalsPhilosophy(user13DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetEnglishLanguage(user13DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetPhysicalTraining(user13DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetLegalSupportProfessionalActivity(user13DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetNumericalMethods(user13DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetManagementProfessionalActivity(user13DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User13.setDifOffsetISRPO(user13DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User13.setExamMathematicalModels(user13ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User13.setQualificationExam(user13QualificationExam);
            specialGrade_IS_1_1Course4Semester2User13.setProductionPractice(user13ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User13.setUndergraduatePractice(user13UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User13.setGraduationProjectDefense(user13GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User13.setDemoExam(user13DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course4Semester2> user14Row = specialGradeIs11Course4Semester2Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User14 = user14Row.get();
            specialGrade_IS_1_1Course4Semester2User14.setUsername(user14Username);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetFundamentalsPhilosophy(user14DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetEnglishLanguage(user14DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetPhysicalTraining(user14DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetLegalSupportProfessionalActivity(user14DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetNumericalMethods(user14DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetManagementProfessionalActivity(user14DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User14.setDifOffsetISRPO(user14DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User14.setExamMathematicalModels(user14ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User14.setQualificationExam(user14QualificationExam);
            specialGrade_IS_1_1Course4Semester2User14.setProductionPractice(user14ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User14.setUndergraduatePractice(user14UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User14.setGraduationProjectDefense(user14GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User14.setDemoExam(user14DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course4Semester2> user15Row = specialGradeIs11Course4Semester2Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User15 = user15Row.get();
            specialGrade_IS_1_1Course4Semester2User15.setUsername(user15Username);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetFundamentalsPhilosophy(user15DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetEnglishLanguage(user15DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetPhysicalTraining(user15DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetLegalSupportProfessionalActivity(user15DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetNumericalMethods(user15DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetManagementProfessionalActivity(user15DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User15.setDifOffsetISRPO(user15DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User15.setExamMathematicalModels(user15ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User15.setQualificationExam(user15QualificationExam);
            specialGrade_IS_1_1Course4Semester2User15.setProductionPractice(user15ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User15.setUndergraduatePractice(user15UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User15.setGraduationProjectDefense(user15GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User15.setDemoExam(user15DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course4Semester2> user16Row = specialGradeIs11Course4Semester2Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User16 = user16Row.get();
            specialGrade_IS_1_1Course4Semester2User16.setUsername(user16Username);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetFundamentalsPhilosophy(user16DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetEnglishLanguage(user16DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetPhysicalTraining(user16DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetLegalSupportProfessionalActivity(user16DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetNumericalMethods(user16DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetManagementProfessionalActivity(user16DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User16.setDifOffsetISRPO(user16DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User16.setExamMathematicalModels(user16ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User16.setQualificationExam(user16QualificationExam);
            specialGrade_IS_1_1Course4Semester2User16.setProductionPractice(user16ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User16.setUndergraduatePractice(user16UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User16.setGraduationProjectDefense(user16GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User16.setDemoExam(user16DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course4Semester2> user17Row = specialGradeIs11Course4Semester2Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User17 = user17Row.get();
            specialGrade_IS_1_1Course4Semester2User17.setUsername(user17Username);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetFundamentalsPhilosophy(user17DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetEnglishLanguage(user17DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetPhysicalTraining(user17DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetLegalSupportProfessionalActivity(user17DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetNumericalMethods(user17DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetManagementProfessionalActivity(user17DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User17.setDifOffsetISRPO(user17DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User17.setExamMathematicalModels(user17ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User17.setQualificationExam(user17QualificationExam);
            specialGrade_IS_1_1Course4Semester2User17.setProductionPractice(user17ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User17.setUndergraduatePractice(user17UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User17.setGraduationProjectDefense(user17GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User17.setDemoExam(user17DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course4Semester2> user18Row = specialGradeIs11Course4Semester2Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User18 = user18Row.get();
            specialGrade_IS_1_1Course4Semester2User18.setUsername(user18Username);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetFundamentalsPhilosophy(user18DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetEnglishLanguage(user18DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetPhysicalTraining(user18DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetLegalSupportProfessionalActivity(user18DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetNumericalMethods(user18DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetManagementProfessionalActivity(user18DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User18.setDifOffsetISRPO(user18DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User18.setExamMathematicalModels(user18ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User18.setQualificationExam(user18QualificationExam);
            specialGrade_IS_1_1Course4Semester2User18.setProductionPractice(user18ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User18.setUndergraduatePractice(user18UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User18.setGraduationProjectDefense(user18GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User18.setDemoExam(user18DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course4Semester2> user19Row = specialGradeIs11Course4Semester2Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User19 = user19Row.get();
            specialGrade_IS_1_1Course4Semester2User19.setUsername(user19Username);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetFundamentalsPhilosophy(user19DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetEnglishLanguage(user19DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetPhysicalTraining(user19DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetLegalSupportProfessionalActivity(user19DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetNumericalMethods(user19DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetManagementProfessionalActivity(user19DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User19.setDifOffsetISRPO(user19DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User19.setExamMathematicalModels(user19ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User19.setQualificationExam(user19QualificationExam);
            specialGrade_IS_1_1Course4Semester2User19.setProductionPractice(user19ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User19.setUndergraduatePractice(user19UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User19.setGraduationProjectDefense(user19GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User19.setDemoExam(user19DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course4Semester2> user20Row = specialGradeIs11Course4Semester2Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User20 = user20Row.get();
            specialGrade_IS_1_1Course4Semester2User20.setUsername(user20Username);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetFundamentalsPhilosophy(user20DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetEnglishLanguage(user20DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetPhysicalTraining(user20DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetLegalSupportProfessionalActivity(user20DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetNumericalMethods(user20DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetManagementProfessionalActivity(user20DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User20.setDifOffsetISRPO(user20DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User20.setExamMathematicalModels(user20ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User20.setQualificationExam(user20QualificationExam);
            specialGrade_IS_1_1Course4Semester2User20.setProductionPractice(user20ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User20.setUndergraduatePractice(user20UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User20.setGraduationProjectDefense(user20GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User20.setDemoExam(user20DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course4Semester2> user21Row = specialGradeIs11Course4Semester2Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User21 = user21Row.get();
            specialGrade_IS_1_1Course4Semester2User21.setUsername(user21Username);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetFundamentalsPhilosophy(user21DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetEnglishLanguage(user21DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetPhysicalTraining(user21DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetLegalSupportProfessionalActivity(user21DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetNumericalMethods(user21DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetManagementProfessionalActivity(user21DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User21.setDifOffsetISRPO(user21DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User21.setExamMathematicalModels(user21ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User21.setQualificationExam(user21QualificationExam);
            specialGrade_IS_1_1Course4Semester2User21.setProductionPractice(user21ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User21.setUndergraduatePractice(user21UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User21.setGraduationProjectDefense(user21GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User21.setDemoExam(user21DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course4Semester2> user22Row = specialGradeIs11Course4Semester2Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User22 = user22Row.get();
            specialGrade_IS_1_1Course4Semester2User22.setUsername(user22Username);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetFundamentalsPhilosophy(user22DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetEnglishLanguage(user22DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetPhysicalTraining(user22DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetLegalSupportProfessionalActivity(user22DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetNumericalMethods(user22DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetManagementProfessionalActivity(user22DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User22.setDifOffsetISRPO(user22DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User22.setExamMathematicalModels(user22ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User22.setQualificationExam(user22QualificationExam);
            specialGrade_IS_1_1Course4Semester2User22.setProductionPractice(user22ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User22.setUndergraduatePractice(user22UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User22.setGraduationProjectDefense(user22GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User22.setDemoExam(user22DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course4Semester2> user23Row = specialGradeIs11Course4Semester2Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User23 = user23Row.get();
            specialGrade_IS_1_1Course4Semester2User23.setUsername(user23Username);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetFundamentalsPhilosophy(user23DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetEnglishLanguage(user23DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetPhysicalTraining(user23DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetLegalSupportProfessionalActivity(user23DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetNumericalMethods(user23DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetManagementProfessionalActivity(user23DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User23.setDifOffsetISRPO(user23DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User23.setExamMathematicalModels(user23ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User23.setQualificationExam(user23QualificationExam);
            specialGrade_IS_1_1Course4Semester2User23.setProductionPractice(user23ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User23.setUndergraduatePractice(user23UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User23.setGraduationProjectDefense(user23GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User23.setDemoExam(user23DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course4Semester2> user24Row = specialGradeIs11Course4Semester2Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User24 = user24Row.get();
            specialGrade_IS_1_1Course4Semester2User24.setUsername(user24Username);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetFundamentalsPhilosophy(user24DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetEnglishLanguage(user24DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetPhysicalTraining(user24DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetLegalSupportProfessionalActivity(user24DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetNumericalMethods(user24DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetManagementProfessionalActivity(user24DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User24.setDifOffsetISRPO(user24DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User24.setExamMathematicalModels(user24ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User24.setQualificationExam(user24QualificationExam);
            specialGrade_IS_1_1Course4Semester2User24.setProductionPractice(user24ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User24.setUndergraduatePractice(user24UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User24.setGraduationProjectDefense(user24GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User24.setDemoExam(user24DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course4Semester2> user25Row = specialGradeIs11Course4Semester2Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User25 = user25Row.get();
            specialGrade_IS_1_1Course4Semester2User25.setUsername(user25Username);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetFundamentalsPhilosophy(user25DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetEnglishLanguage(user25DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetPhysicalTraining(user25DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetLegalSupportProfessionalActivity(user25DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetNumericalMethods(user25DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetManagementProfessionalActivity(user25DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User25.setDifOffsetISRPO(user25DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User25.setExamMathematicalModels(user25ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User25.setQualificationExam(user25QualificationExam);
            specialGrade_IS_1_1Course4Semester2User25.setProductionPractice(user25ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User25.setUndergraduatePractice(user25UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User25.setGraduationProjectDefense(user25GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User25.setDemoExam(user25DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course4Semester2> user26Row = specialGradeIs11Course4Semester2Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User26 = user26Row.get();
            specialGrade_IS_1_1Course4Semester2User26.setUsername(user26Username);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetFundamentalsPhilosophy(user26DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetEnglishLanguage(user26DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetPhysicalTraining(user26DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetLegalSupportProfessionalActivity(user26DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetNumericalMethods(user26DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetManagementProfessionalActivity(user26DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User26.setDifOffsetISRPO(user26DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User26.setExamMathematicalModels(user26ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User26.setQualificationExam(user26QualificationExam);
            specialGrade_IS_1_1Course4Semester2User26.setProductionPractice(user26ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User26.setUndergraduatePractice(user26UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User26.setGraduationProjectDefense(user26GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User26.setDemoExam(user26DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course4Semester2> user27Row = specialGradeIs11Course4Semester2Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User27 = user27Row.get();
            specialGrade_IS_1_1Course4Semester2User27.setUsername(user27Username);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetFundamentalsPhilosophy(user27DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetEnglishLanguage(user27DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetPhysicalTraining(user27DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetLegalSupportProfessionalActivity(user27DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetNumericalMethods(user27DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetManagementProfessionalActivity(user27DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User27.setDifOffsetISRPO(user27DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User27.setExamMathematicalModels(user27ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User27.setQualificationExam(user27QualificationExam);
            specialGrade_IS_1_1Course4Semester2User27.setProductionPractice(user27ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User27.setUndergraduatePractice(user27UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User27.setGraduationProjectDefense(user27GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User27.setDemoExam(user27DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course4Semester2> user28Row = specialGradeIs11Course4Semester2Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User28 = user28Row.get();
            specialGrade_IS_1_1Course4Semester2User28.setUsername(user28Username);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetFundamentalsPhilosophy(user28DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetEnglishLanguage(user28DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetPhysicalTraining(user28DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetLegalSupportProfessionalActivity(user28DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetNumericalMethods(user28DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetManagementProfessionalActivity(user28DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User28.setDifOffsetISRPO(user28DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User28.setExamMathematicalModels(user28ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User28.setQualificationExam(user28QualificationExam);
            specialGrade_IS_1_1Course4Semester2User28.setProductionPractice(user28ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User28.setUndergraduatePractice(user28UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User28.setGraduationProjectDefense(user28GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User28.setDemoExam(user28DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course4Semester2> user29Row = specialGradeIs11Course4Semester2Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User29 = user29Row.get();
            specialGrade_IS_1_1Course4Semester2User29.setUsername(user29Username);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetFundamentalsPhilosophy(user29DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetEnglishLanguage(user29DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetPhysicalTraining(user29DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetLegalSupportProfessionalActivity(user29DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetNumericalMethods(user29DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetManagementProfessionalActivity(user29DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User29.setDifOffsetISRPO(user29DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User29.setExamMathematicalModels(user29ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User29.setQualificationExam(user29QualificationExam);
            specialGrade_IS_1_1Course4Semester2User29.setProductionPractice(user29ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User29.setUndergraduatePractice(user29UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User29.setGraduationProjectDefense(user29GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User29.setDemoExam(user29DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course4Semester2> user30Row = specialGradeIs11Course4Semester2Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User30 = user30Row.get();
            specialGrade_IS_1_1Course4Semester2User30.setUsername(user30Username);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetFundamentalsPhilosophy(user30DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetEnglishLanguage(user30DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetPhysicalTraining(user30DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetLegalSupportProfessionalActivity(user30DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetNumericalMethods(user30DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetManagementProfessionalActivity(user30DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User30.setDifOffsetISRPO(user30DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User30.setExamMathematicalModels(user30ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User30.setQualificationExam(user30QualificationExam);
            specialGrade_IS_1_1Course4Semester2User30.setProductionPractice(user30ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User30.setUndergraduatePractice(user30UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User30.setGraduationProjectDefense(user30GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User30.setDemoExam(user30DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course4Semester2> user31Row = specialGradeIs11Course4Semester2Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User31 = user31Row.get();
            specialGrade_IS_1_1Course4Semester2User31.setUsername(user31Username);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetFundamentalsPhilosophy(user31DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetEnglishLanguage(user31DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetPhysicalTraining(user31DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetLegalSupportProfessionalActivity(user31DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetNumericalMethods(user31DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetManagementProfessionalActivity(user31DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User31.setDifOffsetISRPO(user31DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User31.setExamMathematicalModels(user31ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User31.setQualificationExam(user31QualificationExam);
            specialGrade_IS_1_1Course4Semester2User31.setProductionPractice(user31ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User31.setUndergraduatePractice(user31UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User31.setGraduationProjectDefense(user31GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User31.setDemoExam(user31DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course4Semester2> user32Row = specialGradeIs11Course4Semester2Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User32 = user32Row.get();
            specialGrade_IS_1_1Course4Semester2User32.setUsername(user32Username);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetFundamentalsPhilosophy(user32DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetEnglishLanguage(user32DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetPhysicalTraining(user32DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetLegalSupportProfessionalActivity(user32DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetNumericalMethods(user32DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetManagementProfessionalActivity(user32DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User32.setDifOffsetISRPO(user32DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User32.setExamMathematicalModels(user32ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User32.setQualificationExam(user32QualificationExam);
            specialGrade_IS_1_1Course4Semester2User32.setProductionPractice(user32ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User32.setUndergraduatePractice(user32UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User32.setGraduationProjectDefense(user32GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User32.setDemoExam(user32DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course4Semester2> user33Row = specialGradeIs11Course4Semester2Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User33 = user33Row.get();
            specialGrade_IS_1_1Course4Semester2User33.setUsername(user33Username);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetFundamentalsPhilosophy(user33DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetEnglishLanguage(user33DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetPhysicalTraining(user33DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetLegalSupportProfessionalActivity(user33DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetNumericalMethods(user33DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetManagementProfessionalActivity(user33DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User33.setDifOffsetISRPO(user33DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User33.setExamMathematicalModels(user33ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User33.setQualificationExam(user33QualificationExam);
            specialGrade_IS_1_1Course4Semester2User33.setProductionPractice(user33ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User33.setUndergraduatePractice(user33UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User33.setGraduationProjectDefense(user33GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User33.setDemoExam(user33DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course4Semester2> user34Row = specialGradeIs11Course4Semester2Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User34 = user34Row.get();
            specialGrade_IS_1_1Course4Semester2User34.setUsername(user34Username);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetFundamentalsPhilosophy(user34DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetEnglishLanguage(user34DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetPhysicalTraining(user34DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetLegalSupportProfessionalActivity(user34DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetNumericalMethods(user34DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetManagementProfessionalActivity(user34DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User34.setDifOffsetISRPO(user34DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User34.setExamMathematicalModels(user34ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User34.setQualificationExam(user34QualificationExam);
            specialGrade_IS_1_1Course4Semester2User34.setProductionPractice(user34ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User34.setUndergraduatePractice(user34UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User34.setGraduationProjectDefense(user34GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User34.setDemoExam(user34DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course4Semester2> user35Row = specialGradeIs11Course4Semester2Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User35 = user35Row.get();
            specialGrade_IS_1_1Course4Semester2User35.setUsername(user35Username);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetFundamentalsPhilosophy(user35DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetEnglishLanguage(user35DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetPhysicalTraining(user35DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetLegalSupportProfessionalActivity(user35DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetNumericalMethods(user35DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetManagementProfessionalActivity(user35DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User35.setDifOffsetISRPO(user35DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User35.setExamMathematicalModels(user35ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User35.setQualificationExam(user35QualificationExam);
            specialGrade_IS_1_1Course4Semester2User35.setProductionPractice(user35ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User35.setUndergraduatePractice(user35UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User35.setGraduationProjectDefense(user35GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User35.setDemoExam(user35DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course4Semester2> user36Row = specialGradeIs11Course4Semester2Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User36 = user36Row.get();
            specialGrade_IS_1_1Course4Semester2User36.setUsername(user36Username);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetFundamentalsPhilosophy(user36DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetEnglishLanguage(user36DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetPhysicalTraining(user36DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetLegalSupportProfessionalActivity(user36DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetNumericalMethods(user36DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetManagementProfessionalActivity(user36DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User36.setDifOffsetISRPO(user36DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User36.setExamMathematicalModels(user36ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User36.setQualificationExam(user36QualificationExam);
            specialGrade_IS_1_1Course4Semester2User36.setProductionPractice(user36ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User36.setUndergraduatePractice(user36UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User36.setGraduationProjectDefense(user36GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User36.setDemoExam(user36DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course4Semester2> user37Row = specialGradeIs11Course4Semester2Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User37 = user37Row.get();
            specialGrade_IS_1_1Course4Semester2User37.setUsername(user37Username);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetFundamentalsPhilosophy(user37DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetEnglishLanguage(user37DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetPhysicalTraining(user37DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetLegalSupportProfessionalActivity(user37DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetNumericalMethods(user37DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetManagementProfessionalActivity(user37DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User37.setDifOffsetISRPO(user37DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User37.setExamMathematicalModels(user37ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User37.setQualificationExam(user37QualificationExam);
            specialGrade_IS_1_1Course4Semester2User37.setProductionPractice(user37ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User37.setUndergraduatePractice(user37UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User37.setGraduationProjectDefense(user37GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User37.setDemoExam(user37DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course4Semester2> user38Row = specialGradeIs11Course4Semester2Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User38 = user38Row.get();
            specialGrade_IS_1_1Course4Semester2User38.setUsername(user38Username);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetFundamentalsPhilosophy(user38DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetEnglishLanguage(user38DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetPhysicalTraining(user38DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetLegalSupportProfessionalActivity(user38DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetNumericalMethods(user38DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetManagementProfessionalActivity(user38DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User38.setDifOffsetISRPO(user38DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User38.setExamMathematicalModels(user38ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User38.setQualificationExam(user38QualificationExam);
            specialGrade_IS_1_1Course4Semester2User38.setProductionPractice(user38ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User38.setUndergraduatePractice(user38UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User38.setGraduationProjectDefense(user38GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User38.setDemoExam(user38DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course4Semester2> user39Row = specialGradeIs11Course4Semester2Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User39 = user39Row.get();
            specialGrade_IS_1_1Course4Semester2User39.setUsername(user39Username);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetFundamentalsPhilosophy(user39DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetEnglishLanguage(user39DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetPhysicalTraining(user39DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetLegalSupportProfessionalActivity(user39DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetNumericalMethods(user39DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetManagementProfessionalActivity(user39DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User39.setDifOffsetISRPO(user39DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User39.setExamMathematicalModels(user39ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User39.setQualificationExam(user39QualificationExam);
            specialGrade_IS_1_1Course4Semester2User39.setProductionPractice(user39ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User39.setUndergraduatePractice(user39UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User39.setGraduationProjectDefense(user39GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User39.setDemoExam(user39DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course4Semester2> user40Row = specialGradeIs11Course4Semester2Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course4Semester2 specialGrade_IS_1_1Course4Semester2User40 = user40Row.get();
            specialGrade_IS_1_1Course4Semester2User40.setUsername(user40Username);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetFundamentalsPhilosophy(user40DifOffsetFundamentalsPhilosophy);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetEnglishLanguage(user40DifOffsetEnglishLanguage);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetPhysicalTraining(user40DifOffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetLegalSupportProfessionalActivity(user40DifOffsetLegalSupportProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetNumericalMethods(user40DifOffsetNumericalMethods);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetManagementProfessionalActivity(user40DifOffsetManagementProfessionalActivity);
            specialGrade_IS_1_1Course4Semester2User40.setDifOffsetISRPO(user40DifOffsetISRPO);
            specialGrade_IS_1_1Course4Semester2User40.setExamMathematicalModels(user40ExamMathematicalModels);
            specialGrade_IS_1_1Course4Semester2User40.setQualificationExam(user40QualificationExam);
            specialGrade_IS_1_1Course4Semester2User40.setProductionPractice(user40ProductionPractice);
            specialGrade_IS_1_1Course4Semester2User40.setUndergraduatePractice(user40UndergraduatePractice);
            specialGrade_IS_1_1Course4Semester2User40.setGraduationProjectDefense(user40GraduationProjectDefense);
            specialGrade_IS_1_1Course4Semester2User40.setDemoExam(user40DemoExam);

            specialGradeIs11Course4Semester2Repository.save(specialGrade_IS_1_1Course4Semester2User40);
        } catch (Exception ignore) {

        }
    }
}
