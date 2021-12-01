package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("sudu")
@Component
public class Bisawa implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
        System.out.println("Bisawa: Ummmmmmmaaaa......!");
    }
}
