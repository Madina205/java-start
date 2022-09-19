package Double_Array;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert num1 -количество строки:");
        int num1 = in.nextInt();
        System.out.println("Insert num2 -количество строки:");
        int num2 = in.nextInt();

        int arr[][] = new int [num1][num2];

        for(int i =0; i<num1;i++){
            for(int j=0; j<num2; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<num1; i++){
            for(int j=0;j<num2;j++){
                if(i%2==0)
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
