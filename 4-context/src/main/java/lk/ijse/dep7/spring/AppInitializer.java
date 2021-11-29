package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {

//        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
//            System.out.println("Just before shutting down the JVM");
//        }));

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        SpringBean2 bean = ctx.getBean(SpringBean2.class);
        System.out.println("----------------");
        System.out.println(bean);
        System.out.println("----------------");

        System.out.println("Let's close the factory");
        //ctx.close();

        //SpringBean2 bean2 = ctx.getBean(SpringBean2.class);

        System.out.println("----------------");
        System.out.println(bean);
        bean.doSomething();
        System.out.println("----------------");
    }
}
