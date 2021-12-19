package com.Beans;

/**
 * 注意，没有HunterInit在调用时，将无法实力化
 */
public class HunterInit {
    // 初始化时的应用名称
    private String hunterServerName;

    public void setHunterServerName(String hunterServerName) {
        this.hunterServerName = hunterServerName;
    }

    public String getHunterServerName() {
        return hunterServerName;
    }
}
