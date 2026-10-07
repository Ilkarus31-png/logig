package SmartLogistics.src.Vehicles;

public class Car extends Vehicle{
    private int passengerCount;

    public Car (String id, double maxCapacityKg, int passengerCount) {
        super(id, 500);
        this.passengerCount = passengerCount;
    }

    @Override
    public void move () {
        System.out.println(String.format("Машина %s едет по дороге со скоростью 90 км/ч", getId()));
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
