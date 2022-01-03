package com.hunterConfigs;

import com.Beans.HunterInit;
import com.Configs.ExcelResourceFinder;
import com.HunterProperties.HunterConfigProperties;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Confitional 当发现该类时：HunterInit
 */
@Configuration
@EnableConfigurationProperties({HunterConfigProperties.class})
@ConditionalOnClass({HunterInit.class})
@ComponentScan("com.Configs")
public class HunterConfiguration implements ApplicationContextAware {
//
    @Autowired
    private ExcelResourceFinder finder;

    // 初始化应用的名称
    @Bean
    @ConditionalOnProperty(prefix = "hunter.config", name="enable", havingValue = "true")
    public HunterInit configHunterServersInitInfo (HunterConfigProperties hunterConfigProperties) {
        HunterInit hunterInit = new HunterInit();
        String serverName = hunterConfigProperties.getHunterServerName();
        hunterInit.setHunterServerName(serverName);
        return hunterInit;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("========系统启动========");
        System.out.println("finder:" + finder.getReourceName());
//        try {
//            // 获取路径下的资源
//            Resource[] resources = applicationContext.getResources("class:*/*.json");
//            System.out.println("=====json文件的数量！======" + resources.length);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println();
    }
}
