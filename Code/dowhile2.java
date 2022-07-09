public class dowhile2 {
    public static void main(String[]args) {
        int i = 1;
        int sum = 0;
        do {
            System.out.println("number = "+ i);
            i++;
            sum += i;

        } while (i<=100);
        System.out.println("sum is = "+sum);
        
        int m = 1;
        do {
            if (m%5==0 && m%3!=0){
                System.out.println("Number_m = "+ m);
            }
            m++;
        }while (m<=100);
    }
    
}
