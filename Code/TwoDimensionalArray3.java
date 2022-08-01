public class TwoDimensionalArray3 {
    public static void main(String[] args){
        int temp;
        int temp_sum = 0;
        int [][] arr = {{0,0,0,0,0,0},{0, 0, 1, 0, 0, 0},{0, 2, 0, 3, 0, 0},{0,0,0,0,0,0}};
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                temp = arr[i][j];
                temp_sum = temp+ temp_sum;
            }
        }
        System.out.println(temp_sum);
    }
}
