public class ArrayP1 {
    public static void main(String[]args){
        // 创建一个char类型的A-Z, 一共26个, 使用for循环访问所有元素并打印出来
        char[] letter = new char[26];
        char a = 97;
        for (int i = 0; i<26; i++, a++ ){
            letter[i] = a;
            System.out.print(letter[i]);
        }
        for (int j = 0; j< 26; j++){
            System.out.println(letter[j]);
        }
    }
}
