package Done;

public class Ternary {
    public static void main(String[]args) {
        int x = 4, y = 9;
    
        int result = (y / x < 3) ? x += y : x * y;

        System.out.println("After if stmt, x = " + x);
        
        
    }
}
