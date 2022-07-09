import java.util.Scanner;
public class dowhile3 {
    public static void main(String[]args) {
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("y/n? ");
            answer = myScanner.next().charAt(0);
            System.out.println("Answer = " + answer);
        } while (answer  == 'n');
    }
}
