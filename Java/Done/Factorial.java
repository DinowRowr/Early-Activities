package Done;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args) {
        int num, factorial = 1, i;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number from 1-12: ");
            num = input.nextInt();
        }
        if (num > 12) {
            System.out.println("Invalid number!");
        }else {
        for (i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.print(num + "! = ");
        System.out.println(factorial(num));
        }
    }
        public static int factorial(int i) {
            if (i == 1)
            {
                System.out.print(i + " = ");
                return 1;
            }else 
            {
                System.out.print(i + " x ");
                return i * factorial(i - 1);
            }
        
    }
}