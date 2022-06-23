# **NOTE ONE**

***

# 主类结构

```java
public class hello {
    public static void main(String[] args) {
        String s1 = "hello"; //定义变量字符值
        String s2 = "Java";
        String s3 = "is sooooooo hard";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
```

- 开始需定义public 类(class)

[!Note]class 不等同于Class (严格区分大小写)

- public class 定义初始类, 继续class可继续定义新类
```java
public static void main 
```
- 定义类: main 
- 括号后面的内容进行内容定义(args)
- double(用处不明)
- System.out.printIn()和print一样, system在terminal输出print字符串

```java
public class BMI{
    public static void main(String[] args) {
        double height = 180;
        int weight = 65;
        double exponent = weight/(height*height);
        System.out.println(
                "您的身高是: " + height
        );
        System.out.println(
                "您的体重是: " + weight
        );
        System.out.println("您的BMI指数为");
        if (exponent < 18.5) {
            System.out.println("您体重太轻了");
        }
        if (exponent >= 18.5 && exponent <29.9) {
            System.out.println("体重过重");
        }
        if (exponent >= 29.9){
            System.out.println("肥胖");
        }
    }
}
```



# 基本数据类型

#### 	整数数据类型:

int	64位 (***默认类型***)

声明: 

```java
int a = 15;
int b = 30;
int c = a-b;
System.out.printIn(c);
```

- byte	8位
-   声明: 和int一样

```java
byte a, b, c;
```

- short	16位
  - 声明: 和int相同

```java
short a = 90;
```
- long	32位
  - 声明:  结尾加L 或者l 其他和int一样

```java
long number;
long number = 30L;
```
- float 单精度浮点类型
  - 声明: 小数后面+ F or f

```java
float f1 = 2.2132132f;
```

- Double  双精度浮点类型:
  - 声明: 默认都是double数据类型, 小数后面+ D 或者d.
  - 但是没有特定要求

```java
double f2 = 2.2323423;
double f3 = 2.3242234d;
```

#### 字符类型:

- char 型:
  - 用于储存单个字符, 占用16位内存空间.
  - 用单引号表示, ‘s’ 

***注意! 双引号就是字符串了***

```java
char a = 'b';
```

可以用unicode 来表示, 所以上面的也可以用

```java
char a = 98;
```

#### 转义字符:

- \123 八进制
- \u0052 四位16进制
- \\' 单引号
- \\\ 反斜杠

- \t 垂直制表符
- \r 回车
- \n 换行
- \b back space
- \f 换页





#### 布尔类型:

```java
boolean b;
boolean b1, b2;
boolean b True;
```

- 逻辑类型, 简称布尔型.
  - Boolean只有 True 或者是 False, 且不可以和整数类型转换.

***一般是在流程判断中做为条件变量以及条件判断 来定义布尔类型.***



# 变量与常量

#### 声明变量 

```java
int age = 33;
double number3 = 2.3333d;
char word = 'w';
```

**系统内存 ⇢ program区 ⇢  Data 区**

写程序的时候在系统内存, 执行时进入内存中的program区, 数据暂存数据(Data)区.


 
#### 声明常量(一直不会改变的量, 也叫 final 常量)

- 声明要指定数据类型 + final关键字
- final 数据类型 常量类型 [= 值]
- 常量一般全拼用大写字母, 如:

```java
final float PI = 3.1415926f;
```

#### 变量的有效范围

- 变量定义出后都暂存在内存中, 等程序执行到某个点, 变量会随内存释放, 就失去有效范围.

- 因此, 分出了“_成员变量_” 和 “_局部变量_”.

- 在变量名前加上 **static** 就是静态变量, 可以跨类和整个应用程序进行应用(类似python的function “def” )


#### _Java 数据类型_ (背过)
 - 基本数据类型
   - 数值型 (int)
     - 整数类型, 存放整数 (byte[1], short [2], int [4], long[8])
     - 浮点(小数)类型 (float[4], double[8])
   - 字符型 (char[2]), 存放单个字符 _'a'_
   - 布尔型 (boolean[1]), 存放 true, false
 - 引用数据类型
   - 类 (class)
   - 接口 (interface)
   - 数组 ([])

> [!NOTE]
> (_[]_ 内的是字节)
> 小数和整数完全不同, 如果选择较大的, 精度大的小数, 就用double.
> 布尔类型为判断类型, 真假
> _引用数据类型, 在面向对象编程中_
> `string` 是一个类, 不是数据类型

# Java代码规范

 ```pdf
./java/FormateOfJava.pdf
```

#### 整数类型的使用
 - Java的整数类型就是用来存放整数数值的
 - 整数的类型: 

|类型|占用储存空间|范围|
|----|----|----|
|byte[字节]|1字节|-128~127|
|short[短整型]|2字节|$-2^{15}$ ~ $2^{15}-1$ </br> $-32768 ~ 32767$|
|int[整形]|4字节|$-2^{31}$ ~ $2^{31}-1$ </br> -2147483647 ~ 2147483647|
|long[长整型]8字节|$-2^{63}$ ~ $2^{63} -1 $|

> [!NOTE]
> 具体为社么涉及到二进制, 四种整数类型

**案例演示:**
```java
byte n1 = 10; //这样分配的是一个字节
// n1数值指向内存, n1 = 10, 占用一个字节大小
short n2 = 10; //这样分配的是两个字节
```
> [!NOTE]
> 虽然数值一样, 但是由于所指数据类型不一样,所以所占空间不同
> 以此类推, 和上章的表格是一模一样的


#### 整数类型的细节
1. Java各整数类型有固定的范围和字段成都, 不受具体OS[操作系统]的影响 以保证java程序的可移植性.
2. Java的整数型常量(具体型)默认为int型(不指示数据类型的话), 声明long型的话必须后面加 'l' 或 'L'
3. java程序中木哦人为int型, 除非不足以表示大数, 才使用long
4. `bit`: 计算机中的**最小储存单位**; `byte`: 计算机中**基本储存单元**, `1byte = 8 bit`

> [!Note]
> **尽量选择小的数据类型, 保小不保大**
> 如果能确认, 那就小, 但是不确认(如回文报), 那就保险用long

**实例演示**

```java
public class Int Detail {
  public static void main(String[] args){
    int n1 = 1; // 4个字节
    int n2 = 1L; // 变成long型, 编译报错, 原因是数据类型不同
    long n3 = 1L // 正确long
  }
}
```

> [!NOTE] byte 和 bit 怎么在计算机内存储?
一个字节为基本单位, 一个字节内包含8个bit. 

```java
byte n1 = 3
short n2 = 3
```

|byte|short|
|---|---|
|00000011|0000000000000011|
|一个字节|两个字节|

_↑一个 '0/1' 就是一个bit_

> 思考: long n3 = 5 在内存中怎么画出来

#### 浮点类型 (float)
 - **基本介绍:**
   - Java的浮点类型可以表示一个小数, 比如 123.4, 7.8, 0.12等等

|类型|占用内存空间|范围|
|---|---|---|
|单精度 float|4字节|-3.403E38 ~ 3.403E38|
|双精度 double|8字节|-1.798E308 ~ 1.798E308|

> [!NOTE]
> 1. 关于浮点数在机器中存放形式的简单说明, 浮点数 = 符号位+指数位+尾数位
> 2. 尾数可能丢失 造成精度损失 (小数都是近似值)


 - **案例演示:**
```java
double n1 = 88.9
```

#### 浮点型使用细节

 - **浮点型使用细节**
   - 与整数型类似, Java浮点类型也有固定的范围和字段长度, 不受OS的影响 [float4个字节, double 8个字节]
   - Java的浮点型常量 (具体值) 默认为`double`型, 声明 `float`型常量, 后面必须加 'f' 或者 'F'
   - **浮点型有两种表现形式**:
     - **十进制**: 5.12, 521.0f, 0.521
     - **科学计数法**: 5.12e2[5.12e*10的二次方], 5.12e-2[5.12e*10负二次方]
   - 通常情况下, 应该使用double型, 因为更精确
     - `double num9 = 2.1234567851;` 输出结果为原数
     - `float num10 = 2.1234567851F;` 输出结果为2.1234567, 保留了7位小数

**案例演示**
```java
float num1 = 1.1; //报错, 因为float为4字节, 而默认为double
float num2 = 1.1F; // 这是正确的
double num3 = 1.1; //这也是正确的
double  num4 = 1.1F; // 可以, 把4字节塞进8字节
//十进制
double num5 = .123; //等价0.123
//科学计数法
double num6 = 5.12e-2; //0.0512
```

**陷阱**
```java
double num11 = 2.7; //输出为2.7
double num12 = 8.1 / 3; // 输出为接近2.7的一个小数, 而不是2.7
```
> [!ATTENTION]
> 当我们对运算结果是小数的进行相等判断时, 要小心.
> **应该是以两个数的差值的绝对值, 在某个精度范围类判断**
> 如果是直接查询出的小数或直接赋值, 那可以判断相等

```java
if(num11 == num 12){
  System.out.printIn("equal")
};
//结果不输出
//正确写法: 可以通过Java的API来进行判断
if (Math.abs(num11 - num12) < 0.00001 ){
  System.out.printIn("equal")
};
// 差值非常小, 到所规定的规定精度, 就认为相等
```

#### 字符类型(char)

**字符类型可以表示单个字符, 字符类型为char, 占用内存两个字节, 多个字符用string**

```java
char c1 = 97; //字符类型可以直接存放一个数字, 97的对应就是a
char c2 = '\t'; // 两个合起来就是一个转义字符
char c3 = '啊啊啊'
char c4 = 'a'
```

字符类型可以直接存放, 根源是对应不同的数字.
也就是说, 如果char直接打数字, 就会输出对应97的字符

#### 字符类型使用细节
1. 字符常量是使用 `('')`, 必须使用单引号, 双引号就是字符串了
2. Java中还允许使用转义字符 `\` 来将其后面的字符转变为特殊字符型常量, 例如: `char c3 = '\n';`
3. Java中, 它的本质是一个整数, 输出时所对应的是unicode码所对应的数字

```java
public class CharDetail{
  public static void main(String[]args){
    char c1 = 97
    System.out.printIn(c1); //输出为a

    char c2 = 'a'
    System.out.printIn((int)c2); //输出为97
  }
}
```

4. 可以给 `char` 赋一个整数, 输出时就会按照对应的unicode字符输出
5. `char` 类型是可以进行运算的, 因为其本质是数字

```java 
system.out.printIn('a'+10) // 输出为107
```

#### 字符类型的本质

1. 字符型存储到计算机中, 需要将字符对应发码值找出, 
  - 比如a => 97 => 转成二进制(110 0001) => 进行存储
  - 读取: 二进制(110 0001) => 97 => a
2. 字符编码表
   1. ASCII: 一个字节表示, 一个128个字节
   2. Unicode: Unicode无论字母汉字都是两个字节
   3. UTF-8: 大小可变, 字母一个字节, 汉字3个字节
   4. GBK: 表示汉字, 范围广, 字母一个, 汉字2个
   5. Big5: 繁体中文

#### 布尔类型: Boolean

1. 布尔类型只允许取值true或false, 无null
2. 只占一个字节
3. 适用于逻辑运算, 一般用于程序流程控制
    * if条件控制语句
    * while循环控制
    * do-while循环控制
    * for循环控制
4. 不可以用0或者非0的整数代替false和true, 没有其他的值

**案例演示**

```java
//前面就还是那些...
boolean passExam = true;{
  if (passExam == true) {
  System.out.printIn("1")
  } else {
    system.out.printIn("2")
  }
}
```

