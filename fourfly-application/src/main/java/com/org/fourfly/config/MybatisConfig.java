package com.org.fourfly.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = { "com.org.fourfly.mapper" })
public class MybatisConfig {

//	@Bean
//	// @Profile({ "!druid" })
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource)
//			throws Exception {
//		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(dataSource);
//		return sessionFactory.getObject();
//	}

}
