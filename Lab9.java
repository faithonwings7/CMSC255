public class Lab9 {
    public static void addTo10(int [][] array) {

        int sum = 0;
        int i = 0;


        for(i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            System.out.println("original sum" + sum);

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    int change = -sum + 10;
                    array [i][j] = change;
                }
            }
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            System.out.println("sum after change " + sum);
            sum = 0;
        }

    }


    public static void setHints(int [][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == -1){
                    isBomb()
                }
            }
        }
    }

    public static boolean isInBounds(int i, int j, int[][] board){
        return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
    }

    public static boolean isBomb(int value){
        return value == -1;
    }


    public static void main(String[] args)
    {

        int [][] matrix = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1},
                {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
        int [][] matrix2 = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
        int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
        addTo10(matrix2);
        setHints(matrix);
        setHints(matrix3);

    }

}


