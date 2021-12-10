package JAVAUNEC2021.oop;

public class Lesson4 {
    public static void main(String[] args) {
        int SinemaBileti  = ((int) (Math.random() * 100));
        System.out.println(SinemaBileti);
        if(SinemaBileti >= 1 && SinemaBileti<=300){
            System.out.println(SinemaBileti+"No Bilet 50 AZN qazandi");
        }
        else if (SinemaBileti>300 && SinemaBileti<600){
            System.out.println(SinemaBileti+" No bilet 100 AZN qazandi");
        }
        else {
            System.out.println("Gelecek Yarismalarimizda Istirak edin!");
        }
    }
}
