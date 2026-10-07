package SmartLogistics.src;

import java.util.ArrayList;
import java.util.List;

import SmartLogistics.src.Vehicles.Car;
import SmartLogistics.src.Vehicles.CargoItem;
import SmartLogistics.src.Vehicles.Drone;
import SmartLogistics.src.Vehicles.FleetManager;
import SmartLogistics.src.Vehicles.Truck;
import SmartLogistics.src.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {

        CargoItem box = new CargoItem("Коробка", 10.5);
        CargoItem tv = new CargoItem("Телевизор", 250.0);
        CargoItem envelope = new CargoItem("Конверт", 0.5);

        System.out.println("Груз: " + box.getName() + ", вес: " + box.getWeight());
        System.out.println("Груз: " + tv.getName() + ", вес: " + tv.getWeight());
        System.out.println("Груз: " + envelope.getName() + ", вес: " + envelope.getWeight());

        System.out.println();

        Drone drone = new Drone("d-1", 5.0, 80);
        Truck truck = new Truck("t-1", 10000.0, true);
        Car car = new Car("c-1", 500.0, 4);

        System.out.println("Дрон: id=" + drone.getId()
                + ", макс. груз=" + drone.getMaxCapacityKg()
                + ", заряд=" + drone.getBatteryLevel());
        System.out.println("Трак: id=" + truck.getId()
                + ", макс. груз=" + truck.getMaxCapacityKg()
                + ", прицеп=" + truck.getHasTrailer());
        System.out.println("Машина: id=" + car.getId()
                + ", макс. груз=" + car.getMaxCapacityKg()
                + ", пассажиров=" + car.getPassengerCount());

        System.out.println();


        System.out.println();



        drone.load(2.0);
        System.out.println("Дрон после load(2.0): " + drone.getCurrentLoadKg());



        truck.load(box);
        System.out.println("Трак после load(CargoItem): " + truck.getCurrentLoadKg());



        List<CargoItem> items = new ArrayList<>();
        items.add(envelope);
        items.add(new CargoItem("Сумка", 20.0));
        car.load(items);
        System.out.println("Машина после load(List): " + car.getCurrentLoadKg());

        System.out.println();



        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(drone);
        fleet.add(truck);
        fleet.add(car);



        FleetManager manager = new FleetManager();
        manager.startDelivery(fleet);

        System.out.println();
        System.out.println("Заряд дрона после полёта: " + drone.getBatteryLevel());
    }
}