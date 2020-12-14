public class OverLoad {
    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(add(4,5,6));
    }

    //return sum
    public static int add(int x, int y){
        return x + y;
    }

    public static int add(int x, int y, int z){
        return add(x,y)+ z;
    }
}
