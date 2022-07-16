import java.util.Scanner;
public class circleWork3 {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Put a year here");
        double year = myScanner.nextDouble();
        if (year%4==0){
            System.out.println("Yes");
        } else System.out.println("no");

    }
}
