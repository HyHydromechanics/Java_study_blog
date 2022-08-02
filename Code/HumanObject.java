public class HumanObject {
    // 主方法
    public static void main (String[]args){
        Person1 person = new Person1();
        person.speak(); // 调用方法
        person.cal1();
        person.cal2(5);
        int returnRes = person.getSum(10,20);
        System.out.println(returnRes);
    }
}

class Person1{
    String name;
    int age;
    public void speak(){
        System.out.println("a");
    }
    public void cal1(){
        int res = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++){
            res++;
            sum += res;
        }
        System.out.println(sum);
    }
    public void cal2(int n){
        int res = 0;
        for (int i = 1; i<=n; i++){
            res +=i;
        }
        System.out.println(res);
    }
    public int getSum(int num1, int num2){
        return num1+num2;
    }
}
