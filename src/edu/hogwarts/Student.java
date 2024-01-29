package edu.hogwarts;

public class Student extends Person {

    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student(String firstName, String middleName, String lastName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(firstName, middleName, lastName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }


}
