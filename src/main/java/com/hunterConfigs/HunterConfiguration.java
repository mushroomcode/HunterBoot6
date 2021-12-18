package com.hunterConfigs;

import com.Beans.HunterInit;
import com.HunterProperties.HunterConfigProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HunterConfigProperties.class)
@ConditionalOnClass(HunterInit.class)
public class HunterConfiguration {

    // 初始化应用的名称
    @Bean
    @ConditionalOnProperty(prefix = "hunter.config", name="enable", havingValue = "true")
    public HunterInit configHunterServersInitInfo (HunterConfigProperties hunterConfigProperties) {
        HunterInit hunterInit = new HunterInit();
        String serverName = hunterConfigProperties.getHunterServerName();
        hunterInit.setHunterServerName(serverName);
        return hunterInit;
    }

}
