package com;

public class PremiumPassenger extends Passenger {

    public PremiumPassenger(String name, int passengerNumber) {
        // Constructor initializes variables using the constructor of the superclass (Passenger)
        super(name, passengerNumber);
    }

    // No additional attributes for PremiumPassenger

    @Override
    public void enrollForActivity(Activity activity) {
        // Override the method for specific behavior
        super.enrollForActivity(activity); // PremiumPassenger can enroll for activities for free
        System.out.println("PremiumPassenger " + getName() + " enrolled for activity: " + activity.getName() + " for free!");
    }
}
