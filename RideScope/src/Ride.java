import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ride {
    private String rideId;
    private String customerName;
    private double[] pickupLocation;
    private double[] dropOffLocation;
    private boolean isCompleted;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Ride(String rideId, String customerName, double[] pickupLocation, double[] dropOffLocation) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation.clone();
        this.dropOffLocation = dropOffLocation.clone();
        this.isCompleted = false;
    }

    public double[] getPickupLocation() {
        return pickupLocation.clone();
    }

    public void startRide() {
        this.startTime = LocalDateTime.now();
        System.out.println("Ride started at: " + startTime);
    }

    public void endRide() {
        this.endTime = LocalDateTime.now();
        this.isCompleted = true;
        long rideDuration = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println("Ride ended at: " + endTime);
        System.out.println("Ride duration: " + rideDuration + " minutes");
    }
}