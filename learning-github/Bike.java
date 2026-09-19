public class Bike extends Vehicle {

    public Bike(String driverName, double ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = super.calculateFare(distance);
        return baseFare * 0.80;
    }

}

    



