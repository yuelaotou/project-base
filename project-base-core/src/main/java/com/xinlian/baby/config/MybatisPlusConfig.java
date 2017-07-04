/**
 * 
 */
package com.xinlian.baby.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.enums.DBType;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

/**
 * @author yangguang
 *
 */
@Configuration
public class MybatisPlusConfig {

	/**
	 * mybatis-plus分页插件<br>
	 * 文档：http://mp.baomidou.com<br>
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType(DBType.MYSQL.getDb());
		return page;
	}

	/**
	 * 逻辑删除配置，即删除时不直接删除记录，而是把yn置成0
	 * 
	 * @return
	 */
	@Bean
	public GlobalConfiguration globalConfiguration() {
		GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
		conf.setLogicDeleteValue("0");
		conf.setLogicNotDeleteValue("1");
		conf.setIdType(IdType.AUTO.getKey());
		return conf;
	}
}
