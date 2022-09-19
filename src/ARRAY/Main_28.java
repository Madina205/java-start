package ARRAY;
import java.util.Scanner;


public class Main_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];
        int count =0;
        int index =0;


        for(int i = 0; i< arr.length;i++){
            arr[i]= in.nextInt();
        }

        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2==0)
                count ++;
        }
        int [] arr2 = new int[count];

        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2==0){
                arr2[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
