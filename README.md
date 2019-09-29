# 分布式服务SSM框架
特性：多模块Maven工程 + Spring + SpringMVC + Mybatis + AspectJ + Druid + 分布式服务(基于Dubbo) + Jackson + Log4J + 控制器示例 + api示例 + 页面示例(基于Bootstrap)
## 试运行方法
0. 拉取仓库，作为Maven项目导入parent至IDEA/Eclipse
1. 准备Dubbo注册中心，Tomcat 9
2. 导入fpd.sql至数据库，修改代码使其适应实际环境
3. 在IDEA/Eclipse执行maven install
4. 将parent/control/target下的war包命名为ROOT.war拷贝至tomcat/webapps
5. 运行parent下的run-dubbo-provider.bat
6. 运行Tomcat
7. 使用浏览器访问Tomcat服务器
## 正确用法
0. 拉取仓库，作为Maven项目导入parent至IDEA/Eclipse
1. 删除示例代码及页面
2. 导入前端页面以及各种资源至parent\controller\src\main\webapp\WEB-INF
3. 使用&lt;mvc:resources&gt;标签设置WEB-INF下的资源映射
4. 编写数据库及后端
5. 试运行以及部署至服务器方法参考试运行方法
