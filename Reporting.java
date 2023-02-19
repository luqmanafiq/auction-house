import java.util.ArrayList;
import java.util.List;

public class Reporting {
    private List<AuctionHouse> auctionHouses;

    //constructor
    public Reporting() {
        auctionHouses = new ArrayList<>();
    }

    //method to return the item with the largest price ever recorded
    public Item getLargestPriceItem() {
        Item maxPriceItem = null;
        double maxPrice = 0.0;

        for (AuctionHouse ah : auctionHouses) { //iterate through list of auction houses
            for (Item item : ah.getItems()) { //iterate through list of items
                double itemPrice = item.getPrice();
                if (itemPrice > maxPrice) {
                    maxPriceItem = item;
                    maxPrice = itemPrice;
                }
            }
        }
        return maxPriceItem;
    }

    //method to return the auction house with the largest average price for a given year
    public AuctionHouse getLargestAveragePriceAuctionHouse(int year) {
        AuctionHouse largestPriceAH = null;
        double maxAvgPrice = 0.0;

        for (AuctionHouse ah : auctionHouses) { //iterate through list of auction houses
            double ahPriceTotal = 0.0;
            int count = 0;
            for (Item item : ah.getItems()) { //iterate through list of items
                if (item.getYear() == year) {
                    ahPriceTotal += item.getPrice();
                    count++;
                }
            }
            double ahAvgPrice = ahPriceTotal / count;
            if (ahAvgPrice > maxAvgPrice) {
                largestPriceAH = ah;
                maxAvgPrice = ahAvgPrice;
            }
        }
    }
}