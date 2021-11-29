package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean1;
import org.springframework.context.annotation.*;

@ImportResource("classpath:beans.xml")
@Import(AppConfig2.class)
@ComponentScan
@Configuration
public class AppConfig {

    @Bean({"abc", "edf"})
    public Integer myMethod1() {
        System.out.println("My Method 1");
        return 10;
    }

    @Bean({"D", "edf"})
    public boolean myMethod2() {
        System.out.println("My Method 2");
        return true;
    }

    @Bean({"abc"})
    public String myMethod3() {
        System.out.println("My Method 3");
        return "ijse";
    }

}
