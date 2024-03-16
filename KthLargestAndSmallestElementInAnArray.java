public class KthLargestAndSmallestElementInAnArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,55,66,7,8,89,99,9};
        int k=5;
        java.util.Arrays.sort(arr);
        System.out.println(k+"the largest element"+arr[arr.length-k]);
        System.out.println(k + "th smallest element: " + arr[k - 1]);

    }

}
