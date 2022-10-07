import java.util.Scanner;

public class ReckeckDemo
{
    public static void main(String[] args)
    {
        int breite;
        int laenge;

        Scanner input = new Scanner(System.in);

        System.out.println("Welche Länge hat das Rechteck? ");
        laenge = input.nextInt();

        System.out.println("Welche Breite hat das Rechteck? ");
        breite = input.nextInt();

        int umfang = 2 * breite + 2 * laenge;
        int flaeche = breite * laenge;

        System.out.println("Umfang = " + umfang);
        System.out.println("Fläche = " + flaeche);
    }
}
