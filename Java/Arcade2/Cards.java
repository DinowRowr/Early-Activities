import java.util.Scanner;

public class Cards {

    Main main = new Main();
    Scanner input = new Scanner(System.in);

        String name1 = "Dino";
        int cardNum1 = 31303;
        int credits1 = 10;
        int tickets1 = 3000;
    
        String name2 = "Dave";
        int cardNum2 = 82207;
        int credits2 = 6;
        int tickets2 = 2000;

        //Add Creds
        //Card 1
        void addBalance1(){
            System.out.println("Do you want to add 2 Credits for $1? (1-Yes/2-No)");
            int yn = input.nextInt();

            if(yn == 1){
                credits1 = credits1 + 2;
                System.out.println("SUCCESS! " + name1 + " you have: " + credits1);
            }
        }
        //Card 2
        void addBalance2(){
            System.out.println("Do you want to add 2 Credits for $1? (1-Yes/2-No)");
            int yn = input.nextInt();

            if(yn == 1){
                credits2 = credits2 + 2;
                System.out.println("SUCCESS! " + name2 + " you have: " + credits2);
            }
        }

        //Transfer Creds
        //Card 1
        void transferCreds1(){
            System.out.println("Enter another card number: ");
            int cardNum = input.nextInt();
            if(cardNum == cardNum2){
                System.out.println("How many credits do you want to transfer? ");
                int cred = input.nextInt();

                credits2 = credits2 + cred;
                credits1 = credits1 - cred;

                System.out.println("SUCCESS!");
                System.out.println("Your Credit Balance:");
                System.out.println(name1 + ": " + credits1);
                System.out.println(name2 + ": " + credits2);
            }
        }
        void transferCreds2(){
            System.out.println("Enter another card number: ");
            int cardNum = input.nextInt();
            if(cardNum == cardNum1){
                System.out.println("How many credits do you want to transfer? ");
                int cred = input.nextInt();

                credits2 = credits2 - cred;
                credits1 = credits1 + cred;

                System.out.println("SUCCESS!");
                System.out.println("Your Credit Balance:");
                System.out.println(name2 + ": " + credits2);
                System.out.println(name1 + ": " + credits1);
            }
        }

        //Transfer Tickets
        //Card 1
        void transferTicket1(){
            System.out.println("Enter another card number: ");
            int cardNum = input.nextInt();
            if(cardNum == cardNum2){
                System.out.println("How many tickets do you want to transfer? ");
                int ticket = input.nextInt();

                tickets2 = tickets2 + ticket;
                tickets1 = tickets1 - ticket;

                System.out.println("SUCCESS!");
                System.out.println("Your Ticket Balance:");
                System.out.println(name1 + ": " + tickets1);
                System.out.println(name2 + ": " + tickets2);
            }
        }
        //Card 2
        void transferTicket2(){
            System.out.println("Enter another card number: ");
            int cardNum = input.nextInt();
            if(cardNum == cardNum1){
                System.out.println("How many tickets do you want to transfer? ");
                int ticket = input.nextInt();

                tickets2 = tickets2 - ticket;
                tickets1 = tickets1 + ticket;

                System.out.println("SUCCESS!");
                System.out.println("Your Ticket Balance:");
                System.out.println(name2 + ": " + tickets2);
                System.out.println(name1 + ": " + tickets1);
            }
        }
}
