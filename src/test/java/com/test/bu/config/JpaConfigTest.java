package com.test.bu.config;

import com.test.bu.config.JpaConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class JpaConfigTest extends JpaConfig {


    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = super.entityManagerFactoryBean();
        entityManagerFactoryBean.setJpaProperties(getParameters());
        return entityManagerFactoryBean;
    }

    private Properties getParameters() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        return properties;
    }

    @Override
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/testdb?userSll=false&createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
}