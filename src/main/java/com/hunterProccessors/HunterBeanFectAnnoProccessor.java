package com.hunterProccessors;

import com.Annos.HunterBeanAnnoVer1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class HunterBeanFectAnnoProccessor implements BeanPostProcessor {

    private Logger logger = LoggerFactory.getLogger(HunterBeanFectAnnoProccessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for(int i = 0;i < fields.length;i += 1) {
            Field field = fields[i];
            field.setAccessible(true);
            HunterBeanAnnoVer1 ver1 = field.getAnnotation(HunterBeanAnnoVer1.class);
            if(ver1 == null) {
                continue;
            }
            String str = ver1.param();
            try {
                field.set(bean, str);
                logger.info("HunterBeanAnnoVer1赋值完成！");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }
}
