package thread;

/**
 * 写一个死锁程序～
 * 死锁 互相锁死  多线程中 同步块中 内部还有一个块 然后要互相的锁 却锁死了。
 */
class Person{
    static public int ticket = 200;
}
//first need two thread lock program
class ThreadDead1 implements Runnable{
    static public int ticket = 200;
    @Override
    public void run() {
        //while
        while(true){
            if(ticket > 0) {
                synchronized(ThreadDemo.class){
                    System.out.println(Thread.currentThread().getName() + "----------------" + ticket);
                    ticket --;
                }
            }
        }
    }
}

class ThreadDead2 implements Runnable{
    @Override
    public void run() {
        while(Person.ticket>0){
            System.out.println(Thread.currentThread().getName()+"----------------"+Person.ticket--);
        }
    }
}


public class DeadLockDemo {
    public static void main(String[] args) {
        ThreadDead1 t1 = new ThreadDead1();
        ThreadDead1 t2 = new ThreadDead1();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
