package Done;
import java.util.*;
public class StringName2 {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String input = sc.nextLine();

            int space = input.indexOf(" ");

            String firstName = input.substring(0, space);
            String lastName = input.substring(space, + 1);
            char initials = input.charAt(0);

            System.out.println("Your name is: " + lastName + ", " + initials + ".");
        }
    }
    
}
