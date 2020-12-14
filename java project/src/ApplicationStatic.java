/**
 * 静态的应用
 * 每一个类中都有一个共性的功能，可以将这些功能进行抽取，独立封装 所以就是静态的应用。
 *
 * @author apeng
 * @version v1.1
 * 构造函数私有化。 别人无法new 对象出来了。 这样别人使用我的类只能通过静态调用了
 */
 public class ApplicationStatic {
    public static void main(String[] args) {
        int arr[] = {3,4,1};
        getMax(arr);
    }

    public static void getMax(int[] arr){
        int max = 0;
        for (int x = 0; x< arr.length; x++){
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        System.out.println("max" + max);
    }
}
class ArrayTool{
    public int getMax(int[] arr){
        int max = 0;
        for (int x = 0; x< arr.length; x++){
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
    public int getMin(int[] arr){
        int min = 0;
        for (int x = 0; x< arr.length; x++){
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
    public void selectSort(int[] arr){

    }
}