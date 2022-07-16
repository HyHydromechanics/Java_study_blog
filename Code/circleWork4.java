import java.util.Scanner;
public class circleWork4 {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Put a Narcissistic number here");
        int nNumber = myScanner.nextInt();
        int a = (int) (nNumber/100);
        int b = (int) ((nNumber-a*100)/10);
        int c = (int) (nNumber - a * 100 - b * 10);
        if (a*a*a+b*b*b+c*c*c == nNumber){
            System.out.println("YES");

        } else System.out.println("No");
    }
}
