/**
 * 多态
 * 1. 多态的体现
 *  父类的引用指向了自己的子类对象
 *  父类的引用也可以接收自己的子类的对象
 * 2. 多态的前提
 *     必须是类于类之间有关系，无非是extend implements
 *     通常还有一个前提 存在覆盖
 * 3. 多态的好处
 *      提高了程序的复用性。
 * 4. 多态的坏处
 *      提高了扩展性，但是只能使用父类的引用访问父类中的成员。
 * 5. 多态的应用
 *
 *
 * 6. 多态的出现在代码中的特点
 * 多态自始至终都是子类对象在做着变化。
 * 动物 ，猫，狗
 */
class Polymorphism {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.eat();

        Animal b = new Cat();//多态的表现， 一个对象可以有多个类的体现。
        //   类型提升，向上转型。
        // 向下转型。  强制将父类的引用 转为子类类型。
        Cat z = (Cat)b; // 强制类型转换
    }

    public static void function(Animal c){
        c.eat();
    }
}


abstract class Animal{
    abstract void eat();
}

class Cat extends  Animal{
    void eat(){
        System.out.println("I eat mouse");
    }
    public void catchMouse(){
        System.out.println("catch mouse");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("I eat meat");
    }
    public void Bone(){
        System.out.println("I like bone");
    }
}