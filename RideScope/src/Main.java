public class Main {
    public static void main(String[] args) {
        // creates taxis and add them to the fleet
        Taxi taxi1 = new Taxi("T001", new double[]{1.0, 1.0});
        Taxi taxi2 = new Taxi("T002", new double[]{2.0, 2.0});
        Taxi taxi3 = new Taxi("T003", new double[]{3.0, 3.0});

        FleetManagementSystem fleetManagementSystem = new FleetManagementSystem();
        fleetManagementSystem.addTaxi(taxi1);
        fleetManagementSystem.addTaxi(taxi2);
        fleetManagementSystem.addTaxi(taxi3);

        System.out.println("\nTaxis are added to the fleet... \n");

        System.out.println("Customers requested a taxi!");

        // creates ride requests and assign taxis
        Ride ride1 = new Ride("R001", "John Doe", new double[]{0.0, 0.0}, new double[]{1.0, 1.0});
        Ride ride2 = new Ride("R002", "Jane Doe", new double[]{4.0, 4.0}, new double[]{5.0, 5.0});

        fleetManagementSystem.requestRide(ride1);
        ride1.startRide();
        fleetManagementSystem.requestRide(ride2);
        ride2.startRide();

        // simulate taxi movements and complete rides (in a real-world scenario, this would be handled asynchronously)
        taxi1.updateLocation(new double[]{1.5, 1.5});
        taxi2.updateLocation(new double[]{3.0, 3.0});

        System.out.println("\nUpdated taxi locations:");

        if (taxi1.getCurrentRide() != null) {
            taxi1.completeRide();
            ride1.endRide();
            System.out.println("\nTaxi1 completed ride.");
        }

        if (taxi2.getCurrentRide() != null) {
            taxi2.completeRide();
            ride2.endRide();
            System.out.println("Taxi2 completed ride.");
        }
    }
}