import java.util.Scanner;

public class arrayAdd1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int[] arrOld = {1,2,3};
        int[] arrNew = new int[arrOld.length+1];
        for (int i = 0; i< arrOld.length; i++){
            arrNew[i] = arrOld[i];
            System.out.println(arrNew[i]);
        }
        System.out.println("===");
        int temp = myScanner.nextInt();
        arrNew[3] = temp;

        for (int i = 0; i< arrNew.length; i++){
            System.out.println(arrNew[i]);
        }
    }
}
