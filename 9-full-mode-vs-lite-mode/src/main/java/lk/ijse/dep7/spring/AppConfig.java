package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.FullBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public FullBean fullBean(String s){
        return new FullBean(s);
    }

    @Bean
    public String myString(){
        System.out.println("myString()");
        return "IJSE";
    }

}
