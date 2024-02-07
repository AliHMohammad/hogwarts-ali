package edu.hogwarts.data;

import edu.generic.Student;

import java.util.ArrayList;

public class HogwartsStudent extends Student implements HogwartsPerson {

    private House house;
    private boolean prefect;
    private ArrayList<String> teams;

    public HogwartsStudent(String firstName, String middleName, String lastName, String dateOfBirth, int enrollmentYear, int graduationYear, boolean graduated, House house,
                           boolean prefect) {
        super(firstName, middleName, lastName, dateOfBirth, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = new ArrayList<>();
    }

    public HogwartsStudent(String fullName, String dateOfBirth, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect) {
        super(fullName, dateOfBirth, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = new ArrayList<>();
    }

    public HogwartsStudent() {
        super();

    }

    public House getHouse() {
        return house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return this.getFullName() + " is " + getAge() + " years old and is in house " + getHouse() + ".";
    }
}
