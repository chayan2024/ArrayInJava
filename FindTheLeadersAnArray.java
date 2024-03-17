public class FindTheLeadersAnArray {

    public static void main(String[] args) {

        int arr[]={32,16,17,1,2,3,4,5,7,8,9};
        int n=arr.length;
        int maxFromRight=arr[n-1];
        System.out.print("Leaders: " + maxFromRight + " ");
        for (int i = n-2; i >=0; i--) {
           if (arr[i]>maxFromRight){
               maxFromRight=arr[i];
               System.out.print(maxFromRight +" ");
           }
        }
    }
}
