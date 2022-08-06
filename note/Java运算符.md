# Java运算符

#### 运算符介绍

运算符是一种特殊的符号, 用于表示数据的运算, 赋值和表示等. 

1. [算数运算符](##算数运算符)
2. [赋值运算符](##赋值运算符)
3. [关系运算符](##关系运算符(RelationalOperator))
4. [逻辑元素符](##逻辑运算符)
5. [位运算符](##位运算)
6. [三元运算符](##三元运算符)

## 算数运算符

 - 介绍
    - 算数运算符是对数值类型的变量进行计算的, 在Java程序中使用的非常多.

| 符号 | 运算                                              | Example                         | 结果                    |
| ---- | ------------------------------------------------- | ------------------------------- | ----------------------- |
| `+`  | 正号                                              | `+7`                            | 7                       |
| `-`  | 负号                                              | `b=11;-b`                       | -11                     |
| `+`  | 加                                                | `9+9`                           | 18                      |
| `-`  | 减                                                | `9-9`                           | 0                       |
| `*`  | 乘                                                | `7*8`                           | 56                      |
| `/`  | 除                                                | `9/9`                           | 1                       |
| `%`  | 取模(取余)                                        | `11%9`                          | 2                       |
| `++` | 自增(前): 先运算后取值</br>自增(后): 先取值后运算 | `a=2; b=++a;`</br>`a=2; b=a++;` | `a=3;b=3`</br>`a=3;b=2` |
| `--` | 自减(前): 先运算后取值</br>自减(后): 先取值后运算 | `a=2; b=--a;`</br>`a=2; b=a--;` | `a=1;b=1`</br>`a=1;b=2` |
| `+`  | 字符串相加                                        | `"aaa" + "bbb"`                 | `aaa bbb`               |


#### 算数运算符举例

```java
public class ArithmeticOperator { 

	//编写一个main方法
	public static void main(String[] args) {
		// /使用
		System.out.println(10 / 4); //人算是2.5, java中是2, 详情见上一章
		System.out.println(10.0 / 4); //java是2.5
		double d = 10 / 4;//10/4=2.0, 但是先计算再赋值, 把2赋给double, 成2.0
		System.out.println(d);// 是2.0

		// % 取模 ,取余
		// 取模的本质: a % b = a - a / b * b
		
		System.out.println(10 % 3); //1


		// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(-10 % 3); // -1


        // 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(10 % -3); //1


        // -10 % -3 =  (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
		System.out.println(-10 % -3);//-1



		//++的使用
		// 当++在单独使用的时候, 那么前++和后++是完全一样的
		int i = 10;
		i++;//自增 等价于 i = i + 1; => i = 11
		++i;//自增 等价于 i = i + 1; => i = 12
		System.out.println("i=" + i);//12

		/*
		作为表达式使用
        前++：++i先自增后赋值
        后++：i++先赋值后自增
		 */
		int j = 8;
		int k = ++j; // 这样写等价于两个语句, 先自增j=j+1, 后赋值k=j
        // 答案为9, k和j都是9
		int k = j++; // 先执行k=j(先把j的值赋给k), 后面再自增.
        // 答案为9, 但是j为8
	}
}
```

#### 算术运算符实战

> [!NOTE]
> 注意事项: 
>
> 1. `System`, 不是 `system`, 大小写
> 2. 老问题... 分号忘记加


1. 59天放假, 问还有几个星期和几天

```java
public class work1 {
    public static void main(String[] args) {
        int dayleft = 59;
        int weekNumber = dayleft/7;
        int restDay = dayleft%7;
        System.out.print("weeksleft" + weekNumber);
        System.out.print("daysleft" + restDay);
    }
}
```

2. 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度

```java
public class work2{
    public static void main(String[] args) {
        float huaTemp = 1234.5F;
        float tempature = (huaTemp-100) * 5/9;

        System.out.println("huatemp is" + huaTemp);
        System.out.println("tempature is" + tempature);
    }
}
```

## 关系运算符(RelationalOperator)

- 介绍
    1. 关系运算符的结果都是boolean型号, 也就是说, 它只有两个类型, true和false
    2. 关系表达式经常用在if结构的条件中或者循环结果的条件中

| 运算符       | 运算               | 范例                            | 结果  |
| ------------ | ------------------ | ------------------------------- | ----- |
| `==`         | 相等于             | `8==7`                          | false |
| `!=`         | 不等于             | `8!=7`                          | true  |
| `<`          | 小于               | `8<7`                           | false |
| `>`          | 大于               | `8>7`                           | true  |
| `<=`         | 小于等于           | `8<=7`                          | false |
| `>=`         | 大于等于           | `8>=7`                          | true  |
| `instanceof` | 检查是否是类的对象 | `"javastudy" instanceof String` | true  |



> [!ATTENTION]
>
> 1. 关系运算符的结果都是boolean类型
> 2. 比较关系运算符的表达式, 我们称其为关系表达式, a>b
> 3. **比较关系符 `==` 不能写成 `=`**

***

- **案例演示**

```java
int a = 9;
int b = 8;
System.out.println(a > b); //T 
System.out.println(a >= b); //T
System.out.println(a <= b); //F
System.out.println(a < b); //F
System.out.println(a == b); //F
System.out.println(a != b); //T
boolean flag = a > b; //T
System.out.println("flag=" + flag);
```

## 逻辑运算符

 - **用于连接多个条件, 最终的结果也是一个Boolean值**

1. 短路与`&&`, 短路或`||`, 取反
2. 逻辑与`&`, 逻辑或`|`, 取反

|`a`|`b`|`a&b`|`a&&b`|`a|b`|`!a`|`a^b`|
|---|---|---|---|---|---|---|---|
|true|true|true|true|true|true|false|false|
|true|false|false|false|true|true|false|true|
|false|true|false|false|true|true|true|true|
|false|false|false|false|false|false|true|false|

逻辑运算的规则

1. `a&b`: `&`逻辑与: 当a和b同时为true, 则结果为true, 否则为false
2. `a&&b`: `&&`短路与: 当a和b同时为true, 则结果为true, 否则为false
3. `a|b`: `|`逻辑或: 当a和b一个为true, 结果就是true, 否则为false
4. `a||b`: `||`短路或: 当a和b有一个为true, 结果就是true, 否则为false
5. `!a`: 叫取反, 或者非运算. 当a为true的时候, 结果就是false; 当结果为false的时候, 结果就是true
6. `a^b`: 逻辑或与, 当a和b不同的时候, 结果就是true, 否则为false

##### `||`和`|`基本规则

| 名称       | 语法           | 特点                                                |
| ---------- | -------------- | --------------------------------------------------- |
| `||`短路或 | 条件1`||`条件2 | 两个条件中只要有一个成立, 结果就是true, 否则为false |
| `|`逻辑或  | 条件1`|`条件2  | 只要有一个条件成立, 结果就是true                    |

- **`||`和`|`的实例演示**
    - 首先是*短路或*, age大于20但是不小于30, 输出为true
    - *逻辑或*, age大于20但是不小于30, 输出仍旧为true

```java
int age = 50;
if(age > 20 || age < 30) {
	System.out.println("true");
}
//&逻辑或
if(age > 20 | age < 30) {
	System.out.println("ok200");
}
```

- 区别? 
    -  **短路或**: 如果第一个条件为true, 则第二个条件不会进行判断, 最终结果直接输出为true, _效率较高_
    -  **逻辑或**：不管第一个条件是否为true，第二个条件都要判断，_效率低_

**_对比代码:短路或_**
_原因?_
第二个条件不进行判断, 因此`||`后面的b++不会进行运算, 直接输出b=9

```java
int a = 4;
int b = 9;
if( a > 1 || ++b > 4) {
	System.out.println("true");
}
System.out.println("a=" + a + " b=" + b);
// 输出为a=4, b=9
```

**_对比代码:逻辑或_**
_原因?_
第二个条件在逻辑或下, 无论第一个怎么样, 在`|`的后面的b++会进行运算, 会输出10

```java
int a = 4;
int b = 9;
if( a > 1 | ++b > 4) {
	System.out.println("true");
}
System.out.println("a=" + a + " b=" + b);
// 输出为a=4, b=10
```

##### `!`取反 基本规则

| 名称        | 语法  | 特点                                     |
| ----------- | ----- | ---------------------------------------- |
| `!`非(取反) | !条件 | 如果条件本身成立, 结果为false,否则为true |

**_案例演示`!`取反_**

```java
//! 操作是取反 T->F  , F -> T
System.out.println(60 > 20); //T
System.out.println(!(60 > 20)); //F
```


**_案例演示`^`逻辑异或_**
_a为true,b为false, 二者不同, 所以为true_

```java
//a^b: 叫逻辑异或，当 a 和 b 不同时，则结果为true, 否则为false
boolean b = (10 > 1) ^ (3 > 5);
System.out.println("b=" + b);//T
```

## 赋值运算符

***

#### 介绍:

 - 赋值运算符就是把某个运算后的值, 赋给程序所指定的特定变量

#### 分类:

 - 基本赋值运算符 `=`

```java
int a = 10
```

- 复合赋值运算符
    - `+=`, `-=`, `*=`, `%=`, etc
    - `a += b;` [等价于 `a=a+b`]
    - `a -=b;` [等价于 `a = a-b;`]

#### 实例演示

```java
int n1 = 10;
n1 += 4;// n1 = n1 + 4;
System.out.println(n1); // 14, 因为上述的公式


int n2 = 10;
n2 /= 3;// n1 = n1 / 3; 答案为3, 没有小数
System.out.println(n2); // 3
```

```java
//复合赋值运算符会进行类型转换
byte b = 3;
b += 2; // 等价 b = (byte)(b + 2);
b++; // b = (byte)(b+1);
```

#### 赋值运算符的特点

1. 运算顺序从右往左: `int num = a+b+c`
2. 赋值运算符的左边只能说变量, 右边可以是表达是, 变量, 或者常量值</br> `int num = 20;`</br> `int num2 = 78*34-10;` </br> `int num3 = a;`
3. 赋值运算符等价于: </br> `a+=3;` 等价于 `a = a+3;` 以此类推, 运算符都是一样的
4. 复合赋值运算符会进行类型的转换:</br> `byte b=2;`</br>`b+=3;`</br>`b++;`

> [!NOTE]
> 复习的时候要是看到这里写不出来, 去看看note_hard

## 三元运算符

***

#### 基本语法:

 - `条件表达式 ? 表达式1 : 表达式2`
 - **运算规则:**
    - 如果条件表达式为true, 运算后的结果是表达式1;
    - 如果条件表达式为false, 运算后的结果是表达式2;

#### 案例演示:

```java
// 设a等于10; b等于99;
int result = a > b ? a++ : b--;
System.out.println("result=" + result); 
System.out.println("a=" + a); 
System.out.println("b=" + b);
// result=99, a=10, b=98;
```

- 解读: 
    1. a>b 为false
    2. 因此, 先返回了b的值, 后续再b--
    3. 返回的结果是99

> [!NOTE]
> 表达式1, 和表达式2 要为可以赋给接收变量的类型(或者额可以自动转换)
> 三元运算符可以转换成if else语句(其实这个更简单好懂一点)

 - 三元表达式: 

```java
int res a>b? a++ : --b;
```

 - if-else表达式:

```java
if (a>b) result = a++
else result = --b
```

 - 表达式细节

```java
int a = 3;
int b = 8;
int c = a>b?(int)1.1:(int)3.4; // 可以的, 强制转换数据类型
double d = a>b?a:b+3; // 可以的的, 满足数据自动转换类型表
// 详情看前面的自动数据转换和强制数据转换
```

#### 实战练习

- 实现三个数的最大值: `int n1 = 553;` `int n2 = 33;` `int n3 = 123;`

自己的思路梳理:

1. 分别排序: 先看n1 & n2 谁大, 谁大就谁和n3进行比较
2. 分类排序: compare n1 and n2, n2 and n3, n3 and n1(但是效率太满, 会占用大量内存)

```java
int n1 = 553;
int n2 = 33;
int n3 = 123;
int max1 = n1>n2?n1:n2;
int max_all = max1>n3?max1:n3;
System.out.println(max_all);
```

一遍过!
看看老师怎么写的 - 几乎一模一样

> [!ATTENTION]
> 后续有更好的办法, 效率更高, **排序**


```java
int max = (n1 > n2 ? n1 : n2) > n3 ? //
(n1 > n2 ? n1 : n2) : n3;
System.out.println("最大数=" + max);
```

![pic-computingRankTable](/Users/wangrundong/Documents/GitHub/Java_study_blog/note/pic/pic-computingRankTable.png)

***

# 键盘输入语句

 - 介绍:
    - 编程中, 需要接受用户输入的数据, 就可以使用键盘输入语句来获取. 
    - `Input.java`, 需要一个扫描器对象: `Sacanner`
 - 步骤：
    - 导入该类的所在包: `Java.util`
    - 创建该类对象(声明变量)
    - 调用功能


####　案例演示:

要求: 从控制台接受用户信息(姓名, 年龄, 薪水)

***

```java
import java.util.Scanner;
public class assign{
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Yourname?");
        String name = myScanner.next();
        System.out.println("Yourage?");
        int age = myScanner.nextInt();
        System.out.println("Yourmoney?");
        double sal = myScanner.nextDouble();
        System.out.println("Information:");
        System.out.println("Name="+name+"age="+age+"money="+sal);
    }
}
```

# 