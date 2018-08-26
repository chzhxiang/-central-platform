package com.central.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer		//默认采用HTTP通信方式启动ZipkinServer
public class ZipkinCenterNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinCenterNativeApplication.class, args);
	}
}