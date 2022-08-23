package Object;

public class HashCode {
    public static void main(String[] args) {
        HCTest hcTest = new HCTest();
        HCTest hcTest1 = new HCTest();
        HCTest hcTest2 = hcTest1;
        System.out.println(hcTest1.hashCode());
        System.out.println(hcTest.hashCode());
        System.out.println(hcTest2.hashCode());
    }
}

class HCTest{

}