public class circleWork8 {
    public static void main(String []args){
        int num = 1;
        double sum = 0;
        double temp_sum = 0;
        for (; num <=100; num++){

            sum = (sum + num);
            System.out.println(sum);
            temp_sum += sum;
        }
        System.out.println("sum = " + temp_sum);
    }
}
