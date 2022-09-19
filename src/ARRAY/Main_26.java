package ARRAY;
import java.util.Scanner;


public class Main_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];

        for(int i = 0; i< arr.length; i++){
            arr[i]= in.nextInt();
        }

        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
