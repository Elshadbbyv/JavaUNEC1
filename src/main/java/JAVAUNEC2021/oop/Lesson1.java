package JAVAUNEC2021.oop;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();


        // Write your code here.

        if(s.equals("Welcome")){
            System.out.println("String: " + s + " to HackerRank's Java tutorials!");
        }
        else if(s.equals("42")) {
            System.out.println("String: "+s+" is the answer to life, the universe, and everything!");
        }
        else{
            System.out.println("String: "+s);
        }
        System.out.println("Double: " + d/1000000);
        System.out.println("Int: " + i);
    }
}
