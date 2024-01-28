package edu.hogwarts;

public class Student extends Person {

    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);

    }
}
