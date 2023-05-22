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
public class SpecialGrade_IS_1_1Course1Semester1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String difOffsetBiology;
    private String difOffsetGeography;

    public SpecialGrade_IS_1_1Course1Semester1( int userID, String username, String difOffsetBiology, String difOffsetGeography) {
        this.userID = userID;
        this.username = username;
        this.difOffsetBiology = difOffsetBiology;
        this.difOffsetGeography = difOffsetGeography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SpecialGrade_IS_1_1Course1Semester1 gradeIS11 = (SpecialGrade_IS_1_1Course1Semester1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
