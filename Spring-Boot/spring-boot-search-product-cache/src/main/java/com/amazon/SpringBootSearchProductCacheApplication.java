package com.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootSearchProductCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSearchProductCacheApplication.class, args);
	}

}
