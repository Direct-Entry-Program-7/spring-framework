package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("abc")
public class SpringBean1 implements BeanNameAware {

    public SpringBean1() {
        System.out.println("Constructor()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }
}
