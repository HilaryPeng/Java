/**
 * 抽象类
 * 当多个类中出现相同的功能，但是功能主体不同，
 * 这是可以进行向上抽取。只是只抽取功能定义，而不抽取功能主体。
 *
 * 抽象： 看不懂。
 * 特点：
 * 1. 抽象方法一定定义在抽象类中，
 * 2.抽象方法和抽象类都必须被abstract关键字修饰。
 * 3.抽象类不可以用new创建对象，因为调用抽象方法没意义。
 * 4.抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。
 *  如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
 */

abstract class CommonStudent{
    abstract void study();
}
class BaseStudent extends CommonStudent{
    void study(){
        System.out.println("base study");
    }
}

class AdvStudent  extends CommonStudent{
    void study(){
        System.out.println("advanced study");
    }
}
class FinalDemo {
}
