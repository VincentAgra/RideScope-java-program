import java.util.ArrayList;
import java.util.List;

public class FleetManagementSystem {
    private List<Taxi> taxis;
    private List<Ride> ongoingRides;

    public FleetManagementSystem() {
        this.taxis = new ArrayList<>();
        this.ongoingRides = new ArrayList<>();
    }

    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

    public void requestRide(Ride ride) {
        // implements the algorithm to assign the nearest available taxi to the ride
        Taxi assignedTaxi = findNearestAvailableTaxi(ride.getPickupLocation());
        if (assignedTaxi != null) {
            assignedTaxi.acceptRide(ride);
            ongoingRides.add(ride);
        } else {
            // handles the case when no taxi is available
            System.out.println("No available taxi for the ride.");
        }
    }

    private Taxi findNearestAvailableTaxi(double[] pickupLocation) {
        // implements the logic to find the nearest available taxi
        // simplified algorithm
        return taxis.stream()
                .filter(Taxi::isAvailable)
                .min((taxi1, taxi2) -> {
                    double distance1 = calculateDistance(taxi1.getCurrentLocation(), pickupLocation);
                    double distance2 = calculateDistance(taxi2.getCurrentLocation(), pickupLocation);
                    return Double.compare(distance1, distance2);
                })
                .orElse(null);
    }

    private double calculateDistance(double[] location1, double[] location2) {
        // implements the distance calculation logic using haversine formula
        return Math.sqrt(Math.pow(location1[0] - location2[0], 2) + Math.pow(location1[1] - location2[1], 2));
    }
}