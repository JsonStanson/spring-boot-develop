http://smasue.github.io/spring-yml-datasources yml 编辑多个数据源
spring:
  profiles.active: development

---
spring:
  profiles: development
datasource:
  db-person:
      url: jdbc:oracle:thin:@db_person_dev
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual
  db-contract:
      url: jdbc:oracle:thin:@db_contract_dev
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual

---

spring:
  profiles: test
datasource:
  db-person:
      url: jdbc:oracle:thin:@db_person_test
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual
  db-contract:
      url: jdbc:oracle:thin:@db_contract_test
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual

---

spring:
  profiles: production
datasource:
  db-person:
      url: jdbc:oracle:thin:@db_person_prod
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual
  db-contract:
      url: jdbc:oracle:thin:@db_contract_prod
      username: username
      password: pwd
      driver-class-name: oracle.jdbc.OracleDriver
      test-on-borrow: true
      validation-query: SELECT 1 FROM dual

---


@SpringBootApplication
class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  @Primary
  @ConfigurationProperties(prefix="datasource.db-person")
  public DataSource personDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @ConfigurationProperties(prefix="datasource.db-contract")
  public DataSource contractDataSource() {
    return DataSourceBuilder.create().build();
  }
}

在yml 中使用详细配置。

http://blog.csdn.net/catoop/article/details/50575038

还是使用  http://blog.csdn.net/catoop/article/details/50575038 这个配置

spring 使用 https://spring.io/blog/2007/01/23/dynamic-datasource-routing/ 使用 AbstractRoutingDataSource 可能已经没这个类了

利用Spring的AbstractRoutingDataSource解决多数据源的问题 
		http://blog.csdn.net/alaahong/article/details/8707915

Aspect 的使用,简单介绍 http://luan.iteye.com/blog/1836246

 Spring Boot MyBatis 通用Mapper插件集成
http://blog.csdn.net/catoop/article/details/50684676,使用通用的 还能用@select 或者 xml 测试





