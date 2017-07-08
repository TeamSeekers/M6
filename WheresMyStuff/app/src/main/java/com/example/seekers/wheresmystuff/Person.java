package com.example.seekers.wheresmystuff;

/**
 * A class that represents a person(user or administrator)
 */
public abstract class Person {
    /**
     * getter method for the name
     * @return the name of the person
     */
    public abstract String getName();

    /**
     * getter method for the username
     * @return the username of the person
     */
    public abstract String getUsername();

    /**
     * getter method for the AcccountType
     * @return the accounttype for the person
     */
    public abstract String getAccountType();

    /**
     * the getter method for the password
     * @return the password for the person
     */
    public abstract String getPassword();

    /**
     * ovverides the tostring method for this class
     * @return a string that properly describes the information held in the
     * class
     */
    public abstract String toString();
}
