# shop 
基于SpringCloud 实现的商城接口

使用到的技术
1. 服务注册、发现: eureka
2. lombok 插件 (IDEA要安装这个插件)
3. 配置中心 (阿波罗)
4. mybatis+druid 连接mysql 分页使用 pagehelper

## 模块规划

| 模块名称        | 端口   |  简介  |
|:----    |:--- |-----   |
| front-app        |    8088    |  外部调用接口服务|
| base-service       |     无   |  基础服务|
| eureka-service       |     无   |  注册中心|
| zuul-service       |     无   |  网关服务|
| common-module       |     无   |  公共模块|
| order-service       |     无   |  订单服务|
| sql       |     无   |  数据库sql|