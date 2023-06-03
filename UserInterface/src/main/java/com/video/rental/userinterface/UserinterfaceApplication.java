package com.video.rental.userinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.video.rental.")
public class UserinterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserinterfaceApplication.class, args);
	}

}
