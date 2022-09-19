package ARRAY;

import java.util.Scanner;

public class Main_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int [number];
        int min = 100000000;

        for (int i= 0; i<arr.length; i++){
            arr[i] = in.nextInt();

        }

        for (int i = 0; i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println (min);
    }
}
