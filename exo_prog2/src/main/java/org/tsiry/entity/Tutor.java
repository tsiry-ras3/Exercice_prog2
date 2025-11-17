package org.tsiry.entity;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Tutor extends Person{
    private String relationDescription;

    public Tutor(int id, String name, String lastName, LocalDate birthDate, String email, String phone, String relationDescription) {
        super(id, name, lastName, birthDate, email, phone);
        this.relationDescription = relationDescription;
    }
}
