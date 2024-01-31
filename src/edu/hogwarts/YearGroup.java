package edu.hogwarts;

import java.util.ArrayList;
import java.util.Date;

public class YearGroup {

    private int schoolYear;
    private Date beginningOfSchoolYear;
    private ArrayList<Student> students;


    public YearGroup(int schoolYear, Date beginningOfSchoolYear) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Date getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setBeginningOfSchoolYear(Date beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
