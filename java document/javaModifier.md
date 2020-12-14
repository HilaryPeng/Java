### java 修饰符

* 访问修饰符

  * default
    * 在同一包内可见，不使用任何修饰符。常用鱼
  * private
  * public
  * protected
  * ![image-20200325174422806](/Users/apeng/Library/Application Support/typora-user-images/image-20200325174422806.png)

* 非访问修饰符

  * static

  * final

  * abstract 

  * Synchronized  volatile

    

访问控制和继承：

* 父类中声明为public的方法在子类中也必须为public。
* 父类中声明为protected的方法在子类中要么声明为protected 要么声明为public.不能声明为private,
* 父类中声明为 private 的方法，不能够被继承。