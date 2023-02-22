import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 */
public class Reporting {

    private List<AuctionHouse> auctionHouses;

    /**
     * Constructor
     */
    public Reporting() {
        auctionHouses = new ArrayList<>();
    }

    /**
     *
     *
     * @param auctionHouse
     */
    public void addAuctionHouse(AuctionHouse auctionHouse) {
        auctionHouses.add(auctionHouse);
    }

    /**
     *
     *
     * @return item largest price
     */
    public Item getLargestPriceItem() {
        Item largestPriceItem = null;
        double maxPrice = 0;
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (Item item : auctionHouse.getItems()) {
                if (item.getPrice() > maxPrice) {
                    largestPriceItem = item;
                    maxPrice = item.getPrice();
                }
            }
        }
        return largestPriceItem;
    }

    /**
     *
     * @param year
     * @return the auction house
     */
    public AuctionHouse getAuctionHouseWithLargestAveragePrice(int year) {
        AuctionHouse largestAveragePriceAuctionHouse = null;
        double maxAvgPrice = 0;
        for (AuctionHouse auctionHouse : auctionHouses) {
            double sum = 0;
            int count = 0;
            for (Item item : auctionHouse.getItems()) {
                if (item.getYear() == year) {
                    sum += item.getPrice();
                    count++;
                }
            }
            if (count > 0) {
                double avgPrice = sum / count;
                if (avgPrice > maxAvgPrice) {
                    largestAveragePriceAuctionHouse = auctionHouse;
                    maxAvgPrice = avgPrice;
                }
            }
        }
        return largestAveragePriceAuctionHouse;
    }

    /**
     * Returns a list of all items sold with a price greater than the given amount of money.
     *
     * @param amount the minimum price of the items to be included in the list
     * @return a list of all items sold with a price greater than the given amount of money
     */
    public List<Item> getItemsWithPriceGreaterThan(double amount) {
        List<Item> items = new ArrayList<>();
        for (AuctionHouse auctionHouse : auctionHouses) {
            for (Item item : auctionHouse.getItems()) {
                if (item.getPrice() > amount) {
                    items.add(item);
                }
            }
        }
        return items;
    }
}
