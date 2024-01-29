package edu.hogwarts;

public class Ingredient extends TeachingMaterial {

    private double amount;
    private String unit;

    public Ingredient(String name, boolean onShoppingList, boolean required, boolean provided, String notes, double amount, String unit) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
        this.amount = amount;
        this.unit = unit;
    }
}
