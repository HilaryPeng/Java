### Docker



Docker 是一个开源的应用容器引擎。

好处： Docker 可以让开发者打包他们的应用以及依赖包到一个轻量级，可移植的容器中，然后发布到任何的Linux机器上，也可以实现虚拟化。

容器是完全使用沙箱机制。相互之间不会有任何接口，容器性能消耗极地。

Ps：什么是沙箱机制 sandbox

Ps: 什么是沙盒/沙箱  sandbox 

![Screen Shot 2020-04-17 at 5.22.32 PM](/Users/apeng/Library/Application Support/typora-user-images/Screen Shot 2020-04-17 at 5.22.32 PM.png)

### 应用场景

1. web应用的自动化打包和发布。

2. 自动化测试和持续集成，发布

3. 在服务型环境中部署和调整数据库或其他的后台应用

4. 从头编译或者扩展现有的 OpenShift 或 Cloud Foundry 平台来搭建自己的 PaaS 环境。？

   

### docker command

* docker image ls 
* docker ps --all
* docker stop [name]
* docker  start [name]
* docker run --publish 8000:8080 --detach --name bb bullentinboard:1.0
* docker build --tag bullentinboard:1.0
* docker rm --force [name]
  * docker tag local-image:tagname new-repo:tagname
* docker push new-repo:tagname
* docker exec 
  * 在运行的容器中执行命令
* docker rmi [name]
* docker search nginx
* docker tag 
  * **docker tag :** 标记本地镜像，将其归入某一仓库.
* docker system df
  * 查看docker占用的磁盘情况
* docker system prune 
  * 清理没有使用的数据 包括镜像 和已经停止的容器
* <img src="/Users/apeng/Desktop/Screen Shot 2020-04-17 at 2.39.28 PM.png" alt="Screen Shot 2020-04-17 at 2.39.28 PM" style="zoom:50%;" />
* 

- **--build-arg=[] :**设置镜像创建时的变量；
- **--cpu-shares :**设置 cpu 使用权重；
- **--cpu-period :**限制 CPU CFS周期；
- **--cpu-quota :**限制 CPU CFS配额；
- **--cpuset-cpus :**指定使用的CPU id；
- **--cpuset-mems :**指定使用的内存 id；
- **--disable-content-trust :**忽略校验，默认开启；
- **-f :**指定要使用的Dockerfile路径；
- **--force-rm :**设置镜像过程中删除中间容器；
- **--isolation :**使用容器隔离技术；
- **--label=[] :**设置镜像使用的元数据；
- **-m :**设置内存最大值；
- **--memory-swap :**设置Swap的最大值为内存+swap，"-1"表示不限swap；
- **--no-cache :**创建镜像的过程不使用缓存；
- **--pull :**尝试去更新镜像的新版本；
- **--quiet, -q :**安静模式，成功后只输出镜像 ID；
- **--rm :**设置镜像成功后删除中间容器；
- **--shm-size :**设置/dev/shm的大小，默认值是64M；
- **--ulimit :**Ulimit配置。
- **--tag, -t:** 镜像的名字及标签，通常 name:tag 或者 name 格式；可以在一次构建中为一个镜像设置多个标签。
- **--network:** 默认 default。在构建期间设置RUN指令的网络模式





### docker-compose

* docker-compose up



### docker volume 

docker使用volume实现数据的持久化，不仅如此volume还能帮助容器和容器之间，容器和host之间共享数据。

在mac上用docker会在mac上启动一个虚拟机运行docker，因此volume创建的directory并不在你的machine上，而是在虚拟机中。

https://www.jianshu.com/p/8c22cdfc0ffd



![Screen Shot 2020-04-17 at 5.57.37 PM](/Users/apeng/Library/Application Support/typora-user-images/Screen Shot 2020-04-17 at 5.57.37 PM.png)