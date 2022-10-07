import java.util.Scanner;
public class testGary {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("a"+num.length);
        Scanner scanner = new Scanner(System.in);
        int numFind = scanner.nextInt();

        for (int i = 0; i<num.length; i++){
            if (numFind == num[i]){
                if (i>6){
                    int temp = i+3;
                    System.out.println(i);
                    int outPut = (num.length-temp)*(-1);
                    System.out.println(num[outPut]);
                } else {
                    System.out.println(i);
                    System.out.println(num[i+3]);
                }
            }
        }
    }
}
