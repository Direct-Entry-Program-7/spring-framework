package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private CustomerDAO customerDAO;

//    public CustomerService() {
//    }

    @Autowired(required = false)
    public CustomerService(CustomerDAO customerDAO, String s, Boolean b) {
        System.out.println("CustomerDAO, String Boolean");
        this.customerDAO = customerDAO;
        System.out.println(customerDAO);
        System.out.println(s);
    }

    @Autowired(required = false)
    public CustomerService(Boolean b, String s, Integer i) {
        System.out.println("CustomerDAO, String Integer");
        System.out.println(s);
    }

    public void saveCustomer() {
        System.out.println(customerDAO);
        customerDAO.save();
    }
}
