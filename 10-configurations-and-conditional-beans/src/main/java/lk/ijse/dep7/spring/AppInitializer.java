package lk.ijse.dep7.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RootConfig.class);
//        ctx.register(AppConfig.class);
//        ctx.register(AppConfig2.class);
        ctx.refresh();
    }
}
