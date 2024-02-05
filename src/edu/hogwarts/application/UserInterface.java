package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        printWelcome();

        while (true) {
            printCommands();
            char command = Character.toLowerCase(scanner.next().charAt(0));

            if (command == 'f') {
                filter();
            } else if (command == 's') {
                sort();
            } else if (command == 'x') {
                printFarewell();
                break;
            }

            System.out.println("Unknown command. Try again.");
        }
    }

    private void sort() {
        printSpecifySort();
        String sortBy = scanner.nextLine().toLowerCase();
        printSpecifySortDirection();
        char sortDir = Character.toLowerCase(scanner.next().charAt(0));

    }

    private void filter() {
        printSpecifyFilter();
        char filterBy = Character.toLowerCase(scanner.next().charAt(0));
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

    /*private void printList(ArrayList<HogwartsPerson> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }*/

    private void printCommands() {
        System.out.println("""
                Tryk 'f' for filtrering af hus
                Tryk 's' for sortering
                ----------------------
                Tryk 'x' for at afslutte
                """);
    }

    private void printSpecifySort() {
        System.out.println("Hvad skal der sorteres efter?");
        System.out.println("Mulige inputs ->");
        System.out.println("""
                alder
                navn
                """);
    }

    private void printSpecifySortDirection() {
        System.out.println("""
                Tryk 'a' for ascending
                Tryk 'd' for descending
                """);
    }

    private void printSpecifyFilter() {
        System.out.println("""
                Tryk 'r' for Ravenclaw
                Tryk 's' for Slytherin
                Tryk 'h' for Hufflepuff
                Tryk 'g' for Gryffindor
                """);
    }
}
