public class FindTheSecondLargestNumberArray {

    public static void main(String[] args) {
        System.out.println("Find the Second Largest Number in an Array");

        int[] arr = {3, 2, 5, 7,70, 3, 9};
        int secLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }else if (arr[i]>secLargest && largest!=arr[i]){
                secLargest=arr[i];
            }
        }
        System.out.println("Find the Second Largest Number in an Array:  "+secLargest);
    }

}
