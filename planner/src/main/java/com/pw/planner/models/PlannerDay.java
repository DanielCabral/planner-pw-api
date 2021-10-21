package com.pw.planner.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "planner_days")
public class PlannerDay {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private LocalDate day;

    @OneToOne
    @JoinColumn(name = "id_content")
    private Content content;

    @ManyToOne
    @JoinColumn(name = "id_planner")
    private Planner planner;

    public PlannerDay() {
    }

    public Planner getPlanner() {
        return planner;
    }

    public void setPlanner(Planner planner) {
        this.planner = planner;
    }

    public PlannerDay(long id, LocalDate day, Content content) {
        this.id = id;
        this.day = day;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDay() {
        return this.day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public Content getContent() {
        return this.content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public PlannerDay id(long id) {
        setId(id);
        return this;
    }

    public PlannerDay day(LocalDate day) {
        setDay(day);
        return this;
    }

    public PlannerDay content(Content content) {
        setContent(content);
        return this;
    }
}
