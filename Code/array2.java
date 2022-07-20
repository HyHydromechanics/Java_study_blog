import java.util.Scanner;
public class array2 {
    public static void main (String[]args){
        //循环输入5个成绩, 保存到double数组, 并输出
        Scanner myScanner = new Scanner(System.in);
        double[] score = new double[5];
        for (int i = 0; i<5; i++){
            System.out.println("type the "+ (i+1)+ "'s value");
            score[i] = myScanner.nextDouble();
        }
        for (double v : score) {
            System.out.println(v);
        }
    }
}