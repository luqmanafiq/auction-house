import java.util.Date;

public class Item {

    private int lotNumber;
    private String nameBuyer;
    private double price;
    private Date year;
    private boolean type;


    //Constructor
    public Item (int lotNumber, String nameBuyer, double price, Date year, boolean type) {

        this.lotNumber = lotNumber;
        this.nameBuyer = nameBuyer;
        this.price = price;
        this.year = year;
        this.type = type;

    }

    //Getter and Setter to retrieve and update these values
    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean isFurniture() {
        return type.equalsIgnoreCase("Furniture");
    }

    public boolean isPainting() {
        return type.equalsIgnoreCase("Painting");
    }

    public boolean isSculpture() {
        return type.equalsIgnore("Sculpture");
    }
}
