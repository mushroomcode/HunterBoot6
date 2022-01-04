package com.Controller;

import com.Beans.GunDamClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatController {

    @Autowired
    private GunDamClass gunDamClass;

    @RequestMapping("/gundamName")
    @ResponseBody
    public String getName() {
        System.out.println(gunDamClass.getName());
        return gunDamClass.getName();
    }

}
