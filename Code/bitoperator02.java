public class bitoperator02 {
    public static void main(String[] args) {
        int a = 1>>2; // // 1 = 00000000 00000000 00000000 00000001
        // 其本质就是把最后两位的有01和1扔出去, 再用符号位(前两位)来进行补全
        // 进行运算后: a = 00000000 00000000 00000000 00000000 = 0
        // 也就是说: 1/2/2

        int b = 1<<2; // 00000001 = 1
        // 本质就是1*2*2, 也就是说: 00000100
        System.out.print(a);
        System.out.print(b);

        System.out.print(2<<8); // 512 = 2 * 2^8
    }
}