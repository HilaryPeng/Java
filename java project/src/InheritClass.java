/**
 * 都有姓名和年龄 如何有关系
 */

//class InheritClass {
//    String name;
//    int age;
//    void study(){
//        System.out.println("我会学习");
//    }
//
//}
//
//class InheritClass2{
//    String name;
//    int age;
//    void work(){
//        System.out.println("good work");
//    }
//}

/**
 * 如何继承 用extends
 * 1.提高了代码的复用性
 * 2.让类于类之间产生了关系，有了这个关系，才有了多态的特性。

 *
 * attention: 千万不要为了获取其他类的功能，简化代码而继承。必须是类与类之间有所属关系才可以继承。
 *
 */
class CommonPerson{
    String name;
    int age;
    CommonPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class InheritClass extends CommonPerson{

    InheritClass(String name,int age){
        super(name, age);
    }
    void study(){
        System.out.print("我会学习");
    }
}

class Worker {
    public static void main(String[] args) {
        InheritClass student = new InheritClass("anpeng", 23);
        System.out.println(student.name + " " + student.age + " " );
        student.study();
    }
}