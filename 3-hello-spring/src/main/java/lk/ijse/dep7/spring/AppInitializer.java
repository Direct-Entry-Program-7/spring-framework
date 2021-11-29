package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        System.out.println(bean);
    }
}
