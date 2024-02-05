package edu.hogwarts.data;

import edu.generic.Teacher;

import java.time.*;


public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String firstName, String middleName, String lastName, String dateOfBirth, EmploymentType employment, LocalDate employmentStart, LocalDate employmentEnd,
                           House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, dateOfBirth, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String fullName, String dateOfBirth, EmploymentType employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(fullName, dateOfBirth, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher() {
        super();

    }

    public House getHouse() {
        return house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    public void setHouse(House house) {
        this.house = house;
    }


    @Override
    public String toString() {
        return "HogwartsTeacher{" +
                "house=" + house +
                ", headOfHouse=" + headOfHouse +
                '}';
    }
}
