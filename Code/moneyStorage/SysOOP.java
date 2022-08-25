package moneyStorage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SysOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true; // switch的循环
    String command = ""; // 1～4的命令, scanner
    String detailsTitle = "-----Details About Your Money-----";
    double money = 0;
    double getMoney = 0;
    String reasonSpendMoney = "";


    public void mainMenu(){
        do {
            System.out.println("\n================零钱通菜单(OOP)===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.print("请选择(1-4): ");
            command = scanner.next();
            switch (command){
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
            }
        } while (loop);
    }

    public void details(){
        System.out.println("details");
    }

    public void SpendMoney(){
        System.out.println("Spend Money");
    }

    public void GetMoney(){
        System.out.println("Get Money");
    }

    public void Quit(){
        System.out.println("Quit");
    }


    public class time{
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(date.getTime());
    }
}





