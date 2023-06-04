package com.example.demoauth.models.grade_is1.models.course1;

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
public class Grade_IS_1_1Course1Semester1 {
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
    private String gradeBiology;
    private String gradeStory;
    private String gradeSocialScience;
    private String gradeGeography;
    private String gradePhysicalTraining;
    private String inputGroup;
    private String month;


    public Grade_IS_1_1Course1Semester1(int userID, String username, String gradeRussianLanguage, String gradeLiterature, String gradeMathematics, String gradeEnglishLanguage, String gradeComputerScience, String gradePhysics, String gradeBiology, String gradeStory, String gradeSocialScience, String gradeGeography, String gradePhysicalTraining, String month, String inputGroup) {
        this.userID = userID;
        this.username = username;
        this.gradeRussianLanguage = gradeRussianLanguage;
        this.gradeLiterature = gradeLiterature;
        this.gradeMathematics = gradeMathematics;
        this.gradeEnglishLanguage = gradeEnglishLanguage;
        this.gradeComputerScience = gradeComputerScience;
        this.gradePhysics = gradePhysics;
        this.gradeBiology = gradeBiology;
        this.gradeStory = gradeStory;
        this.gradeSocialScience = gradeSocialScience;
        this.gradeGeography = gradeGeography;
        this.gradePhysicalTraining = gradePhysicalTraining;
        this.month = month;
        // отдельный столбез в бд для вывода названии группы привязан к 1 пользователи 1 курса 1 семестра
        this.inputGroup = inputGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1Course1Semester1 gradeIS11 = (Grade_IS_1_1Course1Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
