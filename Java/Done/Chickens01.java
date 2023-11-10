package Done;
class Chickens01 {
    public static void main(String[] args){
        int eggsPerChicken, chickenCount, tuesday, wednesday, totalEggs, tuesdayChickenCount, wednesdayChickenCount, monday;

        eggsPerChicken = 5;
        chickenCount = 3;
        monday = eggsPerChicken * chickenCount;

        tuesdayChickenCount = chickenCount + 1;
        tuesday = tuesdayChickenCount * eggsPerChicken;

        wednesdayChickenCount = tuesdayChickenCount / 2;
        wednesday = wednesdayChickenCount * eggsPerChicken;

        totalEggs = monday + tuesday + wednesday;

        System.out.println("Scenario 1");
        System.out.println("Monday: " + monday);
        System.out.println("Tuesday: " + tuesday);
        System.out.println("Wednesday: " + wednesday);
        System.out.println("Total Eggs: " + totalEggs);
        System.out.println("");

        int eggsPerChicken2, chickenCount2, tuesday2, wednesday2, totalEggs2, tuesdayChickenCount2, wednesdayChickenCount2, monday2;

        eggsPerChicken2 = 4;
        chickenCount2 = 8;
        monday2 = eggsPerChicken2 * chickenCount2;

        tuesdayChickenCount2 = chickenCount2 + 1;
        tuesday2 = tuesdayChickenCount2 * eggsPerChicken2;

        wednesdayChickenCount2 = tuesdayChickenCount2 / 2;
        wednesday2 = wednesdayChickenCount2 * eggsPerChicken2;

        totalEggs2 = monday2 + tuesday2 + wednesday2;

        System.out.println("Scenario 2");
        System.out.println("Monday: " + monday2);
        System.out.println("Tuesday: " + tuesday2);
        System.out.println("Wednesday: " + wednesday2);
        System.out.println("Total Eggs: " + totalEggs2);


    }
}