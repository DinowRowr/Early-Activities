public class Schedule {

    public String[] time = {"9 am", "1 pm"};
    public int[] slots = {10, 10};
    
    public String[] getTime() {
        return time.clone();
    }

    public int[] getSlots() {
        return slots.clone();
    }
}
