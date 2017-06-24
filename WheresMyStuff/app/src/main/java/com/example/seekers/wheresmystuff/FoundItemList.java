package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * Created by pritshah on 6/24/17.
 */

public class FoundItemList {
    private ArrayList<FoundItem> foundItemList;

    public FoundItemList() {
        foundItemList = new ArrayList<FoundItem>();
    }

    public ArrayList<FoundItem> getFoundItemList() {
        return foundItemList;
    }
}
