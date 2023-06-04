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
public class SpecialGrade_IS_1_1Course2Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetStory;
    private String offsetPhysicalTraining;
    private String offsetGNPRIT;
    private String examElementsOfHigherMathematics;
    private String examDiscreteMathematics;
    private String examOperatingSystemsAndEnvironments;
    private String examComputerNetworks;

    public SpecialGrade_IS_1_1Course2Semester1(int userID, String username, String difOffsetStory, String offsetPhysicalTraining, String offsetGNPRIT, String examElementsOfHigherMathematics, String examDiscreteMathematics, String examOperatingSystemsAndEnvironments, String examComputerNetworks) {
        this.userID = userID;
        this.username = username;
        this.difOffsetStory = difOffsetStory;
        this.offsetPhysicalTraining = offsetPhysicalTraining;
        this.offsetGNPRIT = offsetGNPRIT;
        this.examElementsOfHigherMathematics = examElementsOfHigherMathematics;
        this.examDiscreteMathematics = examDiscreteMathematics;
        this.examOperatingSystemsAndEnvironments = examOperatingSystemsAndEnvironments;
        this.examComputerNetworks = examComputerNetworks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course2Semester1 gradeIS11 = (SpecialGrade_IS_1_1Course2Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
