import java.util.Date;

/**
 * 需求： 获取一段程序运行的时间。
 * 原理：获取程序开始时间 并相减即可
 *
 * 获取时间： System.currentTimeMillis();
 */
class GetTime{
    public void getTime(){
        long start = System.currentTimeMillis();
        for(int x=0;x<1000;x++){
            System.out.print(x);
        }
        long end = System.currentTimeMillis();
        System.out.println("时间差是    "+ (end-start));
    }
}
class TemplateDemo {
    public static void main(String[] args) {
       GetTime gt = new GetTime();
       gt.getTime();
    }

}
