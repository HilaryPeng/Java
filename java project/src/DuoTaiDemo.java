
/**
 * 需求
 * 电脑运行实例
 * 电脑运行基于主板
 */
/** class MainBoard{
    public void run(){
        System.out.println("mainBoard run ");
    }
    public void useNetCard(NetCard c){
        c.open();
        c.close();
    }
}

class NetCard {
    public void open(){
        System.out.println("netCard open");
    }
    public void close(){
        System.out.println("netCard close");
    }
}

public class DuoTaiDemo {
    public static void main(String[] args){
    //毫无扩展性。
        MainBoard mb = new MainBoard();
        mb.run();
        mb.useNetCard(new NetCard());
    }
}
*/

interface PCI {
    public void open();
    public void close();
}
//主板
class MainBoard {
    public void run(){
        System.out.println("mainBoard run");
    }
    public void usePCI(PCI p){
        if(p  != null){
            p.open();
            p.close();
        }
    };
}
//我将声卡 网卡等类提取出共同的卡 都叫做卡片
class Card implements PCI{
    String t;
    Card(String t){
        this.t = t;
    }
    public void open(){
        System.out.println(t + "open");
    }
    public void close(){
        System.out.println(t + "close");
    }
}
//卡槽 网卡 声卡等
class NetCard extends Card{
    String t;
    NetCard(String t){
        super(t);
    }
}


class SoundCard extends Card{
    String t;
    SoundCard(String t){
        super(t);
    }
    void play(){
        System.out.println("我会播放");
    }
}

//class SoundCard implements PCI{
//    public void open(){
//        System.out.println("SoundCard open");
//    }
//    public void close(){
//        System.out.println("SoundCard close");
//    }
//}
//

class DuoTaiDemo{
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(new NetCard("card"));
        SoundCard x = new SoundCard("sound");
        mb.usePCI(x);
        x.play();

    }
}