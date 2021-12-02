package lk.ijse.dep7.spring;

import lk.ijse.dep7.beans.bean2.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackageClasses = SpringBean.class)
@Configuration
public class AppConfig2 {
}
