import java.util.Scanner;


public class Calculator
{
    public static void main(String[] args)
    {
        //String name = "Calculator TM";

        int argument1;
        int argument2;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Was ist die erste Zahl? ");
        argument1 = input.nextInt();

        System.out.println("was ist die zweite Zahl? ");
        argument2 = input.nextInt();

        String rechenart;
        System.out.println("Was soll mit den angegegebenen Zahlen gemacht werden? " +
                "(Verfügbar: Addition (add), Substraktion (sub), Multiplikation (mult), Division (div) und Modulo " +
                "(mod)");
        System.out.println("Bitte eine der in den Klammern angegebenen Rechenarten auswählen");

        rechenart = input.nextLine();
        rechenart = input.nextLine();

        if (rechenart.equals("add"))
        {
            result = add(argument1, argument2);
            print(result);
        }
        else if (rechenart.equals("sub"))
        {
            result = sub(argument1, argument2);
            print(result);
        }
        else if (rechenart.equals("mult"))
        {
            result = mult(argument1, argument2);
            print(result);
        }
        else if (rechenart.equals("div"))
        {
            result = div(argument1, argument2);
            print(result);
        }
        else if (rechenart.equals("mod"))
        {
            result = mod(argument1, argument2);
            print(result);
        }
        else
        {
            System.out.println("ERROR, bitte zulässige Rechenart eingeben");
        }


 /*
        result = add(argument1, argument2);
        print(result);
        //System.out.println(("Addition: " + result));

        result = sub(argument1, argument2);
        //System.out.println(("Substraktion: " + result));
        print(result);

        result = mult(argument1, argument2);
        //System.out.println("Multiplikation: " + result);
        print(result);

        result = div(argument1, argument2);
        //System.out.println("Division: " + result);
        print(result);

        result = mod(argument1, argument2);
        //System.out.println("Modulo: " + result);
        print(result);


  */
    }



/*
       System.out.println("Mein Name ist: " + name);
       System.out.println("Summand 1 = " + argument1);
       System.out.println("Summand 2 = " + argument2);
       System.out.println("Das Ergebnis ist = " + result);
    }
 */

/*
    public static String Auswahl(String auswahl)
        {
            String auswahl = auswahl;
            int result = 0;

            if (auswahl.equals("add"))
            {
                result = add(argument1, argument2);
                return result;
            }
        }
*/
    public static int add(int a, int b)
    {
        int addi = a + b;
        return addi;
    }


    public static int sub(int a, int b)
        {
            int subs = a - b;
            return subs;
        }
    public static int mult(int a, int b)
        {
            int multi = a * b;
            return multi;
        }

    public static double div(double a, double b)
    {
        double divi;
        if (b != 0)
        {
            divi = a / b;
        }
        else
        {
            System.out.println("Error, not allowed to divide through 0! ");
            return 0;
        }
        return divi;
    }

    public static int mod(int a, int b)
    {
        int modo = a % b;
        return modo;
    }

    public static void print(double toprint)
    {
        System.out.println(toprint);
    }
}
