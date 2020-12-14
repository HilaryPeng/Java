package thread;

import java.util.concurrent.locks.*;

/**
 * jdk1.5之后加入了lock的方法 将隐式的线程操作变为显示的操作
 * condition 一个lock可以有多个condition 通过消费者生产者模型即可看出区别
 *
 *
 * current thread is not owner 表示最近的线程不是拥有者？
 */

class ProduceClass {
    private String name;
    public boolean flag = true;
    private Lock lock = new ReentrantLock();
    private Condition lockOne = lock.newCondition();
    private Condition lockTwo = lock.newCondition();
    public void setName(ProduceClass r){
        lock.lock();
        try{
            while (r.flag) {
                r.name = "张三";
                System.out.println("I have'd set name" + Thread.currentThread().getName() + "---------");
                r.flag = false;
                lockTwo.signal();
                try {
                    lockOne.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        } finally{
            lock.unlock();
        }
    }
    public synchronized void printName(ProduceClass r) {
        lock.lock();
        try{
            while (!r.flag) {
                System.out.println(name);
                r.flag = true;
                lockOne.signal();
                try {
                    lockTwo.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }
        }finally {
            lock.unlock();
        }

    }
//    public synchronized void setName(ProduceClass r) {
//        while (r.flag) {
//            r.name = "张三";
//            this.notifyAll();
//            System.out.println("I have'd set name" + Thread.currentThread().getName() + "---------");
//            r.flag = false;
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public synchronized void printName(ProduceClass r) {
//        while (!r.flag) {
//            this.notifyAll();
//            System.out.println(name);
//            r.flag = true;
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
}

class ProducerDemo implements Runnable{
    private ProduceClass r;
    ProducerDemo(ProduceClass r){
        this.r = r;
    }
    @Override
    public void run() {
        while(true){
            r.setName(r);
        }


    }
}

class ConsumerDemo implements Runnable{
    private ProduceClass r;
    ConsumerDemo(ProduceClass r){
        this.r = r;
    }
    @Override
    public void run() {
        while(true){
            r.printName(r);
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        ProduceClass r = new ProduceClass();
        new Thread(new ProducerDemo(r)).start();
        new Thread(new ProducerDemo(r)).start();
        new Thread(new ConsumerDemo(r)).start();
        new Thread(new ConsumerDemo(r)).start();
    }
}
