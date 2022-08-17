package Object;
// 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
// 年龄, 必须在1-120, 年龄， 工资不能直接查看， name 的长度在2-6 字符之间
public class encap1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Harry";

    }
}

class Person{
    public String name;
    private double Salary;
    private int age;

}
