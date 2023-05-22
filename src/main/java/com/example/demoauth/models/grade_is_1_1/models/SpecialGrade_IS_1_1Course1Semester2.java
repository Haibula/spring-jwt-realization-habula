package com.example.demoauth.models.grade_is_1_1.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class SpecialGrade_IS_1_1Course1Semester2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetLiterature;
    private String difOffsetEnglishLanguage;
    private String difOffsetPhysics;
    private String difOffsetChemistry;
    private String difOffsetStory;
    private String difOffsetSocialScience;
    private String difOffsetPhysicalTraining;
    private String difOffsetSecurityBasics;
    private String difOffsetNativeLiterature;
    private String examRussianLanguage;
    private String examMathematics;
    private String examInformatics;
    private String individualProject;
    private String month;


    public SpecialGrade_IS_1_1Course1Semester2( int userID, String username, String difOffsetLiterature, String difOffsetEnglish, String difOffsetPhysics, String difOffsetChemistry, String difOffsetStory, String difOffsetSocialScience, String difOffsetPhysicalTraining, String difOffsetSecurityBasics, String difOffsetNativeLiterature, String examRussianLanguage, String examMathematics, String examInformatics, String individualProject ) {
        this.userID = userID;
        this.username = username;
        this.difOffsetLiterature = difOffsetLiterature;
        this.difOffsetEnglishLanguage = difOffsetEnglish;
        this.difOffsetPhysics = difOffsetPhysics;
        this.difOffsetChemistry = difOffsetChemistry;
        this.difOffsetStory = difOffsetStory;
        this.difOffsetSocialScience = difOffsetSocialScience;
        this.difOffsetPhysicalTraining = difOffsetPhysicalTraining;
        this.difOffsetSecurityBasics = difOffsetSecurityBasics;
        this.difOffsetNativeLiterature = difOffsetNativeLiterature;
        this.examRussianLanguage = examRussianLanguage;
        this.examMathematics = examMathematics;
        this.examInformatics = examInformatics;
        this.individualProject = individualProject;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course1Semester2 gradeIS11 = (SpecialGrade_IS_1_1Course1Semester2) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
