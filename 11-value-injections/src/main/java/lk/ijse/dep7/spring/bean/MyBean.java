package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean {

    @Value("sovis,aruni,pethum")
    private String[] names;
    @Value("10,12,13")
    private int[] numbers;

    public MyBean(@Value("IJSE") String name) {
        System.out.println("MyBean() constructor");
        System.out.println(name);
    }

    @PostConstruct
    public void init(){
        System.out.println("-----------------");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("-----------------");
    }
}
