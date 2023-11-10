import java.util.Scanner;


public class SquareRoot {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
    try (Scanner console = new Scanner(System.in)) {
        int number = console.nextInt();
        double result = Math.sqrt(number);

        if (number > 0){
            result = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + result);
        }
        else{
        while (number < 0){
            System.out.print("Invalid number, try again: ");
            number = console.nextInt();

            if (number > 0){
                result = Math.sqrt(number);
                System.out.println("The square root of " + number + " is " + result);
                }
            }
        }
    }
}
}