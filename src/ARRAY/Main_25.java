package ARRAY;

import java.util.Scanner;

public class Main_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] arr = new int[number];
        double sum = 0;
        double count =0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                sum = sum+arr[i];
                count ++;

            }
        }
        System.out.println(sum/count);
    }
}

