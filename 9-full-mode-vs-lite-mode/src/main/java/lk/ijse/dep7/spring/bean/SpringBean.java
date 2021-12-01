package lk.ijse.dep7.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("SpringBean() Constructor");
    }

//    @Bean
//    public LiteBean liteBean(){
//        System.out.println("liteBean()");
//        return new LiteBean(myString());
//    }
//
//    @Bean
//    public String myString(){
//        System.out.println("myString()");
//        return "IJSE";
//    }

    @Scope("prototype")
    @Bean
    public CustomerService customerService(){
        return new CustomerService(customerDAO());
    }

    @Bean
    public CustomerDAO customerDAO(){
        return new CustomerDAO();
    }
}
