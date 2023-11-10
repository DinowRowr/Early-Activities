import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Game game = new Game();
        Cards card = new Cards();
        Prize prize = new Prize();

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the arcade!\n");
        System.out.print("Enter your Card Number: ");
        int cardNum = input.nextInt();

        //Card 1
        if(cardNum == card.cardNum1){
            System.out.println("\nWelcome " + card.name1 + "!");
        }
        //Card 2
        if(cardNum == card.cardNum2){
            System.out.println("\nWelcome " + card.name2 + "!");
        }
        else{
            while((cardNum != card.cardNum1) & (cardNum != card.cardNum2)){
                System.out.print("Invalid Card Number! Try Again: ");
                cardNum = input.nextInt();
            }
        }
        while(true){
            System.out.println("\nInput valid number below:\n");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Add Credits");
            System.out.println("3 - Transfer Credits to another Card");
            System.out.println("4 - Transfer Tickets to another Card");
            System.out.println("5 - Buy a Prize");
            System.out.println("6 - Play a Game");

            System.out.print("\nInput number: ");
            int num = input.nextInt();

            //Balance Check
            //Card 1
            if((num == 1)&(cardNum == card.cardNum1)){
                System.out.println("\n" + card.name1 + "'s Balance:");
                System.out.println("Credits: " + card.credits1);
                System.out.println("Tickets: " + card.tickets1 + "\n");
            }
            //Card 2
            if((num == 1)&(cardNum == card.cardNum2)){
                System.out.println("\n" + card.name2 + "'s Balance:");
                System.out.println("Credits: " + card.credits2);
                System.out.println("Tickets: " + card.tickets2 + "\n");
            }

            //Add Credits
            //Card 1
            if((num == 2) & (cardNum == card.cardNum1)){
                card.addBalance1();
            }
            //Card 2
            if((num == 2) & (cardNum == card.cardNum2)){
                card.addBalance2();
            }

            //Transfer Credits
            //Card 1
            if((num == 3)&(cardNum == card.cardNum1)){
                card.transferCreds1();
            }
            //Card 2
            if((num == 3)&(cardNum == card.cardNum2)){
                card.transferCreds2();
            }

            //Transfer Tickets
            //Card 1
            if((num == 4)&(cardNum == card.cardNum1)){
                card.transferTicket1();
            }
            if((num == 4)&(cardNum == card.cardNum2)){
                card.transferTicket2();
            }

            //Buy a Price
            //Card 1
            if((num == 5)&(cardNum == card.cardNum1)){
                prize.buyPrize1();
            }
            //Card 2
            if((num == 5)&(cardNum == card.cardNum2)){
                prize.buyPrize2();
            }

            //Play Game
            //Card 1
            if((num == 6)&(cardNum == card.cardNum1)){
                System.out.println("\nWelcome to Rock, Paper, Scissors!\n");
                System.out.print("Cost 1 Credit, Do you want to play?(1-Yes/2-No) ");
                int yn = input.nextInt();

                if(yn == 1){
                    card.credits1 = card.credits1 - 1;
                    game.playGame1();
                }
            }
            //Card 2
            if((num == 6)&(cardNum == card.cardNum2)){
                System.out.println("\nWelcome to Rock, Paper, Scissors!\n");
                System.out.print("Cost 1 Credit, Do you want to play?(1-Yes/2-No) ");
                int yn = input.nextInt();

                if(yn == 1){
                    card.credits2 = card.credits2 - 1;
                    game.playGame2();
                }
            }
        }
        
    }
}
