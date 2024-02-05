package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<String> run() {
        printCommands();
        char command = Character.toLowerCase(scanner.next().charAt(0));
        ArrayList<String> inputs = new ArrayList<>();

        if (command == 'f') {
            return filter();
        } else if (command == 's') {
            return sort();
        } else if (command == 'a') {
            inputs.add("a");
            return inputs;
        } else if (command == 'x') {
            printFarewell();
            inputs.add("x");
            return inputs;
        }

        System.out.println("Unknown command. Try again.");
        return null;
    }

    private ArrayList<String> sort() {
        printSpecifySort();
        String sortBy = scanner.nextLine().toLowerCase();
        printSpecifySortDirection();
        String sortDir = scanner.nextLine().toLowerCase();

        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(sortBy);
        inputs.add(sortDir);

        return inputs;
    }

    private ArrayList<String> filter() {
        printSpecifyFilter();
        String filterBy = scanner.nextLine().toLowerCase();

        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(filterBy);
        return inputs;
    }

    private void printWelcome() {
        System.out.println("""
                ===============================================
                ===============================================
                WELCOME WELCOME WELCOME WELCOME WELCOME WELCOME
                ===============================================
                ===============================================
                """);
    }

    private void printFarewell() {
        System.out.println("""
                ===============================================
                ===============================================
                GOODBYE GOODBYE GOODBYE GOODBYE GOODBYE GOODBYE
                ===============================================
                ===============================================
                """);
    }

    private void printCommands() {
        System.out.println("""
                Tryk 'f' for filtrering af hus
                Tryk 's' for sortering
                Tryk 'a' for at vise alle
                ----------------------
                Tryk 'x' for at afslutte
                """);
    }

    private void printSpecifySort() {
        System.out.println("Hvad skal der sorteres efter?");
        System.out.println("Mulige inputs ->");
        System.out.println("""
                alder
                fornavn
                mellemnavn
                efternavn
                hus
                """);
    }

    private void printSpecifySortDirection() {
        System.out.println("""
                Tryk 'a' for ascending
                Tryk 'd' for descending
                """);
    }

    private void printSpecifyFilter() {
        System.out.println("Hvad skal der filtreres efter?");
        System.out.println("Mulige inputs ->");
        System.out.println("""
                Ravenclaw
                Slytherin
                Hufflepuff
                Gryffindor
                Student
                Teacher
                """);
    }

    public void printTableHeader() {
        System.out.println(
                String.format("%15s %7s %22s %10s %22s %10s %10s %7s %14s %10s %12s", "Fornavn", "|", "Mellemnavn", "|", "Efternavn", "|", "Alder", "|", "Hus", "|",
                        "Rolle"));
        System.out.println(String.format("%s",
                "-----------------------------------------------------------------------------------------------------------------------------------------------------------"));
    }


    // fornavn, mellemnavn, efternavn, alder, house, rolle
    public void printTableBody(List<HogwartsPerson> hogwartsPersonList) {
        for (HogwartsPerson person : hogwartsPersonList) {


            if (person instanceof HogwartsStudent student) {
                System.out.println(String.format("%15s %7s %22s %10s %22s %10s %10s %7s %14s %10s %12s", student.getFirstName(), "|", student.getMiddleName(), "|", student.getLastName(), "|", student.getAge(), "|", student.getHouse(), "|", "Student"));
            } else if (person instanceof HogwartsTeacher teacher) {
                System.out.println(String.format("%15s %7s %22s %10s %22s %10s %10s %7s %14s %10s %12s", teacher.getFirstName(), "|", teacher.getMiddleName(), "|", teacher.getLastName(), "|", teacher.getAge(), "|", teacher.getHouse(), "|", "Student"));
            }


        }
    }

}
