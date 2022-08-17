package Object;
    /*
     * 创建程序,在其中定义两个类：Account 和AccountTest 类体会Java 的封装性。
     * Account 类要求具有属性：姓名（长度为2 位3 位或4 位）、余额(必须>20)、
     * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
     * 通过setXxx 的方法给Account 的属性赋值。
     * 在AccountTest 中测试
     */
public class Account {
    private String name;
    private double money;
    private int [] password;
    private int errorValue;

    public Account() {
    }
    public Account(String name, double money, int[] password) {
        this.name = name;
        this.money = money;
        this.password = password;
        this.errorValue = errorValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length() <=6){
            this.name = name;
        } else {
            System.out.println("please re-make name");
            this.name = "You-know-who";
            errorValue++;
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money <= 20){
            System.out.println("You cannot make your money less");
            this.money = 0;
            errorValue++;
        } else {
            this.money = money;
        }
    }

    public int[] getPassword() {
        return password;
    }

    public void setPassword(int[] password) {
        if (password.length == 6){
            this.password = password;
        }
        else {
            System.out.println("Please re-make password");
            this.password = new int[]{0, 0, 0, 0, 0, 0};
            errorValue++;
        }
    }


    public int getErrorValue(int i) {
        return errorValue;
    }

    public void setErrorValue(int errorValue) {
        this.errorValue = errorValue;
    }

        public void show(){
        System.out.println("Name= "+name);
        if (errorValue>=1){
            System.out.println("You cannot see the rest of things");
        } else {
            System.out.println("You can");
        }

        // 这里是是否查看密码
    }

}