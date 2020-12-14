### The first java program

```java
public class HelloWorld{
    public static void main(String[] args){
                System.out.print("Hello,This is my first java program");
        }
}
```

步骤：

1. 编写类
2. 编写main方法 也就是程序的入口
3. 编写方法即可

#### public 有没有的区别

1. 如果有public 保存文件名与类名应该一致，可以不写
2. 没有public则可以不一致 但是编译之后会生成对应类名的字节码文件
3. 一个类中的main是可有可无的 但是没有则不能运行
4. 一个源文件可以编写多个类 但是编译成功会自动生成对应类的个数

