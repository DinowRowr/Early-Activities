import java.util.Random;
import java.util.Scanner;

public class Game {

    void playGame1(){
    
    Main main = new Main();
    Cards card = new Cards();
    Scanner scanner = new Scanner(System.in);

    int min = 10;
    int max = 15;
    int won = (int)(Math.random()*(max-min+1)+min);
    
    while (true) {
      String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
      
      while(true) {
        System.out.println("Please enter your move (r, p, or s)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
        break;
      }
      else if (playerMove.equals("r")) {
        if (computerMove.equals("p")) {
          System.out.println("You lose!");
          break;
          
        } else if (computerMove.equals("s")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets1 = card.tickets1 + won;
          break;
        }
      }
      
      else if (playerMove.equals("p")) {
        if (computerMove.equals("r")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets1 = card.tickets1 + won;
          break;
          
        } else if (computerMove.equals("s")) {
          System.out.println("You lose!");
          break;
        }
      }
      
      else if (playerMove.equals("s")) {
        if (computerMove.equals("p")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets1 = card.tickets1 + won;
          break;
          
        } else if (computerMove.equals("r")) {
          System.out.println("You lose!");
          break;
        }
      }
    }
  }
  void playGame2(){
    
    Main main = new Main();
    Cards card = new Cards();
    Scanner scanner = new Scanner(System.in);

    int min = 10;
    int max = 15;
    int won = (int)(Math.random()*(max-min+1)+min);
    
    while (true) {
      String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
      
      while(true) {
        System.out.println("Please enter your move (r, p, or s)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
        break;
      }
      else if (playerMove.equals("r")) {
        if (computerMove.equals("p")) {
          System.out.println("You lose!");
          break;
          
        } else if (computerMove.equals("s")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets2 = card.tickets2 + won;
          break;
        }
      }
      
      else if (playerMove.equals("p")) {
        if (computerMove.equals("r")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets2 = card.tickets2 + won;
          break;
          
        } else if (computerMove.equals("s")) {
          System.out.println("You lose!");
          break;
        }
      }
      
      else if (playerMove.equals("s")) {
        if (computerMove.equals("p")) {
          System.out.println("You win!");
          System.out.println("You won: " + won);
          card.tickets2 = card.tickets2 + won;
          break;
          
        } else if (computerMove.equals("r")) {
          System.out.println("You lose!");
          break;
        }
      }
    }
  }
}