import java.util.Scanner;
public class circleWork2 {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Put a number here");
        double num = myScanner.nextDouble();
        if (num>0){
            System.out.println("Bigger than 0");
        } else if (num == 0){
            System.out.println("Equal to 0");
        } else {
            System.out.println("Less than 0");
        }
    }
}
