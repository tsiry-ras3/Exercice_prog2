package org.tsiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.time.LocalDate;
@Data
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private String lastName;
    private Instant birthDate;
    private String email;
    private String phone;
}
