package com.example.demoauth.models.grade_is1.models.course3;

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
public class SpecialGrade_IS_1_1Course3Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetEnglishLanguage;
    private String difOffsetDevelopmentSoftwareModules;
    private String difOffsetSupportTestingSoftwareModules;
    private String offsetPhysicalTraining;
    private String examIndustryEconomics;
    private String examTechnologyDevelopingProtectingDatabasesDynamic;
    private String qualificationExam;
    private String educationalPractice;
    private String productionPractice;


    public SpecialGrade_IS_1_1Course3Semester2(int userID, String username, String difOffsetEnglishLanguage, String difOffsetDevelopmentSoftwareModules, String difOffsetSupportTestingSoftwareModules, String offsetPhysicalTraining, String examIndustryEconomics, String examTechnologyDevelopingProtectingDatabasesDynamic, String qualificationExam, String educationalPractice, String productionPractice) {
        this.userID = userID;
        this.username = username;
        this.difOffsetEnglishLanguage = difOffsetEnglishLanguage;
        this.difOffsetDevelopmentSoftwareModules = difOffsetDevelopmentSoftwareModules;
        this.difOffsetSupportTestingSoftwareModules = difOffsetSupportTestingSoftwareModules;
        this.offsetPhysicalTraining = offsetPhysicalTraining;
        this.examIndustryEconomics = examIndustryEconomics;
        this.examTechnologyDevelopingProtectingDatabasesDynamic = examTechnologyDevelopingProtectingDatabasesDynamic;
        this.qualificationExam = qualificationExam;
        this.educationalPractice = educationalPractice;
        this.productionPractice = productionPractice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course3Semester2 gradeIS11 = (SpecialGrade_IS_1_1Course3Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
