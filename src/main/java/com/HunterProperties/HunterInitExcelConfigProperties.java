package com.HunterProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HunterInitExcelConfigProperties 为属性类
 * 此注解用于被 Configuration 所调用
 */
@ConfigurationProperties(prefix = "hunter.excel.resource")
public class HunterInitExcelConfigProperties {

    private String excelJsonResource;

    public String getExcelJsonResource() {
        return excelJsonResource;
    }

    public void setExcelJsonResource(String excelJsonResource) {
        this.excelJsonResource = excelJsonResource;
    }
}
