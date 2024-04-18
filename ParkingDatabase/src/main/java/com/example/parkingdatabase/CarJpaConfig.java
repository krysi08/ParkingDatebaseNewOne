package com.example.parkingdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@PropertySource("persistence-car.properties")
@EnableTransactionManagement
public class CarJpaConfig {


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("jdbc.driverClassName");
        dataSource.setUrl("jdbc.url");
        dataSource.setUsername("jdbc.user");
        dataSource.setPassword("jdbc.pass");


        return dataSource;
    }
}
