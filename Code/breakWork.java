public class breakWork {
    public static void main(String[]args){
        int sum = 0;
        for (int i = 1; i<=100; i++){
            sum +=i;
            if (sum>20){
                System.out.println("i = "+i);
                break;
            }
        }
    }
}
