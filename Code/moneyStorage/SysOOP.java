package moneyStorage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SysOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true; // switch的循环
    String command = ""; // 1～4的命令, scanner
    String detailsTitle = "=====Details About Your Money=====";
    String detailsTitleCopy = "=====Details About Your Money=====";
    double money = 0;
    double getMoney = 0;
    double spendMoney = 0;

    String spendMoneyNote = "Added";
    time time = new time();
    String timeNow = time.time;


    public void mainMenu(){
        do {
            System.out.println("\n================Menu===============");
            System.out.println("\t\t\t1 Details");
            System.out.println("\t\t\t2 Spend");
            System.out.println("\t\t\t3 Get");
            System.out.println("\t\t\t4 Quit");

            System.out.print("Please Choose(1-4): ");
            command = scanner.next();
            switch (command) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.SpendMoney();
                    break;
                case "3":
                    this.GetMoney();
                    break;
                case "4":
                    this.Quit();
                    break;
            }
        } while (loop);
    }

    public void details(){
        System.out.println("-----details-----");
        if (detailsTitle.equals(detailsTitleCopy)){
            System.out.println("You do not have any activities yet");
        } else System.out.println(detailsTitle);
    }

    public void SpendMoney(){
        System.out.println("-----Spend Money-----");
        System.out.print("How much do you need to spend:");
        spendMoney = scanner.nextDouble();
        if (spendMoney<=0 || spendMoney>=money){
            spendMoney = 0;
            System.out.println("You can's spend more money than you have");
        } else {
            System.out.print("For What: ");
            spendMoneyNote = scanner.next();
            money -= spendMoney;
            detailsTitle += "\nmoney you spent\t-" + spendMoney + "\t"+timeNow + "\t\t" + money + "\t" +spendMoneyNote;
            System.out.println(detailsTitle);
        }
    }

    public void GetMoney(){
        System.out.println("-----Get Money-----");
        System.out.print("How much money have you received: ");
        getMoney = scanner.nextDouble();
        if (getMoney<=0){
            System.out.println("You cannot have less than zero");
            getMoney =0;
        } else if (getMoney>=10000){
            System.out.println("We cannot receive so much money");
            getMoney = 0;
        }
        money += getMoney;
        detailsTitle += "\nmoney you get\t+" + getMoney + "\t"+timeNow + "\t\t" + money+ "\t" + spendMoneyNote;
        System.out.println(detailsTitle);
    }

    public void Quit(){
        System.out.println("-----Quit-----");
        System.out.println("Are you sure you want to quit this program?\n(Y/n)");
        String yes = "y";
        String Yes = "Y";
        String no = "n";
        String quitCommand = scanner.next();
        if (quitCommand.equals(yes) || quitCommand.equals(Yes)){
            loop = false;
            System.out.println("Goodbye");
        } else if (quitCommand.equals(no)){
            loop = true;
        } else System.out.println("Please type Y/n to conform");

    }


    public static class time{
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(date.getTime());
    }
}
