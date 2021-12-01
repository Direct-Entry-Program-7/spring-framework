package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

//        Object springBean = ctx.getBean("springBean");
//        System.out.println(springBean);

        System.out.println("-------------------------");

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        System.out.println(bean1);

        System.out.println("-----------------------");

        SpringBean bean2 = ctx.getBean(SpringBean.class);
        System.out.println(bean2);
//
//        System.out.println(bean1 == bean2);
    }
}
