package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.FullBean;
import lk.ijse.dep7.spring.bean.LiteBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        FullBean fullBean1 = ctx.getBean(FullBean.class);
        System.out.println(fullBean1);

        FullBean fullBean2 = ctx.getBean(FullBean.class);
        System.out.println(fullBean2);

//        LiteBean liteBean1 = ctx.getBean(LiteBean.class);
//        System.out.println(liteBean1);
//
//        LiteBean liteBean2 = ctx.getBean(LiteBean.class);
//        System.out.println(liteBean2);
    }
}
