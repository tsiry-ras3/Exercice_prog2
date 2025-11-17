package org.tsiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
public class Teacher extends Person{
    private String specialty;

    public Teacher(int id, String name, String lastName, LocalDate birthDate, String email, String phone, Teacher teacher) {
        super(id, name, lastName, birthDate, email, phone);
        this.specialty = teacher.getSpecialty();
    }
}
