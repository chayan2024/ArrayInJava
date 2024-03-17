public class AddTwoMetrices {
    public static void main(String[] args) {

        System.out.println("Java Program to Add two Matrices\n");

        int row[][] = {
                {1, 2},
                {3, 4}
        };

        int column[][] = {
                {5, 6},
                {7, 8}
        };

        int result[][] = new int[2][2];

        for (int i = 0; i < row.length; i++) {

            for (int j = 0; j < column.length; j++) {

                result[i][j] = row[i][j] + column[i][j];
            }
//        }

            for (int k = 0; k < result.length; k++) {

                for (int l = 0; l < result[k].length; l++) {

                    System.out.print(result[k][l] + " ");
                }
                System.out.println();
            }

        }

    }
}
