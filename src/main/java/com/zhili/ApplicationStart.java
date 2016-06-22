package com.zhili;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ApplicationStart implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// City tmp = new City();
		// tmp.setState("CA");
		// System.out.println(this.cityMapper.select(tmp));

	}
}
