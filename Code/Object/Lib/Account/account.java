package Lib.Account;

import Lib.Utility.Utility;

import java.util.Scanner;

public class account {

    private String password;
    private String username;
    private String usernameCheck;
    private String password2;
    private String rootPassword = "root";
    private String rootUsername = "root";
    Utility utility = new Utility();
    Scanner scanner = new Scanner(System.in);
    boolean loopPassword = true;
    public void Login(){
        System.out.println("====登陆账号====");
        if (username == null){
            System.out.println("You do not have a account yet, pls register a account first");
            this.Reg();
        } else {
            System.out.println("账号名： ");
            usernameCheck = scanner.next();
            System.out.println("密码： ");
            password2 = scanner.next();
            if (usernameCheck.equals(username) || password2.equals(password)){
                System.out.println("====登陆完成====");
            }
        }
    }
    public void Reg(){
        System.out.println("====注册账号====");
        System.out.println("请输入用户名");
        username = scanner.next();
        System.out.println("输入密码");
        password = scanner.next();
        System.out.println("请再次输入密码来确认");
        password2 = scanner.next();
        do {
            if (password2.equals(password)) {
                System.out.println("返回登陆界面");
                loopPassword = false;
                System.out.println("====注册成功====");
                this.Login();

            } else {
                System.out.println("输入密码错误，请重置密码");
                System.out.println("输入密码");
                password = scanner.next();
                System.out.println("请再次输入密码来确认");
                password2 = null;
                password2 = scanner.next();
                loopPassword = true;
            }
        } while (loopPassword);


    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRootPassword() {
        return rootPassword;
    }

    public void setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
    }

    public String getRootUsername() {
        return rootUsername;
    }

    public void setRootUsername(String rootUsername) {
        this.rootUsername = rootUsername;
    }

    public account(String password, String username, String rootPassword, String rootUsername) {
        this.password = password;
        this.username = username;
        this.rootPassword = rootPassword;
        this.rootUsername = rootUsername;
    }
}
