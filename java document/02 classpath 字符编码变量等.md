### classpath 

配置classpath

* 临时配置

  * 使用set命令完成临时配置classpath

    set classpath = 'path'

    set c lasspath可以查看

* 永久配置

在macos上面感觉就是配置一个环境变量来能够直接访问到某个文件 == 就是全局变量之类的吧



### 字符编码

按照某种格式某种规定将数据存在计算机中

常用字符编码

 * ASCII：

   | 字符 | 值   |
   | ---- | ---- |
   | a    | 97   |
   | b    | 98   |
   | A    | 65   |
   | o    | 48   |
   | ''   | 32   |

* iso8859-1 西欧语言编码，兼容ASCII

* GBK /GB2312 中文编码

* Unicode:统一全球所有国家的文字

  * utf-8 utf-16 utf-32
  * java源代码采用unicode编码

乱码 编码 解码



### 数据类型

java语言提供了八种基本类型，六种数据类型。一种字符类型，一种布尔型。

byte short init long char boolean float double

* 按照声明的位置
  * 1. 局部变量 在方法中生命的
    2. 成员变量 在类中声明的
* 按照数据类型分类
  * 基本数据类型
    * 整数类型：
      * 默认init 
      * ![image-20200322181352806](/Users/apeng/Library/Application Support/typora-user-images/image-20200322181352806.png)
      * 在java中，取值范围小的类型可以直接复制给取值范围大的类型，构成自动类型转换。
    * 浮点类型
      * float double
      * 默认double
      * ![image-20200322181914395](/Users/apeng/Library/Application Support/typora-user-images/image-20200322181914395.png)
    * 字符类型
      * 字符类型 一次只能存放一个，并且使用英文的单引号引起来
      * 一个汉子表示一个字符
      * 字符类型有取值范围的 最小为0 最大65535 
    * 布尔类型
      * 布尔类型占一个字节
  * 引用数据类型
    * 对象、数组都是引用数据类型。
    * 所有与引用类型默认值都是null.
    * 一个引用变量可以用来引用任何与之兼容的类型
  * Java常量
    * 使用final关键字来修饰常量。





和JS一样吧



### 变量的内存分析

内存中包含

* 栈 

  存放方法以及方法中的局部变量

* 堆

  存方法对象

* 方法区

  代码片段，常量池，静态属性。





### JAVA中的类型转换

数据类型转换必须满足以下几点：

1. 不能对boolean进行类型转换。
2. 不能把对象类型转换为不相关的类的对象。
3. 参考下面的第三条。

* 自动类型转换
  * 当取值范围小的类型赋给取值范围大的类型
* 强制类型转换
  * 当取值范围大的类型赋给取值范围小的类型时，必须进行强制类型转换，但是强制类型转换可能存在精度丢失



类型转换的六条规则

1. 基本类型除了布尔类型之外，剩余七种类型可以进行相互转换
2. 当取值范围小的类型赋给取值范围大的类型，构成自动类型转换，也叫做隐式类型转换。
3. 取值范围大的类型不能直接给取值范围小的类型赋值，必须进行强制类型转换也叫做显式类型转换，可能存在精度丢失
4. 当对byte short char类型赋值时口，如果没有超出该类型的取值范围可以直接赋值
5. 当对byte short char 类型进行混合运算时，则先转为init类型然后再进行计算
6. 当多种数据类型进行混合运算时，则选转为取值范围大的类型，然后再进行计算



所以我们平常一定要保持编码的规范，用什么 或者之后的类型是什么 一定要考虑好



### Java中的变量分类

1. 局部变量

   ```java
   public class LocalVariable {
       //local variable is exist on method
       public static void main(String[] args){
           String string = "it's a local variable";
           int number = 100;
           System.out.println(string + number);
       }
   }
   ```

2. 实例变量

   ```java
   public class InstanceVariable {
       //instance variable is exist on class.
       String name = "阿鹏";
       public void inputName(String name){
           System.out.println(name);
       }
   
       public static void main(String[] args) {
           InstanceVariable instanceName = new InstanceVariable();
           System.out.println(instanceName.name);
           instanceName.inputName("阿鹏");
       }
   }
   ```

3. 类变量

   ```java
   public class ClassVariable {
       //class variable also is a static variable;
       static String classVariable = "it's a class variable";
   
       public static void main(String[] args){
           System.out.println(classVariable);
       }
   }
   ```