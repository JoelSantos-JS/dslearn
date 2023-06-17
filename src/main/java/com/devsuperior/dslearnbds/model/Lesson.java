package com.devsuperior.dslearnbds.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_lesson")
public abstract class Lesson implements Serializable {
    private long id;
    private String title;
    private Integer position;
    private Section section;

    private Set<Enrollment> enrollmentsDone = new HashSet<>();

    public Lesson() {

    }

    public Lesson(long id, String title, Integer position, Section section) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.section = section;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<Enrollment> getEnrollmentsDone() {
        return enrollmentsDone;
    }

    public void setEnrollmentsDone(Set<Enrollment> enrollmentsDone) {
        this.enrollmentsDone = enrollmentsDone;
    }

}
