package org.tsiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Grade {
    private Student student;
    private double initialValue;
    private List<GradeHistory> gradeHistories;
}
