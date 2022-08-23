package Object;

public class toString {
    public static void main(String[] args) {
        Monster monster = new Monster("wild one", "walk", 3000);
        System.out.println(monster.toString());// 16进制
        System.out.println(monster.hashCode());// 10进制

    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    // 重写toString方法，输出对象的属性
    // 快捷键command+N直接改成toString
    @Override
    public String toString() {//默认是对象的属性值输出
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}