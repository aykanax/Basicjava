package NesneTabanli2vize;

public class MükemmelSayılar {

    public static void main(String[] args) {


        int toplam=0;
        for(int i=1;i<=10000;i++){
            for(int j=1;j<i;j++){

                if(i%j==0){

                    toplam=toplam+j;
                }

            }
            if(toplam==i){

                System.out.println(i+ " Sayısı Bir Mükemmel Sayıdır.");
            }
            toplam=0;


        }




    }

}