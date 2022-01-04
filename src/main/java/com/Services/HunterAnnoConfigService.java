package com.Services;

import com.Beans.HunterInit;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Service;

// 注解测试用的Service
@Service
public class HunterAnnoConfigService {

    private static Logger logger = LoggerFactory.getLogger(HunterAnnoConfigService.class);

    private HunterInit hunterInit;

    public HunterInit getHunterInit() {
        logger.debug(hunterInit.getHunterServerName());
        return hunterInit;
    }
}
