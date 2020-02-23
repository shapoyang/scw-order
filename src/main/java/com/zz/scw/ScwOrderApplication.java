package com.zz.scw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//启用eureka客户端
@EnableDiscoveryClient
//启用feign客户端来远程调用
@EnableFeignClients
//启用feign支持熔断保护Hystrix
@EnableHystrix
//启用熔断保护
@EnableCircuitBreaker
//扫描所有的mapper
@MapperScan(basePackages="com.zz.scw.order.mapper")
public class ScwOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScwOrderApplication.class, args);
	}

}
