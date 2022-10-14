public class Diagonale
{
    public static void main(String[] args)
    {
        int groesse = 5;
        generateMatrix(groesse);
    }

    public static int[][] generateMatrix (int size)
    {
        int[][] matrix = new int[size][size];

        for(int i =0; i < size; i++)
        {
            matrix[i][i] = 1;
        }

        for(int dimY = 0; dimY < matrix[0].length; dimY++) {
            for (int dimX = 0; dimX < matrix.length; dimX++)
            {
                System.out.print(matrix[dimY][dimX] + "|");
            }
            System.out.println();
        }
        return matrix;

    }
}
