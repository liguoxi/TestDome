package com.testssh.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfiguration {

    @Bean(name="dataSource") // 定义Bean
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.c3p0")
    public DataSource getDataSource() {

        return new ComboPooledDataSource();
    }
}
