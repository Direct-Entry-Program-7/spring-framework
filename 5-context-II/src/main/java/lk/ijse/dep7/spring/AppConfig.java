package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean1;
import lk.ijse.dep7.spring.bean.SpringBean2;
import lk.ijse.dep7.spring.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig: Constructor()");
    }

//    @Bean({"bean ", "bean3"})
//    public SpringBean3 springBean3(){
//        System.out.println("Invoked springBean3() method");
//        return new SpringBean3();
//    }
//
//
//    @Bean({"bean3", "bean2"})
//    public SpringBean2 springBean2(){
//        System.out.println("Invoked springBean2() method");
//        return new SpringBean2();
//    }

    @Bean
    public SpringBean1 springBean01(){
        SpringBean1 bean = new SpringBean1();
        System.out.println("Invoked springBean01() method " + bean);
        return bean;
    }

    @Bean({"bean"})
    public SpringBean1 springBean1(){
        SpringBean1 bean = new SpringBean1();
        System.out.println("Invoked springBean1() method " + bean);
        return bean;
    }

    @Bean({"beanClone"})
    public SpringBean1 springBean1Clone(){
        SpringBean1 bean = new SpringBean1();
        System.out.println("Invoked springBean1Clone() method " + bean);
        return bean;
    }
}
