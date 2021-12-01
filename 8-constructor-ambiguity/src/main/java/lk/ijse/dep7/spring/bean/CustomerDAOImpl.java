package lk.ijse.dep7.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public void save() {
        System.out.println("Saved...!");
    }
}
