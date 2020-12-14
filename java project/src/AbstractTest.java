/**
 * 开发系统时对员工进行建模，员工包含三个属性： 姓名 工号， 工资。 经理也是员工，出了含有员工的属性外。另有一个奖金属性。请使用
 * 继承思想设计员工类与经理类。要求类中提供必要的方法进行属性访问。
 *
 */

//employee 是基本类 所有公司的员工都从该类继承出其基本属性。
abstract class Employee {
    private String name;
    private String id;
    private double wages;
    Employee(String name, String id, double wages){
        this.name = name;
        this.id = id;
        this.wages = wages;
    }
    public abstract void work();
}

class Manager extends Employee {
    private int bonus;
    Manager(String name, String id, double wages, int bonus){
        super(name, id, wages);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("manager work");
    };
}

