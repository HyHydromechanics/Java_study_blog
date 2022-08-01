public class bubbleSort {
    public static void main(String[] args){
        int temp = 0;
        int times = 4;
        int count_num = 1;
        int[] arr = {24,69,80,57,13};
        for (; times>0; times--, count_num++){
            for (int j = 0; j<times; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr [j];
                    arr [j] = arr [j+1];
                    arr [j+1] = temp;
                }
        }

            System.out.println("==Round "+count_num+"==");
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
