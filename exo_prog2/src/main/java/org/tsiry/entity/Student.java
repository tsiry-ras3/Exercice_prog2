package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
public class Student extends Person{

    private String group;
    private Tutor tutor ;
}
