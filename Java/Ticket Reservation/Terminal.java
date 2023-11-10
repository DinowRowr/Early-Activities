import java.util.Scanner;

public class Terminal {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        Ticket tickets = new Ticket();
        Schedule schedule = new Schedule();
        Payment payment = new Payment();

        String[] ticketName = tickets.getTicketName();
        double[] ticketPrice = tickets.getTicketPrice();
        String[] time = schedule.getTime();
        int[] slots = schedule.getSlots();


        while(true) {
        System.out.println("================================================");
        System.out.println("Select a Ticket:");
        System.out.println("1. " + ticketName[0] + ": $" + ticketPrice[0]);
        System.out.println("2. " + ticketName[1] + ": $" + ticketPrice[1]);
        System.out.print("Input number: ");
        int pickTicket = input.nextInt();

        System.out.println("================================================");

        System.out.println("Pick a Schedule:");
        System.out.println("1. " + time[0] + " (" + slots[0] + " slots available)");
        System.out.println("2. " + time[1] + " (" + slots[1] + " slots available)");
        System.out.print("Input number: ");
        int pickSchedule = input.nextInt();

        System.out.println("================================================");

        System.out.print("Enter Amount of Tickets to buy: ");
        int amount = input.nextInt();

        System.out.println("================================================");

        if (slots[0] < amount && slots[1] < amount) {
            System.out.println("Sorry! There are no more slots!");
            return;
        }

        //Validation
        //1.1
        if (pickTicket == 1 && pickSchedule == 1) {

            double bill = ticketPrice[0] * amount;
            System.out.println("Summary:");
            System.out.println("Ticket Type: " + ticketName[0]);
            System.out.println("Schedule: " + time[0]);
            System.out.println("No. of Tickets: " + amount);
            System.out.println("Amount to Pay: $" + bill);
            System.out.println("================================================");
            payment.Pay(bill, amount, pickSchedule, slots);
        }
        //1.2
        if (pickTicket == 1 && pickSchedule == 2) {

            double bill = ticketPrice[0] * amount;
            System.out.println("Summary:");
            System.out.println("Ticket Type: " + ticketName[0]);
            System.out.println("Schedule: " + time[1]);
            System.out.println("No. of Tickets: " + amount);
            System.out.println("Amount to Pay: $" + bill);
            System.out.println("================================================");
            payment.Pay(bill, amount, pickSchedule, slots);
        }
        //2.1
        if (pickTicket == 2 && pickSchedule == 1) {

            double bill = ticketPrice[1] * amount;
            System.out.println("Summary:");
            System.out.println("Ticket Type: " + ticketName[1]);
            System.out.println("Schedule: " + time[0]);
            System.out.println("No. of Tickets: " + amount);
            System.out.println("Amount to Pay: $" + bill);
            System.out.println("================================================");
            payment.Pay(bill, amount, pickSchedule, slots);
        }
        //2.2
        if (pickTicket == 2 && pickSchedule == 2) {

            double bill = ticketPrice[1] * amount;
            System.out.println("Summary:");
            System.out.println("Ticket Type: " + ticketName[1]);
            System.out.println("Schedule: " + time[1]);
            System.out.println("No. of Tickets: " + amount);
            System.out.println("Amount to Pay: $" + bill);
            System.out.println("================================================");
            payment.Pay(bill, amount, pickSchedule, slots);
        }
        else if(pickTicket != 1 && pickTicket != 2 && pickSchedule != 1 && pickSchedule != 2) {
            System.out.println("ERROR! Please enter valid number!");
        }

        System.out.println("================================================");
        System.out.println("Buy Again?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter Number: ");
        int num = input.nextInt();

        if (num == 2) {
        break;
        }
        }
    }
}
