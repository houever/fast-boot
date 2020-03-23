# springboot 快速开发框架 fast-boot
## 一，打包部署

``mvn package -Dmaven.test.skip=true``

## 二，启动参数配置

Edit Configurations

VM options 填入一下内容来控制堆栈内存大小

````shell
-XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=512m -Xms1024m -Xmx1024m -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC
````

````
参数解释：
   
   -XX:MetaspaceSize=128m （元空间默认大小） 

   -XX:MaxMetaspaceSize=128m （元空间最大大小） 

   -Xms1024m （堆最大大小） 

   -Xmx1024m （堆默认大小） 

   -Xmn256m （新生代大小） 

   -Xss256k （棧最大深度大小） 

   -XX:SurvivorRatio=8 （新生代分区比例 8:2） 

   -XX:+UseConcMarkSweepGC （指定使用的垃圾收集器，这里使用CMS收集器） 

   -XX:+PrintGCDetails （打印详细的GC日志）
````

## 三，