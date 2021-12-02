package lk.ijse.dep7.beans.bean2;

import org.springframework.stereotype.Component;

@Component("springBean2")
public class SpringBean {

    public SpringBean() {
        System.out.println(SpringBean.class.getName());
    }
}
