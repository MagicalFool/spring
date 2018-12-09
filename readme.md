#### springboot_v1 
###### v1_1.0 如何快速创建一个springboot项目
1. 创建一个maven项目
2. 添加springboot依赖
3. 创建springboot启动类
###### v1_1.1 使用springboot创建web项目
1. 添加web依赖
2. 创建controller
3. 打开浏览器访问http://localhost:8080/hello.do
###### v1_1.2 springboot配置使用yml文件
1. 在src/resources下创建application.yml文件
###### v1_1.3 获取springboot配置文件参数
1. 创建测试bean对象 dog person
2. 在application.yml中配置对象
3. 在bean对象上添加@ConfigurationProperties注解
4. 引入依赖spring-boot-configuration-processor
5. 创建controller测试结果
###### v1_1.4 springboot多环境切换
1. 创建其他环境配置文件application-{profile}.yml
2. 配置application.yml文件
