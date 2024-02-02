package edu.hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;

public class InitApp {

    private ArrayList<House> houses;


    public void initialize() {
        houses = createHouses();
        ArrayList<HogwartsStudent> students = createHogwartsStudents();
        Subject potionsFag = new Subject("Potions", 2010, false);
        HogwartsTeacher hTeacher = new HogwartsTeacher("Horace Slughorn", EmploymentType.TEACHER, LocalDate.of(2000, 12, 12), null, houses.get(0), false);

        Course kursus = new Course(potionsFag, hTeacher);
        kursus.addAllStudents(students);
        TextBook bog = new TextBook("Advanced Potion-Making", false, true, true, null, "Libatius Borage", "Merge Books", 1946);
        Tool solvKniv = new Tool("Silver Knife");
        kursus.addMaterials(bog, solvKniv);

    }

    private ArrayList<House> createHouses() {
        ArrayList<House> arr = new ArrayList<>();

        arr.add(new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"}));
        arr.add(new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"}));
        arr.add(new House("hufflePuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"}));
        arr.add(new House("RavenClaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"}));

        return arr;
    }

    private ArrayList<HogwartsStudent> createHogwartsStudents() {
        ArrayList<HogwartsStudent> arr = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            House randomHouse = this.houses.get((int) (Math.random() * 4));
            arr.add(new HogwartsStudent("Ole Jensen", 1991, 2000, false, randomHouse, false));
        }

        return arr;
    }
}
