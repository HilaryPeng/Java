package Collection;
import java.lang.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
按照字符串的长度实现 Treeset 排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet list = new TreeSet<>();
        list.add("aaa");
        list.add("abcd");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("z");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println((it.next()));
        }
    }
}

class StrLenComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        int number = new Integer(s1.length()).compareTo(new Integer(s2.length()));
        if(number ==0 ){
            return s1.compareTo(s2);
        }
        return number;
    };
}