package com.pw.planner.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String phone;
    private LocalDate bornDate;
    private String gender;
    private String userType;

    @OneToMany(mappedBy = "user")
    private List<Planner> planners;

    public User() {
    }

    public User(long id, String name, String email, String password, String cpf, String phone, LocalDate bornDate,
            String gender, String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.phone = phone;
        this.bornDate = bornDate;
        this.gender = gender;
        this.userType = userType;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBornDate() {
        return this.bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User id(long id) {
        setId(id);
        return this;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public User phone(String phone) {
        setPhone(phone);
        return this;
    }

    public User bornDate(LocalDate bornDate) {
        setBornDate(bornDate);
        return this;
    }

    public User gender(String gender) {
        setGender(gender);
        return this;
    }

    public User userType(String userType) {
        setUserType(userType);
        return this;
    }
}
