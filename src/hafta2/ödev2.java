package hafta2;

public class ödev2 {
    public static void main(String[] args) {


        String isimler1 = "Batuhan, Bengisu, Beyza, Bora, Emircan, Emir, İnci, İsmail";
        String soyisimler1 = "Kaya, Durmus, Aktas, Evren, Aydin, Yilmaz, Cumen, Aytar";

        // Bu sekilde verilmis iki farkli String ifadedeki isimler ile soyisimleri
        // eslestiren(birlestiren) uygulamayi yaziniz ve herbir isim soyisim esinin uzunlugunu bulunuz

        //Kullanilmasi gereken fonk;
        // split, (concat veya join), lenght

        //Ornek Cikti;
        // İsim Soyisim : Batuhan Kaya, Uzunluk : 12

        String birlesik = String.join("", isimler1, soyisimler1);
        System.out.println("Bişiler : " + birlesik);

        String metin = "Batuhan, Bengisu, Beyza, Bora, Emircan, Emir, İnci, İsmail" +
                "Kaya, Durmus, Aktas, Evren, Aydin, Yilmaz, Cumen, Aytar";
        String[] sonuc = metin.split(" ");
        for (int i = 0; i < sonuc.length; i++) {
            System.out.println("Metinin " + i + ".elemani : " + sonuc[i]);


        }
    }
}
