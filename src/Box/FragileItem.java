package SmartLogistics.src.Box;

public class FragileItem extends BaseCargo {
    private boolean requiresSpecialHandling;

    public FragileItem (String id, String name, double weight,
            boolean requiresSpecialHandling)
    {
        super(id, name, weight);
        this.requiresSpecialHandling = requiresSpecialHandling;
    }

    @Override
    public String getType() {
        return "Хрупкая штука";
    }
}
