package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return new Student("S010", "Gayal");
    }

}
