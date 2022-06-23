# 类型转换

#### 基本数据类型转换

 - **类型转换**
   - 介绍: 当java程序在进行复制或者运算的时候, 精度小的类型会自动转换为精度大的数据类型
   - 数据类型按照精度(容量大小)排序为: 
   -

- **第一条**   
> [!NOTE] `char` => `int` => `long` => `float` => `double`


- **第二条**

> [!NOTE] `byte` => `short ` => `int` => `long` => `float` => `double`

- **案例分析**
```java
int a = 'c'; //没问题
double d = 80; //没问题
```
- **自动转换**

```java
int num = 'a'; // char -> int
double d1 = 80; // int -> double
```

- **自动类型转换注意和细节**
  1. 有多种数据混合运算的时候, 系统首先自动将所有数据转换成容量最大的那种数据类型, 然后再进行计算
  2. 当我们把精度大的数据类型赋值给精度小的数据类型的时候, 就会报错, 反之, 就会自动进行数据类型转换
  3. *(byte, short)和char之间不会发生自动转换*
  4. byte, short, char 可以计算, 在进行运算的时候会首先转换成int类型
  5. boolean不参与转换
  6. 自动提升原则: 表达式的结果的类型自动提升为操作数中最大的类型\


```java
//自动类型转换细节
public class AutoConvertDetail {
    public static void main(String[] args){
        //有多种数据混合运算的时候, 系统首先自动将所有数据转换成容量最大的那种数据类型, 然后再进行计算
        int n1 = 10;
        float d1 = n1 +1.1; // 错, 因为1.1为double类型, 所以应该是↓
        double d1 = n1+ 1.1 // 对
        float d1 = n1 +1.1F // 对, 因为F告诉编译器为float类型, float比int大, 所以自动转换为float进行计算
        //细节: 当把精度大的数据类型赋值给精度小的数据类型的时候, 就会报错, 反之, 就会自动进行数据类型转换
        int n2 = 1.1; // 错, double -> int
        //细节: (byte, short)和char之间不会发生自动转换
        // 当把一个具体的数赋给byte的时候, (1)先判断该数是否再byte范围内, 如果是, 就可以
        byte n3 = 10; //对, -128 ~ +127
        //
        int n1 = 1; 
        byte b2 = n2; // 错, int比byte大
        // 如果是变量赋值, 先判断变量类型, 此处为int型
        char c1 = b1; // 错, 原因就是因为byte不能自动转换
        //
        //byte, short, char 可以计算, 在进行运算的时候会首先转换成int类型
        //
        byte b2 = 1;
        short s1 = 1;
        short s2 = b2 + s1; // 错. b2 +s1 => int
        int s2 = b2 + s1; // 对
        //
        byte b3 = 1
        byte b4 = b2 + b3 // 错, 两者相加等于int
        // byte, short, char, 但凡两者运算就成int
        
        // 布尔类型不参与运算
        boolean pass = true;
        int num100 = pass; //boolean不参与运算
        byte b4 = 1; 
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.11;
        double num 333 = b4 +s3 + num200 +num300 // 因为double最大, 所以转换成double


    }
}
```

- **强制类型转换**
  - 自动类型转换的逆过程, 将容量大的数据类型转换成容量小的树蕨理想, 使用的时候需要加上强制转换符`()`, 但是可能会造成精度降低或者溢出, 需要小心注意
- **案例演示**


```java
int i = (int)1.9;
System.out.printIn(i);
\\ 结果为1, 造成精度损失

int j = 2000;
byte b1 = (byte)n2;
\\结果为-48, 造成数据溢出
```

- **强制类型转换细节说明**
  1. 当进行数据的大小从大 --> 小, 就需要用到强制转换
  2. 强转符号只针对于最近的操作数有效, 往往会使用小括号来提升优先级
  3. char类型可以报错int的常量值, 但是不能报错int的变量值, 需要强转
  4. byte和short类型在进行运算的时候, 当作int类型来处理
```java
int x = (int) 10*3.5 + 6*1.5; // 报错, double=>int不行
int x = (int) (10*3.5 + 6*1.5); // 小括号提升优先级, 成功编译. 44.0 -> 44
//
char c1 = 100;
int m =100;
char c2 = m; //错误
char c3 = (char)m; // 100对应的字符
```

#### 基本数据类型和String的转换
- **介绍:**
  - 在程序开发的时候, 我们经常需要把基本数据类型转成String类型, 或者把String类型转换成基本数据类型.
  - 基本数据类型转String类型语法: 基本类的值+ `""` 即可
```java
int n1 = 100;
String s1 = n1 + "";
```
  - String类型转基本数据类型, 通过包装类调用`parseXX`即可

```java
//使用基本数据类型对应的包装类的相应方法, 得到基本数据类型
//详解在对象和方法的时候
String s5 = "123";
int num1 = Integer.parseInt(s5);\\123
double num2 = Double.parseDouble(s5);\\123.0
float num3 = Float.parseFloat(s5);\\123.0
long num4 = Long.parseLong(s5);\\123
byte num5 = Byte.parseByte(s5);\\123
boolean b = Boolean.parseBoolean("True";)\\True
short num6 = Short.parseBoolean(s5);\\123
//怎么把字符串转成char? 含义是把字符串的第一个字符得到
// s5.charAt(0) 得到s5字符串的第一个字符 '1'
System.out.printIn(s5.charAt)(0)
```

- **注意事项**
  - 在将String转换成基本数据类型的时候, 要确保试String类型能够转成有效的数据, 比如我们可以把123转成一个整数, 但是不能不能把hello转成整数
  - 如果格式不正确, 就会抛出异常