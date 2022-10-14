import java.util.Scanner;

public class AverageSizeCalculationsApp
{
    public static void main(String[] args)
    {
        int number = 0;
        int summary = 0;
        int average;
        Scanner input = new Scanner(System.in);

        System.out.println("Wie viele Studenten sind anwesend?");
        number = input.nextInt();

        int[] height = new int [number];

        for (int i = 0; i < height.length; i++)
        {
            System.out.println("Welche Größe hat Student " + (i+1) +  "?");
            height[i] = input.nextInt();
        }

        for (int j = 0; j < height.length; j++)
        {
            summary = summary + height[j];
        }

        average = summary / number;
        System.out.println("Die durchschnittliche Größe aller anwesenden Studenten beträgt: " + average);
    }
}
