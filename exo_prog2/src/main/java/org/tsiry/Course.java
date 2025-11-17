package org.tsiry;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
}
