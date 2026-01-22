# mybatis-flex-xxl
使用mybatis-flex封装的demo项目。

## 已实现
- 框架分层分级
- 集成mybatis-flex，按照api编写规范封装基础的增删改查、导入导出和简单的统计接口
- 链路追踪
- 全局异常捕捉
- 日志优雅输出和高效保存
- 集成okHttp3，完成函数封装
- 增加springboot上下文工具类

## 待实现
- 审计日志
- api编写规范的基础查询、基础新增、基础更新的参数需实现junit校验
- 链路追踪适配分布式

## 技术栈
- JDK 17
- Spring Boot 3.4.4 
- Mybatis-Flex 1.10.9
- Mysql 5.7
- mysql-connector-j 8.3.0
- HikariCP 6.3.0
- OkHttp 4.12.0
- FastJson2 2.0.53
- EasyExcel 4.0.3
- Hutool 5.8.36
- Commons-Lang3 3.17.0
