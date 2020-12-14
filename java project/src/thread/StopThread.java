package thread;

/**
 * stop 方法已经过时
 * 如何停止线程。
 * 线程的结束一般都是run方法结束。
 * 开启多线程运行代码通常是循环结构。
 * 所以一般结束循环可以结束线程 但是有一个问题 在线程wait的时候 也就是进入了冻结状态 无法继续往下走进行判断。所以线程就不会结束。
 *
 *
 * interrupt;
 * 将处于冻结的线程强制的恢复到正常的运行状态
 *  当没有指定的方式让冻结的线程恢复到运行的状态时，这时需要对冻结状态清除。
 *  强制让线程恢复到运行状态中来，这样就可以操作标记让线程结束。
 *
 *
 * 什么是守护线程？？
 * 线程可以是守护线程  当主线程结束时 守护线程也应该结束
 *
 */
class StopThreadDemo implements Runnable{
    private boolean flag = true;
    @Override
    public synchronized void run() {
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
//                e.printStackTrace();
                System.out.println(Thread.currentThread().getName()+"Exception");
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+"-------run");
        }
    }
    public void changeFlag(){
        flag = false;
    }
}


public class StopThread {
    public static void main(String[] args) {
        StopThreadDemo st = new StopThreadDemo();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        int num = 0;
        while(true){
//            System.out.println(num);
            if(num++ == 60){
//                st.changeFlag();
//                t1.interrupt();
//                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("over");
    }
}
