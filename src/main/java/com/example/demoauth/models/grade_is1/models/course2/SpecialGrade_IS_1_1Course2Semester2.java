package com.example.demoauth.models.grade_is1.models.course2;

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
public class SpecialGrade_IS_1_1Course2Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetEnglishLanguage;
    private String difOffsetProbabilityTheory;
    private String difOffsetHardwareArchitecture;
    private String difOffsetInformationTechnology;
    private String difOffsetDatabaseDesignFundamentals;
    private String difOffsetEnsuringAndQualityFunctioningComputerSystems;
    private String offsetPhysicalTraining;
    private String examFundamentalsOfAlgorithmizationAndProgramming;
    private String examImplementationAndSupportOfComputerSystems;
    private String qualificationExam;
    private String educationalPractice;
    private String productionPractice;


    public SpecialGrade_IS_1_1Course2Semester2(int userID, String username, String difOffsetEnglishLanguage, String difOffsetProbabilityTheory, String difOffsetHardwareArchitecture, String difOffsetInformationTechnology, String difOffsetDatabaseDesignFundamentals, String difOffsetEnsuringAndQualityFunctioningComputerSystems, String offsetPhysicalTraining, String examFundamentalsOfAlgorithmizationAndProgramming, String examImplementationAndSupportOfComputerSystems, String qualificationExam, String educationalPractice, String productionPractice) {
        this.userID = userID;
        this.username = username;
        this.difOffsetEnglishLanguage = difOffsetEnglishLanguage;
        this.difOffsetProbabilityTheory = difOffsetProbabilityTheory;
        this.difOffsetHardwareArchitecture = difOffsetHardwareArchitecture;
        this.difOffsetInformationTechnology = difOffsetInformationTechnology;
        this.difOffsetDatabaseDesignFundamentals = difOffsetDatabaseDesignFundamentals;
        this.difOffsetEnsuringAndQualityFunctioningComputerSystems = difOffsetEnsuringAndQualityFunctioningComputerSystems;
        this.offsetPhysicalTraining = offsetPhysicalTraining;
        this.examFundamentalsOfAlgorithmizationAndProgramming = examFundamentalsOfAlgorithmizationAndProgramming;
        this.examImplementationAndSupportOfComputerSystems = examImplementationAndSupportOfComputerSystems;
        this.qualificationExam = qualificationExam;
        this.educationalPractice = educationalPractice;
        this.productionPractice = productionPractice;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course2Semester2 gradeIS11 = (SpecialGrade_IS_1_1Course2Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
