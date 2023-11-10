package GrandTotal;
public class GrandTotal {
    public static void main(String [] args) {
        ComputeBill bill = new ComputeBill();
        
        bill.findTotal(10.0, "Person 1: $");
        bill.findTotal(12.0, "Person 2: $");
        bill.findTotal(9.0, "Person 3: $");
        bill.findTotal(8.0, "Person 4: $");
        bill.findTotal(7.0, "Person 5: $");
        bill.findTotal(15.0, "Person 6: $");
        bill.findTotal(11.0, "Person 7: $");
        bill.findTotal(30.0, "Person 8: $");
    }
}