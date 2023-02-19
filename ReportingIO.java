public class ReportingIO {
    public static void main(String[] args) {
        // Present user with a menu
        System.out.println("Please choose one of the following: \n 1. Enter AuctionHouse data \n 2. Enter Item data \n 3. Provide reporting statistic on: auction house with largest average item price for a given year, highest price item ever reported (including all its details), and all items sold with a price greater than a given amount (including all their details) \n 4. Exit");

        // Take user input from the console
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        // Perform action based on user input
        switch(userInput) {
            case 1:
                // Enter AuctionHouse data
                break;
            case 2:
                // Enter Item data
                break;
            case 3:
                // Provide reporting statistic on: auction house with largest average item price for a given year, highest price item ever reported (including all its details), and all items sold with a price greater than a given amount (including all their details)
                break;
            case 4:
                // Exit
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }

        // Return user to menu
        main(args);
    }
}