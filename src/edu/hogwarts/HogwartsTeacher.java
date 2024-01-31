package edu.hogwarts;

import java.util.Date;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String firstName, String middleName, String lastName, String employment, Date employmentStart, Date employmentEnd, House house, boolean headOfHouse) {
        super(firstName, middleName, lastName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
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
}
