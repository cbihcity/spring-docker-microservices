package com.apress.spring.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Created by ihhe0417 on 4/26/2017.
 */
@Entity
@Table(name = "journal")
public class Journal implements Serializable {

    private static final long serialVersionUID = 9034349917685748867L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Date created;
    private String summary;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_course")
    private Title titlet;

    public Title getTitlet() {
        return titlet;
    }

    public void setTitlet(Title titlet) {
        this.titlet = titlet;
    }

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public Journal(String title, String summary, String date) throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = format.parse(date);
    }

    public Journal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCreatedAsShort() {
        return format.format(created);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journal journal = (Journal) o;
        return Objects.equals(id, journal.id) &&
                Objects.equals(title, journal.title) &&
                Objects.equals(created, journal.created) &&
                Objects.equals(summary, journal.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, created, summary);
    }
}
