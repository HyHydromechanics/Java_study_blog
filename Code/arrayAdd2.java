import java.util.Scanner;

public class arrayAdd2{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int[] arrOld = {1,2,3};

        for (int i = 0; i< arrOld.length; i++){
            System.out.println(arrOld[i]);
        }

        System.out.println("How many do you want to add: ");
        int addNum = myScanner.nextInt();
        int[] arrNew = new int[arrOld.length+addNum];

        for (int i = 0; i< arrOld.length; i++){
            arrNew[i] = arrOld[i];
            System.out.println(arrNew[i]);

        }
        System.out.println(arrNew.length);

        for (int i = arrOld.length; i< arrNew.length; i++){
            int temp = myScanner.nextInt();
            arrNew[i] = temp;
        }


        for (int i = 0; i< arrNew.length; i++){
            System.out.println(arrNew[i]);
        }
    }
}
