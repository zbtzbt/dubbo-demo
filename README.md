# dubbo-demo
  Dubbo是阿里巴巴开源的的SOA服务化治理方案的核心框架，本项目为dubbo服务集成spring boot的简单demo。
  dubbo的github地址：https://github.com/alibaba/dubbo
# 配置指南
  开发环境：  
  1.Install the zookeeper registry  
  2.cd 到dubbo-provider/provider-api目录，执行：mvn package。因为dubbo-consumer中有对provider api的依赖  
  3.启动 provider 的server，直接run com.zbt.dubbo.provider.ProviderServer类。  
  4.启动 consumer 的server，直接run com.zbt.dubbo.consumer.DubboServer类。  
  5.浏览器访问localhost:8088/getAll,会有response数据返回。  
  
## 当前最新稳定版本  
	1.0.0-SNAPSHOT

# 环境部署指南
  linux or mac  
  1.由于项目中有对provider-api-1.0.0-SNAPSHOT的依赖，采取将本地provider-api-1.0.0-SNAPSHOT安装到本地mvn repository仓库。  
    先cd到 dubbo-demo/dubbo-provider/provider-api，  
    再执行：mvn package,生成provider-api-1.0.0-SNAPSHOT，  
    最后执行：mvn install:install-file -Dfile=target/provider-api-1.0.0-SNAPSHOT.jar -DgroupId=com.zbt.dubbo.provider -DartifactId=provider-api -Dversion=1.0.0-SNAPSHOT -Dpackaging=jar  
  2.cd 到 dubbo-demo/dubbo-provider目录下，执行：mvn clean install，在 target目录下生成dubbo-provider.zip，zip包为provider server服务包。  
  3.解压dubbo-provider.zip包，执行：unzip -d dubbo-provider dubbo-provider.zip  
  4.cd 到解压的dubbo-provider目录，执行：sh server.sh start,启动服务，启动成功会有类似'Starting ......PID=25617 Server start OK in 11 seconds.OK!'输出。  
  5.cd 到 dubbo-demo/dubbo-consumer目录下，执行：mvn clean install，在 target目录下生成dubbo-consumer.zip，zip包为consumer server服务包。  
  6.解压dubbo-consumer.zip包，执行：unzip -d dubbo-consumer dubbo-consumer.zip   
  7.cd 到解压的dubbo-consumer目录，执行：sh server.sh start,启动服务。  
## 环境说明
### 日常(Daily)环境（供QA集成测试使用）
#### 服务集群
