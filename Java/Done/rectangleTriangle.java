package Done;
import java.util.Scanner;

public class rectangleTriangle {

    private static int num;
    private static int width;
    private static int height;

    //Rectangle
    static void createRectangle(int width, int height) {

        //Rec. Process
        for (int a = 1; a <= height; a++)
        {
            for (int b = 1; b <= width; b++)
            {
                if (a == 1 || a == height || b == 1 || b == width)           
                    System.out.print("*");           
                else
                    System.out.print(" ");           
            }
            System.out.println();
        }
    }

    //Right Triangle
    static void createTriangle(int num) {

        //Tri. Process
		for (int i = 1 ; i <= num; i++ ) 
        {
			for (int j = 1 ; j <= i; j++ ) 
            {
				if(i == 1 || i == num || j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}        
public static void main(String[]args) {

    //Rec. Input
    System.out.print("Rectangle\n");
        Scanner rec = new Scanner(System.in);

        System.out.print("Enter Width: ");
        width = rec.nextInt();

        System.out.print("Enter Height: ");
        height = rec.nextInt();

        createRectangle(width, height);


    //Tri. Input
     System.out.print("Right Triangle\n");
        Scanner tri = new Scanner(System.in);

        System.out.print("Enter a number: ");
		num = tri.nextInt();

        createTriangle(num);
    }
}