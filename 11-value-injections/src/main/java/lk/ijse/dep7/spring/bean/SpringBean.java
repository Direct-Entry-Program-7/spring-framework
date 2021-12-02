package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringBean {

    @Value("ijse")
    private String name;
    @Value("10")
    private int age;
    @Value("true")
    private boolean marriedStatus;
    @Value("55.23")
    private double radius;

    public SpringBean() {
        System.out.println("SpringBean() Constructor");
        System.out.println(name);   // null
    }

    @PostConstruct
    public void init(){
        System.out.println(name);   // ijse
        System.out.println(age);
        System.out.println(marriedStatus);
        System.out.println(radius);
    }
}
