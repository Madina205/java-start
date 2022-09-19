package ARRAY;

import java.util.Scanner;

public class Main_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];
        double max = -99999;
        double min = 999999;
        double sum =0;
        double average = 0;
        double count =0;

        for (int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min)
                min = arr[i];

            sum+=arr[i];

        }
        average = (sum-max-min)/(number-2);


        System.out.println(sum -max - min  + " " + average);

    }
}
