package lk.ijse.dep7.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println(ctx);
    }
}
