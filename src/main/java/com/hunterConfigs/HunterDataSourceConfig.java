package com.hunterConfigs;

import com.HunterProperties.HunterDataConfigProperties;
//import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@ComponentScan("com")
//@EnableConfigurationProperties(HunterDataConfigProperties.class)
//@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class HunterDataSourceConfig {

//    @Autowired
//    private HunterDataConfigProperties properties;
//
//    public HunterDataConfigProperties getConnection() {
//        return this.properties;
//    }

}
