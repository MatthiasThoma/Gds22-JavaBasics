public class UmsatzDemo
{
    public static void main(String[] args)
    {
        int[] umsaetze = {10, 12, 20, 10, 10, 12, 20, 10,10, 12, 20, 30};
        String[] monatsnamen = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        double monatsindex;
        monatsindex = Umsatzsteigerung (umsaetze);


    public static int Umsatzsteigerung(int[] monate)
    {
        String[] monatsnamen = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        for(int i = 0; i < 11; i++) {
            if (monate[i + 1] > (monate[i] + (monate[i] / 10))) {
                System.out.println(monatsnamen[i]);

            } else {
                i++;
            }
        }
        return 0;
    }
}
