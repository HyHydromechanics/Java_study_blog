import java.util.Scanner;
public class if01 {
    public static void main(String[] args) {
        // ��дһ������, �ж��˵������Ƿ����18��
        // ˼·����: 
        // 1. �������������, ����scanner����
        // 2. �������䵽����
        // 3. if�ж�, �������
        Scanner myScanner = new Scanner(System.in);
        System.out.print("YourAge?");
        int age = myScanner.nextInt();
        if (age>18){
            System.out.print("Your age is larger than 18");
        }
        System.out.print("Continue...");
    }
}