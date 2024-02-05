package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;

public class UserInterface {

    public void printWelcome() {
        System.out.println("""
                ===============================================
                ===============================================
                WELCOME WELCOME WELCOME WELCOME WELCOME WELCOME
                ===============================================
                ===============================================
                """);
    }

    public void printList(ArrayList<HogwartsPerson> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
