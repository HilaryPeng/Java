package StringDemo;

/**
 * String 类适用于描述字符串事物。
 * 那么它就提供了多个方法对字符串进行操作。
 * 常见的操作有哪些？
 * "abcd"
 * 1.获取
 *  1.1 字符串中的包含的字符数，也就是字符串的长度。
 *   int length():获取长度。
 *  1.2
 *      char charAt(int index):获取某个位置上的字符
 *  1.3
 *      int indexOf(int ch): 返回字符串中第一次出现的位置
 *      int indexOf(int ch, int fromIndex): 从fromIndex指定位置开始，获取ch在字符串中出现的位置。
 *      int indexOf(String str): 返回的是str在字符串中第一次出现的位置。
 *      int indexOf(String str, int fromIndex): 从fromIndex指定位置开始，获取str在字符串中出现的位置。
 *      int lastIndexOf(int ch):
 *
 * 2. 判断：
 *  indexOf(str) //返回str第一次出现的位置 -1
 *  boolean isEmpty() //判断长度是否为0
 *  boolean startWith(str) 是否以什么开头
 *  boolean endsWith(str) 是否以什么结尾
 *
 * 3.转换
 *  将字符数组转为字符串
 *       构造方法:
 *       String(char[])
 *       String(char[],offset,count): 将字符数组中的一部分转为字符串。
 *       静态方法：
 *        static String copyValueOf(char[]);
 *        copyValueOf(char[] data, int offset, int count)
 *
 *  将基本数据类型转为字符串。
 *  String valueOf(int)
 *  String valueOf(double)
 *  3+""; //String valueOf(3);
 *
 *  将字符串转为字符数组：
 *      byte[] getBytes():
 *  将字节数组转为字符串
 *      String(byte[]);
 *      String(byte[],offset, count): 将字节数组中的一部分转为字符串。
 *
 *
 *
 *
 *
 */
public class BaseString {
}
