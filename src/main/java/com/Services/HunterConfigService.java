package com.Services;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 *  Demo 配置类测试
 */
@Service
@ConfigurationProperties("com.hunter.appstart")
public class HunterConfigService implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("========系统启动========");
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
