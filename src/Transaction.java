import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    // Attribute
    private long transID;
    private String transDate;
    private long custID;
    private ArrayList<Item> selectedItems;
    private String paymentMethod;

    // Constructor
    public Transaction(long custID, ArrayList<Item> selectedItems, String paymentMethod){
        Date date = new Date();
        transID = date.getTime();
        transDate = date.toString();
        this.custID = custID;
        this.selectedItems = selectedItems;
        this.paymentMethod = paymentMethod;
    }

    // Getters
    public long getTransID() {
        return transID;
    }

    public String getTransDate() {
        return transDate;
    }

    public long getCustID() {
        return custID;
    }

    public ArrayList<Item> getSelectedItems() {
        return selectedItems;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Methods
    public double calcSubTotalPrice(){
        double subTotalPrice = 0;
        for(int i = 0; i < selectedItems.size(); i++){
            subTotalPrice += selectedItems.get(i).getItemPrice();
        }
        return Math.round(subTotalPrice * 100.0) / 100.0;
    }

    public double calcTotalTax(){
        double totalTax = 0;
        for(int i = 0; i < selectedItems.size(); i++){
            totalTax += selectedItems.get(i).getItemTax();
        }
        return Math.round(totalTax * 100.0) / 100.0;
    }

    public double calcTotalPrice(){
        return Math.round( (calcSubTotalPrice() + calcTotalTax()) * 100.0) / 100.0;
    }


}