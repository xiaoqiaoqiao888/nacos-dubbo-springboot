package com.rails.service;

import org.apache.dubbo.config.annotation.Service;

import com.rails.provider.DubboNacosProvider;

@Service
public class DubboNacosServiceImpl implements DubboNacosProvider {
	public String sayHello(String ip, String port) {
		return ip + ":" + port;
	}
}
