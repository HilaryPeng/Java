### 包（package）

* 对类文件进行分类管理
* 给类提供多层命名空间
* 写在程序文件第一行
* 类名的全称是 包名.类名
* 包也是一种封装形式。



总结：

包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。

不同包中的子类还可以直接访问父类中被protected权限修饰的成员。



包与包之间可以使用的权限有两种，public  protected

|            | public | Protected | Default | Private |
| ---------- | ------ | --------- | ------- | ------- |
| 同一个类中 | OK     | OK        | OK      | OK      |
| 同一个包中 | OK     | OK        | OK      |         |
| 子类       | OK     | OK        |         |         |
| 不同包中   | OK     |           |         |         |









<img src="/Users/apeng/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/c84498b502a2e2680350090021192151/Message/MessageTemp/7105cd50242f63bd80aed12fbcb6f9ea/Image/301586683193_.pic.jpg" alt="301586683193_.pic" style="zoom:25%;" /><img src="/Users/apeng/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/c84498b502a2e2680350090021192151/Message/MessageTemp/5dff00869cf148ca8f433a18f91e0073/Image/1621586683509_.pic.jpg" style="zoom:25%;" /><img src="/Users/apeng/Library/Containers/com.tencent.xinWeChat/Data/Library/Application Support/com.tencent.xinWeChat/2.0b4.0.9/c84498b502a2e2680350090021192151/Message/MessageTemp/7105cd50242f63bd80aed12fbcb6f9ea/Image/241586681105_.pic_hd.jpg" alt="241586681105_.pic_hd" style="zoom:25%;" />



