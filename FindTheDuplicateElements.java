import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateElements {
    public static void main(String[] args) {

        System.out.println("Find the Duplicate Elements");

        int arr[]={1,1,22,33,4,5,6,6,7,7};
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for (int num:arr){
            if (!set.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Find the Duplicate Elements" +duplicates);
    }
}
