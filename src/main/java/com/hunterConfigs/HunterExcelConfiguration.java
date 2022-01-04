package com.hunterConfigs;

import com.Configs.ExcelResourceFinder;
import com.HunterProperties.HunterInitExcelConfigProperties;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ExcelResourceFinder.class)
@EnableConfigurationProperties(HunterInitExcelConfigProperties.class)
public class HunterExcelConfiguration {

    /** 返回路径
     * @param hunterInitExcelConfigProperties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "hunter.config", name = "enable", havingValue = "true")
    public ExcelResourceFinder ifDefineResource(HunterInitExcelConfigProperties hunterInitExcelConfigProperties) {
        // 自定义配置路径
        String resourceName = hunterInitExcelConfigProperties.getExcelJsonResource();
        ExcelResourceFinder excelResourceFinder = new ExcelResourceFinder();
        excelResourceFinder.setReourceName(resourceName);
        return excelResourceFinder;
    }

}
