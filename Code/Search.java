import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        Scanner myScanner = new Scanner(System.in);
        int numFind = myScanner.nextInt();

        for (int i = 0; i<num.length; i++){
            if (numFind == num[i]){
                System.out.println(i);
            }
        }
    }
}
