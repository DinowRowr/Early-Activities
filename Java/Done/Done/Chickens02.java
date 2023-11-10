package Done;
public class Chickens02 {
    public static void main(String[] args) {
        double monday, tuesday, wednesday, dailyAverage, monthlyAverage, totalEggs, profit, monthlyProfit;
        
        monday = 100;
        tuesday = 121;
        wednesday = 117;
        profit = 0.18;

        totalEggs = monday + tuesday + wednesday;

        dailyAverage = totalEggs / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * profit;

        System.out.println("Daily Average: " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit: $" + monthlyProfit);
    }
}