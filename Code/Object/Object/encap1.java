package Object;
// 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
// 年龄, 必须在1-120, 年龄， 工资不能直接查看， name 的长度在2-6 字符之间
public class encap1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Harry");
        person.setAge(30);
        person.setSalary(2000.1);
        System.out.println(person.info());
    }
}

class Person{
    public String name;
    private double Salary;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=6){
            this.name = name;
        } else {
            System.out.println("error name");
            this.name = "worker";
        }

    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getAge() {
        if (age >=1 && age <= 120){
            this.age = age;
        } else {
            System.out.println("wrong age");
            this.age = 18;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String info(){
        return "information about name: " + name + " about age " + age + " sal "+ Salary;
    }
}
