public class if04 {
    public static void main(String[] args) {
        //������������int, �ж�����֮��, �Ƿ����ֱ�3�ֱ�5����
        int num1 = 45;
        int num2 = 15;
        int su = num1 +num2;
        if (su%3 == 0 && su%5 ==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
