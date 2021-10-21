package com.pw.planner.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "planners")
public class Planner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String cicle;

    @OneToOne
    @JoinColumn(name = "id_content")
    private Content layout;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "planner")
    private List<PlannerDay> plannerDays;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Planner() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Planner(long id, String cicle, Content layout, LocalDate startDate, LocalDate endDate,
            List<PlannerDay> plannerDays) {
        this.id = id;
        this.cicle = cicle;
        this.layout = layout;
        this.startDate = startDate;
        this.endDate = endDate;
        this.plannerDays = plannerDays;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCicle() {
        return this.cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public Content getLayout() {
        return this.layout;
    }

    public void setLayout(Content layout) {
        this.layout = layout;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<PlannerDay> getPlannerDays() {
        return this.plannerDays;
    }

    public void setPlannerDays(List<PlannerDay> plannerDays) {
        this.plannerDays = plannerDays;
    }

    public Planner id(long id) {
        setId(id);
        return this;
    }

    public Planner cicle(String cicle) {
        setCicle(cicle);
        return this;
    }

    public Planner layout(Content layout) {
        setLayout(layout);
        return this;
    }

    public Planner startDate(LocalDate startDate) {
        setStartDate(startDate);
        return this;
    }

    public Planner endDate(LocalDate endDate) {
        setEndDate(endDate);
        return this;
    }

    public Planner plannerDays(List<PlannerDay> plannerDays) {
        setPlannerDays(plannerDays);
        return this;
    }
}
