package NesneTabanli2vize;
import java.util.Scanner;

public class HesapMakinesi {


    public static void main(String[] args) {
        /*
        Switch case ile 4 işlem yapan bir hesap makinesi
        */
        Scanner scanner = new Scanner(System.in);

        String islemler ="1. Toplama İşlemi\n"
                +"2. Çıkartma İşlemi\n"
                +"3. Çarpma İşlemi\n"
                +"4. Bölme İşlemi\n"
                +"5. Faktöriyel \n"
                +"6. Logaritma 1 \n"
                +"7. Logaritma 10 \n"
                +"8. Sinüs \n"
                +"9. Cosinüs \n"
                ;

        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        System.out.println("İşlemi giriniz :");
        int islem = scanner.nextInt();

        int a,b;


        switch(islem){

            case 1 :
                System.out.println("Birinci sayiyi girin :");
                a = scanner.nextInt();
                System.out.println("İkinci sayiyi girin :");
                b = scanner.nextInt();

                System.out.println("Girilen değerlerin toplamı :" + (a+b));
                break;


            case 2 :
                System.out.println("Birinci sayiyi girin :");
                a = scanner.nextInt();
                System.out.println("İkinci sayiyi girin :");
                b = scanner.nextInt();

                System.out.println("Girilen değerlerin farkı :" + (a-b));
                break;

            case 3 :
                System.out.println("Birinci sayiyi girin :");
                a = scanner.nextInt();
                System.out.println("İkinci sayiyi girin :");
                b = scanner.nextInt();

                System.out.println("Girilen değerlerin çarpımı :" + (a*b));
                break;
            case 4 :
                System.out.println("Birinci sayiyi girin :");
                a = scanner.nextInt();
                System.out.println("İkinci sayiyi girin :");
                b = scanner.nextInt();

                System.out.println("Girilen değerlerin bölümü :" +(double)(a/b));
                break;
            case 5:
                System.out.println("Sayıyı girin :");
                a = scanner.nextInt();
                int faktoriyel=1;
                for (int i = 1 ; i <= a;i++){
                    faktoriyel= faktoriyel*i;

                }
                System.out.println(a+"!="+faktoriyel);
                break;

                case 6:
                    System.out.println("Sayıyı girin :");
                    double c = scanner.nextDouble();
                    double d=(double) Math.log(c);
                    System.out.println(d);
                    break;
            case 7:
                System.out.println("Sayıyı girin :");
                double e = scanner.nextDouble();
                double f=(double) Math.log10(e);
                System.out.println(f);
                break;
            case 8:
                System.out.println("derece veya radyan giriniz");
                int n = scanner.nextInt();

                double g = (double) (Math.sin(Math.toRadians(n)));//radyan cinsinden açının sinüsünü döndürdük.
                System.out.println(g);
                break;
            case 9:
                System.out.println("değer giriniz ");
                double k = scanner.nextDouble();

                double j = (double) Math.cos(Math.toRadians(k));//toRadians metodumuz ile derece cinsinden olan değerleri radyan cinsine çevirdik.
                System.out.println("Cosinüsü = "+j);
                break;

            default :
                System.out.println("Yanlış işlem kodu seçtiniz.");
        }

    }
}
