package hafta1;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yüksekliği giriniz:");
        float sayi1 = girdi.nextFloat();
        System.out.print("Yarıçapı giriniz:");
        float sayi2 = girdi.nextFloat();

        float pi = 3.14f;
        float sayi2kare=sayi2*sayi2;
        float hacim = pi*sayi1*sayi2kare;
        System.out.println("hacim:"+hacim);


    }
}
