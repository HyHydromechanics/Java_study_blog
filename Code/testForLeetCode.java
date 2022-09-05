import java.util.Arrays;
import java.util.Scanner;

public class testForLeetCode {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int i = 3;
            int[] arr = {1, 3, 4};  //定义一个容量为3的数组arr
            while(true) {
                System.out.println("请输入三个数字"); //输入要添加的三个数字，分别定义为x1,x2,x3
                int x1 = input.nextInt();
                int x2 = input.nextInt();
                int x3 = input.nextInt();
                arr = Arrays.copyOf(arr, arr.length + i);//将数组arr扩容3，并在扩容的位置分别赋值x1,x2,x3
                arr[i] = x1;
                arr[i+1] = x2;
                arr[i+2] = x3;
                i = i + 3;
                System.out.println(Arrays.toString(arr));//打印新数组
            }
        }
}
