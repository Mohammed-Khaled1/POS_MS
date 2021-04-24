import java.util.Date;

public class Item {
    // Attributes
    private long itemId;
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private double itemTax;
    private int itemCount;

    // Constructor
    public Item(String itemName, int itemCount) {
        Date date = new Date();
        itemId = date.getTime();
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

    public Item(String itemName, String itemDescription, double itemPrice, double itemTax, int itemCount) {
        Date date = new Date();
        itemId = date.getTime();
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemTax = itemTax;
        this.itemCount = itemCount;
    }

    // Getters & Setters
    public long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemTax() {
        return itemTax;
    }

    public void setItemTax(double itemTax) {
        this.itemTax = itemTax;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    // Methods
    public void incrementItemBy(int num){
        itemCount += num;
    }

    public void decrementItemBy(int num){
        itemCount -= num;
    }

}