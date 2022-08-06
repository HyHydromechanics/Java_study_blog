import java.awt.*;

public class Recursion1 {
    public static void main (String[]args){
        recursion1Test recursion1Test = new recursion1Test();
        recursion1Test.test(10);
        int res = recursion1Test.factorial(5);
        System.out.println(res+" a");
    }
}

class recursion1Test{
    public void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }


    public int factorial(int m){
        if (m==1){
            return m;
        } else {
            return factorial(m-1)*m;
        }

    }
}