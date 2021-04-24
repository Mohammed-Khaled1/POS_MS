import java.util.ArrayList;
import java.util.Date;

public class Cashier {
    // Attribute
    private long cashierID;
    private String cashierName;
    private String cashierAddress;
    private String cashierMobile;

    // Constructor
    public Cashier(String cashierName, String cashierAddress, String cashierMobile) {
        Date date = new Date();
        cashierID = date.getTime();
        this.cashierName = cashierName;
        this.cashierAddress = cashierAddress;
        this.cashierMobile = cashierMobile;
    }

    // Getters & Setters
    public long getCashierID() {
        return cashierID;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierAddress() {
        return cashierAddress;
    }

    public void setCashierAddress(String cashierAddress) {
        this.cashierAddress = cashierAddress;
    }

    public String getCashierMobile() {
        return cashierMobile;
    }

    public void setCashierMobile(String cashierMobile) {
        this.cashierMobile = cashierMobile;
    }

    // Methods
    public String paymentMethod(int method){
        String paymentMethod;
        switch(method){
            case 1:
                paymentMethod = "Cash";
                break;
            case 2:
                paymentMethod = "Cheque";
                break;
            case 3:
                paymentMethod = "Credit card";
                break;
            case 4:
                paymentMethod = "Debit card";
                break;
            default:
                paymentMethod = "Invalid Entry !!";
        }
        return paymentMethod;
    }

    public void printReceipt(long custID, ArrayList<Item> checkout, String paymentMethod){
        Transaction trans = new Transaction(custID, checkout, paymentMethod);
        System.out.println("\n############ Transaction Receipt ############");
        System.out.println("Transaction ID : " + trans.getTransID());
        System.out.println("Transaction Date : " + trans.getTransDate());
        System.out.println("Cashier Name : " + cashierName);
        System.out.println("Customer ID : " + trans.getCustID());
        System.out.println("Purchased Items : ");
        System.out.println("No.  Name            Price           Tax");
        for (int i = 0; i < checkout.size(); i++){
            int temp = i + 1;
            System.out.println(temp + "  " + checkout.get(i).getItemName() + "            " +
                    checkout.get(i).getItemPrice() + "            " + checkout.get(i).getItemTax());
        }
        System.out.println("Sub total price : " + trans.calcSubTotalPrice());
        System.out.println("Total Tax : " + trans.calcTotalTax());
        System.out.println("Total Price : " + trans.calcTotalPrice());
        System.out.println("Payment Method : " + trans.getPaymentMethod());

        System.out.println("Thanks");
        System.out.println("########################################");
    }

}