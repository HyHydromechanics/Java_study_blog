import java.awt.*;

public class arrayReverse1 {
    public static void main(String[] args){
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[arr1.length];

        for (int j = 0; j< arr1.length; j++) {
            System.out.println(arr1[j]);
        }

        System.out.println("====");

        for (int i = 0; i < 3; i++){
            arr2[(arr2.length-1)-i] = arr1[i];
            System.out.println(arr2[(arr2.length-1)-i]);
        }
        System.out.println("====");
        for (int k = 0; k< 3; k++){
            System.out.println(arr1[k]);
        }

    }
}