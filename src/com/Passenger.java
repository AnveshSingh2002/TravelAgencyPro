package com;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber) {
        // Constructor initializes variables
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void enrollForActivity(Activity activity) {
        // Allow a passenger to sign up for an activity
        activities.add(activity);
    }

    public void printDetails() {
        // Print details about the passenger, including enrolled activities
        System.out.println("Passenger Details:");
        System.out.println("  Name: " + name);
        System.out.println("  Passenger Number: " + passengerNumber);
        System.out.println("  Enrolled Activities:");
        for (Activity activity : activities) {
            System.out.println("    - " + activity.getName() + " at " + activity.getDestination().getName());
        }
    }
}
