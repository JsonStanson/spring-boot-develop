package com.zhili.config.mybatis;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
// TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisAutoConfiguration.class)

public class MyBatisMapperScannerConfig {

	static Logger log=LoggerFactory.getLogger(MyBatisMapperScannerConfig.class);
	
	@Bean
	@Profile("develop")
	public MapperScannerConfigurer mapperScannerConfigurer() {
		log.warn("develop  MapperScannerConfigurer ...");
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("com.zhili.**.mapper");
		Properties properties = new Properties();
		// 这里要特别注意，不要把MyMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
		properties.setProperty("mappers", MyMapper.class.getName());
		properties.setProperty("notEmpty", "false");

		properties.setProperty("IDENTITY", "ORACLE");
		mapperScannerConfigurer.setProperties(properties);
		return mapperScannerConfigurer;
	}

	@Bean
	@Profile("product")
	public MapperScannerConfigurer mapperScannerConfigurerDev() {
		log.warn("product  MapperScannerConfigurer ...");
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("com.zhili.**.mapper");
		Properties properties = new Properties();
		// 这里要特别注意，不要把MyMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
		properties.setProperty("mappers", MyMapper.class.getName());
		properties.setProperty("notEmpty", "false");

		properties.setProperty("IDENTITY", "ORACLE");
		mapperScannerConfigurer.setProperties(properties);
		return mapperScannerConfigurer;
	}
}
