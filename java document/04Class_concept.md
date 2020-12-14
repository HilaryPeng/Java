### 面向对象

* 面向对象

  * 是基于面向过程的
  * 将功能封装进对象，强调具备了功能的对象

* 面向过程

  * 强调的是功能行为

* 类：对同一类事物的抽象的描述。 抽象： 不是具体的

  * 电脑类

* 对象：万物皆对象，也就是说对象是具体的实例

  * 我的电脑 

* 类与对象的关系

  * 抽象与具体的关系
  * 描述对象的特征 称为属性
  * 描述对象的行为应该叫做函数 

  将多个对象找到相同的属性和方法组合在一起，形成类。



### 编写类的步骤

first step: 编写类

[修饰符] class 类名 {

​	//类名首字母大写

}

second step: 编写属性

* [修饰符] 数据类型 属性名称[=值]；

* []可有可无
* 属性名称也是标示符。驼峰命名。
* 属性是有默认值的
  * 整数类型 int 0
  * 浮点类型 0.0
  * 字符类型 \u0000
  * 布尔类型 false
  * 引用类型 null

Third setp:编写方法

 	[修饰符] 返回类型 方法名称([参数列表]){

​			方法体}

* 方法必须编写在类中
* 



###  匿名对象的应用





### 封装一个类

```java
/**
 * private: 私有 私有只有在本类中有效
 * 一个事物当中有可能有N个属性，这些属性一般都会对应一个get一个set。避免了直接访问内部
 * 封装不是私有。  私有仅仅是封装的一种体现形式。
 * 之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句， 对访问的数据进行操作，提高代码的健壮性
 *	成员变量  局部变量 类变量
 *
 */
class Person {
    private int age;
//    void setAge(int age){
//        this.age = age;
//        System.out.println(age);
//    };
    public void setAge(int a ){
        age = a ;
    }
    public int getAge(){
        return age;
    }
    void speak(){
        System.out.println("age" + age);
    }
}

class PersonDemo{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.speak();
    }
}
```





### 构造函数

* 函数名与类名相同
* 不用定义返回值类型
* 不可以写Return 语句

作用： 给对象进行初始化

注意：

 	1. 默认构造函数的特点
 	2. 多个构造函数是以重载的形式存在的。

```java
/**
 * 构造函数一建立 就会调用与之对应的构造函数
 * 构造函数的作用，可以用于给对象进行初始化。
 * 构造函数的小细节：
 * 当一个类中没有定义一个构造函数时，系统会默认给该类加入一个空参数的构造函数
 * 构造函数和一般函数在写法上有不同
 * 在运行上有不同。
 * 构造函数是在对象一建立就运行，给对象初始化。
 * 而一般方法是对西那个调用才执行。是给对象添加对象具备的功能
 *
 * 一个对象建立，构造函数只运行一次，而函数可以被调用多次
 *
 * 什么时候定义构造函数？
 * 当分析事物时，该事物具备一些特性或者行为，那么将这些内容定义在构造函数中。
 */
class Constructor {
    {
        System.out.println("构造代码块"); //给对象进行初始化。 对象一建立就运行，而且优先于构造函数执行。
    }
    Constructor(){
        System.out.println("person run ");
    }
}

class InstancePerson{
    public static void main(String[] args) {
        Constructor a = new Constructor();
        new Constructor();
    }
}
```



#### 构造代码块

对象一建立就会运行，而且优先于构造函数执行。

和构造函数的区别：

 构造代码块是给所有对象进行统一初始化。

而构造函数是给对应的对象初始化。

构造代码块定义的是 不同对象共性的初始化内容

```java
/**
 * 构造函数一建立 就会调用与之对应的构造函数
 * 构造函数的作用，可以用于给对象进行初始化。
 * 构造函数的小细节：
 * 当一个类中没有定义一个构造函数时，系统会默认给该类加入一个空参数的构造函数
 * 构造函数和一般函数在写法上有不同
 * 在运行上有不同。
 * 构造函数是在对象一建立就运行，给对象初始化。
 * 而一般方法是对西那个调用才执行。是给对象添加对象具备的功能
 *
 * 一个对象建立，构造函数只运行一次，而函数可以被调用多次
 *
 * 什么时候定义构造函数？
 * 当分析事物时，该事物具备一些特性或者行为，那么将这些内容定义在构造函数中。
 */
class Constructor {
    {
        System.out.println("构造代码块"); //给对象进行初始化。 对象一建立就运行，而且优先于构造函数执行。
    }
    Constructor(){
        System.out.println("person run ");
    }
}

class InstancePerson{
    public static void main(String[] args) {
        Constructor a = new Constructor();
        new Constructor();
    }
}
```



### this关键字

this作用：

1. 用于构造函数之间的互相调用。
2. this语句只能写在构造函数的第一行。因为初始化先执行。