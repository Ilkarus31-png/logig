package SmartLogistics.src.Vehicles;

import SmartLogistics.src.Box.ITrackable;

public class Truck extends Vehicle implements ITrackable{
    private boolean hasTrailer;
    private int latitude;
    private int longitude;

    public Truck (String id, double maxCapacityKg, boolean hasTrailer) {
        super(id, hasTrailer ? maxCapacityKg + 5000.0 : maxCapacityKg);
        this.hasTrailer = hasTrailer;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void move() {
        System.out.println(String.format("Трак %s едет по дороге со скоростью 70 км/ч", getId()));
        latitude += 5;
        longitude += 5;
        System.out.println(
            String.format("латитюде: %d\nлонгитюде: %d",
            latitude, longitude));
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    @Override
    public void sendStatusUpdate() {
        System.out.println("Сэнд статус апдейт трак");
    }

    @Override
    public String getCurrentCoordinates() {
        return String.format("Координаты: (%d, %d)", latitude, longitude);
    }

}
