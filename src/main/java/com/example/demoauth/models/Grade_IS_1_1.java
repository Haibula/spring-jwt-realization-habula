package com.example.demoauth.models;

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
public class Grade_IS_1_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String grade1;
    private String grade2;
    private String grade3;
    private String grade4;
    private String grade5;
    private String grade6;
    private String grade7;
    private String month;

    public Grade_IS_1_1(String[] s, String month) {
        this.username = s[0];
        this.grade1 = s[1];
        this.grade2 = s[2];
        this.grade3 = s[3];
        this.grade4 = s[4];
        this.grade5 = s[5];
        this.grade6 = s[6];
        this.grade7 = s[7];
        this.month = month;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Grade_IS_1_1 gradeIS11 = (Grade_IS_1_1) o;
        return getId() != null && Objects.equals(getId(), gradeIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
