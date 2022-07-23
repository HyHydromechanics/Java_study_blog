public class ArrayP3 {
    public static void main(String[] args) {
        int temp = 0;
        int temp1 = 0;
        int[] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++){
            temp = array[i];
            temp1 += temp;
        }
        System.out.println(temp1/array.length);
        System.out.println(array.length);
    }
}
