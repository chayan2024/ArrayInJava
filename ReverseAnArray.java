public class ReverseAnArray {
    public static void main(String[] args) {

        System.out.println("Reverse an Array:");
        int arr[]={2,4,5,6,7,1,39,77,0,11};
        int n=arr.length;

        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        System.out.println("Reverse an Array:: " +java.util.Arrays.toString(arr));
    }
}
