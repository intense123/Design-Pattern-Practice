package items;

public class DVD implements LibraryItem  {

    String Title;
    public String UniqueId;
    private String artist;
    private double Value;

public DVD(String Title, String UniqueId, String artist, double Value) {
        this.Title = Title;
        this.UniqueId = UniqueId;
        this.artist = artist ;
        this.Value = Value;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public String getUniqueId() {
        return this.UniqueId;

    }

    @Override
    public double calculateLateFee(int days) {
        return days * 30;
    }

    @Override
    public double getValue() {
        return this.Value;

    }
}

