package thread;
import java.lang.Thread;
class ThreadDemoRun extends Thread{
    @Override
    public void run() {
//        super.run();
        for (int i = 0 ;i< 50; i++){
            System.out.println(i+"黄致鹏");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadDemoRun demo = new ThreadDemoRun();
        demo.start();
        for (int i = 0 ;i< 50; i++){
            System.out.println(i+"王茜茜");
        }
    }
}