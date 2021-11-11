package com.pw.planner.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    @Column(length = 2048)
    private String contentJson;
    private boolean isLayout;

    public Content() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Content(long id, String contentJson, boolean isLayout) {
        this.id = id;
        this.contentJson = contentJson;
        this.isLayout = isLayout;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContentJson() {
        return this.contentJson;
    }

    public void setContentJson(String contentJson) {
        this.contentJson = contentJson;
    }

    public boolean isIsLayout() {
        return this.isLayout;
    }

    public boolean getIsLayout() {
        return this.isLayout;
    }

    public void setIsLayout(boolean isLayout) {
        this.isLayout = isLayout;
    }

    public Content id(long id) {
        setId(id);
        return this;
    }

    public Content contentJson(String contentJson) {
        setContentJson(contentJson);
        return this;
    }

    public Content isLayout(boolean isLayout) {
        setIsLayout(isLayout);
        return this;
    }
}
