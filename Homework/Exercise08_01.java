import java.util.Scanner;

public class Exercise08_01{
    public static void main (String[] args){

        double[][] finalMatrix = matrix();

        for(int i = 0; i <= finalMatrix.length; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(finalMatrix, i));
        }

    }

    public static double[][] matrix(){
        final int ROW = 3;
        final int COLUMN = 4;
        double [][] m = new double[ROW][COLUMN];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a " + ROW + "-by-" + COLUMN + " matrix row by row: ");
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        return m;
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
