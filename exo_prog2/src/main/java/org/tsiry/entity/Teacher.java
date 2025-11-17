package org.tsiry.entity;

import lombok.Getter;

import java.time.Instant;

@Getter
public class Teacher extends Person{
    private String specialty;

    public Teacher(int id, String name, String lastName, Instant birthDate, String email, String phone, Teacher teacher) {
        super(id, name, lastName, birthDate, email, phone);
        this.specialty = teacher.getSpecialty();
    }
}
