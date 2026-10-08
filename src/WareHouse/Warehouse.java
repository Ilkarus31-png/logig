package SmartLogistics.src.WareHouse;

import java.util.ArrayList;
import java.util.List;

import SmartLogistics.src.Box.ICargo;

public class Warehouse<T extends ICargo> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public double getTotalWeight() {
        double sum = 0;
        for (T item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printManifest() {
        for (T item : items) {
            System.out.println(item.getType() + " - " + item.getWeight() + " кг");
        }
    }
}
