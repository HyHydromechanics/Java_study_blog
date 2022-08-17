package Object;

public class Account {
    /*
     * 创建程序,在其中定义两个类：Account 和AccountTest 类体会Java 的封装性。
     * Account 类要求具有属性：姓名（长度为2 位3 位或4 位）、余额(必须>20)、
     * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
     * 通过setXxx 的方法给Account 的属性赋值。
     * 在AccountTest 中测试
     */
    public static void main(String[] args) {
        AccountPerson accountPerson = new AccountPerson();
        accountPerson.name("Harry");
        accountPerson
    }
}

class AccountPerson{
    String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length() <=6){
            this.name = name;
        } else {
            System.out.println("please re-make name");
            this.name = "You-know-who";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money <= 20){
            System.out.println("You cannot make your money less");
            this.money = money;
        } else {
            this.money = money;
        }
    }

    public int[] getPassword() {
        return password;
    }

    public void setPassword(int[] password) {

        this.password = password;
    }

    private int [] password;
}