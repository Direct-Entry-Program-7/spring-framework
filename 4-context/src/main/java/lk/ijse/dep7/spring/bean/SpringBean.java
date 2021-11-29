package lk.ijse.dep7.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {

    @Value("IJSE")
    private String value;

    public SpringBean() {
        System.out.println("1. Constructor");
        System.out.println("When instantiate: " + value);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3. Bean Name: " + s);
        System.out.println("After populate properties: " + value);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. Associated with a Bean Factory: " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. Associated with a Bean Factory: " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. Just before 'ready to use' state");
        System.out.println("Just before using: " + value);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("7. Just before destroying");
    }
}
