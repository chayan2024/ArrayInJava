public class FindTheSecondLargestNumberArray {

    public static void main(String[] args) {
        System.out.println("Find the Second Largest Number in an Array");

     //   int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {3, 2, 5, 7,70, 3, 9};

        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;

        for (int num:arr){
            if (num>largest){
                secLargest=largest;
                largest=num;
            } else if (num>secLargest && num!=largest) {
                secLargest=num;
            }
        }
        System.out.println("maximum value:"+secLargest);
    }

}
