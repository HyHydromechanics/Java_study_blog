public class MethodP1 {
    // 编写类AA ，有一个方法：判断一个数是奇数odd 还是偶数, 返回boolean
    public static void main(String[] args) {
        OddNumber1 oddNumber1 = new OddNumber1();

        if (oddNumber1.OddNum(1)){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
class OddNumber1{
    public boolean OddNum(int num){
        return num % 2 != 0 ? true: false;
    }

}
