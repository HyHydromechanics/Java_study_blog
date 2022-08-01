public class ArrayTriangle {
    public static void main(String[] args){
        int [][] tri = new int[10][];
        int start = 1;
        // 遍历数组，赋值+开空间，给开头和结尾都赋值为1
        for(int i = 0; i < tri.length; i++) {
            tri[i] = new int[i + 1];
            for (int j = 0; j < tri[i].length; j++){
                if (j ==0 || j ==tri[i].length-1){
                    tri[i][j] = 1;
                } else {
                    tri[i][j] = tri [i-1][j-1]+tri[i-1][j];
                }
            }
        }


        // print结果
        for (int i = 0; i< tri.length;i++){
            for (int j = 0; j<tri[i].length; j++){
                System.out.print(tri[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
