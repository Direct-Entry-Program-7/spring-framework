package lk.ijse.dep7.spring;

import edu.lk.SpringBean3;
import edu.lk.Test;
import lk.ijse.dep7.spring.bean.SpringBean;
import lk.ijse.dep7.spring.bean.TestBean;
import lk.ijse.dep7.spring.bean.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = {"edu", "lk.ijse.dep7.spring"})
@ComponentScan(basePackageClasses = {Test.class, SpringBean.class})
@Configuration
public class AppConfig {

    @Bean(name = "abc")
    public TestBean2 testBean2(){
        System.out.println("Invoked?");
        return new TestBean2();
    }

    @Bean(name = "abc")
    public TestBean myTestBean(){
        System.out.println("Invoked?");
        return new TestBean();
    }



}
