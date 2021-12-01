package lk.ijse.dep7.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public String myString(){
        return "IJSE";
    }

    @Bean
    public Integer myInt(){
        return 10;
    }

    @Bean
    public Boolean myBoolean(){
        return true;
    }
}
