/**
 * 通过输出来了解对象初始化的过程。
 * 初始化的时候就会去堆内存中开辟空间。
 * 静态属性初始化 => 代码块初始化 => 赋值
 */
class InitObject {
    private String name;
    private int age;
    private static String country = "cn";
    InitObject(String name, int age){
        this.name = name;
        this.age = age;
    }
    //代码块
    {
        System.out.println(name + "" + age);
    }


    public void setName(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println(this.name + "" + this.age);
    }

    public static void showCountry(){
        System.out.println("country =" + country);
    }
}

/**
 * InitObject instance = new InitObject("Jame", 10); 都做了什么
 * 1.因为new 用到了InitObject 类 所以要先找到InitObject.class文件并加载到内存中
 * 2.执行类中有static 代码块，如果有的话，给InitObject类进行初始化
 * 3.在堆内存中开辟空间，分配内存地址
 * 4.在堆内存中建立对象的特有属性，并进行默认初始化
 * 5.对属性进行显示初始化
 * 6.对对象进行代码块初始化
 * 7.对对象进行对应的构造函数初始化
 * 8.将内存地址赋给栈内存中的p变量。
 */
class ObjectInitInstance{
    public static void main(String[] args) {
        InitObject instance = new InitObject("Jame", 10);
        //
    }
}
