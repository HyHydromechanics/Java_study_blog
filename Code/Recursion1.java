import java.awt.*;

public class Recursion1 {
    public static void main (String[]args){
        recursion1Test recursion1Test = new recursion1Test();
        recursion1Test.test(10);
    }
}

class recursion1Test{
    public void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
}