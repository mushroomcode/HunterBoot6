package com.hunterConfigs;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HunterConfiguration.class)
public class HunterConfiguration  {

}
