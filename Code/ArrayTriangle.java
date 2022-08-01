public class ArrayTriangle {
    public static void main(String[] args){
        int [][] tri = new int[9][];
        int start = 1;
        // 遍历数组，赋值+开空间，给开头和结尾都赋值为1
        for(int i = 0; i < tri.length; i++) {
            tri[i] = new int[i + 1];
            for (int j = 0; j < tri[i].length; j++){
                tri[i][0] = start;
                tri[i][(tri[i].length)-1] = start;
            }
        }
        
    }
}
