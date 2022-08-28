package ObjectWork;


// 定义一个person类，初始化person对象数组，有三个person对象，并按照age从大到小排列，使用冒泡排序
public class Work1 {
    public static void main(String[] args) {
        Person person = new Person();
        Person[0] = new Person();
    }
}


class Person{
    private String name;
    private double sal;
    private int age;
    public Person(String name,double sal, int age){
        this.name = name;
        this.sal = sal;
        this.age = age;
    }
}