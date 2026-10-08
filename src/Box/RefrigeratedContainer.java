package SmartLogistics.src.Box;

public class RefrigeratedContainer extends BaseCargo {
    private int targetTemperature;

    public RefrigeratedContainer (String id, String name, double weight, int targetTemperature) {
        super(id, name, weight);
        this.targetTemperature = targetTemperature;
    }

    @Override 
    public String getType() {
        return "Это холодильник";
    }
}
