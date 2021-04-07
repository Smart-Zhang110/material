# material
Some learning materials

# 2021年4月6日13:30:25 踩坑记录
 - 1.springcloud feigin包引入问题
在主pom中定义子模块，在调用方引入

# 2021年4月7日09:19:29 踩坑记录
 - 1.nacos注册服务，在nacos服务列表中找不见
>  -https://blog.csdn.net/weixin_47007127/article/details/109572904 
```*必须引入spring-boot-starter-web包```*
 - 2.网关nacos出现dataId找不到<br/>
```*本地yml文件改为yaml application-name和profiles保持一致*```
```yaml
application:
    name: article-gateway
  profiles:
    active: dev
```

