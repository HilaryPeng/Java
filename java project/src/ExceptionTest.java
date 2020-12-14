/**
 * 毕老师用电脑上课
 *
 * 对可能出现的问题进行描述
 * 名词迭代法？？
 */

public class ExceptionTest {
    public static void main(String[] args) throws SmokeException {
        Teacher a = new Teacher("Jack");
        try{
            a.teach();
        }catch(SmokeException e){

        }

    }
}

class ExpectError extends Exception{
    ExpectError(String message){
        super(message);
    }
}

class SmokeException extends Exception{
    SmokeException(String message){
        super(message);
    }
}

class Computer {
    private int state = 1;
    public void run() throws ExpectError,SmokeException {
        if(state == 2){
            throw new ExpectError("蓝屏");
        }else if(state == 3){
            throw new SmokeException("冒烟");
        }
        System.out.println("电脑运行");
    }
    public void reset(){
        System.out.println("电脑重启");
    }
}
class Teacher{
    private String name;
    private Computer computer;

    Teacher(String name){
        this.name = name;
        computer = new Computer();
    }
    public void teach() throws SmokeException {
        try {
            computer.run();
        }catch (ExpectError e){
            computer.reset();
        }catch(SmokeException e){
            //处理不了就抛出去
            throw e;
        }

        System.out.println("开始讲课");
    };
}