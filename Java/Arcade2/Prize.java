import java.util.Scanner;

public class Prize {

    Cards card = new Cards();
    Main main = new Main();
    Scanner input = new Scanner(System.in);

    //Prizes
    int prize1 = 500; //PS5
    int prize2 = 1000; //Iphone 13
    int prize3 = 2000; //lenovo laptop

    //buy prize
    //Card 1
    void buyPrize1(){
    while(true){
        System.out.println("Input valid number below to buy prizes:");
        System.out.println("1 - PS5");
        System.out.println("2 - Iphone 13");
        System.out.println("3 - Lenovo Laptop");

        System.out.print("\nInput number: ");
        int num = input.nextInt();

        //Prize 1
        if(num == 1){
            System.out.println("PS5 ticket cost: " + prize1);
            System.out.print("Buy now?(1-Yes/2-No) ");
            int yn = input.nextInt();

            if(yn == 1){
                card.tickets1 = card.tickets1 - prize1;
                System.out.println("SUCCESS " + card.name1 + "!");
                System.out.println("Your remaining tickets: " + card.tickets1);
                break;
            }
        }
        //Prize 2
        if(num == 2){
            System.out.println("Iphone 13 ticket cost: " + prize2);
            System.out.print("Buy now?(1-Yes/2-No) ");
            int yn = input.nextInt();

            if(yn == 1){
                card.tickets1 = card.tickets1 - prize2;
                System.out.println("SUCCESS " + card.name1 + "!");
                System.out.println("Your remaining tickets: " + card.tickets1);
                break;
            }
        }
        //Prize 3
        if(num == 3){
            System.out.println("Lenovo Laptop ticket cost: " + prize3);
            System.out.print("Buy now?(1-Yes/2-No) ");
            int yn = input.nextInt();

            if(yn == 1){
                card.tickets1 = card.tickets1 - prize3;
                System.out.println("SUCCESS " + card.name1 + "!");
                System.out.println("Your remaining tickets: " + card.tickets1);
                break;
            }
        }
    }
    }
    //Card 2
    void buyPrize2 (){
        while(true){
            System.out.println("Input valid number below to buy prizes:");
            System.out.println("1 - PS5");
            System.out.println("2 - Iphone 13");
            System.out.println("3 - Lenovo Laptop");
    
            System.out.print("\nInput number: ");
            int num = input.nextInt();
    
            //Prize 1
            if(num == 1){
                System.out.println("PS5 ticket cost: " + prize1);
                System.out.print("Buy now?(1-Yes/2-No) ");
                int yn = input.nextInt();
    
                if(yn == 1){
                    card.tickets2 = card.tickets2 - prize1;
                    System.out.println("SUCCESS " + card.name2 + "!");
                    System.out.println("Your remaining tickets: " + card.tickets2);
                    break;
                }
            }
            //Prize 2
            if(num == 2){
                System.out.println("Iphone 13 ticket cost: " + prize2);
                System.out.print("Buy now?(1-Yes/2-No) ");
                int yn = input.nextInt();
    
                if(yn == 1){
                    card.tickets2 = card.tickets2 - prize2;
                    System.out.println("SUCCESS " + card.name2 + "!");
                    System.out.println("Your remaining tickets: " + card.tickets2);
                    break;
                }
            }
            //Prize 3
            if(num == 3){
                System.out.println("Lenovo Laptop ticket cost: " + prize3);
                System.out.print("Buy now?(1-Yes/2-No) ");
                int yn = input.nextInt();
    
                if(yn == 1){
                    card.tickets2 = card.tickets2 - prize3;
                    System.out.println("SUCCESS " + card.name2 + "!");
                    System.out.println("Your remaining tickets: " + card.tickets2);
                    break;
                }
            }
        }
    }
}
