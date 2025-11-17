package org.tsiry.entity;

import org.tsiry.entity.Course;
import org.tsiry.entity.Exam;
import org.tsiry.entity.Grade;
import org.tsiry.entity.GradeHistory;
import org.tsiry.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    private Student student;
    private Exam exam1;
    private Exam exam2;
    private Course course;
    private Grade grade1;
    private Grade grade2;

    @BeforeEach
    void setUp() {
        // John Do has 2 exams on PROG1, and obtains grade1(10->12) & grade2(18->20).
        student = new Student(1, "Doe", "John", null, "john@test.com", "123", "G1", null);
        grade1 = new Grade(student, 10.0, new ArrayList<>(List.of(
                new GradeHistory(Instant.parse("2025-09-01T08:00:00Z"), 12.0, "mistake")
        )));
        grade2 = new Grade(student, 18.0, new ArrayList<>(List.of(
                new GradeHistory(Instant.parse("2025-09-01T08:00:00Z"), 20.0, "mistake")
        )));
        exam1 = new Exam(1,"Prog1 midterm",null,2,Collections.singletonList(grade1));
        exam2 = new Exam(2,"Prog1 ending",null,3,Collections.singletonList(grade2));
        course = new Course(
                1,
                "PROG1",
                6,
                null,
                List.of(exam1, exam2)
        );
    }

    @Test
    void testGetExamGrade_returnsNewValue() {
        double result = student.getExamGrade(exam1, Instant.parse("2025-09-01T10:00:00Z"));
        assertEquals(12.0, result);
    }

    @Test
    void testGetExamGrade_returnsOldValue() {
        double result = student.getExamGrade(exam1, Instant.parse("2025-08-01T10:00:00Z"));
        assertEquals(10.0, result);
    }

    @Test
    void testGetCourseGrade_returnsNewValue() {
        double result = student.getCourseGrade(course, Instant.parse("2025-09-01T10:00:00Z"));
        assertEquals(16.8, result, 0.1);
    }

    @Test
    void testGetCourseGrade_returnsOldValue() {
        double result = student.getCourseGrade(course, Instant.parse("2025-08-01T10:00:00Z"));
        assertEquals(14.8, result, 0.1);
    }

}