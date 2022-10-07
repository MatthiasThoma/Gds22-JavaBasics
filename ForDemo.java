import java.util.Scanner;

public class ForDemo
{
    public static void main(String[] args)
    {
        int zahl;
        System.out.println("Zu überprüfende Zahl?");
        Scanner input = new Scanner(System.in);
        zahl = input.nextInt();


        for(int i = 1; i <= zahl; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Gerade Zahlen bis " + i + ":");
            }
        }
    }
}
