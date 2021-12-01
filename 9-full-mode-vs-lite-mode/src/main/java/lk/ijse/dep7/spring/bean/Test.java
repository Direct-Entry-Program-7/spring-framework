package lk.ijse.dep7.spring.bean;

import org.springframework.context.annotation.Bean;

public class Test {

    @Bean
    public String myStringBean(){
        System.out.println("myStringBean()");
        return "IJSE+";
    }

}
