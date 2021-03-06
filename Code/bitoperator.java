public class bitoperator {
    public static void main(String[] args) {
        System.out.print(2&3);
        // 1. 首先得到2的补码 => 2的原码为 00000000 00000000 00000000 00000010
        // 因为int存储了4个字节, 所有前面有这么多的0
        //  由此,得到补码: 00000000 00000000 00000000 00000010
        //  因为2是正数, 所以它的原码, 补码, 反码都一样
        // 2. 3的原码: 00000000 00000000 00000000 00000011
        //  同理易证: 3的补码也是00000000 00000000 00000000 00000011
        // 3. 按位与&: 00000000 00000000 00000000 00000010
        //             00000000 00000000 00000000 00000011
        //           = 00000000 00000000 00000000 00000010
        //             因为运算出的数正好是个整数, 运算后的原码也就就是结果

        System.out.print(~-2);// 得数为1
        // 先得到 -2的原码: 10000000 00000000 00000000 00000010
        // 第一位负号位
        // 2. 因为负数的补码是反码+1, 所以先得到反码再说
        // -2反码 = 11111111 11111111 11111111 11111101
        // 3. -2 的补码 = 反码+1
        // 也就是说等于: 11111111 11111111 11111111 11111110
        // ~-2操纵: 00000000 00000000 00000000 000000001这是运算后发补码
        // 运算后因为是整数, 所以答案就是00000000 00000000 00000000 000000001

        System.out.print(~2);
        // 得到2 的补码: 00000000 00000000 00000000 00000010
        // 按位取反: 11111111 11111111 11111111 11111101
        // 运算后看原码: 11111111 11111111 11111111 11111100(也就是-1)
        // 运算后的原码: 10000000 00000000 00000000 00000011 = -3

        System.out.print(2|3);
        // 得到2的补码: 00000000 00000000 00000000 00000010
        // 得到3的补码: 00000000 00000000 00000000 00000011
        // 按位或: 00000000 00000000 00000000 00000010
        //         00000000 00000000 00000000 00000011
        //         00000000 00000000 00000000 00000011 

        System.out.print(2^3);
        // 得到2的补码: 00000000 00000000 00000000 00000010
        // 得到3的补码: 00000000 00000000 00000000 00000011
        // 按位异或:    00000000 00000000 00000000 00000001 = 1
    }
    
}