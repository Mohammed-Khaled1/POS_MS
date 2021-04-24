import java.util.ArrayList;
import java.util.Date;

public class Customer {
    // Attribute
    private long custID;
    private String custName;
    private String custAddress;
    private String custMobile;
    private static ArrayList<Item> itemSelected;

    // Constructor
    public Customer(String custName, String custAddress, String custMobile) {
        Date date = new Date();
        custID = date.getTime();
        this.custName = custName;
        this.custAddress = custAddress;
        this.custMobile = custMobile;
        itemSelected = new ArrayList<>();
    }

    // Getters and Setters
    public long getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    // Methods
    public void addItemToCart(Item item, int countOfItem){
        if(countOfItem <= item.getItemCount()) {
            itemSelected.add(item);
            item.decrementItemBy(countOfItem);
            System.out.println("Item Added Successfully");
        }
        else{
            System.out.println("No enough items !!");
        }

    }

    public void removeItemFromCart(Item item, int countOfItem){
        if(itemSelected.contains(item)){
            itemSelected.remove(item);
            item.incrementItemBy(countOfItem);
            System.out.println("Item Removed Successfully");
        }
        else{
            System.out.println("Item not in cart !!");
        }

    }

    public ArrayList<Item> checkout(){
        return itemSelected;
    }

}