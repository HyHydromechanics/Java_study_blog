import java.util.Scanner;
public class for_work1_extra {
    public static void main(String[]args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Start at: ");
        int start = myScanner.nextInt();
        System.out.println("End at: ");
        int end = myScanner.nextInt();
        System.out.println("Seperate number: ");
        int dev = myScanner.nextInt();
        int sum = 0;
        int count_num = 0;
        for (;start<=end;start++){
            if (start%dev==0){
            System.out.print(start+" ");
            count_num++;
            sum += start;
        }
    }
    System.out.println("Count's number is: "+ count_num);
    System.out.println("Sum is: "+ sum);
    }
}
