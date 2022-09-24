public class ArithmetischeOperationen
{
    public static void main(String[] args)
    {
        int a = 42;
        int b = 69;

        int addition = a + b;
        int substraktion = b - a;
        int multiplikation = a * b;

        // Typanpassung: Java erlaubt nur division durch Gleitkommazahlen
        double division = (double) b / (double) a;
        //Alternative: double div = a / (1,0 * b);
        int modulo = b % a;


        System.out.println("Ergebnis Addition: " + addition);
        System.out.println("Ergebnis Substraktion: " + substraktion);
        System.out.println("Ergebnis Multiplikation: " + multiplikation);
        System.out.println("Ergebnis Division: " + division);
        System.out.println("Ergebnis Modulo: " + modulo);
    }
}
