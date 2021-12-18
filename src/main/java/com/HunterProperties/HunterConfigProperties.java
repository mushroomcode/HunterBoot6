package com.HunterProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hunter.config.hunterinfo")
public class HunterConfigProperties {
    private String hunterServerName;

    public void setHunterServerName(String hunterServerName) {
        this.hunterServerName = hunterServerName;
    }

    public String getHunterServerName() {
        return hunterServerName;
    }
}
