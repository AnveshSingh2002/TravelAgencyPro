package com;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        // Constructor initializes variables
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity) {
        // Add an activity to the destination
        activities.add(activity);
    }

    public void printActivities() {
        // Print details of activities available at the destination
        System.out.println("Activities at " + name + ":");
        for (Activity activity : activities) {
            System.out.println("  - Name: " + activity.getName());
            System.out.println("    Description: " + activity.getDescription());
            System.out.println("    Cost: $" + activity.getCost());
            System.out.println("    Capacity: " + activity.getCapacity());
        }
    }
}
