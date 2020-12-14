package thread;

/**
 *
 * notify  唤醒线池中下一个
 * notifyAll 唤醒全部
 */
class Resource{
    private String name;
    private int count = 1;
    private boolean flag = false;
    public synchronized void set(String name){
        while(this.flag){
            try{
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName()+"生产者"+ this.name);
        this.flag = true;
        this.notifyAll();
    }
    public synchronized void out(){
        while(!this.flag){
            try {
                this.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"消费者"+ this.name);
        flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable{
    private Resource res;
    Producer(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        while(true){
            res.set("商品");
        }
    }
}

class Consumer implements Runnable{
    private Resource res;
    Consumer(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        while(true){
            res.out();
        }
    }
}


public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        new Thread(new Producer(r)).start();
        new Thread(new Producer(r)).start();
        new Thread(new Consumer(r)).start();
        new Thread(new Consumer(r)).start();

    }
}
