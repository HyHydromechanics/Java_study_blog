import java.util.Scanner;
public class assign{
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Yourname?");
        String name = myScanner.next();
        System.out.println("Yourage?");
        int age = myScanner.nextInt();
        System.out.println("Yourmoney?");
        double sal = myScanner.nextDouble();
        System.out.println("Information:");
        System.out.println("Name="+name+"age="+age+"money="+sal);
    }
    
}