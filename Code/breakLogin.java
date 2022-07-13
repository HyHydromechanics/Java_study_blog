import java.util.Objects;
import java.util.Scanner;

public class breakLogin {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        String userName = "root";
        String passWord = "root";
        int login = 1;
        int register = 2;
        int chance = 3;
        System.out.println("What do you want? press 1 for login, press 2 for register");
        int choose = myScanner.nextInt();
        if (choose == register) {
            System.out.println("You've encounter in the register system");
            System.out.println("Now, you shall create a account:");
            System.out.println("Write your username");
            String userNameNew = myScanner.next();

            System.out.println("Write your password:");
            String passWordNew = myScanner.next();
            System.out.println("Write your password again to confirm");
            String passWord2 = myScanner.next();
            if (passWordNew.equals(passWord2)){
                do {
                    System.out.println("Back to login System...");
                    System.out.println("Username?");
                    String userNameAnswer = myScanner.next();

                    if (!Objects.equals(userNameAnswer, userNameNew)) {
                        System.out.println("User name incorrect");
                        chance--;
                        System.out.println("You still have " + chance + " times of chance");
                    } else {
                        System.out.println("Password?");
                        String passWordAnswer = myScanner.next();
                        if (!Objects.equals(passWordAnswer, passWordNew)) {
                            System.out.println("password incorrect");
                            chance--;
                            System.out.println("You still have " + chance + " times of chance");
                        } else {
                            System.out.println("Welcome, " + userNameNew);
                            break;
                        }
                    }
                } while (chance >= 1);
            }
            else {
                System.out.println("Password Wrong, program break");
            }
            // login
        } else if (choose == login){
            do {
                System.out.println("Username?");
                String userNameAnswer = myScanner.next();

                if (!Objects.equals(userNameAnswer, userName)) {
                    System.out.println("User name incorrect");
                    chance--;
                    System.out.println("You still have " + chance + " times of chance");
                } else {
                    System.out.println("Password?");
                    String passWordAnswer = myScanner.next();
                    if (!Objects.equals(passWordAnswer, passWord)) {
                        System.out.println("password incorrect");
                        chance--;
                        System.out.println("You still have " + chance + " times of chance");
                    } else {
                        System.out.println("Welcome, " + userName);
                        break;
                    }
                }
            } while (chance >= 1);

        }

    }
}
