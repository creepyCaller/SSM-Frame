# 分布式服务SSM框架
特性：多模块Maven工程 + Spring + SpringMVC + Mybatis + AspectJ + Druid + 分布式服务(基于Dubbo) + Jackson + Log4J + 控制器示例 + api示例 + 页面示例(基于Bootstrap)
## 试运行方法
0. 拉取仓库，作为Maven项目导入parent至IDEA/Eclipse
1. 准备Dubbo注册中心(3.4.6)，Tomcat容器(9.0.26)，括号内为调试时使用的版本
2. 导入fpd.sql至数据库，修改代码、XML配置、properties配置使其适应运行环境
3. 在IDEA/Eclipse执行maven install
4. 将parent/control/target下的war包命名为ROOT.war拷贝至tomcat/webapps，或者自定义命名
5. 运行ZooKeeper
6. 运行parent下的run-dubbo-provider.bat
7. 运行Tomcat
## 正确用法
0. 拉取仓库，作为Maven项目导入parent至IDEA/Eclipse
1. 删除示例代码及页面
2. 导入前端页面以及各种资源至parent\controller\src\main\webapp\WEB-INF
3. 使用&lt;mvc:resources&gt;标签设置WEB-INF下的资源映射
4. 编写数据库及后端
5. 试运行或部署至服务器参考试运行方法
## 将服务部署在其他服务器
0. 在服务器搭建数据库，导入fpd.sql，修改api模块的代码、XML配置、properties配置使其适应运行环境
1. 对api模块执行maven install
2. 拷贝生成的jar包和lib文件夹至其他服务器，必须保证它们在同一文件夹下
3. 使用java -jar 执行jar包
