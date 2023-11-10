package Done;
import java.util.Scanner;

public class test2 {
    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            
            int firstIndex = name.indexOf(" ");
            int secondIndex = name.indexOf(" ", firstIndex + 1);
            
            String firstName = name.substring(0, name.indexOf(" "));
            String middleName = name.substring(firstIndex + 1, secondIndex);
            String lastName = name.substring(secondIndex + 1);

            String initials = middleName.substring(0, 1) + ".";
            
            String result = lastName + " " + firstName + ", " + initials;

            System.out.println(result);
        }
    }
}