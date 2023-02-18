import java.util.Scanner;
public class if01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Selector?");
        int sel = myScanner.nextInt();
        if (sel == 1){
            System.out.print(" B value ");
        } else if (sel == 0) {
            System.out.print(" A value");
        } else {
            System.out.println("incorrect output");
        }
    }
}
