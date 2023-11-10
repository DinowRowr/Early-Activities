public class Ticket {

    public String[] ticketName = {"Economy", "VIP"};
    public double[] ticketPrice = {20, 100};

    public String[] getTicketName() {
        return ticketName.clone();
    }

    public double[] getTicketPrice() {
        return ticketPrice.clone();
    }
}
