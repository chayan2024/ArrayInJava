public class TwoDArrayOrMatrixInJava {

    public static void main(String[] args) {
        System.out.println("Print a 2 D Array or Matrix in Java");
        int array[][]={
                {1,2,3,4,5},{6,7,8,9},{10,11,13,14}
        };
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j <array[i].length ; j++) {

                System.out.println("Print a 2 D Array or Matrix in Java::"+array[i][j]);
            }
        }
    }
}
