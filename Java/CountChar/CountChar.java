public class CountChar {


    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;
        char temp;
        for (int i = 0; i < max; i++) {

            temp = str.charAt(i);
            if (temp == 'w')
                count++;
        }

        System.out.println("Counting w : " + count);
    }
}