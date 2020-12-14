package thread;
/**
 * join
 * t1.join 表示 他要抢夺CPU执行权。 然后main 等待t1结束才可以继续执行。
 * 放的顺序也有关系
 *
 * 当A线程执行到了B线程的.join方法时， 会等B线程先运行结束才会继续执行A线程。
 *
 *
 * 线程组
 *
 * 优先级 0-10
 * 10 MAX——PRIORITY
 * 5 MIN_PRIORITY
 *
 * yield(); 临时释放
 *
 */
class JoinDemoFunction implements Runnable{
    @Override
    public void run() {
        for(int x = 0;x<70;x++){
            System.out.println(Thread.currentThread().getName()+"----"+x);
            System.out.println(Thread.currentThread().toString()+"----"+x);
        }
    }
}



public class JoinDemo {
    public static void main(String[] args) throws Exception{
        JoinDemoFunction d = new JoinDemoFunction();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t1.join();
        t2.start();
        for(int x=0; x<80;x++){
            System.out.println("main----------"+x);
        }
        System.out.println("over");
    }
}
