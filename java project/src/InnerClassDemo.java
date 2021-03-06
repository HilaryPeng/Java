
class InnerClassDemo {
    public static void main(String[] args) {
        new Outer().method(7);
        InterTest.function().method();
    }
}

/**
 * 内部类定义在局部时
 * 1.不可以被成员修饰符修饰
 * 2.可以直接访问外部类中的成员，因为还持有外部类中的引用。但是不可以访问他所在的局部中的变量，只能访问被final修饰的局部变量。
 *
 * 匿名内部类：
 *  1.匿名内部类其实就是内部类的简写格式。
 *  2.定义匿名类的前提： 内部类必须是继承一个类或者实现接口。
 *  3.匿名内部类的格式： new 父类或者接口(){定义子类的内容}
 *  4.其实匿名内部类就是一个匿名子类对象。
 *  5.匿名内部类中的方法最好不要超过三个
 *
 *
 *
 */
class Outer{
    int x= 3;
    void method(final int a){
        final int y = 4;
        class Inner{
            void function(){
                System.out.println(Outer.this.x);
            }
        }
    }
}

interface InterDemo{
    void method();
}

class InterTest{
//    static class Text2 implements InterDemo{
//        public void method(){
//            System.out.println("32323");
//        }
//    };

    public static InterDemo function(){
        System.out.println("i am 静态内部类");

       return new InterDemo(){
           public void method(){System.out.println("32323");};

       };
    }

}