public class ModifyElementinArray {

    public static void main(String[] args){
        System.out.println("Modify Element in an Array::");
        int [] array={1,2,3,4,5,6,7,8,9,0};
        array[9]=10;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Modify Element in an Array::"+array[i]);
        }
    }
}
