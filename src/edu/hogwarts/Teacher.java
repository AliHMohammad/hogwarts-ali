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

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }
}
