package com.example.demoauth.models.grade_is1.models.course3;

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
public class Grade_IS_1_1Course3Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String gradePsychology;
    private String gradeEnglishLanguage;
    private String gradePhysicalTraining;
    private String gradeLifeSafety;
    private String gradeStandardizationCertification;
    private String gradeDevelopmentSoftwareModules;
    private String gradeSupportTestingSoftwareModules;
    private String gradeDatabaseDevelopmentProtectionTechnology;
    private String month;

    public Grade_IS_1_1Course3Semester1(int userID, String username, String gradePsychology, String gradeEnglishLanguage, String gradePhysicalTraining, String gradeLifeSafety, String gradeStandardizationCertification, String gradeDevelopmentSoftwareModules, String gradeSupportTestingSoftwareModules, String gradeDatabaseDevelopmentProtectionTechnology, String month) {
        this.userID = userID;
        this.username = username;
        this.gradePsychology = gradePsychology;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.gradeLifeSafety = gradeLifeSafety;
        this.gradeStandardizationCertification = gradeStandardizationCertification;
        this.gradeDevelopmentSoftwareModules = gradeDevelopmentSoftwareModules;
        this.gradeSupportTestingSoftwareModules = gradeSupportTestingSoftwareModules;
        this.gradeDatabaseDevelopmentProtectionTechnology = gradeDatabaseDevelopmentProtectionTechnology;
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course3Semester1 gradeIS11 = (Grade_IS_1_1Course3Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
