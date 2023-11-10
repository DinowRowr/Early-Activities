package Done;
public class ShoppingCart {
    public static void main(String[]args) {
        boolean outOfStock = true;
        int shirtStock = 100;
        
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;

        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        total = (price*quantity)*tax;

        System.out.println(message);

        if ((quantity >= shirtStock)&&outOfStock){ System.out.println("\nSorry! " + itemDesc + " have only: " + shirtStock + " left!");
        }
        if ((shirtStock == 0)&&outOfStock){ System.out.println("Sorry! " + itemDesc + " is out of Stock!");
        }
        if (quantity < shirtStock){
        System.out.println("\nSUCCESS!");
        System.out.println("Name: " + custName);
        System.out.println("Item: " + itemDesc);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        }else {System.out.println(outOfStock);
        }
    }
}
