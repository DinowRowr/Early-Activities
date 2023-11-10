package Done;
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input A: ");
            int legA = sc.nextInt();

            System.out.println("Input B: ");
            int legB = sc.nextInt();

            int squareA = legA * legA;
            int squareB = legB * legB;

            int add = squareA + squareB;
            double squareRoot = Math.sqrt(add);

            System.out.println("The Hypotenuse: " + squareRoot);
        }
    }
}
