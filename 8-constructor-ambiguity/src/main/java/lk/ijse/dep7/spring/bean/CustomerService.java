package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public void saveCustomer(){
        customerDAO.save();
    }
}
