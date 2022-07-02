# 流程控制介绍:
1. 顺序控制
    - 介绍:
      > 程序从上到下逐行的执行, 中间没有任何判断和跳转
    - Java定义变量的时候采用的合法的**向前引用**. 如:
    - `int1 = 12, int num2 = num 1+2`
    - `int num2 = num1 +2; int num1 = 12` 错误
2. 分支控制 if-else 介绍
### 单分支基本语法:
      ```java
      if(条件表达式){
        执行代码块;
      }
      ```
      表达式为true的时候, 就会执行{}内的代码. 如果为false, 就不执行.

```java
import java.util.Scanner;
public class if01 {
    public static void main(String[] args) {
        // 编写一个程序, 判断人的年龄是否大于18岁
        // 思路分析: 
        // 1. 接受输入的年龄, 定义scanner对象
        // 2. 保存年龄到变量
        // 3. if判断, 并且输出
        Scanner myScanner = new Scanner(System.in);
        System.out.print("YourAge?");
        int age = myScanner.nextInt();
        if (age>18){
            System.out.print("Your age is larger than 18");
        }
        System.out.print("Continue...");
    }
}
```
### 双分支:
   - 基本语法: 
```java
if(条件表达式){
  执行代码块1;
}
else{
  执行代码块2;
}
```
 - 案例实战
```java
import java.util.Scanner;
public class if02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("YourAge?");
        int age = myScanner.nextInt();
        if (age>18){
            System.out.print("Your age is larger than 18");
        } else{
            System.out.print("OK");
        }
        System.out.print("Continue...");
    }
}
```
 - 练习题
1. 声明两个double型变量, 判断第一个大于10.0, 第二个小于20.0, print两数之和


```java
public class if03 {
    public static void main(String[] args) {
        
        double num1 = 20.0d;
        double num2 = 19.0d;
        if (num1 > 10.0){
            if (num2 < 20.0){
                System.out.print(num1+num2);
            } 
        } 
    }
}
```
老师思路: 
```java
public class if03 {
    public static void main(String[] args) {
        
        double num1 = 20.0d;
        double num2 = 19.0d;
        if (num1 > 10.0 && num2 < 20.0){
                System.out.print(num1+num2);
            } 
        } 
    }
}
```
2. 定义两个变量int, 判断两者之和, 是否能又被3又被5整除

 - 和老师一模一样
```java
public class if04 {
    public static void main(String[] args) {
        //定义两个变量int, 判断两者之和, 是否能又被3又被5整除
        int num1 = 45;
        int num2 = 15;
        int su = num1 +num2;
        if (su%3 == 0 && su%5 ==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
```

3. 判断一个年份是否是闰年, 年份能被4整除, 但不能被100整除; 能被400整除
```java
public class if05 {
    public static void main(String[] args) {
        int year = 2004;
        if (year%4==0 && year%100!=0){
            if (year%400==0){
        } System.out.print("yes");
            }
        }
    }
```

**or**

```java
public class if05 {
    public static void main(String[] args) {
        int year = 2004;
        if (year%4==0 && year%100!=0 || year%400==0){
        } System.out.print("yes");
            }
        }
```
### 多分支
 - 基本语法:
```java 
if (条件表达式){
  执行代码块1;
}
else if(条件代码块){
  执行代码块2;
}
else{
  执行代码块3;
}
```
> [!NOTE]
>  - 当条件表达式1成立的时候, 立即执行代码块1
>  - 如果表达式1不成立, 采取判断表达式2是否成立
>  - 如果表达式2成立, 就执行代码块
>  - 以此类推, 如果所有代码块都不成立, 就直接直接执行else的代码块