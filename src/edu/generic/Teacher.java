package edu.generic;

import edu.hogwarts.data.EmploymentType;

import java.time.*;


public class Teacher extends Person {

    private EmploymentType employment;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher(String firstName, String middleName, String lastName, EmploymentType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, middleName, lastName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String fullName, EmploymentType employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(fullName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(){

    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public EmploymentType getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentType employment) {
        this.employment = employment;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employment=" + employment +
                ", employmentStart=" + employmentStart +
                ", employmentEnd=" + employmentEnd +
                '}';
    }
}
