public class continue2 {
    public static void main(String[]args){
        int j = 0;
        label1:
        for(; j<4;j++){
            label2:
            for(int i = 0; i<10;i++){
                if (i==2){
                    continue;
                }
                System.out.println("i="+i);
            }
        }
    }
}
