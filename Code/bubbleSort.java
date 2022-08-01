public class bubbleSort {
    public static void main(String[] args){
        int temp = 0;
        int[] arr = {24,69,80,57,13};
        for (int j = 0; j<arr.length; j++){
            if (arr[j] > arr[j+1]){
                temp = arr [j];
                arr [j] = arr [j+1];
                arr [j+1] = temp;
            }
            System.out.println(arr[j]);
        }
    }
}
