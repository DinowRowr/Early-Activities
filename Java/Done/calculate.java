package Done;
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Trapezoid
        System.out.println("Enter Length, Base and Height for Trapezoid:");
    
        // Numerical input for Trapezoid
        double a = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();

        //Computation for Trapezoid
        double trapezoid1 = a + b;
        double trapezoid2 = trapezoid1 * 0.5;
        double trapezoid3 = trapezoid2 * h;

        // Output input by user
        System.out.println("Trapezoid: " + trapezoid3 + "\n");


        //Ellipse
        System.out.println("Enter Length and Base for Ellipse:");

        // Numerical input for Ellipse
        double A = input.nextDouble();
        double B = input.nextDouble();

        //Computation for Ellipse
        double ellipse = Math.PI * A * B;

        // Output input by user
        System.out.println("Ellipse: " + ellipse);

        
    }
}
