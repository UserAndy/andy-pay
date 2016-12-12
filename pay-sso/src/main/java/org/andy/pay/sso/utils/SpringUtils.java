package org.andy.pay.sso.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * description: 这是spring工具类,可以通过代码来获取spring context
 * @author: andy
 * Created by 2016/11/12 14:44
 */
@Component("springUtils")
public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    public SpringUtils() {
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext = applicationContext;
    }

    /**
     * 根据beanName 获取 spring bean
     * @param beanName
     * @return Object
     */
    public static  Object getBean(String beanName){
        if(beanName==null)return null;
        return 	applicationContext.getBean(beanName);
    }

    /**
     * 根据bean type 获取springBean
     * @param clazz
     * @return
     */
    public static Object getBeanByType(Class clazz){
        return applicationContext.getBean(clazz);
    }

    /**
     * 获取 Spring applicationContext
     * @return
     */
    public static ApplicationContext getContext() {
        return applicationContext;
    }
}
