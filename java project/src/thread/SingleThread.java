package thread;

/**
 * 单例设计模式
 * 饿汉式
 * 懒汉式
 */
//饿汉式
class Single{
    private static final Single s = new Single();
    private Single(){};// 不允许实例化
    public static Single getInstance(){
        return s;
    }
}

//懒汉式
//多线程访问可能出现线程安全问题
class Single2{
    private static Single2 s = null;
    private Single2(){};
    public static Single2 getInstance(){
        if(s==null){
            synchronized (Single2.class){
                if(s == null){
                    s = new Single2();
                }
            }
        }
        return s;
    }
}
public class SingleThread {
}
