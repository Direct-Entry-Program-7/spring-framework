package lk.ijse.dep7.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component("abc")
public class MyBean {

    public MyBean() {
        System.out.println("My Bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("My bean is being Destroyed");
    }
}
