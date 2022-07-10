// 有问题
import java.util.Scanner;
public class Star2 {
    public static void main(String[] args) {
        //倒立金字塔
        int i, j, k, n = 0;
        int m = n*2;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入金字塔的层数：");
        n = input.nextInt();
        //第一层循环控制金字塔的层数
        for (i = 1; i <= n; i++) {
            //第二层循环控制每行的空格数
            for (j = 0; j <= i-1; j++) {
                System.out.print(" ");
            }
            //第二层循环控制每行的星星数
            for (k = 1; k <=m-i; k++) {
                System.out.print("*");

            }
            m--;
            System.out.print("\n");//输出完一层后换行
        }
    }
}
