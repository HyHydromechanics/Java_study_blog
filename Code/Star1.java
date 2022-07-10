import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        //正立金字塔
        int i, j, k, n;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入金字塔的层数：");
        n = input.nextInt();
        //第一层循环控制金字塔的层数
        for (i = 1; i <= n; i++) {
            //第二层循环控制每行的空格数
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //第二层循环控制每行的星星数
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.print("\n");//输出完一层后换行
        }
    }
}
