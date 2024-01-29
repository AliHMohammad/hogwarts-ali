package edu.hogwarts;

public class TextBook extends TeachingMaterial {

    private String author;
    private String publisher;
    private int publishedYear;

    public TextBook(String name, boolean onShoppingList, boolean required, boolean provided, String notes, String author, String publisher, int publishedYear) {
        this.name = name;
        this.onShoppingList = onShoppingList;
        this.required = required;
        this.provided = provided;
        this.notes = notes;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

}
