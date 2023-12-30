package com;

public class TravelAgencySystemMain {
    public static void main(String[] args) {
        // Create instances of classes and test functionality here
        TravelPackage europePackage = new TravelPackage("Europe Tour", 20);

        Destination paris = new Destination("Paris");
        Activity eiffelTowerTour = new Activity("Eiffel Tower Tour", "Guided tour of Eiffel Tower", 50.0, 15);
        paris.addActivity(eiffelTowerTour);
        europePackage.addDestination(paris);

        // Add other destinations, activities, and passengers as needed
        // Example: Destination london = new Destination("London");

        // Test functionality (add passengers, print itinerary, etc.)
        europePackage.addPassenger(new StandardPassenger("John", 1, 100.0));
        europePackage.addPassenger(new GoldPassenger("Emily", 2, 200.0));

        // Print itinerary and passenger list
        europePackage.printItinerary();
        europePackage.printPassengerList();
    }
}
