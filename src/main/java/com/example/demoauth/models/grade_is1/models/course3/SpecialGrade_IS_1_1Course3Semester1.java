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
public class SpecialGrade_IS_1_1Course3Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetPsychology;
    private String difOffsetLifeSafety;
    private String difOffsetStandardizationCertification;
    private String difOffsetDatabaseDevelopmentProtectionTechnology;
    private String offsetPhysicalTraining;
    private String educationalPractice;


    public SpecialGrade_IS_1_1Course3Semester1(int userID, String username, String difOffsetPsychology, String difOffsetLifeSafety, String difOffsetStandardizationCertification, String difOffsetDatabaseDevelopmentProtectionTechnology, String offsetPhysicalTraining, String educationalPractice) {
        this.userID = userID;
        this.username = username;
        this.difOffsetPsychology = difOffsetPsychology;
        this.difOffsetLifeSafety = difOffsetLifeSafety;
        this.difOffsetStandardizationCertification = difOffsetStandardizationCertification;
        this.difOffsetDatabaseDevelopmentProtectionTechnology = difOffsetDatabaseDevelopmentProtectionTechnology;
        this.offsetPhysicalTraining = offsetPhysicalTraining;
        this.educationalPractice = educationalPractice;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course3Semester1 gradeIS11 = (SpecialGrade_IS_1_1Course3Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
