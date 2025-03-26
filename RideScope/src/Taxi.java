import java.util.ArrayList;
import java.util.List;

// taxi class representing each taxi
public class Taxi {
    private String taxiId;
    private double[] currentLocation;
    private boolean isAvailable;
    private Ride currentRide;

    public Taxi(String taxiId, double[] currentLocation) {
        this.taxiId = taxiId;
        this.currentLocation = currentLocation;
        this.isAvailable = true;
    }

    public void updateLocation(double[] newLocation) {
        this.currentLocation = newLocation;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void acceptRide(Ride ride) {
        this.currentRide = ride;
        this.isAvailable = false;
    }

    public void completeRide() {
        this.currentRide = null;
        this.isAvailable = true;
    }

    public double[] getCurrentLocation() {
        return currentLocation;
    }

    public Ride getCurrentRide() {
        return currentRide;
    }
}