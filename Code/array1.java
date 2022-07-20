public class array1 {
    public static void main (String[]args){
        double[] hens = {3, 4, 5, 6, 9, 0};
        double totalWeight = 0;
        for (int i = 0; i<=5; i++){
            System.out.println(hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("Length = " + hens.length);
        System.out.println(totalWeight);
        System.out.println(totalWeight/hens.length);
    }
}
