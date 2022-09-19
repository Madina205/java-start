package ARRAY;
import java.util.Scanner;


public class Main_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];

        for ( int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();  // почему пишем arr[i] ? i - это ведь индекс
        }

        int number_2 = in.nextInt();

        for (int i =0; i< arr.length; i++) {
            if (arr[i]%number_2==0 ){
                System.out.println(arr[i]);  // 0 положительное число и делится на 2 //
               // 10
               // 6 19 0 -3 4 8 0 -6 9 5
               // 2

                // выводит 0

            }
        }

    }
}

