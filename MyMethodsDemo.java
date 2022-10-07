public class MyMethodsDemo
{
    public static void main(String[] args)
    {
        printHallo();
        String msg = "Ich bin eine Nachricht";
        printMessage(msg);
        int one = giveMeOne();
        System.out.println(giveMeOne());
        System.out.println(one);

        int result = add(2,3);
        System.out.println(result);
        System.out.println((add(5,6)));

        System.out.println(add(2,giveMeOne()));


    }

    public static void printHallo()
    {
        System.out.println("Hallo");
    }

    public static void printMessage(String message)
    {
        System.out.println("message = " + message );
    }
    
    
    //returned immer 1
    public static int giveMeOne()
    {
        return 1;
    }

    // addition als Methode
    public static int add(int a, int b)
    {
        int result = a + b;
        return result;

        // return a + b;  <<<<<< Erlaubt!
    }
}
