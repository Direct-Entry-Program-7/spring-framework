package lk.ijse.dep7.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean() Constructor");
    }

    @Bean
    public LiteBean liteBean(){
        return new LiteBean("ESOFT");
    }
}
