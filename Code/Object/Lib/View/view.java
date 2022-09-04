package Lib.View;

import Lib.Utility.Utility;
import Lib.Account.account;

import java.util.Scanner;

public class view {
    Scanner scanner = new Scanner(System.in);
    private boolean loop = true;
    private String  key = " ";
    public void exit() {
        //这里我们使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
    public void Account(){
        account account = new account();
        account.Login();
    }

    public void mainMenu() {

        do {
            System.out.println("\n=============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 书 籍");
            System.out.println("\t\t\t2 查 找 书 籍");
            System.out.println("\t\t\t3 借 出 书 籍");
            System.out.println("\t\t\t4 换 回 书 籍");
            System.out.println("\t\t\t5 书 籍 列 表");
            System.out.println("\t\t\t6 账 号 管 理");
            System.out.println("\t\t\t7 退      出");
            System.out.print("请输入你的选择(1-7): ");
            key = scanner.next();
            switch (key) {

                case "6":
                    new account().Login();
                case "7":
                    exit();
                    break;
            }
        } while (loop);
    }
}
