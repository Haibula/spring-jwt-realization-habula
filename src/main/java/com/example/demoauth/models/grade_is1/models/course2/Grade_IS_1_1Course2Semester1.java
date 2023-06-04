package com.example.demoauth.models.grade_is1.models.course2;

import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Grade_IS_1_1Course2Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeStory;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeGNPRIT;
    private String gradeElementsOfHigherMathematics;
    private String gradeDiscreteMath;
    private String gradeOperatingSystemsAndEnvironments;
    private String gradeFundamentalsOfAlgorithmizationAndProgramming;
    private String gradeComputerNetwork;
    private String month;

    public Grade_IS_1_1Course2Semester1(int userID, String username, String gradeStory, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeGNPRIT, String gradeElementsOfHigherMathematics, String gradeDiscreteMath, String gradeOperatingSystemsAndEnvironments, String gradeFundamentalsOfAlgorithmizationAndProgramming, String gradeComputerNetwork,  String month) {
        this.userID = userID;
        this.username = username;
        this.gradeStory = gradeStory;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeGNPRIT = gradeGNPRIT;
        this.gradeElementsOfHigherMathematics = gradeElementsOfHigherMathematics;
        this.gradeDiscreteMath = gradeDiscreteMath;
        this.gradeOperatingSystemsAndEnvironments = gradeOperatingSystemsAndEnvironments;
        this.gradeFundamentalsOfAlgorithmizationAndProgramming = gradeFundamentalsOfAlgorithmizationAndProgramming;
        this.gradeComputerNetwork = gradeComputerNetwork;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course2Semester1 gradeIS11 = (Grade_IS_1_1Course2Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
