# Object类详解

## Object

```java
public class Object
```

Class `Object`是类`Object`结构的根。每个班都有`Object`作为超类。所有对象（包括数组）都实现了这个类的方法。

- 构造方法：

    ```java
    Object()
    ```
    
    ### 方法摘要

| Modifier and Type  | Method and Description|
|:-:|:--|
| `protected Object` | `clone()`创建并返回此对象的副本。                            |
| `boolean`          | `equals(Object obj)`指示一些其他对象是否等于此。             |
| `protected void`   | `finalize()`当垃圾收集确定不再有对该对象的引用时，垃圾收集器在对象上调用该对象。 |
| `类<?>`            | `getClass()`返回此 `Object`的运行时类。                      |
| `int`              | `hashCode()`返回对象的哈希码值。                             |
| `void`             | `notify()`唤醒正在等待对象监视器的单个线程。                 |
| `void`             | `notifyAll()`唤醒正在等待对象监视器的所有线程。              |
| `String`           | `toString()`返回对象的字符串表示形式。                       |
| `void`             | `wait()`导致当前线程等待，直到另一个线程调用该对象的 [`notify()`](../../java/lang/Object.html#notify--)方法或 [`notifyAll()`](../../java/lang/Object.html#notifyAll--)方法。 |
| `void`             | `wait(long timeout)`导致当前线程等待，直到另一个线程调用 [`notify()`](../../java/lang/Object.html#notify--)方法或该对象的 [`notifyAll()`](../../java/lang/Object.html#notifyAll--)方法，或者指定的时间已过。 |
| `void`             | `wait(long timeout, int nanos)`导致当前线程等待，直到另一个线程调用该对象的 [`notify()`](../../java/lang/Object.html#notify--)方法或 [`notifyAll()`](../../java/lang/Object.html#notifyAll--)方法，或者某些其他线程中断当前线程，或一定量的实时时间。 |

> **getClass**
>
> ```java
> public final 类<?> getClass()
> ```
>
> 返回此`Object`的运行时类。返回的`类`对象是被表示类的`static synchronized`方法锁定的对象。
>
> **实际结果的类型是`Class<? extends |X|>`其中`|X|`是静态类型上其表达的擦除`getClass`被调用。** 例如，在此代码片段中不需要转换：
>
> ```java
> Number n = 0;`
> `Class<? extends Number> c = n.getClass();
> ```
>
> - **结果**
>
>     表示 `类`对象的运行时类的Class对象。

## equals方法

- ==和equals的对比
    - ==是一个比较运算符
        - ==：既可以判断基本类型，又可以判断引用类型
        - ==：如果可以判断基本类型，判断的是值是否相等。比如`int a = 10; double b = 10.0;`
        - ==：如果判断引用类型，判断的是地址是否相等，也就是说判断是不是同一个对象（详见下面）
            - 再细说就是只要判断的不是基础数据类型而是数组或String，就会只判断地址相同
    - `equals`是Object类中的方法，只能判断引用类型
        - 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等，比如integer，String

![截屏2022-08-23 12.52.58](assets/截屏2022-08-23 12.52.58.png)

> `instanceof` 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。

JDK源码 - String.equals

```java
//Jdk的源码 String类的 equals方法
        //把Object的equals方法重写了,变成了比较两个字符串值是否相同
        public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;//返回true
        }
        if (anObject instanceof String) {//判断类型
            String anotherString = (String)anObject;//向下转型
            int n = value.length;
            if (n == anotherString.value.length) {//如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//然后一个一个的比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串的所有字符都相等，则返回true
            }
        }
        return false;//如果比较的不是字符串，则直接返回false
    }
```

JDK源码 - Object.equals

```java
        //即Object 的equals 方法默认就是比较对象地址是否相同
        //也就是判断两个对象是不是同一个对象.
	// Object类中的equals方法比较的是地址，注意==对于引用类型比较的是地址，对于基本数据类型比较的是值。
         public boolean equals(Object obj) {
            return (this == obj);
        }
```

JDK源码 - Integer.equals

```java
public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }// 不是判断地址，而是单纯的integar后的int值
```

```java
public class Equals01 {

    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型，判断值是否相等

        //equals 方法，源码怎么查看.
        //把光标放在equals方法，直接输入command+b
        //如果你使用不了. 自己配置. 即可使用.

        "hello".equals("abc");



        /*
        //从源码可以看到 Integer 也重写了Object的equals方法,
        //变成了判断两个值是否相同
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
```

## 判断两个对象内容是否相等

```java
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
```



