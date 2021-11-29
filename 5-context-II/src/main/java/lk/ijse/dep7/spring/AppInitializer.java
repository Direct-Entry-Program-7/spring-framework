package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println("Is bean inside the context? " + ctx.containsBeanDefinition("bean"));
        System.out.println("Is springBean01 inside the context? " + ctx.containsBeanDefinition("springBean01"));
        System.out.println("Is springBean1 inside the context? " + ctx.containsBeanDefinition("springBean1"));
        System.out.println("Is beanClone inside the context? " + ctx.containsBeanDefinition("beanClone"));

//        System.out.println(ctx.getBean("bean"));
//        System.out.println(ctx.getBean("springBean01"));
//        System.out.println(ctx.getBean("beanClone"));
//        System.out.println(ctx.getBean(SpringBean1.class));
    }
}
