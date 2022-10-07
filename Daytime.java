import java.util.Scanner;

public class Daytime
{
    public static void main(String[] args)
    {
        int time = 0;
        System.out.println("Was ist die Uhrzeit? ");
        Scanner input = new Scanner(System.in);
        time = input.nextInt();
        String Daytime;
        Daytime = itIsThisLate(time);
        System.out.println("Es ist " + Daytime);
    }


    public static String itIsThisLate (int what)
    {
        String daytimeText = "Nacht";

        if (what >= 6 && what <= 9)
         {
            daytimeText = "Früh";
            return daytimeText;
         }
        else if (what > 9 && what <= 12)
        {
            daytimeText = "Vormittag";
            return daytimeText;
        }
        else if (what >12  && what <= 16)
        {
            daytimeText = "Nachmittag";
            return daytimeText;
        }
        else if (what > 16 && what <= 20)
        {
            daytimeText = "Abend";
            return daytimeText;
        }
        else
        {
            return daytimeText;
        }

        //return daytimeText;

    }

}


/*    6-9 früh
9-12 vormittag
12-16 nachmittag
16-20 abend
20-6 Nacht

 */
