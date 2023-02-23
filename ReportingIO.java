import java.util.Scanner;

public class ReportingIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuctionHouse auctionHouse = new AuctionHouse("My Auction House"); // create an auction house
        boolean exit = false;
        while (!exit) {
            // print menu
            System.out.println("Select an option:");
            System.out.println("1. Enter AuctionHouse data");
            System.out.println("2. Enter Item data");
            System.out.println("3. Show Reporting statistics");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            switch (option) {
                case 1:
                    // enter auction house data
                    System.out.println("Enter auction house name:");
                    String auctionHouseName = scanner.nextLine();
                    auctionHouse = new AuctionHouse(auctionHouseName);
                    System.out.println("Auction house created: " + auctionHouse);
                    break;
                case 2:
                    // enter item data
                    System.out.println("Enter item lot number:");
                    int lotNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.println("Enter name of buyer:");
                    String buyerName = scanner.nextLine();
                    System.out.println("Enter price for which the item was sold:");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline character
                    System.out.println("Enter year in which the item was sold:");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.println("Enter item type (furniture, painting, or sculpture):");
                    String itemType = scanner.nextLine();
                    Item item = new Item(lotNumber, buyerName, price, year, itemType);
                    auctionHouse.addItem(item);
                    System.out.println("Item added to auction house: " + item);
                    break;
                case 3:
                    /* provide statistics on auction house with largest average item price for a given
                    year, highest price item ever reported (including all its details), and all items sold with a
                    price greater than a given amount (including all their details);*/
                    System.out.println("Select an option:");
                    System.out.println("1. Auction house with largest average item price for a given year");
                    System.out.println("2. Highest price item ever reported (including all its details)");
                    System.out.println("3. All items sold with a price greater than a given amount (including all their details)");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            showAuctionHouseWithLargestAverageItemPrice(scanner);
                            System.out.println("Enter year:");
                            year = scanner.nextInt();
                            scanner.nextLine(); // consume newline character

                            if (auctionHouse != null) {
                                System.out.println("Auction house with largest average item price in " + year + " is:");
                                System.out.println(auctionHouse);
                            } else {
                                System.out.println("No auction houses found for year " + year);
                            }
                            break;
                        case 2:
                            showHighestPriceItemEver(scanner);
                            System.out.println("Enter year:");
                            year = scanner.nextInt();
                            scanner.nextLine();

                            if (auctionHouse != null) {
                                System.out.println("Highest Item Price Ever in " + year + " is:");
                                System.out.println(auctionHouse);
                            }else {
                                System.out.println("No Highest price found for year " + year);
                            }
                            break;

                        case 3:
                            itemsSoldWithPriceGreaterThanGivenAmount(scanner);
                            System.out.println("Enter year:");
                            year = scanner.nextInt();
                            scanner.nextLine();

                            if (auctionHouse != null) {
                                System.out.println("Item Sold With Price Greater Than Given Amount " + year + " is:");
                                System.out.println(auctionHouse);
                            }else {
                                System.out.println("No Item sold with price greater than for year " + year);
                            }
                            break;
                        case 4:
                            // exit the program
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                case 4:
                    // exit the program
                    exit = true;
                    break;
            }
        }
    }

    private static void getHighestPriceItem(Scanner scanner) {
        return ;
    }


    private static void itemsSoldWithPriceGreaterThanGivenAmount(Scanner scanner) {
    }

    private static void showHighestPriceItemEver(Scanner scanner) {
    }

    private static void showAuctionHouseWithLargestAverageItemPrice(Scanner scanner) {
    }
}
