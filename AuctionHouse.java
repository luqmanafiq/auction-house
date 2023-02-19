import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {

    private String name;
    private List<Item> itemsSold;

    //Constructor
    public AuctionHouse(String name) {
        this.name = name;
        this.itemsSold = new ArrayList<Item>();

    }

    //Getter and Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(List<Item> itemsSold) {
        this.itemsSold = itemsSold;
    }
    //Method for highest price
    public Item GetHighestPriceItem() {
        Item highestPriceItem = null;
        for (Item item : itemsSold) {
            if (highestPriceItem == null || item.getSoldPrice() > highestPriceItem.getSoldPrice()) {
                highestPriceItem = item;
            }
        }
        return highestPriceItem;

    }
    //Method for average price
    public double getAveragePriceByYear(int year) {
        double totalPrice = 0;
        int itemCount = 0;
        for (Item item : itemsSold) {
            if (item.getSoldYear() == year) {
                totalPrice += item.getSoldPrice();
                itemCount++;
            }
        }
        if (itemCount > 0) {
            return totalPrice / itemCount;
        } else {
            return 0;
        }
    }
    //Method for items sold with greater price than given
    public List<Item> getItemsSoldAbovePrice(double price) {
        List<Item> itemsAbovePrice = new ArrayList<Item>();
        for (Item item : itemsSoldPrice() > price) {
            itemsAbovePrice.add(item);
        }
        return itemsAbovePrice;
    }


}