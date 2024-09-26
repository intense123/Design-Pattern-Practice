package items;

/* Open Closed Principle */

public class Book implements LibraryItem {

    private String Title;
    private String UniqueId;
    private String author;
    private double Value;

    public Book(String Title, String UniqueId, String author, double Value){
        this.Title = Title;
        this.UniqueId =  UniqueId;
        this.author = author;
        this.Value = Value;
    }

    @Override
     public String getTitle(){
        return this.Title;
     }
     @Override
    public String getUniqueId(){
        return this.UniqueId;

    }
    @Override
    public double calculateLateFee(int days){
        return days*10;
    }
    @Override
    public double  getValue(){
        return this.Value;

    }
}
