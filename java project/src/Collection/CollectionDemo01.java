package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
    统计指定元素出现的次数
    1. 创建集合即可
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        listTest(list, "a");
        listTest(list, "b");
        listTest(list, "c");
    }

    public static int listTest(ArrayList<String> list, String text) {
        int count = 0;
        Iterator array = list.iterator();
        System.out.println(array);
        while(array.hasNext()) {
            //next 要执行 不然就不会往下执行了。
            if( array.next() == text) {
                count = count + 1;
            }
//            System.out.println(array.next() + "_______" + text);
        }
        System.out.println(text + "_________" + ":" + count);
        return count;
    }

}

