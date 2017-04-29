package com.project.isakatch.Config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.project.isakatch.Model"})
@EnableJpaRepositories(basePackages = {"com.project.isakatch.Persistence"})
@EnableTransactionManagement
public class RepositoryConfiguration {
    /** EMPTY ON PURPOSE **/
}