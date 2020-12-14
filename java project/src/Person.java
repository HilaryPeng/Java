/**
 * private: 私有 私有只有在本类中有效
 * 一个事物当中有可能有N个属性，这些属性一般都会对应一个get一个set。保护了
 * 封装不是私有。  私有仅仅是封装的一种体现形式。
 * 之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句， 对访问的数据进行操作，提高代码的健壮性
 *
 * 实例变量和类变量的区别就是 是否有修饰符 。具体区别 要在实例化的时候进行区别了。
 */
class Person {
    private int age; //类变量
//    void setAge(int age){
//        this.age = age;
//        System.out.println(age);
//    };
    int height; //实例变量
    public void setAge(int a ){
        age = a ;
    }
    public int getAge(){
        return age;
    }
    void speak(){
        // int b ; // 局部变量
        System.out.println("age" + age);
    }
}

class PersonDemo{
    public static void main(String[] args) {
        int a; // 实例变量
        Person p = new Person();
        p.setAge(20);
        p.speak();
    }
}
