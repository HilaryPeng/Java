package thread;

/**
 * 买票 开启两个线程卖票
 * 可以看到出现线程安全的问题 通过同步代码块去解决这些问题
 * 所以要加上一个锁 synchronized
 * 加锁的前提是什么
 *  1.必须要有两个或者两个以上的线程
 *  2.必须是多个线程使用同一个锁
 *
 * 同步函数？ 将同步的代码封装为一个同步函数来进行解决。
 *
 * 同步函数使用的锁是this
 * 静态函数的锁是class对象 比如 Thread1.class;
 */
//import java.lang.Thread;

class Thread1 implements Runnable{
    static int number = 100;
    @Override
    public void run() {
//        synchronized(Thread1.class){
//            for (int i = 0; i< number ; number--){
//                System.out.println(Thread.currentThread().getName() + "---------"+ number);
//            }
//        }
        demo();
    }
    //同步函数
    static  void demo(){
        for (int i = 0; i< number ; number--){
            System.out.println(Thread.currentThread().getName() + "---------"+ number);
        }
    }
}
public class ThreadSafety {
    public static void main(String[] args) {
        Thread1 demo = new Thread1();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();

    }
}
