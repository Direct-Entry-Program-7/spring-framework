package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Some Basic SpEL Injections
 */
@Component
public class SpELBean1 {

    @Value("#{10}")
    public int spE2;
    @Value("#{true}")
    public boolean spE3;
    @Value("#{10e2}")
    public double spE4;
    @Value("#{'ijse'}")
    private String spE1;

    @PostConstruct
    public void init() {
        System.out.println(spE1);
        System.out.println(spE2);
        System.out.println(spE3);
        System.out.println(spE4);
    }
}
