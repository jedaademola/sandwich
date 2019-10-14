package wawa.hackerearth.sandwich.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseConfig.class);

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.driver.class}")
    private String dbDriverClassName;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Value("${spring.datasource.hikari.minimum-idle}")
    private int minimumIdle;

    @Value("${spring.datasource.hikari.maximum.pool.size-idle}")
    private int maximumPoolSize;

    @Bean
    public DataSource dataSource() throws SQLException {
        HikariConfig jdbcConfig = new HikariConfig();
        jdbcConfig.setDriverClassName(dbDriverClassName);
        jdbcConfig.setJdbcUrl(datasourceUrl);
        jdbcConfig.setUsername(dbUsername);
        jdbcConfig.setPassword(dbPassword);

        jdbcConfig.setMaximumPoolSize(maximumPoolSize);
        jdbcConfig.setMinimumIdle(minimumIdle);

        LOGGER.info("minimumIdle::::" + minimumIdle);
        HikariDataSource dataSource = new HikariDataSource(jdbcConfig);
        LOGGER.info("getActiveConnections::::" + dataSource.getHikariPoolMXBean().getActiveConnections());
        LOGGER.info("getIdleConnections::::" + dataSource.getHikariPoolMXBean().getIdleConnections());
        LOGGER.info("Minimum::::" + dataSource.getMinimumIdle());
        LOGGER.info("Max::::" + dataSource.getMaximumPoolSize());

        return dataSource;

    }
}
