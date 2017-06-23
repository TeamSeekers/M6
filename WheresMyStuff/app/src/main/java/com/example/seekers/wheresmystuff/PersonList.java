package com.example.seekers.wheresmystuff;

import java.util.HashMap;

/**
 * Created by Marcus on 6/20/2017.
 */

public class PersonList {
    private HashMap<String, Person> personList;

    public PersonList() {
        personList = new HashMap<String, Person>();
    }

    public HashMap<String, Person> getPersonList() {
        return personList;
    }
}
