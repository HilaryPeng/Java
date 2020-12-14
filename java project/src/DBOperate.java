/**
 * 数据库的操作
 * 1.连接数据库
 * 2. 操作数据库
 *      增删改查 add delete create search red  crud create read update delete
 * 3. 关闭连接。
 */

interface Operate{
     //interface Operate extends Object;
    void open();
    void close();
}
class UserInfoByHibernate implements Operate{
    public void open(){};
    public void close(){};
    public void add(){};
    public void delete(){};
}


class DBOperate {
    public static void main(String[] args) {


    }
}
