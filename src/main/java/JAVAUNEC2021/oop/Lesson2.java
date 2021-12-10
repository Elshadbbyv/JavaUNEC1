package JAVAUNEC2021.oop;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int d;
        if (a>b && b>c){
            d = a;
            a = c;
            b = a;
            c = d;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (a<b && b<c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);


        }
        else if(b>a && a>c){
            d = a;
            a = c;
            b = d;
            c = b;
            System.out.println();
        }

    }
}
