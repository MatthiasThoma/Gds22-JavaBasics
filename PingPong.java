public class PingPong
{
    public static void main(String[] args)
    {
        int zähler = 0;
        zähler = pingPong(zähler);
        System.out.printf( zähler + " wurde ereicht, Spiel zu ende ");
    }


public static int pingPong(int counter2)
{
    for (counter2 = 0; counter2 <= 100; counter2++)
    {
        if (counter2 % 6 == 0)
        {
            System.out.println(counter2 + "ping pong");
        }
        else if (counter2 % 3 == 0)
        {
            System.out.println(counter2 + "pong");
        }
        else if (counter2 % 2 == 0)
       {
           System.out.println(counter2 + "ping");
       }
        else
        {
        System.out.println(counter2 + " - ");
        }
    }
    return counter2;
}

}
