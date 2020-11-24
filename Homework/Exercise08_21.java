import java.util.Scanner;
public class Exercise08_21 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int cities = input.nextInt();

        double[][] coordinates = new double[cities][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int row = 0; row < coordinates.length; row++) {
            for (int col = 0; col < 2; col++) {
                coordinates[row][col] = input.nextDouble();

            }
        }

        double[] central = getDistance(coordinates);

        System.out.print("The central city is at (" + central[0] + "," + central[1] + ")");
        System.out.print("The total distance to all other cities is " + central[2]);

    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
         double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
         return distance;
     }

     public static double[] center(double[][] coordinates){

         for (int row = 0; row < coordinates.length; row++) {
             for (int col = 0; col < coordinates.length; col++) {
                    if (col !=row){
                        coordinates[row][2] += getDistance(coordinates[row][0], coordinates[row][1], coordinates[col][0], coordinates[col][1]);
                    }
             }
         }

         double[] central = coordinates[0];
         for(int i = 1; i < coordinates.length; i++){
             if (coordinates [i][2] < central[2]){
                 central = coordinates[i];
             }
         }
         return central;
    }
}
