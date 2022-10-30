package hafta1;

import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz");
        float sayi1 = girdi.nextFloat();
        System.out.print("İkinci kenarı giriniz");
        float sayi2 = girdi.nextFloat();

        float alan = sayi1*sayi2;
        System.out.print("alan :"+alan);


    }
}
