package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * The class that represents a list of lost items.
 */
public class LostItemList {
    private ArrayList<LostItem> lostItemList;

    /**
     * Constructer for LostItemList
     */
    public LostItemList() {
        lostItemList = new ArrayList<>();
    }

    /**
     * getter method for lostItemList
     * @return an arraylist of the lost items.
     */
    public ArrayList<LostItem> getLostItemList() {
        return lostItemList;
    }
}
