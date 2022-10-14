public class DemoLoop
{
    public static void main(String[] args)
    {
        int counter = 1;
        int printed = 0;

        while(counter <= 100_000)
        {
            if ((counter + (counter-1)) % 351 == 0)
            {
                System.out.println(counter + " " + (counter -1));
                printed++;
            }
            if (printed == 10)
            {
                break;
            }
            counter++;
        }
    }
}
