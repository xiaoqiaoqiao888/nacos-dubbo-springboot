package com.rails.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.rails.provider.DubboNacosProvider;

@RestController
public class ConsumerController {
	@Reference
	private DubboNacosProvider dubboNacosProvider;
	@NacosValue(value = "${pxy.ip}", autoRefreshed = true)
	private String ip;
	@NacosValue(value = "${pxy.port}", autoRefreshed = true)
	private String port;

	@RequestMapping("sayHello")
	public String sayHello() {
		return dubboNacosProvider.sayHello(ip, port);
	}
}
