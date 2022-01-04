package com.Configs;

import org.springframework.stereotype.Service;

@Service
public class ExcelResourceFinder {

    public String reourceName = "你好";

    public void setReourceName(String reourceName) {
        this.reourceName = reourceName;
    }

    public String getReourceName() {
        return reourceName;
    }

}
