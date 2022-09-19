package Double_Array;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert num1 -количество строки:");
        int num1 = in.nextInt();
        System.out.println("Insert num2 - количество столбов:");
        int num2 = in.nextInt();

        int arr [][]  = new int [num1][num2];

        for (int i =0; i<num1; i++){
            for(int j=0; j<num2;j++){ // почему пишем double[i].length?
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Insert num3 - номер строки:");
        int num3 = in.nextInt();

        for(int j=0; j<num2;j++){
                System.out.print(arr[num3][j] + " ");
            }
        }
    }

