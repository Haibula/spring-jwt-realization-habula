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
public class Grade_IS_1_1Course4Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeFundamentalsPhilosophy;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeLegalSupportProfessionalActivity;
    private String gradeNumericalMethods;
    private String gradeManagementProfessionalActivity;
    private String gradeMathematicalModels;
    private String month;

    public Grade_IS_1_1Course4Semester2(int userID, String username, String gradeFundamentalsPhilosophy, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeLegalSupportProfessionalActivity, String gradeNumericalMethods, String gradeManagementProfessionalActivity, String gradeMathematicalModels, String month) {
        this.userID = userID;
        this.username = username;
        this.gradeFundamentalsPhilosophy = gradeFundamentalsPhilosophy;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeLegalSupportProfessionalActivity = gradeLegalSupportProfessionalActivity;
        this.gradeNumericalMethods = gradeNumericalMethods;
        this.gradeManagementProfessionalActivity = gradeManagementProfessionalActivity;
        this.gradeMathematicalModels = gradeMathematicalModels;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course4Semester2 gradeIS11 = (Grade_IS_1_1Course4Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
