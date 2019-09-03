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
    
    
    
    
    
    

整体演示
上面的代码写好后就可以演示下整体流程了

1.先启动好此项目，然后创建一个流程：

访问：http://localhost:1000/expense/add?userId=123&money=123321

返回：提交成功.流程Id为：2501

 

2.查询待办列表:

访问：http://localhost:1000/expense/list?userId=123

输出：Task[id=2507, name=出差报销]

 

3.同意：

访问：http://localhost:1000/expense/apply?taskId=2507

返回：processed ok!

 

4.生成流程图：

访问：http://localhost:1000/expense/processDiagram?processId=2501

    




1. Flowable数据库表命名规则
ACT_RE_*
’RE’表示repository（存储）。RepositoryService接口操作的表。带此前缀的表包含的是静态信息，如，流程定义，流程的资源（图片，规则等）。
ACT_RU_*
’RU’表示runtime。这是运行时的表存储着流程变量，用户任务，变量，职责（job）等运行时的数据。flowable只存储实例执行期间的运行时数据，当流程实例结束时，将删除这些记录。这就保证了这些运行时的表小且快。
ACT_ID_*
’ID’表示identity(组织机构)。这些表包含标识的信息，如用户，用户组，等等。
ACT_HI_*
’HI’表示history。就是这些表包含着历史的相关数据，如结束的流程实例，变量，任务，等等。
ACT_GE_*
普通数据，各种情况都使用的数据。
2. 数据库表结构(34张表)
表分类	表名	表说明
一般数据(2)	ACT_GE_BYTEARRAY	通用的流程定义和流程资源
ACT_GE_PROPERTY	系统相关属性
流程历史记录(8)	ACT_HI_ACTINST	历史的流程实例
ACT_HI_ATTACHMENT	历史的流程附件
ACT_HI_COMMENT	历史的说明性信息
ACT_HI_DETAIL	历史的流程运行中的细节信息
ACT_HI_IDENTITYLINK	历史的流程运行过程中用户关系
ACT_HI_PROCINST	历史的流程实例
ACT_HI_TASKINST	历史的任务实例
ACT_HI_VARINST	历史的流程运行中的变量信息
用户用户组表(9)	ACT_ID_BYTEARRAY	二进制数据表
ACT_ID_GROUP	用户组信息表
ACT_ID_INFO	用户信息详情表
ACT_ID_MEMBERSHIP	人与组关系表
ACT_ID_PRIV	权限表
ACT_ID_PRIV_MAPPING	用户或组权限关系表
ACT_ID_PROPERTY	属性表
ACT_ID_TOKEN	系统登录日志表
ACT_ID_USER	用户表
流程定义表(3)	ACT_RE_DEPLOYMENT	部署单元信息
ACT_RE_MODEL	模型信息
ACT_RE_PROCDEF	已部署的流程定义
运行实例表(10)	ACT_RU_DEADLETTER_JOB	正在运行的任务表
ACT_RU_EVENT_SUBSCR	运行时事件
ACT_RU_EXECUTION	运行时流程执行实例
ACT_RU_HISTORY_JOB	历史作业表
ACT_RU_IDENTITYLINK	运行时用户关系信息
ACT_RU_JOB	运行时作业表
ACT_RU_SUSPENDED_JOB	暂停作业表
ACT_RU_TASK	运行时任务表
ACT_RU_TIMER_JOB	定时作业表
ACT_RU_VARIABLE	运行时变量表
其他表(2)	ACT_EVT_LOG	事件日志表
ACT_PROCDEF_INFO	流程定义信息