package Done;
public class Diceroll {
    public static void main(String [] args) {

        int min = 1;
        int max = 6;
        int randomNum1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(randomNum1);

        int min2 = 1;
        int max2 = 6;
        int randomNum2 = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
        System.out.println(randomNum2);

        //multiplier
        int min3 = 1;
        int max3 = 6;
        int multiplier = (int)Math.floor(Math.random()*(max3-min3+1)+min3);
        System.out.println(multiplier);

        int add = randomNum1 + randomNum2;
        int multiply = add * multiplier;

        System.out.println("The result of the dice roll is: " + multiply);
        
    }
}
