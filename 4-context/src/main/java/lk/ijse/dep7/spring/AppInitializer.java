package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.MyBean;
import lk.ijse.dep7.spring.bean.SpringBean2;
import lk.ijse.dep7.spring.bean.TestBean2;
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

        System.out.println("=====================================");

        System.out.println("Is myBean inside? " + ctx.containsBeanDefinition("myBean"));
        System.out.println("Is abc inside? " + ctx.containsBeanDefinition( "abc"));
        System.out.println("Is springBean3 inside? " + ctx.containsBeanDefinition( "springBean3"));
        System.out.println(ctx.containsBeanDefinition("springBean"));
        System.out.println(ctx.containsBeanDefinition("springBean2"));
        System.out.println("Is testBean inside the context? " + ctx.containsBeanDefinition("testBean"));
        System.out.println("Is myTestBean inside the context? " + ctx.containsBeanDefinition("myTestBean"));
        System.out.println("Is abc inside the context? " + ctx.containsBeanDefinition("abc"));
        System.out.println("Is testBean2 inside the context? " + ctx.containsBeanDefinition("testBean2"));

        TestBean2 bean1 = ctx.getBean(TestBean2.class);
        System.out.println(bean1);
//
//        MyBean bean1 = ctx.getBean(MyBean.class);
//        System.out.println(bean1);
    }
}
