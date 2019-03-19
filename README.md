# springboot-freemarker
Springboot 集成 FreeMarker 做的一个 demo，并实现了中英文切换的国际化，[点击预览](http://gentie.jverson.com:8080/freemarker/index)

## FreeMarker
FreeMarker 是一款模板引擎，类似于之前常用的 JSP 及 Velocity 等，由于技术的发展，后两者已经慢慢被遗弃，Springboot 也是从 1.5 版本开始正式废弃 Velocity，取而代之首推的即 Apache 的 FreeMarker，此 demo 即初次参考手册使用 FreeMarker 搭建了一个后台页面，除了语法稍有不同外，与其它模板技术非常类似。

另外 FreeMarker 是 免费的， 基于Apache许可证2.0版本发布。

- [FreeMarker 官网](https://freemarker.apache.org/)
- [FreeMarker 中文手册](http://freemarker.foofun.cn/toc.html)

## 国际化
demo 同时还实现了中英文国际化，Springboot 应用中实现国际化非常简单，大概以下几个步骤：

1. 在 FreeMarker 的 ftl 模板的 head 标签中引入 `<#import "/spring.ftl" as spring>`    
其中 spring.ftl 文件位于 `org/springframework/spring-webmvc/5.0.6.RELEASE/spring-webmvc-5.0.6.RELEASE.jar!/org/springframework/web/servlet/view/freemarker/spring.ftl`

2. application.properties 中设置 spring.messages.basename=i18n/messages

3. resources 文件夹下创建 i18n 文件夹，分别创建 messages_en_US.properties， messages_zh_CN.properties， messages.properties（默认）

4. LocaleConf.java 配置国际化语言拦截器，设置默认语言

5. ftl 中使用 `<@spring.message "index.title"/>` 引入国际化文件中定义的词句

## 使用技巧

### 使用 messageArgs

注意定义arg时一定要使用数组
```HTML
<#assign total = [result.data.total]>
<#assign pages = [(result.data.total/result.data.pageSize)?ceiling]>
<span class="total"><@spring.messageArgs "index.page.total" total />, <@spring.messageArgs "index.page.num" pages /></span>
```
messages 定义
```
index.page.total=共 {0} 条记录
index.page.num={0} 页

index.page.total=共 {0} 条记录
index.page.num={0} 页
```
