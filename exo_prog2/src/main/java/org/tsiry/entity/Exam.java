package org.tsiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class Exam {
    private int id;
    private String title;
    private Course course;
    private Instant dateTime;
    private double coefficient;
    private List<Grade> grades;
}
