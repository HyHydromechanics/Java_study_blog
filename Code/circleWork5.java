public class circleWork5 {
    public static void main(String []args){
        int a = 1;
        for (int i = 0;a<=100;a++){
            if (a%5!=0){
                System.out.print(a+ " ");
                i++;
                if (i == 5){
                    i = 0;
                    System.out.println(" ");
                }
            }
        }
    }

}
