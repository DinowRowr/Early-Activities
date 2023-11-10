import java.util.Scanner;

public class Payment {

    public void Pay(double bill, int amount, int pickSchedule, int slots[]){

        Scanner input = new Scanner(System.in);
            System.out.print("Enter Payment: ");
            double pay = input.nextInt();

            if (pay >= bill) {
                double change = pay - bill;
                System.out.println("Transaction successful, your change is: $" + change);

                if(pickSchedule == 1) {
                    slots[0] = slots[0] - amount;
                }
                if(pickSchedule == 2) {
                    slots[1] = slots[1] - amount;
                }
            }
            else {
                System.out.println("================================================");
                System.out.println("Not enough money!");
                return;
            }  
    }
}
