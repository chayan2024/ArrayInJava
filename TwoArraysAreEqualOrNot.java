import java.util.Arrays;

public class TwoArraysAreEqualOrNot {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};

        // one approach

        boolean result= Arrays.equals(arr1,arr2);
        System.out.println("Result::"+result);

        if (result == true) {
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }

        // second approach

        int arr3[]={12,5,6,7};
        int arr4[]={12,5,7,7};

        boolean sResult=true;

        if (arr3.length==arr4.length){
            for(int i=0;i<arr3.length;i++){
                if (arr3[i]!=arr4[i]){
                    sResult=false;
                }
            }
        }else{
            sResult=false;
        }
        if (sResult == true) {

            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }



    }
}
