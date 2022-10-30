package NesneTabanli2vize;

public class ArmstrongSayıları
{
    public static void main(String[] args)
    {
        int n, count = 0, a, b, c,d, sum = 0;
        System.out.print("1 ile 10000 arasındaki armstrong sayıları:");
        for(int i = 1; i <= 10000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
