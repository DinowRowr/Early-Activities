package Done;
import java.util.Scanner;

public class SecurityPin {
    public static void main(String[]args) {
        try (Scanner pin = new Scanner(System.in)) {

            int num = 12345;
            
            System.out.println("ENTER YOUR PIN: ");
            int entry = pin.nextInt();

            while ( entry != num )
            {
            	System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            	System.out.print("ENTER YOUR PIN: ");
            	entry = pin.nextInt();
            }
        }
        System.out.println("\nPIN ACCEPTED.");
    }
}
