package com.hunterProccessors;

import com.Annos.HunterBeanAnnoVer1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Set;

@Component
public class HunterBeanRegisterProccessor implements BeanDefinitionRegistryPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(HunterBeanRegisterProccessor.class);

    /**
     *  Order(1)，
     *  postProcessBeanDefinitionRegistry（pPBDR 是 BeanDefinitionRegistryPostProcessor -> BDRPP 定义的方法）
     * @param beanDefinitionRegistry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        // 扫描有标注自定义注解的类
        String[] beanDefinitionNames = beanDefinitionRegistry.getBeanDefinitionNames();
        ClassPathBeanDefinitionScanner classPathScanningCandidateComponentProvider = new ClassPathBeanDefinitionScanner(beanDefinitionRegistry);
        classPathScanningCandidateComponentProvider.addIncludeFilter(new AnnotationTypeFilter(HunterBeanAnnoVer1.class));
        Set<BeanDefinition> beanSet = classPathScanningCandidateComponentProvider.findCandidateComponents("com");
        logger.info("beanSet Size:" + beanSet.size());
        for(BeanDefinition beanDefinition : beanSet) {
            String clazzName = beanDefinition.getBeanClassName();
            Field[] fields = clazzName.getClass().getDeclaredFields();
//            for(int i = 0;i < fields.length;i += 1) {
//                Field fieldParam = fields[i];
//                fieldParam.setAccessible(true);
//                HunterBeanAnnoVer1 vc = fieldParam.getAnnotation(HunterBeanAnnoVer1.class);
//                try {
//                    fieldParam.set(clazzName.getClass(), vc);
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }

    /**
     *  Order(2)
     *  postProcessBeanFactory（pPBF 是 BeanFactoryPostProcessor -> BFPP 定义的方法）
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
