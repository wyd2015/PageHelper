package com.ethan.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ethan.pagehelper.dao")
public class PageHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageHelperApplication.class, args);
	}
}
