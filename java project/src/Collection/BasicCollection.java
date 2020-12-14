package Collection;
import java.util.*;
class CollectionDemo{

};

/**
 *  add()
 *  addAll();
 *  clear() //clear all collection
 *  remove
 */
public class BasicCollection {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        // 添加元素
        al.add("java01");
        al.add("java02");
        // 获取个数
        sop(al.size());
        //删除
        al.remove("java01");
        sop(al);
        //判断元素
        sop(al.contains("java01"));
        sop(al.contains("java02"));
        sop(al.isEmpty());

        al.add("java02");
        al.add("java03");
//        al.retainAll(al2); //取交集
        Iterator it = al.iterator();
        while(it.hasNext()){
            sop(it.next());
        }

    }
    public static void sop(Object obj){
        System.out.println(obj);
    };
}
