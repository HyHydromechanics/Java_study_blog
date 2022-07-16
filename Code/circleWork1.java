public class circleWork1 {
    public static void main(String []args){
        double money = 100000;
        System.out.println("You have " + money +" now");
        int i = 0;
        while (true){
            if (money>50000){
                // money = money-money*0.05;
                money *= 0.95;
                i++;


            } else if (money >= 1000) {
                money = money -1000;
                i++;

            }
            else {
                System.out.println(i);
                System.out.println(money);
                break;
            }
        }
    }
}
