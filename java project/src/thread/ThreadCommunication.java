package thread;
//import javax.mail.search.IntegerComparisonTerm;
//import javax.mail.search.IntegerComparisonTerm;

/**
 * 线程中的通信: 多个线程在操作同一个资源但是操作的动作不同
 * 举例 一个水池 一个管道进水 一个管道出水 两个线程同时进行。
 * input water  outer
 *
 * 这个时候当输入r.name 的时候如果线程没有被CPU执行 而去执行了其他任务 就有可能出现 r.name与r.age不匹配的情况
 * 使用同步代码块 同一个锁来解决他
 *
 * 等待唤醒机制 输入一个 打印一个
 *
 *
 */

class Res {
    private String name;
    private String sex;
    boolean flag  = false;
    public synchronized void set(String name, String sex){
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public synchronized void printFunction(){
        if(!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+"------------"+sex);
        flag = false;
        this.notify();
    }
}
//class SynchronizedBlock{
//    public static synchronized void synchronizedFunction(Res r, boolean flag){
//        if(r.flag){
//            try {
//                r.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public static synchronized void synchronizedNotice(Res r, boolean flag){
//        r.flag = flag;
//        r.notify();
//    }
//}
class Input implements Runnable{
//    Res r = new Res();
    private Res r;
    Input(Res r){
       this.r = r;
    }
    @Override
    public void run() {
       boolean x = true;
       while(true){
//           synchronized (r){
//               SynchronizedBlock.synchronizedFunction(r, true);

               if(x){
                   r.set("张三", "sex");
                   x = false;
               }else{
                   r.set("jack", "women");
                   x = true;
               }
//               r.flag = true;
//               r.notify();
//                SynchronizedBlock.synchronizedNotice(r, true);
//           }
       }
    }
}
class Output implements Runnable{
    private Res r;
    Output(Res r){
       this.r = r;
    }
    @Override
    public void run() {
        while(true){
              r.printFunction();
//            synchronized (r){
//                if(!r.flag){
//                    try {
//                        r.wait();
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(r.getName() +"----------"+r.getSex());
//                r.flag = false;
//                r.notify();
//
//
//            }
//            SynchronizedBlock.synchronizedFunction(r, true);
//            System.out.println(r.getName() +"----------"+r.getSex());
//            SynchronizedBlock.synchronizedNotice(r, false);

        }

    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        Res r = new Res();
//        Input in = new Input(r);
//        Output out = new Output(r);
//        Thread t1 = new Thread(in);
//        Thread t2 = new Thread(out);
//        t1.start();
//        t2.start();
        new Thread(new Input(r)).start();
        new Thread(new Input(r)).start();
    }
}
