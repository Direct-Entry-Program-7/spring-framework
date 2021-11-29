package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {
//implements InitializingBean, DisposableBean {

    public SpringBean2() {
        System.out.println("Spring Bean2: Constructor");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing Bean");
//    }

    @PostConstruct
    public void init(){
        System.out.println("Init()");
    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Disposable Bean");
//    }

    @PreDestroy
    public void destroy(){
        System.out.println("Just before destroying");
    }

    public void doSomething(){
        System.out.println("Let's do something");
    }
}
