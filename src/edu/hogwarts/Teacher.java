package edu.hogwarts;

import java.util.Date;

public class Teacher extends Person {

    private String employment;
    private Date employmentStart;
    private Date employmentEnd;

    public Teacher(String firstName, String middleName, String lastName, String employment, Date employmentStart, Date employmentEnd) {
        super(firstName, middleName, lastName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }
}
