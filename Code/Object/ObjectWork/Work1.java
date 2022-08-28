package Object.ObjectWork;


// 定义一个person类，初始化person对象数组，有三个person对象，并按照age从大到小排列，使用冒泡排序
public class Work1 {
    public static void main(String[] args) {
        int personNum = 3;
        Person1 temp;
        int[] arr = new int[personNum];
        Person1[] persons = new Person1[personNum];
        persons[0] = new Person1("mary",30, 30);
        persons[1] = new Person1("Harry", 25,20);
        persons[2] = new Person1("Harry", 20,1);

        for (int i=0; i<personNum;i++){
            System.out.println(persons[i]);
        }


        for (int i = 0; i < personNum-1; i++) {
            for (int j = 0; j<personNum-1;j++){
                if(persons[j].getAge() > persons[j+1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
        System.out.println("======");
        for (int i = 0; i < personNum; i++) {
            System.out.println(persons[i]);
        }



    }
}


class Person1{
    private String name;
    private double sal;
    private int age;

    public Person1(String name, double sal, int age){
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", age=" + age +
                '}';
    }
}