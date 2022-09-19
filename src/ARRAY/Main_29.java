package ARRAY;

import java.util.Scanner;

public class Main_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];
        int sum = 0;
        int count = 0;
        int index = 0;

        for(int i = 0; i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        int startZero = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==0){
                startZero=i;
                break;
            }
        }
        int endZero = 0;
        for (int i = arr.length-1; i < arr.length; i--) {
            if (arr[i]==0){
                endZero=i;
                break;
            }
        }
        for (int i = startZero; i < arr.length; i++) {
            if (i==endZero){

            }
        }
        System.out.println(sum);

//        for (int i = q.charAt(0)-48; i < q.charAt(1)-48; i++) {
//            sum += arr[i];
//        }


    }
}
