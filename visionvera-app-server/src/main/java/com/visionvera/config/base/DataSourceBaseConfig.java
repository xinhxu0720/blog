package com.visionvera.config.base;

import org.springframework.beans.factory.annotation.Value;

/**
 * 数据源基本的配置类
 *
 */
public class DataSourceBaseConfig {
	@Value("${datasource.druid.initial-size}")
	protected int initialSize;

	@Value("${datasource.druid.min-idle}")
	protected int minIdle;

	@Value("${datasource.druid.max-active}")
	protected int maxActive;

	@Value("${datasource.druid.max-wait}")
	protected int maxWait;

	@Value("${datasource.druid.time-between-eviction-runs-millis}")
	protected int timeBetweenEvictionRunsMillis;

	@Value("${datasource.druid.min-evictable-idle-time-millis}")
	protected int minEvictableIdleTimeMillis;

	@Value("${datasource.druid.validation-query}")
	protected String validationQuery;

	@Value("${datasource.druid.test-while-idle}")
	protected boolean testWhileIdle;

	@Value("${datasource.druid.test-on-borrow}")
	protected boolean testOnBorrow;

	@Value("${datasource.druid.test-on-return}")
	protected boolean testOnReturn;

	@Value("${datasource.druid.pool-prepared-statements}")
	protected boolean poolPreparedStatements;

	@Value("${datasource.druid.max-pool-prepared-statement-per-connection-size}")
	protected int maxPoolPreparedStatementPerConnectionSize;

	@Value("${datasource.druid.filters}")
	protected String filters;
}
