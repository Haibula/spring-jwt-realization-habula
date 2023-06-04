package com.example.demoauth.models.grade_is1.models.course1;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Grade_IS_1_1Course1Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeRussianLanguage;
    private String gradeLiterature;
    private String gradeMathematics;
    private String gradeEnglishLanguage;
    private String gradeComputerScience;
    private String gradePhysics;
    private String gradeChemistry;
    private String gradeStory;
    private String gradeSocialScience;
    private String gradePhysicalTraining;
    private String gradeSecurityBasics;
    private String gradeNativeLiterature;
    private String month;

    public Grade_IS_1_1Course1Semester2(int userID, String username, String gradeRussianLanguage, String gradeLiterature, String gradeMathematics, String gradeEnglishLanguage, String gradeComputerScience, String gradePhysics, String gradeChemistry, String gradeStory, String gradeSocialScience, String gradePhysicalTraining, String gradeSecurityBasics, String gradeNativeLiterature, String month) {
        this.userID = userID;
        this.username = username;
        this.gradeRussianLanguage = gradeRussianLanguage;
        this.gradeLiterature = gradeLiterature;
        this.gradeMathematics = gradeMathematics;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradeComputerScience = gradeComputerScience;
        this.gradePhysics = gradePhysics;
        this.gradeChemistry = gradeChemistry;
        this.gradeStory = gradeStory;
        this.gradeSocialScience = gradeSocialScience;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeSecurityBasics = gradeSecurityBasics;
        this.gradeNativeLiterature = gradeNativeLiterature;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course1Semester2 gradeIS11 = (Grade_IS_1_1Course1Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
