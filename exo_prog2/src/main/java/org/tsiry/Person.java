package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
}
