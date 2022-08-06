import java.util.Scanner;

public class hanoTower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆盘的数量");
        int num = in.nextInt();
        hanoi(num, 'A', 'B', 'C');//起始柱、辅助柱、目标柱默认为A、B、C
    }

    //汉诺塔问题实现
    //a存放起始柱，b存放辅助柱、c存放目标柱
    public static void hanoi(int num, char a, char b, char c){
        if (num == 1) {
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);
        }else{
            hanoi(num - 1, a, c, b);//借助c把第 num 个以外的圆盘从a移动到b
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);//把第num个从a移动到c
            hanoi(num - 1, b, a, c);//借助a把第 num 个以外的圆盘从b移动到c
        }
    }

}


