package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Qualifier("diga kondea")
@Component("magarita")
public class Magalin implements GoodGirl{

    @Override
    public void kiss() {
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
        System.out.println("Magalin: Ummma.............!");
    }
}
