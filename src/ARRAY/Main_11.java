package ARRAY;
import java.util.Scanner;


public class Main_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] nums = new int[number];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            average = sum / number;

        }

        System.out.println("Сумма чисел в массиве: " + sum + "   Средняя арифметическая: " + average);
    }
}

// вывод чисел  Сумма чисел в массиве: 55.0  ????  Средняя арифметическая: 5.5
//10
//1 2 3 4 5 6 7 8 9 10