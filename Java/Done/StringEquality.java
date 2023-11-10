package Done;
import java.util.Scanner;

public class StringEquality {
    public static void main(String[]args) {
        try (Scanner enterName = new Scanner(System.in)) {
            String trueName = "Moe";

            System.out.println("Enter your name: ");
            String name = enterName.nextLine();

            boolean test = name.equals(trueName);

            if (test == true){
                System.out.println("You are the king of rock and roll!");
            } if (test == false) {System.out.println("You are not the king!");}
        }
    }
}
