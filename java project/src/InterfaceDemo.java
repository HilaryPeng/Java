/**
 * 接口: 初期理解，可以认为是一个特出的抽象类。
 * 当抽象类中的方法都是抽象的。那么该类可以通过接口的形式来表示。
 *
 * class用于定义类
 * interface 定义接口
 * 格式特点：
 *  接口中常见的定义：
 *      1.常量，抽象方法。
 *      2.接口中的成员都有固定修饰符。
 *          常量: public private
 *          方法: public abstract;
 *  接口中的成员都是public的。
 *
 *  接口不可以创建对象，因为有抽象方法。 需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例话。
 *  否则子类是一个抽象类。
 *
 *  接口可以被类多实现。接口可以支持多继承。
 *  接口的特点：
 *      接口是对外暴露的规则。
 *      接口是程序的功能扩展
 *      接口可以用来多实现
 *      类与接口之间是实现关系，而且类可以继承一个类的同时实现多个接口
 *      接口与接口之间可以有继承关系。
 */

interface Inter{
    public static final int Num = 3;
    public abstract void show();
}

interface  InterA {
    public abstract  void method();
}
class Test implements Inter,InterA{
    public void show(){
        System.out.println("I am");
    }
    public void method(){

    }
}
public class InterfaceDemo {
}
