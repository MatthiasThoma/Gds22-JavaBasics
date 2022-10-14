import java.util.Scanner;

public class Exchange
{
    public static void main(String[] args)
    {
        double money = 0;
        String currency;
        double changed = 0;

        Scanner input = new Scanner(System.in);

        System.out.println(("What do you want to excange it in? HUF, SEK, USD, CAD"));
        currency = input.nextLine();

        System.out.println("Please tell me how much Euro you want to Excange?");
        money = input.nextDouble();


        changed = exchangeCurrency(currency, money);

        System.out.println("Your " + money + "Euro are " + changed + " in " + currency);

    }

    public static double exchangeCurrency(String currencyID, double value)
    {
        double convert = 0;

        if (currencyID.equals("HUF"))
        {
            convert = value * 328.61;
        }
        else if (currencyID.equals("SEK"))
        {
            convert = value * 10.76;
        }
        else if (currencyID.equals("USD"))
        {
            convert = value * 1.12;
        }
        else if (currencyID.equals("CAD"))
        {
            convert = value * 1.47;
        }

        return convert;
    }
}
