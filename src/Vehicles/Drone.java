package SmartLogistics.src.Vehicles;

public class Drone extends Vehicle {
    private int batteryLevel;

    public Drone (String id, double maxCapacityKg, int batteryLevel) {
        super(id, maxCapacityKg);

        if (batteryLevel < 0 && batteryLevel > 100) {
            throw new IllegalArgumentException("Заряд батареи должен быть > 0 и < 100");
        }
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        System.out.println(String.format("Дрон %s летит по воздуху, заряд батареи в процентах: %d", getId(), batteryLevel));
        batteryLevel -= 5;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
