import java.util.Scanner;

public class PrimeOrNot
{
    public boolean isPrime()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        if (number >= 2)
        {
            if(number > 2)
            {
                for (int i = 2; i < number; i++)
                {
                    if (number % i == 0)
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        PrimeOrNot isleyici = new PrimeOrNot();
        boolean sonuc = isleyici.isPrime();

        if (sonuc)
        {
            System.out.println("Sayı asaldır.");
        }
        else
        {
            System.out.println("Sayı asal değildir.");
        }
    }
}
