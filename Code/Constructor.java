public class Constructor {
    public static void main(String[]args){
        // new 对象的时候直接通过构造器指定名字和年龄
        PersonConstructor personConstructor = new PersonConstructor("Harry", 18);
        System.out.println(personConstructor.age + personConstructor.name);
    }
}

class PersonConstructor{
    String name;
    int age;
    public PersonConstructor(String pName, int pAge){
        name = pName;
        age = pAge;
        System.out.println("The PersonConstructor is used");
    }
}