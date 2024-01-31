package edu.hogwarts;

import java.util.ArrayList;

public class House {

    private String name;
    private String founder;
    private ArrayList<String> colors;

    public House(String name, String founder, ArrayList<String> colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public String getFounder() {
        return founder;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setName(String name) {
        this.name = name;
    }
}
