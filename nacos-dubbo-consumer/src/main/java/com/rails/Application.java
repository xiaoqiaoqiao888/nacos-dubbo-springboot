package com.rails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

@SpringBootApplication
@NacosPropertySource(autoRefreshed = true, dataId = "proxy.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
