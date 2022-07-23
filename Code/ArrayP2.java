public class ArrayP2 {
    public static void main(String[] args) {
        int[] array = {4, -1, 9, 10, 23};
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i<array.length; i++){
            if (max < array[i]){
                max = array[i];
                maxIndex = i;
                System.out.println("Now, max is " + max);
            }
        }
        System.out.println("Max is " + max + "; MaxIndex = " + maxIndex);

    }
}
