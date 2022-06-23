# Java运算符

#### 运算符介绍
运算符是一种特殊的符号, 用于表示数据的运算, 赋值和表示等. 
1. [算数运算符](####算数运算符)
2. 赋值运算符
3. [关系运算符](####关系运算符(RelationalOperator))
4. [逻辑元素符](####逻辑运算符)
5. 位运算符
6. 三元运算符

#### 算数运算符
 - 介绍
   - 算数运算符是对数值类型的变量进行计算的, 在Java程序中使用的非常多.

|符号|运算|Example|结果|
|---|---|---|---|
|`+`|正号|`+7`|7|
|`-`|负号|`b=11;-b`|-11|
|`+`|加|`9+9`|18|
|`-`|减|`9-9`|0|
|`*`|乘|`7*8`|56|
|`/`|除|`9/9`|1|
|`%`|取模(取余)|`11%9`|2|
|`++`|自增(前): 先运算后取值</br>自增(后): 先取值后运算|`a=2; b=++a;`</br>`a=2; b=a++;`|`a=3;b=3`</br>`a=3;b=2`|
|`--`|自减(前): 先运算后取值</br>自减(后): 先取值后运算|`a=2; b=--a;`</br>`a=2; b=a--;`|`a=1;b=1`</br>`a=1;b=2`|
|`+`|字符串相加|`"aaa" + "bbb"`|`aaa bbb`|


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

#### 关系运算符(RelationalOperator)
- 介绍
  1. 关系运算符的结果都是boolean型号, 也就是说, 它只有两个类型, true和false
  2. 关系表达式经常用在if结构的条件中或者循环结果的条件中

|运算符|运算|范例|结果|
|---|---|---|---|
|`==`|相等于|`8==7`|false|
|`!=`|不等于|`8!=7`|true|
|`<`|小于|`8<7`|false|
|`>`|大于|`8>7`|true|
|`<=`|小于等于|`8<=7`|false|
|`>=`|大于等于|`8>=7`|true|
|`instanceof`|检查是否是类的对象|`"javastudy" instanceof String`|true|



> [!ATTENTION]
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

#### 逻辑运算符
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
|名称|语法|特点|
|---|---|---|
|`||`短路或|条件1`||`条件2|两个条件中只要有一个成立, 结果就是true, 否则为false|
|`|`逻辑或|条件1`|`条件2|只要有一个条件成立, 结果就是true|
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
|名称|语法|特点|
|---|---|---|
|`!`非(取反)|!条件|如果条件本身成立, 结果为false,否则为true|

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

该赋值运算符了
