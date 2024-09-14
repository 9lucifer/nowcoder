package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {
	//启动了服务器+自动创建了容器
	//扫描的bean必须在同一个目录（或其子目录）中
	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
