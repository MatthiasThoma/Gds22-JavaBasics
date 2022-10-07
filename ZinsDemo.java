public class ZinsDemo
{
    public static void main(String[] args)
    {
        double kontostand = 1000;
        double zinsen= 2.25;

        double erhalteneZinsen = zinsen(kontostand, zinsen);

        System.out.println("Kontostand alt: " + kontostand);
        System.out.println("Zinssatz: " + zinsen);
        System.out.println("Zinsen: " + erhalteneZinsen);
        System.out.println("Kontostand neu: " + (kontostand + erhalteneZinsen) );
    }

    public static double zinsen( double a, double b)
    {
        double erhalteneZinsen = ( a / 100 ) * b;

        return erhalteneZinsen;
    }

}
