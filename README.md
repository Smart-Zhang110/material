# material
Some learning materials

# 2021年4月6日 踩坑记录
 - 1.springcloud feigin包引入问题
在主pom中定义子模块，在调用方引入

# 2021年4月7日 踩坑记录
 - 1.nacos注册服务，在nacos服务列表中找不见
>  -https://blog.csdn.net/weixin_47007127/article/details/109572904 <br/>
```*必须引入spring-boot-starter-web包```*
 - 2.网关nacos出现dataId找不到<br/>
```*本地yml文件改为yaml application-name和profiles保持一致*```
```yaml
application:
    name: article-gateway
  profiles:
    active: dev
```
 - 3.Load balancer does not have available server for client<br>
 ```*yml中添加如下所示```
 ```yaml
feign:
  hystrix:
    enabled: true
```
 - 4.Feign 出现
```shell script
java.lang.IllegalStateException: No fallbackFactory instance of type class
```
服务调用方扫描不到接口实现类，在服务调用方启动入口添加：
```shell script
@EnableFeignClients(basePackages = "com.million")
@SpringBootApplication(scanBasePackages = "com.million")
```
 - 5.Feigin调用超时<br/>
 ```*添加ribbon配置```*
 >  -https://cloud.tencent.com/developer/article/1648232<br/>
# 2021年4月8日 踩坑记录
 - 1.Feign PathVariable annotation was empty on param 0.
 >  -https://www.cnblogs.com/huhuixin/p/7797850.html<br/>

使用Feign的时候,如果参数中带有
@PathVariable形式的参数,则要用value=""标明对应的参数,否则会抛出IllegalStateException异常






面试
# 1.springcloud 五大组件
（1）.注册中心，服务的发现和注册
（2）.网管,负责请求路由转发和控制
（3）.ribbon负载均衡,默认采用轮训算法,还有权重、一致性hash来实现
（4）.Feign服务调用，可以实现熔断设置，调用远程服务
（5）.熔断器，处理服务雪崩现象，对线程进行线程隔离和对服务降级
# 2.mybatis的一级和二级缓存
  将从数据库查询出来的数据放入缓存中，下次使用时不必从数据库查询，而是直接从缓存中读取，避免频繁操作数据库，减轻数据库压力
，提高系统性能
（1）.一级缓存
一级缓存是sqlsession的缓存，
（2）.二级缓存
二级缓存是mapper级别的还存，作用于mapper文件的namespace
# 3.BIO和NIO的区别
BIO是同步阻塞式IO,一个连接一个线程（Java scoket中的accept为阻塞式IO）
NIO是一个请求一个线程
AIO 一个有效请求一个线程
NIO适合连接数多，连接时间短的场景
BIO适合连接数目小的场景
# 3.多线程有几种实现方式
（1）.继承Thread类
（2）.实现Runnable接口
（3）.通过Callable和FutureTask创建
（4）.通过线程池创建
# 4.mysql优化
（1）.选择最合适的字段属性
（2）.使用join代替子查询
（3）.为了维护数据的完整性，增加外键
（4）.使用索引
# 5.mysql索引有哪几种
（1）.普通索引，加速查询
（2）.唯一索引，加速查询，列值唯一
（3）.组合索引,多个列组成一个索引,专门用于组合搜索
（4）.全文索引，对全文的内容进行分词搜索
# 6.springbean 和单例模式的区别
     他们所关联的环境不一样，单例模式旨在一个JVM进程中只存在一个实例，
而spring单例实指再一个springbean容器中只有一个实例
# 7.springMVC的执行流程
MVC 即Model-view-controller 这样的方式分离
《1》DispatcherServlet 前端控制器，整个请求响应的控制中心，组件的调用由他统一调度
《2》HadnlerMapping 处理器映射器，根据用户的请求找到对应的Hadnler  然后处理后返回给中央处理器
《3》ViewResolver 视图解析器
（1）.用户发送请求只全段控制器dispatcherServlet
（2）.dispatcherServlet收到请求调用hadnlerMapping处理器
（3）.处理器找到具体的处理器返回给DispatcherServlet
（4）.dispatcherServlet调用HadnlerAdaoter处理器适配器
# 8.springcloud和dubbo的区别
springcloud 是apache的
dubbo是阿里的分布式服务治理框架
# 9.sql的隔离级别
（1）.未提交读 （脏读） ，数据未提交
（2）.提交读  数据库默认隔离级别 不可重复读
（3）.可重复读 （幻读） 两个事务通知对一个范围读的时候另一个事务进行了修改
（4）.可串行化 在数据读取的时候 进行加锁，保证数据的一致性
# 10.Redis支持的数据类型
（1）.String字符串
（2）.hash
（3）.列表
（4）.Set集合
（5）.zset 有序集合
redis的持久化
就是把redis的数据存到磁盘中去，防止服务器宕机丢失内存数据
redis的缓存穿透，一些恶意请求会故意查询不存在的key，就会对后端系统造成很大的压力（设置缓存时间，对不存在的key进行过滤）
缓存雪崩 当缓存服务器重启或者造成大量key失效，早知系统崩溃（通过加锁或者队列来控制数据库些缓存的线程数量）

