package ARRAY;

import java.util.Scanner;

public class Main_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  number = in.nextInt();
        int [] arr = new int[number];
        int index = -1;

        for (int i =0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        int k= in.nextInt();

        for (int i= 0; i< arr.length;i++) {
            if (arr[i] == k)
                index = i;
        }

        if(index!=-1){
            System.out.println("YES" + " " + index);
        } else {
            System.out.println("NO");
        }
    }
}


