import java.util.Scanner;
public class PuzzleMap {
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
        way way  = new way();
        way.move(move_a,mouse);

    }
}

// 寻找出迷宫的路径
// 找到返回真， 没有返回假
// i和j就是老鼠的位置， 初始化为1.1
// 因为是递归找路，那么0是可以走；1是障碍物；2可以走；3走过，但是是死路, 4是出口
// 如果找到 4[8][9]
class way{
    public boolean findWay(int[][]map, int i, int j){
        if (map [7][8] ==4){
            return true;
        } else {
            if (map[i][j]==0){

            } else return false;
        }
        return false;
    }



    public void move(String move_a, int mouse){
        if (Objects.equals(move_a, "w")){

        } else if (Objects.equals(move_a, "a")) {
            // 左
            System.out.println("b");
        } else if (Objects.equals(move_a, "d")) {
            // 右
            System.out.println("c");
        } else if (Objects.equals(move_a, "s")) {
            // 后
            System.out.println("d");
        } else System.out.println("Wrong move");
    }
}