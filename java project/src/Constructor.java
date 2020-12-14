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


