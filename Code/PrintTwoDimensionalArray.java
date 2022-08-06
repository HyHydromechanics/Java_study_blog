public class PrintTwoDimensionalArray {
    public static void main (String[]args){
        int [][] arr = {{0,0,1},{1,1,1},{1,1,3}};
        printArray printArray = new printArray();
        printArray.print2Array(arr);
    }
}
class printArray{
    public void print2Array(int [][]arr){
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}