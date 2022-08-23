package Object;

public class EqualEx {
    public static void main(String[] args) {
        Person11 person11 = new Person11("Harry", 18, 180, 70);
        Person11 person22 = new Person11("Harry", 18, 180, 70);
        System.out.println(person11.equals(person22));// 这样（不重写equals）return的是false，因为指向的地址不同
        // 重写equals后就return true
    }
}

class Person11{
    private String name;
    private int age;
    private int height;

    // 重写equals方法
    public boolean equals(Object obj){
        // 如果判断比较的两个对象是同一个对象，那就返回true
       if (this == obj){
           return true;
       } if (obj instanceof Person11){// 判断obj是不是Person11的实例
           // 向下转型，取得obj的属性
           Person11 person1 = (Person11) obj;
           return this.name.equals(person1.name) && this.age == person1.age && this.weight == person1.weight && this.height == person1.height;
        }
       return false;
       // 类型的判断
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person11(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    private int weight;
}