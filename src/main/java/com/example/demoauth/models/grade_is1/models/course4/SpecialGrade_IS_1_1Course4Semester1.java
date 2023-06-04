package com.example.demoauth.models.grade_is1.models.course4;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString

@RequiredArgsConstructor
@Entity
public class SpecialGrade_IS_1_1Course4Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetSystemProgramming;
    private String offsetPhysicalTraining;
    private String examDevelopmentSoftwareModules;
    private String examMobileApplicationDevelopment;
    private String examSoftwareDevelopmentTechnology;
    private String qualificationExam;
    private String courseWork;
    private String educationalPractice;
    private String productionPractice;

    public SpecialGrade_IS_1_1Course4Semester1(int userID, String username, String difOffsetSystemProgramming, String offsetPhysicalTraining, String examDevelopmentSoftwareModules, String examMobileApplicationDevelopment, String examSoftwareDevelopmentTechnology, String qualificationExam, String courseWork, String educationalPractice, String productionPractice) {
        this.userID = userID;
        this.username = username;
        this.difOffsetSystemProgramming = difOffsetSystemProgramming;
        this.offsetPhysicalTraining = offsetPhysicalTraining;
        this.examDevelopmentSoftwareModules = examDevelopmentSoftwareModules;
        this.examMobileApplicationDevelopment = examMobileApplicationDevelopment;
        this.examSoftwareDevelopmentTechnology = examSoftwareDevelopmentTechnology;
        this.qualificationExam = qualificationExam;
        this.courseWork = courseWork;
        this.educationalPractice = educationalPractice;
        this.productionPractice = productionPractice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course4Semester1 gradeIS11 = (SpecialGrade_IS_1_1Course4Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
