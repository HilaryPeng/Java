import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args){
                System.out.print("Hello,This is my first java program");
        }
}
class ExpectInputNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字");
        int num = input.nextInt();
        System.out.print("num = " + num);
    }
}