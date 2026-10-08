package SmartLogistics.src.WareHouse;

public class Report <T>{
    private T data;

    public Report (T data) {
        this.data = data;
    }

    public void printReport() {
        System.out.println("\nТип: " + data.getClass() + "\nСодержимое: " + data);
    }
}
