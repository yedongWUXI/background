# 介绍
`基于SpringBoot+Shiro+Mybatis+Mybatis-Plus+HikariCP+Redis+Vue+iView等开发的轻量级管理系统快速开发脚手架，拥有角色、用户、资源管理、权限数据同步更新等功能
# 在线演示


# 技术选型
## 后端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Spring Boot | 容器 | 1.5.12.RELEASE | [http://start.spring.io/](http://start.spring.io/)
Mybatis-Starter | ORM框架 | 1.3.1 |  [http://www.mybatis.org](http://www.mybatis.org)
Mybatis-Plus | ORM框架 | 1.3.1 |  [http://mp.baomidou.com/](http://mp.baomidou.com/)
Maven | 项目构建管理 | 3.6 |  [http://maven.apache.org](http://maven.apache.org/)
Apache Shiro | 安全框架 | 1.3.2 |  [http://shiro.apache.org](http://www.mybatis.org/generator/index.html)
Lombok | 工具 | 1.16.20 |  [https://www.projectlombok.org/](https://www.projectlombok.org/)
HikariCP | 数据库连接池 | 2.7.8 |  [http://brettwooldridge.github.io/HikariCP/](http://brettwooldridge.github.io/HikariCP/)
Shiro-Redis | shiro缓存工具 | 2.8.24 | [https://github.com/alexxiyang/shiro-redis](https://github.com/alexxiyang/shiro-redis)
Springfox-Swagger2 | api文档工具 | 2.7.0 | [https://github.com/springfox/springfox](https://github.com/springfox/springfox)
jedis | redis管理 | 2.9.0 | [https://github.com/xetorthio/jedis](https://github.com/xetorthio/jedis)
jwt | 身份认证 | 3.2.0 | [https://jwt.io/](https://jwt.io/)
## 前端技术
技术 | 类型 | 版本 | 官网
----|------|----|----
Vue | 前端渐进式框架 | 2.5.13 | [https://cn.vuejs.org/](https://cn.vuejs.org/)
Vue-Router | 前端路由 | 3.0.1 | [https://router.vuejs.org/](https://router.vuejs.org/)
Vuex | 前端状态管理 | 3.0.1 | [https://vuex.vuejs.org/](https://vuex.vuejs.org/)
Axios | HTTP库 | 0.18.0 | [https://github.com/axios/axios](https://github.com/axios/axios)
iView | UI框架 | 2.8.0 | [https://www.iviewui.com/](https://www.iviewui.com/)
dayjs | JS时间操作库 | 1.5.14 | [https://github.com/xx45/dayjs](https://github.com/xx45/dayjs)
String-Format | 字符串格式化 | 1.0.0 | [https://github.com/davidchambers/string-format](https://github.com/davidchambers/string-format)
Vue-table-with-tree-grid | iview-树表格 | 0.2.4 | [https://github.com/MisterTaki/vue-table-with-tree-grid](https://github.com/MisterTaki/vue-table-with-tree-grid)
js-md5 | js-md5库 | 0.7.3 | [https://github.com/emn178/js-md5](https://github.com/emn178/js-md5)

# 使用方法
## 软件需求
    JDK1.8+
    MySQL5.6+
    Maven4.0+
- 修改数据库信息
```yml
# application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/background?useUnicode=yes&characterEncoding=UTF8
    password: root
    username: root
    driver-class-name: com.mysql.jdbc.Driver
```
- 启动
    
    运行`WatchDogApplication.java`，默认端口为1000
    
    
- 配置中心地址
http://139.224.14.200:1002/xxl-conf-admin/conf
    


    
