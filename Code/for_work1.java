public class for_work1 {
    public static void main(String[]args) {
        int i = 1;
        int sum = 0;
        int count_num = 0;
        for (;i<=100;i++){
            if (i%9==0){
            System.out.print(i+" ");
            count_num++;
            sum += i;
        }
    }
    System.out.println("Count's number is: "+ count_num);
    System.out.println("Sum is: "+ sum);
    }
}
