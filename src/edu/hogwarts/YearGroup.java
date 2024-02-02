package edu.hogwarts;

import java.time.*;
import java.util.ArrayList;


public class YearGroup {

    private int schoolYear;
    private LocalDate beginningOfSchoolYear;
    private ArrayList<Student> students;


    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = new ArrayList<>();
    }

    public YearGroup() {

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public LocalDate getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
