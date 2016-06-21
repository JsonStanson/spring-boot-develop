package com.zhili.police;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zhili.police.mapper.CityMapper;

@SpringBootApplication
public class ApplicationStart implements CommandLineRunner {

	@Autowired
	private CityMapper cityMapper;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(this.cityMapper.findByState("CA"));
	}
}
