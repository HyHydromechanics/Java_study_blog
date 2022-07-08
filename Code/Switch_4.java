import java.util.Scanner;

import javax.lang.model.element.Element;
public class Switch_4 {
    public static void main(String[]args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Put a month number here");
        int month = myScanner.nextInt();
        // if (month >= 3 && month <=5){
        //     System.out.println("Spring");
        // } else if(month >=6 && month <=8){
        //     System.out.println("Summer");
        // } else if(month >=9 && month <= 11){
        //     System.out.println("Fall");
        // } else{
        //     System.out.println("Winter");
        // }
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
}