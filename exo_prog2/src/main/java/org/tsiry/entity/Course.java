package org.tsiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
    private List<Exam> exams;
}
