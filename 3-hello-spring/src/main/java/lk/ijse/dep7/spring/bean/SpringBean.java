package lk.ijse.dep7.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("Am I created?");
    }
}
