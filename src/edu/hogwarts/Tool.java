package edu.hogwarts;

public class Tool extends TeachingMaterial {

    private String description;

    public Tool(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String description) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
