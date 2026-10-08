package SmartLogistics.src.Vehicles;

import SmartLogistics.src.Box.ITrackable;

public class Drone extends Vehicle implements ITrackable{
    private int batteryLevel;
    private int latitude;
    private int longitude;
    private int altitude;

    public Drone (String id, double maxCapacityKg, int batteryLevel) {
        super(id, maxCapacityKg);

        if (batteryLevel < 0 && batteryLevel > 100) {
            throw new IllegalArgumentException("Заряд батареи должен быть > 0 и < 100");
        }
        this.batteryLevel = batteryLevel;
        this.latitude = 0;
        this.longitude = 0;
        this.altitude = 0;
    }

    @Override
    public void move() {
        System.out.println(String.format("Дрон %s летит по воздуху, заряд батареи в процентах: %d", getId(), batteryLevel));
        batteryLevel -= 5;
        latitude += 5;
        longitude += 5;
        altitude += 5;
        System.out.println(
            String.format("латитюдэ: %d\nлонгитюдэ: %d\nальтитюдэ",
            latitude, longitude, altitude));
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void sendStatusUpdate() {
        System.out.println("Сэнд статус апдейт дрон");
    }

    @Override
    public String getCurrentCoordinates() {
        return String.format("Координаты: (%d, %d, %d)",
        latitude, longitude, altitude);
    }
}
