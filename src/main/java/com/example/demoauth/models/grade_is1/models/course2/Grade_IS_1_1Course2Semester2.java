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
public class Grade_IS_1_1Course2Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeProbabilityTheory;
    private String gradeHardwareArchitecture;
    private String gradeInformationTechnology;
    private String gradeFundamentalsOfAlgorithmizationAndProgramming;
    private String gradeDatabaseDesignFundamentals;
    private String gradeImplementationAndSupportOfComputerSystems;
    private String gradeEnsuringAndQualityOfFunctioningOfComputerSystems;
    private String month;

    public Grade_IS_1_1Course2Semester2(int userID, String username, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeProbabilityTheory, String gradeHardwareArchitecture, String gradeInformationTechnology, String gradeFundamentalsOfAlgorithmizationAndProgramming, String gradeDatabaseDesignFundamentals, String gradeImplementationAndSupportOfComputerSystems, String gradeEnsuringAndQualityOfFunctioningOfComputerSystems, String month) {
        this.userID = userID;
        this.username = username;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeProbabilityTheory = gradeProbabilityTheory;
        this.gradeHardwareArchitecture = gradeHardwareArchitecture;
        this.gradeInformationTechnology = gradeInformationTechnology;
        this.gradeFundamentalsOfAlgorithmizationAndProgramming = gradeFundamentalsOfAlgorithmizationAndProgramming;
        this.gradeDatabaseDesignFundamentals = gradeDatabaseDesignFundamentals;
        this.gradeImplementationAndSupportOfComputerSystems = gradeImplementationAndSupportOfComputerSystems;
        this.gradeEnsuringAndQualityOfFunctioningOfComputerSystems = gradeEnsuringAndQualityOfFunctioningOfComputerSystems;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course2Semester2 gradeIS11 = (Grade_IS_1_1Course2Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
