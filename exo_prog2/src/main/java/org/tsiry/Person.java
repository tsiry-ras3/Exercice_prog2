package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@SuperBuilder
public class Person {
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
}
