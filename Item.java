public class Item {

    private int lotNumber;
    private String nameBuyer;
    private double price;
    private int year;
    private String type;

    /**
     * @param lotNumber The unique identifier
     * @param nameBuyer
     * @param price
     * @param year
     * @param type      (furniture, painting, sculpture)
     */


    //Constructor
    public Item(int lotNumber, String nameBuyer, double price, int year, String type) {

        this.lotNumber = lotNumber;
        this.nameBuyer = nameBuyer;
        this.price = price;
        this.year = year;
        this.type = type;

    }

    /**
     * @return lot number
     */

    //Getter and Setter to retrieve and update these values
    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    /**
     * @return name
     */

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    /**
     * @return price
     */

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return year
     */

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    public String getType() {
        return type;
    }
}




