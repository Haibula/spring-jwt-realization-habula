package com.example.demoauth.models.grade_is1.models.course4;

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
public class Grade_IS_1_1Course4Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeDevelopmentSoftwareModules;
    private String gradeMobileApplicationDevelopment;
    private String gradeSystemProgramming;
    private String gradeSoftwareDevelopmentTechnology;
    private String gradeISRPO;
    private String month;

    public Grade_IS_1_1Course4Semester1(int userID, String username, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeDevelopmentSoftwareModules, String gradeMobileApplicationDevelopment, String gradeSystemProgramming, String gradeSoftwareDevelopmentTechnology, String gradeISRPO, String month) {
        this.userID = userID;
        this.username = username;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeDevelopmentSoftwareModules = gradeDevelopmentSoftwareModules;
        this.gradeMobileApplicationDevelopment = gradeMobileApplicationDevelopment;
        this.gradeSystemProgramming = gradeSystemProgramming;
        this.gradeSoftwareDevelopmentTechnology = gradeSoftwareDevelopmentTechnology;
        this.gradeISRPO = gradeISRPO;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course4Semester1 gradeIS11 = (Grade_IS_1_1Course4Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
