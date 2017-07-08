package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * This class represents a list of Found items.
 */
public class FoundItemList {
    private ArrayList<FoundItem> foundItemList;

    /**
     * A constructer for the class
     */
    public FoundItemList() {
        foundItemList = new ArrayList<>();
    }

    /**
     * getter for the foundItemlist
     * @return the arraylist foundItemList
     */
    public ArrayList<FoundItem> getFoundItemList() {
        return foundItemList;
    }
}
