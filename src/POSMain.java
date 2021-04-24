import java.util.ArrayList;

public class POSMain {
    public static void main(String[] args) {
        // Items in Store
        Item item1 = new Item("Ladder", "Ladder Description", 200, 20, 5);
        Item item2 = new Item("Hammer", "Hammer Description", 50.50, 5.7, 10);
        Item item3 = new Item("Tool Box", "Tool Box Description", 72.60, 7.8, 1);
        Item item4 = new Item("Screw Driver", "Screw Driver Box Description", 7.60, 1.8, 9);
        Item item5 = new Item("Tool Box Combo", "Tool Box Combo Description", 500.60, 90.8, 3);

        // Customers
        Customer cust1 = new Customer("Ali", "Egypt","+21012345688");
        Customer cust2 = new Customer("Karl", "Russia","+7101234568");

        // Cashier
        Cashier cash1 = new Cashier("Kareem","Turkey","111122225555");

        // Customer Actions
        System.out.println("Customer 1");
        cust1.addItemToCart(item1, 1);
        cust1.addItemToCart(item2, 1);

        System.out.println("Customer 2");
        cust2.addItemToCart(item3,1);

        System.out.println("Customer 1");
        cust1.addItemToCart(item3,1);
        cust1.removeItemFromCart(item2, 1);
        cust1.addItemToCart(item4, 1);
        cust1.addItemToCart(item5, 1);

        ArrayList<Item> cust1Items = cust1.checkout();

        // Cashier Actions
        cash1.printReceipt(cust1.getCustID(),cust1Items,cash1.paymentMethod(1));

    }

}