import java.util.Scanner;
public class Switch_02 {
    public static void main(String [] args) {
        // use switch to transfer the lowercase letters 
        // into capital letters.
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type in a lowercase letter");
        char c1 = myScanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.print("A");                
                break;

            case 'b':
                System.out.print("b");
                break;
            case 'c':
                System.out.print("C");                
                break;
            case 'd':
                System.out.print("D");                
                break;
            case 'e':
                System.out.print("E");                
                break;
            case 'f':
                System.out.print("F");                
                break;
        
            default:
                System.out.println("That's not we are supporting.");
                break;
        }
    }
}
