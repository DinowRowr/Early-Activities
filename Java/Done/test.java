package Done;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter X: ");
            int x = input.nextInt();
            System.out.println("Enter Y: ");
            int y = input.nextInt();

            int z = x;
            x = x * 0 + y;
            y = y * 0 + z;

            System.out.println("X= " + x);
            System.out.println("Y= " + y);
        }
    }
}
