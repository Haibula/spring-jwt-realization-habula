package com.example.demoauth.models.grade_is_1_1.models;

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


    public Progress_IS_1_1(String[] s) {
        this.userID = Integer.parseInt(s[0]);
        this.username = s[1];
        this.passSeptember = s[2];
        this.passOctober = s[3];
        this.passNovember = s[4];
        this.passDecember = s[5];
        this.passJanuary = s[6];
        this.passFebruary = s[7];
        this.passMarch = s[8];
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
