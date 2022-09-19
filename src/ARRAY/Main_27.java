package ARRAY;
import java.util.Scanner;

public class Main_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] arr = new int[number];
        int max =0;
        int min = 1234567890;
        int indexofMax=-1;
        int indexofMin=-1;

        for (int i =0; i<arr.length; i++ ){
            arr[i] = in.nextInt();
        }
        for (int i =0; i<arr.length; i++ ) {
            if(arr[i]>max){
                max = arr[i];
                indexofMax = i;
            }
            if (arr[i]<min){
                min = arr[i];
                indexofMin = i;
            }

        }
        System.out.println("Макс число: "+ max + " " + "Индекс макса: "+ indexofMax);
        System.out.println("Mин число: "+ min +" Индекс мин:"+ indexofMin);

        arr[indexofMax] = min;
        arr[indexofMin]= max;


        for (int i =0; i<arr.length; i++ ) {
            System.out.print(arr[i]+ " ");
        }
    }
}
