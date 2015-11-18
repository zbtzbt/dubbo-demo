package com.zbt.dubbo.provider;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.zbt.dubbo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * export 配置
 * @author Frank zhang
 */
@Configuration
@EnableAutoConfiguration
public class ExportServiceConfig extends DubboBaseConfig {

	@Value("${dubbo.port}")
	private Integer dubboPort;

	@Value("${dubbo.export.version}")
	private String dubboExportVersion;

	@Bean
	public ProtocolConfig protocol() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(dubboPort);
		return protocolConfig;
	}

	@Bean
	public ProviderConfig provider() {
		ProviderConfig providerConfig = new ProviderConfig();
		providerConfig.setAccepts(50);
		providerConfig.setThreads(100);
		return providerConfig;
	}


	/**
	 * dubbo user服务
	 *
	 * @param userService
	 * @return
	 */
	@Bean
	@Autowired
	public ServiceBean exportUserService(UserService userService) {
		ServiceBean serviceBean = new ServiceBean();
		serviceBean.setProxy("javassist");
		serviceBean.setVersion(dubboExportVersion);
		serviceBean.setInterface(UserService.class);
		serviceBean.setRef(userService);
		serviceBean.setTimeout(5000);//超时时间5秒，默认1秒
		serviceBean.setRetries(0);//重试次数，不写默认3
		return serviceBean;
	}





}
