import java.util.Scanner;


public class NewCalc
{
    public static void main(String[] args)
    {
        //String name = "Calculator TM";

        int argument1;
        int argument2;
        int[] argument3 = null;
        double result;
                String master = "yes";

        Scanner input = new Scanner(System.in);

        while (master.equals("yes"))
        {
            String rechenart;
            System.out.println("Was soll mit den angegegebenen Zahlen gemacht werden? " +
                    "(Verfügbar: Addition (add), Substraktion (sub), Multiplikation (mult), Division (div) und Modulo " +
                    "(mod), Aufsummieren (sum)");
            System.out.println("Bitte eine der in den Klammern angegebenen Rechenarten auswählen");

            rechenart = input.nextLine();

            if (rechenart.equals("sum"))
            {
                System.out.println("Wie viele Zahlen wollen sie aufsummieren?");
                int arraysize = input.nextInt();
                argument3 = new int [arraysize];

                for (int i = 0; i < argument3.length; i++) {
                    System.out.println("Bitte geben sie die Zahl " + (i + 1) + "ein:");
                    argument3[i] = input.nextInt();
                }

        }
            System.out.println("Was ist die erste Zahl? ");
            argument1 = input.nextInt();

            System.out.println("was ist die zweite Zahl? ");
            argument2 = input.nextInt();



            if (rechenart.equals("add")) {
                result = add(argument1, argument2);
                print(result);
            } else if (rechenart.equals("sub")) {
                result = sub(argument1, argument2);
                print(result);
            } else if (rechenart.equals("mult")) {
                result = mult(argument1, argument2);
                print(result);
            } else if (rechenart.equals("div")) {
                result = div(argument1, argument2);
                print(result);
            } else if (rechenart.equals("mod")) {
                result = mod(argument1, argument2);
                print(result);
            }
            else if (rechenart.equals("sum"))
                {
                    result = sum(argument3);
                    print(result);
                }
            else{
        System.out.println("ERROR, bitte zulässige Rechenart eingeben");
            }
            System.out.println("Falls sie weitermachen wollen bitte schreiben sie bitte [yes]");
            master = input.nextLine();
            master = input.nextLine();
        }
    }




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

    public static double sum(int array[])
    {
        double summi = 0;
        for(int i = 0; i < array.length; i++)
        {
            summi = summi + array[i];
        }
        return summi;
    }

    public static void print(double toprint)
    {
        System.out.println(toprint);
    }
}
