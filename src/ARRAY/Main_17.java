package ARRAY;

import java.util.Scanner;

public class Main_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];
        int multi =1;

        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i< arr.length; i++){
            if(i%2==0 && arr[i]!=0) {
                System.out.println(i + "-" + arr[i] );
                multi = multi*arr[i];
            }
        }
        System.out.println(multi);

    }
}
