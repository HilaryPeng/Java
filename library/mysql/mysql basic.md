### Basic

1. 启动mysql

   sudo /usr/local/MySQL/support-files/mysql.server start 

   mysql -u root -p  登陆mysql

2. 启动数据库 （如何查看所有的数据库并选择自己所需要的数据库进行连接）

   * show Databases
   * use (database name)
   * show tables 查看所有表的数据
   * Create database name 
   * Drop database name
   * Get all full table sites

3. 增删改查

   1. add
   2. delete
   3. Update

4. 使用py java node 等进行增删改查

5. 更深入的了解 配置 设计表 各种概念 大数据情况下的应用场景 cache 等

#### 设计原则

1. 一定要设计主键
2. 字段命名避开保留字
3. 表名尽可能短
4. 尽可能不使用 default null
5. 时间戳timestamp
6. 不要直接存储图片、音频、视频等大容量内容

