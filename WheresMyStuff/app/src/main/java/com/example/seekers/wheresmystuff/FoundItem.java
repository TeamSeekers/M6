package com.example.seekers.wheresmystuff;

/**
 * Created by pritshah on 6/24/17.
 */

public class FoundItem {
    private String name;
    private String color;
    private String description;

    public FoundItem(String name, String color, String description) {
        this.name = name;
        this.color = color;
        this.description = description;
    }

    public String toString() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }
}
