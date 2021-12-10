package JAVAUNEC2021.oop;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sayi = 0;
        System.out.println("Elementler daxil edilir...");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        int enboyuk = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>enboyuk){
                enboyuk = arr[i];

            }
            sayi = i;


        }
        System.out.println("En boyuk: "+ enboyuk);
        System.out.println("En boyuk indeks: " + sayi);

    }
}
