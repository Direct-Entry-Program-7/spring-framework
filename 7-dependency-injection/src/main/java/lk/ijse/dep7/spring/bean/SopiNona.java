package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Usai
@Primary
@Qualifier("sudu")
@Component
public class SopiNona implements GoodGirl {

    void abc() {
        System.out.println("Ummmaaa.....!");
    }

    @Override
    public void kiss() {
        System.out.println("Sopi Nona: Ummmaaa.....!");
        System.out.println("Sopi Nona: Ummmaaa.....!");
        System.out.println("Sopi Nona: Ummmaaa.....!");
        System.out.println("Sopi Nona: Ummmaaa.....!");
        System.out.println("Sopi Nona: Ummmaaa.....!");
    }
}
