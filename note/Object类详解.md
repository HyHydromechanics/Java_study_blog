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
    - `equals`是Object类中的方法，只能判断引用类型
        - 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等，比如integer，String
        - 