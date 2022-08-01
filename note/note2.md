# NOTE TWO

***

[toc]

***

# 类与对象(OOP)

- **定义**
    - 类是现实世界或思维世界中的实体在计算机中的反映，它将数据以及这些数据上的操作封装在一起。
    - 对象是具有类类型的变量。类和对象是面向对象编程技术中的最基本的概念
- 关系
    - 类是对象的抽象，而对象是类的具体实例。类是抽象的，不占用内存，而对象是具体的，占用存储空间。类是用于创建对象的蓝图，它是一个定义包括在特定类型的对象中的方法和变量的软件模板。
    - 类就是数据类型
    - 对象就是一个具体的实例
    - 属性是类的一个组成部分, 一般是数据类型, 也可以是可引用类型(对象, 数组)

```java

public class Object01 { 

	//编写一个main方法
	public static void main(String[] args) {

		/*
		张老太养了两只猫猫:一只名字叫小白,今年3岁,白色。 
		还有一只叫小花,今年100岁,花色。请编写一个程序，当用户输入小猫的名字时，
		就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
		则显示 张老太没有这只猫猫。
		 */
		//单独变量来解决 => 不利于数据的管理(你把一只猫的信息拆解)
		//第1只猫信息
		
		// String cat1Name = "小白";
		// int cat1Age = 3;
		// String cat1Color = "白色";

		// //第2只猫信息
		// String cat2Name = "小花";
		// int cat2Age = 100;
		// String cat2Color = "花色";

		//数组 ===>(1)数据类型体现不出来(2) 只能通过[下标]获取信息，造成变量名字和内容
		//         的对应关系不明确(3) 不能体现猫的行为
		//第1只猫信息
		
		// String[] cat1 = {"小白", "3", "白色"}; 
		// String[] cat2 = {"小花", "100", "花色"};


		//使用OOP面向对象解决
		//实例化一只猫[创建一只猫对象]
		//老韩解读
		//1. new Cat() 创建一只猫(猫对象)
		//2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1 
		//3. cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;
		//创建了第二只猫，并赋给 cat2
		//cat2 也是一个对象(猫对象)
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;

		//怎么访问对象的属性呢
		System.out.println("第1只猫信息" + cat1.name 
			+ " " + cat1.age + " " + cat1.color + " " + cat1.weight);

		System.out.println("第2只猫信息" + cat2.name 
			+ " " + cat2.age + " " + cat2.color + " " + cat2.weight);
	}
}


//使用面向对象的方式来解决养猫问题
//
//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	//属性/成员变量
	String name; //名字
	int age; //年龄
	String color; //颜色
	//double weight; //体重

	//行为
```

### **对象在内存中的存在方式**(重要)

![image-20220801183107838](./pic/image-20220801183107838.png)

### 属性的注意事项和细节说明

1. 属性大的定义语法同变量: `访问修饰符 属性类型 属性名`

​	public protected 默认 private

2. 属性的定义类型可以为任意类型, 包含基本类型或引用类型
3. 属性如果不赋值, 有默认值, 规则和数组是一样的; (int,short,byte,long,都是0; float,double都是0.0; char \u0000, boolean false, String null)

```java

public class PropertiesDetail { 

	//编写一个main方法
	public static void main(String[] args) {
		//创建Person对象
		//p1 是对象名(对象引用)
		//new Person() 创建的对象空间(数据) 才是真正的对象
		Person p1 = new Person();

		System.out.println("\n当前这个人的信息");
		System.out.println("age=" + p1.age + " name=" 
				+ p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass) ;
	}
}

class Person {
	//四个属性
	int age;
	String name;
	double sal;
	boolean isPass;
}
```

### 如何创建对象

1. 先声明再创建: 

```java
Cat cat;
cat = new Cat();
```

2. 直接创建

```java
Cat cat = newCat();
```

// 到对象分配机制了