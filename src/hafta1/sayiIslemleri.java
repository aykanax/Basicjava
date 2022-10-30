package hafta1;

import java.util.Scanner;

public class sayiIslemleri {

    public static void main(String[] args) {
       /* int sayi1 = 10; // c# ile aynı mantık
        float sayi2 = 2.6f; // diğer değişken türlerinden farklı olarak floatın sonunda f konmak zorunda.
        System.out.println(sayi1); //yazdırma işlemi
        sayi1 = (int)sayi2; // dönüştürme işlemleri için kalıp
        System.out.println(sayi1);  */

        Scanner girdi = new Scanner(System.in); //Kullanıcadan veri isteme
        System.out.print("Birinci sayıyı giriniz");
        float sayi1 = girdi.nextFloat();
        System.out.print("İkinci sayıyı giriniz");
        float sayi2 = girdi.nextFloat();

        float sayi1kare=sayi1*sayi1;
        float sayi2kare=sayi2*sayi2;

        float hipotenus = (float) Math.sqrt(sayi1kare+sayi2kare);
        System.out.println("Hipotenus :"+ hipotenus);

    }
}