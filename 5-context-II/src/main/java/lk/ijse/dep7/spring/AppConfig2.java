package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean({"abc", "edf"})
    public SpringBean1 myMethod1() {
        System.out.println("AppConfig2: My Method 1");
        return new SpringBean1();
    }

    @Bean({"D", "edf"})
    public String myMethod2() {
        System.out.println("AppConfig2: My Method 2");
        return "ijse";
    }
}
