### 基本操作

```
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
```



#### 替换, 切割，子串,转换，去除空格，比较

* String replace(char oldChar, char newChar);
* String[] split(regex);
* String subString(begin);
* String subString(begin,end);
* 大小写： String toUpperCase(); String toLowerCase();
* 去两端的多个空格 String trim()
* 比较自然顺序 int compareTo(string)  ASIC码 从头开始比较 有区别就停下来了。





### Stringbuffer

是一个容器

特点：

	1. 长度是可以变化的
 	2. 可以字节操作多个数据类型。
 	3. 最终会通过toString()方法变成字符串。

* 存储
  * StringBuffer append(): 添加到尾部
  * StringBuffer insert(index,数据) 将数据插入到指定index位置 
* 删除
  * StringBuffer delete(start,end) 删除缓冲区中的数据，包含start 不包含end
  * StringBuffer deleteCharAt(index) 删除指定位置的字符。
* 修改
  * StringBuffer replace(start, end, string);
  * void setCharAt(int index, char ch)
* 获取
  * Char charAt(int index)
  * int indeOf(String str)
  * int lastIndexOf(String str)
  * int length()
  * String substring(int start, int end)
* 反转
  *  StringBuffer reverse()
* void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)



JDK1.5版本之后出现了 StringBuilder

StringBuffer是线程同步

StringBuilder 是线程不同步

以后开发建议使用StringBuilder 

升级的3个因素 提高效率 简化书写 提高