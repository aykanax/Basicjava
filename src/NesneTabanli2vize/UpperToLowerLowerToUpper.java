package NesneTabanli2vize;

 public class UpperToLowerLowerToUpper {
    public static void main(String[] args) {

        String str1="Yuksek Ihtısas Universitesi";
        StringBuffer newStr=new StringBuffer(str1);

        for(int i = 0; i < str1.length(); i++) {

            //Küçük harf kontrolü
            if(Character.isLowerCase(str1.charAt(i))) {
                //toUpperCase() fonksiyonu ile büyük harfe çevirme
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            //Büyük Harf Kontrolü
            else if(Character.isUpperCase(str1.charAt(i))) {
                //toLowerCase() fonksiyonu ile küçük harfe çevirme
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("Dönüştürüldükten sonra : " + newStr);
    }
}
