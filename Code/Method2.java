public class Method2 {
    public static void main (String[]args){
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        Tools tools = new Tools();
        tools.printArray(map);

    }
}
class Tools {
    public void printArray(int[][]map){
        for (int i = 0; i< map.length; i++){
            for (int j = 0; j<map[i].length; j++){
                System.out.print(map[i][j]+" ");
            }
        }
    }
}