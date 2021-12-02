package lk.ijse.dep7.beans.bean4;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class SpringBean {

//    @Autowired
    private String name;

    public SpringBean(String name) {
        System.out.println(SpringBean.class.getName());
        System.out.println(name);
    }

//    @PostConstruct
//    public void init(){
//        System.out.println(name);
//    }

}
