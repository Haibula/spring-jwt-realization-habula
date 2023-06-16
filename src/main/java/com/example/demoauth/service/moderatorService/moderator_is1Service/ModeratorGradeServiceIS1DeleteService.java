package com.example.demoauth.service.moderatorService.moderator_is1Service;

import com.example.demoauth.models.grade_is1.models.course1.Grade_IS_1_1Course1Semester1;
import com.example.demoauth.repository.is1Repository.Progress_IS_1_1_Repository;
import com.example.demoauth.repository.is1Repository.course1.Grade_IS_1_1Course1Semester1Repository;
import com.example.demoauth.repository.is1Repository.course1.Grade_IS_1_1Course1Semester2Repository;
import com.example.demoauth.repository.is1Repository.course1.SpecialGrade_IS_1_1Course1Semester1Repository;
import com.example.demoauth.repository.is1Repository.course1.SpecialGrade_IS_1_1Course1Semester2Repository;
import com.example.demoauth.repository.is1Repository.course2.Grade_IS_1_1Course2Semester1Repository;
import com.example.demoauth.repository.is1Repository.course2.Grade_IS_1_1Course2Semester2Repository;
import com.example.demoauth.repository.is1Repository.course2.SpecialGrade_IS_1_1Course2Semester1Repository;
import com.example.demoauth.repository.is1Repository.course2.SpecialGrade_IS_1_1Course2Semester2Repository;
import com.example.demoauth.repository.is1Repository.course3.Grade_IS_1_1Course3Semester1Repository;
import com.example.demoauth.repository.is1Repository.course3.Grade_IS_1_1Course3Semester2Repository;
import com.example.demoauth.repository.is1Repository.course3.SpecialGrade_IS_1_1Course3Semester1Repository;
import com.example.demoauth.repository.is1Repository.course3.SpecialGrade_IS_1_1Course3Semester2Repository;
import com.example.demoauth.repository.is1Repository.course4.Grade_IS_1_1Course4Semester1Repository;
import com.example.demoauth.repository.is1Repository.course4.Grade_IS_1_1Course4Semester2Repository;
import com.example.demoauth.repository.is1Repository.course4.SpecialGrade_IS_1_1Course4Semester1Repository;
import com.example.demoauth.repository.is1Repository.course4.SpecialGrade_IS_1_1Course4Semester2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ModeratorGradeServiceIS1DeleteService {
    @Autowired
    Grade_IS_1_1Course1Semester1Repository grade_is_1_1Course1Semester1Repository;
    @Autowired
    Grade_IS_1_1Course1Semester2Repository grade_is_1_1Course1Semester2Repository;
    @Autowired
    Grade_IS_1_1Course2Semester1Repository grade_is_1_1Course2Semester1Repository;
    @Autowired
    Grade_IS_1_1Course2Semester2Repository grade_is_1_1Course2Semester2Repository;
    @Autowired
    Grade_IS_1_1Course3Semester1Repository grade_is_1_1Course3Semester1Repository;
    @Autowired
    Grade_IS_1_1Course3Semester2Repository grade_is_1_1Course3Semester2Repository;
    @Autowired
    Grade_IS_1_1Course4Semester1Repository grade_is_1_1Course4Semester1Repository;
    @Autowired
    Grade_IS_1_1Course4Semester2Repository grade_is_1_1Course4Semester2Repository;
    @Autowired
    SpecialGrade_IS_1_1Course1Semester1Repository specialGradeIs11Course1Semester1Repository;
    @Autowired
    SpecialGrade_IS_1_1Course1Semester2Repository specialGradeIs11Course1Semester2Repository;
    @Autowired
    SpecialGrade_IS_1_1Course2Semester1Repository specialGradeIs11Course2Semester1Repository;
    @Autowired
    SpecialGrade_IS_1_1Course2Semester2Repository specialGradeIs11Course2Semester2Repository;
    @Autowired
    SpecialGrade_IS_1_1Course3Semester1Repository specialGradeIs11Course3Semester1Repository;
    @Autowired
    SpecialGrade_IS_1_1Course3Semester2Repository specialGradeIs11Course3Semester2Repository;
    @Autowired
    SpecialGrade_IS_1_1Course4Semester1Repository specialGradeIs11Course4Semester1Repository;
    @Autowired
    SpecialGrade_IS_1_1Course4Semester2Repository specialGradeIs11Course4Semester2Repository;
    @Autowired
    Progress_IS_1_1_Repository progress_is_1_1_repository;


    //Удаление всех данных
    public void deleteAllDate() {
        grade_is_1_1Course1Semester1Repository.deleteAll();
        grade_is_1_1Course1Semester2Repository.deleteAll();
        grade_is_1_1Course2Semester1Repository.deleteAll();
        grade_is_1_1Course2Semester2Repository.deleteAll();
        grade_is_1_1Course3Semester1Repository.deleteAll();
        grade_is_1_1Course3Semester2Repository.deleteAll();
        grade_is_1_1Course4Semester1Repository.deleteAll();
        grade_is_1_1Course4Semester2Repository.deleteAll();

        specialGradeIs11Course1Semester1Repository.deleteAll();
        specialGradeIs11Course1Semester2Repository.deleteAll();
        specialGradeIs11Course2Semester1Repository.deleteAll();
        specialGradeIs11Course2Semester2Repository.deleteAll();
        specialGradeIs11Course3Semester1Repository.deleteAll();
        specialGradeIs11Course3Semester2Repository.deleteAll();
        specialGradeIs11Course4Semester1Repository.deleteAll();
        specialGradeIs11Course4Semester2Repository.deleteAll();

        progress_is_1_1_repository.deleteAll();
    }


}
