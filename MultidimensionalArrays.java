public class MultidimensionalArrays {

    public static void main(String[] args) {
        System.out.println("Multi-dimensional Arrays");
        int array [][]={{1,2},{3,4},{5,6},{0,0}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Multi-dimensional Arrays::" +array[i][j]);
            }
        }
    }
}
