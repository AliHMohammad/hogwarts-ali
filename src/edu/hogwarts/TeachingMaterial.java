package edu.hogwarts;

public abstract class TeachingMaterial {

    protected String name;
    protected boolean onShoppingList;
    protected boolean required;
    protected boolean provided;
    protected String notes;

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

}
