package com.example.demoauth.models.grade_is1.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Progress_IS_1_1 {

    //Разберись где апрель?
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private int userID;
    private String username;
    private String passSeptember;
    private String passOctober;
    private String passNovember;
    private String passDecember;
    private String passJanuary;
    private String passFebruary;
    private String passMarch;
    private String passApril;
    private String passMay;
    private String passJune;
    private String course;

    public Progress_IS_1_1(int userID, String username, String passSeptember, String passOctober, String passNovember, String passDecember, String passJanuary, String passFebruary, String passMarch, String passApril, String passMay, String passJune, String course) {
        this.userID = userID;
        this.username = username;
        this.passSeptember = passSeptember;
        this.passOctober = passOctober;
        this.passNovember = passNovember;
        this.passDecember = passDecember;
        this.passJanuary = passJanuary;
        this.passFebruary = passFebruary;
        this.passMarch = passMarch;
        this.passApril = passApril;
        this.passMay = passMay;
        this.passJune = passJune;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Progress_IS_1_1 progressIS11 = (Progress_IS_1_1) o;
        return getId() != null && Objects.equals(getId(), progressIS11.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
