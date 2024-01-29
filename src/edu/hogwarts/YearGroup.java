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
}
