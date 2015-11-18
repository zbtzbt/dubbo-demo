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
## 环境说明
### 日常(Daily)环境（供QA集成测试使用）
#### 服务集群
