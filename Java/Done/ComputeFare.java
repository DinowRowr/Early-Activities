package Done;
import java.util.Scanner;

public class ComputeFare {
    public static void main(String[]args) {
        try (Scanner enterAge = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = enterAge.nextInt();
            int fare = 5;
           
            if ((age > 11) && (age < 65)){System.out.println("Your fare is $" + fare);}
            else {System.out.println("Your fare is $3");}
        }
    }
}
