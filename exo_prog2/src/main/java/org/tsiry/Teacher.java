package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Teacher extends Person{
    private String specialty;
}
