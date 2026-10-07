package SmartLogistics.src.Vehicles;

public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck (String id, double maxCapacityKg, boolean hasTrailer) {
        super(id, hasTrailer ? maxCapacityKg + 5000.0 : maxCapacityKg);
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void move() {
        System.out.println(String.format("Трак %s едет по дороге со скоростью 70 км/ч", getId()));
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }
}
