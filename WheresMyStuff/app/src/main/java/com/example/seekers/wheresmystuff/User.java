package com.example.seekers.wheresmystuff;

import java.util.ArrayList;

/**
 * This class represents the User account.
 * Created by pritshah on 6/17/17.
 */

public class User extends Person {
    private String name;
    private String username;
    private String password;
    private String accountType;

    public User() {

    }

    /**
     * Create a User account with the given data.
     *
     * @param name The name of the user.
     * @param username The user's username for login and within the app.
     * @param password The user's password for login.
     * @param accountType The type of account for this user.
     */
    public User(String name, String username, String password, String accountType) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

    /**
     * Get the name of the user.
     *
     * @return name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the username for the user's account.
     *
     * @return username of the account.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Get the status of the account.
     *
     * @return type of account for the user.
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Get the password for the user's account.
     *
     * @return password of the account.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Overrides the toString method to accurately describe this class
     * @return a String that holds a proper description of this class
     */
    public String toString() {
        return "Name: " + this.name + " Account Type: " + this.accountType;
    }
}
