package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.CustomerDAO;
import lk.ijse.dep7.spring.bean.CustomerService;
import lk.ijse.dep7.spring.bean.FullBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan
@Configuration
public class AppConfig {

//    @Scope("prototype")
//    @Bean
//    public FullBean fullBean(){
//        System.out.println("fullBean()");
//        return new FullBean(myString());
//    }
//
//    @Bean
//    public String myString(){
//        System.out.println("myString()");
//        return "IJSE";
//    }

//    @Bean
//    public CustomerService customerService(){
//        return new CustomerService(customerDAO());
//    }
//
//    @Bean
//    public CustomerDAO customerDAO(){
//        return new CustomerDAO();
//    }
}
