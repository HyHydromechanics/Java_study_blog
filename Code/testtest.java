
public class testtest {

    //编写一个main方法
    public static void main(String[] args) {
        //创建Person对象
        //p1 是对象名(对象引用)
        //new Person11() 创建的对象空间(数据) 才是真正的对象
        p1 p1 = new p1();

        System.out.println("\n当前这个人的信息");
        System.out.println("age=" + p1.age + " name="
                + p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass) ;
    }
}

class p1 {
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}