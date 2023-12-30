package com;

public class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void enrollForActivity(Activity activity) {
        // Override the method for specific behavior
        double activityCost = activity.getCost();
        if (balance >= activityCost) {
            super.enrollForActivity(activity);
            balance -= activityCost;
            System.out.println("Passenger " + getName() + " enrolled for activity: " + activity.getName());
        } else {
            System.out.println("Insufficient balance for activity: " + activity.getName());
        }
    }
}
