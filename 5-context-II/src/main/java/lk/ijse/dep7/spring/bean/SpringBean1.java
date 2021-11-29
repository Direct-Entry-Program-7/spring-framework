package lk.ijse.dep7.spring.bean;

import org.springframework.stereotype.Component;

@Component("bean")
public class SpringBean1 {

    public SpringBean1() {
        System.out.println("Constructor: SpringBean1() " + this);
    }
}
