/**
 * 想要保证对象的唯一性。
 * 1.为了避免其他程序过多建立该类对象。先控制禁止其他程序建立该类对象。
 *  //将构造函数私有化
 * 2.为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象。
 * //   在类中创建一个本类 对象
 * 3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
 * //提供一个方法可以获取到该对象
 *
 *
 * 对于事物该怎么描述，还怎么描述，当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可。
 */

//饿汉式。
class Single {
    private Single(){}; //构造函数私有化 无法使用new
    private static Single s = new Single();
    public static Single getInstance(){
        return s;
    }
}

/**
 * 对象是方法被调用时，才初始化。 叫做对象的延时加载。称为： 懒汉式。
 * Single类进内存，对象还没有存在，只有调用了方法是，才建立对象。所以延时加载。
 * class Single{
 *    private static Single s = null;
 *    private  Single(){} //私有化
 *     public static Single getInstance(){
 *         if(s == null) {
 *             s = new Single();
 *         }
 *         return s;
 *     }
 */
class SingleDemo{
    public static void main(String[] args) {
        Single instance = Single.getInstance();
    }
}

/**
 * 当我需要私有化它的时候
 *
 */
class StudentDemo{
    private static int age;

    private StudentDemo(){};

    private static StudentDemo studentInstance = new StudentDemo();

    public static StudentDemo getInstance(){
        return studentInstance;
    }

    public static int getAge() {
        return studentInstance.age;
    }

    public static void setAge(int age){
        studentInstance.age = age;
    }

}

class StudentInstance{
    public static void main(String[] args) {
        StudentDemo a = StudentDemo.getInstance();
        int b = a.getAge();
        System.out.println(b);
        a.setAge(20);
        StudentDemo c = StudentDemo.getInstance();
        System.out.println(c.getAge());
        //都指向一个对象所以实现了单例模式
    }
}