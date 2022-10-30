package hafta2;

import java.util.Locale;

public class string {

    public static void main(String[] args) {


    String ad = "Aykan"; // Javada string bir Classtır.

    String ilk = "Java";
    String ikinci ="Pyhton";
    String ucuncu = "R programing language";
/*
    //String in uzunlugu bulma
    //Uzunluk bilgisi int türünden gelir
    int uzun = ilk.length();
    System.out.println("İlk stringin uzunluğu: "+ ilk.length());
    System.out.println("İkinci stringin uzunluğu: " + ikinci.length());
    System.out.println("Üçüncü strigin uzunluğu: " + ucuncu.length());
*/
   /*
    //iki stiringi birleştirme
    String birlesik = ilk+ikinci;
    System.out.println("Concatsız birleştirme : " + birlesik);
    String birlesik1 = ilk.concat(ikinci); //ilk stingin sonuna ekler genelde bu tercih edilir
    System.out.println("Concatlı birleştirme : " + birlesik1);

    //ikiden fazla stringi birleştirme

        String coklubirlesik = ilk + ikinci + ucuncu;
        System.out.println("Joinsiz birleştirme : "+ coklubirlesik);
    //String classinin icideki join
        //İlk ifade olara ayracı girmemizi ister
        //istenilen kadar string ifadeyi girmemiz gerekir ve bunlari birleştirir
        String coklubirlesik1 = String.join("",ilk,ikinci,ucuncu);
        System.out.println("Joinli birleştirme : "+coklubirlesik1);

    */


        /*
        //iki stringi karşılaştırma compare
        //boolean degisken türü
        //evet/hayir,0-1, true-false (dogru yanlıs) sadece bu degerleri alır
        boolean deneme = false;

        String language1 = "Java Programing";
        String language2 = "java programing";
        String language3 = "Java Programing";

        //ilk yazılan nesne ile parantez içindeki nesneyi karşılaştırır

        boolean result1 = language1.equals(language2);
        System.out.println("Dil1 be dil2 aynı mı : "+result1);

        boolean result2 = language1.equals(language3);
        System.out.println("Dil1 ve dil3 aynı mı : "+result2);

    //toLowerCase()- Stirngin bütün karakterlerini kücük harf yapar
        // toUpperCase()- Stirngin bütün karakterlerini büyük harf yapar

        System.out.println("Büyük harfle yazdırma : " +language3.toUpperCase());
        System.out.println("Küçük harfle yazdırma : " +language3.toLowerCase());

        //yazılım için harfin büyüklüğü küçüklüğü ayırt edicidir.

        boolean result3 = language1.toLowerCase().equals(language2.toLowerCase());
        System.out.println("Dil1 ve iki aynı mı :"+result3);
*/
/*


        String bolunecek ="Aykan Awesome Seziş"; //A 0 ise ş 11nci ifade
        System.out.println(bolunecek.length());
        System.out.println("Substring çıktısı : "+bolunecek.substring(6,14));

        //eğer bitiş vermezse sonuna kadar ayılır
*/


        /*
     ad = "Enes Sahbudak";
     String ad1 = ad.replace("S","Ş");
     System.out.println("Değiştirilmiş isim :" + ad1);

     String ad2 =ad.replace("" + "","SUPRA");
        System.out.println("Değiştirilmiş isim :" + ad2);

     String ad3 = ad.replace("E","A");
        System.out.println("Değiştirilmiş isim :" + ad3);
*/
        //dizi ornegi
        String[] dizi = {"Semih", "Arda", "Aykan"};
        System.out.println(dizi[2] + dizi[1] + dizi[0]);
        // Belli bir String i belli bir ifadeye göre ayirma
        String metin = "Yüksek İhtisas Üniversitesi Meslek " +
                "Yüksekokulu Bilgisayar Programciligi Programi";
        String[] sonuc = metin.split(" ");
        for(int i = 0; i < sonuc.length; i++){
            System.out.println("Metinin " + i + ".elemani : " + sonuc[i]);
        }


        //Belli bir String in belli bir baska String i icerip icermedigini kontrol etme

        String isim = "Emir Can Aydın";

        System.out.println("isim Stringin icinde \"an\" Kelimesi var mı :  " + isim.contains("an"));


    }
}
