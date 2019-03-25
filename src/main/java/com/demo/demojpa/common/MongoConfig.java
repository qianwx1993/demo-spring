package com.demo.demojpa.common;

import com.demo.demojpa.base.mongo.BaseMongoRepositoryFactoryBean;
import com.demo.demojpa.base.mongo.SimpleBaseMongoRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/21 18:37
 */
@Configuration
@EnableMongoRepositories(repositoryBaseClass = SimpleBaseMongoRepository.class,basePackages = "com.demo.demojpa.repo.mongo",
	repositoryFactoryBeanClass =BaseMongoRepositoryFactoryBean.class)
public class MongoConfig {
}


