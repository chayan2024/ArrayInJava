public class CopyingArrays {
    public static void main(String[] args) {
        System.out.println("Copying Arrays");
        int array[]={1,2,3,4};
        int newArray[]=java.util.Arrays.copyOf(array,array.length);
        System.out.println("Copying Arrays into new array::"+java.util.Arrays.toString(newArray));

        // another approach

        int b[]=new int[array.length];
        b=array;
        b[0]++;
        System.out.println("Copy:;"+java.util.Arrays.toString(b));
    }
}
