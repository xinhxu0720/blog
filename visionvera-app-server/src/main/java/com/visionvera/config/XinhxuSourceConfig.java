package com.visionvera.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.visionvera.config.base.DataSourceBaseConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 业务数据源配置
 * @author dql
 *
 */
@Configuration
@MapperScan(basePackages = {"com.visionvera.dao.xinhxu"},sqlSessionFactoryRef = "xinhxuSqlSessionFactory")
public class XinhxuSourceConfig extends DataSourceBaseConfig{
	
	//** XML配置文件存放路径 
	private final String MAPPER_LOCATION = "classpath:com/visionvera/dao/xinhxu/*.xml";
	
	/** 别名包 */
	private final String TYPE_ALIASES_PACKAGE = "com.visionvera.bean";

	@Value("${xinhxuDB.datasource.url}")
	private String url;

	@Value("${xinhxuDB.datasource.username}")
	private String username;

	@Value("${xinhxuDB.datasource.password}")
	private String password;

	@Value("${xinhxuDB.datasource.driverClassName}")
	private String driverClassName;
	
	/**
	 * 配置Druid数据库连接池
	 * @return
	 */
	@Bean(name = "xinhxuDataSource")
	//@Primary//该Bean会被优先考虑。在多数据源的环境中必须且只加在其中一个配置里
	public DataSource getDruidDataSource() {
		DruidDataSource dataSource = new DruidDataSource();

		dataSource.setUrl(this.url);// 连接
		dataSource.setUsername(this.username);// 用户名
		dataSource.setPassword(this.password);// 密码
		dataSource.setDriverClassName(this.driverClassName);// 驱动

		// 配置初始化大小、最小、最大
		dataSource.setInitialSize(super.initialSize);
		dataSource.setMinIdle(super.minIdle);
		dataSource.setMaxActive(super.maxActive);

		// 配置获取连接等待超时的时间
		dataSource.setMaxWait(super.maxWait);

		// 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
		dataSource.setTimeBetweenEvictionRunsMillis(super.timeBetweenEvictionRunsMillis);
		// 配置一个连接在池中最小生存的时间，单位是毫秒
		dataSource.setMinEvictableIdleTimeMillis(super.minEvictableIdleTimeMillis);

		dataSource.setValidationQuery(super.validationQuery);
		dataSource.setTestWhileIdle(super.testWhileIdle);
		dataSource.setTestOnBorrow(super.testOnBorrow);
		dataSource.setTestOnReturn(super.testOnReturn);

		// 打开PSCache，并且指定每个连接上PSCache的大小
		dataSource.setPoolPreparedStatements(super.poolPreparedStatements);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(super.maxPoolPreparedStatementPerConnectionSize);

		// 配置监控统计拦截的filters
		try {
			dataSource.setFilters(super.filters);
		} catch (SQLException e) {
			// 不处理异常
		}
		return dataSource;
	}
	
	/**
	 * 配置事务
	 */
	@Bean(value = "transactionManager_xinhxu")
	//@Primary//该Bean会被优先考虑。在多数据源的环境中必须且只加在其中一个配置里
	public DataSourceTransactionManager getTransactionManager() {
		return new DataSourceTransactionManager(this.getDruidDataSource());
	}
	
	/**
	 * 配置SqlSessionFactory
	 * @return
	 * @throws Exception 
	 */
	@Bean(value = "xinhxuSqlSessionFactory")
	//@Primary//该Bean会被优先考虑。在多数据源的环境中必须且只加在其中一个配置里
	public SqlSessionFactory getSqlSessionFactory(@Qualifier("xinhxuDataSource") DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setVfs(SpringBootVFS.class);//设置MyBatis的SpringBoot资源解析器,若不设置,无法映射别名
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources(this.MAPPER_LOCATION));//配置XML路径
		sessionFactory.setTypeAliasesPackage(this.TYPE_ALIASES_PACKAGE);//配置别名包路径
		
		/**
		 * 根据PageHelper作者介绍，在引入了PageHelper的SpringBoot包以后，程序中无需做任何配置，直接使用其API即可
		 */
		/*PageInterceptor interceptor = new PageInterceptor();//MyBatis拦截器对象
		Properties properties = new Properties();
		properties.setProperty("helperDialect", "mysql");//数据库方言
		properties.setProperty("offsetAsPageNum", "true");//是否将参数offset作为PageNum使用
		properties.setProperty("supportMethodsArguments", "true");
		interceptor.setProperties(properties);
		sessionFactory.setPlugins(new Interceptor[]{interceptor});*/
		
		return sessionFactory.getObject();
	}
}
