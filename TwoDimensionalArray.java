public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        int[] oneDim = new int[5];
        int[][] twoDim = new int [5][3];

        twoDim[0][0] = 1;
        twoDim[0][1] = 7;
        twoDim[1][2] = 5;

        for (int dimX = 0; dimX < twoDim.length; dimX++)
        {
            for(int dimY = 0; dimY < twoDim[dimX].length; dimY++)
            {
                System.out.print(twoDim[dimX][dimY] + "|");
            }
            System.out.println();
        }

        // Darstellung in der üblichen Form

        for(int dimY = 0; dimY < twoDim[0].length; dimY++)
        {
            for(int dimX = 0; dimX < twoDim.length; dimX++)
            {
                System.out.print(twoDim[dimX][dimY] + "|");
            }
            System.out.println();
        }

    }
}
