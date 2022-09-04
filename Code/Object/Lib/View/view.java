package Lib.View;

import Lib.Utility.Utility;
import Lib.Account.account;

public class view {
    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public view() {
        this.key = key;
    }

    private boolean loop = true;
    private char key = ' ';
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
            key = Utility.readChar();
            switch (key) {

                case '6':
                    ;
                case '7':
                    exit();
                    break;
            }
        } while (loop);
    }
}
