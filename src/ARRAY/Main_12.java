
package ARRAY;
import java.util.Scanner;


public class Main_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] nums = new int[number];
        double sum = 0;
        double average = 0;
        double count = 0;

        for (int i = 0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] %2 == 0) {
                sum = sum + nums[i];
                count = count +1;
                average = sum / count;

            }
        }

        System.out.println ( "Средняя арифметическая: " + average);


    }
}
