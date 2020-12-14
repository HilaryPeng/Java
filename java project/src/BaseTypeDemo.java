/**
 * 有一个圆形和长方形。
 * 都可以获取面积，对于面积如果出现非法的数值，视为是获取面积出现了问题
 * 问题通过异常表示。
 *RuntimeException 直接中断程序。 表示不可处理
 * Exception 可处理的
 *
 *
 */

interface Shape{
    double getArea();

}
class NoValueException extends RuntimeException{
    NoValueException(String message){
        super(message);
    }
}
class Circle{
    private int radius;
    private static final double PI = 3.14;

    Circle(int radius){
        this.radius = radius;
    }
    public void getArea(){
        System.out.println(PI * radius);
    }
}
class Rec implements Shape{
    int x,y;
    Rec(int x ,int y){
        if(x<=0 || y<=0 ){
            throw new NoValueException("出现非法值");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x*y;
    }
}

class ExceptionTest1{
    public static void main(String[] args) {
            Rec r = new Rec(3,4);
            r.getArea();
    }
}