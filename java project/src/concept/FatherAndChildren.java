package concept;



/**
 * 子父类出现后，类成员的特点。
 * super
 * 类中成员：
 * 1.变量
 *  如果子类中出现非私有的同名成员变量时，
 *  子类要访问本类中的变量，用this
 *  访问父类中的对象用super.
 * 2.函数
 *  当子类出现和父类中函数一摸一样的时候，子类对象调用该函数，会运行子函数的内容
 *  如同父类的函数被覆盖一样。
 *
 * 覆盖：
 *      a.子类覆盖父类，必须保证子类的权限大于等于父类权限，才可以覆盖，否则编译失败
 *      b.静态只能覆盖静态。
 * 重载： 只看同名函数的参数列表。
 * 覆盖： 子父类方法要一摸一样，包括权限等
 *
 * 3.构造函数
 * 在子类对象进行初始化时，父类的构造函数也会运行，
 * 那是以你为子类的构造函数默认第一样有一条隐式的语句super();
 * super() 会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行都是super();
 *
 * 为什么子类一定要访问父类中的构造函数？
 * 因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的。
 * 所以子类在对象初始化是，要先访问一下父类中的构造函数。
 * 如果要访问父类中制定的构造函数，可以通过手动定义super语句的方式来指定。
 *  * super语句一定定义在子类构造函数的第一行。
 *  * 子类的所有的构造函数，默认都会访问父类中空参数的构造函数。
 *  * 因为子类每一个构造函数内的第一行都有一句隐式的super();
 *  * 当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问的构造函数。
 *  * 当然： 子类中的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。子类中至少会有一个构造函数会访问父类中的构造函数。
 *  *
 */
class FatherAndChildren {
    int num  = 4;
}
class Children extends FatherAndChildren {
    int num = 5;
    void show(){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
class ChildrenDemo{
    public static void main(String[] args) {
        Children a = new Children();
        a.show();
        FatherAndChildren b = new FatherAndChildren();
        System.out.println(a.num + "" + b.num);
    }
}