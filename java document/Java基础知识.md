### Java 基础知识 入门篇

#### 计算机组成

> 组件
>
> > 1.硬件
> >
> > > 硬件包括： 输入设备，输出设备，存储设备，cpu, 其他涉别
> > >
> > > 输入设备： 鼠标，键盘。
> > >
> > > 输出： 显示器，音响
> > >
> > > 存储设备： 硬盘，内存条，U盘
> > >
> > > CPU(中央处理器)： 运算器，控制器
> >
> > 2.软件
> >
> > > 软件包括： 系统软件、应用软件
> > >
> > > 系统软件：win7 Macos win8
> > >
> > > 应用软件： qq 微信等
> > >
> > > 应用软件？？？ 软件系统体系结构
> > >
> > > > C/S Client/Server. 客户端/服务器
> > > >
> > > > B/S Browser/Sever 浏览器/服务器
> > > >
> > > > * 12306
> > > >
> > > > ​	

<img src="/Users/apeng/Desktop/Screen Shot 2020-03-21 at 4.44.14 PM.png" alt="Screen Shot 2020-03-21 at 4.44.14 PM" style="zoom:50%;" />





### 存储单位

计算机中存储二进制信息，也就是0和1，日常生活中使用时十进制

8bit --------------> 1byte

1024byte -------> 1KB

1024kb --------->  1MB

1024MB ---------> 1GB

1024GB ---------> 1TB

![image-20200321165035994](/Users/apeng/Library/Application Support/typora-user-images/image-20200321165035994.png)



### Java语言发展史

在1995年诞生。先是SUN公司，后被oracle公司收购了。

James Gsoling领导团队开发一款语言。

JDK: java development kit 

#### Java语言包含三大块

* J2SE: 平台标准版 

  > Java2 standard Edition 
  >
  > 桌面程序开发
  >
  > >是整个Java技术的基础和核心

* J2EE：平台企业版

  > Java2 Enterprise Edition
  >
  > 开发网站

* J2ME: 平台微型版

  > Java2 micro Edition 
  >
  > 移动开发

 Attention: 在JDK5.0的时候改名为 JavaSE 、JavaEE 、JavaME



### Java语言特性

* 简单性

  舍弃了一些C++的功能例如 指针，多继承

* 面向对象

  面向对象编程语言

* 安全性

  运行时堆栈溢出，强制类型检查

* 健壮性

  Java语言在运行过程中产生的垃圾会自动回收，简称GC机制

* 可移植性

  Java程序编译一次，不做任何更改到处运行。跨平台运行



### java 的加载和执行



 ![image-20200321170641387](/Users/apeng/Library/Application Support/typora-user-images/image-20200321170641387.png)



1. 编译Java源文件
2. 编译 检查Java语法格式，生成字节码
3. 运行 运行的是字节码文件

#### JDK、JRE、JVM各自是什么

JDK： Java development kit  java 开发工具包

JRE：Java Runtime Environment  java运行环境

JVM： Java virtual machine java虚拟机