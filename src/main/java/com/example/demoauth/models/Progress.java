package com.example.demoauth.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String pass1;
    private String pass2;
    private String pass3;
    private String pass4;
    private String pass5;
    private String pass6;
    private String pass7;

    public Progress(String[] s) {
        this.username = s[0];
        this.pass1 = s[1];
        this.pass2 = s[2];
        this.pass3 = s[3];
        this.pass4 = s[4];
        this.pass5 = s[5];
        this.pass6 = s[6];
        this.pass7 = s[7];

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Progress progress = (Progress) o;
        return getId() != null && Objects.equals(getId(), progress.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
