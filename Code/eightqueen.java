public class eightqueen {
    public static int MAXQUEEN = 8;   //皇后个数，也是棋盘行列数
    public static int[][] Board = new int[MAXQUEEN][MAXQUEEN];    //初始化棋盘
    private static int count;

    public static void startTest(Todo Todo, int row){
        //第0列开始
        for (int col = 0; col < MAXQUEEN; col++) {
            //检查位置是否可以放棋子
            if (Todo.checkBoard(MAXQUEEN, row, col, Board) == 1){
                if (row == MAXQUEEN - 1){
                    count++;
                }
                //递归，向下一行前进
                if (row < MAXQUEEN - 1){
                    startTest(Todo, ++row);
                    //回退上一个栈
                    --row;
                }
            }
            //重新赋值为0，进行下一次判断
            Board[row][col] = 0;
        }
    }

    public static void main(String[] args) {
        int row = 0;
        Todo Todo1 = new Todo();
        startTest(Todo1, row);

        System.out.println("摆放一共有" + count + "种");
    }
}

class Todo {
    //定义横竖斜方向上是否有棋子
    public static boolean flag = true;
    //检查棋盘
    public int checkBoard(int MAXQUEEN, int row, int col, int[][] Board){
        //行方向上
        for (int i = 0; i < MAXQUEEN; i++) {
            if (Board[row][i] == 1){
                return 0;
            }
        }
        //列方向上
        for (int i = 0; i < MAXQUEEN; i++) {
            if (Board[i][col] == 1){
                return 0;
            }
        }
        //右下方向上
        for (int i = row, j = col; i < MAXQUEEN && j < MAXQUEEN; i++, j++) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //左上方向上
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //左下方向上
        for (int i = row, j = col; i < MAXQUEEN && j >= 0; i++, j--) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        //右上方向上
        for (int i = row, j = col; i >= 0 && j < MAXQUEEN; i--, j++) {
            if (Board[i][j] == 1){
                return 0;
            }
        }
        if (flag) {
            //此点符合要求，可以下
            Board[row][col] = 1;
            //如果已经到最后一行，则打印棋盘
//            if (row == MAXQUEEN - 1){
//                printBoard(MAXQUEEN, Board);
//            }
            //可以放
            return 1;
        }
        return 0;
    }
    //打印棋盘
    public static void printBoard(int MAXQUEEN, int[][] Board){
        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++){
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
    }
}

