public class FindTheLargestAndMinimumNumberInArray {

    public static void main(String[] args) {

            System.out.println("Find the Mimimum and Largest Number in an Array");
            int array[]={3,1,22,44,66,77,88,99,23,33,7,6666};
            int minimum=array[0];
            int max=array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i]>max || array[i]<minimum){
                    max=array[i];
                }
                if (array[i]<minimum){
                    minimum=array[i];
                }
            }
        System.out.println("Maximum element in array"+max);
        System.out.println("Minimum element in array"+minimum);

    }
}
