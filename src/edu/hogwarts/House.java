package edu.hogwarts;



public class House {

    private String name;
    private String founder;
    private String[] colors;

    public House(String name, String founder, String[] colors) {
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    public House() {

    }

    public String getName() {
        return name;
    }

    public String[] getColors() {
        return colors;
    }

    public String getFounder() {
        return founder;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setName(String name) {
        this.name = name;
    }
}
