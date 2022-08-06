import java.util.Objects;
import java.util.Scanner;
public class PuzzleMapAuto {
    public static void main (String[]args){
        int [][] map = new int[9][10];
        for (int i = 0; i< 10; i++){
            map[0][i] = 1;
            map[8][i] = 1;
        }

        for (int i = 0; i<9; i++){
            map [i][0] = 1;
            map [i] [9] = 1;
        }
        map [3][1] = 1;
        map [3][2] = 1;
        map [7][8] = 4;
        map [1][1] = 5;
        // 至此，地图的设置完毕


        for (int i = 0; i< map.length; i++){
            for (int j = 0; j< map[i].length; j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
        Scanner myScanner = new Scanner(System.in);
        String move_a = myScanner.next();
        int mouse = 5;
        way1 way1  = new way1();
    }
}

// 寻找出迷宫的路径
// 找到返回真， 没有返回假
// i和j就是老鼠的位置， 初始化为1.1
// 因为是递归找路，那么0是可以走；1是障碍物；2可以走；3走过，但是是死路, 4是出口
// 如果找到 4[8][9]
class way1{
    public boolean findWay(int[][]map, int i, int j){
        if (map [7][8] ==4){
            return true;
        } else {
            if (map[i][j]==0){

            } else return false;
        }
        return false;
    }
}
