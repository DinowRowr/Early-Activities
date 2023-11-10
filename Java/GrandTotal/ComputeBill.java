package GrandTotal;
public class ComputeBill {
    public double tax = 0.05;
    public double tip = 0.15;
    public double originalPrice = 0;

   public void findTotal(double originalPrice, String name){
       double total = originalPrice*(1+tax+tip);
       System.out.println(name + total);
   }
}

