package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@SuperBuilder
public class Tutor extends Person{
    private String relationDescription;
}
