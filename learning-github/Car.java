
public class Car extends Vehicle {

    public Car(String driverName, double ratePerKm) {
        super(driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double baseFare = super.calculateFare(distance);
          
          double bookingFee = 50.0;
          return baseFare + bookingFee;
    }

}