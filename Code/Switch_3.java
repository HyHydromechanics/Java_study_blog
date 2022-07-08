import java.util.Scanner;
public class Switch_3 {
    public static void main(String[]args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type in your grade");
        double score = myScanner.nextDouble();
        if (score >= 0 && score <=100){
            switch ((int)(score/60)) {

                case (1):
                    System.out.println("Yes");
                    break;
                case (0):
                    System.out.println("No");
                    break;
                default:
                    System.out.println("Error");
                    break;
        }
    }
    }
}
