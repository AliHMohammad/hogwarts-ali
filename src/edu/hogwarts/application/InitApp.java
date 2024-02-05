package edu.hogwarts.application;

import edu.hogwarts.data.EmploymentType;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InitApp {

    private List<House> houses;

    public InitApp() {
        houses = new ArrayList<>();
    }

    public ArrayList<HogwartsStudent> createStudentsArr() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();



        return students;
    }

    public ArrayList<HogwartsTeacher> createTeachersArr() {
        ArrayList<HogwartsTeacher> teachers = new ArrayList<>();

        teachers.add(new HogwartsTeacher("Albus Percival Wulfric Brian Dumbledore", EmploymentType.HEADMASTER, LocalDate.now(), null, houses.get(1), false));
        teachers.add(new HogwartsTeacher("Minerva McGonegall", EmploymentType.HEAD_OF_GRYFFINDOR_HOUSE, LocalDate.now(), null, houses.get(1), true));
        teachers.add(new HogwartsTeacher("Pomona Sprout", EmploymentType.HEAD_OF_HUFFLEPUFF_HOUSE, LocalDate.now(), null, houses.get(2), true));
        teachers.add(new HogwartsTeacher("Filius Flitwick", EmploymentType.HEAD_OF_RAVENCLAW_HOUSE, LocalDate.now(), null, houses.get(3), true));
        teachers.add(new HogwartsTeacher("Severus Snape", EmploymentType.HEAD_OF_SLYTHERIN_HOUSE, LocalDate.now(), null, houses.get(0), true));
        teachers.add(new HogwartsTeacher("Horace Slughorn", EmploymentType.TEACHER, LocalDate.of(2000, 12, 12), null, houses.get(0), false));

        return teachers;
    }

    private void initiateHouses() {
        this.houses.add(new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"}));
        this.houses.add(new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"}));
        this.houses.add(new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"}));
        this.houses.add(new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"}));
    }
}
