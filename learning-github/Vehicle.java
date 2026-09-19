public abstract class Vehicle {

    protected String driverName;
    protected double ratePerKm;

    public Vehicle(String driverName, double ratePerKm) {

        this.driverName = driverName;
        this.ratePerKm = ratePerKm;

    }
    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    

    

public double calculateFare(double distance) {
    return distance * ratePerKm;


}

public void showTripSummary() {
    System.out.println("Driver: " + driverName);
    System.out.println("Rate per km: " + ratePerKm);
}

}
