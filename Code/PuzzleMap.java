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
        // 至此，地图的设置完毕

        for (int i = 0; i< map.length; i++){
            for (int j = 0; j< map[i].length; j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
