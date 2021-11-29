package lk.ijse.dep7.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("Am I created too?");
    }
}
