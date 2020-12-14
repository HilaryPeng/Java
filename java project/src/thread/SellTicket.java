package thread;

/**
 * 买票程序
 * 下面是两种实现多线程的办法。
 *
 */

//class Ticket extends Thread{
//    private static int ticketNumber = 100;
//    public void run(){
//        while(true){
//            if(ticketNumber > 0){
//                System.out.println(this.getName() +"*******" +"sale:" + ticketNumber--);
//
//            }
//        }
//    }
//}

class Ticket implements Runnable{
    private static int ticketNumber = 100;
    public void run(){
        while(true){
            if(ticketNumber > 0){
                System.out.println(Thread.currentThread().getName() + "sale:" + ticketNumber--);

            }
        }
    }
}
public class SellTicket {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }

}
