package com.example.labspringbootenum;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String passportNumber;

    @Enumerated(EnumType.STRING)
    private Enum.Status status;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Enum.Status getStatus() {
        return status;
    }

    public void setStatus(Enum.Status status) {
        this.status = status;
    }
}

