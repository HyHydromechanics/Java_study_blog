public class MethodP2 {
    public static void main(String[] args) {
        ArrayShape arrayShape = new ArrayShape();
        arrayShape.sharpNumber(4,4, (char) 33);
    }
}

class ArrayShape{
    public void sharpNumber(int row, int column, char c){
        for (int i = 0; i< row; i++){
            for (int j = 0; j< column; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}