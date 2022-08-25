package moneyStorage;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// 这里是不使用面向对象的
public class SysNotOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int key = 0;
        double money = 0;
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "------Details------";
        do{
            System.out.println("\n====menu====");
            System.out.println("\t\t\t\t 1. Details");
            System.out.println("\t\t\t\t 2. Money You Get");
            System.out.println("\t\t\t\t 3. Spend Money");
            System.out.println("\t\t\t\t 4. Quit");
            System.out.println("Please type the word(1-4) to do the command");
            key = scanner.nextInt();

            switch (key){
                case 1:
                    System.out.println("1.  Details about your money");
                    System.out.println(details);
                    System.out.println();
                    date = new Date();
                    details += "\nMoney you get\n" + money +"\t" + simpleDateFormat.format(date);
                    break;
                case 2:
                    System.out.println("2.  Money you get");
                    int moneyGet = scanner.nextInt();
                    if (moneyGet<0){
                        moneyGet = 0;
                        System.out.println("It has to be positive");
                    } else if (moneyGet>=10000){
                        moneyGet = 0;
                        System.out.println("you cannot put so many money in it");
                    } else {
                        money = moneyGet+money;
                        System.out.println("\nMoney you get\n" + money +"\t" + simpleDateFormat.format(date));
                        System.out.println("This it all of your money "+ money);
                    }
                    break;
                case 3:
                    System.out.println("3.  Spend money");
                    break;
                case 4:
                    System.out.println("4.  Quit");
                    loop = false;
                    break;
                default:
                    System.out.println("Please choose 1~4 to do so");
            }
        } while (loop);
    }
}
