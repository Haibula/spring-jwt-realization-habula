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
public class Grade_IS_1_1Course3Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeIndustryEconomics;
    private String gradeDevelopmentSoftwareModules;
    private String gradeSupportTestingSoftwareModules;
    private String gradeMobileApplicationDevelopment;
    private String gradeSystemProgramming;
    private String gradeDatabaseDevelopmentProtectionTechnology;
    private String month;

    public Grade_IS_1_1Course3Semester2(int userID, String username, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeIndustryEconomics, String gradeDevelopmentSoftwareModules, String gradeSupportTestingSoftwareModules, String gradeMobileApplicationDevelopment, String gradeSystemProgramming, String gradeDatabaseDevelopmentProtectionTechnology, String month) {
        this.userID = userID;
        this.username = username;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeIndustryEconomics = gradeIndustryEconomics;
        this.gradeDevelopmentSoftwareModules = gradeDevelopmentSoftwareModules;
        this.gradeSupportTestingSoftwareModules = gradeSupportTestingSoftwareModules;
        this.gradeMobileApplicationDevelopment = gradeMobileApplicationDevelopment;
        this.gradeSystemProgramming = gradeSystemProgramming;
        this.gradeDatabaseDevelopmentProtectionTechnology = gradeDatabaseDevelopmentProtectionTechnology;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course3Semester2 gradeIS11 = (Grade_IS_1_1Course3Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
