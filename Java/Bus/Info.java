public class Info {
    Bus bus = new Bus();

    void displayInfo(){

    String plateNumber = "DPQ313";
    String origin = "Trece Martires";
    String destination = "Dasmarinas";
    int fare = 23;

    int balance = 100;

    String driver = "Marcus";
    String license = "MP12345";

    //Display Info
    System.out.println("Your Balance: " + balance);
    System.out.println();
    System.out.println("Bus Plate Number: " + plateNumber);
    System.out.println("Origin: " + origin);
    System.out.println("Destination: " + destination);
    System.out.println("Basic Fare: " + fare);
    System.out.println();
    System.out.println("Driver: " + driver);
    System.out.println("License: " + license);
    System.out.println();

    //Account
    int min = 10000;  
    int max = 19999;
    int acc = (int)(Math.random()*(max-min+1)+min);

    System.out.println("Account: " + acc);
    System.out.println("Fare: " + fare);

    int finalBal = balance - fare;

    System.out.println("Balance: " + finalBal);
    } 
}
