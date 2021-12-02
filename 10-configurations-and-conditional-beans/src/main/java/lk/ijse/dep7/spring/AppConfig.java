package lk.ijse.dep7.spring;

import lk.ijse.dep7.beans.bean1.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackageClasses = Test.class)
@Configuration
public class AppConfig {

    @Bean
    public String myString(){
        return "IJSE";
    }

}
