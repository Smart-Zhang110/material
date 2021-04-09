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
