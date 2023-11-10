package Done;
import java.util.Scanner;

public class AgeValidility {
    public static void main(String[]args) {
        try (Scanner age = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int yourAge = age.nextInt();
            if(yourAge <= 18){
                System.out.println("Your underage!");
            } 
            else {System.out.println("Your capable driver!");
            }
        }
    }
}
