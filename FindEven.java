import java.util.Scanner;


public class FindEven
{
    public static void main(String[] args)
    {
        int zahl;
        int counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Welche Zahl soll überprüft werden? ");
        zahl = input.nextInt();

        while (counter <= zahl)
        {
            if (counter % 2 == 0)
            {
                System.out.println(counter);
            }
            counter++;
        }

    }
}
