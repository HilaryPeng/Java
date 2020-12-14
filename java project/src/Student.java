class Student {
    String name ;
    int age;
    char sex;
    String address;
    public void study(){
        System.out.println("我正在学习");
    }
}
//编写学生的测试类
class StudentTest {
    public static void main(String[] args) {
        Student me = new Student();
        System.out.print(me.name + me.age + me.sex + me.address);
    }
}
