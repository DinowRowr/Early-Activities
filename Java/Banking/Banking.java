package Banking;

import java.util.Scanner;

public class Banking {
    public static Banking bank = new Banking();
    public static Account account = new Account();
    static Scanner input = new Scanner(System.in);

    public static boolean success = true;
    public String username, accNum, deposit;
    public static int bal = 100;

    public static void main(String[]args) {
        //Input username
        System.out.println("Input username: ");
        bank.username = input.nextLine();

        //Input account number
        System.out.println("Input account number: ");
        bank.accNum = input.nextLine();

        //Input money to deposit
        System.out.println("Input amount to deposit: ");
        bank.deposit = input.nextLine();

        //withdraw process
        account.Deposited(bal, Integer.parseInt(bank.deposit));

        //results
        if (success){
            System.out.println("Your Receipt: ");
            System.out.println("Username: " + bank.username);
            System.out.println("Account Number: " + bank.accNum);
            System.out.println("Deposited amount: " + bank.deposit);
            System.out.println("Your Balance: " + bal);
        }
        
    }
}
