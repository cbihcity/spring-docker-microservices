package com.apress.spring.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeroDishonest on 28.04.2017.
 */
@Entity
@Table(name = "titl1")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String course;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_course")
    List<Journal> list = new ArrayList<>();

    public Long getId_course() {
        return id;
    }

    public void setId_course(Long id_course) {
        this.id = id_course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Journal> getList() {
        return list;
    }

    public void setList(List<Journal> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Title title = (Title) o;

        if (id != null ? !id.equals(title.id) : title.id != null) return false;
        return course != null ? course.equals(title.course) : title.course == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        return result;
    }
}
