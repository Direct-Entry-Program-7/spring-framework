package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.bean.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        CustomerService cs = ctx.getBean(CustomerService.class);
        System.out.println(cs);
//        cs.saveCustomer();
    }
}
