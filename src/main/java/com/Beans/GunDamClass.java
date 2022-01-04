package com.Beans;

import com.Annos.HunterBeanAnnoVer1;
import org.springframework.stereotype.Component;

@Component
public class GunDamClass {

    @HunterBeanAnnoVer1(param = "注解解析！")
    private String name;

    public String getName() {
        return name;
    }
}
