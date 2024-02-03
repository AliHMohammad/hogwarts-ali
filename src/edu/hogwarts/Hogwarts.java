package edu.hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hogwarts {

    private ArrayList<House> houses;
    private ArrayList<HogwartsStudent> students;
    private ArrayList<TeachingMaterial> teachingMaterials;
    private Course kursus;

    public Hogwarts() {
        this.students = new ArrayList<>();
        this.houses = new ArrayList<>();
        this.teachingMaterials = new ArrayList<>();
    }


    public void initialize() {
        createHouses();
        createHogwartsStudents();
        createMaterials();
        Subject potionsFag = new Subject("Potions", 2010, false);
        HogwartsTeacher hTeacher = new HogwartsTeacher("Horace Slughorn", EmploymentType.TEACHER, LocalDate.of(2000, 12, 12), null, houses.get(0), false);

        this.kursus = new Course(potionsFag, hTeacher);
        this.kursus.addAllStudents(this.students);
        this.kursus.addMaterials(this.teachingMaterials);

        System.out.println(kursus);
    }

    private void createHouses() {
        this.houses.add(new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"}));
        this.houses.add(new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"}));
        this.houses.add(new House("hufflePuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"}));
        this.houses.add(new House("RavenClaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"}));
    }

    private void createHogwartsStudents() {
        for (int i = 0; i < 12; i++) {
            House randomHouse = this.houses.get((int) (Math.random() * 4));
            this.students.add(new HogwartsStudent("Ole Jensen", 1991, 2000, false, randomHouse, false));
        }
    }

    private void createMaterials() {
        TextBook bog = new TextBook("Advanced Potion-Making", false, true, true, null, "Libatius Borage", "Merge Books", 1946);
        Tool solvKniv = new Tool("Silver Knife");
        Ingredient slothBrain = new Ingredient("Sloth Brain", false, false, false, "A Sloth brain", 1, "kg");
        Wand wand = new Wand("Hogwarts Wand", false, false, false, "A normal wand", 3, "Oak", "Strong core");

        teachingMaterials.add(bog);
        teachingMaterials.add(solvKniv);
        teachingMaterials.add(slothBrain);
        teachingMaterials.add(wand);
    }
}
