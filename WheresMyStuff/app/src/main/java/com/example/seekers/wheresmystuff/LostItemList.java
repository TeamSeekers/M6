package com.example.seekers.wheresmystuff;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by pritshah on 6/22/17.
 */

public class LostItemList {
    private ArrayList<LostItem> lostItemList;

    public LostItemList() {
        lostItemList = new ArrayList<LostItem>();
    }

    public ArrayList<LostItem> getLostItemList() {
        return lostItemList;
    }
}
