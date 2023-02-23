import java.util.ArrayList;
import java.util.List;

public class AuctionHouse {

    private String name;
    private List<Item> items;


    /**
     * create new auction house object
     *
     * @param name of auction house
     */

    //Constructor
    public AuctionHouse(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //Getter and Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * @return
     */

    //Method for highest price
    public Item GetHighestPriceItem() {
        Item highestPriceItem = null;
        for (Item item : items) {
            if (highestPriceItem == null || item.getPrice() > highestPriceItem.getPrice()) {
                highestPriceItem = item;
            }
        }
        return highestPriceItem;
    }

    //Method for average price
    public double getAveragePriceByYear(int year) {
        double totalPrice = 0;
        int itemCount = 0;
        for (Item item : items) {
            if (item.getYear() == year) {
                totalPrice += item.getPrice();
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
        for (Item item : items) {
            if (item.getPrice() > price) {
                itemsAbovePrice.add(item);
            }

        }return itemsAbovePrice;
    }

    public void addItem(Item item) {
    }
}