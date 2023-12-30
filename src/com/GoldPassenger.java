package com;

public class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int passengerNumber, double balance) {
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
        double discountedCost = 0.9 * activityCost; // 10% discount for GoldPassenger
        if (balance >= discountedCost) {
            super.enrollForActivity(activity);
            balance -= discountedCost;
            System.out.println("GoldPassenger " + getName() + " enrolled for activity: " + activity.getName());
        } else {
            System.out.println("Insufficient balance for activity: " + activity.getName());
        }
    }
}
