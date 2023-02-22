public class TestItem {

    public static void main(String[] args) {
        Item item = new Item(135, "Luqman", 1000.0, 2022, "painting");
        System.out.println("Item lot number: " + item.getLotNumber());
        System.out.println("Buyer name: " + item.getNameBuyer());
        System.out.println("Sold price: " + item.getPrice());
        System.out.println("Year sold: " + item.getYear());
        System.out.println("Item type: " + item.getType());
    }

}


