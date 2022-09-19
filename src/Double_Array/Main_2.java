package Double_Array;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] arr = new int[number*2];

        for ( int i =0; i< arr.length; i++) {
                arr[i] = in.nextInt();
        }

        int[][] arr2 = new int[2][number];

//        for(int i=0;i<number;i++){
//            arr2[0][i] = arr[i];
//        }
//        for(int i=0;i<number;i++){
//            arr2[1][i] = arr[i+3];
//        }

        for(int i=0;i<2;i++){
            for(int j=0;j<number;j++){
                if(i==0) arr2[i][j] = arr[j];
                else if(i==1) arr2[i][j] = arr[j+3];
            }
        }

        for ( int i =0; i< 2; i++) {
            for ( int j =0; j< number; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        }
    }

