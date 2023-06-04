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
public class SpecialGrade_IS_1_1Course4Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetFundamentalsPhilosophy;
    private String difOffsetEnglishLanguage;
    private String difOffsetPhysicalTraining;
    private String difOffsetLegalSupportProfessionalActivity;
    private String difOffsetNumericalMethods;
    private String difOffsetManagementProfessionalActivity;
    private String difOffsetISRPO;
    private String examMathematicalModels;
    private String qualificationExam;
    private String productionPractice;
    private String undergraduatePractice;
    private String graduationProjectDefense;
    private String demoExam;

    public SpecialGrade_IS_1_1Course4Semester2(int userID, String username, String difOffsetFundamentalsPhilosophy, String difOffsetEnglishLanguage, String difOffsetPhysicalTraining, String difOffsetLegalSupportProfessionalActivity, String difOffsetNumericalMethods, String difOffsetManagementProfessionalActivity, String difOffsetISRPO, String examMathematicalModels, String qualificationExam, String productionPractice,  String undergraduatePractice, String graduationProjectDefense, String demoExam) {
        this.userID = userID;
        this.username = username;
        this.difOffsetFundamentalsPhilosophy = difOffsetFundamentalsPhilosophy;
        this.difOffsetEnglishLanguage = difOffsetEnglishLanguage;
        this.difOffsetPhysicalTraining = difOffsetPhysicalTraining;
        this.difOffsetLegalSupportProfessionalActivity = difOffsetLegalSupportProfessionalActivity;
        this.difOffsetNumericalMethods = difOffsetNumericalMethods;
        this.difOffsetManagementProfessionalActivity = difOffsetManagementProfessionalActivity;
        this.difOffsetISRPO = difOffsetISRPO;
        this.examMathematicalModels = examMathematicalModels;
        this.qualificationExam = qualificationExam;
        this.productionPractice = productionPractice;
        this.undergraduatePractice = undergraduatePractice;
        this.graduationProjectDefense = graduationProjectDefense;
        this.demoExam = demoExam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course4Semester2 gradeIS11 = (SpecialGrade_IS_1_1Course4Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
