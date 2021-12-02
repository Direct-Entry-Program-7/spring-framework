package lk.ijse.dep7.beans.bean1;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(MyCondition.class)
@Component("springBean1")
public class SpringBean {

    public SpringBean() {
        System.out.println(SpringBean.class.getName());
    }
}
