package com.example.demoauth.service.moderatorService.moderator_is1Service.course4;

import com.example.demoauth.models.grade_is1.models.course4.SpecialGrade_IS_1_1Course4Semester1;
import com.example.demoauth.repository.is1Repository.course4.SpecialGrade_IS_1_1Course4Semester1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ModeratorSpecialGradeServiceIS1Course4Semester1 {
    @Autowired
    SpecialGrade_IS_1_1Course4Semester1Repository specialGradeIs11Course4Semester1Repository;

    //GetMappingModer_is_1_1SpecialGreadeСourse4Semester1
    public void getMappingModer_is_1_1SpecialGreadeСourse4Semester1(Model model) {
        List<SpecialGrade_IS_1_1Course4Semester1> res = specialGradeIs11Course4Semester1Repository.findAll();
        res.sort(Comparator.comparingInt(SpecialGrade_IS_1_1Course4Semester1::getUserID));
        List<SpecialGrade_IS_1_1Course4Semester1> voidList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            voidList.add(new SpecialGrade_IS_1_1Course4Semester1());
        }
        if (res.isEmpty()) {
            // Пусты данные нужны для начальной передачи данных, ибо в html у меня передается массив данных, а если данных нет, то программа ругается
            model.addAttribute("post", voidList);
        } else {
            model.addAttribute("post", res);
        }

    }

    //PostMappingModer_is_1_1SpecialGreadeСourse4Semester1
    public void postMappingModer_is_1_1SpecialGreadeСourse4Semester1Post(@RequestParam String user1Grades, @RequestParam String user2Grades, @RequestParam String user3Grades, @RequestParam String user4Grades, @RequestParam String user5Grades, @RequestParam String user6Grades, @RequestParam String user7Grades, @RequestParam String user8Grades, @RequestParam String user9Grades, @RequestParam String user10Grades, @RequestParam String user11Grades, @RequestParam String user12Grades, @RequestParam String user13Grades, @RequestParam String user14Grades, @RequestParam String user15Grades, @RequestParam String user16Grades, @RequestParam String user17Grades, @RequestParam String user18Grades, @RequestParam String user19Grades, @RequestParam String user20Grades, @RequestParam String user21Grades, @RequestParam String user22Grades, @RequestParam String user23Grades, @RequestParam String user24Grades, @RequestParam String user25Grades, @RequestParam String user26Grades, @RequestParam String user27Grades, @RequestParam String user28Grades, @RequestParam String user29Grades, @RequestParam String user30Grades, @RequestParam String user31Grades, @RequestParam String user32Grades, @RequestParam String user33Grades, @RequestParam String user34Grades, @RequestParam String user35Grades, @RequestParam String user36Grades, @RequestParam String user37Grades, @RequestParam String user38Grades, @RequestParam String user39Grades, @RequestParam String user40Grades) {
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
            String user1DifOffsetSystemProgramming = splitUser1Grades[2];
            String user1OffsetPhysicalTraining = splitUser1Grades[3];
            String user1ExamDevelopmentSoftwareModules = splitUser1Grades[4];
            String user1ExamMobileApplicationDevelopment = splitUser1Grades[5];
            String user1ExamSoftwareDevelopmentTechnology = splitUser1Grades[6];
            String user1QualificationExam = splitUser1Grades[7];
            String user1CourseWork = splitUser1Grades[8];
            String user1EducationalPractice = splitUser1Grades[9];
            String user1ProductionPractice = splitUser1Grades[10];



            //user2Grade
            int user2Id = Integer.parseInt(splitUser2Grades[0]);
            String user2Username = splitUser2Grades[1];
            String user2DifOffsetSystemProgramming = splitUser2Grades[2];
            String user2OffsetPhysicalTraining = splitUser2Grades[3];
            String user2ExamDevelopmentSoftwareModules = splitUser2Grades[4];
            String user2ExamMobileApplicationDevelopment = splitUser2Grades[5];
            String user2ExamSoftwareDevelopmentTechnology = splitUser2Grades[6];
            String user2QualificationExam = splitUser2Grades[7];
            String user2CourseWork = splitUser2Grades[8];
            String user2EducationalPractice = splitUser2Grades[9];
            String user2ProductionPractice = splitUser2Grades[10];


            //user3Grade
            int user3Id = Integer.parseInt(splitUser3Grades[0]);
            String user3Username = splitUser3Grades[1];
            String user3DifOffsetSystemProgramming = splitUser3Grades[2];
            String user3OffsetPhysicalTraining = splitUser3Grades[3];
            String user3ExamDevelopmentSoftwareModules = splitUser3Grades[4];
            String user3ExamMobileApplicationDevelopment = splitUser3Grades[5];
            String user3ExamSoftwareDevelopmentTechnology = splitUser3Grades[6];
            String user3QualificationExam = splitUser3Grades[7];
            String user3CourseWork = splitUser3Grades[8];
            String user3EducationalPractice = splitUser3Grades[9];
            String user3ProductionPractice = splitUser3Grades[10];


            //user4Grade
            int user4Id = Integer.parseInt(splitUser4Grades[0]);
            String user4Username = splitUser4Grades[1];
            String user4DifOffsetSystemProgramming = splitUser4Grades[2];
            String user4OffsetPhysicalTraining = splitUser4Grades[3];
            String user4ExamDevelopmentSoftwareModules = splitUser4Grades[4];
            String user4ExamMobileApplicationDevelopment = splitUser4Grades[5];
            String user4ExamSoftwareDevelopmentTechnology = splitUser4Grades[6];
            String user4QualificationExam = splitUser4Grades[7];
            String user4CourseWork = splitUser4Grades[8];
            String user4EducationalPractice = splitUser4Grades[9];
            String user4ProductionPractice = splitUser4Grades[10];


            //user5Grade
            int user5Id = Integer.parseInt(splitUser5Grades[0]);
            String user5Username = splitUser5Grades[1];
            String user5DifOffsetSystemProgramming = splitUser5Grades[2];
            String user5OffsetPhysicalTraining = splitUser5Grades[3];
            String user5ExamDevelopmentSoftwareModules = splitUser5Grades[4];
            String user5ExamMobileApplicationDevelopment = splitUser5Grades[5];
            String user5ExamSoftwareDevelopmentTechnology = splitUser5Grades[6];
            String user5QualificationExam = splitUser5Grades[7];
            String user5CourseWork = splitUser5Grades[8];
            String user5EducationalPractice = splitUser5Grades[9];
            String user5ProductionPractice = splitUser5Grades[10];


            //user6Grade
            int user6Id = Integer.parseInt(splitUser6Grades[0]);
            String user6Username = splitUser6Grades[1];
            String user6DifOffsetSystemProgramming = splitUser6Grades[2];
            String user6OffsetPhysicalTraining = splitUser6Grades[3];
            String user6ExamDevelopmentSoftwareModules = splitUser6Grades[4];
            String user6ExamMobileApplicationDevelopment = splitUser6Grades[5];
            String user6ExamSoftwareDevelopmentTechnology = splitUser6Grades[6];
            String user6QualificationExam = splitUser6Grades[7];
            String user6CourseWork = splitUser6Grades[8];
            String user6EducationalPractice = splitUser6Grades[9];
            String user6ProductionPractice = splitUser6Grades[10];


            //user7Grade
            int user7Id = Integer.parseInt(splitUser7Grades[0]);
            String user7Username = splitUser7Grades[1];
            String user7DifOffsetSystemProgramming = splitUser7Grades[2];
            String user7OffsetPhysicalTraining = splitUser7Grades[3];
            String user7ExamDevelopmentSoftwareModules = splitUser7Grades[4];
            String user7ExamMobileApplicationDevelopment = splitUser7Grades[5];
            String user7ExamSoftwareDevelopmentTechnology = splitUser7Grades[6];
            String user7QualificationExam = splitUser7Grades[7];
            String user7CourseWork = splitUser7Grades[8];
            String user7EducationalPractice = splitUser7Grades[9];
            String user7ProductionPractice = splitUser7Grades[10];


            //user8Grade
            int user8Id = Integer.parseInt(splitUser8Grades[0]);
            String user8Username = splitUser8Grades[1];
            String user8DifOffsetSystemProgramming = splitUser8Grades[2];
            String user8OffsetPhysicalTraining = splitUser8Grades[3];
            String user8ExamDevelopmentSoftwareModules = splitUser8Grades[4];
            String user8ExamMobileApplicationDevelopment = splitUser8Grades[5];
            String user8ExamSoftwareDevelopmentTechnology = splitUser8Grades[6];
            String user8QualificationExam = splitUser8Grades[7];
            String user8CourseWork = splitUser8Grades[8];
            String user8EducationalPractice = splitUser8Grades[9];
            String user8ProductionPractice = splitUser8Grades[10];


            //user9Grade
            int user9Id = Integer.parseInt(splitUser9Grades[0]);
            String user9Username = splitUser9Grades[1];
            String user9DifOffsetSystemProgramming = splitUser9Grades[2];
            String user9OffsetPhysicalTraining = splitUser9Grades[3];
            String user9ExamDevelopmentSoftwareModules = splitUser9Grades[4];
            String user9ExamMobileApplicationDevelopment = splitUser9Grades[5];
            String user9ExamSoftwareDevelopmentTechnology = splitUser9Grades[6];
            String user9QualificationExam = splitUser9Grades[7];
            String user9CourseWork = splitUser9Grades[8];
            String user9EducationalPractice = splitUser9Grades[9];
            String user9ProductionPractice = splitUser9Grades[10];


            //user10Grade
            int user10Id = Integer.parseInt(splitUser10Grades[0]);
            String user10Username = splitUser10Grades[1];
            String user10DifOffsetSystemProgramming = splitUser10Grades[2];
            String user10OffsetPhysicalTraining = splitUser10Grades[3];
            String user10ExamDevelopmentSoftwareModules = splitUser10Grades[4];
            String user10ExamMobileApplicationDevelopment = splitUser10Grades[5];
            String user10ExamSoftwareDevelopmentTechnology = splitUser10Grades[6];
            String user10QualificationExam = splitUser10Grades[7];
            String user10CourseWork = splitUser10Grades[8];
            String user10EducationalPractice = splitUser10Grades[9];
            String user10ProductionPractice = splitUser10Grades[10];


            //user11Grade
            int user11Id = Integer.parseInt(splitUser11Grades[0]);
            String user11Username = splitUser11Grades[1];
            String user11DifOffsetSystemProgramming = splitUser11Grades[2];
            String user11OffsetPhysicalTraining = splitUser11Grades[3];
            String user11ExamDevelopmentSoftwareModules = splitUser11Grades[4];
            String user11ExamMobileApplicationDevelopment = splitUser11Grades[5];
            String user11ExamSoftwareDevelopmentTechnology = splitUser11Grades[6];
            String user11QualificationExam = splitUser11Grades[7];
            String user11CourseWork = splitUser11Grades[8];
            String user11EducationalPractice = splitUser11Grades[9];
            String user11ProductionPractice = splitUser11Grades[10];


            //user12Grade
            int user12Id = Integer.parseInt(splitUser12Grades[0]);
            String user12Username = splitUser12Grades[1];
            String user12DifOffsetSystemProgramming = splitUser12Grades[2];
            String user12OffsetPhysicalTraining = splitUser12Grades[3];
            String user12ExamDevelopmentSoftwareModules = splitUser12Grades[4];
            String user12ExamMobileApplicationDevelopment = splitUser12Grades[5];
            String user12ExamSoftwareDevelopmentTechnology = splitUser12Grades[6];
            String user12QualificationExam = splitUser12Grades[7];
            String user12CourseWork = splitUser12Grades[8];
            String user12EducationalPractice = splitUser12Grades[9];
            String user12ProductionPractice = splitUser12Grades[10];


            //user13Grade
            int user13Id = Integer.parseInt(splitUser13Grades[0]);
            String user13Username = splitUser13Grades[1];
            String user13DifOffsetSystemProgramming = splitUser13Grades[2];
            String user13OffsetPhysicalTraining = splitUser13Grades[3];
            String user13ExamDevelopmentSoftwareModules = splitUser13Grades[4];
            String user13ExamMobileApplicationDevelopment = splitUser13Grades[5];
            String user13ExamSoftwareDevelopmentTechnology = splitUser13Grades[6];
            String user13QualificationExam = splitUser13Grades[7];
            String user13CourseWork = splitUser13Grades[8];
            String user13EducationalPractice = splitUser13Grades[9];
            String user13ProductionPractice = splitUser13Grades[10];


            //user14Grade
            int user14Id = Integer.parseInt(splitUser14Grades[0]);
            String user14Username = splitUser14Grades[1];
            String user14DifOffsetSystemProgramming = splitUser14Grades[2];
            String user14OffsetPhysicalTraining = splitUser14Grades[3];
            String user14ExamDevelopmentSoftwareModules = splitUser14Grades[4];
            String user14ExamMobileApplicationDevelopment = splitUser14Grades[5];
            String user14ExamSoftwareDevelopmentTechnology = splitUser14Grades[6];
            String user14QualificationExam = splitUser14Grades[7];
            String user14CourseWork = splitUser14Grades[8];
            String user14EducationalPractice = splitUser14Grades[9];
            String user14ProductionPractice = splitUser14Grades[10];


            //user15Grade
            int user15Id = Integer.parseInt(splitUser15Grades[0]);
            String user15Username = splitUser15Grades[1];
            String user15DifOffsetSystemProgramming = splitUser15Grades[2];
            String user15OffsetPhysicalTraining = splitUser15Grades[3];
            String user15ExamDevelopmentSoftwareModules = splitUser15Grades[4];
            String user15ExamMobileApplicationDevelopment = splitUser15Grades[5];
            String user15ExamSoftwareDevelopmentTechnology = splitUser15Grades[6];
            String user15QualificationExam = splitUser15Grades[7];
            String user15CourseWork = splitUser15Grades[8];
            String user15EducationalPractice = splitUser15Grades[9];
            String user15ProductionPractice = splitUser15Grades[10];


            //user16Grade
            int user16Id = Integer.parseInt(splitUser16Grades[0]);
            String user16Username = splitUser16Grades[1];
            String user16DifOffsetSystemProgramming = splitUser16Grades[2];
            String user16OffsetPhysicalTraining = splitUser16Grades[3];
            String user16ExamDevelopmentSoftwareModules = splitUser16Grades[4];
            String user16ExamMobileApplicationDevelopment = splitUser16Grades[5];
            String user16ExamSoftwareDevelopmentTechnology = splitUser16Grades[6];
            String user16QualificationExam = splitUser16Grades[7];
            String user16CourseWork = splitUser16Grades[8];
            String user16EducationalPractice = splitUser16Grades[9];
            String user16ProductionPractice = splitUser16Grades[10];


            //user17Grade
            int user17Id = Integer.parseInt(splitUser17Grades[0]);
            String user17Username = splitUser17Grades[1];
            String user17DifOffsetSystemProgramming = splitUser17Grades[2];
            String user17OffsetPhysicalTraining = splitUser17Grades[3];
            String user17ExamDevelopmentSoftwareModules = splitUser17Grades[4];
            String user17ExamMobileApplicationDevelopment = splitUser17Grades[5];
            String user17ExamSoftwareDevelopmentTechnology = splitUser17Grades[6];
            String user17QualificationExam = splitUser17Grades[7];
            String user17CourseWork = splitUser17Grades[8];
            String user17EducationalPractice = splitUser17Grades[9];
            String user17ProductionPractice = splitUser17Grades[10];


            //user18Grade
            int user18Id = Integer.parseInt(splitUser18Grades[0]);
            String user18Username = splitUser18Grades[1];
            String user18DifOffsetSystemProgramming = splitUser18Grades[2];
            String user18OffsetPhysicalTraining = splitUser18Grades[3];
            String user18ExamDevelopmentSoftwareModules = splitUser18Grades[4];
            String user18ExamMobileApplicationDevelopment = splitUser18Grades[5];
            String user18ExamSoftwareDevelopmentTechnology = splitUser18Grades[6];
            String user18QualificationExam = splitUser18Grades[7];
            String user18CourseWork = splitUser18Grades[8];
            String user18EducationalPractice = splitUser18Grades[9];
            String user18ProductionPractice = splitUser18Grades[10];


            //user19Grade
            int user19Id = Integer.parseInt(splitUser19Grades[0]);
            String user19Username = splitUser19Grades[1];
            String user19DifOffsetSystemProgramming = splitUser19Grades[2];
            String user19OffsetPhysicalTraining = splitUser19Grades[3];
            String user19ExamDevelopmentSoftwareModules = splitUser19Grades[4];
            String user19ExamMobileApplicationDevelopment = splitUser19Grades[5];
            String user19ExamSoftwareDevelopmentTechnology = splitUser19Grades[6];
            String user19QualificationExam = splitUser19Grades[7];
            String user19CourseWork = splitUser19Grades[8];
            String user19EducationalPractice = splitUser19Grades[9];
            String user19ProductionPractice = splitUser19Grades[10];


            //user20Grade
            int user20Id = Integer.parseInt(splitUser20Grades[0]);
            String user20Username = splitUser20Grades[1];
            String user20DifOffsetSystemProgramming = splitUser20Grades[2];
            String user20OffsetPhysicalTraining = splitUser20Grades[3];
            String user20ExamDevelopmentSoftwareModules = splitUser20Grades[4];
            String user20ExamMobileApplicationDevelopment = splitUser20Grades[5];
            String user20ExamSoftwareDevelopmentTechnology = splitUser20Grades[6];
            String user20QualificationExam = splitUser20Grades[7];
            String user20CourseWork = splitUser20Grades[8];
            String user20EducationalPractice = splitUser20Grades[9];
            String user20ProductionPractice = splitUser20Grades[10];


            //user21Grade
            int user21Id = Integer.parseInt(splitUser21Grades[0]);
            String user21Username = splitUser21Grades[1];
            String user21DifOffsetSystemProgramming = splitUser21Grades[2];
            String user21OffsetPhysicalTraining = splitUser21Grades[3];
            String user21ExamDevelopmentSoftwareModules = splitUser21Grades[4];
            String user21ExamMobileApplicationDevelopment = splitUser21Grades[5];
            String user21ExamSoftwareDevelopmentTechnology = splitUser21Grades[6];
            String user21QualificationExam = splitUser21Grades[7];
            String user21CourseWork = splitUser21Grades[8];
            String user21EducationalPractice = splitUser21Grades[9];
            String user21ProductionPractice = splitUser21Grades[10];


            //user22Grade
            int user22Id = Integer.parseInt(splitUser22Grades[0]);
            String user22Username = splitUser22Grades[1];
            String user22DifOffsetSystemProgramming = splitUser22Grades[2];
            String user22OffsetPhysicalTraining = splitUser22Grades[3];
            String user22ExamDevelopmentSoftwareModules = splitUser22Grades[4];
            String user22ExamMobileApplicationDevelopment = splitUser22Grades[5];
            String user22ExamSoftwareDevelopmentTechnology = splitUser22Grades[6];
            String user22QualificationExam = splitUser22Grades[7];
            String user22CourseWork = splitUser22Grades[8];
            String user22EducationalPractice = splitUser22Grades[9];
            String user22ProductionPractice = splitUser22Grades[10];


            //user23Grade
            int user23Id = Integer.parseInt(splitUser23Grades[0]);
            String user23Username = splitUser23Grades[1];
            String user23DifOffsetSystemProgramming = splitUser23Grades[2];
            String user23OffsetPhysicalTraining = splitUser23Grades[3];
            String user23ExamDevelopmentSoftwareModules = splitUser23Grades[4];
            String user23ExamMobileApplicationDevelopment = splitUser23Grades[5];
            String user23ExamSoftwareDevelopmentTechnology = splitUser23Grades[6];
            String user23QualificationExam = splitUser23Grades[7];
            String user23CourseWork = splitUser23Grades[8];
            String user23EducationalPractice = splitUser23Grades[9];
            String user23ProductionPractice = splitUser23Grades[10];


            //user24Grade
            int user24Id = Integer.parseInt(splitUser24Grades[0]);
            String user24Username = splitUser24Grades[1];
            String user24DifOffsetSystemProgramming = splitUser24Grades[2];
            String user24OffsetPhysicalTraining = splitUser24Grades[3];
            String user24ExamDevelopmentSoftwareModules = splitUser24Grades[4];
            String user24ExamMobileApplicationDevelopment = splitUser24Grades[5];
            String user24ExamSoftwareDevelopmentTechnology = splitUser24Grades[6];
            String user24QualificationExam = splitUser24Grades[7];
            String user24CourseWork = splitUser24Grades[8];
            String user24EducationalPractice = splitUser24Grades[9];
            String user24ProductionPractice = splitUser24Grades[10];


            //user25Grade
            int user25Id = Integer.parseInt(splitUser25Grades[0]);
            String user25Username = splitUser25Grades[1];
            String user25DifOffsetSystemProgramming = splitUser25Grades[2];
            String user25OffsetPhysicalTraining = splitUser25Grades[3];
            String user25ExamDevelopmentSoftwareModules = splitUser25Grades[4];
            String user25ExamMobileApplicationDevelopment = splitUser25Grades[5];
            String user25ExamSoftwareDevelopmentTechnology = splitUser25Grades[6];
            String user25QualificationExam = splitUser25Grades[7];
            String user25CourseWork = splitUser25Grades[8];
            String user25EducationalPractice = splitUser25Grades[9];
            String user25ProductionPractice = splitUser25Grades[10];


            //user26Grade
            int user26Id = Integer.parseInt(splitUser26Grades[0]);
            String user26Username = splitUser26Grades[1];
            String user26DifOffsetSystemProgramming = splitUser26Grades[2];
            String user26OffsetPhysicalTraining = splitUser26Grades[3];
            String user26ExamDevelopmentSoftwareModules = splitUser26Grades[4];
            String user26ExamMobileApplicationDevelopment = splitUser26Grades[5];
            String user26ExamSoftwareDevelopmentTechnology = splitUser26Grades[6];
            String user26QualificationExam = splitUser26Grades[7];
            String user26CourseWork = splitUser26Grades[8];
            String user26EducationalPractice = splitUser26Grades[9];
            String user26ProductionPractice = splitUser26Grades[10];


            //user27Grade
            int user27Id = Integer.parseInt(splitUser27Grades[0]);
            String user27Username = splitUser27Grades[1];
            String user27DifOffsetSystemProgramming = splitUser27Grades[2];
            String user27OffsetPhysicalTraining = splitUser27Grades[3];
            String user27ExamDevelopmentSoftwareModules = splitUser27Grades[4];
            String user27ExamMobileApplicationDevelopment = splitUser27Grades[5];
            String user27ExamSoftwareDevelopmentTechnology = splitUser27Grades[6];
            String user27QualificationExam = splitUser27Grades[7];
            String user27CourseWork = splitUser27Grades[8];
            String user27EducationalPractice = splitUser27Grades[9];
            String user27ProductionPractice = splitUser27Grades[10];


            //user28Grade
            int user28Id = Integer.parseInt(splitUser28Grades[0]);
            String user28Username = splitUser28Grades[1];
            String user28DifOffsetSystemProgramming = splitUser28Grades[2];
            String user28OffsetPhysicalTraining = splitUser28Grades[3];
            String user28ExamDevelopmentSoftwareModules = splitUser28Grades[4];
            String user28ExamMobileApplicationDevelopment = splitUser28Grades[5];
            String user28ExamSoftwareDevelopmentTechnology = splitUser28Grades[6];
            String user28QualificationExam = splitUser28Grades[7];
            String user28CourseWork = splitUser28Grades[8];
            String user28EducationalPractice = splitUser28Grades[9];
            String user28ProductionPractice = splitUser28Grades[10];


            //user29Grade
            int user29Id = Integer.parseInt(splitUser29Grades[0]);
            String user29Username = splitUser29Grades[1];
            String user29DifOffsetSystemProgramming = splitUser29Grades[2];
            String user29OffsetPhysicalTraining = splitUser29Grades[3];
            String user29ExamDevelopmentSoftwareModules = splitUser29Grades[4];
            String user29ExamMobileApplicationDevelopment = splitUser29Grades[5];
            String user29ExamSoftwareDevelopmentTechnology = splitUser29Grades[6];
            String user29QualificationExam = splitUser29Grades[7];
            String user29CourseWork = splitUser29Grades[8];
            String user29EducationalPractice = splitUser29Grades[9];
            String user29ProductionPractice = splitUser29Grades[10];


            //user30Grade
            int user30Id = Integer.parseInt(splitUser30Grades[0]);
            String user30Username = splitUser30Grades[1];
            String user30DifOffsetSystemProgramming = splitUser30Grades[2];
            String user30OffsetPhysicalTraining = splitUser30Grades[3];
            String user30ExamDevelopmentSoftwareModules = splitUser30Grades[4];
            String user30ExamMobileApplicationDevelopment = splitUser30Grades[5];
            String user30ExamSoftwareDevelopmentTechnology = splitUser30Grades[6];
            String user30QualificationExam = splitUser30Grades[7];
            String user30CourseWork = splitUser30Grades[8];
            String user30EducationalPractice = splitUser30Grades[9];
            String user30ProductionPractice = splitUser30Grades[10];


            //user31Grade
            int user31Id = Integer.parseInt(splitUser31Grades[0]);
            String user31Username = splitUser31Grades[1];
            String user31DifOffsetSystemProgramming = splitUser31Grades[2];
            String user31OffsetPhysicalTraining = splitUser31Grades[3];
            String user31ExamDevelopmentSoftwareModules = splitUser31Grades[4];
            String user31ExamMobileApplicationDevelopment = splitUser31Grades[5];
            String user31ExamSoftwareDevelopmentTechnology = splitUser31Grades[6];
            String user31QualificationExam = splitUser31Grades[7];
            String user31CourseWork = splitUser31Grades[8];
            String user31EducationalPractice = splitUser31Grades[9];
            String user31ProductionPractice = splitUser31Grades[10];


            //user32Grade
            int user32Id = Integer.parseInt(splitUser32Grades[0]);
            String user32Username = splitUser32Grades[1];
            String user32DifOffsetSystemProgramming = splitUser32Grades[2];
            String user32OffsetPhysicalTraining = splitUser32Grades[3];
            String user32ExamDevelopmentSoftwareModules = splitUser32Grades[4];
            String user32ExamMobileApplicationDevelopment = splitUser32Grades[5];
            String user32ExamSoftwareDevelopmentTechnology = splitUser32Grades[6];
            String user32QualificationExam = splitUser32Grades[7];
            String user32CourseWork = splitUser32Grades[8];
            String user32EducationalPractice = splitUser32Grades[9];
            String user32ProductionPractice = splitUser32Grades[10];


            //user33Grade
            int user33Id = Integer.parseInt(splitUser33Grades[0]);
            String user33Username = splitUser33Grades[1];
            String user33DifOffsetSystemProgramming = splitUser33Grades[2];
            String user33OffsetPhysicalTraining = splitUser33Grades[3];
            String user33ExamDevelopmentSoftwareModules = splitUser33Grades[4];
            String user33ExamMobileApplicationDevelopment = splitUser33Grades[5];
            String user33ExamSoftwareDevelopmentTechnology = splitUser33Grades[6];
            String user33QualificationExam = splitUser33Grades[7];
            String user33CourseWork = splitUser33Grades[8];
            String user33EducationalPractice = splitUser33Grades[9];
            String user33ProductionPractice = splitUser33Grades[10];


            //user34Grade
            int user34Id = Integer.parseInt(splitUser34Grades[0]);
            String user34Username = splitUser34Grades[1];
            String user34DifOffsetSystemProgramming = splitUser34Grades[2];
            String user34OffsetPhysicalTraining = splitUser34Grades[3];
            String user34ExamDevelopmentSoftwareModules = splitUser34Grades[4];
            String user34ExamMobileApplicationDevelopment = splitUser34Grades[5];
            String user34ExamSoftwareDevelopmentTechnology = splitUser34Grades[6];
            String user34QualificationExam = splitUser34Grades[7];
            String user34CourseWork = splitUser34Grades[8];
            String user34EducationalPractice = splitUser34Grades[9];
            String user34ProductionPractice = splitUser34Grades[10];


            //user35Grade
            int user35Id = Integer.parseInt(splitUser35Grades[0]);
            String user35Username = splitUser35Grades[1];
            String user35DifOffsetSystemProgramming = splitUser35Grades[2];
            String user35OffsetPhysicalTraining = splitUser35Grades[3];
            String user35ExamDevelopmentSoftwareModules = splitUser35Grades[4];
            String user35ExamMobileApplicationDevelopment = splitUser35Grades[5];
            String user35ExamSoftwareDevelopmentTechnology = splitUser35Grades[6];
            String user35QualificationExam = splitUser35Grades[7];
            String user35CourseWork = splitUser35Grades[8];
            String user35EducationalPractice = splitUser35Grades[9];
            String user35ProductionPractice = splitUser35Grades[10];


            //user36Grade
            int user36Id = Integer.parseInt(splitUser36Grades[0]);
            String user36Username = splitUser36Grades[1];
            String user36DifOffsetSystemProgramming = splitUser36Grades[2];
            String user36OffsetPhysicalTraining = splitUser36Grades[3];
            String user36ExamDevelopmentSoftwareModules = splitUser36Grades[4];
            String user36ExamMobileApplicationDevelopment = splitUser36Grades[5];
            String user36ExamSoftwareDevelopmentTechnology = splitUser36Grades[6];
            String user36QualificationExam = splitUser36Grades[7];
            String user36CourseWork = splitUser36Grades[8];
            String user36EducationalPractice = splitUser36Grades[9];
            String user36ProductionPractice = splitUser36Grades[10];


            //user37Grade
            int user37Id = Integer.parseInt(splitUser37Grades[0]);
            String user37Username = splitUser37Grades[1];
            String user37DifOffsetSystemProgramming = splitUser37Grades[2];
            String user37OffsetPhysicalTraining = splitUser37Grades[3];
            String user37ExamDevelopmentSoftwareModules = splitUser37Grades[4];
            String user37ExamMobileApplicationDevelopment = splitUser37Grades[5];
            String user37ExamSoftwareDevelopmentTechnology = splitUser37Grades[6];
            String user37QualificationExam = splitUser37Grades[7];
            String user37CourseWork = splitUser37Grades[8];
            String user37EducationalPractice = splitUser37Grades[9];
            String user37ProductionPractice = splitUser37Grades[10];


            //user38Grade
            int user38Id = Integer.parseInt(splitUser38Grades[0]);
            String user38Username = splitUser38Grades[1];
            String user38DifOffsetSystemProgramming = splitUser38Grades[2];
            String user38OffsetPhysicalTraining = splitUser38Grades[3];
            String user38ExamDevelopmentSoftwareModules = splitUser38Grades[4];
            String user38ExamMobileApplicationDevelopment = splitUser38Grades[5];
            String user38ExamSoftwareDevelopmentTechnology = splitUser38Grades[6];
            String user38QualificationExam = splitUser38Grades[7];
            String user38CourseWork = splitUser38Grades[8];
            String user38EducationalPractice = splitUser38Grades[9];
            String user38ProductionPractice = splitUser38Grades[10];


            //user39Grade
            int user39Id = Integer.parseInt(splitUser39Grades[0]);
            String user39Username = splitUser39Grades[1];
            String user39DifOffsetSystemProgramming = splitUser39Grades[2];
            String user39OffsetPhysicalTraining = splitUser39Grades[3];
            String user39ExamDevelopmentSoftwareModules = splitUser39Grades[4];
            String user39ExamMobileApplicationDevelopment = splitUser39Grades[5];
            String user39ExamSoftwareDevelopmentTechnology = splitUser39Grades[6];
            String user39QualificationExam = splitUser39Grades[7];
            String user39CourseWork = splitUser39Grades[8];
            String user39EducationalPractice = splitUser39Grades[9];
            String user39ProductionPractice = splitUser39Grades[10];


            //user40Grade
            int user40Id = Integer.parseInt(splitUser40Grades[0]);
            String user40Username = splitUser40Grades[1];
            String user40DifOffsetSystemProgramming = splitUser40Grades[2];
            String user40OffsetPhysicalTraining = splitUser40Grades[3];
            String user40ExamDevelopmentSoftwareModules = splitUser40Grades[4];
            String user40ExamMobileApplicationDevelopment = splitUser40Grades[5];
            String user40ExamSoftwareDevelopmentTechnology = splitUser40Grades[6];
            String user40QualificationExam = splitUser40Grades[7];
            String user40CourseWork = splitUser40Grades[8];
            String user40EducationalPractice = splitUser40Grades[9];
            String user40ProductionPractice = splitUser40Grades[10];



            ArrayList<SpecialGrade_IS_1_1Course4Semester1> addArr = new ArrayList<>();
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user1Id, user1Username, user1DifOffsetSystemProgramming, user1OffsetPhysicalTraining, user1ExamDevelopmentSoftwareModules, user1ExamMobileApplicationDevelopment, user1ExamSoftwareDevelopmentTechnology, user1QualificationExam, user1CourseWork, user1EducationalPractice, user1ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user2Id, user2Username, user2DifOffsetSystemProgramming, user2OffsetPhysicalTraining, user2ExamDevelopmentSoftwareModules, user2ExamMobileApplicationDevelopment, user2ExamSoftwareDevelopmentTechnology, user2QualificationExam, user2CourseWork, user2EducationalPractice, user2ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user3Id, user3Username, user3DifOffsetSystemProgramming, user3OffsetPhysicalTraining, user3ExamDevelopmentSoftwareModules, user3ExamMobileApplicationDevelopment, user3ExamSoftwareDevelopmentTechnology, user3QualificationExam, user3CourseWork, user3EducationalPractice, user3ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user4Id, user4Username, user4DifOffsetSystemProgramming, user4OffsetPhysicalTraining, user4ExamDevelopmentSoftwareModules, user4ExamMobileApplicationDevelopment, user4ExamSoftwareDevelopmentTechnology, user4QualificationExam, user4CourseWork, user4EducationalPractice, user4ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user5Id, user5Username, user5DifOffsetSystemProgramming, user5OffsetPhysicalTraining, user5ExamDevelopmentSoftwareModules, user5ExamMobileApplicationDevelopment, user5ExamSoftwareDevelopmentTechnology, user5QualificationExam, user5CourseWork, user5EducationalPractice, user5ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user6Id, user6Username, user6DifOffsetSystemProgramming, user6OffsetPhysicalTraining, user6ExamDevelopmentSoftwareModules, user6ExamMobileApplicationDevelopment, user6ExamSoftwareDevelopmentTechnology, user6QualificationExam, user6CourseWork, user6EducationalPractice, user6ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user7Id, user7Username, user7DifOffsetSystemProgramming, user7OffsetPhysicalTraining, user7ExamDevelopmentSoftwareModules, user7ExamMobileApplicationDevelopment, user7ExamSoftwareDevelopmentTechnology, user7QualificationExam, user7CourseWork, user7EducationalPractice, user7ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user8Id, user8Username, user8DifOffsetSystemProgramming, user8OffsetPhysicalTraining, user8ExamDevelopmentSoftwareModules, user8ExamMobileApplicationDevelopment, user8ExamSoftwareDevelopmentTechnology, user8QualificationExam, user8CourseWork, user8EducationalPractice, user8ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user9Id, user9Username, user9DifOffsetSystemProgramming, user9OffsetPhysicalTraining, user9ExamDevelopmentSoftwareModules, user9ExamMobileApplicationDevelopment, user9ExamSoftwareDevelopmentTechnology, user9QualificationExam, user9CourseWork, user9EducationalPractice, user9ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user10Id, user10Username, user10DifOffsetSystemProgramming, user10OffsetPhysicalTraining, user10ExamDevelopmentSoftwareModules, user10ExamMobileApplicationDevelopment, user10ExamSoftwareDevelopmentTechnology, user10QualificationExam, user10CourseWork, user10EducationalPractice, user10ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user11Id, user11Username, user11DifOffsetSystemProgramming, user11OffsetPhysicalTraining, user11ExamDevelopmentSoftwareModules, user11ExamMobileApplicationDevelopment, user11ExamSoftwareDevelopmentTechnology, user11QualificationExam, user11CourseWork, user11EducationalPractice, user11ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user12Id, user12Username, user12DifOffsetSystemProgramming, user12OffsetPhysicalTraining, user12ExamDevelopmentSoftwareModules, user12ExamMobileApplicationDevelopment, user12ExamSoftwareDevelopmentTechnology, user12QualificationExam, user12CourseWork, user12EducationalPractice, user12ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user13Id, user13Username, user13DifOffsetSystemProgramming, user13OffsetPhysicalTraining, user13ExamDevelopmentSoftwareModules, user13ExamMobileApplicationDevelopment, user13ExamSoftwareDevelopmentTechnology, user13QualificationExam, user13CourseWork, user13EducationalPractice, user13ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user14Id, user14Username, user14DifOffsetSystemProgramming, user14OffsetPhysicalTraining, user14ExamDevelopmentSoftwareModules, user14ExamMobileApplicationDevelopment, user14ExamSoftwareDevelopmentTechnology, user14QualificationExam, user14CourseWork, user14EducationalPractice, user14ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user15Id, user15Username, user15DifOffsetSystemProgramming, user15OffsetPhysicalTraining, user15ExamDevelopmentSoftwareModules, user15ExamMobileApplicationDevelopment, user15ExamSoftwareDevelopmentTechnology, user15QualificationExam, user15CourseWork, user15EducationalPractice, user15ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user16Id, user16Username, user16DifOffsetSystemProgramming, user16OffsetPhysicalTraining, user16ExamDevelopmentSoftwareModules, user16ExamMobileApplicationDevelopment, user16ExamSoftwareDevelopmentTechnology, user16QualificationExam, user16CourseWork, user16EducationalPractice, user16ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user17Id, user17Username, user17DifOffsetSystemProgramming, user17OffsetPhysicalTraining, user17ExamDevelopmentSoftwareModules, user17ExamMobileApplicationDevelopment, user17ExamSoftwareDevelopmentTechnology, user17QualificationExam, user17CourseWork, user17EducationalPractice, user17ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user18Id, user18Username, user18DifOffsetSystemProgramming, user18OffsetPhysicalTraining, user18ExamDevelopmentSoftwareModules, user18ExamMobileApplicationDevelopment, user18ExamSoftwareDevelopmentTechnology, user18QualificationExam, user18CourseWork, user18EducationalPractice, user18ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user19Id, user19Username, user19DifOffsetSystemProgramming, user19OffsetPhysicalTraining, user19ExamDevelopmentSoftwareModules, user19ExamMobileApplicationDevelopment, user19ExamSoftwareDevelopmentTechnology, user19QualificationExam, user19CourseWork, user19EducationalPractice, user19ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user20Id, user20Username, user20DifOffsetSystemProgramming, user20OffsetPhysicalTraining, user20ExamDevelopmentSoftwareModules, user20ExamMobileApplicationDevelopment, user20ExamSoftwareDevelopmentTechnology, user20QualificationExam, user20CourseWork, user20EducationalPractice, user20ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user21Id, user21Username, user21DifOffsetSystemProgramming, user21OffsetPhysicalTraining, user21ExamDevelopmentSoftwareModules, user21ExamMobileApplicationDevelopment, user21ExamSoftwareDevelopmentTechnology, user21QualificationExam, user21CourseWork, user21EducationalPractice, user21ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user22Id, user22Username, user22DifOffsetSystemProgramming, user22OffsetPhysicalTraining, user22ExamDevelopmentSoftwareModules, user22ExamMobileApplicationDevelopment, user22ExamSoftwareDevelopmentTechnology, user22QualificationExam, user22CourseWork, user22EducationalPractice, user22ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user23Id, user23Username, user23DifOffsetSystemProgramming, user23OffsetPhysicalTraining, user23ExamDevelopmentSoftwareModules, user23ExamMobileApplicationDevelopment, user23ExamSoftwareDevelopmentTechnology, user23QualificationExam, user23CourseWork, user23EducationalPractice, user23ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user24Id, user24Username, user24DifOffsetSystemProgramming, user24OffsetPhysicalTraining, user24ExamDevelopmentSoftwareModules, user24ExamMobileApplicationDevelopment, user24ExamSoftwareDevelopmentTechnology, user24QualificationExam, user24CourseWork, user24EducationalPractice, user24ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user25Id, user25Username, user25DifOffsetSystemProgramming, user25OffsetPhysicalTraining, user25ExamDevelopmentSoftwareModules, user25ExamMobileApplicationDevelopment, user25ExamSoftwareDevelopmentTechnology, user25QualificationExam, user25CourseWork, user25EducationalPractice, user25ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user26Id, user26Username, user26DifOffsetSystemProgramming, user26OffsetPhysicalTraining, user26ExamDevelopmentSoftwareModules, user26ExamMobileApplicationDevelopment, user26ExamSoftwareDevelopmentTechnology, user26QualificationExam, user26CourseWork, user26EducationalPractice, user26ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user27Id, user27Username, user27DifOffsetSystemProgramming, user27OffsetPhysicalTraining, user27ExamDevelopmentSoftwareModules, user27ExamMobileApplicationDevelopment, user27ExamSoftwareDevelopmentTechnology, user27QualificationExam, user27CourseWork, user27EducationalPractice, user27ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user28Id, user28Username, user28DifOffsetSystemProgramming, user28OffsetPhysicalTraining, user28ExamDevelopmentSoftwareModules, user28ExamMobileApplicationDevelopment, user28ExamSoftwareDevelopmentTechnology, user28QualificationExam, user28CourseWork, user28EducationalPractice, user28ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user29Id, user29Username, user29DifOffsetSystemProgramming, user29OffsetPhysicalTraining, user29ExamDevelopmentSoftwareModules, user29ExamMobileApplicationDevelopment, user29ExamSoftwareDevelopmentTechnology, user29QualificationExam, user29CourseWork, user29EducationalPractice, user29ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user30Id, user30Username, user30DifOffsetSystemProgramming, user30OffsetPhysicalTraining, user30ExamDevelopmentSoftwareModules, user30ExamMobileApplicationDevelopment, user30ExamSoftwareDevelopmentTechnology, user30QualificationExam, user30CourseWork, user30EducationalPractice, user30ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user31Id, user31Username, user31DifOffsetSystemProgramming, user31OffsetPhysicalTraining, user31ExamDevelopmentSoftwareModules, user31ExamMobileApplicationDevelopment, user31ExamSoftwareDevelopmentTechnology, user31QualificationExam, user31CourseWork, user31EducationalPractice, user31ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user32Id, user32Username, user32DifOffsetSystemProgramming, user32OffsetPhysicalTraining, user32ExamDevelopmentSoftwareModules, user32ExamMobileApplicationDevelopment, user32ExamSoftwareDevelopmentTechnology, user32QualificationExam, user32CourseWork, user32EducationalPractice, user32ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user33Id, user33Username, user33DifOffsetSystemProgramming, user33OffsetPhysicalTraining, user33ExamDevelopmentSoftwareModules, user33ExamMobileApplicationDevelopment, user33ExamSoftwareDevelopmentTechnology, user33QualificationExam, user33CourseWork, user33EducationalPractice, user33ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user34Id, user34Username, user34DifOffsetSystemProgramming, user34OffsetPhysicalTraining, user34ExamDevelopmentSoftwareModules, user34ExamMobileApplicationDevelopment, user34ExamSoftwareDevelopmentTechnology, user34QualificationExam, user34CourseWork, user34EducationalPractice, user34ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user35Id, user35Username, user35DifOffsetSystemProgramming, user35OffsetPhysicalTraining, user35ExamDevelopmentSoftwareModules, user35ExamMobileApplicationDevelopment, user35ExamSoftwareDevelopmentTechnology, user35QualificationExam, user35CourseWork, user35EducationalPractice, user35ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user36Id, user36Username, user36DifOffsetSystemProgramming, user36OffsetPhysicalTraining, user36ExamDevelopmentSoftwareModules, user36ExamMobileApplicationDevelopment, user36ExamSoftwareDevelopmentTechnology, user36QualificationExam, user36CourseWork, user36EducationalPractice, user36ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user37Id, user37Username, user37DifOffsetSystemProgramming, user37OffsetPhysicalTraining, user37ExamDevelopmentSoftwareModules, user37ExamMobileApplicationDevelopment, user37ExamSoftwareDevelopmentTechnology, user37QualificationExam, user37CourseWork, user37EducationalPractice, user37ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user38Id, user38Username, user38DifOffsetSystemProgramming, user38OffsetPhysicalTraining, user38ExamDevelopmentSoftwareModules, user38ExamMobileApplicationDevelopment, user38ExamSoftwareDevelopmentTechnology, user38QualificationExam, user38CourseWork, user38EducationalPractice, user38ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user39Id, user39Username, user39DifOffsetSystemProgramming, user39OffsetPhysicalTraining, user39ExamDevelopmentSoftwareModules, user39ExamMobileApplicationDevelopment, user39ExamSoftwareDevelopmentTechnology, user39QualificationExam, user39CourseWork, user39EducationalPractice, user39ProductionPractice));
            addArr.add(new SpecialGrade_IS_1_1Course4Semester1(user40Id, user40Username, user40DifOffsetSystemProgramming, user40OffsetPhysicalTraining, user40ExamDevelopmentSoftwareModules, user40ExamMobileApplicationDevelopment, user40ExamSoftwareDevelopmentTechnology, user40QualificationExam, user40CourseWork, user40EducationalPractice, user40ProductionPractice));

            if (specialGradeIs11Course4Semester1Repository.findAll().isEmpty()) {
                specialGradeIs11Course4Semester1Repository.saveAll(addArr);
            }

            //PostMapping работает замена, а PutMapping нет
            //user1
            Optional<SpecialGrade_IS_1_1Course4Semester1> user1Row = specialGradeIs11Course4Semester1Repository.findByUserID(user1Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User1 = user1Row.get();
            specialGrade_IS_1_1Course4Semester1User1.setUsername(user1Username);
            specialGrade_IS_1_1Course4Semester1User1.setDifOffsetSystemProgramming(user1DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User1.setOffsetPhysicalTraining(user1OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User1.setExamDevelopmentSoftwareModules(user1ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User1.setExamMobileApplicationDevelopment(user1ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User1.setExamSoftwareDevelopmentTechnology(user1ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User1.setQualificationExam(user1QualificationExam);
            specialGrade_IS_1_1Course4Semester1User1.setCourseWork(user1CourseWork);
            specialGrade_IS_1_1Course4Semester1User1.setEducationalPractice(user1EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User1.setProductionPractice(user1ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User1);

            //user2
            Optional<SpecialGrade_IS_1_1Course4Semester1> user2Row = specialGradeIs11Course4Semester1Repository.findByUserID(user2Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User2 = user2Row.get();
            specialGrade_IS_1_1Course4Semester1User2.setUsername(user2Username);
            specialGrade_IS_1_1Course4Semester1User2.setDifOffsetSystemProgramming(user2DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User2.setOffsetPhysicalTraining(user2OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User2.setExamDevelopmentSoftwareModules(user2ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User2.setExamMobileApplicationDevelopment(user2ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User2.setExamSoftwareDevelopmentTechnology(user2ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User2.setQualificationExam(user2QualificationExam);
            specialGrade_IS_1_1Course4Semester1User2.setCourseWork(user2CourseWork);
            specialGrade_IS_1_1Course4Semester1User2.setEducationalPractice(user2EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User2.setProductionPractice(user2ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User2);

//            //user3
            Optional<SpecialGrade_IS_1_1Course4Semester1> user3Row = specialGradeIs11Course4Semester1Repository.findByUserID(user3Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User3 = user3Row.get();
            specialGrade_IS_1_1Course4Semester1User3.setUsername(user3Username);
            specialGrade_IS_1_1Course4Semester1User3.setDifOffsetSystemProgramming(user3DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User3.setOffsetPhysicalTraining(user3OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User3.setExamDevelopmentSoftwareModules(user3ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User3.setExamMobileApplicationDevelopment(user3ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User3.setExamSoftwareDevelopmentTechnology(user3ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User3.setQualificationExam(user3QualificationExam);
            specialGrade_IS_1_1Course4Semester1User3.setCourseWork(user3CourseWork);
            specialGrade_IS_1_1Course4Semester1User3.setEducationalPractice(user3EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User3.setProductionPractice(user3ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User3);

//            //user4
            Optional<SpecialGrade_IS_1_1Course4Semester1> user4Row = specialGradeIs11Course4Semester1Repository.findByUserID(user4Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User4 = user4Row.get();
            specialGrade_IS_1_1Course4Semester1User4.setUsername(user4Username);
            specialGrade_IS_1_1Course4Semester1User4.setDifOffsetSystemProgramming(user4DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User4.setOffsetPhysicalTraining(user4OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User4.setExamDevelopmentSoftwareModules(user4ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User4.setExamMobileApplicationDevelopment(user4ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User4.setExamSoftwareDevelopmentTechnology(user4ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User4.setQualificationExam(user4QualificationExam);
            specialGrade_IS_1_1Course4Semester1User4.setCourseWork(user4CourseWork);
            specialGrade_IS_1_1Course4Semester1User4.setEducationalPractice(user4EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User4.setProductionPractice(user4ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User4);

//            //user5
            Optional<SpecialGrade_IS_1_1Course4Semester1> user5Row = specialGradeIs11Course4Semester1Repository.findByUserID(user5Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User5 = user5Row.get();
            specialGrade_IS_1_1Course4Semester1User5.setUsername(user5Username);
            specialGrade_IS_1_1Course4Semester1User5.setDifOffsetSystemProgramming(user5DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User5.setOffsetPhysicalTraining(user5OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User5.setExamDevelopmentSoftwareModules(user5ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User5.setExamMobileApplicationDevelopment(user5ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User5.setExamSoftwareDevelopmentTechnology(user5ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User5.setQualificationExam(user5QualificationExam);
            specialGrade_IS_1_1Course4Semester1User5.setCourseWork(user5CourseWork);
            specialGrade_IS_1_1Course4Semester1User5.setEducationalPractice(user5EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User5.setProductionPractice(user5ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User5);

//            //user6
            Optional<SpecialGrade_IS_1_1Course4Semester1> user6Row = specialGradeIs11Course4Semester1Repository.findByUserID(user6Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User6 = user6Row.get();
            specialGrade_IS_1_1Course4Semester1User6.setUsername(user6Username);
            specialGrade_IS_1_1Course4Semester1User6.setDifOffsetSystemProgramming(user6DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User6.setOffsetPhysicalTraining(user6OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User6.setExamDevelopmentSoftwareModules(user6ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User6.setExamMobileApplicationDevelopment(user6ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User6.setExamSoftwareDevelopmentTechnology(user6ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User6.setQualificationExam(user6QualificationExam);
            specialGrade_IS_1_1Course4Semester1User6.setCourseWork(user6CourseWork);
            specialGrade_IS_1_1Course4Semester1User6.setEducationalPractice(user6EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User6.setProductionPractice(user6ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User6);

//            //user7
            Optional<SpecialGrade_IS_1_1Course4Semester1> user7Row = specialGradeIs11Course4Semester1Repository.findByUserID(user7Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User7 = user7Row.get();
            specialGrade_IS_1_1Course4Semester1User7.setUsername(user7Username);
            specialGrade_IS_1_1Course4Semester1User7.setDifOffsetSystemProgramming(user7DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User7.setOffsetPhysicalTraining(user7OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User7.setExamDevelopmentSoftwareModules(user7ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User7.setExamMobileApplicationDevelopment(user7ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User7.setExamSoftwareDevelopmentTechnology(user7ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User7.setQualificationExam(user7QualificationExam);
            specialGrade_IS_1_1Course4Semester1User7.setCourseWork(user7CourseWork);
            specialGrade_IS_1_1Course4Semester1User7.setEducationalPractice(user7EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User7.setProductionPractice(user7ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User7);

//            //user8
            Optional<SpecialGrade_IS_1_1Course4Semester1> user8Row = specialGradeIs11Course4Semester1Repository.findByUserID(user8Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User8 = user8Row.get();
            specialGrade_IS_1_1Course4Semester1User8.setUsername(user8Username);
            specialGrade_IS_1_1Course4Semester1User8.setDifOffsetSystemProgramming(user8DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User8.setOffsetPhysicalTraining(user8OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User8.setExamDevelopmentSoftwareModules(user8ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User8.setExamMobileApplicationDevelopment(user8ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User8.setExamSoftwareDevelopmentTechnology(user8ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User8.setQualificationExam(user8QualificationExam);
            specialGrade_IS_1_1Course4Semester1User8.setCourseWork(user8CourseWork);
            specialGrade_IS_1_1Course4Semester1User8.setEducationalPractice(user8EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User8.setProductionPractice(user8ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User8);

//            //user9
            Optional<SpecialGrade_IS_1_1Course4Semester1> user9Row = specialGradeIs11Course4Semester1Repository.findByUserID(user9Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User9 = user9Row.get();
            specialGrade_IS_1_1Course4Semester1User9.setUsername(user9Username);
            specialGrade_IS_1_1Course4Semester1User9.setDifOffsetSystemProgramming(user9DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User9.setOffsetPhysicalTraining(user9OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User9.setExamDevelopmentSoftwareModules(user9ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User9.setExamMobileApplicationDevelopment(user9ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User9.setExamSoftwareDevelopmentTechnology(user9ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User9.setQualificationExam(user9QualificationExam);
            specialGrade_IS_1_1Course4Semester1User9.setCourseWork(user9CourseWork);
            specialGrade_IS_1_1Course4Semester1User9.setEducationalPractice(user9EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User9.setProductionPractice(user9ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User9);

//            //user10
            Optional<SpecialGrade_IS_1_1Course4Semester1> user10Row = specialGradeIs11Course4Semester1Repository.findByUserID(user10Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User10 = user10Row.get();
            specialGrade_IS_1_1Course4Semester1User10.setUsername(user10Username);
            specialGrade_IS_1_1Course4Semester1User10.setDifOffsetSystemProgramming(user10DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User10.setOffsetPhysicalTraining(user10OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User10.setExamDevelopmentSoftwareModules(user10ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User10.setExamMobileApplicationDevelopment(user10ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User10.setExamSoftwareDevelopmentTechnology(user10ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User10.setQualificationExam(user10QualificationExam);
            specialGrade_IS_1_1Course4Semester1User10.setCourseWork(user10CourseWork);
            specialGrade_IS_1_1Course4Semester1User10.setEducationalPractice(user10EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User10.setProductionPractice(user10ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User10);

//            //user11
            Optional<SpecialGrade_IS_1_1Course4Semester1> user11Row = specialGradeIs11Course4Semester1Repository.findByUserID(user11Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User11 = user11Row.get();
            specialGrade_IS_1_1Course4Semester1User11.setUsername(user11Username);
            specialGrade_IS_1_1Course4Semester1User11.setDifOffsetSystemProgramming(user11DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User11.setOffsetPhysicalTraining(user11OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User11.setExamDevelopmentSoftwareModules(user11ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User11.setExamMobileApplicationDevelopment(user11ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User11.setExamSoftwareDevelopmentTechnology(user11ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User11.setQualificationExam(user11QualificationExam);
            specialGrade_IS_1_1Course4Semester1User11.setCourseWork(user11CourseWork);
            specialGrade_IS_1_1Course4Semester1User11.setEducationalPractice(user11EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User11.setProductionPractice(user11ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User11);

//            //user12
            Optional<SpecialGrade_IS_1_1Course4Semester1> user12Row = specialGradeIs11Course4Semester1Repository.findByUserID(user12Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User12 = user12Row.get();
            specialGrade_IS_1_1Course4Semester1User12.setUsername(user12Username);
            specialGrade_IS_1_1Course4Semester1User12.setDifOffsetSystemProgramming(user12DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User12.setOffsetPhysicalTraining(user12OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User12.setExamDevelopmentSoftwareModules(user12ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User12.setExamMobileApplicationDevelopment(user12ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User12.setExamSoftwareDevelopmentTechnology(user12ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User12.setQualificationExam(user12QualificationExam);
            specialGrade_IS_1_1Course4Semester1User12.setCourseWork(user12CourseWork);
            specialGrade_IS_1_1Course4Semester1User12.setEducationalPractice(user12EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User12.setProductionPractice(user12ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User12);

//            //user13
            Optional<SpecialGrade_IS_1_1Course4Semester1> user13Row = specialGradeIs11Course4Semester1Repository.findByUserID(user13Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User13 = user13Row.get();
            specialGrade_IS_1_1Course4Semester1User13.setUsername(user13Username);
            specialGrade_IS_1_1Course4Semester1User13.setDifOffsetSystemProgramming(user13DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User13.setOffsetPhysicalTraining(user13OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User13.setExamDevelopmentSoftwareModules(user13ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User13.setExamMobileApplicationDevelopment(user13ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User13.setExamSoftwareDevelopmentTechnology(user13ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User13.setQualificationExam(user13QualificationExam);
            specialGrade_IS_1_1Course4Semester1User13.setCourseWork(user13CourseWork);
            specialGrade_IS_1_1Course4Semester1User13.setEducationalPractice(user13EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User13.setProductionPractice(user13ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User13);

//            //user14
            Optional<SpecialGrade_IS_1_1Course4Semester1> user14Row = specialGradeIs11Course4Semester1Repository.findByUserID(user14Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User14 = user14Row.get();
            specialGrade_IS_1_1Course4Semester1User14.setUsername(user14Username);
            specialGrade_IS_1_1Course4Semester1User14.setDifOffsetSystemProgramming(user14DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User14.setOffsetPhysicalTraining(user14OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User14.setExamDevelopmentSoftwareModules(user14ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User14.setExamMobileApplicationDevelopment(user14ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User14.setExamSoftwareDevelopmentTechnology(user14ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User14.setQualificationExam(user14QualificationExam);
            specialGrade_IS_1_1Course4Semester1User14.setCourseWork(user14CourseWork);
            specialGrade_IS_1_1Course4Semester1User14.setEducationalPractice(user14EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User14.setProductionPractice(user14ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User14);

//            //user15
            Optional<SpecialGrade_IS_1_1Course4Semester1> user15Row = specialGradeIs11Course4Semester1Repository.findByUserID(user15Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User15 = user15Row.get();
            specialGrade_IS_1_1Course4Semester1User15.setUsername(user15Username);
            specialGrade_IS_1_1Course4Semester1User15.setDifOffsetSystemProgramming(user15DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User15.setOffsetPhysicalTraining(user15OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User15.setExamDevelopmentSoftwareModules(user15ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User15.setExamMobileApplicationDevelopment(user15ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User15.setExamSoftwareDevelopmentTechnology(user15ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User15.setQualificationExam(user15QualificationExam);
            specialGrade_IS_1_1Course4Semester1User15.setCourseWork(user15CourseWork);
            specialGrade_IS_1_1Course4Semester1User15.setEducationalPractice(user15EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User15.setProductionPractice(user15ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User15);

//            //user16
            Optional<SpecialGrade_IS_1_1Course4Semester1> user16Row = specialGradeIs11Course4Semester1Repository.findByUserID(user16Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User16 = user16Row.get();
            specialGrade_IS_1_1Course4Semester1User16.setUsername(user16Username);
            specialGrade_IS_1_1Course4Semester1User16.setDifOffsetSystemProgramming(user16DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User16.setOffsetPhysicalTraining(user16OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User16.setExamDevelopmentSoftwareModules(user16ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User16.setExamMobileApplicationDevelopment(user16ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User16.setExamSoftwareDevelopmentTechnology(user16ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User16.setQualificationExam(user16QualificationExam);
            specialGrade_IS_1_1Course4Semester1User16.setCourseWork(user16CourseWork);
            specialGrade_IS_1_1Course4Semester1User16.setEducationalPractice(user16EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User16.setProductionPractice(user16ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User16);

            //            //user17
            Optional<SpecialGrade_IS_1_1Course4Semester1> user17Row = specialGradeIs11Course4Semester1Repository.findByUserID(user17Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User17 = user17Row.get();
            specialGrade_IS_1_1Course4Semester1User17.setUsername(user17Username);
            specialGrade_IS_1_1Course4Semester1User17.setDifOffsetSystemProgramming(user17DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User17.setOffsetPhysicalTraining(user17OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User17.setExamDevelopmentSoftwareModules(user17ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User17.setExamMobileApplicationDevelopment(user17ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User17.setExamSoftwareDevelopmentTechnology(user17ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User17.setQualificationExam(user17QualificationExam);
            specialGrade_IS_1_1Course4Semester1User17.setCourseWork(user17CourseWork);
            specialGrade_IS_1_1Course4Semester1User17.setEducationalPractice(user17EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User17.setProductionPractice(user17ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User17);

            //            //user18
            Optional<SpecialGrade_IS_1_1Course4Semester1> user18Row = specialGradeIs11Course4Semester1Repository.findByUserID(user18Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User18 = user18Row.get();
            specialGrade_IS_1_1Course4Semester1User18.setUsername(user18Username);
            specialGrade_IS_1_1Course4Semester1User18.setDifOffsetSystemProgramming(user18DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User18.setOffsetPhysicalTraining(user18OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User18.setExamDevelopmentSoftwareModules(user18ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User18.setExamMobileApplicationDevelopment(user18ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User18.setExamSoftwareDevelopmentTechnology(user18ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User18.setQualificationExam(user18QualificationExam);
            specialGrade_IS_1_1Course4Semester1User18.setCourseWork(user18CourseWork);
            specialGrade_IS_1_1Course4Semester1User18.setEducationalPractice(user18EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User18.setProductionPractice(user18ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User18);

            //            //user19
            Optional<SpecialGrade_IS_1_1Course4Semester1> user19Row = specialGradeIs11Course4Semester1Repository.findByUserID(user19Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User19 = user19Row.get();
            specialGrade_IS_1_1Course4Semester1User19.setUsername(user19Username);
            specialGrade_IS_1_1Course4Semester1User19.setDifOffsetSystemProgramming(user19DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User19.setOffsetPhysicalTraining(user19OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User19.setExamDevelopmentSoftwareModules(user19ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User19.setExamMobileApplicationDevelopment(user19ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User19.setExamSoftwareDevelopmentTechnology(user19ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User19.setQualificationExam(user19QualificationExam);
            specialGrade_IS_1_1Course4Semester1User19.setCourseWork(user19CourseWork);
            specialGrade_IS_1_1Course4Semester1User19.setEducationalPractice(user19EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User19.setProductionPractice(user19ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User19);

            //            //user20
            Optional<SpecialGrade_IS_1_1Course4Semester1> user20Row = specialGradeIs11Course4Semester1Repository.findByUserID(user20Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User20 = user20Row.get();
            specialGrade_IS_1_1Course4Semester1User20.setUsername(user20Username);
            specialGrade_IS_1_1Course4Semester1User20.setDifOffsetSystemProgramming(user20DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User20.setOffsetPhysicalTraining(user20OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User20.setExamDevelopmentSoftwareModules(user20ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User20.setExamMobileApplicationDevelopment(user20ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User20.setExamSoftwareDevelopmentTechnology(user20ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User20.setQualificationExam(user20QualificationExam);
            specialGrade_IS_1_1Course4Semester1User20.setCourseWork(user20CourseWork);
            specialGrade_IS_1_1Course4Semester1User20.setEducationalPractice(user20EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User20.setProductionPractice(user20ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User20);

            //            //user21
            Optional<SpecialGrade_IS_1_1Course4Semester1> user21Row = specialGradeIs11Course4Semester1Repository.findByUserID(user21Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User21 = user21Row.get();
            specialGrade_IS_1_1Course4Semester1User21.setUsername(user21Username);
            specialGrade_IS_1_1Course4Semester1User21.setDifOffsetSystemProgramming(user21DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User21.setOffsetPhysicalTraining(user21OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User21.setExamDevelopmentSoftwareModules(user21ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User21.setExamMobileApplicationDevelopment(user21ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User21.setExamSoftwareDevelopmentTechnology(user21ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User21.setQualificationExam(user21QualificationExam);
            specialGrade_IS_1_1Course4Semester1User21.setCourseWork(user21CourseWork);
            specialGrade_IS_1_1Course4Semester1User21.setEducationalPractice(user21EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User21.setProductionPractice(user21ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User21);

            //            //user22
            Optional<SpecialGrade_IS_1_1Course4Semester1> user22Row = specialGradeIs11Course4Semester1Repository.findByUserID(user22Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User22 = user22Row.get();
            specialGrade_IS_1_1Course4Semester1User22.setUsername(user22Username);
            specialGrade_IS_1_1Course4Semester1User22.setDifOffsetSystemProgramming(user22DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User22.setOffsetPhysicalTraining(user22OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User22.setExamDevelopmentSoftwareModules(user22ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User22.setExamMobileApplicationDevelopment(user22ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User22.setExamSoftwareDevelopmentTechnology(user22ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User22.setQualificationExam(user22QualificationExam);
            specialGrade_IS_1_1Course4Semester1User22.setCourseWork(user22CourseWork);
            specialGrade_IS_1_1Course4Semester1User22.setEducationalPractice(user22EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User22.setProductionPractice(user22ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User22);

            //            //user23
            Optional<SpecialGrade_IS_1_1Course4Semester1> user23Row = specialGradeIs11Course4Semester1Repository.findByUserID(user23Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User23 = user23Row.get();
            specialGrade_IS_1_1Course4Semester1User23.setUsername(user23Username);
            specialGrade_IS_1_1Course4Semester1User23.setDifOffsetSystemProgramming(user23DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User23.setOffsetPhysicalTraining(user23OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User23.setExamDevelopmentSoftwareModules(user23ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User23.setExamMobileApplicationDevelopment(user23ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User23.setExamSoftwareDevelopmentTechnology(user23ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User23.setQualificationExam(user23QualificationExam);
            specialGrade_IS_1_1Course4Semester1User23.setCourseWork(user23CourseWork);
            specialGrade_IS_1_1Course4Semester1User23.setEducationalPractice(user23EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User23.setProductionPractice(user23ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User23);

            //            //user24
            Optional<SpecialGrade_IS_1_1Course4Semester1> user24Row = specialGradeIs11Course4Semester1Repository.findByUserID(user24Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User24 = user24Row.get();
            specialGrade_IS_1_1Course4Semester1User24.setUsername(user24Username);
            specialGrade_IS_1_1Course4Semester1User24.setDifOffsetSystemProgramming(user24DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User24.setOffsetPhysicalTraining(user24OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User24.setExamDevelopmentSoftwareModules(user24ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User24.setExamMobileApplicationDevelopment(user24ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User24.setExamSoftwareDevelopmentTechnology(user24ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User24.setQualificationExam(user24QualificationExam);
            specialGrade_IS_1_1Course4Semester1User24.setCourseWork(user24CourseWork);
            specialGrade_IS_1_1Course4Semester1User24.setEducationalPractice(user24EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User24.setProductionPractice(user24ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User24);

            //            //user25
            Optional<SpecialGrade_IS_1_1Course4Semester1> user25Row = specialGradeIs11Course4Semester1Repository.findByUserID(user25Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User25 = user25Row.get();
            specialGrade_IS_1_1Course4Semester1User25.setUsername(user25Username);
            specialGrade_IS_1_1Course4Semester1User25.setDifOffsetSystemProgramming(user25DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User25.setOffsetPhysicalTraining(user25OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User25.setExamDevelopmentSoftwareModules(user25ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User25.setExamMobileApplicationDevelopment(user25ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User25.setExamSoftwareDevelopmentTechnology(user25ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User25.setQualificationExam(user25QualificationExam);
            specialGrade_IS_1_1Course4Semester1User25.setCourseWork(user25CourseWork);
            specialGrade_IS_1_1Course4Semester1User25.setEducationalPractice(user25EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User25.setProductionPractice(user25ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User25);

            //            //user26
            Optional<SpecialGrade_IS_1_1Course4Semester1> user26Row = specialGradeIs11Course4Semester1Repository.findByUserID(user26Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User26 = user26Row.get();
            specialGrade_IS_1_1Course4Semester1User26.setUsername(user26Username);
            specialGrade_IS_1_1Course4Semester1User26.setDifOffsetSystemProgramming(user26DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User26.setOffsetPhysicalTraining(user26OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User26.setExamDevelopmentSoftwareModules(user26ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User26.setExamMobileApplicationDevelopment(user26ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User26.setExamSoftwareDevelopmentTechnology(user26ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User26.setQualificationExam(user26QualificationExam);
            specialGrade_IS_1_1Course4Semester1User26.setCourseWork(user26CourseWork);
            specialGrade_IS_1_1Course4Semester1User26.setEducationalPractice(user26EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User26.setProductionPractice(user26ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User26);

            //            //user27
            Optional<SpecialGrade_IS_1_1Course4Semester1> user27Row = specialGradeIs11Course4Semester1Repository.findByUserID(user27Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User27 = user27Row.get();
            specialGrade_IS_1_1Course4Semester1User27.setUsername(user27Username);
            specialGrade_IS_1_1Course4Semester1User27.setDifOffsetSystemProgramming(user27DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User27.setOffsetPhysicalTraining(user27OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User27.setExamDevelopmentSoftwareModules(user27ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User27.setExamMobileApplicationDevelopment(user27ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User27.setExamSoftwareDevelopmentTechnology(user27ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User27.setQualificationExam(user27QualificationExam);
            specialGrade_IS_1_1Course4Semester1User27.setCourseWork(user27CourseWork);
            specialGrade_IS_1_1Course4Semester1User27.setEducationalPractice(user27EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User27.setProductionPractice(user27ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User27);

            //            //user28
            Optional<SpecialGrade_IS_1_1Course4Semester1> user28Row = specialGradeIs11Course4Semester1Repository.findByUserID(user28Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User28 = user28Row.get();
            specialGrade_IS_1_1Course4Semester1User28.setUsername(user28Username);
            specialGrade_IS_1_1Course4Semester1User28.setDifOffsetSystemProgramming(user28DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User28.setOffsetPhysicalTraining(user28OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User28.setExamDevelopmentSoftwareModules(user28ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User28.setExamMobileApplicationDevelopment(user28ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User28.setExamSoftwareDevelopmentTechnology(user28ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User28.setQualificationExam(user28QualificationExam);
            specialGrade_IS_1_1Course4Semester1User28.setCourseWork(user28CourseWork);
            specialGrade_IS_1_1Course4Semester1User28.setEducationalPractice(user28EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User28.setProductionPractice(user28ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User28);

            //            //user29
            Optional<SpecialGrade_IS_1_1Course4Semester1> user29Row = specialGradeIs11Course4Semester1Repository.findByUserID(user29Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User29 = user29Row.get();
            specialGrade_IS_1_1Course4Semester1User29.setUsername(user29Username);
            specialGrade_IS_1_1Course4Semester1User29.setDifOffsetSystemProgramming(user29DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User29.setOffsetPhysicalTraining(user29OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User29.setExamDevelopmentSoftwareModules(user29ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User29.setExamMobileApplicationDevelopment(user29ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User29.setExamSoftwareDevelopmentTechnology(user29ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User29.setQualificationExam(user29QualificationExam);
            specialGrade_IS_1_1Course4Semester1User29.setCourseWork(user29CourseWork);
            specialGrade_IS_1_1Course4Semester1User29.setEducationalPractice(user29EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User29.setProductionPractice(user29ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User29);

            //            //user30
            Optional<SpecialGrade_IS_1_1Course4Semester1> user30Row = specialGradeIs11Course4Semester1Repository.findByUserID(user30Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User30 = user30Row.get();
            specialGrade_IS_1_1Course4Semester1User30.setUsername(user30Username);
            specialGrade_IS_1_1Course4Semester1User30.setDifOffsetSystemProgramming(user30DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User30.setOffsetPhysicalTraining(user30OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User30.setExamDevelopmentSoftwareModules(user30ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User30.setExamMobileApplicationDevelopment(user30ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User30.setExamSoftwareDevelopmentTechnology(user30ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User30.setQualificationExam(user30QualificationExam);
            specialGrade_IS_1_1Course4Semester1User30.setCourseWork(user30CourseWork);
            specialGrade_IS_1_1Course4Semester1User30.setEducationalPractice(user30EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User30.setProductionPractice(user30ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User30);

            //            //user31
            Optional<SpecialGrade_IS_1_1Course4Semester1> user31Row = specialGradeIs11Course4Semester1Repository.findByUserID(user31Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User31 = user31Row.get();
            specialGrade_IS_1_1Course4Semester1User31.setUsername(user31Username);
            specialGrade_IS_1_1Course4Semester1User31.setDifOffsetSystemProgramming(user31DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User31.setOffsetPhysicalTraining(user31OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User31.setExamDevelopmentSoftwareModules(user31ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User31.setExamMobileApplicationDevelopment(user31ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User31.setExamSoftwareDevelopmentTechnology(user31ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User31.setQualificationExam(user31QualificationExam);
            specialGrade_IS_1_1Course4Semester1User31.setCourseWork(user31CourseWork);
            specialGrade_IS_1_1Course4Semester1User31.setEducationalPractice(user31EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User31.setProductionPractice(user31ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User31);

            //            //user32
            Optional<SpecialGrade_IS_1_1Course4Semester1> user32Row = specialGradeIs11Course4Semester1Repository.findByUserID(user32Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User32 = user32Row.get();
            specialGrade_IS_1_1Course4Semester1User32.setUsername(user32Username);
            specialGrade_IS_1_1Course4Semester1User32.setDifOffsetSystemProgramming(user32DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User32.setOffsetPhysicalTraining(user32OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User32.setExamDevelopmentSoftwareModules(user32ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User32.setExamMobileApplicationDevelopment(user32ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User32.setExamSoftwareDevelopmentTechnology(user32ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User32.setQualificationExam(user32QualificationExam);
            specialGrade_IS_1_1Course4Semester1User32.setCourseWork(user32CourseWork);
            specialGrade_IS_1_1Course4Semester1User32.setEducationalPractice(user32EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User32.setProductionPractice(user32ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User32);

            //            //user33
            Optional<SpecialGrade_IS_1_1Course4Semester1> user33Row = specialGradeIs11Course4Semester1Repository.findByUserID(user33Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User33 = user33Row.get();
            specialGrade_IS_1_1Course4Semester1User33.setUsername(user33Username);
            specialGrade_IS_1_1Course4Semester1User33.setDifOffsetSystemProgramming(user33DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User33.setOffsetPhysicalTraining(user33OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User33.setExamDevelopmentSoftwareModules(user33ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User33.setExamMobileApplicationDevelopment(user33ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User33.setExamSoftwareDevelopmentTechnology(user33ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User33.setQualificationExam(user33QualificationExam);
            specialGrade_IS_1_1Course4Semester1User33.setCourseWork(user33CourseWork);
            specialGrade_IS_1_1Course4Semester1User33.setEducationalPractice(user33EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User33.setProductionPractice(user33ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User33);

            //            //user34
            Optional<SpecialGrade_IS_1_1Course4Semester1> user34Row = specialGradeIs11Course4Semester1Repository.findByUserID(user34Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User34 = user34Row.get();
            specialGrade_IS_1_1Course4Semester1User34.setUsername(user34Username);
            specialGrade_IS_1_1Course4Semester1User34.setDifOffsetSystemProgramming(user34DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User34.setOffsetPhysicalTraining(user34OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User34.setExamDevelopmentSoftwareModules(user34ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User34.setExamMobileApplicationDevelopment(user34ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User34.setExamSoftwareDevelopmentTechnology(user34ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User34.setQualificationExam(user34QualificationExam);
            specialGrade_IS_1_1Course4Semester1User34.setCourseWork(user34CourseWork);
            specialGrade_IS_1_1Course4Semester1User34.setEducationalPractice(user34EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User34.setProductionPractice(user34ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User34);

            //            //user35
            Optional<SpecialGrade_IS_1_1Course4Semester1> user35Row = specialGradeIs11Course4Semester1Repository.findByUserID(user35Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User35 = user35Row.get();
            specialGrade_IS_1_1Course4Semester1User35.setUsername(user35Username);
            specialGrade_IS_1_1Course4Semester1User35.setDifOffsetSystemProgramming(user35DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User35.setOffsetPhysicalTraining(user35OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User35.setExamDevelopmentSoftwareModules(user35ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User35.setExamMobileApplicationDevelopment(user35ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User35.setExamSoftwareDevelopmentTechnology(user35ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User35.setQualificationExam(user35QualificationExam);
            specialGrade_IS_1_1Course4Semester1User35.setCourseWork(user35CourseWork);
            specialGrade_IS_1_1Course4Semester1User35.setEducationalPractice(user35EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User35.setProductionPractice(user35ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User35);

            //            //user36
            Optional<SpecialGrade_IS_1_1Course4Semester1> user36Row = specialGradeIs11Course4Semester1Repository.findByUserID(user36Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User36 = user36Row.get();
            specialGrade_IS_1_1Course4Semester1User36.setUsername(user36Username);
            specialGrade_IS_1_1Course4Semester1User36.setDifOffsetSystemProgramming(user36DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User36.setOffsetPhysicalTraining(user36OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User36.setExamDevelopmentSoftwareModules(user36ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User36.setExamMobileApplicationDevelopment(user36ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User36.setExamSoftwareDevelopmentTechnology(user36ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User36.setQualificationExam(user36QualificationExam);
            specialGrade_IS_1_1Course4Semester1User36.setCourseWork(user36CourseWork);
            specialGrade_IS_1_1Course4Semester1User36.setEducationalPractice(user36EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User36.setProductionPractice(user36ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User36);

            //            //user37
            Optional<SpecialGrade_IS_1_1Course4Semester1> user37Row = specialGradeIs11Course4Semester1Repository.findByUserID(user37Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User37 = user37Row.get();
            specialGrade_IS_1_1Course4Semester1User37.setUsername(user37Username);
            specialGrade_IS_1_1Course4Semester1User37.setDifOffsetSystemProgramming(user37DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User37.setOffsetPhysicalTraining(user37OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User37.setExamDevelopmentSoftwareModules(user37ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User37.setExamMobileApplicationDevelopment(user37ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User37.setExamSoftwareDevelopmentTechnology(user37ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User37.setQualificationExam(user37QualificationExam);
            specialGrade_IS_1_1Course4Semester1User37.setCourseWork(user37CourseWork);
            specialGrade_IS_1_1Course4Semester1User37.setEducationalPractice(user37EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User37.setProductionPractice(user37ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User37);

            //            //user38
            Optional<SpecialGrade_IS_1_1Course4Semester1> user38Row = specialGradeIs11Course4Semester1Repository.findByUserID(user38Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User38 = user38Row.get();
            specialGrade_IS_1_1Course4Semester1User38.setUsername(user38Username);
            specialGrade_IS_1_1Course4Semester1User38.setDifOffsetSystemProgramming(user38DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User38.setOffsetPhysicalTraining(user38OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User38.setExamDevelopmentSoftwareModules(user38ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User38.setExamMobileApplicationDevelopment(user38ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User38.setExamSoftwareDevelopmentTechnology(user38ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User38.setQualificationExam(user38QualificationExam);
            specialGrade_IS_1_1Course4Semester1User38.setCourseWork(user38CourseWork);
            specialGrade_IS_1_1Course4Semester1User38.setEducationalPractice(user38EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User38.setProductionPractice(user38ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User38);

            //            //user39
            Optional<SpecialGrade_IS_1_1Course4Semester1> user39Row = specialGradeIs11Course4Semester1Repository.findByUserID(user39Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User39 = user39Row.get();
            specialGrade_IS_1_1Course4Semester1User39.setUsername(user39Username);
            specialGrade_IS_1_1Course4Semester1User39.setDifOffsetSystemProgramming(user39DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User39.setOffsetPhysicalTraining(user39OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User39.setExamDevelopmentSoftwareModules(user39ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User39.setExamMobileApplicationDevelopment(user39ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User39.setExamSoftwareDevelopmentTechnology(user39ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User39.setQualificationExam(user39QualificationExam);
            specialGrade_IS_1_1Course4Semester1User39.setCourseWork(user39CourseWork);
            specialGrade_IS_1_1Course4Semester1User39.setEducationalPractice(user39EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User39.setProductionPractice(user39ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User39);

            //            //user40
            Optional<SpecialGrade_IS_1_1Course4Semester1> user40Row = specialGradeIs11Course4Semester1Repository.findByUserID(user40Id);
            SpecialGrade_IS_1_1Course4Semester1 specialGrade_IS_1_1Course4Semester1User40 = user40Row.get();
            specialGrade_IS_1_1Course4Semester1User40.setUsername(user40Username);
            specialGrade_IS_1_1Course4Semester1User40.setDifOffsetSystemProgramming(user40DifOffsetSystemProgramming);
            specialGrade_IS_1_1Course4Semester1User40.setOffsetPhysicalTraining(user40OffsetPhysicalTraining);
            specialGrade_IS_1_1Course4Semester1User40.setExamDevelopmentSoftwareModules(user40ExamDevelopmentSoftwareModules);
            specialGrade_IS_1_1Course4Semester1User40.setExamMobileApplicationDevelopment(user40ExamMobileApplicationDevelopment);
            specialGrade_IS_1_1Course4Semester1User40.setExamSoftwareDevelopmentTechnology(user40ExamSoftwareDevelopmentTechnology);
            specialGrade_IS_1_1Course4Semester1User40.setQualificationExam(user40QualificationExam);
            specialGrade_IS_1_1Course4Semester1User40.setCourseWork(user40CourseWork);
            specialGrade_IS_1_1Course4Semester1User40.setEducationalPractice(user40EducationalPractice);
            specialGrade_IS_1_1Course4Semester1User40.setProductionPractice(user40ProductionPractice);
            specialGradeIs11Course4Semester1Repository.save(specialGrade_IS_1_1Course4Semester1User40);
        } catch (Exception ignore) {

        }
    }
}
