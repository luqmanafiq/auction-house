import java.util.Scanner;
import java.util.List;

public class ReportingIO {
    private static Scanner inputScanner = new Scanner(System.in);
    private static Reporting reporting = new Reporting();

    private List<AuctionHouse> auctionHouses;

    /**
     * Constructor
     */


    public static void main(String[] args) {
        while (true) {
            printMenu();
            String userInput = inputScanner.nextLine();
            switch (userInput) {
                case "1":
                    enterAuctionHouseData();
                    break;
                case "2":
                    enterItemData();
                    break;
                case "3":
                    displayStatistics();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Enter AuctionHouse data");
        System.out.println("2. Enter Item data");
        System.out.println("3. Display statistics");
        System.out.println("4. Exit");
    }

    private static void enterAuctionHouseData() {
        // TODO: Implement method to enter AuctionHouse data
    }

    private static void enterItemData() {
        // TODO: Implement method to enter Item data
    }

    private static void displayStatistics() {
        System.out.println("Please choose an option:");
        System.out.println("1. Auction house with largest average item price for a given year");
        System.out.println("2. Highest price item ever reported");
        System.out.println("3. All items sold with a price greater than a given amount");

        String userInput = inputScanner.nextLine();
        switch (userInput) {
            case "1":
                System.out.println("Please enter the year:");
                int year = inputScanner.nextInt();
                inputScanner.nextLine(); // Consume the newline character left by nextInt()
                AuctionHouse auctionHouse = reporting.getAuctionHouseWithLargestAveragePrice(year);
                System.out.println("The AuctionHouse with the largest average price for year " + year + " is:");
                System.out.println(auctionHouse);
                break;
            case "2":
                Item item = reporting.getLargestPriceItem();
                System.out.println("The Item with the largest price ever recorded is:");
                System.out.println(item);
                break;
            case "3":
                System.out.println("Please enter the minimum price:");
                double price = inputScanner.nextDouble();
                inputScanner.nextLine(); // Consume the newline character left by nextDouble()
                List<Item> items;
                items = reporting.getItemsWithPriceGreaterThan(price);
                System.out.println("The following Items were sold with a price greater than " + price + ":");
                for (Item i : items) {
                    System.out.println(i);
                }
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }
    }

    private static void exit() {
        System.exit(0);
    }
}
