package edu.generic;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;

    private LocalDate dateOfBirth;

    public Person(String firstName, String middleName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        setDateOfBirth(dateOfBirth);
    }

    public Person(String fullName, String dateOfBirth) {
        setFullName(fullName);
        setDateOfBirth(dateOfBirth);
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return hasMiddleName() ? this.firstName + " " + this.middleName + " " + this.lastName : this.firstName + " " + this.lastName;
    }

    public void setFullName(String fullName) {
        int firstGap = fullName.indexOf(" ");
        int lastGap = fullName.lastIndexOf(" ");

        this.firstName = fullName.substring(0, firstGap);
        this.lastName = fullName.substring(lastGap+1);
        this.middleName = firstGap == lastGap ? "" : fullName.substring(firstGap+1, lastGap);
    }

    public boolean hasMiddleName() {
        return this.middleName != null;
    }

    private void setDateOfBirth(String dateOfBirth) {
        String[] dates = dateOfBirth.split("-");
        this.dateOfBirth = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate movieDate = LocalDate.of(1992,now.getMonth(),now.getDayOfMonth());

        return dateOfBirth.until(movieDate).getYears();
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
