package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Primary
@Qualifier("sudu")
@Component
public class Bisawa implements GoodGirl {

    @Override
    public void kiss() {
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
    }
}
