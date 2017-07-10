/**
 * 
 */
package com.hebaobei.baby.common.utils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Mybatis自动生成类
 * 
 * @author yangguang
 *
 */
public class MybatisPlusGenerator {

	//生成文件的目录
	private static final String OUTPUT_DIR = "D:/project-base-source/src/main/java";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/project-base?characterEncoding=utf8";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	//要生成的表有哪些
	private static final String[] NEED_TABLES = new String[] { "user" };

	/**
	 * <p>
	 * MySQL 生成
	 * </p>
	 */
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir(OUTPUT_DIR);
		gc.setFileOverride(true);
		gc.setActiveRecord(true);
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList
		gc.setAuthor("yangguang");

		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setTypeConvert(new MySqlTypeConvert() {
			// 自定义数据库表字段类型转换【可选】
			public DbColumnType processTypeConvert(String fieldType) {
				// System.out.println("转换类型：" + fieldType);
				return super.processTypeConvert(fieldType);
			}
		});
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername(USERNAME);
		dsc.setPassword(PASSWORD);
		dsc.setUrl(URL);
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setTablePrefix(new String[] { "t_", "sys_" });// 此处可以修改为您的表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略_下划线转驼峰命名
		strategy.setInclude(NEED_TABLES); // 需要生成的表

		// strategy.setSuperControllerClass("com.hyper.core.util.BaseController");
		// //自定义 controller 父类
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.hebaobei.baby");
		pc.setController("controller");
		pc.setEntity("entity");
		pc.setMapper("mapper");
		pc.setXml("mapper");
		mpg.setPackageInfo(pc);

		// 执行生成
		mpg.execute();
	}
}
