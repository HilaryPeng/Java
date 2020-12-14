/**
 * 静态代码块的特点
 * 格式：
 * static {
 *
 * }
 * 特点: 随着类的加载而执行，只执行了一次。
 * 作用： 用于给类进行初始化。
 */
class StaticCodeBlock {
    static {
        System.out.println('a');
    }
}
