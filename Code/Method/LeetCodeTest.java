package Method;

public class LeetCodeTest {
    public static void main (String[]args){
        int x = 121;
        TestLeet testLeet = new TestLeet();
        testLeet.isPalindrome(121);

    }
}
class TestLeet{
    public void isPalindrome(int x) {
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
    }
}