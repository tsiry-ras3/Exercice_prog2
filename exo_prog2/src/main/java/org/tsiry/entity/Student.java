package org.tsiry.entity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;

@Getter
public class Student extends Person{

    private String group;
    private Tutor tutor ;

    public Student(int id, String name, String lastName, LocalDate birthDate, String email, String phone, String group, Tutor tutor) {
        super(id, name, lastName, birthDate, email, phone);
        this.group = group;
        this.tutor = tutor;
    }

    public double getExamGrade(Exam exam, Instant t){
        Grade studentGrade = null;
      for (Grade grade: exam.getGrades()){
          if(grade.getStudent().equals(this)){
              studentGrade = grade;
              break;
          }
      }
      if (studentGrade == null){
          return 0;
      }

      GradeHistory latestHistory = null;
      for (GradeHistory history: studentGrade.getGradeHistories()){
          if(history.getStart().isBefore(ChronoLocalDateTime.from(t))){
              if(latestHistory == null || history.getStart().isAfter(latestHistory.getStart())){
                  latestHistory = history;
              }
          }
      }

      if (latestHistory != null){
          return latestHistory.getNewValue();
      }else{
          return studentGrade.getInitialValue();
      }

    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double totalWeighted = 0.0;
        double sumCoefficients = 0.0;

        for (Exam exam : course.getExams()) {
            double grade = student.getExamGrade(exam, t);
            double coeff = exam.getCoefficient();
            totalWeighted += grade * coeff;
            sumCoefficients += coeff;
        }

        if (sumCoefficients == 0.0) {
            return 0.0;
        }

        return totalWeighted / sumCoefficients;
    }
}
