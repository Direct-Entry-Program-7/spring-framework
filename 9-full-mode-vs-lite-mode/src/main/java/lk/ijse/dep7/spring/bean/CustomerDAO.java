package lk.ijse.dep7.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerDAO {

    public CustomerDAO() {
        System.out.println("CustomerDAO()" + this);
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialize()" + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy()" + this);
    }
}
