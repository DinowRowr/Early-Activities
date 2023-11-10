package Done;

import java.util.Scanner;

public class StringName {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input first name: ");
            String firstName = sc.nextLine();

            int count = 0;
            for(int i = 0; i < firstName.length(); i++) {    
                if(firstName.charAt(i) != ' ')    
                    count++;    
            } 

            System.out.println("Input last name: ");
            String lastName = sc.nextLine();


            String initials = firstName.substring(0, 1) + ".";
            
            System.out.println("Your full name: " + firstName + " " + lastName);
            System.out.println("Your initial name: " + lastName + " " + initials);
            System.out.println("Number of char: " + count);
        }

    }
}
