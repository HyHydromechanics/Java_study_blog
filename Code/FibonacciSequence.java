public class FibonacciSequence {
    public static void main (String[]args){
        T t = new T();
        System.out.println(t.Fib(7));
    }
}
class T {
    public int Fib(int i) {
        if (i > 0) {
            if (i == 1 || i == 2) {
                return 1;
            } else {
                return Fib(i-1) + Fib(i-2);
            }
        }
        else System.out.println("bigger than -1");
        return i;
    }
}